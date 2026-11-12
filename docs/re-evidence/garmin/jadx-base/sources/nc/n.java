package nc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.b1;
import lc.d0;
import lc.k0;
import lc.q0;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final void a(k0 k0Var, k23.d dVar, Map map, List list, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, z3.e eVar) {
        f fVar = new f((e) k0Var.f111792h.b(e.class), dVar, map, eVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            d0Var.getClass();
            fVar.f111788f.add(d0Var);
        }
        fVar.f125274j = lVar;
        fVar.f125275k = lVar2;
        fVar.f125276l = lVar3;
        fVar.f125277m = lVar4;
        k0Var.f111797m.add(fVar.a());
    }

    public static void b(k0 k0Var, String str, List list, List list2, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, e23.r rVar, int i14) {
        if ((i14 & 2) != 0) {
            list = j0.f134944a;
        }
        if ((i14 & 4) != 0) {
            list2 = j0.f134944a;
        }
        if ((i14 & 8) != 0) {
            b1Var = null;
        }
        if ((i14 & 16) != 0) {
            b1Var2 = null;
        }
        if ((i14 & 32) != 0) {
            b1Var3 = b1Var;
        }
        if ((i14 & 64) != 0) {
            b1Var4 = b1Var2;
        }
        f fVar = new f((e) k0Var.f111792h.b(e.class), str, rVar);
        for (lc.r rVar2 : list) {
            fVar.f111787e.put(rVar2.f111860a, rVar2.f111861b);
        }
        for (d0 d0Var : list2) {
            d0Var.getClass();
            fVar.f111788f.add(d0Var);
        }
        fVar.f125274j = b1Var;
        fVar.f125275k = b1Var2;
        fVar.f125276l = b1Var3;
        fVar.f125277m = b1Var4;
        k0Var.f111797m.add(fVar.a());
    }

    public static final void c(k0 k0Var, k23.d dVar, Map map, List list, p004k6.u uVar, z3.e eVar) {
        l lVar = new l((k) k0Var.f111792h.b(k.class), dVar, map, uVar, eVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            d0Var.getClass();
            lVar.f111788f.add(d0Var);
        }
        k0Var.f111797m.add(lVar.a());
    }

    public static final void d(k0 k0Var, Object obj, k23.d dVar, Map map, List list, e23.l lVar) {
        k0 k0Var2 = new k0(k0Var.f111792h, obj, (k23.d<?>) dVar, (Map<k23.p, q0<?>>) map);
        lVar.invoke(k0Var2);
        lc.j0 j0VarA = k0Var2.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0VarA.a((d0) it.next());
        }
        k0Var.f111797m.add(j0VarA);
    }
}
