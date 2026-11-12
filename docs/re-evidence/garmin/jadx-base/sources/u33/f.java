package u33;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends z33.g.d<M>, T> T a(z33.g.d<M> dVar, z33.g.f<M, T> fVar) {
        dVar.getClass();
        fVar.getClass();
        if (dVar.g(fVar)) {
            return (T) dVar.f(fVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends z33.g.d<M>, T> T b(z33.g.d<M> dVar, z33.g.f<M, List<T>> fVar, int i14) {
        dVar.getClass();
        fVar.getClass();
        dVar.l(fVar);
        z33.f<z33.g.e> fVar2 = dVar.f202191a;
        z33.g.e eVar = fVar.f202203d;
        fVar2.getClass();
        if (!eVar.isRepeated()) {
            vb.h.s("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objE = fVar2.e(eVar);
        if (i14 >= (objE == null ? 0 : ((List) objE).size())) {
            return null;
        }
        dVar.l(fVar);
        fVar2.getClass();
        if (!eVar.isRepeated()) {
            vb.h.s("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objE2 = fVar2.e(eVar);
        if (objE2 != null) {
            return (T) fVar.a(((List) objE2).get(i14));
        }
        o2.c.q();
        return null;
    }
}
