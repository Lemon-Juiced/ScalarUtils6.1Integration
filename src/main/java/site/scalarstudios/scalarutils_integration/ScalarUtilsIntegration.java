package site.scalarstudios.scalarutils_integration;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import site.scalarstudios.scalarutils_integration.item.ScalarUtilsIntegrationCreativeTab;
import site.scalarstudios.scalarutils_integration.item.ScalarUtilsIntegrationItems;

@Mod(ScalarUtilsIntegration.MODID)
public class ScalarUtilsIntegration {
    public static final String MODID = "scalarutils_integration";

    public ScalarUtilsIntegration(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        // Register Items and Blocks
        ScalarUtilsIntegrationItems.register(modEventBus);

        // Register Creative Tabs
        ScalarUtilsIntegrationCreativeTab.register(modEventBus);
        modEventBus.addListener(ScalarUtilsIntegrationCreativeTab::registerTab);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
