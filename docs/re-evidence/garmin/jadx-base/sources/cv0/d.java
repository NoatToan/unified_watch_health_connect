package cv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.p9;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import gl1.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, e23.a aVar, l lVar, gv0.d dVar, m mVar, yu0.f fVar) {
        ge2.d dVar2;
        dVar.getClass();
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(910478363);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(dVar.f79204w, o0VarE);
            p1 p1VarC2 = s9.c.c(fVar.f199712j, o0VarE);
            ge2.b.a aVar2 = ge2.b.f77011b;
            ou0.f fVar2 = (ou0.f) ((g3) p1VarC.getF182175a()).f35301b;
            i53.f fVarM = null;
            String str = (fVar2 == null || (dVar2 = fVar2.f133988f) == null) ? null : dVar2.f77021b;
            aVar2.getClass();
            ge2.b bVarA = ge2.b.a.a(str);
            if (bVarA == null) {
                bVarA = ge2.b.OnlyMe;
            }
            ev0.c cVar = (ev0.c) ((g3) p1VarC2.getF182175a()).f35301b;
            boolean zD = g22.n.d(cVar != null ? cVar.f66156e : null);
            boolean zK = o0VarE.k(bVarA.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zK) {
                objQ = p0.n(bVarA);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(bVarA);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            boolean zB = ((i15 & 896) == 256) | o0VarE.B(p1Var) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new a(lVar, aVar, p1Var, 0);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a(lVar, aVar, p1Var, 0);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ3 = o0VarE.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = Boolean.valueOf(s3.b());
                o0VarE.K(objQ3);
            }
            boolean zBooleanValue = ((Boolean) objQ3).booleanValue();
            String strQ = y.Q(o0VarE, R.string.lbl_active_sessions);
            if (zBooleanValue) {
                o0VarE.C(1343601634);
            } else {
                o0VarE.C(-1203584786);
                fVarM = gl1.d.m(o0VarE);
            }
            o0VarE.g0(false);
            boolean zR = o0VarE.r(dVar) | o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new b(context, dVar, 0);
                o0VarE.K(objQ4);
            }
            gl1.d.b(strQ, aVar4, false, null, fVarM, (l) objQ4, z3.f.c(-1531512755, new p9(bVarA, zD, p1Var, 2), o0VarE), o0VarE, 1605632, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(dVar, fVar, lVar, aVar, i14);
        }
    }
}
