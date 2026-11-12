package t21;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 {
    public static final void a(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-751995577);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f(14);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Intent intentB = ConsentActivity.a.b(ConsentActivity.f32155r, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), q92.x.DI_CONNECT_UPLOAD, false, null, 24);
            g.h hVar = new g.h();
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new d52.m(aVar, aVar2, 5);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            Unit unit = Unit.INSTANCE;
            boolean zB = o0VarE.B(p1Var) | o0VarE.r(qVarC) | o0VarE.r(intentB);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new e1(qVarC, intentB, p1Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 12);
        }
    }
}
