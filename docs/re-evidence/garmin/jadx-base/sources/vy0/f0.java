package vy0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.o7;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {
    public static final void a(String str, p3.m mVar, int i14) {
        str.getClass();
        o0 o0VarE = mVar.E(-34494186);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (str.length() == 0) {
                o0VarE.C(-1119026905);
                s62.a.f157643a.getClass();
                u4.d dVarA = o7.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.more_menu_search_no_recent_searches_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.more_menu_search_no_recent_searches_description);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                b82.n.c(dVarA, strQ, strQ2, c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, o0VarE, 0, 16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1118668111);
                String strP = gl1.y.P(R.string.more_menu_search_no_results_title, new Object[]{"\"" + str + "\""}, o0VarE);
                String strQ3 = gl1.y.Q(o0VarE, R.string.more_menu_search_no_results_description);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                b82.n.c(null, strP, strQ3, c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, o0VarE, 0, 17);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    public static final void b(c2.a0 a0Var, List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list, e23.l<? super com.garmin.android.apps.connectmobile.navigation.more.b, Unit> lVar, p3.m mVar, int i14) {
        a0Var.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1815325888);
        int i15 = 256;
        int i16 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        int i17 = 1;
        int i18 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i19 = 2;
            r1.b(gl1.y.Q(o0VarE, R.string.more_menu_search_results_section_header), null, o0VarE, 0, 2);
            for (com.garmin.android.apps.connectmobile.navigation.more.b bVar : list) {
                String strA = bVar.a(w2.a0.s(o0VarE));
                b.f180690a.getClass();
                z3.e eVar = b.f180693d;
                z3.e eVarC = z3.f.c(-803288000, new o(bVar, i17), o0VarE);
                int i24 = ((i16 & 896) == i15 ? i17 : i18) | (o0VarE.r(bVar) ? 1 : 0);
                Object objQ = o0VarE.q();
                if (i24 == 0) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p(lVar, bVar, i19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new p(lVar, bVar, i19);
                    o0VarE.K(objQ);
                }
                i.c(a0Var, strA, 0L, null, null, null, eVar, eVarC, false, (e23.a) objQ, o0VarE, 113246214, 318);
                i15 = i15;
                i17 = i17;
                i19 = i19;
                i18 = i18;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.m(a0Var, list, lVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [ty0.j] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v26, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void c(c2.a0 a0Var, List list, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        ?? r14;
        ?? r15;
        o4.d0 d0VarA;
        long jB;
        Object obj;
        int i15;
        ?? r16;
        ?? r17;
        boolean f166936b;
        a0Var.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(454696712);
        int i16 = 2048;
        int i17 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        int i18 = 1;
        ?? r18 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Iterator it = list.iterator();
            ?? r19 = o0VarE;
            while (it.hasNext()) {
                e0 e0Var = (e0) it.next();
                ty0.j jVar = e0Var.f180707b;
                com.garmin.android.apps.connectmobile.navigation.more.b bVar = e0Var.f180706a;
                z3.e eVarE = i.e(jVar, z14, r19, (i17 >> 3) & 112);
                ty0.j f39397b = bVar.getF39397b();
                if (f39397b != null) {
                    f166936b = f39397b.getF166936b();
                } else {
                    r15 = r18;
                }
                if (eVarE == null) {
                    r15 = f166936b;
                    r19.C(-756216854);
                    x1 x1Var2 = p3.n.f135158a;
                    a.f180671a.getClass();
                    eVarE = a.f180672b;
                } else {
                    r15 = f166936b;
                    r19.C(-756217102);
                }
                r19.g0(r18);
                z3.e eVar = eVarE;
                b.f180690a.getClass();
                z3.e eVar2 = r15 != 0 ? b.f180691b : b.f180692c;
                r19.C(-1123102865);
                if (bVar.getF39397b() == null) {
                    r17 = r19;
                    i15 = i18;
                    r16 = r18;
                } else if ((bVar.getF39397b() instanceof ty0.b) && bVar.getF39397b() == ty0.b.f166889l) {
                    r19.C(1421810969);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i.d(j92.b.f97899b.f97920e, r19, r18);
                    r19.g0(r18);
                    r17 = r19;
                    i15 = i18;
                    r16 = r18;
                } else {
                    r19.C(1421912091);
                    String strA = bVar.a(w2.a0.s(r19));
                    ?? f39397b2 = bVar.getF39397b();
                    if (f39397b2 == 0) {
                        r19.C(1422034447);
                        r19.g0(r18);
                        d0VarA = null;
                    } else {
                        r19.C(-923959246);
                        long jI = f39397b2.i(r19);
                        r19.g0(r18);
                        d0VarA = o4.d0.a(jI);
                    }
                    if (d0VarA == null) {
                        r19.C(-923958227);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(r19).k().b();
                        r19.g0(r18);
                    } else {
                        r19.C(-923959560);
                        r19.g0(r18);
                        jB = d0VarA.f128833a;
                    }
                    String str = e0Var.f180708c;
                    int i19 = ((i17 & 7168) == i16 ? i18 : r18) | (r19.r(bVar) ? 1 : 0);
                    Object objQ = r19.q();
                    if (i19 == 0) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj = objQ;
                            p pVar = new p(lVar, bVar, i18);
                            r19.K(pVar);
                            obj = pVar;
                        }
                    } else {
                        obj = objQ;
                        p pVar2 = new p(lVar, bVar, i18);
                        r19.K(pVar2);
                        obj = pVar2;
                    }
                    obj = objQ;
                    i15 = i18;
                    ?? r110 = r19;
                    r16 = r18;
                    i.c(a0Var, strA, jB, str, null, null, eVar, eVar2, false, (e23.a) obj, r110, 6, 312);
                    r17 = r110;
                    r17.g0(r16);
                }
                r17.g0(r16);
                r18 = r16;
                r19 = r17;
                i18 = i15;
                i16 = 2048;
            }
            r14 = r19;
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0 o0Var = o0VarE;
            o0Var.e();
            r14 = o0Var;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(a0Var, list, z14, lVar, i14, 21);
        }
    }
}
