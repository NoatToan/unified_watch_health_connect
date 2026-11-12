package vd0;

import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import l72.i3;
import p3.p2;
import v62.o7;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, e23.l lVar, i53.c cVar, i53.c cVar2, p3.m mVar, pe0.d dVar) {
        cVar.getClass();
        cVar2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1884328563);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(cVar2) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new v10.a(29);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(cVar2);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            boolean zB = ((i15 & 14) == 4) | o0VarE.B((String) p1Var.getF182175a());
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                if (d53.w.J((String) p1Var.getF182175a())) {
                    objQ4 = cVar;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : cVar) {
                        if (d53.w.z(((pe0.d) obj).f137417b, (String) p1Var.getF182175a(), true)) {
                            arrayList.add(obj);
                        }
                    }
                    objQ4 = arrayList;
                }
                o0VarE.K(objQ4);
            }
            List list = (List) objQ4;
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == p3.m.a.f135155b) {
                objQ5 = new p40.q0(p1Var2, p1Var, 12);
                o0VarE.K(objQ5);
            }
            e23.a aVar = (e23.a) objQ5;
            Object objQ6 = o0VarE.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ6 == c2565a2) {
                objQ6 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ6;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.getClass();
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                objQ7 = new y1(b0Var, p1Var2, null);
                o0VarE.K(objQ7);
            }
            p3.l0.e((e23.p) objQ7, bool, o0VarE);
            boolean zB3 = ((i15 & 112) == 32) | o0VarE.B(aVar) | ((i15 & 7168) == 2048);
            Object objQ8 = o0VarE.q();
            if (zB3 || objQ8 == c2565a2) {
                ug2.k kVar = new ug2.k(aVar, lVar, cVar2, p1Var2, 6);
                o0VarE.K(kVar);
                objQ8 = kVar;
            }
            c.w.a(0, 1, (e23.a) objQ8, o0VarE, false);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_search);
            s62.a.f157643a.getClass();
            z3.e eVarC = z3.f.c(795141262, new r11.k(aVar, lVar, cVar2, new i3("MENU_SEARCH", strQ, false, o7.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_search), 4, (p005kotlin.jvm.internal.j) null), p1Var2, b0Var, p1Var), o0VarE);
            c2.n0 n0Var = n3.f22788a;
            z02.d.a(false, eVarC, null, null, new c2.n0(0, 0, 0, 0), z3.f.c(-949679862, new sg2.g(p1Var, list, dVar, p1Var3, lVar, 18), o0VarE), o0VarE, 196656, 13);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p1(cVar, cVar2, dVar, lVar, i14);
        }
    }
}
