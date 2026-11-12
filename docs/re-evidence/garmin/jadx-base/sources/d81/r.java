package d81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.t1;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    public static final void a(g81.c0 c0Var, o82.a aVar, int i14, int i15, e23.l lVar, e23.l lVar2, e23.a aVar2, p3.m mVar, int i16) {
        o0 o0Var;
        boolean z14;
        h2.b bVar;
        o0 o0VarE = mVar.E(-37777601);
        int i17 = i16 | (o0VarE.r(c0Var) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            boolean zR = o0VarE.r(c0Var);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new m(c0Var, 0);
                o0VarE.K(objQ2);
            }
            h2.b bVarB = h2.o0.b(i14, (e23.a) objQ2, o0VarE, (i17 >> 6) & 14, 2);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            float f15 = eVar.f97920e;
            h4.r rVarC2 = c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13);
            bVar3.getClass();
            h4.r rVarB = b0Var2.b(c2.l.A(rVarC2, f15, 0.0f, 2), h4.d.a.f81537o);
            bVar3.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            boolean zR2 = o0VarE.r(c0Var) | o0VarE.r(b0Var) | o0VarE.B(bVarB) | o0VarE.B(cVar) | ((57344 & i17) == 16384);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                z14 = true;
                n nVar = new n(c0Var, b0Var, bVarB, cVar, lVar, 0);
                bVar = bVarB;
                o0VarE.K(nVar);
                objQ3 = nVar;
            } else {
                bVar = bVarB;
                z14 = true;
            }
            boolean z15 = z14;
            e2.c.c(rVarB, null, null, iVarI, null, null, false, null, (e23.l) objQ3, o0VarE, 0, 494);
            h2.b bVar4 = bVar;
            h2.u.a(bVar4, x2.f(aVar3, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-730081098, new o(c0Var, aVar, i15, context, lVar2, aVar2, 0), o0VarE), o0VarE, 100663344, 24576, 16124);
            o0Var = o0VarE;
            Integer numValueOf = Integer.valueOf(i14);
            boolean zB = o0Var.B(bVar4) | ((i17 & 896) == 256 ? z15 : false);
            Object objQ4 = o0Var.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new q(bVar4, i14, null);
                o0Var.K(objQ4);
            }
            l0.e((e23.p) objQ4, numValueOf, o0Var);
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(c0Var, aVar, i14, i15, lVar, lVar2, aVar2, i16, 0);
        }
    }

    public static final void b(o82.a aVar, i81.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1780912457);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            u82.e.b(aVar, aVar2.f92262l, null, false, z3.f.c(-1654135319, new k(aVar2, aVar, aVar3, 0), o0VarE), o0VarE, (i15 & 14) | 24576, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(aVar, aVar2, aVar3, i14, 0);
        }
    }
}
