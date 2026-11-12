package com.mapbox.maps.extension.compose.style.terrain;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import ge1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o13.p;
import o53.b0;
import o53.l1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;
import r53.g2;
import r53.q2;
import r53.y1;
import r53.z1;
import u53.o;
import x53.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B9\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\u001e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R0\u00109\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000607j\u0002`806058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier;", "", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "rasterDemSourceState", "", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "", "initial", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;Ljava/util/Map;ZLo53/b0;)V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "startCollectingPropertyFlows", "(Lcom/mapbox/maps/MapboxMap;)V", "attachTo$extension_compose_release", "attachTo", "detach$extension_compose_release", "()V", "detach", "name", "value", "setProperty$extension_compose_release", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V", "setProperty", "properties", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "save$extension_compose_release", "(Ljava/util/Map;)Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "save", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "getRasterDemSourceState$extension_compose_release", "()Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "Z", "getInitial$extension_compose_release", "()Z", "Lo53/b0;", "", "Lo53/l1;", "propertiesUpdateJobs", "Ljava/util/List;", "Lr53/y1;", "Lo13/p;", "Lr53/z1;", "Lcom/mapbox/maps/extension/compose/style/terrain/PropertyValueFlow;", "propertiesFlowsToCollect", "Lr53/y1;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TerrainStateApplier {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "TerrainStateApplier";
    private final b0 coroutineScope;
    private final boolean initial;
    private final y1<p<String, z1<Value>>> propertiesFlowsToCollect;
    private List<l1> propertiesUpdateJobs;
    private final RasterDemSourceState rasterDemSourceState;

    public TerrainStateApplier(RasterDemSourceState rasterDemSourceState, Map<String, ? extends Value> map, boolean z14, b0 b0Var) {
        map.getClass();
        b0Var.getClass();
        this.rasterDemSourceState = rasterDemSourceState;
        this.initial = z14;
        this.coroutineScope = b0Var;
        this.propertiesUpdateJobs = new ArrayList();
        this.propertiesFlowsToCollect = g2.b(Integer.MAX_VALUE, 0, null, 6);
        for (Map.Entry<String, ? extends Value> entry : map.entrySet()) {
            setProperty$extension_compose_release(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$5(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Failed to add terrain: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$6(TerrainStateApplier terrainStateApplier, None none) {
        terrainStateApplier.getClass();
        none.getClass();
        if (terrainStateApplier.rasterDemSourceState != null) {
            MapboxLogger.logD(TAG, "Added terrain: " + terrainStateApplier);
        }
    }

    private final void startCollectingPropertyFlows(MapboxMap mapboxMap) {
        this.propertiesUpdateJobs.add(b.T(this.coroutineScope, null, null, new TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1(this, mapboxMap, null), 3));
    }

    public final void attachTo$extension_compose_release(MapboxMap mapboxMap) {
        Value valueNullValue;
        mapboxMap.getClass();
        if (this.initial) {
            return;
        }
        if (this.rasterDemSourceState != null) {
            HashMap map = new HashMap();
            map.put("source", new Value(this.rasterDemSourceState.getSourceId()));
            List<p<String, z1<Value>>> listA = this.propertiesFlowsToCollect.a();
            int iA = t0.a(y.r(listA, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                p pVar2 = new p(pVar.f128594a, ((z1) pVar.f128595b).getValue());
                linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
            }
            map.putAll(linkedHashMap);
            MapboxLogger.logD(TAG, "Setting all properties in one go: " + map);
            valueNullValue = new Value((HashMap<String, Value>) map);
            MapboxLogger.logD(TAG, "Adding terrain: " + this);
        } else {
            valueNullValue = Value.nullValue();
            MapboxLogger.logD(TAG, "Removing terrain: " + this);
            valueNullValue.getClass();
        }
        mapboxMap.setStyleTerrain(valueNullValue).onError(new com.mapbox.maps.p(9)).onValue(new i(this, 27));
        startCollectingPropertyFlows(mapboxMap);
    }

    public final void detach$extension_compose_release() {
        Iterator<T> it = this.propertiesUpdateJobs.iterator();
        while (it.hasNext()) {
            ((l1) it.next()).c(null);
        }
        this.propertiesUpdateJobs.clear();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TerrainStateApplier.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        TerrainStateApplier terrainStateApplier = (TerrainStateApplier) other;
        if (!s.g(this.rasterDemSourceState, terrainStateApplier.rasterDemSourceState) || this.initial != terrainStateApplier.initial) {
            return false;
        }
        List<p<String, z1<Value>>> listA = this.propertiesFlowsToCollect.a();
        int iA = t0.a(y.r(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            p pVar2 = new p(pVar.f128594a, ((z1) pVar.f128595b).getValue());
            linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
        }
        List<p<String, z1<Value>>> listA2 = terrainStateApplier.propertiesFlowsToCollect.a();
        int iA2 = t0.a(y.r(listA2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        Iterator<T> it3 = listA2.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            p pVar4 = new p(pVar3.f128594a, ((z1) pVar3.f128595b).getValue());
            linkedHashMap2.put(pVar4.f128594a, pVar4.f128595b);
        }
        return linkedHashMap.equals(linkedHashMap2);
    }

    /* JADX INFO: renamed from: getInitial$extension_compose_release, reason: from getter */
    public final boolean getInitial() {
        return this.initial;
    }

    /* JADX INFO: renamed from: getRasterDemSourceState$extension_compose_release, reason: from getter */
    public final RasterDemSourceState getRasterDemSourceState() {
        return this.rasterDemSourceState;
    }

    public int hashCode() {
        List<p<String, z1<Value>>> listA = this.propertiesFlowsToCollect.a();
        int iA = t0.a(y.r(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            p pVar2 = new p(pVar.f128594a, ((z1) pVar.f128595b).getValue());
            linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
        }
        return Objects.hash(this.rasterDemSourceState, Boolean.valueOf(this.initial), linkedHashMap);
    }

    public final TerrainState.Holder save$extension_compose_release(Map<String, ? extends Value> properties) {
        properties.getClass();
        RasterDemSourceState rasterDemSourceState = this.rasterDemSourceState;
        return new TerrainState.Holder(rasterDemSourceState != null ? rasterDemSourceState.save$extension_compose_release() : null, properties, this.initial);
    }

    public final void setProperty$extension_compose_release(String name, Value value) {
        Object next;
        name.getClass();
        value.getClass();
        MapboxLogger.logD(TAG, "setProperty() called with: name = " + name + ", value = " + value);
        Iterator<T> it = this.propertiesFlowsToCollect.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((p) next).f128594a, name));
        p pVar = (p) next;
        if (pVar != null) {
            ((z1) pVar.f128595b).setValue(value);
        } else {
            MapboxLogger.logD(TAG, "setProperty: emitting new property to listen to: ".concat(name));
            this.propertiesFlowsToCollect.d(new p<>(name, q2.a(value)));
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("TerrainStateApplier(rasterDemSourceState=");
        sb3.append(this.rasterDemSourceState);
        sb3.append(", initial=");
        return j.t(sb3, this.initial, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TerrainStateApplier(RasterDemSourceState rasterDemSourceState, Map map, boolean z14, b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            c cVar = s0.f129406a;
            b0Var = zl.a.e("TerrainStateScope", o.f168762a.H().plus(b.h()));
        }
        this(rasterDemSourceState, map, z14, b0Var);
    }
}
