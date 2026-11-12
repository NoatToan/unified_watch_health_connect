package q51;

import com.garmin.android.apps.connectmobile.R;
import dv0.t;
import e23.l;
import gl1.y;
import l72.p2;
import mx.h;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(int i14, int i15, e23.a aVar, m mVar, boolean z14) {
        boolean z15;
        int i16;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1004099587);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = (o0VarE.h(z15) ? 4 : 2) | i14;
        }
        int i18 = i16 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            boolean z16 = i17 != 0 ? true : z15;
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.add_a_pacepro_strategy);
            b.f142874a.getClass();
            p2.f111205a.g(strQ, null, null, b.f142876c, b.f142877d, z16, false, aVar, o0VarE, ((i18 << 15) & 458752) | 27648 | ((i18 << 21) & 234881024), 198);
            z15 = z16;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(i14, i15, aVar, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    public static final void b(e eVar, l lVar, l lVar2, m mVar, int i14) {
        o0 o0Var;
        eVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(364297379);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String str = eVar.f142882b;
            String strP = y.P(R.string.string_space_bullet_string_pattern, new Object[]{eVar.f142883c, y.P(R.string.pace_pro_time_pace_format, new Object[]{eVar.f142885e, eVar.f142887g}, o0VarE)}, o0VarE);
            String strP2 = y.P(R.string.string_space_bullet_string_pattern, new Object[]{eVar.f142884d, y.P(R.string.pace_pro_time_pace_format, new Object[]{eVar.f142886f, eVar.f142888h}, o0VarE)}, o0VarE);
            z3.e eVarC = null;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strP2);
            b92.a aVarB = c0235a.b();
            b.f142874a.getClass();
            z3.e eVar2 = b.f142875b;
            if (lVar != null) {
                o0VarE.C(-597658145);
                eVarC = f.c(-409441981, new oo0.f(28, lVar, eVar), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-597190045);
                o0VarE.g0(false);
            }
            o0VarE.C(-595651701);
            p2 p2Var = p2.f111205a;
            boolean z14 = ((i16 & 14) == 4) | ((i16 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new c(lVar2, eVar, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(lVar2, eVar, 1);
                    o0VarE.K(objQ);
                }
            }
            int i17 = b92.a.f16960b;
            p2Var.h(str, strP, null, null, aVarB, false, false, eVar2, eVarC, null, (e23.a) objQ, o0VarE, 12582912, 0, 620);
            o0Var = o0VarE;
            o0Var.g0(false);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(eVar, lVar, lVar2, i14, 11);
        }
    }
}
