package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.maps.extension.compose.ornaments.attribution.internal.AttributionComposePlugin;
import com.mapbox.maps.plugin.Plugin;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$8$1 extends w implements l<i0, h0> {
    final /* synthetic */ p1<Boolean> $geofencingUserConsentState$delegate;
    final /* synthetic */ String $pluginId;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$8$1(MapAttributionScope mapAttributionScope, String str, p1<Boolean> p1Var) {
        super(1);
        this.this$0 = mapAttributionScope;
        this.$pluginId = str;
        this.$geofencingUserConsentState$delegate = p1Var;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        this.this$0.mapView.createPlugin(new Plugin.Custom(this.$pluginId, new AttributionComposePlugin()));
        AttributionComposePlugin attributionComposePlugin = (AttributionComposePlugin) this.this$0.mapView.getPlugin(this.$pluginId);
        if (attributionComposePlugin != null) {
            MapAttributionScope.Attribution_hYmLsZ8$lambda$19(this.$geofencingUserConsentState$delegate, attributionComposePlugin.getMapAttributionDelegate$extension_compose_release().geofencingConsent().getUserConsent());
        }
        final MapAttributionScope mapAttributionScope = this.this$0;
        final String str = this.$pluginId;
        return new h0() { // from class: com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope$Attribution$8$1$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                mapAttributionScope.mapView.removePlugin(str);
            }
        };
    }
}
