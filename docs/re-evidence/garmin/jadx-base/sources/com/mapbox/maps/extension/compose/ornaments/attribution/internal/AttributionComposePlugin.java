package com.mapbox.maps.extension.compose.ornaments.attribution.internal;

import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/attribution/internal/AttributionComposePlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "()V", "mapAttributionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "getMapAttributionDelegate$extension_compose_release", "()Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "setMapAttributionDelegate$extension_compose_release", "(Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;)V", "onDelegateProvider", "", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionComposePlugin implements MapPlugin {
    public MapAttributionDelegate mapAttributionDelegate;

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        MapPlugin.DefaultImpls.cleanup(this);
    }

    public final MapAttributionDelegate getMapAttributionDelegate$extension_compose_release() {
        MapAttributionDelegate mapAttributionDelegate = this.mapAttributionDelegate;
        if (mapAttributionDelegate != null) {
            return mapAttributionDelegate;
        }
        s.m("mapAttributionDelegate");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        setMapAttributionDelegate$extension_compose_release(delegateProvider.getMapAttributionDelegate());
    }

    public final void setMapAttributionDelegate$extension_compose_release(MapAttributionDelegate mapAttributionDelegate) {
        mapAttributionDelegate.getClass();
        this.mapAttributionDelegate = mapAttributionDelegate;
    }
}
