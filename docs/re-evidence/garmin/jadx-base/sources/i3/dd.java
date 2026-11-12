package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/dd;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dd f87874a = new dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f87875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f87876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o4.j f87877d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", l = {1216}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f87879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f4.s<a2.h> f87880c;

        /* JADX INFO: renamed from: i3.dd$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1733a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f4.s<a2.h> f87881a;

            public C1733a(f4.s<a2.h> sVar) {
                this.f87881a = sVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                a2.h hVar = (a2.h) obj;
                boolean z14 = hVar instanceof a2.l.b;
                f4.s<a2.h> sVar = this.f87881a;
                if (z14) {
                    sVar.add(hVar);
                } else if (hVar instanceof a2.l.c) {
                    sVar.remove(((a2.l.c) hVar).f498a);
                } else if (hVar instanceof a2.l.a) {
                    sVar.remove(((a2.l.a) hVar).f496a);
                } else if (hVar instanceof a2.a.b) {
                    sVar.add(hVar);
                } else if (hVar instanceof a2.a.c) {
                    sVar.remove(((a2.a.c) hVar).f482a);
                } else if (hVar instanceof a2.a.C0002a) {
                    sVar.remove(((a2.a.C0002a) hVar).f481a);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a2.j jVar, f4.s<a2.h> sVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f87879b = jVar;
            this.f87880c = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f87879b, this.f87880c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87878a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.i<a2.h> iVarC = this.f87879b.c();
                C1733a c1733a = new C1733a(this.f87880c);
                this.f87878a = 1;
                if (iVarC.collect(c1733a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<q4.f, n4.c, o4.d0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87882a = new b();

        @Override // e23.q
        public final Unit invoke(q4.f fVar, n4.c cVar, o4.d0 d0Var) {
            long j8 = cVar.f123544a;
            long j14 = d0Var.f128833a;
            dd.f87874a.getClass();
            dd.h(fVar, j8, dd.f87876c, j14);
            return Unit.INSTANCE;
        }
    }

    static {
        n3.x0.f123303a.getClass();
        float f14 = n3.x0.f123318p;
        f87875b = f14;
        f87876c = f14;
        f87877d = o4.m.a();
    }

    private dd() {
    }

    public static uc f(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return k(s7.a(mVar));
    }

    public static uc g(long j8, long j14, long j15, long j16, long j17, p3.m mVar, int i14) {
        long j18;
        long j19;
        if ((i14 & 4) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j15;
        }
        if ((i14 & 16) != 0) {
            o4.d0.f128823b.getClass();
            j19 = o4.d0.f128832k;
        } else {
            j19 = j17;
        }
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j24 = o4.d0.f128832k;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        uc ucVarK = k(s7.a(mVar));
        long j25 = j8 != 16 ? j8 : ucVarK.f89899a;
        long j26 = j14 != 16 ? j14 : ucVarK.f89900b;
        if (j18 == 16) {
            j18 = ucVarK.f89901c;
        }
        long j27 = j18;
        long j28 = j16 != 16 ? j16 : ucVarK.f89902d;
        if (j19 == 16) {
            j19 = ucVarK.f89903e;
        }
        long j29 = j19;
        long j34 = j24 != 16 ? j24 : ucVarK.f89904f;
        long j35 = j24 != 16 ? j24 : ucVarK.f89905g;
        long j36 = j24 != 16 ? j24 : ucVarK.f89906h;
        long j37 = j24 != 16 ? j24 : ucVarK.f89907i;
        if (j24 == 16) {
            j24 = ucVarK.f89908j;
        }
        return new uc(j25, j26, j27, j28, j29, j34, j35, j36, j37, j24, null);
    }

    public static void h(q4.f fVar, long j8, float f14, long j14) {
        q4.f.o0(fVar, j14, fVar.s0(f14) / 2.0f, j8, null, 0, 120);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0450  */
    /* JADX WARN: Code duplicated, block: B:86:0x0209  */
    public static void i(q4.f fVar, float[] fArr, float f14, float f15, long j8, long j14, long j15, long j16, float f16, float f17, float f18, float f19, float f22, float f24, float f25, e23.p pVar, e23.q qVar, boolean z14, p008y1.b2 b2Var) {
        float f26;
        float f27;
        float f28;
        float f29;
        float f34;
        int i14;
        float f35;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        float f36;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        long jFloatToRawIntBits5;
        long jFloatToRawIntBits6;
        int iFloatToRawIntBits;
        long jFloatToRawIntBits7;
        long jFloatToRawIntBits8;
        long jFloatToRawIntBits9;
        long jFloatToRawIntBits10;
        long jFloatToRawIntBits11;
        long jFloatToRawIntBits12;
        long jFloatToRawIntBits13;
        float fS0;
        float fS1;
        float fS2;
        q4.f fVar2 = fVar;
        boolean z15 = b2Var == p008y1.b2.Vertical;
        boolean z16 = fVar2.getLayoutDirection() == g6.o.Rtl;
        boolean z17 = z16 && !z15;
        float fS3 = fVar2.s0(f25);
        long jB = fVar2.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (z15 ? jB & 4294967295L : jB >> 32));
        boolean z18 = p005kotlin.jvm.internal.s.b(f14, p13.u.G(fArr)) || p005kotlin.jvm.internal.s.b(f14, p13.u.S(fArr));
        float fA = (fArr.length == 0 || (p005kotlin.jvm.internal.s.b(f15, p13.u.G(fArr)) || p005kotlin.jvm.internal.s.b(f15, p13.u.S(fArr)))) ? j20.x.a(fIntBitsToFloat, 0.0f, f15, 0.0f) : (((fIntBitsToFloat - 0.0f) - (2 * fS3)) * f15) + 0.0f + fS3;
        float fA2 = (fArr.length == 0 || z18) ? j20.x.a(fIntBitsToFloat, 0.0f, f14, 0.0f) : (((fIntBitsToFloat - 0.0f) - (2 * fS3)) * f14) + 0.0f + fS3;
        float fS4 = fVar2.s0(f24);
        if (g6.f.b(f22, 0) > 0) {
            if (z15) {
                float f37 = 2;
                fS0 = fVar2.s0(f22) + (fVar2.s0(f17) / f37);
                fS1 = fVar2.s0(f19) / f37;
                fS2 = fVar2.s0(f22);
            } else {
                float f38 = 2;
                fS0 = fVar2.s0(f22) + (fVar2.s0(f16) / f38);
                fS1 = fVar2.s0(f18) / f38;
                fS2 = fVar2.s0(f22);
            }
            f26 = fS2 + fS1;
            f27 = fS0;
        } else {
            f26 = 0.0f;
            f27 = 0.0f;
        }
        long jI1 = fVar2.i1();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z15 ? jI1 & 4294967295L : jI1 >> 32));
        float f39 = f27 + 0.0f + fS3;
        if (!z14 || fA2 <= f39) {
            f28 = fIntBitsToFloat;
            f29 = 0.0f;
        } else {
            float f44 = z17 ? fS4 : fS3;
            float f45 = z17 ? fS3 : fS4;
            float f46 = fA2 - f27;
            if (z17) {
                jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)) - f46)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
            } else {
                jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar2 = n4.c.f123541b;
            }
            if (z15) {
                f29 = 0.0f;
                jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f46 - 0.0f)) & 4294967295L);
                n4.g.a aVar3 = n4.g.f123559b;
            } else {
                f29 = 0.0f;
                jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f46 - 0.0f)) << 32);
                n4.g.a aVar4 = n4.g.f123559b;
            }
            f28 = fIntBitsToFloat;
            j(fVar2, b2Var, jFloatToRawIntBits9, jFloatToRawIntBits10, j8, f44, f45);
            if (z15) {
                jFloatToRawIntBits11 = ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() >> 32)))) << 32;
                jFloatToRawIntBits12 = ((long) Float.floatToRawIntBits(fS3 + f29)) & 4294967295L;
            } else {
                if (z16) {
                    jFloatToRawIntBits13 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVar2.b() >> 32)) - f29) - fS3)) << 32);
                } else {
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L));
                    long jFloatToRawIntBits14 = Float.floatToRawIntBits(fS3 + f29);
                    long jFloatToRawIntBits15 = Float.floatToRawIntBits(fIntBitsToFloat3);
                    jFloatToRawIntBits11 = jFloatToRawIntBits14 << 32;
                    jFloatToRawIntBits12 = jFloatToRawIntBits15 & 4294967295L;
                }
                if (pVar != null) {
                    pVar.invoke(fVar2, n4.c.a(jFloatToRawIntBits13));
                    Unit unit = Unit.INSTANCE;
                }
            }
            jFloatToRawIntBits13 = jFloatToRawIntBits11 | jFloatToRawIntBits12;
            if (pVar != null) {
                pVar.invoke(fVar2, n4.c.a(jFloatToRawIntBits13));
                Unit unit2 = Unit.INSTANCE;
            }
        }
        if (fA < (f28 - f26) - fS3) {
            float f47 = z17 ? fS3 : fS4;
            float f48 = z17 ? fS4 : fS3;
            float f49 = fA + f26;
            float f50 = f28 - f49;
            if (z15) {
                jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f49)) & 4294967295L);
                n4.c.a aVar5 = n4.c.f123541b;
            } else if (z16) {
                jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                n4.c.a aVar6 = n4.c.f123541b;
            } else {
                jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f49)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                n4.c.a aVar7 = n4.c.f123541b;
            }
            if (z15) {
                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)))) << 32);
                n4.g.a aVar8 = n4.g.f123559b;
            } else if (!z16 || z14) {
                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f50)) << 32);
                n4.g.a aVar9 = n4.g.f123559b;
            } else {
                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() >> 32)) - f49)) << 32);
                n4.g.a aVar10 = n4.g.f123559b;
            }
            long j17 = jFloatToRawIntBits5;
            fVar2 = fVar;
            j(fVar2, b2Var, jFloatToRawIntBits4, j17, j8, f47, f48);
            if (z15) {
                jFloatToRawIntBits7 = ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() >> 32)))) << 32;
                jFloatToRawIntBits8 = ((long) Float.floatToRawIntBits(f28 - fS3)) & 4294967295L;
            } else {
                if (z16) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L));
                    jFloatToRawIntBits6 = Float.floatToRawIntBits(fS3);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                } else {
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L));
                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f28 - fS3);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
                }
                long j18 = iFloatToRawIntBits;
                jFloatToRawIntBits7 = jFloatToRawIntBits6 << 32;
                jFloatToRawIntBits8 = j18 & 4294967295L;
            }
            long j19 = jFloatToRawIntBits7 | jFloatToRawIntBits8;
            if (pVar != null) {
                pVar.invoke(fVar2, n4.c.a(j19));
                Unit unit3 = Unit.INSTANCE;
            }
        }
        float f54 = z14 ? fA2 + f27 : f29;
        float f55 = fA - f26;
        float f56 = (z17 || z14) ? fS4 : fS3;
        float f57 = (!z17 || z14) ? fS4 : fS3;
        float f58 = (!z17 || z14) ? f55 - f54 : f55;
        if (f58 > f56) {
            if (z15) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f54)) & 4294967295L);
                n4.c.a aVar11 = n4.c.f123541b;
            } else if (z16) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)) - f55)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                n4.c.a aVar12 = n4.c.f123541b;
            } else {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f54)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                n4.c.a aVar13 = n4.c.f123541b;
            }
            if (z15) {
                f36 = f55;
                jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f58)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)))) << 32);
                n4.g.a aVar14 = n4.g.f123559b;
            } else {
                f36 = f55;
                if (!z16 || z14) {
                    jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f58)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L);
                    n4.g.a aVar15 = n4.g.f123559b;
                } else {
                    jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f36)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L);
                    n4.g.a aVar16 = n4.g.f123559b;
                }
            }
            f34 = f36;
            long j24 = jFloatToRawIntBits3;
            fVar2 = fVar;
            j(fVar2, b2Var, jFloatToRawIntBits2, j24, j14, f56, f57);
        } else {
            f34 = f55;
        }
        float f59 = f29 + fS3;
        float f64 = f28 - fS3;
        j23.e eVar = new j23.e(f54, f34);
        new j23.e(fIntBitsToFloat2 - f26, fIntBitsToFloat2 + f26);
        j23.e eVar2 = new j23.e(fA2 - f27, fA2 + f27);
        j23.e eVar3 = new j23.e(fA - f26, fA + f26);
        int length = fArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            float f65 = fArr[i16];
            int i17 = i15 + 1;
            if (pVar == null || !((z14 && i15 == 0) || i15 == fArr.length - 1)) {
                float fJ = gl.b.J(f59, f64, f65);
                if ((z14 && eVar2.contains(Float.valueOf(fJ))) || eVar3.contains(Float.valueOf(fJ))) {
                    i14 = length;
                    f35 = f64;
                } else {
                    if (z15) {
                        i14 = length;
                        f35 = f64;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fJ)) & 4294967295L);
                        n4.c.a aVar17 = n4.c.f123541b;
                    } else {
                        i14 = length;
                        f35 = f64;
                        if (z16) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)) - fJ)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L)))) & 4294967295L);
                            n4.c.a aVar18 = n4.c.f123541b;
                        } else {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.i1() & 4294967295L)))) & 4294967295L);
                            n4.c.a aVar19 = n4.c.f123541b;
                        }
                    }
                    qVar.invoke(fVar2, n4.c.a(jFloatToRawIntBits), o4.d0.a(eVar.contains(Float.valueOf(fJ)) ? j16 : j15));
                }
            } else {
                i14 = length;
                f35 = f64;
            }
            i16++;
            f64 = f35;
            length = i14;
            i15 = i17;
        }
    }

    public static void j(q4.f fVar, p008y1.b2 b2Var, long j8, long j14, long j15, float f14, float f15) {
        n4.e eVarA;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        if (b2Var == p008y1.b2.Vertical) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            n4.g.a aVar = n4.g.f123559b;
            eVarA = n4.f.a(g8.i.g(j8, jFloatToRawIntBits3), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 >> 32));
            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
            n4.g.a aVar2 = n4.g.f123559b;
            eVarA = n4.f.a(g8.i.g(j8, jFloatToRawIntBits4), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        o4.j jVar = f87877d;
        jVar.k(eVarA, o4.f1.b.CounterClockwise);
        q4.f.L(fVar, jVar, j15, 0.0f, null, 60);
        jVar.rewind();
    }

    public static uc k(j2 j2Var) {
        uc ucVar = j2Var.f88494l0;
        if (ucVar != null) {
            return ucVar;
        }
        n3.x0.f123303a.getClass();
        long jD = k2.d(j2Var, n3.x0.f123312j);
        n3.m mVar = n3.x0.f123305c;
        long jD2 = k2.d(j2Var, mVar);
        n3.m mVar2 = n3.x0.f123316n;
        long jD3 = k2.d(j2Var, mVar2);
        long jD4 = k2.d(j2Var, mVar2);
        long jD5 = k2.d(j2Var, mVar);
        long jG = o4.f0.g(o4.d0.c(n3.x0.f123309g, k2.d(j2Var, n3.x0.f123308f), 14), j2Var.f88501p);
        n3.m mVar3 = n3.x0.f123306d;
        long jD6 = k2.d(j2Var, mVar3);
        float f14 = n3.x0.f123307e;
        long jC = o4.d0.c(f14, jD6, 14);
        n3.m mVar4 = n3.x0.f123310h;
        long jD7 = k2.d(j2Var, mVar4);
        float f15 = n3.x0.f123311i;
        uc ucVar2 = new uc(jD, jD2, jD3, jD4, jD5, jG, jC, o4.d0.c(f15, jD7, 14), o4.d0.c(f15, k2.d(j2Var, mVar4), 14), o4.d0.c(f14, k2.d(j2Var, mVar3), 14), null);
        j2Var.f88494l0 = ucVar2;
        return ucVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void a(final a2.j jVar, h4.r rVar, final uc ucVar, boolean z14, long j8, p3.m mVar, final int i14, final int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        int i19;
        dd ddVar;
        boolean z16;
        final long j14;
        final h4.r rVar3;
        final boolean z17;
        p3.p2 p2VarI0;
        h4.r rVar4;
        long j15;
        Object objQ;
        p3.m.a.C2565a c2565a;
        f4.s sVar;
        boolean z18;
        Object objQ2;
        long jFloatToRawIntBits;
        long j16;
        int i24;
        int i25;
        p3.o0 o0VarE = mVar.E(-290277409);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.B(ucVar)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i16 |= i25;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 24576;
                if ((196608 & i14) == 0) {
                    ddVar = this;
                    if (o0VarE.B(ddVar)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i19 |= i24;
                } else {
                    ddVar = this;
                }
                if ((74899 & i19) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i26 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        j15 = kd.f88706c;
                    } else {
                        o0VarE.e();
                        rVar4 = rVar2;
                        j15 = j8;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f4.s();
                        o0VarE.K(objQ);
                    }
                    sVar = (f4.s) objQ;
                    z18 = (i19 & 14) == 4;
                    objQ2 = o0VarE.q();
                    if (z18 || objQ2 == c2565a) {
                        objQ2 = new a(jVar, sVar, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, jVar, o0VarE);
                    if (sVar.isEmpty()) {
                        jFloatToRawIntBits = j15;
                    } else {
                        float fC = g6.h.c(j15) / 2;
                        g6.f.a aVar = g6.f.f75994b;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g6.h.b(j15))) & 4294967295L) | (((long) Float.floatToRawIntBits(fC)) << 32);
                    }
                    c2.k0 k0Var = c2.x2.f22930a;
                    h4.r rVarA = u1.u0.a(c2.x2.r(rVar4, g6.h.c(jFloatToRawIntBits), g6.h.b(jFloatToRawIntBits)), jVar);
                    if (z15) {
                        j16 = ucVar.f89899a;
                    } else {
                        j16 = ucVar.f89904f;
                    }
                    n3.x0.f123303a.getClass();
                    c2.l.f(u1.n.e(rVarA, j16, fc.c(n3.x0.f123314l, o0VarE)), o0VarE);
                    rVar3 = rVar4;
                    j14 = j15;
                } else {
                    o0VarE.e();
                    j14 = j8;
                    rVar3 = rVar2;
                }
                z17 = z15;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final dd ddVar2 = ddVar;
                    p2VarI0.f135219d = new e23.p() { // from class: i3.bd
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            dd ddVar3 = dd.f87874a;
                            this.f87587a.a(jVar, rVar3, ucVar, z17, j14, mVar2, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i16 |= 3072;
            z15 = z14;
            i19 = i16 | 24576;
            if ((196608 & i14) == 0) {
                ddVar = this;
                if (o0VarE.B(ddVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i19 |= i24;
            } else {
                ddVar = this;
            }
            if ((74899 & i19) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    j15 = kd.f88706c;
                } else {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    j15 = kd.f88706c;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new f4.s();
                    o0VarE.K(objQ);
                }
                sVar = (f4.s) objQ;
                if ((i19 & 14) == 4) {
                }
                objQ2 = o0VarE.q();
                if (z18) {
                    objQ2 = new a(jVar, sVar, null);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new a(jVar, sVar, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, jVar, o0VarE);
                if (sVar.isEmpty()) {
                    float fC2 = g6.h.c(j15) / 2;
                    g6.f.a aVar2 = g6.f.f75994b;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g6.h.b(j15))) & 4294967295L) | (((long) Float.floatToRawIntBits(fC2)) << 32);
                } else {
                    jFloatToRawIntBits = j15;
                }
                c2.k0 k0Var2 = c2.x2.f22930a;
                h4.r rVarA2 = u1.u0.a(c2.x2.r(rVar4, g6.h.c(jFloatToRawIntBits), g6.h.b(jFloatToRawIntBits)), jVar);
                if (z15) {
                    j16 = ucVar.f89899a;
                } else {
                    j16 = ucVar.f89904f;
                }
                n3.x0.f123303a.getClass();
                c2.l.f(u1.n.e(rVarA2, j16, fc.c(n3.x0.f123314l, o0VarE)), o0VarE);
                rVar3 = rVar4;
                j14 = j15;
            } else {
                o0VarE.e();
                j14 = j8;
                rVar3 = rVar2;
            }
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final dd ddVar3 = ddVar;
                p2VarI0.f135219d = new e23.p() { // from class: i3.bd
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        dd ddVar4 = dd.f87874a;
                        this.f87587a.a(jVar, rVar3, ucVar, z17, j14, mVar2, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.B(ucVar)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i16 |= i25;
        }
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i16 | 24576;
            if ((196608 & i14) == 0) {
                ddVar = this;
                if (o0VarE.B(ddVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i19 |= i24;
            } else {
                ddVar = this;
            }
            if ((74899 & i19) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    j15 = kd.f88706c;
                } else {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    j15 = kd.f88706c;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new f4.s();
                    o0VarE.K(objQ);
                }
                sVar = (f4.s) objQ;
                if ((i19 & 14) == 4) {
                }
                objQ2 = o0VarE.q();
                if (z18) {
                    objQ2 = new a(jVar, sVar, null);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new a(jVar, sVar, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, jVar, o0VarE);
                if (sVar.isEmpty()) {
                    float fC3 = g6.h.c(j15) / 2;
                    g6.f.a aVar3 = g6.f.f75994b;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g6.h.b(j15))) & 4294967295L) | (((long) Float.floatToRawIntBits(fC3)) << 32);
                } else {
                    jFloatToRawIntBits = j15;
                }
                c2.k0 k0Var3 = c2.x2.f22930a;
                h4.r rVarA3 = u1.u0.a(c2.x2.r(rVar4, g6.h.c(jFloatToRawIntBits), g6.h.b(jFloatToRawIntBits)), jVar);
                if (z15) {
                    j16 = ucVar.f89899a;
                } else {
                    j16 = ucVar.f89904f;
                }
                n3.x0.f123303a.getClass();
                c2.l.f(u1.n.e(rVarA3, j16, fc.c(n3.x0.f123314l, o0VarE)), o0VarE);
                rVar3 = rVar4;
                j14 = j15;
            } else {
                o0VarE.e();
                j14 = j8;
                rVar3 = rVar2;
            }
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final dd ddVar4 = ddVar;
                p2VarI0.f135219d = new e23.p() { // from class: i3.bd
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        dd ddVar5 = dd.f87874a;
                        this.f87587a.a(jVar, rVar3, ucVar, z17, j14, mVar2, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 3072;
        z15 = z14;
        i19 = i16 | 24576;
        if ((196608 & i14) == 0) {
            ddVar = this;
            if (o0VarE.B(ddVar)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i19 |= i24;
        } else {
            ddVar = this;
        }
        if ((74899 & i19) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                j15 = kd.f88706c;
            } else {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                j15 = kd.f88706c;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f4.s();
                o0VarE.K(objQ);
            }
            sVar = (f4.s) objQ;
            if ((i19 & 14) == 4) {
            }
            objQ2 = o0VarE.q();
            if (z18) {
                objQ2 = new a(jVar, sVar, null);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new a(jVar, sVar, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, jVar, o0VarE);
            if (sVar.isEmpty()) {
                float fC4 = g6.h.c(j15) / 2;
                g6.f.a aVar4 = g6.f.f75994b;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g6.h.b(j15))) & 4294967295L) | (((long) Float.floatToRawIntBits(fC4)) << 32);
            } else {
                jFloatToRawIntBits = j15;
            }
            c2.k0 k0Var4 = c2.x2.f22930a;
            h4.r rVarA4 = u1.u0.a(c2.x2.r(rVar4, g6.h.c(jFloatToRawIntBits), g6.h.b(jFloatToRawIntBits)), jVar);
            if (z15) {
                j16 = ucVar.f89899a;
            } else {
                j16 = ucVar.f89904f;
            }
            n3.x0.f123303a.getClass();
            c2.l.f(u1.n.e(rVarA4, j16, fc.c(n3.x0.f123314l, o0VarE)), o0VarE);
            rVar3 = rVar4;
            j14 = j15;
        } else {
            o0VarE.e();
            j14 = j8;
            rVar3 = rVar2;
        }
        z17 = z15;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final dd ddVar5 = ddVar;
            p2VarI0.f135219d = new e23.p() { // from class: i3.bd
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    dd ddVar6 = dd.f87874a;
                    this.f87587a.a(jVar, rVar3, ucVar, z17, j14, mVar2, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final cb cbVar, h4.r rVar, final boolean z14, final uc ucVar, e23.p pVar, e23.q qVar, float f14, float f15, p3.m mVar, final int i14) {
        int i15;
        final h4.r rVar2;
        final e23.p pVar2;
        final e23.q qVar2;
        final float f16;
        final float f17;
        int i16;
        p3.o0 o0VarE = mVar.E(-541824132);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(cbVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i17 = i15 | 48;
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(ucVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= 8192;
        }
        int i18 = i17 | 14352384;
        if ((100663296 & i14) == 0) {
            i18 |= o0VarE.B(this) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i18 & 1, (38347923 & i18) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r.a aVar = h4.r.S;
                boolean z15 = ((((i18 & 7168) ^ 3072) > 2048 && o0VarE.B(ucVar)) || (i18 & 3072) == 2048) | ((i18 & 896) == 256);
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (z15) {
                    objQ = new wc(ucVar, z14, 0);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wc(ucVar, z14, 0);
                        o0VarE.K(objQ);
                    }
                }
                e23.p pVar3 = (e23.p) objQ;
                i16 = i18 & (-57345);
                Object objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = ed.f87998a;
                    o0VarE.K(objQ2);
                }
                float f18 = kd.f88707d;
                f17 = kd.f88708e;
                f16 = f18;
                qVar2 = (e23.q) objQ2;
                pVar2 = pVar3;
                rVar2 = aVar;
            } else {
                o0VarE.e();
                i16 = i18 & (-57345);
                rVar2 = rVar;
                pVar2 = pVar;
                qVar2 = qVar;
                f16 = f14;
                f17 = f15;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.f75994b.getClass();
            int i19 = (i16 & 14) | 48;
            int i24 = i16 << 3;
            e(cbVar, g6.f.f75996d, rVar2, z14, ucVar, pVar2, qVar2, f16, f17, o0VarE, i19 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192));
        } else {
            o0VarE.e();
            rVar2 = rVar;
            pVar2 = pVar;
            qVar2 = qVar;
            f16 = f14;
            f17 = f15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.xc
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    dd ddVar = dd.f87874a;
                    this.f90319a.b(cbVar, rVar2, z14, ucVar, pVar2, qVar2, f16, f17, mVar2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final void c(final ud udVar, h4.r rVar, boolean z14, final uc ucVar, e23.p<? super q4.f, ? super n4.c, Unit> pVar, e23.q<? super q4.f, ? super n4.c, ? super o4.d0, Unit> qVar, float f14, float f15, p3.m mVar, final int i14, final int i15) {
        int i16;
        final h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        int i19;
        boolean z16;
        final e23.p<? super q4.f, ? super n4.c, Unit> pVar2;
        final float f16;
        final float f17;
        final boolean z17;
        final e23.q<? super q4.f, ? super n4.c, ? super o4.d0, Unit> qVar2;
        p3.p2 p2VarI0;
        h4.r rVar3;
        boolean z18;
        Object objQ;
        p3.m.a aVar;
        int i24;
        Object objQ2;
        int i25;
        int i26;
        p3.o0 o0VarE = mVar.E(49984771);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(udVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.B(ucVar)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i16 |= i26;
                }
                if ((i14 & 24576) == 0) {
                    i16 |= 8192;
                }
                i19 = i16 | 14352384;
                if ((100663296 & i14) != 0) {
                    if (o0VarE.B(this)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i19 |= i25;
                }
                if ((38347923 & i19) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i27 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                        objQ = o0VarE.q();
                        aVar = p3.m.f135153a;
                        if (z18) {
                            objQ = new wc(ucVar, z15, 1);
                            o0VarE.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new wc(ucVar, z15, 1);
                                o0VarE.K(objQ);
                            }
                        }
                        e23.p<? super q4.f, ? super n4.c, Unit> pVar3 = (e23.p) objQ;
                        i24 = i19 & (-57345);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = b.f87882a;
                            o0VarE.K(objQ2);
                        }
                        float f18 = kd.f88707d;
                        f17 = kd.f88708e;
                        boolean z19 = z15;
                        qVar2 = (e23.q) objQ2;
                        z17 = z19;
                        f16 = f18;
                        pVar2 = pVar3;
                        rVar2 = rVar3;
                    } else {
                        o0VarE.e();
                        i24 = i19 & (-57345);
                        pVar2 = pVar;
                        f16 = f14;
                        f17 = f15;
                        z17 = z15;
                        qVar2 = qVar;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.f75994b.getClass();
                    int i28 = i24 << 3;
                    d(udVar, g6.f.f75996d, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, o0VarE, 805306416 | (i24 & 14) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024), ((i24 >> 21) & 112) | 6);
                } else {
                    o0VarE.e();
                    pVar2 = pVar;
                    f16 = f14;
                    f17 = f15;
                    z17 = z15;
                    qVar2 = qVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.ad
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            dd ddVar = dd.f87874a;
                            this.f87475a.c(udVar, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, mVar2, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(ucVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i16 |= i26;
            }
            if ((i14 & 24576) == 0) {
                i16 |= 8192;
            }
            i19 = i16 | 14352384;
            if ((100663296 & i14) != 0) {
                if (o0VarE.B(this)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i19 |= i25;
            }
            if ((38347923 & i19) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                    objQ = o0VarE.q();
                    aVar = p3.m.f135153a;
                    if (z18) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wc(ucVar, z15, 1);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                    e23.p<? super q4.f, ? super n4.c, Unit> pVar4 = (e23.p) objQ;
                    i24 = i19 & (-57345);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = b.f87882a;
                        o0VarE.K(objQ2);
                    }
                    float f19 = kd.f88707d;
                    f17 = kd.f88708e;
                    boolean z110 = z15;
                    qVar2 = (e23.q) objQ2;
                    z17 = z110;
                    f16 = f19;
                    pVar2 = pVar4;
                    rVar2 = rVar3;
                } else {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                    objQ = o0VarE.q();
                    aVar = p3.m.f135153a;
                    if (z18) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wc(ucVar, z15, 1);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                    e23.p<? super q4.f, ? super n4.c, Unit> pVar5 = (e23.p) objQ;
                    i24 = i19 & (-57345);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = b.f87882a;
                        o0VarE.K(objQ2);
                    }
                    float f110 = kd.f88707d;
                    f17 = kd.f88708e;
                    boolean z111 = z15;
                    qVar2 = (e23.q) objQ2;
                    z17 = z111;
                    f16 = f110;
                    pVar2 = pVar5;
                    rVar2 = rVar3;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                g6.f.f75994b.getClass();
                int i29 = i24 << 3;
                d(udVar, g6.f.f75996d, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, o0VarE, 805306416 | (i24 & 14) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (3670016 & i29) | (29360128 & i29) | (i29 & 234881024), ((i24 >> 21) & 112) | 6);
            } else {
                o0VarE.e();
                pVar2 = pVar;
                f16 = f14;
                f17 = f15;
                z17 = z15;
                qVar2 = qVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.ad
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        dd ddVar = dd.f87874a;
                        this.f87475a.c(udVar, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, mVar2, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(ucVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i16 |= i26;
            }
            if ((i14 & 24576) == 0) {
                i16 |= 8192;
            }
            i19 = i16 | 14352384;
            if ((100663296 & i14) != 0) {
                if (o0VarE.B(this)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i19 |= i25;
            }
            if ((38347923 & i19) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                    objQ = o0VarE.q();
                    aVar = p3.m.f135153a;
                    if (z18) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wc(ucVar, z15, 1);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                    e23.p<? super q4.f, ? super n4.c, Unit> pVar6 = (e23.p) objQ;
                    i24 = i19 & (-57345);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = b.f87882a;
                        o0VarE.K(objQ2);
                    }
                    float f111 = kd.f88707d;
                    f17 = kd.f88708e;
                    boolean z112 = z15;
                    qVar2 = (e23.q) objQ2;
                    z17 = z112;
                    f16 = f111;
                    pVar2 = pVar6;
                    rVar2 = rVar3;
                } else {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                    objQ = o0VarE.q();
                    aVar = p3.m.f135153a;
                    if (z18) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wc(ucVar, z15, 1);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                    e23.p<? super q4.f, ? super n4.c, Unit> pVar7 = (e23.p) objQ;
                    i24 = i19 & (-57345);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = b.f87882a;
                        o0VarE.K(objQ2);
                    }
                    float f112 = kd.f88707d;
                    f17 = kd.f88708e;
                    boolean z113 = z15;
                    qVar2 = (e23.q) objQ2;
                    z17 = z113;
                    f16 = f112;
                    pVar2 = pVar7;
                    rVar2 = rVar3;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                g6.f.f75994b.getClass();
                int i210 = i24 << 3;
                d(udVar, g6.f.f75996d, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, o0VarE, 805306416 | (i24 & 14) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (3670016 & i210) | (29360128 & i210) | (i210 & 234881024), ((i24 >> 21) & 112) | 6);
            } else {
                o0VarE.e();
                pVar2 = pVar;
                f16 = f14;
                f17 = f15;
                z17 = z15;
                qVar2 = qVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.ad
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        dd ddVar = dd.f87874a;
                        this.f87475a.c(udVar, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, mVar2, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(ucVar)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i16 |= i26;
        }
        if ((i14 & 24576) == 0) {
            i16 |= 8192;
        }
        i19 = i16 | 14352384;
        if ((100663296 & i14) != 0) {
            if (o0VarE.B(this)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i19 |= i25;
        }
        if ((38347923 & i19) != 38347922) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z18) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new wc(ucVar, z15, 1);
                    o0VarE.K(objQ);
                }
                e23.p<? super q4.f, ? super n4.c, Unit> pVar8 = (e23.p) objQ;
                i24 = i19 & (-57345);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = b.f87882a;
                    o0VarE.K(objQ2);
                }
                float f113 = kd.f88707d;
                f17 = kd.f88708e;
                boolean z114 = z15;
                qVar2 = (e23.q) objQ2;
                z17 = z114;
                f16 = f113;
                pVar2 = pVar8;
                rVar2 = rVar3;
            } else {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                z18 = ((((i19 & 7168) ^ 3072) <= 2048 && o0VarE.B(ucVar)) || (i19 & 3072) == 2048) | ((i19 & 896) == 256);
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z18) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wc(ucVar, z15, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new wc(ucVar, z15, 1);
                    o0VarE.K(objQ);
                }
                e23.p<? super q4.f, ? super n4.c, Unit> pVar9 = (e23.p) objQ;
                i24 = i19 & (-57345);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = b.f87882a;
                    o0VarE.K(objQ2);
                }
                float f114 = kd.f88707d;
                f17 = kd.f88708e;
                boolean z115 = z15;
                qVar2 = (e23.q) objQ2;
                z17 = z115;
                f16 = f114;
                pVar2 = pVar9;
                rVar2 = rVar3;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            g6.f.f75994b.getClass();
            int i211 = i24 << 3;
            d(udVar, g6.f.f75996d, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, o0VarE, 805306416 | (i24 & 14) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (3670016 & i211) | (29360128 & i211) | (i211 & 234881024), ((i24 >> 21) & 112) | 6);
        } else {
            o0VarE.e();
            pVar2 = pVar;
            f16 = f14;
            f17 = f15;
            z17 = z15;
            qVar2 = qVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.ad
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    dd ddVar = dd.f87874a;
                    this.f87475a.c(udVar, rVar2, z17, ucVar, pVar2, qVar2, f16, f17, mVar2, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final ud udVar, final float f14, final h4.r rVar, final boolean z14, final uc ucVar, final e23.p pVar, final e23.q qVar, final float f15, final float f16, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        p3.o0 o0Var;
        int i18;
        Object ycVar;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(133396521);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(udVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(ucVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.i(f15) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.i(f16) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.h(false) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.h(false) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            long jB = ucVar.b(z14, false);
            long jB2 = ucVar.b(z14, true);
            long jA = ucVar.a(z14, false);
            long jA2 = ucVar.a(z14, true);
            h4.r rVarC = udVar.f89922m == p008y1.b2.Vertical ? c2.x2.c(c2.x2.u(rVar, kd.f88704a), 1.0f) : c2.x2.h(c2.x2.f(rVar, 1.0f), kd.f88704a);
            h4.r.a aVar = h4.r.S;
            int i19 = i16 & 112;
            boolean zR = (i19 == 32) | o0VarE.r(udVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                i18 = 1;
                objQ = new d70.e(f14, udVar, i18);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i18 = 1;
                    objQ = new d70.e(f14, udVar, i18);
                    o0VarE.K(objQ);
                } else {
                    i18 = 1;
                }
            }
            h4.r rVarThen = rVarC.then(f5.g0.d(aVar, (e23.q) objQ));
            int i24 = ((i16 & 29360128) == 8388608 ? (char) 1 : (char) 0) | (((((((i19 == 32 ? i18 : 0) | (o0VarE.r(udVar) ? 1 : 0)) == true ? 1 : 0) | (o0VarE.l(jB) ? 1 : 0)) | (o0VarE.l(jB2) ? 1 : 0) ? 1 : 0) | (o0VarE.l(jA) ? 1 : 0)) | (o0VarE.l(jA2) ? 1 : 0) ? 1 : 0) | ((234881024 & i16) == 67108864 ? 1 : 0) | ((458752 & i16) == 131072 ? 1 : 0) | ((3670016 & i16) == 1048576 ? 1 : 0) | ((1879048192 & i16) == 536870912 ? 1 : 0) | ((i17 & 14) == 4 ? 1 : 0);
            Object objQ2 = o0VarE.q();
            if (i24 == 0) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    rVar2 = rVarThen;
                    ycVar = new yc(f14, udVar, jB, jB2, jA, jA2, f15, f16, pVar, qVar, 1);
                    o0Var = o0VarE;
                    o0Var.K(ycVar);
                } else {
                    ycVar = objQ2;
                    rVar2 = rVarThen;
                    o0Var = o0VarE;
                }
            } else {
                rVar2 = rVarThen;
                ycVar = new yc(f14, udVar, jB, jB2, jA, jA2, f15, f16, pVar, qVar, 1);
                o0Var = o0VarE;
                o0Var.K(ycVar);
            }
            u1.n.b(rVar2, (e23.l) ycVar, o0Var, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.cd
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    dd ddVar = dd.f87874a;
                    this.f87764a.d(udVar, f14, rVar, z14, ucVar, pVar, qVar, f15, f16, mVar2, p3.p0.t(i14 | 1), p3.p0.t(i15));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void e(final cb cbVar, final float f14, final h4.r rVar, final boolean z14, final uc ucVar, final e23.p<? super q4.f, ? super n4.c, Unit> pVar, final e23.q<? super q4.f, ? super n4.c, ? super o4.d0, Unit> qVar, final float f15, final float f16, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1719396904);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(cbVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(ucVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.i(f15) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.i(f16) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            long jB = ucVar.b(z14, false);
            long jB2 = ucVar.b(z14, true);
            int i16 = i15;
            long jA = ucVar.a(z14, false);
            long jA2 = ucVar.a(z14, true);
            h4.r rVarH = c2.x2.h(c2.x2.f(rVar, 1.0f), kd.f88704a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new h81.a(23);
                o0VarE.K(objQ);
            }
            h4.r rVarD = f5.g0.d(rVarH, (e23.q) objQ);
            boolean zR = ((i16 & 29360128) == 8388608) | ((i16 & 112) == 32) | o0VarE.r(cbVar) | o0VarE.l(jB) | o0VarE.l(jB2) | o0VarE.l(jA) | o0VarE.l(jA2) | ((i16 & 234881024) == 67108864) | ((i16 & 458752) == 131072) | ((i16 & 3670016) == 1048576);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                yc ycVar = new yc(f14, cbVar, jB, jB2, jA, jA2, f15, f16, pVar, qVar, 0);
                o0Var = o0VarE;
                o0Var.K(ycVar);
                objQ2 = ycVar;
            } else {
                o0Var = o0VarE;
            }
            u1.n.b(rVarD, (e23.l) objQ2, o0Var, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.zc
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    dd ddVar = dd.f87874a;
                    this.f90588a.e(cbVar, f14, rVar, z14, ucVar, pVar, qVar, f15, f16, mVar2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
