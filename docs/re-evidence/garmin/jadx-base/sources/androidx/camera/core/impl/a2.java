package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class a2 implements x0 {
    public static final androidx.browser.trusted.c O;
    public static final a2 P;
    public final TreeMap<x0.a<?>, Map<x0.b, Object>> N;

    static {
        androidx.browser.trusted.c cVar = new androidx.browser.trusted.c(1);
        O = cVar;
        P = new a2(new TreeMap(cVar));
    }

    public a2(TreeMap<x0.a<?>, Map<x0.b, Object>> treeMap) {
        this.N = treeMap;
    }

    public static a2 T(x0 x0Var) {
        if (a2.class.equals(x0Var.getClass())) {
            return (a2) x0Var;
        }
        TreeMap treeMap = new TreeMap(O);
        for (x0.a<?> aVar : x0Var.d()) {
            Set<x0.b> setA = x0Var.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (x0.b bVar : setA) {
                arrayMap.put(bVar, x0Var.c(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new a2(treeMap);
    }

    @Override // androidx.camera.core.impl.x0
    public final Set<x0.b> a(x0.a<?> aVar) {
        Map<x0.b, Object> map = this.N.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.x0
    public final boolean b(x0.a<?> aVar) {
        return this.N.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    public final <ValueT> ValueT c(x0.a<ValueT> aVar, x0.b bVar) {
        Map<x0.b, Object> map = this.N.get(aVar);
        if (map == null) {
            com.google.firebase.messaging.l.j(aVar, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(bVar)) {
            return (ValueT) map.get(bVar);
        }
        c22.t.i("Option does not exist: ", aVar, " with priority=", bVar);
        return null;
    }

    @Override // androidx.camera.core.impl.x0
    public final Set<x0.a<?>> d() {
        return Collections.unmodifiableSet(this.N.keySet());
    }

    @Override // androidx.camera.core.impl.x0
    public final <ValueT> ValueT e(x0.a<ValueT> aVar) {
        Map<x0.b, Object> map = this.N.get(aVar);
        if (map != null) {
            return (ValueT) map.get((x0.b) Collections.min(map.keySet()));
        }
        com.google.firebase.messaging.l.j(aVar, "Option does not exist: ");
        return null;
    }

    @Override // androidx.camera.core.impl.x0
    public final <ValueT> ValueT f(x0.a<ValueT> aVar, ValueT valuet) {
        Map<x0.b, Object> map = this.N.get(aVar);
        return map == null ? valuet : (ValueT) map.get((x0.b) Collections.min(map.keySet()));
    }

    @Override // androidx.camera.core.impl.x0
    public final void g(a0.h hVar) {
        for (Map.Entry<x0.a<?>, Map<x0.b, Object>> entry : this.N.tailMap(x0.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            x0.a<?> key = entry.getKey();
            a0.i.a aVar = (a0.i.a) hVar.f34b;
            x0 x0Var = (x0) hVar.f35c;
            aVar.f36a.W(key, x0Var.h(key), x0Var.e(key));
        }
    }

    @Override // androidx.camera.core.impl.x0
    public final x0.b h(x0.a<?> aVar) {
        Map<x0.b, Object> map = this.N.get(aVar);
        if (map != null) {
            return (x0.b) Collections.min(map.keySet());
        }
        com.google.firebase.messaging.l.j(aVar, "Option does not exist: ");
        return null;
    }
}
