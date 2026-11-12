package l72;

import android.graphics.Paint;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class v2 {
    public static final h4.r a(h4.r rVar, boolean z14, e23.q<? super h4.r, ? super p3.m, ? super Integer, ? extends h4.r> qVar, p3.m mVar, int i14) {
        rVar.getClass();
        qVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        if (!z14) {
            mVar.C(98621019);
            mVar.f();
            return rVar;
        }
        mVar.C(98576007);
        h4.r rVarThen = rVar.then(qVar.invoke(h4.r.S, mVar, Integer.valueOf(((i14 >> 3) & 112) | 6)));
        mVar.f();
        return rVarThen;
    }

    public static final <T> h4.r b(h4.r rVar, T t7, e23.r<? super h4.r, ? super T, ? super p3.m, ? super Integer, ? extends h4.r> rVar2, p3.m mVar, int i14) {
        rVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        if (t7 == null) {
            mVar.C(2130602120);
            mVar.f();
            return rVar;
        }
        mVar.C(2130550381);
        h4.r rVarThen = rVar.then(rVar2.invoke(h4.r.S, t7, mVar, Integer.valueOf((i14 & 896) | (((i14 >> 3) & 8) << 3) | 6 | (i14 & 112))));
        mVar.f();
        return rVarThen;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[PHI: r3
      0x0070: PHI (r3v12 float) = (r3v10 float), (r3v13 float) binds: [B:33:0x006e, B:29:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[PHI: r9
      0x008c: PHI (r9v10 float) = (r9v8 float), (r9v11 float) binds: [B:43:0x008a, B:39:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[PHI: r10
      0x00a8: PHI (r10v11 float) = (r10v9 float), (r10v12 float) binds: [B:53:0x00a6, B:49:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3 A[PHI: r11
      0x00c3: PHI (r11v10 float) = (r11v8 float), (r11v11 float) binds: [B:63:0x00c1, B:59:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    public static final h4.r c(h4.r rVar, long j8, float f14, float f15, float f16, float f17, float f18, p3.m mVar, int i14, int i15) {
        final long j14;
        float f19;
        boolean z14;
        final float f22;
        boolean z15;
        final float f24;
        boolean z16;
        final float f25;
        boolean z17;
        Object objQ;
        rVar.getClass();
        if ((i15 & 1) != 0) {
            d92.b.f58623a.getClass();
            j14 = d92.b.a(mVar).e().f63500e;
        } else {
            j14 = j8;
        }
        final float f26 = (i15 & 2) != 0 ? 0.2f : f14;
        p3.x1 x1Var = p3.n.f135158a;
        boolean z18 = ((((i14 & 112) ^ 48) > 32 && mVar.l(j14)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && mVar.i(f26)) || (i14 & 384) == 256);
        if (((57344 & i14) ^ 24576) > 16384) {
            f19 = f16;
            if (mVar.i(f19)) {
                z14 = true;
            }
            boolean z19 = z18 | z14;
            if (((3670016 & i14) ^ 1572864) > 1048576) {
                f22 = f18;
                if (!mVar.i(f22)) {
                    z15 = true;
                }
                boolean z24 = z19 | z15;
                if (((458752 & i14) ^ 196608) > 131072) {
                    f24 = f17;
                    if (!mVar.i(f24)) {
                        z16 = true;
                    }
                    boolean z25 = z24 | z16;
                    if (((i14 & 7168) ^ 3072) > 2048) {
                        f25 = f15;
                        if (!mVar.i(f25)) {
                        }
                        z17 = z25 | z;
                        objQ = mVar.q();
                        if (z17) {
                            final float f27 = f19;
                            e23.l lVar = new e23.l() { // from class: l72.u2
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    float f28 = f26;
                                    long j15 = j14;
                                    int iJ = o4.f0.j(o4.d0.c(f28, j15, 14));
                                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                    o4.y yVarA = fVar.getF142543b().a();
                                    o4.h hVar = new o4.h();
                                    Paint paint = hVar.f128857a;
                                    paint.setColor(iJ2);
                                    paint.setShadowLayer(fVar.s0(f27), fVar.s0(f22), fVar.s0(f24), iJ);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                    float f29 = f25;
                                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f29), fVar.s0(f29), hVar);
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar);
                            objQ = lVar;
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final float f28 = f19;
                                e23.l lVar2 = new e23.l() { // from class: l72.u2
                                    @Override // e23.l
                                    public final Object invoke(Object obj) {
                                        q4.f fVar = (q4.f) obj;
                                        fVar.getClass();
                                        float f29 = f26;
                                        long j15 = j14;
                                        int iJ = o4.f0.j(o4.d0.c(f29, j15, 14));
                                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                        o4.y yVarA = fVar.getF142543b().a();
                                        o4.h hVar = new o4.h();
                                        Paint paint = hVar.f128857a;
                                        paint.setColor(iJ2);
                                        paint.setShadowLayer(fVar.s0(f28), fVar.s0(f22), fVar.s0(f24), iJ);
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                        float f210 = f25;
                                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f210), fVar.s0(f210), hVar);
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(lVar2);
                                objQ = lVar2;
                            }
                        }
                        return l4.k.d(rVar, (e23.l) objQ);
                    }
                    f25 = f15;
                    boolean z26 = (i14 & 3072) == 2048;
                    z17 = z25 | z26;
                    objQ = mVar.q();
                    if (z17) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final float f29 = f19;
                            e23.l lVar3 = new e23.l() { // from class: l72.u2
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    float f210 = f26;
                                    long j15 = j14;
                                    int iJ = o4.f0.j(o4.d0.c(f210, j15, 14));
                                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                    o4.y yVarA = fVar.getF142543b().a();
                                    o4.h hVar = new o4.h();
                                    Paint paint = hVar.f128857a;
                                    paint.setColor(iJ2);
                                    paint.setShadowLayer(fVar.s0(f29), fVar.s0(f22), fVar.s0(f24), iJ);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                    float f211 = f25;
                                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f211), fVar.s0(f211), hVar);
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar3);
                            objQ = lVar3;
                        }
                    } else {
                        final float f210 = f19;
                        e23.l lVar4 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f211 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f211, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f210), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f212 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f212), fVar.s0(f212), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar4);
                        objQ = lVar4;
                    }
                    return l4.k.d(rVar, (e23.l) objQ);
                }
                f24 = f17;
                if ((196608 & i14) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z27 = z24 | z16;
                if (((i14 & 7168) ^ 3072) > 2048) {
                    f25 = f15;
                    if (!mVar.i(f25)) {
                    }
                    z17 = z27 | z26;
                    objQ = mVar.q();
                    if (z17) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final float f211 = f19;
                            e23.l lVar5 = new e23.l() { // from class: l72.u2
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    float f212 = f26;
                                    long j15 = j14;
                                    int iJ = o4.f0.j(o4.d0.c(f212, j15, 14));
                                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                    o4.y yVarA = fVar.getF142543b().a();
                                    o4.h hVar = new o4.h();
                                    Paint paint = hVar.f128857a;
                                    paint.setColor(iJ2);
                                    paint.setShadowLayer(fVar.s0(f211), fVar.s0(f22), fVar.s0(f24), iJ);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                    float f213 = f25;
                                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f213), fVar.s0(f213), hVar);
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar5);
                            objQ = lVar5;
                        }
                    } else {
                        final float f212 = f19;
                        e23.l lVar6 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f213 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f213, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f212), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f214 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f214), fVar.s0(f214), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar6);
                        objQ = lVar6;
                    }
                    return l4.k.d(rVar, (e23.l) objQ);
                }
                f25 = f15;
                if ((i14 & 3072) == 2048) {
                }
                z17 = z27 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f213 = f19;
                        e23.l lVar7 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f214 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f214, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f213), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f215 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f215), fVar.s0(f215), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar7);
                        objQ = lVar7;
                    }
                } else {
                    final float f214 = f19;
                    e23.l lVar8 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f215 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f215, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f214), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f216 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f216), fVar.s0(f216), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar8);
                    objQ = lVar8;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f22 = f18;
            if ((1572864 & i14) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z28 = z19 | z15;
            if (((458752 & i14) ^ 196608) > 131072) {
                f24 = f17;
                if (!mVar.i(f24)) {
                    z16 = true;
                }
                boolean z29 = z28 | z16;
                if (((i14 & 7168) ^ 3072) > 2048) {
                    f25 = f15;
                    if (!mVar.i(f25)) {
                    }
                    z17 = z29 | z26;
                    objQ = mVar.q();
                    if (z17) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final float f215 = f19;
                            e23.l lVar9 = new e23.l() { // from class: l72.u2
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    float f216 = f26;
                                    long j15 = j14;
                                    int iJ = o4.f0.j(o4.d0.c(f216, j15, 14));
                                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                    o4.y yVarA = fVar.getF142543b().a();
                                    o4.h hVar = new o4.h();
                                    Paint paint = hVar.f128857a;
                                    paint.setColor(iJ2);
                                    paint.setShadowLayer(fVar.s0(f215), fVar.s0(f22), fVar.s0(f24), iJ);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                    float f217 = f25;
                                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f217), fVar.s0(f217), hVar);
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar9);
                            objQ = lVar9;
                        }
                    } else {
                        final float f216 = f19;
                        e23.l lVar10 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f217 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f217, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f216), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f218 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f218), fVar.s0(f218), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar10);
                        objQ = lVar10;
                    }
                    return l4.k.d(rVar, (e23.l) objQ);
                }
                f25 = f15;
                if ((i14 & 3072) == 2048) {
                }
                z17 = z29 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f217 = f19;
                        e23.l lVar11 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f218 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f218, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f217), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f219 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f219), fVar.s0(f219), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar11);
                        objQ = lVar11;
                    }
                } else {
                    final float f218 = f19;
                    e23.l lVar12 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f219 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f219, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f218), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f2110 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2110), fVar.s0(f2110), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar12);
                    objQ = lVar12;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f24 = f17;
            if ((196608 & i14) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z210 = z28 | z16;
            if (((i14 & 7168) ^ 3072) > 2048) {
                f25 = f15;
                if (!mVar.i(f25)) {
                }
                z17 = z210 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f219 = f19;
                        e23.l lVar13 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f2110 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f2110, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f219), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f2111 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2111), fVar.s0(f2111), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar13);
                        objQ = lVar13;
                    }
                } else {
                    final float f2110 = f19;
                    e23.l lVar14 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f2111 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f2111, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f2110), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f2112 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2112), fVar.s0(f2112), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar14);
                    objQ = lVar14;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f25 = f15;
            if ((i14 & 3072) == 2048) {
            }
            z17 = z210 | z26;
            objQ = mVar.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final float f2111 = f19;
                    e23.l lVar15 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f2112 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f2112, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f2111), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f2113 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2113), fVar.s0(f2113), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar15);
                    objQ = lVar15;
                }
            } else {
                final float f2112 = f19;
                e23.l lVar16 = new e23.l() { // from class: l72.u2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f2113 = f26;
                        long j15 = j14;
                        int iJ = o4.f0.j(o4.d0.c(f2113, j15, 14));
                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        Paint paint = hVar.f128857a;
                        paint.setColor(iJ2);
                        paint.setShadowLayer(fVar.s0(f2112), fVar.s0(f22), fVar.s0(f24), iJ);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        float f2114 = f25;
                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2114), fVar.s0(f2114), hVar);
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(lVar16);
                objQ = lVar16;
            }
            return l4.k.d(rVar, (e23.l) objQ);
        }
        f19 = f16;
        if ((i14 & 24576) == 16384) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z110 = z18 | z14;
        if (((3670016 & i14) ^ 1572864) > 1048576) {
            f22 = f18;
            if (!mVar.i(f22)) {
                z15 = true;
            }
            boolean z211 = z110 | z15;
            if (((458752 & i14) ^ 196608) > 131072) {
                f24 = f17;
                if (!mVar.i(f24)) {
                    z16 = true;
                }
                boolean z212 = z211 | z16;
                if (((i14 & 7168) ^ 3072) > 2048) {
                    f25 = f15;
                    if (!mVar.i(f25)) {
                    }
                    z17 = z212 | z26;
                    objQ = mVar.q();
                    if (z17) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final float f2113 = f19;
                            e23.l lVar17 = new e23.l() { // from class: l72.u2
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    float f2114 = f26;
                                    long j15 = j14;
                                    int iJ = o4.f0.j(o4.d0.c(f2114, j15, 14));
                                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                    o4.y yVarA = fVar.getF142543b().a();
                                    o4.h hVar = new o4.h();
                                    Paint paint = hVar.f128857a;
                                    paint.setColor(iJ2);
                                    paint.setShadowLayer(fVar.s0(f2113), fVar.s0(f22), fVar.s0(f24), iJ);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                    float f2115 = f25;
                                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2115), fVar.s0(f2115), hVar);
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar17);
                            objQ = lVar17;
                        }
                    } else {
                        final float f2114 = f19;
                        e23.l lVar18 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f2115 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f2115, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f2114), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f2116 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2116), fVar.s0(f2116), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar18);
                        objQ = lVar18;
                    }
                    return l4.k.d(rVar, (e23.l) objQ);
                }
                f25 = f15;
                if ((i14 & 3072) == 2048) {
                }
                z17 = z212 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f2115 = f19;
                        e23.l lVar19 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f2116 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f2116, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f2115), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f2117 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2117), fVar.s0(f2117), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar19);
                        objQ = lVar19;
                    }
                } else {
                    final float f2116 = f19;
                    e23.l lVar110 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f2117 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f2117, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f2116), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f2118 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2118), fVar.s0(f2118), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar110);
                    objQ = lVar110;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f24 = f17;
            if ((196608 & i14) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z213 = z211 | z16;
            if (((i14 & 7168) ^ 3072) > 2048) {
                f25 = f15;
                if (!mVar.i(f25)) {
                }
                z17 = z213 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f2117 = f19;
                        e23.l lVar111 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f2118 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f2118, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f2117), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f2119 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f2119), fVar.s0(f2119), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar111);
                        objQ = lVar111;
                    }
                } else {
                    final float f2118 = f19;
                    e23.l lVar112 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f2119 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f2119, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f2118), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f21110 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21110), fVar.s0(f21110), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar112);
                    objQ = lVar112;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f25 = f15;
            if ((i14 & 3072) == 2048) {
            }
            z17 = z213 | z26;
            objQ = mVar.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final float f2119 = f19;
                    e23.l lVar113 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f21110 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f21110, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f2119), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f21111 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21111), fVar.s0(f21111), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar113);
                    objQ = lVar113;
                }
            } else {
                final float f21110 = f19;
                e23.l lVar114 = new e23.l() { // from class: l72.u2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f21111 = f26;
                        long j15 = j14;
                        int iJ = o4.f0.j(o4.d0.c(f21111, j15, 14));
                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        Paint paint = hVar.f128857a;
                        paint.setColor(iJ2);
                        paint.setShadowLayer(fVar.s0(f21110), fVar.s0(f22), fVar.s0(f24), iJ);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        float f21112 = f25;
                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21112), fVar.s0(f21112), hVar);
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(lVar114);
                objQ = lVar114;
            }
            return l4.k.d(rVar, (e23.l) objQ);
        }
        f22 = f18;
        if ((1572864 & i14) == 1048576) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z214 = z110 | z15;
        if (((458752 & i14) ^ 196608) > 131072) {
            f24 = f17;
            if (!mVar.i(f24)) {
                z16 = true;
            }
            boolean z215 = z214 | z16;
            if (((i14 & 7168) ^ 3072) > 2048) {
                f25 = f15;
                if (!mVar.i(f25)) {
                }
                z17 = z215 | z26;
                objQ = mVar.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final float f21111 = f19;
                        e23.l lVar115 = new e23.l() { // from class: l72.u2
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                float f21112 = f26;
                                long j15 = j14;
                                int iJ = o4.f0.j(o4.d0.c(f21112, j15, 14));
                                int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                                o4.y yVarA = fVar.getF142543b().a();
                                o4.h hVar = new o4.h();
                                Paint paint = hVar.f128857a;
                                paint.setColor(iJ2);
                                paint.setShadowLayer(fVar.s0(f21111), fVar.s0(f22), fVar.s0(f24), iJ);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                                float f21113 = f25;
                                yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21113), fVar.s0(f21113), hVar);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar115);
                        objQ = lVar115;
                    }
                } else {
                    final float f21112 = f19;
                    e23.l lVar116 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f21113 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f21113, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f21112), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f21114 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21114), fVar.s0(f21114), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar116);
                    objQ = lVar116;
                }
                return l4.k.d(rVar, (e23.l) objQ);
            }
            f25 = f15;
            if ((i14 & 3072) == 2048) {
            }
            z17 = z215 | z26;
            objQ = mVar.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final float f21113 = f19;
                    e23.l lVar117 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f21114 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f21114, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f21113), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f21115 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21115), fVar.s0(f21115), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar117);
                    objQ = lVar117;
                }
            } else {
                final float f21114 = f19;
                e23.l lVar118 = new e23.l() { // from class: l72.u2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f21115 = f26;
                        long j15 = j14;
                        int iJ = o4.f0.j(o4.d0.c(f21115, j15, 14));
                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        Paint paint = hVar.f128857a;
                        paint.setColor(iJ2);
                        paint.setShadowLayer(fVar.s0(f21114), fVar.s0(f22), fVar.s0(f24), iJ);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        float f21116 = f25;
                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21116), fVar.s0(f21116), hVar);
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(lVar118);
                objQ = lVar118;
            }
            return l4.k.d(rVar, (e23.l) objQ);
        }
        f24 = f17;
        if ((196608 & i14) == 131072) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z216 = z214 | z16;
        if (((i14 & 7168) ^ 3072) > 2048) {
            f25 = f15;
            if (!mVar.i(f25)) {
            }
            z17 = z216 | z26;
            objQ = mVar.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final float f21115 = f19;
                    e23.l lVar119 = new e23.l() { // from class: l72.u2
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f21116 = f26;
                            long j15 = j14;
                            int iJ = o4.f0.j(o4.d0.c(f21116, j15, 14));
                            int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                            o4.y yVarA = fVar.getF142543b().a();
                            o4.h hVar = new o4.h();
                            Paint paint = hVar.f128857a;
                            paint.setColor(iJ2);
                            paint.setShadowLayer(fVar.s0(f21115), fVar.s0(f22), fVar.s0(f24), iJ);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            float f21117 = f25;
                            yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21117), fVar.s0(f21117), hVar);
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(lVar119);
                    objQ = lVar119;
                }
            } else {
                final float f21116 = f19;
                e23.l lVar1110 = new e23.l() { // from class: l72.u2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f21117 = f26;
                        long j15 = j14;
                        int iJ = o4.f0.j(o4.d0.c(f21117, j15, 14));
                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        Paint paint = hVar.f128857a;
                        paint.setColor(iJ2);
                        paint.setShadowLayer(fVar.s0(f21116), fVar.s0(f22), fVar.s0(f24), iJ);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        float f21118 = f25;
                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21118), fVar.s0(f21118), hVar);
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(lVar1110);
                objQ = lVar1110;
            }
            return l4.k.d(rVar, (e23.l) objQ);
        }
        f25 = f15;
        if ((i14 & 3072) == 2048) {
        }
        z17 = z216 | z26;
        objQ = mVar.q();
        if (z17) {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                final float f21117 = f19;
                e23.l lVar1111 = new e23.l() { // from class: l72.u2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f21118 = f26;
                        long j15 = j14;
                        int iJ = o4.f0.j(o4.d0.c(f21118, j15, 14));
                        int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        Paint paint = hVar.f128857a;
                        paint.setColor(iJ2);
                        paint.setShadowLayer(fVar.s0(f21117), fVar.s0(f22), fVar.s0(f24), iJ);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        float f21119 = f25;
                        yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f21119), fVar.s0(f21119), hVar);
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(lVar1111);
                objQ = lVar1111;
            }
        } else {
            final float f21118 = f19;
            e23.l lVar1112 = new e23.l() { // from class: l72.u2
                @Override // e23.l
                public final Object invoke(Object obj) {
                    q4.f fVar = (q4.f) obj;
                    fVar.getClass();
                    float f21119 = f26;
                    long j15 = j14;
                    int iJ = o4.f0.j(o4.d0.c(f21119, j15, 14));
                    int iJ2 = o4.f0.j(o4.d0.c(0.0f, j15, 14));
                    o4.y yVarA = fVar.getF142543b().a();
                    o4.h hVar = new o4.h();
                    Paint paint = hVar.f128857a;
                    paint.setColor(iJ2);
                    paint.setShadowLayer(fVar.s0(f21118), fVar.s0(f22), fVar.s0(f24), iJ);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                    float f211110 = f25;
                    yVarA.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fVar.s0(f211110), fVar.s0(f211110), hVar);
                    return Unit.INSTANCE;
                }
            };
            mVar.K(lVar1112);
            objQ = lVar1112;
        }
        return l4.k.d(rVar, (e23.l) objQ);
    }
}
