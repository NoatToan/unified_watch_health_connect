package com.mapbox.maps.plugin.overlay;

import android.view.View;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H&J\b\u0010\u0018\u001a\u00020\u0006H&J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayPlugin;", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "getEdgeInsets", "Lcom/mapbox/maps/EdgeInsets;", "reframe", "", "onReframeFinished", "Lcom/mapbox/maps/plugin/overlay/OnReframeFinished;", "registerMapOverlayCoordinatesProvider", "provider", "Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;", "registerOverlay", "overlay", "Landroid/view/View;", "registerOverlays", "overlays", "", "setDisplayingAreaMargins", "marginTop", "", "marginLeft", "marginBottom", "marginRight", "unregisterMapOverlayCoordinatesProvider", "unregisterOverlay", "unregisterOverlays", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapOverlayPlugin extends MapSizePlugin, MapPlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(MapOverlayPlugin mapOverlayPlugin) {
            MapPlugin.DefaultImpls.cleanup(mapOverlayPlugin);
        }

        public static void initialize(MapOverlayPlugin mapOverlayPlugin) {
            MapPlugin.DefaultImpls.initialize(mapOverlayPlugin);
        }

        public static void onDelegateProvider(MapOverlayPlugin mapOverlayPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(mapOverlayPlugin, mapDelegateProvider);
        }

        public static void onSizeChanged(MapOverlayPlugin mapOverlayPlugin, int i14, int i15) {
            MapSizePlugin.DefaultImpls.onSizeChanged(mapOverlayPlugin, i14, i15);
        }

        public static /* synthetic */ void reframe$default(MapOverlayPlugin mapOverlayPlugin, OnReframeFinished onReframeFinished, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: reframe");
                return;
            }
            if ((i14 & 1) != 0) {
                onReframeFinished = null;
            }
            mapOverlayPlugin.reframe(onReframeFinished);
        }
    }

    EdgeInsets getEdgeInsets();

    void reframe(OnReframeFinished onReframeFinished);

    void registerMapOverlayCoordinatesProvider(MapOverlayCoordinatesProvider provider);

    void registerOverlay(View overlay);

    void registerOverlays(List<? extends View> overlays);

    void setDisplayingAreaMargins(int marginTop, int marginLeft, int marginBottom, int marginRight);

    void unregisterMapOverlayCoordinatesProvider();

    void unregisterOverlay(View overlay);

    void unregisterOverlays(List<? extends View> overlays);
}
