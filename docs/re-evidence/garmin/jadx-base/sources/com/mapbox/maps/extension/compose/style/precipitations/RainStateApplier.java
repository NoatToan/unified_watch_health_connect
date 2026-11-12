package com.mapbox.maps.extension.compose.style.precipitations;

import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.precipitations.generated.RainUtils;
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
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;
import r53.g2;
import r53.q2;
import r53.y1;
import r53.z1;
import u53.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B/\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R0\u0010.\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040,j\u0002`-0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier;", "", "", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lo53/b0;", "coroutineScope", "", "enabled", "<init>", "(Ljava/util/Map;Lo53/b0;Z)V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "startCollectingPropertyFlows", "(Lcom/mapbox/maps/MapboxMap;)V", "attachTo$extension_compose_release", "attachTo", "detach$extension_compose_release", "()V", "detach", "name", "value", "setProperty$extension_compose_release", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V", "setProperty", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo53/b0;", "Z", "getEnabled$extension_compose_release", "()Z", "", "Lo53/l1;", "propertiesUpdateJobs", "Ljava/util/List;", "rainSet", "Lr53/y1;", "Lo13/p;", "Lr53/z1;", "Lcom/mapbox/maps/extension/compose/style/precipitations/PropertyValueFlow;", "propertiesFlowsToCollect", "Lr53/y1;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RainStateApplier {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "RainStateApplier";
    private final b0 coroutineScope;
    private final boolean enabled;
    private final y1<p<String, z1<Value>>> propertiesFlowsToCollect;
    private List<l1> propertiesUpdateJobs;
    private boolean rainSet;

    public RainStateApplier(Map<String, ? extends Value> map, b0 b0Var, boolean z14) {
        map.getClass();
        b0Var.getClass();
        this.coroutineScope = b0Var;
        this.enabled = z14;
        this.propertiesUpdateJobs = new ArrayList();
        this.propertiesFlowsToCollect = g2.b(Integer.MAX_VALUE, 0, null, 6);
        for (Map.Entry<String, ? extends Value> entry : map.entrySet()) {
            setProperty$extension_compose_release(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$3(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Failed to add rain: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$4(RainStateApplier rainStateApplier, None none) {
        rainStateApplier.getClass();
        none.getClass();
        MapboxLogger.logD(TAG, "Added rain: " + rainStateApplier);
        rainStateApplier.rainSet = true;
    }

    private final void startCollectingPropertyFlows(MapboxMap mapboxMap) {
        this.propertiesUpdateJobs.add(ge1.b.T(this.coroutineScope, null, null, new RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1(this, mapboxMap, null), 3));
    }

    public final void attachTo$extension_compose_release(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        if (!this.enabled) {
            RainUtils.removeRain(mapboxMap);
            return;
        }
        List<p<String, z1<Value>>> listA = this.propertiesFlowsToCollect.a();
        if (!listA.isEmpty()) {
            MapboxLogger.logD(TAG, "Adding rain: " + this);
            HashMap map = new HashMap();
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
            mapboxMap.setStyleRain(new Value((HashMap<String, Value>) map)).onError(new com.mapbox.maps.p(7)).onValue(new i(this, 25));
        }
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
        if (!RainStateApplier.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        RainStateApplier rainStateApplier = (RainStateApplier) other;
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
        List<p<String, z1<Value>>> listA2 = rainStateApplier.propertiesFlowsToCollect.a();
        int iA2 = t0.a(y.r(listA2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        Iterator<T> it3 = listA2.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            p pVar4 = new p(pVar3.f128594a, ((z1) pVar3.f128595b).getValue());
            linkedHashMap2.put(pVar4.f128594a, pVar4.f128595b);
        }
        return linkedHashMap.equals(linkedHashMap2) && this.rainSet == rainStateApplier.rainSet;
    }

    /* JADX INFO: renamed from: getEnabled$extension_compose_release, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
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
        return Objects.hash(Boolean.valueOf(this.rainSet), linkedHashMap);
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RainStateApplier(Map map, b0 b0Var, boolean z14, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            b0Var = zl.a.e("RainStateScope", o.f168762a.H().plus(ge1.b.h()));
        }
        this(map, b0Var, z14);
    }
}
