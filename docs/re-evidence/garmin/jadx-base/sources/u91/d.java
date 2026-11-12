package u91;

import b82.u0;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.m1;
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
import p5.v;
import s5.x0;
import s70.r0;
import u1.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0245  */
    /* JADX WARN: Code duplicated, block: B:80:0x0247  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x028f  */
    /* JADX WARN: Code duplicated, block: B:91:0x029b  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f7  */
    public static final void a(u4.d dVar, String str, String str2, String str3, String str4, String str5, m mVar, int i14, int i15) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j92.b bVar;
        j92.e eVar;
        Object objQ;
        m.a.C2565a c2565a;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        b0 b0Var;
        h4.g.a aVar;
        int i16;
        j92.f fVar2;
        boolean z14;
        Object objQ2;
        boolean z15;
        Object objQ3;
        boolean z16;
        dVar.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        o0 o0VarE = mVar.E(494421577);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.B(str4) ? 16384 : 8192);
        if ((i15 & 32) != 0) {
            i17 |= 196608;
        } else if ((i14 & 196608) == 0) {
            i17 |= o0VarE.B(null) ? 131072 : 65536;
        }
        int i18 = i17 | (o0VarE.B(str5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.f(aVar2, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                r rVarC3 = u.f22885a.c(aVar2, h4.d.a.f81528f);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                r rVarA = c2.l.A(rVarC3, 0.0f, eVar.f97921f, 1);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new y1(7);
                    o0VarE.K(objQ);
                }
                r rVarC4 = v.c((e23.l) objQ, rVarA, true);
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f14 = eVar.f97918c;
                jVar.getClass();
                zVarA = y.a(c2.j.i(f14), h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0Var = b0.f22601a;
                gl.c.f77766a.getClass();
                long jI = gl.c.a(o0VarE).i();
                bVar.getClass();
                r rVarQ = x2.q(aVar2, j92.b.f97901d.f97907f);
                aVar = h4.d.a.f81537o;
                i7.b(dVar, str, b0Var.b(rVarQ, aVar), jI, o0VarE, i18 & 126, 0);
                d6.h.f57752b.getClass();
                i16 = d6.h.f57755e;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97928e, o0VarE);
                r rVarB = b0Var.b(aVar2, aVar);
                if ((i18 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = o0VarE.q();
                if (z14 || objQ2 == c2565a) {
                    objQ2 = new r0(str3, 29);
                    o0VarE.K(objQ2);
                }
                mh.c(str2, v.c((e23.l) objQ2, rVarB, false), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i18 >> 6) & 14, 0, 130044);
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                r rVarB2 = b0Var.b(aVar2, aVar);
                if ((458752 & i18) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ3 = o0VarE.q();
                if (!z15 || objQ3 == c2565a) {
                    z16 = false;
                    objQ3 = new c(null, 0);
                    o0VarE.K(objQ3);
                } else {
                    z16 = false;
                }
                mh.c(str4, v.c((e23.l) objQ3, rVarB2, z16), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i18 >> 12) & 14, 0, 130044);
                o0VarE = o0VarE;
                if (str5 == null) {
                    o0VarE.C(1853802369);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1853802370);
                    fVar2.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                    r rVarB3 = b0Var.b(aVar2, aVar);
                    bVar.getClass();
                    mh.c(str5, c2.l.C(rVarB3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            r rVarC5 = u.f22885a.c(aVar2, h4.d.a.f81528f);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            r rVarA2 = c2.l.A(rVarC5, 0.0f, eVar.f97921f, 1);
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new y1(7);
                o0VarE.K(objQ);
            }
            r rVarC6 = v.c((e23.l) objQ, rVarA2, true);
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            jVar2.getClass();
            zVarA = y.a(c2.j.i(f15), h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0Var = b0.f22601a;
            gl.c.f77766a.getClass();
            long jI2 = gl.c.a(o0VarE).i();
            bVar.getClass();
            r rVarQ2 = x2.q(aVar2, j92.b.f97901d.f97907f);
            aVar = h4.d.a.f81537o;
            i7.b(dVar, str, b0Var.b(rVarQ2, aVar), jI2, o0VarE, i18 & 126, 0);
            d6.h.f57752b.getClass();
            i16 = d6.h.f57755e;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB3 = d92.c.b(j92.f.f97928e, o0VarE);
            r rVarB4 = b0Var.b(aVar2, aVar);
            if ((i18 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new r0(str3, 29);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new r0(str3, 29);
                o0VarE.K(objQ2);
            }
            mh.c(str2, v.c((e23.l) objQ2, rVarB4, false), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, (i18 >> 6) & 14, 0, 130044);
            fVar2.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
            r rVarB5 = b0Var.b(aVar2, aVar);
            if ((458752 & i18) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ3 = o0VarE.q();
            if (z15) {
                z16 = false;
                objQ3 = new c(null, 0);
                o0VarE.K(objQ3);
            } else {
                z16 = false;
                objQ3 = new c(null, 0);
                o0VarE.K(objQ3);
            }
            mh.c(str4, v.c((e23.l) objQ3, rVarB5, z16), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, (i18 >> 12) & 14, 0, 130044);
            o0VarE = o0VarE;
            if (str5 == null) {
                o0VarE.C(1853802369);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1853802370);
                fVar2.getClass();
                x0 x0VarB4 = d92.c.b(j92.f.f97931h, o0VarE);
                r rVarB6 = b0Var.b(aVar2, aVar);
                bVar.getClass();
                mh.c(str5, c2.l.C(rVarB6, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(dVar, str, str2, str3, str4, str5, i14, i15, 14);
        }
    }
}
