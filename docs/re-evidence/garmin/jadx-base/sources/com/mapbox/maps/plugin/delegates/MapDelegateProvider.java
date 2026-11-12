package com.mapbox.maps.plugin.delegates;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8&X§\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapboxStyleManager;", "", "callback", "getStyle", "(Le23/l;)V", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "getMapCameraManagerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "getMapProjectionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "getMapTransformDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "getMapAttributionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapAttributionDelegate", "getMapStyleManagerDelegate", "()Lcom/mapbox/maps/MapboxStyleManager;", "mapStyleManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getMapPluginProviderDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "mapPluginProviderDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "getMapFeatureQueryDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "mapFeatureQueryDelegate", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "getMapListenerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "mapListenerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "getMapFeatureStateDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "mapFeatureStateDelegate", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate$annotations", "()V", "mapInteractionDelegate", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapDelegateProvider {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @MapboxExperimental
        public static /* synthetic */ void getMapInteractionDelegate$annotations() {
        }
    }

    MapAttributionDelegate getMapAttributionDelegate();

    MapCameraManagerDelegate getMapCameraManagerDelegate();

    MapFeatureQueryDelegate getMapFeatureQueryDelegate();

    MapFeatureStateDelegate getMapFeatureStateDelegate();

    MapInteractionDelegate getMapInteractionDelegate();

    MapListenerDelegate getMapListenerDelegate();

    MapPluginProviderDelegate getMapPluginProviderDelegate();

    MapProjectionDelegate getMapProjectionDelegate();

    MapboxStyleManager getMapStyleManagerDelegate();

    MapTransformDelegate getMapTransformDelegate();

    void getStyle(l<? super MapboxStyleManager, Unit> callback);
}
