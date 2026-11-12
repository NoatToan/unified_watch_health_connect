package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.lights.generated.AmbientLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.DirectionalLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.FlatLightState;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H!¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "Companion", "Default", "DynamicLight", "FlatLight", "NoOp", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$Default;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$DynamicLight;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$FlatLight;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$NoOp;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class MapboxLight {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapboxLight";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0011¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$Default;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Default extends MapboxLight {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }

        @Override // com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight
        public void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
            mapboxMap.getClass();
            o0 o0VarE = mVar.E(-1136257483);
            x1 x1Var = n.f135158a;
            l0.e(new MapboxLight$Default$BindToMap$1(mapboxMap, null), mapboxMap, o0VarE);
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new MapboxLight$Default$BindToMap$2(this, mapboxMap, i14);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0011¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$DynamicLight;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "", "Lcom/mapbox/maps/extension/compose/style/lights/generated/DirectionalLightState;", "directionalLightState", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "ambientLightState", "<init>", "(Ljava/util/List;Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;)V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "Ljava/util/List;", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DynamicLight extends MapboxLight {
        private final AmbientLightState ambientLightState;
        private final List<DirectionalLightState> directionalLightState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicLight(List<DirectionalLightState> list, AmbientLightState ambientLightState) {
            super(null);
            list.getClass();
            ambientLightState.getClass();
            this.directionalLightState = list;
            this.ambientLightState = ambientLightState;
        }

        @Override // com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight
        public void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
            mapboxMap.getClass();
            o0 o0VarE = mVar.E(-1486264017);
            x1 x1Var = n.f135158a;
            l0.e(new MapboxLight$DynamicLight$BindToMap$1(this, mapboxMap, null), mapboxMap, o0VarE);
            o0VarE.L(-72718210);
            Iterator<T> it = this.directionalLightState.iterator();
            while (it.hasNext()) {
                ((DirectionalLightState) it.next()).UpdateProperties$extension_compose_release(mapboxMap, o0VarE, 8);
            }
            o0VarE.g0(false);
            this.ambientLightState.UpdateProperties$extension_compose_release(mapboxMap, o0VarE, 8);
            x1 x1Var2 = n.f135158a;
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new MapboxLight$DynamicLight$BindToMap$3(this, mapboxMap, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0011¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$FlatLight;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;", "flatLightState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;)V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FlatLight extends MapboxLight {
        private final FlatLightState flatLightState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlatLight(FlatLightState flatLightState) {
            super(null);
            flatLightState.getClass();
            this.flatLightState = flatLightState;
        }

        @Override // com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight
        public void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
            mapboxMap.getClass();
            o0 o0VarE = mVar.E(2071471761);
            x1 x1Var = n.f135158a;
            l0.e(new MapboxLight$FlatLight$BindToMap$1(this, mapboxMap, null), mapboxMap, o0VarE);
            this.flatLightState.UpdateProperties$extension_compose_release(mapboxMap, o0VarE, 8);
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new MapboxLight$FlatLight$BindToMap$2(this, mapboxMap, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0011¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$NoOp;", "Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NoOp extends MapboxLight {
        public static final int $stable = 0;
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
            super(null);
        }

        @Override // com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight
        public void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
            mapboxMap.getClass();
            o0 o0VarE = mVar.E(668614618);
            if ((i14 & 1) == 0 && o0VarE.b()) {
                o0VarE.e();
            } else {
                x1 x1Var = n.f135158a;
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new MapboxLight$NoOp$BindToMap$1(this, mapboxMap, i14);
        }
    }

    public /* synthetic */ MapboxLight(j jVar) {
        this();
    }

    public abstract void BindToMap$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/internal/MapboxLight$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    private MapboxLight() {
    }
}
