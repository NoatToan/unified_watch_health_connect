package androidx.health.platform.client.proto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements m0 {
    public static <K, V> int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        l0 l0Var = (l0) obj2;
        int iA = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iA += l0Var.a(i, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static <K, V> MapFieldLite<K, V> j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteMutableCopy = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // androidx.health.platform.client.proto.m0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.health.platform.client.proto.m0
    public l0.a<?, ?> b(Object obj) {
        return ((l0) obj).c();
    }

    @Override // androidx.health.platform.client.proto.m0
    public Object c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.health.platform.client.proto.m0
    public int d(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // androidx.health.platform.client.proto.m0
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.health.platform.client.proto.m0
    public Object f(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.health.platform.client.proto.m0
    public Map<?, ?> g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.health.platform.client.proto.m0
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
