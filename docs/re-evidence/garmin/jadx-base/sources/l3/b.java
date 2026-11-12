package l3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    public static final void a(androidx.lifecycle.n0 n0Var, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1868327245);
        int i15 = 16;
        int i16 = (o0VarE.r(n0Var) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zR = ((i16 & 112) == 32) | o0VarE.r(n0Var) | ((i16 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k62.k(n0Var, i15, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k62.k(n0Var, i15, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.a(n0Var, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(n0Var, lVar, aVar, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    public static final d1 b(int i14, p3.m mVar, int i15) {
        boolean z14 = (i15 & 4) != 0;
        p3.x1 x1Var = p3.n.f135158a;
        Object systemService = ((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z15 = ((((i14 & 896) ^ 384) > 256 && mVar.h(z14)) || (i14 & 384) == 256) | ((((i14 & 14) ^ 6) > 4 && mVar.h(true)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.h(true)) || (i14 & 48) == 32);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (z15) {
            objQ = new d1(true, true, z14);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d1(true, true, z14);
                mVar.K(objQ);
            }
        }
        d1 d1Var = (d1) objQ;
        androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) mVar.A(s9.j.f158018a);
        boolean zB = mVar.B(d1Var) | mVar.r(obj);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new jt1.d(28, d1Var, obj);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new jt1.d(28, d1Var, obj);
                mVar.K(objQ2);
            }
        }
        e23.l lVar = (e23.l) objQ2;
        boolean zB2 = mVar.B(d1Var) | mVar.r(obj);
        Object objQ3 = mVar.q();
        if (zB2) {
            objQ3 = new k11.h(24, d1Var, obj);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new k11.h(24, d1Var, obj);
                mVar.K(objQ3);
            }
        }
        a(n0Var, lVar, (e23.a) objQ3, mVar, 0);
        return d1Var;
    }
}
