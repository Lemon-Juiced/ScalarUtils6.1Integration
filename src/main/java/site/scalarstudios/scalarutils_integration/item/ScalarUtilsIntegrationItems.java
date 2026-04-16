package site.scalarstudios.scalarutils_integration.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.scalarstudios.scalarutils.ScalarUtils;

public class ScalarUtilsIntegrationItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ScalarUtils.MODID);

    public static final DeferredItem<Item> PELAGIUM_CHUNK = ITEMS.registerSimpleItem("pelagium_chunk");
    public static final DeferredItem<Item> VERDITE_CHUNK = ITEMS.registerSimpleItem("verdite_chunk");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
