package net.far.harvest_homestead.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.far.harvest_homestead.HarvestHomestead;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TOMATO = registerItem("tomato",
        new Item(new FabricItemSettings()));


    // helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HarvestHomestead.MOD_ID, name), item);
    }

    // add items to a group
    public static void addItemsToItemGroup() {
        addToItemGroup(HarvestHomesteadItemGroup.FOOD_AND_DRINK, TOMATO);
    }

    // helper method for adding items to an item group
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    // registers items
    public static void registerModItems() {
        HarvestHomestead.LOGGER.info("Registering Mod Items for " + HarvestHomestead.MOD_ID);

        addItemsToItemGroup();
    }
}