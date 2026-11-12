package com.mapbox.maps.plugin.lifecycle;

import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"lifecycle", "Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getLifecycle", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "createLifecyclePlugin", "plugin-lifecycle_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LifecycleUtils {
    public static final /* synthetic */ MapboxLifecyclePlugin createLifecyclePlugin() {
        return new MapboxLifecyclePluginImpl();
    }

    public static final MapboxLifecyclePlugin getLifecycle(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_LIFECYCLE_PLUGIN_ID);
        plugin.getClass();
        return (MapboxLifecyclePlugin) plugin;
    }
}
