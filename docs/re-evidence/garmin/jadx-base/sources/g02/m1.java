package g02;

import c2.x2;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class m1 {
    public static final void a(final long j8, final i53.c cVar, final int i14, final String str, final String str2, h4.r rVar, float f14, float f15, p3.m mVar, final int i15) {
        final h4.r rVar2;
        final float f16;
        final float f17;
        float f18;
        p3.o0 o0Var;
        cVar.getClass();
        str.getClass();
        str2.getClass();
        p3.o0 o0VarE = mVar.E(-1426458666);
        int i16 = i15 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | 14352384;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            final h4.r.a aVar = h4.r.S;
            final float f19 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            final float f22 = 6;
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(-732199900);
            final ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(o4.d0.a(n5.a.a(o0VarE, ((Number) it.next()).intValue())));
            }
            o0VarE.g0(false);
            final int size = cVar.size();
            if (size < 2 || i14 >= size) {
                f18 = f22;
                o0Var = o0VarE;
                o0Var.C(-1221672840);
                o0Var.g0(false);
            } else {
                o0VarE.C(-1223169923);
                h4.r rVarE = u1.n.e(aVar, j8, o4.m1.f128891a);
                f18 = f22;
                z3.e eVarC = z3.f.c(-666036411, new e23.q() { // from class: g02.g1
                    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        c2.w wVar = (c2.w) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        wVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(wVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            float fJ = wVar.j();
                            final int i17 = size;
                            float f24 = i17 - 1;
                            final float f25 = f22;
                            g6.f.a aVar3 = g6.f.f75994b;
                            final float f26 = f19;
                            final float f27 = ((fJ - (f25 * f24)) - f26) / f24;
                            h4.r rVar3 = aVar;
                            float f28 = 8;
                            float f29 = f26 + f28;
                            h4.r rVarF = x2.f(c2.l.C(x2.h(wz1.i.g(rVar3), f29), 0.0f, f28, 0.0f, 0.0f, 13), 1.0f);
                            final ArrayList arrayList2 = arrayList;
                            boolean zR = mVar2.r(arrayList2) | mVar2.k(i17) | mVar2.i(f26) | mVar2.i(f27) | mVar2.i(f25);
                            Object objQ = mVar2.q();
                            p3.m.a aVar4 = p3.m.f135153a;
                            if (zR) {
                                e23.l lVar = new e23.l() { // from class: g02.i1
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        q4.f fVar = (q4.f) obj4;
                                        fVar.getClass();
                                        float f34 = f26;
                                        float fS0 = fVar.s0(f34);
                                        float fS1 = fVar.s0(f27);
                                        float fS2 = fVar.s0(f25);
                                        float fS3 = fVar.s0(f34);
                                        g6.f.a aVar5 = g6.f.f75994b;
                                        m1.c(fVar, arrayList2, i17, fS0, fS1, fS2, fS3, fVar.s0(0));
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(lVar);
                                objQ = lVar;
                            } else {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    e23.l lVar2 = new e23.l() { // from class: g02.i1
                                        @Override // e23.l
                                        public final Object invoke(Object obj4) {
                                            q4.f fVar = (q4.f) obj4;
                                            fVar.getClass();
                                            float f34 = f26;
                                            float fS0 = fVar.s0(f34);
                                            float fS1 = fVar.s0(f27);
                                            float fS2 = fVar.s0(f25);
                                            float fS3 = fVar.s0(f34);
                                            g6.f.a aVar5 = g6.f.f75994b;
                                            m1.c(fVar, arrayList2, i17, fS0, fS1, fS2, fS3, fVar.s0(0));
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(lVar2);
                                    objQ = lVar2;
                                }
                            }
                            u1.n.b(rVarF, (e23.l) objQ, mVar2, 0);
                            g6.f fVarA = g6.f.a((f27 + f25) * i14);
                            g6.f fVarA2 = g6.f.a((wVar.j() - (f26 * 2)) - f25);
                            if (fVarA.compareTo(fVarA2) > 0) {
                                fVarA = fVarA2;
                            }
                            float f34 = fVarA.f75997a;
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97933j, mVar2);
                            h4.r rVarC = c2.l.C(x2.u(rVar3, f27 + f34), f34, f29, 0.0f, 0.0f, 12);
                            String str3 = str2;
                            boolean zB = mVar2.B(str3);
                            Object objQ2 = mVar2.q();
                            if (zB) {
                                objQ2 = new fp0.c(str3, 19);
                                mVar2.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str3, 19);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVarC, false);
                            d6.h.f57752b.getClass();
                            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE);
                o0Var = o0VarE;
                c2.v.a(rVarE, null, false, eVarC, o0Var, 3072, 6);
                o0Var.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            o0VarE = o0Var;
            rVar2 = aVar;
            f17 = f19;
            f16 = f18;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            f16 = f15;
            f17 = f14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(j8, cVar, i14, str, str2, rVar2, f17, f16, i15) { // from class: g02.h1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f74408a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i53.c f74409b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f74410c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f74411d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f74412e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ h4.r f74413f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f74414g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f74415h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    m1.a(this.f74408a, this.f74409b, this.f74410c, this.f74411d, this.f74412e, this.f74413f, this.f74414g, this.f74415h, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[LOOP:0: B:69:0x00ee->B:71:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(final int i14, final i53.c<Integer> cVar, final float f14, final e23.a<Unit> aVar, h4.r rVar, float f15, float f16, float f17, float f18, String str, p3.p1<o4.d0> p1Var, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        String str2;
        int i19;
        p3.p1<o4.d0> p1Var2;
        int i24;
        int i25;
        boolean z14;
        p3.o0 o0Var;
        final h4.r rVar2;
        final float f19;
        final float f22;
        final float f24;
        final String str3;
        final p3.p1<o4.d0> p1Var3;
        final float f25;
        p2 p2VarI0;
        float f26;
        float f27;
        final String str4;
        final ArrayList arrayList;
        Iterator<Integer> it;
        p3.p1<o4.d0> p1Var4;
        final int size;
        final float f28;
        final float f29;
        final p3.p1<o4.d0> p1Var5;
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(-328492563);
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        int i26 = 115040256 | i18;
        int i27 = i17 & 512;
        if (i27 == 0) {
            if ((805306368 & i15) == 0) {
                str2 = str;
                i26 |= o0VarE.B(str2) ? 536870912 : 268435456;
            }
            i19 = i17 & 1024;
            if (i19 != 0) {
                i24 = i16 | 6;
                p1Var2 = p1Var;
            } else if ((i16 & 6) == 0) {
                p1Var2 = p1Var;
                if (o0VarE.B(p1Var2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i16 | i25;
            } else {
                p1Var2 = p1Var;
                i24 = i16;
            }
            if ((i26 & 306783379) == 306783378 || (i24 & 3) != 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i26 & 1, z14)) {
                final h4.r.a aVar2 = h4.r.S;
                final float f34 = 8;
                g6.f.a aVar3 = g6.f.f75994b;
                final float f35 = 6;
                f26 = 24;
                f27 = 4;
                if (i27 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i19 != 0) {
                    p1Var2 = null;
                }
                p3.x1 x1Var = p3.n.f135158a;
                o0VarE.C(2146240027);
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(o4.d0.a(n5.a.a(o0VarE, it.next().intValue())));
                }
                o0VarE.g0(false);
                p1Var4 = p1Var2;
                final long jA = n5.a.a(o0VarE, i14);
                size = cVar.size();
                if (size >= 2 || f14 < 0.0f || f14 > size) {
                    f28 = f27;
                    o0Var = o0VarE;
                    f29 = f26;
                    p1Var5 = p1Var4;
                    o0Var.C(2111436385);
                    o0Var.g0(false);
                } else {
                    o0VarE.C(2109212786);
                    h4.r rVarE = u1.n.e(aVar2, jA, o4.m1.f128891a);
                    boolean z15 = (i26 & 7168) == 2048;
                    Object objQ = o0VarE.q();
                    if (z15) {
                        objQ = new h0(aVar, 3);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar, 3);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                    f28 = f27;
                    o0Var = o0VarE;
                    f29 = f26;
                    p1Var5 = p1Var4;
                    c2.v.a(rVarD, null, false, z3.f.c(-36173092, new e23.q() { // from class: g02.j1
                        /* JADX WARN: Code duplicated, block: B:29:0x0107  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Object obj4;
                            h4.r rVar3;
                            c2.w wVar = (c2.w) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            wVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(wVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                float fJ = wVar.j();
                                final int i28 = size;
                                float f36 = i28 - 1;
                                final float f37 = f35;
                                g6.f.a aVar4 = g6.f.f75994b;
                                float f38 = 2;
                                final float f39 = f29;
                                float f44 = f39 / f38;
                                final float f45 = f28;
                                float f46 = f44 - f45;
                                final float f47 = f34;
                                final float fC = hb.a.c(f46, f38, (fJ - (f37 * f36)) - f47, f36);
                                float f48 = i28 - 1;
                                final float f49 = f14;
                                float fJ2 = f49 == f48 ? (wVar.j() - f45) - f44 : (fC * f49) + (((int) f49) * f37);
                                g6.f fVarA = g6.f.a(fJ2);
                                g6.f fVarA2 = g6.f.a((wVar.j() - f39) + f45);
                                if (fVarA.compareTo(fVarA2) > 0) {
                                    fVarA = fVarA2;
                                }
                                float f50 = fVarA.f75997a;
                                final p3.p1 p1Var6 = p1Var5;
                                final ArrayList arrayList2 = arrayList;
                                if (p1Var6 != null) {
                                    p1Var6.setValue(arrayList2.get((int) f49));
                                }
                                h4.r rVar4 = aVar2;
                                h4.r rVarF = x2.f(x2.h(c2.l.C(wz1.i.g(rVar4), f46, 0.0f, f46, 0.0f, 10), f39), 1.0f);
                                boolean zR = mVar2.r(arrayList2) | mVar2.k(i28) | mVar2.i(f47) | mVar2.i(fC) | mVar2.i(f37) | mVar2.i(f39) | mVar2.B(p1Var6) | mVar2.i(f49) | mVar2.i(fJ2) | mVar2.i(f45);
                                final float f54 = fJ2;
                                final long j8 = jA;
                                boolean zL = zR | mVar2.l(j8);
                                Object objQ2 = mVar2.q();
                                if (zL) {
                                    rVar3 = rVar4;
                                    obj4 = new e23.l() { // from class: g02.l1
                                        @Override // e23.l
                                        public final Object invoke(Object obj5) {
                                            q4.f fVar = (q4.f) obj5;
                                            fVar.getClass();
                                            float f55 = f47;
                                            float fS0 = fVar.s0(f55);
                                            float fS1 = fVar.s0(fC);
                                            float fS2 = fVar.s0(f37);
                                            float fS3 = fVar.s0(f55);
                                            float f56 = f39;
                                            float fS4 = fVar.s0(f56);
                                            ArrayList arrayList3 = arrayList2;
                                            m1.c(fVar, arrayList3, i28, fS0, fS1, fS2, fS3, fS4);
                                            p3.p1 p1Var7 = p1Var6;
                                            long j14 = ((o4.d0) (p1Var7 != null ? p1Var7.getF182175a() : arrayList3.get((int) f49))).f128833a;
                                            float fS5 = fVar.s0(f54);
                                            float fS6 = fVar.s0(f56);
                                            float fS7 = fVar.s0(f45);
                                            float f57 = fS6 / 2.0f;
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f57)) & 4294967295L) | (((long) Float.floatToRawIntBits(fS5)) << 32);
                                            n4.c.a aVar5 = n4.c.f123541b;
                                            q4.f.o0(fVar, j8, f57, jFloatToRawIntBits, null, 0, 120);
                                            q4.f.o0(fVar, j14, f57 - fS7, (((long) Float.floatToRawIntBits(fS5)) << 32) | (((long) Float.floatToRawIntBits(f57)) & 4294967295L), null, 0, 120);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(obj4);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        rVar3 = rVar4;
                                        obj4 = new e23.l() { // from class: g02.l1
                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                q4.f fVar = (q4.f) obj5;
                                                fVar.getClass();
                                                float f55 = f47;
                                                float fS0 = fVar.s0(f55);
                                                float fS1 = fVar.s0(fC);
                                                float fS2 = fVar.s0(f37);
                                                float fS3 = fVar.s0(f55);
                                                float f56 = f39;
                                                float fS4 = fVar.s0(f56);
                                                ArrayList arrayList3 = arrayList2;
                                                m1.c(fVar, arrayList3, i28, fS0, fS1, fS2, fS3, fS4);
                                                p3.p1 p1Var7 = p1Var6;
                                                long j14 = ((o4.d0) (p1Var7 != null ? p1Var7.getF182175a() : arrayList3.get((int) f49))).f128833a;
                                                float fS5 = fVar.s0(f54);
                                                float fS6 = fVar.s0(f56);
                                                float fS7 = fVar.s0(f45);
                                                float f57 = fS6 / 2.0f;
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f57)) & 4294967295L) | (((long) Float.floatToRawIntBits(fS5)) << 32);
                                                n4.c.a aVar5 = n4.c.f123541b;
                                                q4.f.o0(fVar, j8, f57, jFloatToRawIntBits, null, 0, 120);
                                                q4.f.o0(fVar, j14, f57 - fS7, (((long) Float.floatToRawIntBits(fS5)) << 32) | (((long) Float.floatToRawIntBits(f57)) & 4294967295L), null, 0, 120);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(obj4);
                                    } else {
                                        obj4 = objQ2;
                                        rVar3 = rVar4;
                                    }
                                }
                                u1.n.b(rVarF, (e23.l) obj4, mVar2, 0);
                                String str5 = str4;
                                if (str5 != null) {
                                    mVar2.C(406070378);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    mh.c(str5, c2.l.C(rVar3, f50, f39 + 8, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                                    mVar2.f();
                                } else {
                                    mVar2.C(406295686);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var), o0Var, 3072, 6);
                    o0Var.g0(false);
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                f22 = f29;
                f19 = f34;
                f24 = f28;
                p1Var3 = p1Var5;
                rVar2 = aVar2;
                str3 = str4;
                f25 = f35;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                f19 = f15;
                f22 = f17;
                f24 = f18;
                str3 = str2;
                p1Var3 = p1Var2;
                f25 = f16;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: g02.k1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i15 | 1);
                        int iT2 = p3.p0.t(i16);
                        m1.b(i14, cVar, f14, aVar, rVar2, f19, f25, f22, f24, str3, p1Var3, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i26 = 920346624 | i18;
        str2 = str;
        i19 = i17 & 1024;
        if (i19 != 0) {
            i24 = i16 | 6;
            p1Var2 = p1Var;
        } else if ((i16 & 6) == 0) {
            p1Var2 = p1Var;
            if (o0VarE.B(p1Var2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i16 | i25;
        } else {
            p1Var2 = p1Var;
            i24 = i16;
        }
        if ((i26 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i26 & 1, z14)) {
            final h4.r aVar4 = h4.r.S;
            final float f36 = 8;
            g6.f.a aVar5 = g6.f.f75994b;
            final float f37 = 6;
            f26 = 24;
            f27 = 4;
            if (i27 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i19 != 0) {
                p1Var2 = null;
            }
            p3.x1 x1Var3 = p3.n.f135158a;
            o0VarE.C(2146240027);
            arrayList = new ArrayList(p13.y.r(cVar, 10));
            it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(o4.d0.a(n5.a.a(o0VarE, it.next().intValue())));
            }
            o0VarE.g0(false);
            p1Var4 = p1Var2;
            final long jA2 = n5.a.a(o0VarE, i14);
            size = cVar.size();
            if (size >= 2) {
                f28 = f27;
                o0Var = o0VarE;
                f29 = f26;
                p1Var5 = p1Var4;
                o0Var.C(2111436385);
                o0Var.g0(false);
            } else {
                f28 = f27;
                o0Var = o0VarE;
                f29 = f26;
                p1Var5 = p1Var4;
                o0Var.C(2111436385);
                o0Var.g0(false);
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            f22 = f29;
            f19 = f36;
            f24 = f28;
            p1Var3 = p1Var5;
            rVar2 = aVar4;
            str3 = str4;
            f25 = f37;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            f19 = f15;
            f22 = f17;
            f24 = f18;
            str3 = str2;
            p1Var3 = p1Var2;
            f25 = f16;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: g02.k1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    int iT2 = p3.p0.t(i16);
                    m1.b(i14, cVar, f14, aVar, rVar2, f19, f25, f22, f24, str3, p1Var3, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(q4.f fVar, ArrayList arrayList, int i14, float f14, float f15, float f16, float f17, float f18) {
        float f19 = (f18 - f14) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        long j8 = ((o4.d0) arrayList.get(0)).f128833a;
        fVar.getClass();
        o4.j jVarA = o4.m.a();
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        n4.c.a aVar = n4.c.f123541b;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f15);
        long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f14)) & 4294967295L;
        n4.g.a aVar2 = n4.g.f123559b;
        jVarA.k(n4.f.b(g8.i.g(jFloatToRawIntBits2, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32)), jFloatToRawIntBits, 0L, 0L, jFloatToRawIntBits, 12), o4.f1.b.CounterClockwise);
        q4.f.L(fVar, jVarA, j8, 0.0f, null, 60);
        if (i14 > 2) {
            int i15 = i14 - 2;
            int i16 = 0;
            while (i16 < i15) {
                i16++;
                q4.f.A0(fVar, ((o4.d0) arrayList.get(i16)).f128833a, (((long) Float.floatToRawIntBits(((f15 + f16) * i16) + 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), 0.0f, null, null, 120);
            }
        }
        long j14 = ((o4.d0) arrayList.get(i14 - 1)).f128833a;
        o4.j jVarA2 = o4.m.a();
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() >> 32)) - f14)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L);
        n4.c.a aVar3 = n4.c.f123541b;
        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.g.a aVar4 = n4.g.f123559b;
        jVarA2.k(n4.f.b(g8.i.g(jFloatToRawIntBits5, jFloatToRawIntBits6), 0L, jFloatToRawIntBits, jFloatToRawIntBits, 0L, 18), o4.f1.b.CounterClockwise);
        q4.f.L(fVar, jVarA2, j14, 0.0f, null, 60);
    }
}
