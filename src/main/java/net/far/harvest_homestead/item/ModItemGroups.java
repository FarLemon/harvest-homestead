package net.far.harvest_homestead.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.far.harvest_homestead.HarvestHomestead;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup FOOD_AND_DRINK;

    public static void registerItemGroups() {
        FOOD_AND_DRINK = FabricItemGroup.builder(new Identifier(HarvestHomestead.MOD_ID, "food_and_drink"))
            .displayName(Text.translatable("itemgroup.food_and_drink"))
            .icon(() -> new ItemStack(ModItems.TOMATO))
            .build();
    }
}
