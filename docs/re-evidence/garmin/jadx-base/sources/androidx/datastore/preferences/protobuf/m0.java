package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {
    @Override // androidx.datastore.preferences.protobuf.l0
    public final k0 a() {
        return k0.f6775b.c();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final k0 forMapData(Object obj) {
        return (k0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final j0.a<?, ?> forMapMetadata(Object obj) {
        return ((j0) obj).f6748a;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final k0 forMutableMapData(Object obj) {
        return (k0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int getSerializedSize(int i14, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int iH = 0;
        if (k0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : k0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            j0Var.getClass();
            int iG = CodedOutputStream.g(i14);
            int iA = j0.a(j0Var.f6748a, key, value);
            iH += CodedOutputStream.h(iA) + iA + iG;
        }
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final boolean isImmutable(Object obj) {
        return !((k0) obj).f6776a;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final k0 mergeFrom(Object obj, Object obj2) {
        k0 k0VarC = (k0) obj;
        k0 k0Var = (k0) obj2;
        if (!k0Var.isEmpty()) {
            if (!k0VarC.f6776a) {
                k0VarC = k0VarC.c();
            }
            k0VarC.b();
            if (!k0Var.isEmpty()) {
                k0VarC.putAll(k0Var);
            }
        }
        return k0VarC;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final Object toImmutable(Object obj) {
        ((k0) obj).f6776a = false;
        return obj;
    }
}
