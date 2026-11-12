package com.mapbox.maps.plugin.overlay;

import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"mapboxOverlay", "Lcom/mapbox/maps/plugin/overlay/MapOverlayPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getOverlay", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/overlay/MapOverlayPlugin;", "createOverlayPlugin", "plugin-overlay_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapOverlayUtils {
    public static final /* synthetic */ MapOverlayPlugin createOverlayPlugin() {
        return new MapOverlayPluginImpl();
    }

    public static final MapOverlayPlugin getOverlay(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_MAP_OVERLAY_PLUGIN_ID);
        plugin.getClass();
        return (MapOverlayPlugin) plugin;
    }
}
