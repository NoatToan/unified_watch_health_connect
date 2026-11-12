package b11;

import g21.f0;
import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    public static final f a(f fVar, i iVar, Long l14) {
        if (iVar == null || iVar.getF14315a() == null) {
            return fVar;
        }
        if (iVar instanceof i.a) {
            i.a aVar = (i.a) iVar;
            return fVar.d(aVar.f14302h.f14375d.f(aVar.f14298d).f(-1.0d));
        }
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            return fVar.d(bVar.f14312h.f14375d.f(bVar.f14308d).f(-1.0d));
        }
        if (!(iVar instanceof i.c)) {
            u0.r();
            return null;
        }
        f fVar2 = ((i.c) iVar).f14319e;
        fVar2.getClass();
        return fVar.d(fVar2.f(-1.0d));
    }

    public static final f0 b(f0 f0Var, i iVar, Long l14) {
        if (iVar == null || iVar.getF14315a() == null) {
            return f0Var;
        }
        long f14318d = iVar.getF14318d();
        if (l14 == null || f14318d != l14.longValue()) {
            return f0Var;
        }
        if (iVar instanceof i.a) {
            i.a aVar = (i.a) iVar;
            return f0Var.b(aVar.f14302h.f14375d.g().c(aVar.f14298d).c(-1.0d));
        }
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            return f0Var.b(bVar.f14312h.f14375d.g().c(bVar.f14308d).c(-1.0d));
        }
        if (iVar instanceof i.c) {
            return f0Var.b(((i.c) iVar).f14319e.g().c(-1.0d));
        }
        u0.r();
        return null;
    }
}
