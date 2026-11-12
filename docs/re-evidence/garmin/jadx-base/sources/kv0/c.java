package kv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        i53.f fVarM;
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1210803007);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Boolean.valueOf(s3.b());
                o0VarE.K(objQ);
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new bv0.n(dVar, 19);
                o0VarE.K(objQ2);
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            String strQ = y.Q(o0VarE, R.string.title_live_track);
            if (zBooleanValue) {
                o0VarE.C(1897786750);
                o0VarE.g0(false);
                fVarM = null;
            } else {
                o0VarE.C(-354423854);
                fVarM = gl1.d.m(o0VarE);
                o0VarE.g0(false);
            }
            i53.f fVar = fVarM;
            boolean zR2 = ((i15 & 112) == 32) | o0VarE.r(dVar) | o0VarE.r(qVarC) | o0VarE.r(context) | ((i15 & 896) == 256);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                hv0.g gVar = new hv0.g(aVar, aVar2, qVarC, context, dVar, 1);
                o0VarE.K(gVar);
                objQ3 = gVar;
            }
            b.f106606a.getClass();
            gl1.d.b(strQ, aVar3, false, fVar, null, (e23.l) objQ3, b.f106607b, o0VarE, ((i15 >> 6) & 112) | 1576960, 20);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hv0.f(dVar, aVar, aVar2, aVar3, i14, 3);
        }
    }
}
