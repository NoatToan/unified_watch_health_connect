package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class n0 implements m0 {
    public static <K, V> int i(int i, Object obj, Object obj2) {
        int iX = 0;
        if (obj == null) {
            return 0;
        }
        Map<K, V> mapJ = ((l0) obj).j();
        j0 j0Var = (j0) obj2;
        if (mapJ.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapJ.entrySet()) {
            iX += CodedOutputStream.X(i) + CodedOutputStream.E(k0.b(j0Var.f(), entry.getKey(), entry.getValue()));
        }
        return iX;
    }

    public static <K, V> Object j(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0<K, V> l0Var2 = (l0) obj2;
        if (!l0Var.n()) {
            l0Var.g();
        }
        l0Var.p(l0Var2);
        return l0Var;
    }

    @Override // com.google.protobuf.m0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.m0
    public k0.b<?, ?> b(Object obj) {
        return ((j0) obj).f();
    }

    @Override // com.google.protobuf.m0
    public Object c(Object obj) {
        ((l0) obj).o();
        return obj;
    }

    @Override // com.google.protobuf.m0
    public int d(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.google.protobuf.m0
    public Map<?, ?> e(Object obj) {
        return ((l0) obj).m();
    }

    @Override // com.google.protobuf.m0
    public Object f(Object obj) {
        return l0.q((j0) obj);
    }

    @Override // com.google.protobuf.m0
    public Map<?, ?> g(Object obj) {
        return ((l0) obj).j();
    }

    @Override // com.google.protobuf.m0
    public boolean h(Object obj) {
        return !((l0) obj).n();
    }
}
