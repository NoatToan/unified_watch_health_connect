package n43;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import l43.p0;
import l43.q0;
import l43.x0;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.b f123620a;

    public c0(z.b bVar) {
        this.f123620a = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = z.b.f123700j;
        fVar.getClass();
        z.b bVar = this.f123620a;
        z zVar = bVar.f123709i;
        byte[] bArr = (byte[]) bVar.f123703c.get(fVar);
        if (bArr == null) {
            return null;
        }
        s33.t tVar = (s33.t) s33.t.f156907q.c(new ByteArrayInputStream(bArr), zVar.f123696b.f110085a.f110066p);
        if (tVar == null) {
            return null;
        }
        l43.l0 l0Var = zVar.f123696b.f110093i;
        l43.p pVar = l0Var.f110046a;
        u33.h hVar = pVar.f110088d;
        u33.d dVar = pVar.f110086b;
        tVar.getClass();
        u23.h.a aVar = u23.h.f168226x0;
        List<s33.b> list = tVar.f156917k;
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (s33.b bVar2 : list) {
            l43.g gVar = l0Var.f110047b;
            bVar2.getClass();
            arrayList.add(gVar.a(bVar2, dVar));
        }
        aVar.getClass();
        i0 i0Var = new i0(pVar.f110085a.f110051a, pVar.f110087c, u23.h.a.a(arrayList), x33.f.d(dVar.getString(tVar.f156911e)), q0.a(p0.f110094a, (s33.z) u33.b.f168298d.d(tVar.f156910d)), tVar, dVar, hVar, pVar.f110089e, pVar.f110091g);
        List<s33.u> list2 = tVar.f156912f;
        list2.getClass();
        x0 x0Var = pVar.a(i0Var, list2, pVar.f110086b, pVar.f110088d, pVar.f110089e, pVar.f110090f).f110092h;
        i0Var.E0(x0Var.b(), x0Var.d(u33.g.l(tVar, hVar), false), x0Var.d(u33.g.d(tVar, hVar), false));
        return i0Var;
    }
}
