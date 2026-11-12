package i3;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90370a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f90371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f90372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f90373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f90374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f90375f;

    public /* synthetic */ xi(long j8, e23.l lVar, g6.c cVar, p004k6.c0 c0Var, p3.p1 p1Var) {
        this.f90371b = j8;
        this.f90372c = lVar;
        this.f90373d = cVar;
        this.f90374e = c0Var;
        this.f90375f = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x018b A[PHI: r19 r20
      0x018b: PHI (r19v1 boolean) = (r19v0 boolean), (r19v3 boolean), (r19v3 boolean) binds: [B:58:0x01b1, B:52:0x0197, B:47:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r20v1 k6.c0) = (r20v0 k6.c0), (r20v4 k6.c0), (r20v4 k6.c0) binds: [B:58:0x01b1, B:52:0x0197, B:47:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0232, code lost:
    
        r0 = r6;
     */
    @Override // e23.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z14;
        p004k6.c0 c0Var;
        float f14;
        long jFloatToRawIntBits;
        float f15;
        int i14 = this.f90370a;
        long j8 = this.f90371b;
        Object obj4 = this.f90375f;
        Object obj5 = this.f90374e;
        Object obj6 = this.f90373d;
        Object obj7 = this.f90372c;
        switch (i14) {
            case 0:
                g6.c cVar = (g6.c) obj6;
                p004k6.c0 c0Var2 = (p004k6.c0) obj5;
                p3.p1 p1Var = (p3.p1) obj4;
                f5.b1 b1Var = (f5.b1) obj;
                f5.v1 v1VarQ = ((f5.y0) obj2).Q(((g6.a) obj3).f75988a);
                int i15 = v1VarQ.f69144a;
                int i16 = v1VarQ.f69145b;
                int i17 = (int) (j8 >> 32);
                int i18 = (int) (j8 & 4294967295L);
                float f16 = i15;
                float f17 = i16;
                f5.c0 c0Var3 = (f5.c0) ((e23.l) obj7).invoke(b1Var);
                if (c0Var3 != null) {
                    int iF0 = cVar.f0(ej.f88035a);
                    n4.d dVarB = f5.d0.b(c0Var3, true);
                    float f18 = dVarB.f123548b;
                    float f19 = dVarB.f123550d;
                    float f22 = dVarB.f123549c;
                    float f24 = dVarB.f123547a;
                    boolean z15 = c0Var2 instanceof fj;
                    if (z15) {
                        z14 = z15;
                        int i19 = ((fj) c0Var2).f88125a;
                        ti.f89828b.getClass();
                        c0Var = c0Var2;
                        if (i19 == ti.f89831e || i19 == ti.f89832f || i19 == ti.f89833g || i19 == ti.f89834h) {
                            f17 /= 2;
                        } else if (i19 == ti.f89829c) {
                            if ((f18 - f17) - iF0 < 0.0f) {
                                f17 = 0.0f;
                            }
                        } else if (i19 == ti.f89830d) {
                            if (f19 + f17 + iF0 <= i18) {
                                f17 = 0.0f;
                            }
                        } else if ((f18 - f17) - iF0 < 0.0f) {
                            f17 = 0.0f;
                        }
                    } else {
                        z14 = z15;
                        c0Var = c0Var2;
                        if ((f18 - f17) - iF0 < 0.0f) {
                            f17 = 0.0f;
                        }
                    }
                    if (z14) {
                        int i24 = ((fj) c0Var).f88125a;
                        ti.f89828b.getClass();
                        if (i24 == ti.f89831e) {
                            f15 = f22;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f24 - ((float) iF0)) - f16 < 0.0f ? 0.0f : f16)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                            n4.c.a aVar = n4.c.f123541b;
                        } else {
                            f15 = f22;
                            if (i24 == ti.f89832f) {
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f15 + ((float) iF0)) + f16 > ((float) i17) ? f16 : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                n4.c.a aVar2 = n4.c.f123541b;
                            } else if (i24 == ti.f89833g) {
                                float f25 = b1Var.getF68910b() == g6.o.Ltr ? 0.0f : 0.0f;
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f25)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                n4.c.a aVar3 = n4.c.f123541b;
                            } else if (i24 == ti.f89834h) {
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((b1Var.getF68910b() != g6.o.Ltr ? (f24 - ((float) iF0)) - f16 >= 0.0f : (f15 + ((float) iF0)) + f16 > ((float) i17)) ? f16 : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                n4.c.a aVar4 = n4.c.f123541b;
                            } else {
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ej.c(f16, i17, dVarB))) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                n4.c.a aVar5 = n4.c.f123541b;
                            }
                        }
                        f14 = f15;
                    } else {
                        f14 = f22;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ej.c(f16, i17, dVarB))) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                        n4.c.a aVar6 = n4.c.f123541b;
                    }
                    float[] fArrB = o4.a1.b();
                    o4.a1.i(fArrB, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                    if (z14) {
                        int i25 = ((fj) c0Var).f88125a;
                        ti.f89828b.getClass();
                        if (i25 == ti.f89831e) {
                            if ((f24 - iF0) - f16 < 0.0f) {
                                o4.a1.g(90.0f, fArrB);
                            } else {
                                o4.a1.g(-90.0f, fArrB);
                            }
                        } else if (i25 == ti.f89832f) {
                            if (f14 + iF0 + f16 > i17) {
                                o4.a1.g(-90.0f, fArrB);
                            } else {
                                o4.a1.g(90.0f, fArrB);
                            }
                        } else if (i25 == ti.f89833g) {
                            if (b1Var.getF68910b() == g6.o.Ltr) {
                                if ((f24 - iF0) - f16 < 0.0f) {
                                    o4.a1.g(90.0f, fArrB);
                                } else {
                                    o4.a1.g(-90.0f, fArrB);
                                }
                            } else if (f14 + iF0 + f16 > i17) {
                                o4.a1.g(-90.0f, fArrB);
                            } else {
                                o4.a1.g(90.0f, fArrB);
                            }
                        } else if (i25 == ti.f89834h) {
                            if (b1Var.getF68910b() == g6.o.Ltr) {
                                if (f14 + iF0 + f16 > i17) {
                                    o4.a1.g(-90.0f, fArrB);
                                } else {
                                    o4.a1.g(90.0f, fArrB);
                                }
                            } else if ((f24 - iF0) - f16 < 0.0f) {
                                o4.a1.g(90.0f, fArrB);
                            } else {
                                o4.a1.g(-90.0f, fArrB);
                            }
                        } else if (f17 == 0.0f) {
                            o4.a1.f(fArrB);
                        }
                    } else if (f17 == 0.0f) {
                        o4.a1.f(fArrB);
                    }
                    p1Var.setValue(o4.a1.a(fArrB));
                }
                return f5.b1.h0(b1Var, i15, i16, new a03.k0(v1VarQ, 15));
            default:
                Context context = (Context) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                oz1.a aVar7 = (oz1.a) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarF = c2.x2.f(aVar8, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(rVarF, 0.0f, eVar.f97920e, 1);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar9);
                    } else {
                        mVar.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA, mVar);
                    p3.b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    sz1.m.b(context, null, str, str2, mVar, 0);
                    h4.r rVarA2 = c2.l.A(c2.x2.f(aVar8, 1.0f), eVar.f97920e, 0.0f, 2);
                    String strQ = gl1.y.Q(mVar, sz1.m.d(aVar7));
                    d6.h.f57752b.getClass();
                    sz1.m.a(rVarA2, strQ, d6.h.f57757g, o4.d0.a(j8), mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ xi(Context context, String str, String str2, oz1.a aVar, long j8) {
        this.f90372c = context;
        this.f90373d = str;
        this.f90374e = str2;
        this.f90375f = aVar;
        this.f90371b = j8;
    }
}
