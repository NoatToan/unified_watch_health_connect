package androidx.health.platform.client.proto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements x0 {
    @Override // androidx.health.platform.client.proto.x0
    public final w0 a() {
        return w0.f7805b.c();
    }

    @Override // androidx.health.platform.client.proto.x0
    public final w0 forMapData(Object obj) {
        return (w0) obj;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final v0.a<?, ?> forMapMetadata(Object obj) {
        return ((v0) obj).f7796a;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final w0 forMutableMapData(Object obj) {
        return (w0) obj;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final int getSerializedSize(int i14, Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        v0 v0Var = (v0) obj2;
        int iG = 0;
        if (w0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : w0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            v0Var.getClass();
            int iF = CodedOutputStream.f(i14);
            int iA = v0.a(v0Var.f7796a, key, value);
            iG += CodedOutputStream.g(iA) + iA + iF;
        }
        return iG;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final boolean isImmutable(Object obj) {
        return !((w0) obj).f7806a;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final w0 mergeFrom(Object obj, Object obj2) {
        w0 w0VarC = (w0) obj;
        w0 w0Var = (w0) obj2;
        if (!w0Var.isEmpty()) {
            if (!w0VarC.f7806a) {
                w0VarC = w0VarC.c();
            }
            w0VarC.b();
            if (!w0Var.isEmpty()) {
                w0VarC.putAll(w0Var);
            }
        }
        return w0VarC;
    }

    @Override // androidx.health.platform.client.proto.x0
    public final Object toImmutable(Object obj) {
        ((w0) obj).f7806a = false;
        return obj;
    }
}
