package net.zimavi.operatortabmod.operatortabmod.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zimavi.operatortabmod.operatortabmod.OperatorTabMod;


public class OperatorItemGroup {
    public static final ItemGroup OPERATOR_TAB = FabricItemGroupBuilder.create(new Identifier(OperatorTabMod.MOD_ID, "operator_tab"))
            .icon(() -> Items.COMMAND_BLOCK.getDefaultStack())
            .appendItems(stacks -> {
                stacks.add(Items.COMMAND_BLOCK.getDefaultStack());
                stacks.add(Items.CHAIN_COMMAND_BLOCK.getDefaultStack());
                stacks.add(Items.REPEATING_COMMAND_BLOCK.getDefaultStack());
                stacks.add(Items.COMMAND_BLOCK_MINECART.getDefaultStack());
                stacks.add(Items.JIGSAW.getDefaultStack());
                stacks.add(Items.STRUCTURE_BLOCK.getDefaultStack());
                stacks.add(Items.STRUCTURE_VOID.getDefaultStack());
                stacks.add(Items.BARRIER.getDefaultStack());
                stacks.add(Items.DEBUG_STICK.getDefaultStack());


                NbtCompound blockStateTag;

                ItemStack lightBlockWithNbt;

                for(int i = 15; i > -1; i--) {
                    blockStateTag = new NbtCompound();
                    blockStateTag.putInt("level", i);

                    lightBlockWithNbt = Items.LIGHT.getDefaultStack();
                    lightBlockWithNbt.setSubNbt("BlockStateTag", blockStateTag);
                    stacks.add(lightBlockWithNbt);
                }
            })
            .build();
    public static void register() {
        OperatorTabMod.LOGGER.info("Registered Item Groups");
    }
}
