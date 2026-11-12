package com.mapbox.maps.plugin;

import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/plugin/MapAttributionDelegateImpl;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapDelegateProviderImpl$mapAttributionDelegate$2 extends w implements a<MapAttributionDelegateImpl> {
    final /* synthetic */ MapGeofencingConsent $mapGeofencingConsent;
    final /* synthetic */ MapTelemetry $telemetry;
    final /* synthetic */ MapDelegateProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapDelegateProviderImpl$mapAttributionDelegate$2(MapDelegateProviderImpl mapDelegateProviderImpl, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        super(0);
        this.this$0 = mapDelegateProviderImpl;
        this.$telemetry = mapTelemetry;
        this.$mapGeofencingConsent = mapGeofencingConsent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final MapAttributionDelegateImpl invoke() {
        return new MapAttributionDelegateImpl(this.this$0.getMapboxMap(), this.$telemetry, this.$mapGeofencingConsent);
    }
}
