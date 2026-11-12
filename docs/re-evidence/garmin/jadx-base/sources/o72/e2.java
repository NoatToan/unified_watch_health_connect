package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes9.dex */
public final class e2 {
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-590839755);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p0.f130517a.getClass();
            l72.r1.b("Header", p0.f130518b, o0VarE, 54, 0);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new f(context, 4);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(context, 4);
                    o0VarE.K(objQ);
                }
            }
            l72.r1.c("Header", "Edit", (e23.a) objQ, false, null, p0.f130519c, o0VarE, 196662, 24);
            l72.r1.d("Header", false, null, z3.f.c(-208391478, new br2.a(context, 13), o0VarE), p0.f130520d, o0VarE, 27654, 6);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 6);
        }
    }
}
