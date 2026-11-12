package v30;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import sk0.k1;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    public static final void a(x30.b bVar, x30.a aVar, x30.c cVar, l<? super Integer, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        int i15 = bVar.f188569c;
        lVar.getClass();
        o0 o0VarE = mVar.E(1638590235);
        int i16 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarC = x2.c(aVar2, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            int i17 = i15 * 100;
            int i18 = (i17 / 2) + bVar.f188568b;
            boolean zK = o0VarE.k(i17);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zK) {
                objQ = new a51.c(i17, 12);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a51.c(i17, 12);
                    o0VarE.K(objQ);
                }
            }
            m82.f fVarM = gl.b.M(i18, (e23.a) objQ, o0VarE, 0, 0);
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new c(context, i15);
                o0VarE.K(objQ2);
            }
            q82.a.a(x2.f(aVar2, 1.0f), new f(fVarM, 100, (q82.c) objQ2), null, o0VarE, 6, 4);
            o0Var = o0VarE;
            m82.e.a(null, fVarM, 0, false, z3.f.c(-1230553480, new ku1.l(fVarM, bVar, aVar, cVar, lVar, 21), o0Var), o0Var, 24576, 13);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) bVar, (Object) aVar, (Object) cVar, (l) lVar, i14, 21);
        }
    }
}
