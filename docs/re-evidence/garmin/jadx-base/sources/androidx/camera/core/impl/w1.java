package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends a2 implements v1 {
    public static final x0.b Q = x0.b.OPTIONAL;

    private w1(TreeMap<x0.a<?>, Map<x0.b, Object>> treeMap) {
        super(treeMap);
    }

    public static w1 U() {
        return new w1(new TreeMap(a2.O));
    }

    public static w1 V(x0 x0Var) {
        TreeMap treeMap = new TreeMap(a2.O);
        for (x0.a<?> aVar : x0Var.d()) {
            Set<x0.b> setA = x0Var.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (x0.b bVar : setA) {
                arrayMap.put(bVar, x0Var.c(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new w1(treeMap);
    }

    public final <ValueT> void W(x0.a<ValueT> aVar, x0.b bVar, ValueT valuet) {
        x0.b bVar2;
        TreeMap<x0.a<?>, Map<x0.b, Object>> treeMap = this.N;
        Map<x0.b, Object> map = treeMap.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put((x0.a<?>) aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        x0.b bVar3 = (x0.b) Collections.min(map.keySet());
        if (Objects.equals(map.get(bVar3), valuet) || bVar3 != (bVar2 = x0.b.REQUIRED) || bVar != bVar2) {
            map.put(bVar, valuet);
            return;
        }
        StringBuilder sb3 = new StringBuilder("Option values conflicts: ");
        sb3.append(aVar.b());
        sb3.append(", existing value (");
        sb3.append(bVar3);
        Object obj = map.get(bVar3);
        sb3.append(")=");
        sb3.append(obj);
        sb3.append(", conflicting (");
        sb3.append(bVar);
        sb3.append(")=");
        sb3.append(valuet);
        throw new IllegalArgumentException(sb3.toString());
    }

    public final <ValueT> void X(x0.a<ValueT> aVar, ValueT valuet) {
        W(aVar, Q, valuet);
    }
}
