package v21;

import b11.m;
import b11.v;
import b21.l4;
import b63.u;
import i01.i;
import lc.u0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final l4 a(v vVar, i iVar, j11.c cVar, u uVar, m mVar) {
        vVar.getClass();
        iVar.getClass();
        cVar.getClass();
        uVar.getClass();
        mVar.getClass();
        if (vVar instanceof b11.a.C0202a) {
            b11.a.C0202a c0202a = (b11.a.C0202a) vVar;
            String str = c0202a.f14218a;
            b11.d dVar = c0202a.f14222e;
            return new l4.h(uVar, str, dVar.f14253a, c0202a.f14223f.f14372a, c0202a.f14219b, dVar.f14258f, dVar.f14259g, dVar.f14257e, iVar, cVar, mVar);
        }
        if (!(vVar instanceof b11.a.c)) {
            u0.r();
            return null;
        }
        b11.a.c cVar2 = (b11.a.c) vVar;
        String str2 = cVar2.f14234a;
        b11.d dVar2 = cVar2.f14238e;
        return new l4.c(uVar, dVar2.f14253a, str2, cVar2.f14235b, dVar2.f14258f, dVar2.f14259g, iVar, cVar, mVar);
    }

    public static final b11.f b(b11.a.b bVar) {
        i53.c<v> cVar = bVar.f14233i;
        b11.f fVar = new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        for (v vVar : cVar) {
            fVar = fVar.d(vVar.E().f(vVar.getF14235b()));
        }
        return fVar;
    }

    public static final boolean c(b11.a aVar, String str) {
        aVar.getClass();
        if (str == null || (aVar instanceof b11.a.C0202a)) {
            return true;
        }
        if (aVar instanceof b11.a.c) {
            return !s.g(((b11.a.c) aVar).f14238e.f14253a, str);
        }
        if (!(aVar instanceof b11.a.b)) {
            u0.r();
            return false;
        }
        i53.c<v> cVar = ((b11.a.b) aVar).f14233i;
        if (cVar != null && cVar.isEmpty()) {
            return true;
        }
        for (v vVar : cVar) {
            if ((vVar instanceof b11.a.c) && s.g(((b11.a.c) vVar).f14238e.f14253a, str)) {
                return false;
            }
        }
        return true;
    }
}
