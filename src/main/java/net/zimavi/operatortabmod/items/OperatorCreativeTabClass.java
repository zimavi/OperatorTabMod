package net.zimavi.operatortabmod.items;

import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class OperatorCreativeTabClass extends CreativeModeTab {

    public OperatorCreativeTabClass() {
        super("operator_tab");
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> list) {
        super.fillItemList(list);

        list.add(Items.COMMAND_BLOCK.getDefaultInstance());
        list.add(Items.CHAIN_COMMAND_BLOCK.getDefaultInstance());
        list.add(Items.REPEATING_COMMAND_BLOCK.getDefaultInstance());
        list.add(Items.COMMAND_BLOCK_MINECART.getDefaultInstance());
        list.add(Items.JIGSAW.getDefaultInstance());
        list.add(Items.STRUCTURE_BLOCK.getDefaultInstance());
        list.add(Items.STRUCTURE_VOID.getDefaultInstance());
        list.add(Items.BARRIER.getDefaultInstance());
        list.add(Items.DEBUG_STICK.getDefaultInstance());

        CompoundTag blockStateTag;
        ItemStack lightBlockWithNbt;

        for(int i = 15; i > -1; i--) {
            blockStateTag = new CompoundTag();
            blockStateTag.putInt("level", i);

            lightBlockWithNbt = Items.LIGHT.getDefaultInstance();
            lightBlockWithNbt.addTagElement("BlockStateTag", blockStateTag);

            list.add(lightBlockWithNbt);
        }
    }

    @Override
    public ItemStack makeIcon() {
        return Items.COMMAND_BLOCK.getDefaultInstance();
    }

    @Override
    public ItemStack getIconItem() {
        return Items.COMMAND_BLOCK.getDefaultInstance();
    }
}
