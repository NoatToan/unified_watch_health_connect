package r31;

import android.annotation.SuppressLint;
import c2.q2;
import c2.s2;
import c2.t;
import c2.u;
import c2.u2;
import c2.v;
import c2.x2;
import f5.z0;
import h5.e0;
import i3.fb;
import l72.u0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    public static final void a(h4.r rVar, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-722792807);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
            long jT = v.h.t(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            h4.r rVarB = w.b(l4.k.b(x2.f(u1.n.e(rVar, jT, hVarA), 1.0f), hVarA), (a2.j) objQ, fb.a(0.0f, 6, 0L, true), false, null, null, aVar, 28);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u.f22885a, o0VarE, Integer.valueOf(((i15 >> 3) & 112) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(rVar, (Object) aVar, (Object) eVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017b  */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x015d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    /* JADX WARN: Code duplicated, block: B:99:0x0176  */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void b(final u4.d dVar, final String str, final String str2, final String str3, final e23.a aVar, final e23.a aVar2, h4.r rVar, x0 x0Var, x0 x0Var2, x0 x0Var3, final e23.q qVar, final e23.q qVar2, final e23.q qVar3, long j8, p3.m mVar, final int i14, final int i15) {
        e23.a aVar3;
        x0 x0Var4;
        x0 x0Var5;
        int i16;
        char c14;
        char c15;
        char c16;
        boolean z14;
        final h4.r rVar2;
        final x0 x0Var6;
        final long j14;
        final x0 x0Var7;
        final x0 x0Var8;
        p2 p2VarI0;
        x0 x0VarE;
        int i17;
        x0 x0Var9;
        x0 x0VarE2;
        final x0 x0Var10;
        int i18;
        final x0 x0Var11;
        final x0 x0Var12;
        final long jE;
        dVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1705248713);
        int i19 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            aVar3 = aVar;
            i19 |= o0VarE.r(aVar3) ? 16384 : 8192;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 196608) == 0) {
            i19 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        int i24 = i19 | (((i15 & 128) == 0 && o0VarE.B(x0Var)) ? 8388608 : 4194304);
        if ((i15 & 256) == 0) {
            x0Var4 = x0Var2;
            int i25 = o0VarE.B(x0Var4) ? 67108864 : 33554432;
            int i26 = i24 | i25;
            if ((i15 & 512) == 0) {
                x0Var5 = x0Var3;
                int i27 = o0VarE.B(x0Var5) ? 536870912 : 268435456;
                i16 = i26 | i27;
                if (o0VarE.r(qVar)) {
                    c14 = 4;
                } else {
                    c14 = 2;
                }
                c15 = 256;
                if (o0VarE.r(qVar2)) {
                    c16 = ' ';
                } else {
                    c16 = 16;
                }
                int i28 = c14 | c16;
                if (!o0VarE.r(qVar3)) {
                    c15 = 128;
                }
                int i29 = i28 | c15 | 25600;
                if ((i16 & 306783379) == 306783378 || (i29 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if ((i15 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0VarE = d92.c.e(j92.f.f97931h);
                            i17 = i16 & (-29360129);
                        } else {
                            x0VarE = x0Var;
                            i17 = i16;
                        }
                        if ((i15 & 256) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0Var9 = j92.f.f97932i;
                            i17 &= -234881025;
                        } else {
                            x0Var9 = x0Var4;
                        }
                        if ((i15 & 512) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0VarE2 = d92.c.e(j92.f.f97932i);
                            i17 &= -1879048193;
                        } else {
                            x0VarE2 = x0Var5;
                        }
                        d92.b.f58623a.getClass();
                        x0Var10 = x0VarE;
                        i18 = i17;
                        x0Var11 = x0Var9;
                        x0Var12 = x0VarE2;
                        jE = d92.b.a(o0VarE).e().e();
                    } else {
                        o0VarE.e();
                        i18 = (i15 & 128) != 0 ? i16 & (-29360129) : i16;
                        if ((i15 & 256) != 0) {
                            i18 &= -234881025;
                        }
                        if ((i15 & 512) != 0) {
                            i18 &= -1879048193;
                        }
                        x0Var10 = x0Var;
                        x0Var11 = x0Var4;
                        x0Var12 = x0Var5;
                        jE = j8;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    final e23.a aVar4 = aVar3;
                    rVar2 = rVar;
                    a(rVar2, aVar2, z3.f.c(71458137, new e23.q() { // from class: r31.p
                        /* JADX WARN: Code duplicated, block: B:23:0x013c  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((t) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var2 = p3.n.f135158a;
                                h4.r.a aVar5 = h4.r.S;
                                c2.j.f22691a.getClass();
                                c2.j.C0343j c0343j = c2.j.f22692b;
                                h4.d.f81522a.getClass();
                                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                i2 i2VarX = mVar2.x();
                                h4.r rVarC = h4.k.c(aVar5, mVar2);
                                h5.g.V.getClass();
                                e0.a aVar6 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar6);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                                }
                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                u2 u2Var = u2.f22900a;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar = j92.b.f97899b;
                                float f14 = eVar.f97920e;
                                h4.r rVarC2 = c2.l.C(aVar5, f14, f14, f14, 0.0f, 8);
                                f02.h.f67736a.getClass();
                                g02.i.a(rVarC2, dVar, f02.h.a(mVar2), jE, j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 224);
                                v.a(x2.c(u2Var.a(c2.l.A(aVar5, 0.0f, eVar.f97920e, 1), 1.0f, true), 1.0f), null, false, z3.f.c(215008863, new o(qVar, qVar2, qVar3, str, str2, str3, x0Var10, x0Var11, x0Var12, 1), mVar2), mVar2, 3072, 6);
                                float f15 = eVar.f97917b;
                                h4.r rVarC3 = c2.l.C(aVar5, 0.0f, f15, f15, 0.0f, 9);
                                e23.a aVar7 = aVar4;
                                boolean zB = mVar2.B(aVar7);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    objQ = new qk0.o(aVar7, 15);
                                    mVar2.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new qk0.o(aVar7, 15);
                                        mVar2.K(objQ);
                                    }
                                }
                                u0.a(rVarC3, null, null, null, (e23.a) objQ, mVar2, 0, 14);
                                mVar2.y();
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, ((i18 >> 12) & 112) | 390);
                    j14 = jE;
                    x0Var6 = x0Var10;
                    x0Var8 = x0Var11;
                    x0Var7 = x0Var12;
                } else {
                    rVar2 = rVar;
                    o0VarE.e();
                    x0Var6 = x0Var;
                    j14 = j8;
                    x0Var7 = x0Var5;
                    x0Var8 = x0Var4;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: r31.q
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i14 | 1);
                            r.b(dVar, str, str2, str3, aVar, aVar2, rVar2, x0Var6, x0Var8, x0Var7, qVar, qVar2, qVar3, j14, (p3.m) obj, iT, i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            x0Var5 = x0Var3;
            i16 = i26 | i27;
            if (o0VarE.r(qVar)) {
                c14 = 4;
            } else {
                c14 = 2;
            }
            c15 = 256;
            if (o0VarE.r(qVar2)) {
                c16 = ' ';
            } else {
                c16 = 16;
            }
            int i210 = c14 | c16;
            if (!o0VarE.r(qVar3)) {
                c15 = 128;
            }
            int i211 = i210 | c15 | 25600;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE = d92.c.e(j92.f.f97931h);
                        i17 = i16 & (-29360129);
                    } else {
                        x0VarE = x0Var;
                        i17 = i16;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var9 = j92.f.f97932i;
                        i17 &= -234881025;
                    } else {
                        x0Var9 = x0Var4;
                    }
                    if ((i15 & 512) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE2 = d92.c.e(j92.f.f97932i);
                        i17 &= -1879048193;
                    } else {
                        x0VarE2 = x0Var5;
                    }
                    d92.b.f58623a.getClass();
                    x0Var10 = x0VarE;
                    i18 = i17;
                    x0Var11 = x0Var9;
                    x0Var12 = x0VarE2;
                    jE = d92.b.a(o0VarE).e().e();
                } else {
                    if ((i15 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE = d92.c.e(j92.f.f97931h);
                        i17 = i16 & (-29360129);
                    } else {
                        x0VarE = x0Var;
                        i17 = i16;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var9 = j92.f.f97932i;
                        i17 &= -234881025;
                    } else {
                        x0Var9 = x0Var4;
                    }
                    if ((i15 & 512) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE2 = d92.c.e(j92.f.f97932i);
                        i17 &= -1879048193;
                    } else {
                        x0VarE2 = x0Var5;
                    }
                    d92.b.f58623a.getClass();
                    x0Var10 = x0VarE;
                    i18 = i17;
                    x0Var11 = x0Var9;
                    x0Var12 = x0VarE2;
                    jE = d92.b.a(o0VarE).e().e();
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                final e23.a aVar5 = aVar3;
                rVar2 = rVar;
                a(rVar2, aVar2, z3.f.c(71458137, new e23.q() { // from class: r31.p
                    /* JADX WARN: Code duplicated, block: B:23:0x013c  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((t) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            h4.r.a aVar6 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(aVar6, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar7 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                            u2 u2Var = u2.f22900a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            float f14 = eVar.f97920e;
                            h4.r rVarC2 = c2.l.C(aVar6, f14, f14, f14, 0.0f, 8);
                            f02.h.f67736a.getClass();
                            g02.i.a(rVarC2, dVar, f02.h.a(mVar2), jE, j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 224);
                            v.a(x2.c(u2Var.a(c2.l.A(aVar6, 0.0f, eVar.f97920e, 1), 1.0f, true), 1.0f), null, false, z3.f.c(215008863, new o(qVar, qVar2, qVar3, str, str2, str3, x0Var10, x0Var11, x0Var12, 1), mVar2), mVar2, 3072, 6);
                            float f15 = eVar.f97917b;
                            h4.r rVarC3 = c2.l.C(aVar6, 0.0f, f15, f15, 0.0f, 9);
                            e23.a aVar8 = aVar5;
                            boolean zB = mVar2.B(aVar8);
                            Object objQ = mVar2.q();
                            if (zB) {
                                objQ = new qk0.o(aVar8, 15);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new qk0.o(aVar8, 15);
                                    mVar2.K(objQ);
                                }
                            }
                            u0.a(rVarC3, null, null, null, (e23.a) objQ, mVar2, 0, 14);
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i18 >> 12) & 112) | 390);
                j14 = jE;
                x0Var6 = x0Var10;
                x0Var8 = x0Var11;
                x0Var7 = x0Var12;
            } else {
                rVar2 = rVar;
                o0VarE.e();
                x0Var6 = x0Var;
                j14 = j8;
                x0Var7 = x0Var5;
                x0Var8 = x0Var4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r31.q
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        r.b(dVar, str, str2, str3, aVar, aVar2, rVar2, x0Var6, x0Var8, x0Var7, qVar, qVar2, qVar3, j14, (p3.m) obj, iT, i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        x0Var4 = x0Var2;
        int i212 = i24 | i25;
        if ((i15 & 512) == 0) {
            x0Var5 = x0Var3;
            if (o0VarE.B(x0Var5)) {
            }
            i16 = i212 | i27;
            if (o0VarE.r(qVar)) {
                c14 = 4;
            } else {
                c14 = 2;
            }
            c15 = 256;
            if (o0VarE.r(qVar2)) {
                c16 = ' ';
            } else {
                c16 = 16;
            }
            int i213 = c14 | c16;
            if (!o0VarE.r(qVar3)) {
                c15 = 128;
            }
            int i214 = i213 | c15 | 25600;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE = d92.c.e(j92.f.f97931h);
                        i17 = i16 & (-29360129);
                    } else {
                        x0VarE = x0Var;
                        i17 = i16;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var9 = j92.f.f97932i;
                        i17 &= -234881025;
                    } else {
                        x0Var9 = x0Var4;
                    }
                    if ((i15 & 512) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE2 = d92.c.e(j92.f.f97932i);
                        i17 &= -1879048193;
                    } else {
                        x0VarE2 = x0Var5;
                    }
                    d92.b.f58623a.getClass();
                    x0Var10 = x0VarE;
                    i18 = i17;
                    x0Var11 = x0Var9;
                    x0Var12 = x0VarE2;
                    jE = d92.b.a(o0VarE).e().e();
                } else {
                    if ((i15 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE = d92.c.e(j92.f.f97931h);
                        i17 = i16 & (-29360129);
                    } else {
                        x0VarE = x0Var;
                        i17 = i16;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var9 = j92.f.f97932i;
                        i17 &= -234881025;
                    } else {
                        x0Var9 = x0Var4;
                    }
                    if ((i15 & 512) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarE2 = d92.c.e(j92.f.f97932i);
                        i17 &= -1879048193;
                    } else {
                        x0VarE2 = x0Var5;
                    }
                    d92.b.f58623a.getClass();
                    x0Var10 = x0VarE;
                    i18 = i17;
                    x0Var11 = x0Var9;
                    x0Var12 = x0VarE2;
                    jE = d92.b.a(o0VarE).e().e();
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                final e23.a aVar6 = aVar3;
                rVar2 = rVar;
                a(rVar2, aVar2, z3.f.c(71458137, new e23.q() { // from class: r31.p
                    /* JADX WARN: Code duplicated, block: B:23:0x013c  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((t) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            h4.r.a aVar7 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(aVar7, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar8 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar8);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                            u2 u2Var = u2.f22900a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            float f14 = eVar.f97920e;
                            h4.r rVarC2 = c2.l.C(aVar7, f14, f14, f14, 0.0f, 8);
                            f02.h.f67736a.getClass();
                            g02.i.a(rVarC2, dVar, f02.h.a(mVar2), jE, j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 224);
                            v.a(x2.c(u2Var.a(c2.l.A(aVar7, 0.0f, eVar.f97920e, 1), 1.0f, true), 1.0f), null, false, z3.f.c(215008863, new o(qVar, qVar2, qVar3, str, str2, str3, x0Var10, x0Var11, x0Var12, 1), mVar2), mVar2, 3072, 6);
                            float f15 = eVar.f97917b;
                            h4.r rVarC3 = c2.l.C(aVar7, 0.0f, f15, f15, 0.0f, 9);
                            e23.a aVar9 = aVar6;
                            boolean zB = mVar2.B(aVar9);
                            Object objQ = mVar2.q();
                            if (zB) {
                                objQ = new qk0.o(aVar9, 15);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new qk0.o(aVar9, 15);
                                    mVar2.K(objQ);
                                }
                            }
                            u0.a(rVarC3, null, null, null, (e23.a) objQ, mVar2, 0, 14);
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i18 >> 12) & 112) | 390);
                j14 = jE;
                x0Var6 = x0Var10;
                x0Var8 = x0Var11;
                x0Var7 = x0Var12;
            } else {
                rVar2 = rVar;
                o0VarE.e();
                x0Var6 = x0Var;
                j14 = j8;
                x0Var7 = x0Var5;
                x0Var8 = x0Var4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r31.q
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        r.b(dVar, str, str2, str3, aVar, aVar2, rVar2, x0Var6, x0Var8, x0Var7, qVar, qVar2, qVar3, j14, (p3.m) obj, iT, i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        x0Var5 = x0Var3;
        i16 = i212 | i27;
        if (o0VarE.r(qVar)) {
            c14 = 4;
        } else {
            c14 = 2;
        }
        c15 = 256;
        if (o0VarE.r(qVar2)) {
            c16 = ' ';
        } else {
            c16 = 16;
        }
        int i215 = c14 | c16;
        if (!o0VarE.r(qVar3)) {
            c15 = 128;
        }
        int i216 = i215 | c15 | 25600;
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarE = d92.c.e(j92.f.f97931h);
                    i17 = i16 & (-29360129);
                } else {
                    x0VarE = x0Var;
                    i17 = i16;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0Var9 = j92.f.f97932i;
                    i17 &= -234881025;
                } else {
                    x0Var9 = x0Var4;
                }
                if ((i15 & 512) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarE2 = d92.c.e(j92.f.f97932i);
                    i17 &= -1879048193;
                } else {
                    x0VarE2 = x0Var5;
                }
                d92.b.f58623a.getClass();
                x0Var10 = x0VarE;
                i18 = i17;
                x0Var11 = x0Var9;
                x0Var12 = x0VarE2;
                jE = d92.b.a(o0VarE).e().e();
            } else {
                if ((i15 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarE = d92.c.e(j92.f.f97931h);
                    i17 = i16 & (-29360129);
                } else {
                    x0VarE = x0Var;
                    i17 = i16;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0Var9 = j92.f.f97932i;
                    i17 &= -234881025;
                } else {
                    x0Var9 = x0Var4;
                }
                if ((i15 & 512) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarE2 = d92.c.e(j92.f.f97932i);
                    i17 &= -1879048193;
                } else {
                    x0VarE2 = x0Var5;
                }
                d92.b.f58623a.getClass();
                x0Var10 = x0VarE;
                i18 = i17;
                x0Var11 = x0Var9;
                x0Var12 = x0VarE2;
                jE = d92.b.a(o0VarE).e().e();
            }
            o0VarE.h0();
            x1 x1Var4 = p3.n.f135158a;
            final e23.a aVar7 = aVar3;
            rVar2 = rVar;
            a(rVar2, aVar2, z3.f.c(71458137, new e23.q() { // from class: r31.p
                /* JADX WARN: Code duplicated, block: B:23:0x013c  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((t) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var5 = p3.n.f135158a;
                        h4.r.a aVar8 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(aVar8, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar9 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97920e;
                        h4.r rVarC2 = c2.l.C(aVar8, f14, f14, f14, 0.0f, 8);
                        f02.h.f67736a.getClass();
                        g02.i.a(rVarC2, dVar, f02.h.a(mVar2), jE, j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 224);
                        v.a(x2.c(u2Var.a(c2.l.A(aVar8, 0.0f, eVar.f97920e, 1), 1.0f, true), 1.0f), null, false, z3.f.c(215008863, new o(qVar, qVar2, qVar3, str, str2, str3, x0Var10, x0Var11, x0Var12, 1), mVar2), mVar2, 3072, 6);
                        float f15 = eVar.f97917b;
                        h4.r rVarC3 = c2.l.C(aVar8, 0.0f, f15, f15, 0.0f, 9);
                        e23.a aVar10 = aVar7;
                        boolean zB = mVar2.B(aVar10);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new qk0.o(aVar10, 15);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new qk0.o(aVar10, 15);
                                mVar2.K(objQ);
                            }
                        }
                        u0.a(rVarC3, null, null, null, (e23.a) objQ, mVar2, 0, 14);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, ((i18 >> 12) & 112) | 390);
            j14 = jE;
            x0Var6 = x0Var10;
            x0Var8 = x0Var11;
            x0Var7 = x0Var12;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            x0Var6 = x0Var;
            j14 = j8;
            x0Var7 = x0Var5;
            x0Var8 = x0Var4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: r31.q
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    r.b(dVar, str, str2, str3, aVar, aVar2, rVar2, x0Var6, x0Var8, x0Var7, qVar, qVar2, qVar3, j14, (p3.m) obj, iT, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void c(String str, String str2, String str3, String str4, e23.a aVar, e23.a aVar2, h4.r rVar, x0 x0Var, x0 x0Var2, x0 x0Var3, e23.q qVar, e23.q qVar2, e23.q qVar3, p3.m mVar, int i14) {
        h4.r rVar2;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-764967693);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.B(x0Var) ? 8388608 : 4194304) | (o0VarE.B(x0Var2) ? 67108864 : 33554432) | (o0VarE.B(x0Var3) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (((((o0VarE.r(qVar) ? (char) 4 : (char) 2) | (o0VarE.r(qVar2) ? ' ' : (char) 16)) | (o0VarE.r(qVar3) ? (char) 256 : (char) 128)) | 3072) & 1171) == 1170) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            a(rVar2, aVar2, z3.f.c(1648030353, new fo.i(aVar, str, qVar, qVar2, qVar3, str2, str3, str4, x0Var, x0Var2, x0Var3), o0VarE), o0VarE, ((i15 >> 12) & 112) | 390);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.t(str, str2, str3, str4, aVar, aVar2, rVar2, x0Var, x0Var2, x0Var3, qVar, qVar2, qVar3, i14);
        }
    }
}
