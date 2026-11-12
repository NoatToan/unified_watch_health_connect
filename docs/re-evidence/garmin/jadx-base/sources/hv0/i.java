package hv0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import kd0.e1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        p2 p2VarI0;
        f fVar;
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-817380686);
        int i15 = (o0VarE.r(aVar3) ? 2048 : 1024) | i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            if (activity == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    fVar = new f(dVar, aVar, aVar2, aVar3, i14, 0);
                }
            } else {
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = Boolean.valueOf(s3.b());
                    o0VarE.K(objQ);
                }
                boolean zBooleanValue = ((Boolean) objQ).booleanValue();
                g.h hVar = new g.h();
                boolean zR = o0VarE.r(dVar);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new bv0.n(dVar, 9);
                    o0VarE.K(objQ2);
                }
                q qVarC = w.c(hVar, (l) objQ2, o0VarE, 0);
                i53.f fVarM = null;
                e1 f104144a = ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).getF104144a();
                String strQ = y.Q(o0VarE, R.string.title_live_track);
                if (zBooleanValue) {
                    o0VarE.C(1877442635);
                } else {
                    o0VarE.C(476203877);
                    fVarM = gl1.d.m(o0VarE);
                }
                o0VarE.g0(false);
                boolean zR2 = o0VarE.r(dVar) | o0VarE.r(qVarC) | o0VarE.r(context) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
                Object objQ3 = o0VarE.q();
                if (zR2 || objQ3 == c2565a) {
                    g gVar = new g(aVar, aVar2, qVarC, context, dVar, 0);
                    o0VarE.K(gVar);
                    objQ3 = gVar;
                }
                gl1.d.b(strQ, aVar3, false, fVarM, null, (l) objQ3, z3.f.c(341030464, new d(1, f104144a, activity), o0VarE), o0VarE, ((i15 >> 6) & 112) | 1576960, 20);
            }
            p2VarI0.f135219d = fVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            fVar = new f(dVar, aVar, aVar2, aVar3, i14, 1);
            p2VarI0.f135219d = fVar;
        }
    }
}
