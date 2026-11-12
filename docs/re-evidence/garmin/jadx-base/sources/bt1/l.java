package bt1;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.h7;
import i3.mh;
import i3.p7;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x020f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0211  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:89:0x0246  */
    /* JADX WARN: Code duplicated, block: B:91:0x0288  */
    /* JADX WARN: Code duplicated, block: B:93:0x028c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0290  */
    /* JADX WARN: Code duplicated, block: B:98:0x029e  */
    public static final void a(h4.r rVar, String str, boolean z14, i53.c<String> cVar, i53.c<String> cVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super String, Unit> lVar, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z16;
        h4.r rVar2;
        e23.a<Unit> aVar3;
        boolean z17;
        p2 p2VarI0;
        h4.r.a aVar4;
        e23.a<Unit> aVar5;
        j92.b bVar;
        j92.e eVar;
        float f14;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar6;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        boolean z18;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        h4.r.a aVar7;
        boolean z19;
        Object objQ;
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(981837995);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i29 = i14 | 6 | (o0VarE.B(str) ? 32 : 16);
        int i30 = i15 & 4;
        if (i30 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i29 |= o0VarE.h(z15) ? 256 : 128;
            }
            if (o0VarE.B(cVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            int i34 = i29 | i16;
            if (o0VarE.B(cVar2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i34 | i17;
            i19 = i15 & 32;
            if (i19 != 0) {
                i25 = i18 | 196608;
            } else {
                if (o0VarE.r(aVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i25 = i18 | i24;
            }
            if (o0VarE.r(aVar2)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            int i35 = i25 | i26;
            if (o0VarE.r(lVar)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i28 = i35 | i27;
            if ((4793491 & i28) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i28 & 1, z16)) {
                aVar4 = h4.r.S;
                if (i30 != 0) {
                    z15 = false;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r rVarE = u1.n.e(x2.f(aVar4, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f15 = eVar.f97920e;
                f14 = eVar.f97918c;
                bVar.getClass();
                h4.r rVarZ = c2.l.z(rVarE, f15, f14);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                z18 = z15;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC3, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                d92.b.f58624b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i28 >> 3) & 14, 0, 131070);
                if (z18) {
                    o0VarE.C(-1681857277);
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar4, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                    aVar7 = aVar4;
                    bVar.getClass();
                    h4.r rVarQ = x2.q(rVarC4, j92.b.f97901d.f97905d);
                    if ((i28 & 458752) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objQ = o0VarE.q();
                    if (z19) {
                        objQ = new as.n(aVar5, 20);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new as.n(aVar5, 20);
                            o0VarE.K(objQ);
                        }
                    }
                    a.f21086a.getClass();
                    h7.a((e23.a) objQ, rVarQ, false, null, null, a.f21087b, o0VarE, 1572864, 60);
                    o0VarE.g0(false);
                } else {
                    aVar7 = aVar4;
                    o0VarE.C(-1681153391);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                bVar.getClass();
                t0.a(null, c2.j.i(f14), null, null, 0, 0, z3.f.c(2105671280, new a42.y(11, aVar2, cVar2, cVar, lVar), o0VarE), o0VarE, 1572864, 61);
                o0VarE.g0(true);
                z17 = z18;
                rVar2 = aVar7;
                aVar3 = aVar5;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                aVar3 = aVar;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a3.q(rVar2, str, z17, cVar, cVar2, aVar3, aVar2, lVar, i14, i15);
            }
        }
        i29 |= 384;
        z15 = z14;
        if (o0VarE.B(cVar)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i36 = i29 | i16;
        if (o0VarE.B(cVar2)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        i18 = i36 | i17;
        i19 = i15 & 32;
        if (i19 != 0) {
            i25 = i18 | 196608;
        } else {
            if (o0VarE.r(aVar)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i25 = i18 | i24;
        }
        if (o0VarE.r(aVar2)) {
            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } else {
            i26 = 524288;
        }
        int i37 = i25 | i26;
        if (o0VarE.r(lVar)) {
            i27 = 8388608;
        } else {
            i27 = 4194304;
        }
        i28 = i37 | i27;
        if ((4793491 & i28) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i28 & 1, z16)) {
            aVar4 = h4.r.S;
            if (i30 != 0) {
                z15 = false;
            }
            if (i19 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar;
            }
            x1 x1Var2 = p3.n.f135158a;
            h4.r rVarE2 = u1.n.e(x2.f(aVar4, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f16 = eVar.f97920e;
            f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ2 = c2.l.z(rVarE2, f16, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarZ2, o0VarE);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            z18 = z15;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            bVar.getClass();
            h4.r rVarC5 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC5, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i28 >> 3) & 14, 0, 131070);
            if (z18) {
                o0VarE.C(-1681857277);
                bVar.getClass();
                h4.r rVarC6 = c2.l.C(aVar4, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                aVar7 = aVar4;
                bVar.getClass();
                h4.r rVarQ2 = x2.q(rVarC6, j92.b.f97901d.f97905d);
                if ((i28 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ = o0VarE.q();
                if (z19) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new as.n(aVar5, 20);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new as.n(aVar5, 20);
                    o0VarE.K(objQ);
                }
                a.f21086a.getClass();
                h7.a((e23.a) objQ, rVarQ2, false, null, null, a.f21087b, o0VarE, 1572864, 60);
                o0VarE.g0(false);
            } else {
                aVar7 = aVar4;
                o0VarE.C(-1681153391);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar.getClass();
            t0.a(null, c2.j.i(f14), null, null, 0, 0, z3.f.c(2105671280, new a42.y(11, aVar2, cVar2, cVar, lVar), o0VarE), o0VarE, 1572864, 61);
            o0VarE.g0(true);
            z17 = z18;
            rVar2 = aVar7;
            aVar3 = aVar5;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            aVar3 = aVar;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.q(rVar2, str, z17, cVar, cVar2, aVar3, aVar2, lVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x0250  */
    /* JADX WARN: Code duplicated, block: B:74:0x0257  */
    /* JADX WARN: Code duplicated, block: B:76:0x025f  */
    /* JADX WARN: Code duplicated, block: B:81:0x027d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0314  */
    /* JADX WARN: Code duplicated, block: B:87:0x0318  */
    public static final void b(h4.r rVar, String str, String str2, p1 p1Var, i53.c cVar, i53.c cVar2, i53.c cVar3, e23.a aVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        h4.r rVar2;
        h4.r rVar3;
        h4.r rVar4;
        h5.g.a.f fVar;
        h4.r.a aVar2;
        h4.g.b bVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        j92.f fVar2;
        h4.r rVar5;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        str.getClass();
        str2.getClass();
        p1Var.getClass();
        cVar.getClass();
        cVar3.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(446622712);
        p3.c<?> cVar4 = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | 24576 | (o0VarE.B(cVar) ? 131072 : 65536) | (o0VarE.B(cVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(cVar3) ? 8388608 : 4194304) | 100663296 | (o0VarE.r(aVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && ((6 | (o0VarE.r(lVar2) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
            } else {
                o0VarE.e();
                rVar3 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(rVar3, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, f15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar4 == null) {
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
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                rVar4 = rVar3;
            } else {
                rVar4 = rVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar2 = h4.r.S;
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                bVar = h4.d.a.f81534l;
                s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar4 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                rVar5 = rVar4;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
                o0VarE.C(1225472932);
                o0VarE.g0(false);
                o0VarE.g0(true);
                bVar2.getClass();
                h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97920e, 1);
                bVar2.getClass();
                s2VarA2 = q2.a(c2.j.i(f15), bVar, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA, o0VarE);
                if (cVar4 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(1403696711, new k(p1Var, lVar, 0), o0VarE), o0VarE, 56);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                bVar2.getClass();
                t0.a(null, c2.j.i(f15), null, null, 0, 0, z3.f.c(-1552051843, new ak0.j((Object) cVar3, aVar, (Object) cVar, (Object) cVar2, (o13.h) lVar2, 9), o0VarE), o0VarE, 1572864, 61);
                o0VarE.g0(true);
                rVar2 = rVar5;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar2 = h4.r.S;
            bVar2.getClass();
            h4.r rVarC5 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            bVar = h4.d.a.f81534l;
            s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC5, o0VarE);
            if (cVar4 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            rVar5 = rVar4;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0VarE.C(1225472932);
            o0VarE.g0(false);
            o0VarE.g0(true);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar2, 0.0f, eVar.f97920e, 1);
            bVar2.getClass();
            s2VarA2 = q2.a(c2.j.i(f15), bVar, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA2, o0VarE);
            if (cVar4 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            y3 y3Var2 = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(1403696711, new k(p1Var, lVar, 0), o0VarE), o0VarE, 56);
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            bVar2.getClass();
            t0.a(null, c2.j.i(f15), null, null, 0, 0, z3.f.c(-1552051843, new ak0.j((Object) cVar3, aVar, (Object) cVar, (Object) cVar2, (o13.h) lVar2, 9), o0VarE), o0VarE, 1572864, 61);
            o0VarE.g0(true);
            rVar2 = rVar5;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(rVar2, str, str2, p1Var, cVar, cVar2, cVar3, aVar, lVar, lVar2, i14);
        }
    }
}
