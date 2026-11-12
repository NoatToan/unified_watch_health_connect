package gt1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.h0;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.d0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:102:0x0214  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    public static final void a(h4.r rVar, String str, int i14, boolean z14, boolean z15, boolean z16, e23.a<Unit> aVar, p3.m mVar, int i15, int i16) {
        h4.r rVar2;
        int i17;
        boolean z17;
        int i18;
        int i19;
        boolean z18;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z19;
        o0 o0Var;
        boolean z24;
        h4.r rVar3;
        boolean z25;
        boolean z26;
        p2 p2VarI0;
        h4.r rVar4;
        boolean z27;
        boolean z28;
        boolean z29;
        float f14;
        long jC;
        long j8;
        boolean z34;
        Object objQ;
        boolean z35;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        u2 u2Var;
        boolean z36;
        long j14;
        o0 o0Var2;
        float f15;
        o0 o0VarL = vb.h.l(1404686308, aVar, str, mVar);
        int i28 = i16 & 1;
        if (i28 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = (o0VarL.B(rVar2) ? 4 : 2) | i15;
        }
        int i29 = i17 | (o0VarL.B(str) ? 32 : 16) | (o0VarL.k(i14) ? 256 : 128);
        int i30 = i16 & 8;
        if (i30 != 0) {
            i18 = i29 | 3072;
            z17 = z14;
        } else {
            z17 = z14;
            i18 = i29 | (o0VarL.h(z17) ? 2048 : 1024);
        }
        int i34 = i16 & 16;
        if (i34 == 0) {
            if ((i15 & 24576) == 0) {
                i18 |= o0VarL.h(z15) ? 16384 : 8192;
            }
            i19 = i16 & 32;
            if (i19 != 0) {
                i25 = i18 | 196608;
                z18 = z16;
            } else {
                z18 = z16;
                if (o0VarL.h(z18)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i25 = i18 | i24;
            }
            if (o0VarL.r(aVar)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i27 = i26 | i25;
            if ((599187 & i27) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (o0VarL.n(i27 & 1, z19)) {
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i30 != 0) {
                    z27 = false;
                } else {
                    z27 = z17;
                }
                if (i34 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if (i19 != 0) {
                    z29 = true;
                } else {
                    z29 = z18;
                }
                x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jE = d92.b.a(o0VarL).e().e();
                if (z29) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.8f;
                }
                jC = d0.c(f14, jE, 14);
                if (z28) {
                    long j15 = zl.a.b(o0VarL, 1283823371, o0VarL).f63508c;
                    if (z29) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.8f;
                    }
                    long jC2 = d0.c(f15, j15, 14);
                    o0VarL.g0(false);
                    j8 = jC2;
                } else {
                    o0VarL.C(1283824777);
                    o0VarL.g0(false);
                    j8 = jC;
                }
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarH = x2.h(rVar4, 40);
                if ((3670016 & i27) == 1048576) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objQ = o0VarL.q();
                if (z34) {
                    objQ = new h0(aVar, 23);
                    o0VarL.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(aVar, 23);
                        o0VarL.K(objQ);
                    }
                }
                h4.r rVarD = u1.w.d(rVarH, z29, null, null, (e23.a) objQ, 14);
                z35 = z29;
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.d dVar = j92.b.f97900c;
                h4.r rVarB = u1.q.b(1, jC, rVarD, k2.i.a(dVar.f97910b));
                bVar2.getClass();
                h4.r rVarE = wz1.i.e(l4.k.b(rVarB, k2.i.a(dVar.f97910b)), z28, new aa2.e(jC, 2), o0VarL, (i27 >> 9) & 112);
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f16 = eVar.f97918c;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, f16);
                c2.j jVar = c2.j.f22691a;
                bVar2.getClass();
                float f17 = eVar.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f17);
                h4.d.f81522a.getClass();
                s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarL, 0);
                iHashCode = Long.hashCode(o0VarL.U);
                i2VarA0 = o0VarL.a0();
                rVarC = h4.k.c(rVarZ, o0VarL);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarL.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarL.z();
                if (o0VarL.T) {
                    o0VarL.M(aVar2);
                } else {
                    o0VarL.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
                bVar = h5.g.a.f81813j;
                if (o0VarL.T || !p005kotlin.jvm.internal.s.g(o0VarL.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarL);
                u2Var = u2.f22900a;
                if (z27) {
                    o0VarL.C(-246974555);
                    o0Var2 = o0VarL;
                    z36 = z28;
                    zd0.e.c(0.0f, 0, 14, 0L, u2Var.c(h4.r.S, h4.d.a.f81534l), o0Var2);
                    o0Var2.g0(false);
                    j14 = j8;
                } else {
                    z36 = z28;
                    o0VarL.C(-246824887);
                    j14 = j8;
                    i7.a(n5.c.a(i14, o0VarL, (i27 >> 6) & 14), null, x2.q(u2Var.c(h4.r.S, h4.d.a.f81534l), 20), j14, o0VarL, 48, 0);
                    o0Var2 = o0VarL;
                    o0Var2.g0(false);
                }
                h4.r rVarC2 = u2Var.c(h4.r.S, h4.d.a.f81534l);
                d92.b.f58624b.getClass();
                h4.r rVar5 = rVar4;
                o0 o0Var3 = o0Var2;
                mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97938o, j14, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var3, (i27 >> 3) & 14, 0, 131068);
                o0Var = o0Var3;
                o0Var.g0(true);
                z25 = z27;
                rVar3 = rVar5;
                z26 = z35;
                z24 = z36;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                z24 = z15;
                rVar3 = rVar2;
                z25 = z17;
                z26 = z18;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(rVar3, str, i14, z25, z24, z26, aVar, i15, i16);
            }
        }
        i18 |= 24576;
        i19 = i16 & 32;
        if (i19 != 0) {
            i25 = i18 | 196608;
            z18 = z16;
        } else {
            z18 = z16;
            if (o0VarL.h(z18)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i25 = i18 | i24;
        }
        if (o0VarL.r(aVar)) {
            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } else {
            i26 = 524288;
        }
        i27 = i26 | i25;
        if ((599187 & i27) != 599186) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (o0VarL.n(i27 & 1, z19)) {
            if (i28 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i30 != 0) {
                z27 = false;
            } else {
                z27 = z17;
            }
            if (i34 != 0) {
                z28 = false;
            } else {
                z28 = z15;
            }
            if (i19 != 0) {
                z29 = true;
            } else {
                z29 = z18;
            }
            x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jE2 = d92.b.a(o0VarL).e().e();
            if (z29) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            jC = d0.c(f14, jE2, 14);
            if (z28) {
                long j16 = zl.a.b(o0VarL, 1283823371, o0VarL).f63508c;
                if (z29) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.8f;
                }
                long jC3 = d0.c(f15, j16, 14);
                o0VarL.g0(false);
                j8 = jC3;
            } else {
                o0VarL.C(1283824777);
                o0VarL.g0(false);
                j8 = jC;
            }
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarH2 = x2.h(rVar4, 40);
            if ((3670016 & i27) == 1048576) {
                z34 = true;
            } else {
                z34 = false;
            }
            objQ = o0VarL.q();
            if (z34) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(aVar, 23);
                    o0VarL.K(objQ);
                }
            } else {
                objQ = new h0(aVar, 23);
                o0VarL.K(objQ);
            }
            h4.r rVarD2 = u1.w.d(rVarH2, z29, null, null, (e23.a) objQ, 14);
            z35 = z29;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.d dVar2 = j92.b.f97900c;
            h4.r rVarB2 = u1.q.b(1, jC, rVarD2, k2.i.a(dVar2.f97910b));
            bVar3.getClass();
            h4.r rVarE2 = wz1.i.e(l4.k.b(rVarB2, k2.i.a(dVar2.f97910b)), z28, new aa2.e(jC, 2), o0VarL, (i27 >> 9) & 112);
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f18 = eVar2.f97918c;
            bVar3.getClass();
            h4.r rVarZ2 = c2.l.z(rVarE2, eVar2.f97920e, f18);
            c2.j jVar2 = c2.j.f22691a;
            bVar3.getClass();
            float f19 = eVar2.f97918c;
            jVar2.getClass();
            c2.j.i iVarI2 = c2.j.i(f19);
            h4.d.f81522a.getClass();
            s2VarA = q2.a(iVarI2, h4.d.a.f81533k, o0VarL, 0);
            iHashCode = Long.hashCode(o0VarL.U);
            i2VarA0 = o0VarL.a0();
            rVarC = h4.k.c(rVarZ2, o0VarL);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarL.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarL.z();
            if (o0VarL.T) {
                o0VarL.M(aVar2);
            } else {
                o0VarL.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
            bVar = h5.g.a.f81813j;
            if (o0VarL.T) {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarL);
            u2Var = u2.f22900a;
            if (z27) {
                o0VarL.C(-246974555);
                o0Var2 = o0VarL;
                z36 = z28;
                zd0.e.c(0.0f, 0, 14, 0L, u2Var.c(h4.r.S, h4.d.a.f81534l), o0Var2);
                o0Var2.g0(false);
                j14 = j8;
            } else {
                z36 = z28;
                o0VarL.C(-246824887);
                j14 = j8;
                i7.a(n5.c.a(i14, o0VarL, (i27 >> 6) & 14), null, x2.q(u2Var.c(h4.r.S, h4.d.a.f81534l), 20), j14, o0VarL, 48, 0);
                o0Var2 = o0VarL;
                o0Var2.g0(false);
            }
            h4.r rVarC3 = u2Var.c(h4.r.S, h4.d.a.f81534l);
            d92.b.f58624b.getClass();
            h4.r rVar6 = rVar4;
            o0 o0Var4 = o0Var2;
            mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97938o, j14, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var4, (i27 >> 3) & 14, 0, 131068);
            o0Var = o0Var4;
            o0Var.g0(true);
            z25 = z27;
            rVar3 = rVar6;
            z26 = z35;
            z24 = z36;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            z24 = z15;
            rVar3 = rVar2;
            z25 = z17;
            z26 = z18;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar3, str, i14, z25, z24, z26, aVar, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    public static final void b(h4.r rVar, final String str, final u4.d dVar, boolean z14, boolean z15, boolean z16, final e23.a<Unit> aVar, p3.m mVar, final int i14, final int i15) {
        boolean z17;
        int i16;
        boolean z18;
        int i17;
        o0 o0Var;
        final h4.r rVar2;
        final boolean z19;
        final boolean z24;
        final boolean z25;
        long j8;
        u2 u2Var;
        long j14;
        o0 o0Var2;
        o0 o0VarL = vb.h.l(742489653, aVar, str, mVar);
        int i18 = i14 | 6 | (o0VarL.B(str) ? 32 : 16) | (o0VarL.B(dVar) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            z17 = z14;
        } else {
            z17 = z14;
            i16 = i18 | (o0VarL.h(z17) ? 2048 : 1024);
        }
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i16 | 24576;
            z18 = z15;
        } else {
            z18 = z15;
            i17 = i16 | (o0VarL.h(z18) ? 16384 : 8192);
        }
        int i25 = i17 | 196608 | (o0VarL.r(aVar) ? 1048576 : 524288);
        if (o0VarL.n(i25 & 1, (599187 & i25) != 599186)) {
            h4.r.a aVar2 = h4.r.S;
            boolean z26 = i19 != 0 ? false : z17;
            boolean z27 = i24 != 0 ? false : z18;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jC = d0.c(1.0f, d92.b.a(o0VarL).e().e(), 14);
            if (z27) {
                long jC2 = d0.c(1.0f, zl.a.b(o0VarL, 567997660, o0VarL).f63508c, 14);
                o0VarL.g0(false);
                j8 = jC2;
            } else {
                o0VarL.C(567999066);
                o0VarL.g0(false);
                j8 = jC;
            }
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarH = x2.h(aVar2, 40);
            boolean z28 = (3670016 & i25) == 1048576;
            Object objQ = o0VarL.q();
            if (z28) {
                objQ = new h0(aVar, 24);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(aVar, 24);
                    o0VarL.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarH, true, null, null, (e23.a) objQ, 14);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            h4.r rVarB = u1.q.b(1, jC, rVarD, k2.i.a(dVar2.f97910b));
            bVar.getClass();
            h4.r rVarE = wz1.i.e(l4.k.b(rVarB, k2.i.a(dVar2.f97910b)), z27, new aa2.e(jC, 3), o0VarL, (i25 >> 9) & 112);
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, f14);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarL, 0);
            int iHashCode = Long.hashCode(o0VarL.U);
            i2 i2VarA0 = o0VarL.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarL);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarL.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarL.z();
            if (o0VarL.T) {
                o0VarL.M(aVar4);
            } else {
                o0VarL.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarL.T || !p005kotlin.jvm.internal.s.g(o0VarL.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarL);
            u2 u2Var2 = u2.f22900a;
            if (z26) {
                o0VarL.C(-193775692);
                o0Var2 = o0VarL;
                u2Var = u2Var2;
                zd0.e.c(0.0f, 0, 14, 0L, u2Var2.c(aVar2, h4.d.a.f81534l), o0Var2);
                o0Var2.g0(false);
                j14 = j8;
            } else {
                u2Var = u2Var2;
                o0VarL.C(-193625900);
                j14 = j8;
                i7.a(u4.p.b(dVar, o0VarL), null, x2.q(u2Var.c(aVar2, h4.d.a.f81534l), 20), j14, o0VarL, 56, 0);
                o0Var2 = o0VarL;
                o0Var2.g0(false);
            }
            h4.r rVarC2 = u2Var.c(aVar2, h4.d.a.f81534l);
            d92.b.f58624b.getClass();
            o0 o0Var3 = o0Var2;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97938o, j14, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var3, (i25 >> 3) & 14, 0, 131068);
            o0Var = o0Var3;
            o0Var.g0(true);
            z24 = z26;
            rVar2 = aVar2;
            z25 = z27;
            z19 = true;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            rVar2 = rVar;
            z19 = z16;
            z24 = z17;
            z25 = z18;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, dVar, z24, z25, z19, aVar, i14, i15) { // from class: gt1.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f78962b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ u4.d f78963c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f78964d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f78965e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f78966f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f78967g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f78968h;

                {
                    this.f78968h = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    h.b(this.f78961a, this.f78962b, this.f78963c, this.f78964d, this.f78965e, this.f78966f, this.f78967g, (p3.m) obj, iT, this.f78968h);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
