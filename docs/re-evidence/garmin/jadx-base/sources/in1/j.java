package in1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv1.v;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import i3.tb;
import l72.d1;
import l72.x0;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0229  */
    /* JADX WARN: Code duplicated, block: B:81:0x023a  */
    /* JADX WARN: Code duplicated, block: B:83:0x023f  */
    /* JADX WARN: Code duplicated, block: B:86:0x024a  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, rl1.h hVar, boolean z14, boolean z15, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        p2 p2VarI0;
        boolean z25;
        boolean z26;
        h4.r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        float f14;
        float f15;
        float f16;
        int i17;
        float f17;
        float f18;
        boolean z27;
        boolean z28;
        i53.f fVarA;
        boolean z29;
        boolean z34;
        boolean z35 = hVar.f153420f;
        o0 o0VarE = mVar.E(-2140958691);
        int i18 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(hVar) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i16 = i18 | 384;
            z16 = z14;
        } else {
            z16 = z14;
            i16 = i18 | (o0VarE.h(z16) ? 256 : 128);
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                z17 = z15;
                i16 |= o0VarE.h(z17) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i24 != 0) {
                    z26 = false;
                } else {
                    z26 = z17;
                }
                x1 x1Var = p3.n.f135158a;
                aVar = h4.r.S;
                h4.r rVarThen = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a).then(rVar);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                f14 = hVar.f153419e;
                f15 = (hVar.f153415a * 100.0f) / f14;
                f16 = (hVar.f153416b * 100.0f) / f14;
                i17 = hVar.f153417c;
                if (i17 > 0) {
                    f17 = (i17 * 100.0f) / f14;
                } else {
                    f17 = 0.0f;
                }
                f18 = (hVar.f153418d * 100.0f) / f14;
                if (f15 <= 0.0f || f16 > 0.0f || f17 > 0.0f || f18 > 0.0f) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (z35) {
                    o0VarE.C(1622257138);
                    gl.c.f77766a.getClass();
                    fVarA = i53.a.a(new z72.l(100.0f, gl.c.a(o0VarE).c(), null));
                    z28 = false;
                    o0VarE.g0(false);
                } else if (z27) {
                    o0VarE.C(-1249495005);
                    gl.c.f77766a.getClass();
                    fVarA = i53.a.a(new z72.l(f15, gl.c.a(o0VarE).b(), null), new z72.l(f16, gl.c.a(o0VarE).c(), null), new z72.l(f17, gl.c.a(o0VarE).p(), null), new z72.l(f18, gl.c.a(o0VarE).q(), null));
                    z28 = false;
                    o0VarE.g0(false);
                } else {
                    z28 = false;
                    o0VarE.C(1622277874);
                    fVarA = i53.a.a(new z72.l(100.0f, ds.e0.w(o0VarE), null));
                    o0VarE.g0(false);
                }
                float f19 = 185;
                g6.f.a aVar3 = g6.f.f75994b;
                boolean z36 = z26;
                z29 = z28;
                z72.k.c(b0Var.b(x2.h(x2.u(aVar, f19), f19), h4.d.a.f81537o), fVarA, null, null, 10, z35 == 0 ? 2.0f : 0.0f, z3.f.c(1855093493, new tb(hVar, z26, 1), o0VarE), o0VarE, 12779520, 28);
                if (z35) {
                    z34 = z25;
                    o0VarE.C(-1246912209);
                    o0VarE.g0(z29);
                } else {
                    o0VarE.C(-1247049632);
                    c2.l.f(x2.h(aVar, 8), o0VarE);
                    z34 = z25;
                    b(hVar, z34, o0VarE, (i16 >> 3) & 126);
                    o0VarE.g0(z29);
                }
                o0VarE.g0(true);
                z24 = z36;
                z19 = z34;
            } else {
                o0VarE.e();
                z19 = z16;
                z24 = z17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d1(rVar, hVar, z19, z24, i14, i15);
            }
        }
        i16 |= 3072;
        z17 = z15;
        if ((i16 & 1171) != 1170) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i16 & 1, z18)) {
            if (i19 != 0) {
                z25 = false;
            } else {
                z25 = z16;
            }
            if (i24 != 0) {
                z26 = false;
            } else {
                z26 = z17;
            }
            x1 x1Var2 = p3.n.f135158a;
            aVar = h4.r.S;
            h4.r rVarThen2 = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a).then(rVar);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            f14 = hVar.f153419e;
            f15 = (hVar.f153415a * 100.0f) / f14;
            f16 = (hVar.f153416b * 100.0f) / f14;
            i17 = hVar.f153417c;
            if (i17 > 0) {
                f17 = (i17 * 100.0f) / f14;
            } else {
                f17 = 0.0f;
            }
            f18 = (hVar.f153418d * 100.0f) / f14;
            if (f15 <= 0.0f) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (z35) {
                o0VarE.C(1622257138);
                gl.c.f77766a.getClass();
                fVarA = i53.a.a(new z72.l(100.0f, gl.c.a(o0VarE).c(), null));
                z28 = false;
                o0VarE.g0(false);
            } else if (z27) {
                o0VarE.C(-1249495005);
                gl.c.f77766a.getClass();
                fVarA = i53.a.a(new z72.l(f15, gl.c.a(o0VarE).b(), null), new z72.l(f16, gl.c.a(o0VarE).c(), null), new z72.l(f17, gl.c.a(o0VarE).p(), null), new z72.l(f18, gl.c.a(o0VarE).q(), null));
                z28 = false;
                o0VarE.g0(false);
            } else {
                z28 = false;
                o0VarE.C(1622277874);
                fVarA = i53.a.a(new z72.l(100.0f, ds.e0.w(o0VarE), null));
                o0VarE.g0(false);
            }
            float f110 = 185;
            g6.f.a aVar4 = g6.f.f75994b;
            boolean z37 = z26;
            z29 = z28;
            z72.k.c(b0Var2.b(x2.h(x2.u(aVar, f110), f110), h4.d.a.f81537o), fVarA, null, null, 10, z35 == 0 ? 2.0f : 0.0f, z3.f.c(1855093493, new tb(hVar, z26, 1), o0VarE), o0VarE, 12779520, 28);
            if (z35) {
                o0VarE.C(-1247049632);
                c2.l.f(x2.h(aVar, 8), o0VarE);
                z34 = z25;
                b(hVar, z34, o0VarE, (i16 >> 3) & 126);
                o0VarE.g0(z29);
            } else {
                z34 = z25;
                o0VarE.C(-1246912209);
                o0VarE.g0(z29);
            }
            o0VarE.g0(true);
            z24 = z37;
            z19 = z34;
        } else {
            o0VarE.e();
            z19 = z16;
            z24 = z17;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d1(rVar, hVar, z19, z24, i14, i15);
        }
    }

    public static final void b(rl1.h hVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        rl1.h hVar2;
        boolean z15;
        o0 o0VarE = mVar.E(1201918987);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b10.c cVar = new b10.c(a0.s(o0VarE));
            x0 x0Var = x0.f111346a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(aVar, f14);
            z3.e eVarC = z3.f.c(-866443676, new gw1.e(cVar, 13, context, hVar), o0VarE);
            int i16 = (x0.f111348c << 6) | 54;
            x0Var.e(rVarY, eVarC, o0VarE, i16, 0);
            hVar2 = hVar;
            z15 = z14;
            x0Var.e(c2.l.y(aVar, f14), z3.f.c(1026072027, new h21.m(z14, cVar, context, hVar2, 2), o0VarE), o0VarE, i16, 0);
        } else {
            hVar2 = hVar;
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(hVar2, z15, i14, 5);
        }
    }
}
