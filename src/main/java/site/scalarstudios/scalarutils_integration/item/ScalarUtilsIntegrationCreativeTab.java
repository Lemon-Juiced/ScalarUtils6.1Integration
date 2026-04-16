package site.scalarstudios.scalarutils_integration.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.scalarstudios.scalarutils.ScalarUtils;

import static site.scalarstudios.scalarutils.item.ScalarUtilsCreativeTabs.SCALARUTILS_ITEMS_TAB;

public class ScalarUtilsIntegrationCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtils.MODID);

    public static void registerTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == SCALARUTILS_ITEMS_TAB.get()) {
            event.accept(ScalarUtilsIntegrationItems.PELAGIUM_CHUNK.get());
            event.accept(ScalarUtilsIntegrationItems.VERDITE_CHUNK.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
