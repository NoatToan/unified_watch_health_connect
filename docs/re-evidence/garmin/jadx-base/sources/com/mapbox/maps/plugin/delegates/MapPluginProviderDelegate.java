package com.mapbox.maps.plugin.delegates;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.MapPlugin;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "", "getPlugin", "T", "Lcom/mapbox/maps/plugin/MapPlugin;", TtmlNode.ATTR_ID, "", "(Ljava/lang/String;)Lcom/mapbox/maps/plugin/MapPlugin;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapPluginProviderDelegate {
    <T extends MapPlugin> T getPlugin(String id3);
}
