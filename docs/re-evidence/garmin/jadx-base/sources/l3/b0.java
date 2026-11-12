package l3;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ij;
import p3.b4;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final void a(p004k6.c0 c0Var, z3.e eVar, ij ijVar, h4.r rVar, boolean z14, z3.e eVar2, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        ij ijVar2 = ijVar;
        p3.o0 o0VarE = mVar.E(-1221877520);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(c0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(ijVar2) : o0VarE.r(ijVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(eVar2) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (ijVar.isVisible()) {
                o0VarE.C(-1891243071);
                b(c0Var, ijVar, b0Var, false, p1Var, eVar, o0VarE, (i16 & 14) | 196608 | ((i16 >> 3) & 112) | ((i16 >> 6) & 896) | ((i16 << 15) & 3670016));
                o0VarE = o0VarE;
                z15 = false;
                o0VarE.g0(false);
            } else {
                z15 = false;
                o0VarE.C(-1890863476);
                o0VarE.g0(false);
            }
            ijVar2 = ijVar;
            c(z14, ijVar2, p1Var, rVar, eVar2, o0VarE, ((i16 >> 18) & 14) | 384 | ((i16 >> 3) & 112) | ((i16 >> 12) & 7168) | (57344 & (i16 << 3)) | ((i16 >> 9) & 458752));
            o0VarE.g0(true);
            boolean z16 = ((i16 & 896) == 256 || ((i16 & 512) != 0 && o0VarE.r(ijVar2))) ? true : z15;
            Object objQ3 = o0VarE.q();
            if (z16 || objQ3 == c2565a) {
                objQ3 = new kp2.a(ijVar2, 6);
                o0VarE.K(objQ3);
            }
            p3.l0.a(ijVar2, (e23.l) objQ3, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(c0Var, eVar, ijVar2, rVar, z14, eVar2, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    public static final void b(p004k6.c0 c0Var, ij ijVar, o53.b0 b0Var, boolean z14, p3.p1 p1Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1413720282);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(c0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(ijVar) : o0VarE.r(ijVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(null) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(b0Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(p1Var) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            c0.f109193a.getClass();
            String strQ = gl1.y.Q(o0VarE, R.string.tooltip_description);
            boolean zR = ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(ijVar))) | ((i15 & 896) == 256) | o0VarE.r(b0Var) | ((458752 & i15) == 131072);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new kk1.a(ijVar, 6, b0Var, p1Var);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new kk1.a(ijVar, 6, b0Var, p1Var);
                    o0VarE.K(objQ);
                }
            }
            p004k6.g.a(c0Var, (e23.a) objQ, new p004k6.d0(z14, false, false, false, 14, (p005kotlin.jvm.internal.j) null), z3.f.c(-1287705660, new v(strQ, eVar), o0VarE), o0VarE, (i15 & 14) | 3072, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(c0Var, ijVar, b0Var, z14, p1Var, eVar, i14, 15);
        }
    }

    public static final void c(boolean z14, ij ijVar, p3.p1 p1Var, h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1873232064);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(ijVar) : o0VarE.r(ijVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(p1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            c0.f109193a.getClass();
            String strQ = gl1.y.Q(o0VarE, R.string.tooltip_label);
            h4.r rVarB = z14 ? b5.s0.b(b5.s0.b(rVar, ijVar, new x(ijVar)), ijVar, new y(ijVar)) : rVar;
            if (z14) {
                rVarB = rVarB.then(new j1(new k62.k(strQ, 17, b0Var, ijVar)));
            }
            if (z14) {
                rVarB = z4.f.c(m4.e.b(rVarB, new jt1.d(29, b0Var, ijVar)), new a0(ijVar, p1Var, false));
            } else {
                p1Var.setValue(Boolean.FALSE);
            }
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b71.i.n((i15 >> 15) & 14, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, ijVar, p1Var, rVar, eVar, i14, 13);
        }
    }
}
