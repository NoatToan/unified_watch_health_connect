package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements z {
    public static <K, V> int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        y yVar = (y) obj2;
        int iA = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iA += yVar.a(i, entry.getKey(), entry.getValue());
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

    @Override // androidx.datastore.preferences.protobuf.z
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public y.a<?, ?> b(Object obj) {
        return ((y) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public Object c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public int d(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public Object f(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public Map<?, ?> g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
