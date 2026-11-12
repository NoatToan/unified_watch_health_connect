package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements q0 {
    @Override // androidx.health.platform.client.proto.q0
    public final l0.d a(long j8, Object obj) {
        l0.d dVar = (l0.d) y2.f7815c.i(obj, j8);
        if (dVar.isModifiable()) {
            return dVar;
        }
        int size = dVar.size();
        l0.d dVarMutableCopyWithCapacity = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        y2.p(obj, j8, dVarMutableCopyWithCapacity);
        return dVarMutableCopyWithCapacity;
    }

    @Override // androidx.health.platform.client.proto.q0
    public final <E> void b(Object obj, Object obj2, long j8) {
        y2.e eVar = y2.f7815c;
        l0.d dVarMutableCopyWithCapacity = (l0.d) eVar.i(obj, j8);
        l0.d dVar = (l0.d) eVar.i(obj2, j8);
        int size = dVarMutableCopyWithCapacity.size();
        int size2 = dVar.size();
        if (size > 0 && size2 > 0) {
            if (!dVarMutableCopyWithCapacity.isModifiable()) {
                dVarMutableCopyWithCapacity = dVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            dVarMutableCopyWithCapacity.addAll(dVar);
        }
        if (size > 0) {
            dVar = dVarMutableCopyWithCapacity;
        }
        y2.p(obj, j8, dVar);
    }

    @Override // androidx.health.platform.client.proto.q0
    public final void c(Object obj, long j8) {
        ((l0.d) y2.f7815c.i(obj, j8)).makeImmutable();
    }
}
