package com.mapbox.maps.plugin;

import com.mapbox.maps.MapController;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.a;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.delegates.MapListenerDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/mapbox/maps/plugin/MapDelegateProviderImpl;", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lcom/mapbox/maps/MapController;", "mapController", "Lcom/mapbox/maps/module/MapTelemetry;", "telemetry", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "mapGeofencingConsent", "<init>", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)V", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapboxStyleManager;", "", "callback", "getStyle", "(Le23/l;)V", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "getMapCameraManagerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "getMapProjectionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "getMapTransformDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapAttributionDelegate$delegate", "Lo13/l;", "getMapAttributionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapAttributionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "mapFeatureQueryDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "getMapFeatureQueryDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "mapPluginProviderDelegate", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getMapPluginProviderDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "mapListenerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "getMapListenerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "mapFeatureStateDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "getMapFeatureStateDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "mapStyleManagerDelegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getMapStyleManagerDelegate", "()Lcom/mapbox/maps/MapboxStyleManager;", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "mapInteractionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapDelegateProviderImpl implements MapDelegateProvider {

    /* JADX INFO: renamed from: mapAttributionDelegate$delegate, reason: from kotlin metadata */
    private final l mapAttributionDelegate;
    private final MapCameraManagerDelegate mapCameraManagerDelegate;
    private final MapFeatureQueryDelegate mapFeatureQueryDelegate;
    private final MapFeatureStateDelegate mapFeatureStateDelegate;
    private final MapInteractionDelegate mapInteractionDelegate;
    private final MapListenerDelegate mapListenerDelegate;
    private final MapPluginProviderDelegate mapPluginProviderDelegate;
    private final MapProjectionDelegate mapProjectionDelegate;
    private final MapboxStyleManager mapStyleManagerDelegate;
    private final MapTransformDelegate mapTransformDelegate;
    private final MapboxMap mapboxMap;

    public MapDelegateProviderImpl(MapboxMap mapboxMap, MapController mapController, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        mapboxMap.getClass();
        mapController.getClass();
        mapTelemetry.getClass();
        mapGeofencingConsent.getClass();
        this.mapboxMap = mapboxMap;
        this.mapCameraManagerDelegate = mapboxMap;
        this.mapProjectionDelegate = mapboxMap;
        this.mapTransformDelegate = mapboxMap;
        this.mapAttributionDelegate = m.b(new MapDelegateProviderImpl$mapAttributionDelegate$2(this, mapTelemetry, mapGeofencingConsent));
        this.mapFeatureQueryDelegate = mapboxMap;
        this.mapPluginProviderDelegate = mapController;
        this.mapListenerDelegate = mapboxMap;
        this.mapFeatureStateDelegate = mapboxMap;
        this.mapStyleManagerDelegate = mapboxMap;
        this.mapInteractionDelegate = mapboxMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStyle$lambda$0(e23.l lVar, Style style) {
        lVar.getClass();
        style.getClass();
        lVar.invoke(style);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapAttributionDelegate getMapAttributionDelegate() {
        return (MapAttributionDelegate) this.mapAttributionDelegate.getValue();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapCameraManagerDelegate getMapCameraManagerDelegate() {
        return this.mapCameraManagerDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapFeatureQueryDelegate getMapFeatureQueryDelegate() {
        return this.mapFeatureQueryDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapFeatureStateDelegate getMapFeatureStateDelegate() {
        return this.mapFeatureStateDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapInteractionDelegate getMapInteractionDelegate() {
        return this.mapInteractionDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapListenerDelegate getMapListenerDelegate() {
        return this.mapListenerDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapPluginProviderDelegate getMapPluginProviderDelegate() {
        return this.mapPluginProviderDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapProjectionDelegate getMapProjectionDelegate() {
        return this.mapProjectionDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapboxStyleManager getMapStyleManagerDelegate() {
        return this.mapStyleManagerDelegate;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public MapTransformDelegate getMapTransformDelegate() {
        return this.mapTransformDelegate;
    }

    public final MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapDelegateProvider
    public void getStyle(e23.l<? super MapboxStyleManager, Unit> callback) {
        callback.getClass();
        this.mapboxMap.getStyle(new a(callback, 2));
    }
}
