package b82;

import c2.x2;
import i3.fc;
import i3.j2;
import i3.k2;
import i3.ob;
import i3.qb;
import i3.qc;
import i3.s7;
import i3.vb;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class k1 {
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[PHI: r12
      0x00d8: PHI (r12v7 int) = (r12v0 int), (r12v1 int) binds: [B:60:0x00d6, B:64:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(final i53.c<g1> cVar, int i14, h4.r rVar, g6.f fVar, float f14, final e23.l<? super Integer, Unit> lVar, p3.m mVar, int i15, int i16) {
        int i17;
        h4.r rVar2;
        int i18;
        g6.f fVar2;
        int i19;
        int i24;
        int size;
        boolean z14;
        float f15;
        h4.r rVar3;
        g6.f fVar3;
        p2 p2VarI0;
        h4.r rVar4;
        final g6.f fVarA;
        final int i25;
        h4.r rVarU;
        int i26;
        cVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-692523422);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.k(i14) ? 32 : 16;
        }
        int i27 = i16 & 4;
        if (i27 == 0) {
            if ((i15 & 384) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    fVar2 = fVar;
                    if (o0VarE.B(fVar2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i24 = i17 | 24576;
                if ((196608 & i15) != 0) {
                    if (o0VarE.r(lVar)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i24 |= i26;
                }
                size = 0;
                if ((74899 & i24) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i24 & 1, z14)) {
                    if (i27 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        fVarA = g6.f.a(85);
                    } else {
                        fVarA = fVar2;
                    }
                    final float f16 = 8;
                    g6.f.a aVar = g6.f.f75994b;
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    final long jB = d92.b.a(o0VarE).i().a().b();
                    final long jA = d92.b.a(o0VarE).i().a().a();
                    if (i14 >= 0) {
                        i25 = size;
                    } else if (i14 >= cVar.size()) {
                        size = cVar.size() - 1;
                        i25 = size;
                    } else {
                        i25 = i14;
                    }
                    if (fVarA == null) {
                        rVarU = x2.f(h4.r.S, 1.0f);
                    } else {
                        rVarU = x2.u(h4.r.S, fVarA.f75997a * cVar.size());
                    }
                    vb.c(c2.l.o(rVar4.then(rVarU), c2.q1.Max), 0.0f, z3.f.c(1700223543, new e23.q() { // from class: b82.h1
                        /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            boolean z15;
                            qc qcVar = (qc) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            qcVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(qcVar) ? 4 : 2;
                            }
                            int i28 = iIntValue;
                            boolean z16 = true;
                            if (mVar2.n(i28 & 1, (i28 & 19) != 18)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                i53.c cVar2 = cVar;
                                int i29 = 0;
                                for (Object obj4 : cVar2) {
                                    int i30 = i29 + 1;
                                    if (i29 < 0) {
                                        p13.x.q();
                                        throw null;
                                    }
                                    g1 g1Var = (g1) obj4;
                                    boolean z17 = i29 == i25 ? z16 : false;
                                    g6.f fVar4 = fVarA;
                                    h4.r rVarC = fVar4 != null ? x2.c(x2.u(h4.r.S, fVar4.f75997a), 1.0f) : x2.c(qcVar.a(h4.r.S, 1.0f, z16), 1.0f);
                                    qb qbVar = qb.f89432a;
                                    int size2 = cVar2.size();
                                    k2.h hVarA = k2.i.a(f16);
                                    qbVar.getClass();
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    o4.r1 r1VarD = hVarA;
                                    if (size2 != z16) {
                                        r1VarD = i29 == 0 ? fc.d(hVarA) : i29 == size2 + (-1) ? fc.a(hVarA) : o4.m1.f128891a;
                                    }
                                    o4.d0.f128823b.getClass();
                                    long j8 = o4.d0.f128832k;
                                    s7.f89624a.getClass();
                                    j2 j2VarA = s7.a(mVar2);
                                    ob obVar = j2VarA.f88492k0;
                                    if (obVar == null) {
                                        n3.m0.f123114a.getClass();
                                        n3.m mVar3 = n3.m0.f123122i;
                                        long jD = k2.d(j2VarA, mVar3);
                                        long jD2 = k2.d(j2VarA, n3.m0.f123123j);
                                        n3.m mVar4 = n3.m0.f123120g;
                                        long jD3 = k2.d(j2VarA, mVar4);
                                        o4.d0.f128823b.getClass();
                                        long j14 = o4.d0.f128831j;
                                        long jD4 = k2.d(j2VarA, n3.m0.f123124k);
                                        long jD5 = k2.d(j2VarA, mVar4);
                                        long jD6 = k2.d(j2VarA, mVar3);
                                        n3.m mVar5 = n3.m0.f123116c;
                                        long jD7 = k2.d(j2VarA, mVar5);
                                        float f17 = n3.m0.f123117d;
                                        long jC = o4.d0.c(f17, jD7, 14);
                                        long jD8 = k2.d(j2VarA, mVar4);
                                        float f18 = n3.m0.f123118e;
                                        obVar = new ob(jD, jD2, jD3, j14, jD4, jD5, jD6, jC, o4.d0.c(f18, jD8, 14), j14, o4.d0.c(f17, k2.d(j2VarA, mVar5), 14), o4.d0.c(f18, k2.d(j2VarA, mVar4), 14), null);
                                        j2VarA.f88492k0 = obVar;
                                    }
                                    long j15 = jB;
                                    long j16 = j15 != 16 ? j15 : obVar.f89188a;
                                    long j17 = j8 != r8 ? j8 : obVar.f89189b;
                                    long j18 = j15 != 16 ? j15 : obVar.f89190c;
                                    long j19 = jA;
                                    if (j19 == 16) {
                                        j19 = obVar.f89191d;
                                    }
                                    long j24 = j19;
                                    long j25 = j8 != r8 ? j8 : obVar.f89192e;
                                    if (j15 == 16) {
                                        j15 = obVar.f89193f;
                                    }
                                    ob obVar2 = new ob(j16, j17, j18, j24, j25, j15, j8 != r8 ? j8 : obVar.f89194g, j8 != r8 ? j8 : obVar.f89195h, j8 != r8 ? j8 : obVar.f89196i, j8 != r8 ? j8 : obVar.f89197j, j8 != r8 ? j8 : obVar.f89198k, j8 != r8 ? j8 : obVar.f89199l, null);
                                    e23.l lVar2 = lVar;
                                    boolean zB = mVar2.B(lVar2) | mVar2.k(i29);
                                    Object objQ = mVar2.q();
                                    if (zB) {
                                        z15 = true;
                                        objQ = new au0.m(lVar2, i29, 1);
                                        mVar2.K(objQ);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            z15 = true;
                                            objQ = new au0.m(lVar2, i29, 1);
                                            mVar2.K(objQ);
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    f.f16562a.getClass();
                                    qcVar = qcVar;
                                    vb.a(qcVar, z17, (e23.a) objQ, r1VarD, rVarC, false, obVar2, null, null, f.f16563b, z3.f.c(-1936554967, new ap2.f(z17, g1Var, 3), mVar2), mVar2, i28 & 14);
                                    cVar2 = cVar2;
                                    i29 = i30;
                                    z16 = z15;
                                }
                                p3.x1 x1Var4 = p3.n.f135158a;
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 384);
                    rVar3 = rVar4;
                    fVar3 = fVarA;
                    f15 = f16;
                } else {
                    o0VarE.e();
                    f15 = f14;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new i1(cVar, i14, rVar3, fVar3, f15, lVar, i15, i16);
                }
            }
            i17 |= 3072;
            fVar2 = fVar;
            i24 = i17 | 24576;
            if ((196608 & i15) != 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i24 |= i26;
            }
            size = 0;
            if ((74899 & i24) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i24 & 1, z14)) {
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i18 != 0) {
                    fVarA = g6.f.a(85);
                } else {
                    fVarA = fVar2;
                }
                final float f17 = 8;
                g6.f.a aVar2 = g6.f.f75994b;
                p3.x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                final long jB2 = d92.b.a(o0VarE).i().a().b();
                final long jA2 = d92.b.a(o0VarE).i().a().a();
                if (i14 >= 0) {
                    i25 = size;
                } else if (i14 >= cVar.size()) {
                    size = cVar.size() - 1;
                    i25 = size;
                } else {
                    i25 = i14;
                }
                if (fVarA == null) {
                    rVarU = x2.f(h4.r.S, 1.0f);
                } else {
                    rVarU = x2.u(h4.r.S, fVarA.f75997a * cVar.size());
                }
                vb.c(c2.l.o(rVar4.then(rVarU), c2.q1.Max), 0.0f, z3.f.c(1700223543, new e23.q() { // from class: b82.h1
                    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z15;
                        qc qcVar = (qc) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        qcVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(qcVar) ? 4 : 2;
                        }
                        int i28 = iIntValue;
                        boolean z16 = true;
                        if (mVar2.n(i28 & 1, (i28 & 19) != 18)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            i53.c cVar2 = cVar;
                            int i29 = 0;
                            for (Object obj4 : cVar2) {
                                int i30 = i29 + 1;
                                if (i29 < 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                g1 g1Var = (g1) obj4;
                                boolean z17 = i29 == i25 ? z16 : false;
                                g6.f fVar4 = fVarA;
                                h4.r rVarC = fVar4 != null ? x2.c(x2.u(h4.r.S, fVar4.f75997a), 1.0f) : x2.c(qcVar.a(h4.r.S, 1.0f, z16), 1.0f);
                                qb qbVar = qb.f89432a;
                                int size2 = cVar2.size();
                                k2.h hVarA = k2.i.a(f17);
                                qbVar.getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                o4.r1 r1VarD = hVarA;
                                if (size2 != z16) {
                                    r1VarD = i29 == 0 ? fc.d(hVarA) : i29 == size2 + (-1) ? fc.a(hVarA) : o4.m1.f128891a;
                                }
                                o4.d0.f128823b.getClass();
                                long j8 = o4.d0.f128832k;
                                s7.f89624a.getClass();
                                j2 j2VarA = s7.a(mVar2);
                                ob obVar = j2VarA.f88492k0;
                                if (obVar == null) {
                                    n3.m0.f123114a.getClass();
                                    n3.m mVar3 = n3.m0.f123122i;
                                    long jD = k2.d(j2VarA, mVar3);
                                    long jD2 = k2.d(j2VarA, n3.m0.f123123j);
                                    n3.m mVar4 = n3.m0.f123120g;
                                    long jD3 = k2.d(j2VarA, mVar4);
                                    o4.d0.f128823b.getClass();
                                    long j14 = o4.d0.f128831j;
                                    long jD4 = k2.d(j2VarA, n3.m0.f123124k);
                                    long jD5 = k2.d(j2VarA, mVar4);
                                    long jD6 = k2.d(j2VarA, mVar3);
                                    n3.m mVar5 = n3.m0.f123116c;
                                    long jD7 = k2.d(j2VarA, mVar5);
                                    float f18 = n3.m0.f123117d;
                                    long jC = o4.d0.c(f18, jD7, 14);
                                    long jD8 = k2.d(j2VarA, mVar4);
                                    float f19 = n3.m0.f123118e;
                                    obVar = new ob(jD, jD2, jD3, j14, jD4, jD5, jD6, jC, o4.d0.c(f19, jD8, 14), j14, o4.d0.c(f18, k2.d(j2VarA, mVar5), 14), o4.d0.c(f19, k2.d(j2VarA, mVar4), 14), null);
                                    j2VarA.f88492k0 = obVar;
                                }
                                long j15 = jB2;
                                long j16 = j15 != 16 ? j15 : obVar.f89188a;
                                long j17 = j8 != r8 ? j8 : obVar.f89189b;
                                long j18 = j15 != 16 ? j15 : obVar.f89190c;
                                long j19 = jA2;
                                if (j19 == 16) {
                                    j19 = obVar.f89191d;
                                }
                                long j24 = j19;
                                long j25 = j8 != r8 ? j8 : obVar.f89192e;
                                if (j15 == 16) {
                                    j15 = obVar.f89193f;
                                }
                                ob obVar2 = new ob(j16, j17, j18, j24, j25, j15, j8 != r8 ? j8 : obVar.f89194g, j8 != r8 ? j8 : obVar.f89195h, j8 != r8 ? j8 : obVar.f89196i, j8 != r8 ? j8 : obVar.f89197j, j8 != r8 ? j8 : obVar.f89198k, j8 != r8 ? j8 : obVar.f89199l, null);
                                e23.l lVar2 = lVar;
                                boolean zB = mVar2.B(lVar2) | mVar2.k(i29);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    z15 = true;
                                    objQ = new au0.m(lVar2, i29, 1);
                                    mVar2.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        z15 = true;
                                        objQ = new au0.m(lVar2, i29, 1);
                                        mVar2.K(objQ);
                                    } else {
                                        z15 = true;
                                    }
                                }
                                f.f16562a.getClass();
                                qcVar = qcVar;
                                vb.a(qcVar, z17, (e23.a) objQ, r1VarD, rVarC, false, obVar2, null, null, f.f16563b, z3.f.c(-1936554967, new ap2.f(z17, g1Var, 3), mVar2), mVar2, i28 & 14);
                                cVar2 = cVar2;
                                i29 = i30;
                                z16 = z15;
                            }
                            p3.x1 x1Var5 = p3.n.f135158a;
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 384);
                rVar3 = rVar4;
                fVar3 = fVarA;
                f15 = f17;
            } else {
                o0VarE.e();
                f15 = f14;
                rVar3 = rVar2;
                fVar3 = fVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i1(cVar, i14, rVar3, fVar3, f15, lVar, i15, i16);
            }
        }
        i17 |= 384;
        rVar2 = rVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                fVar2 = fVar;
                if (o0VarE.B(fVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i24 = i17 | 24576;
            if ((196608 & i15) != 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i24 |= i26;
            }
            size = 0;
            if ((74899 & i24) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i24 & 1, z14)) {
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i18 != 0) {
                    fVarA = g6.f.a(85);
                } else {
                    fVarA = fVar2;
                }
                final float f18 = 8;
                g6.f.a aVar3 = g6.f.f75994b;
                p3.x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                final long jB3 = d92.b.a(o0VarE).i().a().b();
                final long jA3 = d92.b.a(o0VarE).i().a().a();
                if (i14 >= 0) {
                    i25 = size;
                } else if (i14 >= cVar.size()) {
                    size = cVar.size() - 1;
                    i25 = size;
                } else {
                    i25 = i14;
                }
                if (fVarA == null) {
                    rVarU = x2.f(h4.r.S, 1.0f);
                } else {
                    rVarU = x2.u(h4.r.S, fVarA.f75997a * cVar.size());
                }
                vb.c(c2.l.o(rVar4.then(rVarU), c2.q1.Max), 0.0f, z3.f.c(1700223543, new e23.q() { // from class: b82.h1
                    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z15;
                        qc qcVar = (qc) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        qcVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(qcVar) ? 4 : 2;
                        }
                        int i28 = iIntValue;
                        boolean z16 = true;
                        if (mVar2.n(i28 & 1, (i28 & 19) != 18)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            i53.c cVar2 = cVar;
                            int i29 = 0;
                            for (Object obj4 : cVar2) {
                                int i30 = i29 + 1;
                                if (i29 < 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                g1 g1Var = (g1) obj4;
                                boolean z17 = i29 == i25 ? z16 : false;
                                g6.f fVar4 = fVarA;
                                h4.r rVarC = fVar4 != null ? x2.c(x2.u(h4.r.S, fVar4.f75997a), 1.0f) : x2.c(qcVar.a(h4.r.S, 1.0f, z16), 1.0f);
                                qb qbVar = qb.f89432a;
                                int size2 = cVar2.size();
                                k2.h hVarA = k2.i.a(f18);
                                qbVar.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                o4.r1 r1VarD = hVarA;
                                if (size2 != z16) {
                                    r1VarD = i29 == 0 ? fc.d(hVarA) : i29 == size2 + (-1) ? fc.a(hVarA) : o4.m1.f128891a;
                                }
                                o4.d0.f128823b.getClass();
                                long j8 = o4.d0.f128832k;
                                s7.f89624a.getClass();
                                j2 j2VarA = s7.a(mVar2);
                                ob obVar = j2VarA.f88492k0;
                                if (obVar == null) {
                                    n3.m0.f123114a.getClass();
                                    n3.m mVar3 = n3.m0.f123122i;
                                    long jD = k2.d(j2VarA, mVar3);
                                    long jD2 = k2.d(j2VarA, n3.m0.f123123j);
                                    n3.m mVar4 = n3.m0.f123120g;
                                    long jD3 = k2.d(j2VarA, mVar4);
                                    o4.d0.f128823b.getClass();
                                    long j14 = o4.d0.f128831j;
                                    long jD4 = k2.d(j2VarA, n3.m0.f123124k);
                                    long jD5 = k2.d(j2VarA, mVar4);
                                    long jD6 = k2.d(j2VarA, mVar3);
                                    n3.m mVar5 = n3.m0.f123116c;
                                    long jD7 = k2.d(j2VarA, mVar5);
                                    float f19 = n3.m0.f123117d;
                                    long jC = o4.d0.c(f19, jD7, 14);
                                    long jD8 = k2.d(j2VarA, mVar4);
                                    float f110 = n3.m0.f123118e;
                                    obVar = new ob(jD, jD2, jD3, j14, jD4, jD5, jD6, jC, o4.d0.c(f110, jD8, 14), j14, o4.d0.c(f19, k2.d(j2VarA, mVar5), 14), o4.d0.c(f110, k2.d(j2VarA, mVar4), 14), null);
                                    j2VarA.f88492k0 = obVar;
                                }
                                long j15 = jB3;
                                long j16 = j15 != 16 ? j15 : obVar.f89188a;
                                long j17 = j8 != r8 ? j8 : obVar.f89189b;
                                long j18 = j15 != 16 ? j15 : obVar.f89190c;
                                long j19 = jA3;
                                if (j19 == 16) {
                                    j19 = obVar.f89191d;
                                }
                                long j24 = j19;
                                long j25 = j8 != r8 ? j8 : obVar.f89192e;
                                if (j15 == 16) {
                                    j15 = obVar.f89193f;
                                }
                                ob obVar2 = new ob(j16, j17, j18, j24, j25, j15, j8 != r8 ? j8 : obVar.f89194g, j8 != r8 ? j8 : obVar.f89195h, j8 != r8 ? j8 : obVar.f89196i, j8 != r8 ? j8 : obVar.f89197j, j8 != r8 ? j8 : obVar.f89198k, j8 != r8 ? j8 : obVar.f89199l, null);
                                e23.l lVar2 = lVar;
                                boolean zB = mVar2.B(lVar2) | mVar2.k(i29);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    z15 = true;
                                    objQ = new au0.m(lVar2, i29, 1);
                                    mVar2.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        z15 = true;
                                        objQ = new au0.m(lVar2, i29, 1);
                                        mVar2.K(objQ);
                                    } else {
                                        z15 = true;
                                    }
                                }
                                f.f16562a.getClass();
                                qcVar = qcVar;
                                vb.a(qcVar, z17, (e23.a) objQ, r1VarD, rVarC, false, obVar2, null, null, f.f16563b, z3.f.c(-1936554967, new ap2.f(z17, g1Var, 3), mVar2), mVar2, i28 & 14);
                                cVar2 = cVar2;
                                i29 = i30;
                                z16 = z15;
                            }
                            p3.x1 x1Var6 = p3.n.f135158a;
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 384);
                rVar3 = rVar4;
                fVar3 = fVarA;
                f15 = f18;
            } else {
                o0VarE.e();
                f15 = f14;
                rVar3 = rVar2;
                fVar3 = fVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i1(cVar, i14, rVar3, fVar3, f15, lVar, i15, i16);
            }
        }
        i17 |= 3072;
        fVar2 = fVar;
        i24 = i17 | 24576;
        if ((196608 & i15) != 0) {
            if (o0VarE.r(lVar)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i24 |= i26;
        }
        size = 0;
        if ((74899 & i24) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i24 & 1, z14)) {
            if (i27 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i18 != 0) {
                fVarA = g6.f.a(85);
            } else {
                fVarA = fVar2;
            }
            final float f19 = 8;
            g6.f.a aVar4 = g6.f.f75994b;
            p3.x1 x1Var4 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            final long jB4 = d92.b.a(o0VarE).i().a().b();
            final long jA4 = d92.b.a(o0VarE).i().a().a();
            if (i14 >= 0) {
                i25 = size;
            } else if (i14 >= cVar.size()) {
                size = cVar.size() - 1;
                i25 = size;
            } else {
                i25 = i14;
            }
            if (fVarA == null) {
                rVarU = x2.f(h4.r.S, 1.0f);
            } else {
                rVarU = x2.u(h4.r.S, fVarA.f75997a * cVar.size());
            }
            vb.c(c2.l.o(rVar4.then(rVarU), c2.q1.Max), 0.0f, z3.f.c(1700223543, new e23.q() { // from class: b82.h1
                /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z15;
                    qc qcVar = (qc) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    qcVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(qcVar) ? 4 : 2;
                    }
                    int i28 = iIntValue;
                    boolean z16 = true;
                    if (mVar2.n(i28 & 1, (i28 & 19) != 18)) {
                        p3.x1 x1Var5 = p3.n.f135158a;
                        i53.c cVar2 = cVar;
                        int i29 = 0;
                        for (Object obj4 : cVar2) {
                            int i30 = i29 + 1;
                            if (i29 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            g1 g1Var = (g1) obj4;
                            boolean z17 = i29 == i25 ? z16 : false;
                            g6.f fVar4 = fVarA;
                            h4.r rVarC = fVar4 != null ? x2.c(x2.u(h4.r.S, fVar4.f75997a), 1.0f) : x2.c(qcVar.a(h4.r.S, 1.0f, z16), 1.0f);
                            qb qbVar = qb.f89432a;
                            int size2 = cVar2.size();
                            k2.h hVarA = k2.i.a(f19);
                            qbVar.getClass();
                            p3.x1 x1Var6 = p3.n.f135158a;
                            o4.r1 r1VarD = hVarA;
                            if (size2 != z16) {
                                r1VarD = i29 == 0 ? fc.d(hVarA) : i29 == size2 + (-1) ? fc.a(hVarA) : o4.m1.f128891a;
                            }
                            o4.d0.f128823b.getClass();
                            long j8 = o4.d0.f128832k;
                            s7.f89624a.getClass();
                            j2 j2VarA = s7.a(mVar2);
                            ob obVar = j2VarA.f88492k0;
                            if (obVar == null) {
                                n3.m0.f123114a.getClass();
                                n3.m mVar3 = n3.m0.f123122i;
                                long jD = k2.d(j2VarA, mVar3);
                                long jD2 = k2.d(j2VarA, n3.m0.f123123j);
                                n3.m mVar4 = n3.m0.f123120g;
                                long jD3 = k2.d(j2VarA, mVar4);
                                o4.d0.f128823b.getClass();
                                long j14 = o4.d0.f128831j;
                                long jD4 = k2.d(j2VarA, n3.m0.f123124k);
                                long jD5 = k2.d(j2VarA, mVar4);
                                long jD6 = k2.d(j2VarA, mVar3);
                                n3.m mVar5 = n3.m0.f123116c;
                                long jD7 = k2.d(j2VarA, mVar5);
                                float f110 = n3.m0.f123117d;
                                long jC = o4.d0.c(f110, jD7, 14);
                                long jD8 = k2.d(j2VarA, mVar4);
                                float f111 = n3.m0.f123118e;
                                obVar = new ob(jD, jD2, jD3, j14, jD4, jD5, jD6, jC, o4.d0.c(f111, jD8, 14), j14, o4.d0.c(f110, k2.d(j2VarA, mVar5), 14), o4.d0.c(f111, k2.d(j2VarA, mVar4), 14), null);
                                j2VarA.f88492k0 = obVar;
                            }
                            long j15 = jB4;
                            long j16 = j15 != 16 ? j15 : obVar.f89188a;
                            long j17 = j8 != r8 ? j8 : obVar.f89189b;
                            long j18 = j15 != 16 ? j15 : obVar.f89190c;
                            long j19 = jA4;
                            if (j19 == 16) {
                                j19 = obVar.f89191d;
                            }
                            long j24 = j19;
                            long j25 = j8 != r8 ? j8 : obVar.f89192e;
                            if (j15 == 16) {
                                j15 = obVar.f89193f;
                            }
                            ob obVar2 = new ob(j16, j17, j18, j24, j25, j15, j8 != r8 ? j8 : obVar.f89194g, j8 != r8 ? j8 : obVar.f89195h, j8 != r8 ? j8 : obVar.f89196i, j8 != r8 ? j8 : obVar.f89197j, j8 != r8 ? j8 : obVar.f89198k, j8 != r8 ? j8 : obVar.f89199l, null);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar2.B(lVar2) | mVar2.k(i29);
                            Object objQ = mVar2.q();
                            if (zB) {
                                z15 = true;
                                objQ = new au0.m(lVar2, i29, 1);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    z15 = true;
                                    objQ = new au0.m(lVar2, i29, 1);
                                    mVar2.K(objQ);
                                } else {
                                    z15 = true;
                                }
                            }
                            f.f16562a.getClass();
                            qcVar = qcVar;
                            vb.a(qcVar, z17, (e23.a) objQ, r1VarD, rVarC, false, obVar2, null, null, f.f16563b, z3.f.c(-1936554967, new ap2.f(z17, g1Var, 3), mVar2), mVar2, i28 & 14);
                            cVar2 = cVar2;
                            i29 = i30;
                            z16 = z15;
                        }
                        p3.x1 x1Var7 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 384);
            rVar3 = rVar4;
            fVar3 = fVarA;
            f15 = f19;
        } else {
            o0VarE.e();
            f15 = f14;
            rVar3 = rVar2;
            fVar3 = fVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(cVar, i14, rVar3, fVar3, f15, lVar, i15, i16);
        }
    }
}
