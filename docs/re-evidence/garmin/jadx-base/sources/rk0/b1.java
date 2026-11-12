package rk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {
    public static final void a(h4.r rVar, String str, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-899699265);
        int i15 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_error_occurred), str, null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, ((i15 << 3) & 896) | ((i15 << 9) & 458752), 200);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.g(rVar, str, aVar, i14, 1);
        }
    }

    public static final void b(w0 w0Var, d1 d1Var, e23.l lVar, GearActivity.w wVar, p3.m mVar, int i14) {
        w0Var.getClass();
        d1Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1493183684);
        int i15 = i14 | (o0VarE.r(w0Var) ? 4 : 2) | (o0VarE.r(d1Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(wVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c(w0Var, d1Var, lVar, wVar, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z0(w0Var, d1Var, lVar, wVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(w0 w0Var, d1 d1Var, e23.l lVar, GearActivity.w wVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1502234857);
        int i15 = i14 | (o0VarE.r(w0Var) ? 4 : 2) | (o0VarE.B(d1Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(wVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(d1Var.f153090b, o0VarE);
            zc.d dVarA = zc.g.a((r53.i) s9.c.c(d1Var.f153092d, o0VarE).getF182175a(), o0VarE);
            boolean z14 = dVarA.b() < 1 && p005kotlin.jvm.internal.s.g(dVarA.d().f196385a, yc.z0.b.f196664b);
            String strT = gl1.d.T(((c1) p1VarC.getF182175a()).f153082b.f4360c, o0VarE, 0);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVarA);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new om0.f(dVarA, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new om0.f(dVarA, 1);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 0);
            c2.n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(z14, z3.f.c(1154430620, new a1(0, strT, wVar), o0VarE), null, null, new c2.n0(0, 0, 0, 0), z3.f.c(-173554016, new e11.n(z14, dVarA, p1VarC, context, d1Var, w0Var, qVarC, lVar), o0VarE), o0Var, 196656, 12);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z0(w0Var, d1Var, lVar, wVar, i14, 1);
        }
    }
}
