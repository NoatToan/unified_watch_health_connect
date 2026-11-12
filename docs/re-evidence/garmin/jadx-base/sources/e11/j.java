package e11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import l72.c1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f11.a aVar, v21.e eVar, e01.a aVar2, fe feVar, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        v21.e eVar2;
        e01.a aVar3;
        v21.e eVar3;
        int i16;
        e01.a aVar4;
        f11.a aVar5 = aVar;
        aVar5.getClass();
        feVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1708846987);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar5) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(feVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar6 = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar6.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                }
                eVar3 = (v21.e) objQ;
                Object objQ2 = o0VarE.q();
                aVar6.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = (e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null);
                    o0VarE.K(objQ2);
                }
                i16 = i15 & (-1009);
                aVar4 = (e01.a) objQ2;
            } else {
                o0VarE.e();
                i16 = i15 & (-1009);
                eVar3 = eVar;
                aVar4 = aVar2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            d11.a aVar7 = (d11.a) p0.c(aVar5.f67885e, o0VarE, 0).getF182175a();
            i53.c cVar = (i53.c) p0.c(aVar5.f67887g, o0VarE, 0).getF182175a();
            f11.a.c cVar2 = (f11.a.c) p0.c(aVar5.f67889i, o0VarE, 0).getF182175a();
            Object objQ3 = o0VarE.q();
            aVar6.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var3 = (p1) objQ5;
            int i18 = i16;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var4 = (p1) objQ6;
            v21.e eVar4 = eVar3;
            int i19 = i18 & 57344;
            boolean zK = o0VarE.k(cVar2.ordinal()) | (i19 == 16384) | o0VarE.r(aVar5);
            Object objQ7 = o0VarE.q();
            if (zK || objQ7 == c2565a2) {
                objQ7 = new i(cVar2, lVar, aVar5, null);
                o0VarE.K(objQ7);
            }
            l0.e((e23.p) objQ7, cVar2, o0VarE);
            boolean z14 = cVar2 == f11.a.c.LOADING;
            z3.e eVarC = z3.f.c(793735142, new c50.f(aVar5, 28, context, p1Var4), o0VarE);
            z3.e eVarC2 = z3.f.c(622895685, new ak0.o(feVar, 3), o0VarE);
            n0 n0Var = n3.f22788a;
            n0 n0Var2 = new n0(0, 0, 0, 0);
            dd1.d dVar = new dd1.d(aVar7, aVar5, cVar, eVar4, p1Var, p1Var2, p1Var3, aVar4);
            aVar5 = aVar5;
            z02.d.a(z14, eVarC, eVarC2, null, n0Var2, z3.f.c(110377314, dVar, o0VarE), o0VarE, 197040, 8);
            r1.c0.e(cVar2 == f11.a.c.ERROR, null, null, null, null, z3.f.c(-1673792413, new a71.n(aVar5, 26), o0VarE), o0VarE, 196608, 30);
            r1.c0.e(cVar2 == f11.a.c.LOAD_FAILED, null, null, null, null, z3.f.c(-1889822694, new aa2.f(29, aVar5, lVar), o0VarE), o0VarE, 196608, 30);
            o0VarE = o0VarE;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(31992609);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.message_common_confirm_leaving_screen);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_yes);
                String strQ3 = gl1.y.Q(o0VarE, R.string.common_cancel);
                boolean zR = (i19 == 16384) | o0VarE.r(aVar5);
                Object objQ8 = o0VarE.q();
                if (zR || objQ8 == c2565a2) {
                    objQ8 = new cw1.g0(lVar, aVar5, p1Var4, 6);
                    o0VarE.K(objQ8);
                }
                e23.a<Unit> aVar8 = (e23.a) objQ8;
                Object objQ9 = o0VarE.q();
                if (objQ9 == c2565a2) {
                    objQ9 = new dv0.f(p1Var4, 9);
                    o0VarE.K(objQ9);
                }
                c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar8, strQ3, (e23.a) objQ9, o0VarE, 0, 6, 221);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(32419479);
                o0VarE.g0(false);
            }
            eVar2 = eVar4;
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            eVar2 = eVar;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(aVar5, eVar2, aVar3, feVar, lVar, i14, 13);
        }
    }
}
