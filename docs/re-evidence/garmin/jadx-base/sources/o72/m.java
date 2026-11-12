package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f72.yb;
import i3.mh;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:23:0x029b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0385  */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(2093477191);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b63.z.INSTANCE.getClass();
            LocalDate localDate = b63.b.f(b63.a.C0229a.f16171a, b63.z.Companion.a()).f16206a;
            b63.o oVar = new b63.o(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarY = c2.l.y(aVar, f14);
            b63.o oVarD = b63.q.d(oVar, new b63.d(0, 0, 1, 3, null));
            s62.a.f157643a.getClass();
            t62.c cVar = t62.c.f162799a;
            c82.i iVar = new c82.i(oVarD, new c82.h.d(f72.t0.a(cVar)), false, 4, null);
            c82.h.c cVar2 = c82.h.c.f25732a;
            c82.i iVar2 = new c82.i(oVar, cVar2, false, 4, null);
            c82.i iVar3 = new c82.i(b63.p.c(oVar, new b63.d(0, 0, 1, 3, null)), new c82.h.a(null, 1, null), false, 4, null);
            c82.i iVar4 = new c82.i(b63.p.c(oVar, new b63.d(0, 0, 2, 3, null)), new c82.h.g(5), false, 4, null);
            c82.i iVar5 = new c82.i(b63.p.c(oVar, new b63.d(0, 0, 3, 3, null)), null, false, 6, null);
            b63.o oVarC = b63.p.c(oVar, new b63.d(0, 0, 4, 3, null));
            a0.f130291a.getClass();
            c82.g.c(rVarY, p13.x.k(iVar, iVar2, iVar3, iVar4, iVar5, new c82.i(oVarC, new c82.h.b(a0.f130292b), false, 4, null), new c82.i(b63.p.c(oVar, new b63.d(0, 0, 6, 3, null)), new c82.h.e(null, 1, null), false, 4, null)), o0VarE, 64);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(aVar, f15);
            List listK = p13.x.k(new c82.i(new b63.o(2025, 3, 10), null, false, 6, null), new c82.i(new b63.o(2025, 3, 11), new c82.h.d(yb.a(cVar)), false, 4, null), new c82.i(new b63.o(2025, 3, 12), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 13), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 14), new c82.h.a(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 15), null, false, 6, null), new c82.i(new b63.o(2025, 3, 16), cVar2, false, 4, null));
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new a51.m(context, 26);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a51.m(context, 26);
                    o0VarE.K(objQ);
                }
            }
            c82.g.a(64, (e23.l) objQ, rVarY2, listK, o0VarE);
            bVar2.getClass();
            h4.r rVarY3 = c2.l.y(aVar, f15);
            List listK2 = p13.x.k(new c82.i(new b63.o(2025, 3, 10), null, false, 6, null), new c82.i(new b63.o(2025, 3, 11), new c82.h.d(yb.a(cVar)), false, 4, null), new c82.i(new b63.o(2025, 3, 12), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 13), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 14), new c82.h.a(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 15), new c82.h.b(a0.f130293c), false, 4, null), new c82.i(new b63.o(2025, 3, 16), new c82.h.b(a0.f130294d), false, 4, null));
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new a51.m(context, 27);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a51.m(context, 27);
                    o0VarE.K(objQ2);
                }
            }
            c82.g.a(64, (e23.l) objQ2, rVarY3, listK2, o0VarE);
            Object objQ3 = o0VarE.q();
            aVar3.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = p3.p0.n(p13.l0.f134950a);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var = (p3.p1) objQ3;
            String strH = am.j.h(((Set) p1Var.getF182175a()).size(), "Selected days: ");
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar2.getClass();
            mh.c(strH, c2.l.y(aVar, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            bVar2.getClass();
            h4.r rVarY4 = c2.l.y(aVar, f15);
            int i15 = 11;
            List<c82.i> listK3 = p13.x.k(new c82.i(new b63.o(2025, 3, 10), null, false, 6, null), new c82.i(new b63.o(2025, 3, 11), new c82.h.d(yb.a(cVar)), false, 4, null), new c82.i(new b63.o(2025, 3, 12), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 13), new c82.h.e(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 14), new c82.h.a(null, 1, null), false, 4, null), new c82.i(new b63.o(2025, 3, 15), null, false, 6, null), new c82.i(new b63.o(2025, 3, 16), cVar2, false, 4, null));
            ArrayList arrayList = new ArrayList(p13.y.r(listK3, 10));
            for (c82.i iVar6 : listK3) {
                boolean zContains = ((Set) p1Var.getF182175a()).contains(iVar6.f25737a);
                b63.o oVar2 = iVar6.f25737a;
                c82.h hVar = iVar6.f25738b;
                oVar2.getClass();
                hVar.getClass();
                arrayList.add(new c82.i(oVar2, hVar, zContains));
            }
            Object objQ4 = o0Var.q();
            if (objQ4 == p3.m.a.f135155b) {
                objQ4 = new md0.f(p1Var, i15);
                o0Var.K(objQ4);
            }
            c82.g.a(384, (e23.l) objQ4, rVarY4, arrayList, o0Var);
            o0Var.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 2);
        }
    }
}
