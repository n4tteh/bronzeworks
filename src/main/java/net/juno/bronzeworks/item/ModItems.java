package net.juno.bronzeworks.item;

import net.juno.bronzeworks.Bronzeworks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bronzeworks.MOD_ID);

    public static final DeferredItem<Item> BRONZE = ITEMS.register("bronze",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
