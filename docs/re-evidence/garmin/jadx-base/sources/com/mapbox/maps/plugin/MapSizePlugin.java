package com.mapbox.maps.plugin;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/MapSizePlugin;", "", "onSizeChanged", "", "width", "", "height", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapSizePlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onSizeChanged(MapSizePlugin mapSizePlugin, int i14, int i15) {
        }
    }

    void onSizeChanged(int width, int height);
}
