package com.mapbox.maps.extension.compose.ornaments.scalebar;

import android.content.Context;
import com.mapbox.maps.extension.compose.ornaments.scalebar.internal.ScaleBarComposePlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapScaleBarScope$ScaleBar$2$1 extends w implements l<Context, ScaleBarImpl> {
    final /* synthetic */ String $pluginId;
    final /* synthetic */ MapScaleBarScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapScaleBarScope$ScaleBar$2$1(MapScaleBarScope mapScaleBarScope, String str) {
        super(1);
        this.this$0 = mapScaleBarScope;
        this.$pluginId = str;
    }

    @Override // e23.l
    public final ScaleBarImpl invoke(Context context) {
        context.getClass();
        ScaleBarImpl scaleBarImpl = new ScaleBarImpl(context);
        this.this$0.mapView.createPlugin(new Plugin.Custom(this.$pluginId, new ScaleBarComposePlugin(scaleBarImpl)));
        return scaleBarImpl;
    }
}
