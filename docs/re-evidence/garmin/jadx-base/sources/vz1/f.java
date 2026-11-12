package vz1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import o4.d0;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f180902a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f180902a = 8;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    public static final void a(d0 d0Var, i53.f fVar, int i14, z3.e eVar, p3.m mVar, int i15) {
        int i16;
        z3.e eVar2;
        String strJ;
        fVar.getClass();
        o0 o0VarE = mVar.E(-2011449354);
        int i17 = i15 | (o0VarE.B(d0Var) ? 256 : 128) | (o0VarE.B(fVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = i17 << 3;
            if (0.0f > 0.0f) {
                o0VarE.C(-1248891776);
                strJ = y.P(R.string.lbl_out_of_goal_1, new Object[]{String.valueOf((int) 0.0f), String.valueOf((int) 72.0f)}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1248734916, R.string.txt_empty_page_no_data, o0VarE, false);
            }
            i16 = i14;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarQ = x2.q(h4.r.S, i16);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarQ, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zB = o0VarE.B(strJ);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new u91.c(strJ, 13);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u91.c(strJ, 13);
                    o0VarE.K(objQ);
                }
            }
            eVar2 = eVar;
            z72.k.a(v.c((e23.l) objQ, rVarC, true), fVar, null, d0Var, null, f180902a, 0.0f, false, false, z3.f.c(-2061531222, new aa2.k(eVar2, 13), o0VarE), o0VarE, ((i17 >> 6) & 112) | 805503360 | (i18 & 7168) | 14155776, 272);
        } else {
            i16 = i14;
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(d0Var, fVar, i16, eVar2, i15);
        }
    }
}
