package com.mapbox.maps.plugin.logo;

import android.view.View;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsInterface;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LogoPlugin extends ViewPlugin, LogoSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(LogoPlugin logoPlugin) {
            ViewPlugin.DefaultImpls.cleanup(logoPlugin);
        }

        public static void initialize(LogoPlugin logoPlugin) {
            ViewPlugin.DefaultImpls.initialize(logoPlugin);
        }

        public static void onDelegateProvider(LogoPlugin logoPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(logoPlugin, mapDelegateProvider);
        }

        public static void onPluginView(LogoPlugin logoPlugin, View view2) {
            view2.getClass();
            ViewPlugin.DefaultImpls.onPluginView(logoPlugin, view2);
        }
    }
}
