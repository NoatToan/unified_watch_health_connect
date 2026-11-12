package r42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import q42.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(d dVar, m mVar, int i14) {
        d dVar2;
        o0 o0Var;
        dVar.getClass();
        o0 o0VarE = mVar.E(750152094);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h hVar = new h(context);
            p1 p1VarC = s9.c.c(dVar.f150325c, o0VarE);
            p1 p1VarC2 = s9.c.c(dVar.f150327e, o0VarE);
            p1 p1VarC3 = s9.c.c(dVar.f150330h, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new qy0.a(18);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new qy0.a(19);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new qy0.a(20);
                o0VarE.K(objQ3);
            }
            c42.d dVar3 = new c42.d(dVar, p1Var, p1Var2, (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48), context, p1VarC3, p1VarC, hVar, p1VarC2);
            dVar2 = dVar;
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, f.c(-1078681260, dVar3, o0VarE), o0Var, 196608, 31);
        } else {
            dVar2 = dVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(dVar2, i14, 7);
        }
    }
}
