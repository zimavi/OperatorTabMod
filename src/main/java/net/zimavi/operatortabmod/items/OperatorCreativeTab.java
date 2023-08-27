package net.zimavi.operatortabmod.items;

import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.OnlyIns;
import net.zimavi.operatortabmod.OperatorTabMod;

public class OperatorCreativeTab {
    public static final OperatorCreativeTabClass OPERATOR_TAB = new OperatorCreativeTabClass();

    public static void init() {
        OperatorTabMod.LOGGER.debug("Registering Operator Creative tab");
    }
}
