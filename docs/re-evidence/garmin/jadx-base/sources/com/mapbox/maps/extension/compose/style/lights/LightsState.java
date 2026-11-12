package com.mapbox.maps.extension.compose.style.lights;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.lights.generated.AmbientLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.DirectionalLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.FlatLightState;
import com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight;
import p005kotlin.Metadata;
import p13.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "mapboxLight", "<init>", "(Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;)V", "Lcom/mapbox/maps/extension/compose/style/lights/generated/DirectionalLightState;", "directionalLightState", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "ambientLightState", "(Lcom/mapbox/maps/extension/compose/style/lights/generated/DirectionalLightState;Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;)V", "Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;", "flatLightState", "(Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;)V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LightsState {
    public static final int $stable = 0;
    private final MapboxLight mapboxLight;
    public static final LightsState INITIAL = new LightsState(MapboxLight.NoOp.INSTANCE);
    public static final LightsState DEFAULT = new LightsState(MapboxLight.Default.INSTANCE);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightsState(DirectionalLightState directionalLightState, AmbientLightState ambientLightState) {
        this(new MapboxLight.DynamicLight(w.c(directionalLightState), ambientLightState));
        directionalLightState.getClass();
        ambientLightState.getClass();
    }

    public final void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(461760989);
        x1 x1Var = n.f135158a;
        this.mapboxLight.BindToMap$extension_compose_release(mapboxMap, o0VarE, 8);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new LightsState$BindToMap$1(this, mapboxMap, i14);
    }

    private LightsState(MapboxLight mapboxLight) {
        this.mapboxLight = mapboxLight;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightsState(FlatLightState flatLightState) {
        this(new MapboxLight.FlatLight(flatLightState));
        flatLightState.getClass();
    }
}
