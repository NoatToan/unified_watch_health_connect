package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements e0 {
    @Override // androidx.datastore.preferences.protobuf.e0
    public final z.d a(long j8, Object obj) {
        z.d dVar = (z.d) p1.f6801c.h(obj, j8);
        if (dVar.isModifiable()) {
            return dVar;
        }
        int size = dVar.size();
        z.d dVarMutableCopyWithCapacity = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        p1.o(obj, j8, dVarMutableCopyWithCapacity);
        return dVarMutableCopyWithCapacity;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final <E> void b(Object obj, Object obj2, long j8) {
        p1.e eVar = p1.f6801c;
        z.d dVarMutableCopyWithCapacity = (z.d) eVar.h(obj, j8);
        z.d dVar = (z.d) eVar.h(obj2, j8);
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
        p1.o(obj, j8, dVar);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void c(Object obj, long j8) {
        ((z.d) p1.f6801c.h(obj, j8)).makeImmutable();
    }
}
