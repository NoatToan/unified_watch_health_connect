package c02;

import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    public static final void a(r rVar, Double d14, Double d15, e23.l<? super Double, String> lVar, e23.l<? super Double, String> lVar2, String str, p3.m mVar, int i14) {
        int i15;
        i53.f fVarA;
        rVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1437113939);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarE).b();
            long jD = gl.c.a(o0VarE).d();
            boolean z14 = (d14 == null || d15 == null || d14.doubleValue() < d15.doubleValue()) ? false : true;
            int i16 = i15;
            if (d14 == null || d15 == null) {
                fVarA = i53.a.a(new z72.l(1.0f, jC, null));
            } else if (z14) {
                fVarA = i53.a.a(new z72.l(1.0f, jD, null));
            } else {
                float fDoubleValue = ((float) d14.doubleValue()) / ((float) d15.doubleValue());
                fVarA = i53.a.a(new z72.l(fDoubleValue, jB, null), new z72.l(1.0f - fDoubleValue, jC, null));
            }
            i53.f fVar = fVarA;
            boolean z15 = (i16 & 458752) == 131072;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new defpackage.b(str, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.b(str, 27);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            z72.k.c(x2.h(aVar3, yz1.y.k(o0VarE)), fVar, null, null, yz1.y.g(o0VarE), 0.0f, z3.f.c(1941411963, new aa2.f(12, lVar, d14), o0VarE), o0VarE, 12582912, 92);
            String strInvoke = lVar2.invoke(d15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC3 = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            mh.c(strInvoke, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, d14, d15, lVar, lVar2, str, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    public static final void b(r rVar, Double d14, Double d15, float f14, e23.l lVar, String str, p3.m mVar, int i14) {
        int i15;
        i53.f fVarA;
        rVar.getClass();
        lVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1919885496);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarE).b();
            long jD = gl.c.a(o0VarE).d();
            boolean z14 = (d14 == null || d15 == null || d14.doubleValue() < d15.doubleValue()) ? false : true;
            if (d14 == null || d15 == null) {
                fVarA = i53.a.a(new z72.l(1.0f, jC, null));
            } else if (z14) {
                fVarA = i53.a.a(new z72.l(1.0f, jD, null));
            } else {
                float fDoubleValue = ((float) d14.doubleValue()) / ((float) d15.doubleValue());
                fVarA = i53.a.a(new z72.l(fDoubleValue, jB, null), new z72.l(1.0f - fDoubleValue, jC, null));
            }
            boolean z15 = (i15 & 458752) == 131072;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new defpackage.b(str, 26);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.b(str, 26);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            z72.k.c(x2.d(r.S, 1.0f), fVarA, null, null, f14, 0.0f, z3.f.c(-1035746416, new bn1.d(f14, lVar, d14, 1), o0VarE), o0VarE, 12582918 | ((i15 << 6) & 458752), 92);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, d14, d15, f14, lVar, str, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    public static final void c(Double d14, Double d15, r rVar, p3.m mVar, int i14, int i15) {
        r rVar2;
        r rVarQ;
        double dDoubleValue;
        double dDoubleValue2;
        boolean z14;
        i53.f fVarA;
        o0 o0VarE = mVar.E(516952135);
        int i16 = i14 | (o0VarE.B(d14) ? 4 : 2) | (o0VarE.B(d15) ? 32 : 16) | (((i15 & 4) == 0 && o0VarE.B(rVar)) ? 256 : 128);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 4) != 0) {
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
                    i16 &= -897;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                if (d14 != null && d15 != null) {
                    dDoubleValue = d15.doubleValue();
                    dDoubleValue2 = d14.doubleValue();
                    z14 = dDoubleValue2 >= dDoubleValue;
                    if (z14) {
                        o0VarE.C(1710213714);
                        gl.c.f77766a.getClass();
                        fVarA = i53.a.a(new z72.l(1.0f, gl.c.a(o0VarE).e(), null));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1710385578);
                        float f14 = (float) (dDoubleValue2 / dDoubleValue);
                        gl.c.f77766a.getClass();
                        fVarA = i53.a.a(new z72.l(f14, gl.c.a(o0VarE).c(), null), new z72.l(1.0f - f14, gl.c.a(o0VarE).g(), null));
                        o0VarE.g0(false);
                    }
                    g6.f.a aVar2 = g6.f.f75994b;
                    z72.k.c(rVarQ, fVarA, null, null, (float) 1.5d, 0.0f, z3.f.c(-388667378, new d(z14, i17), o0VarE), o0VarE, ((i16 >> 6) & 14) | 12779520, 92);
                }
                rVar2 = rVarQ;
            } else {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
            }
            rVarQ = rVar;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            if (d14 != null) {
                dDoubleValue = d15.doubleValue();
                dDoubleValue2 = d14.doubleValue();
                if (dDoubleValue2 >= dDoubleValue) {
                }
                if (z14) {
                    o0VarE.C(1710213714);
                    gl.c.f77766a.getClass();
                    fVarA = i53.a.a(new z72.l(1.0f, gl.c.a(o0VarE).e(), null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1710385578);
                    float f15 = (float) (dDoubleValue2 / dDoubleValue);
                    gl.c.f77766a.getClass();
                    fVarA = i53.a.a(new z72.l(f15, gl.c.a(o0VarE).c(), null), new z72.l(1.0f - f15, gl.c.a(o0VarE).g(), null));
                    o0VarE.g0(false);
                }
                g6.f.a aVar3 = g6.f.f75994b;
                z72.k.c(rVarQ, fVarA, null, null, (float) 1.5d, 0.0f, z3.f.c(-388667378, new d(z14, i17), o0VarE), o0VarE, ((i16 >> 6) & 14) | 12779520, 92);
            }
            rVar2 = rVarQ;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(d14, d15, rVar2, i14, i15);
        }
    }

    public static final void d(r rVar, Double d14, Double d15, e23.l<? super Double, String> lVar, p3.m mVar, int i14) {
        i53.f fVarA;
        rVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(405266573);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.B(d15) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (d14 == null || d15 == null) {
                o0VarE.C(-1380839064);
                gl.c.f77766a.getClass();
                fVarA = i53.a.a(new z72.l(1.0f, gl.c.a(o0VarE).g(), null));
                o0VarE.g0(false);
            } else if (d14.doubleValue() >= d15.doubleValue()) {
                o0VarE.C(-1380834170);
                gl.c.f77766a.getClass();
                fVarA = i53.a.a(new z72.l(1.0f, gl.c.a(o0VarE).e(), null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(143933197);
                float fDoubleValue = (float) (d14.doubleValue() / d15.doubleValue());
                gl.c.f77766a.getClass();
                fVarA = i53.a.a(new z72.l(fDoubleValue, gl.c.a(o0VarE).c(), null), new z72.l(1.0f - fDoubleValue, gl.c.a(o0VarE).g(), null));
                o0VarE.g0(false);
            }
            i53.f fVar = fVarA;
            g6.f.a aVar = g6.f.f75994b;
            z72.k.c(rVar, fVar, null, null, 8, 0.0f, z3.f.c(-573020305, new a42.a(10, lVar, d14, d15), o0VarE), o0VarE, (i15 & 14) | 12779520, 92);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(rVar, d14, d15, lVar, i14, 25);
        }
    }

    public static final void e(r rVar, Double d14, Double d15, p3.m mVar, int i14) {
        int i15;
        i53.f fVarA;
        rVar.getClass();
        o0 o0VarE = mVar.E(561108710);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.B(d15) ? 256 : 128);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarE).b();
            long jD = gl.c.a(o0VarE).d();
            boolean z14 = (d14 == null || d15 == null || d14.doubleValue() < d15.doubleValue()) ? false : true;
            if (d14 == null || d15 == null) {
                fVarA = i53.a.a(new z72.l(1.0f, jC, null));
            } else if (z14) {
                fVarA = i53.a.a(new z72.l(1.0f, jD, null));
            } else {
                float fDoubleValue = ((float) d14.doubleValue()) / ((float) d15.doubleValue());
                fVarA = i53.a.a(new z72.l(fDoubleValue, jB, null), new z72.l(1.0f - fDoubleValue, jC, null));
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bt1.s(21);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            g6.f.a aVar2 = g6.f.f75994b;
            z72.k.c(x2.h(r.S, 36), fVarA, null, null, 3, 0.0f, z3.f.c(-1101432626, new d(z14, i17), o0VarE), o0VarE, 12779526, 92);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar, d14, d15, i14);
        }
    }
}
