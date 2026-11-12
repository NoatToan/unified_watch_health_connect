package l3;

import com.google.android.exoplayer2.C;
import i3.eh;
import i3.fh;
import i3.k9;
import i3.na;
import i3.p7;
import i3.rj;
import i3.s2;
import i3.s7;
import i3.sg;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.a4;
import p3.p2;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f109300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f109301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f109302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f109303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f109304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f109305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f109306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f109307h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f109309b;

        static {
            int[] iArr = new int[l2.values().length];
            try {
                iArr[l2.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l2.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109308a = iArr;
            int[] iArr2 = new int[a1.values().length];
            try {
                iArr2[a1.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a1.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a1.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f109309b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements x0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f109310a;

        public b(e23.a aVar) {
            this.f109310a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f109310a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // l3.x0
        public final /* synthetic */ float invoke() {
            return ((Number) this.f109310a.invoke()).floatValue();
        }
    }

    static {
        float f14 = 16;
        g6.f.a aVar = g6.f.f75994b;
        f109300a = f14;
        float f15 = 4;
        f109301b = f15;
        f109302c = f15;
        f109303d = f15;
        f109304e = 2;
        f109305f = 24;
        f109306g = f14;
        f109307h = f14;
    }

    /* JADX WARN: Code duplicated, block: B:214:0x0343  */
    /* JADX WARN: Code duplicated, block: B:227:0x0373  */
    /* JADX WARN: Code duplicated, block: B:256:0x042d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0433  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:263:0x0450  */
    /* JADX WARN: Code duplicated, block: B:266:0x0475  */
    /* JADX WARN: Code duplicated, block: B:268:0x0479  */
    /* JADX WARN: Code duplicated, block: B:271:0x0494  */
    /* JADX WARN: Code duplicated, block: B:274:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:276:0x04db  */
    /* JADX WARN: Code duplicated, block: B:279:0x052f  */
    /* JADX WARN: Code duplicated, block: B:282:0x053d  */
    /* JADX WARN: Code duplicated, block: B:283:0x055a  */
    /* JADX WARN: Code duplicated, block: B:285:0x058b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0591  */
    /* JADX WARN: Code duplicated, block: B:289:0x0595  */
    /* JADX WARN: Code duplicated, block: B:290:0x0598 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x059a  */
    /* JADX WARN: Code duplicated, block: B:292:0x059d  */
    /* JADX WARN: Code duplicated, block: B:295:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:296:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:306:0x0604  */
    /* JADX WARN: Code duplicated, block: B:308:0x0608 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x060a  */
    /* JADX WARN: Code duplicated, block: B:310:0x060d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x060f  */
    /* JADX WARN: Code duplicated, block: B:312:0x0612  */
    /* JADX WARN: Code duplicated, block: B:315:0x061b  */
    /* JADX WARN: Code duplicated, block: B:316:0x0633  */
    /* JADX WARN: Code duplicated, block: B:322:0x0667  */
    /* JADX WARN: Code duplicated, block: B:324:0x0676  */
    /* JADX WARN: Code duplicated, block: B:325:0x0679 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x067b  */
    /* JADX WARN: Code duplicated, block: B:327:0x067e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0680  */
    /* JADX WARN: Code duplicated, block: B:329:0x0683  */
    /* JADX WARN: Code duplicated, block: B:334:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:336:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:337:0x06bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:338:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:339:0x06c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:340:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:341:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:343:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:344:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:346:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:347:0x06f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:349:0x06f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:351:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:353:0x0702  */
    /* JADX WARN: Code duplicated, block: B:354:0x070f  */
    /* JADX WARN: Code duplicated, block: B:356:0x0728  */
    /* JADX WARN: Code duplicated, block: B:357:0x072b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:358:0x072d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0730 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:360:0x0732  */
    /* JADX WARN: Code duplicated, block: B:361:0x0735  */
    /* JADX WARN: Code duplicated, block: B:363:0x0739  */
    /* JADX WARN: Code duplicated, block: B:364:0x0745  */
    /* JADX WARN: Code duplicated, block: B:367:0x0766  */
    /* JADX WARN: Code duplicated, block: B:369:0x0769  */
    /* JADX WARN: Code duplicated, block: B:371:0x0775  */
    /* JADX WARN: Code duplicated, block: B:374:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:375:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:379:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:381:0x0813  */
    /* JADX WARN: Code duplicated, block: B:383:0x081d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final l2 l2Var, final CharSequence charSequence, final e23.p pVar, final fh.b bVar, final e23.q qVar, final e23.p pVar2, final e23.p pVar3, final e23.p pVar4, final e23.p pVar5, final e23.p pVar6, final e23.p pVar7, final boolean z14, final boolean z15, final boolean z16, final a2.i iVar, final c2.h2 h2Var, final sg sgVar, final e23.p pVar8, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        sg sgVar2;
        p3.o0 o0Var;
        a1 a1Var;
        long j8;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        s1.t1.d dVarC;
        a1 a1Var2;
        long j14;
        p4.c cVarG;
        boolean zB;
        Object objQ;
        p3.m.a aVar;
        a1 a1Var3;
        long j15;
        a1 a1Var4;
        s1.t1.d dVarC2;
        p4.c cVarG2;
        boolean zB2;
        Object objQ2;
        s1.t1.d dVarC3;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        e2 e2Var;
        z3.e eVarC;
        s5.x0 x0Var;
        s5.x0 x0Var2;
        final s1.t1.d dVar;
        z3.e eVar;
        long j16;
        Object objQ4;
        s1.t1.d dVar2;
        z3.e eVar2;
        long j17;
        Object objQ5;
        s1.t1.d dVar3;
        s1.t1.d dVar4;
        z3.e eVar3;
        long j18;
        z3.e eVarC2;
        long j19;
        z3.e eVar4;
        long j24;
        z3.e eVar5;
        long j25;
        int i19;
        Object objQ6;
        p3.p1 p1Var;
        boolean z17;
        boolean zB3;
        Object objQ7;
        p3.o0 o0VarE = mVar.E(546805032);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.k(l2Var.ordinal()) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 = i16 | (o0VarE.r(charSequence) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i17 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.r(pVar3) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.r(pVar4) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.r(pVar5) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(pVar6) ? 536870912 : 268435456;
        }
        int i24 = i17;
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.r(pVar7) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.h(z16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.B(iVar) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.B(h2Var) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            sgVar2 = sgVar;
            i18 |= o0VarE.B(sgVar2) ? 1048576 : 524288;
        } else {
            sgVar2 = sgVar;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= o0VarE.r(pVar8) ? 8388608 : 4194304;
        }
        int i25 = i18;
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 4793491) == 4793490) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) xy2.b.k(iVar, o0VarE, (i25 >> 12) & 14).getF182175a()).booleanValue();
            if (zBooleanValue) {
                a1Var = a1.Focused;
            } else {
                a1Var = charSequence.length() == 0 ? a1.UnfocusedEmpty : a1.UnfocusedNotEmpty;
            }
            if (!z15) {
                j8 = sgVar2.f89700z;
            } else if (z16) {
                j8 = sgVar2.A;
            } else {
                j8 = zBooleanValue ? sgVar2.f89698x : sgVar2.f89699y;
            }
            s7.f89624a.getClass();
            rj rjVarC = s7.c(o0VarE);
            s5.x0 x0Var3 = rjVarC.f89551j;
            s5.x0 x0Var4 = rjVarC.f89553l;
            long jC = x0Var3.c();
            o4.d0.f128823b.getClass();
            long j26 = o4.d0.f128832k;
            boolean z18 = (o4.d0.d(jC, j26) && !o4.d0.d(x0Var4.c(), j26)) || (!o4.d0.d(x0Var3.c(), j26) && o4.d0.d(x0Var4.c(), j26));
            long jC2 = x0Var4.c();
            if (z18 && jC2 == 16) {
                jC2 = j8;
            }
            long jC3 = x0Var3.c();
            long j27 = (z18 && jC3 == 16) ? j8 : jC3;
            boolean z19 = (qVar == null || bVar.f88119a) ? false : true;
            long j28 = jC2;
            s1.t1 t1VarE = s1.w1.e(a1Var, "TextFieldInputState", o0VarE, 48, 0);
            s1.a2<S> a2Var = t1VarE.f155744a;
            p3.c2 c2Var = t1VarE.f155747d;
            g2 g2Var = new g2(k9.b(n3.h0.FastSpatial, o0VarE));
            p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
            s1.d2 d2Var = s1.e2.f155568a;
            a1 a1Var5 = (a1) a2Var.a();
            o0VarE.C(-1436405362);
            int[] iArr = a.f109309b;
            int i26 = iArr[a1Var5.ordinal()];
            float f19 = 0.0f;
            if (i26 == 1) {
                f14 = 1.0f;
            } else {
                if (i26 != 2) {
                    if (i26 != 3) {
                        lc.u0.r();
                        return;
                    }
                } else if (z19) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            o0VarE.g0(false);
            Float fValueOf = Float.valueOf(f14);
            a1 a1Var6 = (a1) c2Var.getF182175a();
            o0VarE.C(-1436405362);
            int i27 = iArr[a1Var6.ordinal()];
            if (i27 == 1) {
                f15 = 1.0f;
            } else {
                if (i27 != 2) {
                    if (i27 != 3) {
                        lc.u0.r();
                        return;
                    }
                } else if (z19) {
                    f15 = 0.0f;
                }
                f15 = 1.0f;
            }
            o0VarE.g0(false);
            s1.t1.d dVarC4 = s1.w1.c(t1VarE, fValueOf, Float.valueOf(f15), g2Var.invoke(t1VarE.f(), o0VarE, 0), d2Var, "LabelProgress", o0VarE, 196608);
            n3.h0 h0Var = n3.h0.FastEffects;
            s1.f0 f0VarB = k9.b(h0Var, o0VarE);
            boolean z24 = z18;
            boolean z25 = z19;
            i2 i2Var = new i2(f0VarB, k9.b(n3.h0.SlowEffects, o0VarE));
            a1 a1Var7 = (a1) a2Var.a();
            o0VarE.C(-1093194547);
            int i28 = iArr[a1Var7.ordinal()];
            if (i28 == 1) {
                f16 = 1.0f;
            } else {
                if (i28 != 2) {
                    if (i28 != 3) {
                        lc.u0.r();
                        return;
                    }
                } else if (!z25) {
                    f16 = 1.0f;
                }
                f16 = 0.0f;
            }
            o0VarE.g0(false);
            Float fValueOf2 = Float.valueOf(f16);
            a1 a1Var8 = (a1) c2Var.getF182175a();
            o0VarE.C(-1093194547);
            int i29 = iArr[a1Var8.ordinal()];
            if (i29 == 1) {
                f17 = 1.0f;
            } else {
                if (i29 != 2) {
                    if (i29 != 3) {
                        lc.u0.r();
                        return;
                    }
                } else if (!z25) {
                    f17 = 1.0f;
                }
                f17 = 0.0f;
            }
            o0VarE.g0(false);
            s1.t1.d dVarC5 = s1.w1.c(t1VarE, fValueOf2, Float.valueOf(f17), i2Var.invoke(t1VarE.f(), o0VarE, 0), d2Var, "PlaceholderOpacity", o0VarE, 196608);
            j2 j2Var = new j2(f0VarB);
            a1 a1Var9 = (a1) a2Var.a();
            o0VarE.C(-1258455321);
            int i30 = iArr[a1Var9.ordinal()];
            if (i30 == 1) {
                f18 = 1.0f;
            } else {
                if (i30 != 2) {
                    if (i30 != 3) {
                        lc.u0.r();
                        return;
                    }
                } else if (z25) {
                    f18 = 0.0f;
                }
                f18 = 1.0f;
            }
            o0VarE.g0(false);
            Float fValueOf3 = Float.valueOf(f18);
            a1 a1Var10 = (a1) c2Var.getF182175a();
            o0VarE.C(-1258455321);
            int i34 = iArr[a1Var10.ordinal()];
            if (i34 != 1) {
                if (i34 == 2) {
                    if (!z25) {
                    }
                    o0VarE.g0(false);
                    dVarC = s1.w1.c(t1VarE, fValueOf3, Float.valueOf(f19), j2Var.invoke(t1VarE.f(), o0VarE, 0), d2Var, "PrefixSuffixOpacity", o0VarE, 196608);
                    s1.f0 f0VarB2 = k9.b(h0Var, o0VarE);
                    h2 h2Var2 = new h2(f0VarB2);
                    a1Var2 = (a1) c2Var.getF182175a();
                    o0VarE.C(-12973394);
                    if (iArr[a1Var2.ordinal()] == 1) {
                        j14 = j28;
                    } else {
                        j14 = j27;
                    }
                    o0VarE.g0(false);
                    cVarG = o4.d0.g(j14);
                    zB = o0VarE.B(cVarG);
                    objQ = o0VarE.q();
                    aVar = p3.m.f135153a;
                    if (zB) {
                        objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                            o0VarE.K(objQ);
                        }
                    }
                    s1.c2 c2Var2 = (s1.c2) objQ;
                    a1Var3 = (a1) a2Var.a();
                    o0VarE.C(-12973394);
                    if (iArr[a1Var3.ordinal()] == 1) {
                        j15 = j28;
                    } else {
                        j15 = j27;
                    }
                    o0VarE.g0(false);
                    o4.d0 d0VarA = o4.d0.a(j15);
                    a1Var4 = (a1) c2Var.getF182175a();
                    o0VarE.C(-12973394);
                    if (iArr[a1Var4.ordinal()] == 1) {
                        j27 = j28;
                    }
                    o0VarE.g0(false);
                    dVarC2 = s1.w1.c(t1VarE, d0VarA, o4.d0.a(j27), h2Var2.invoke(t1VarE.f(), o0VarE, 0), c2Var2, "LabelTextStyleColor", o0VarE, 196608);
                    f2 f2Var = new f2(f0VarB2);
                    o0VarE.C(-464752477);
                    o0VarE.g0(false);
                    cVarG2 = o4.d0.g(j8);
                    zB2 = o0VarE.B(cVarG2);
                    objQ2 = o0VarE.q();
                    if (zB2) {
                        objQ2 = (s1.c2) r1.k0.f149133a.invoke(cVarG2);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = (s1.c2) r1.k0.f149133a.invoke(cVarG2);
                            o0VarE.K(objQ2);
                        }
                    }
                    s1.c2 c2Var3 = (s1.c2) objQ2;
                    o0VarE.C(-464752477);
                    o0VarE.g0(false);
                    o4.d0 d0VarA2 = o4.d0.a(j8);
                    o0VarE.C(-464752477);
                    o0VarE.g0(false);
                    dVarC3 = s1.w1.c(t1VarE, d0VarA2, o4.d0.a(j8), f2Var.invoke(t1VarE.f(), o0VarE, 0), c2Var3, "LabelContentColor", o0VarE, 196608);
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new e2(dVarC4);
                        o0VarE.K(objQ3);
                    }
                    e2Var = (e2) objQ3;
                    eVarC = null;
                    if (qVar == null) {
                        o0VarE.C(-1891724857);
                        o0VarE.g0(false);
                        dVar = dVarC4;
                        eVar = null;
                        x0Var = x0Var3;
                        x0Var2 = x0Var4;
                    } else {
                        o0VarE.C(-1891724856);
                        x1 x1Var2 = new x1(x0Var3, x0Var4, dVarC4, dVarC3, z24, dVarC2, qVar, e2Var);
                        x0Var = x0Var3;
                        x0Var2 = x0Var4;
                        dVar = dVarC4;
                        z3.e eVarC3 = z3.f.c(-1076580032, x1Var2, o0VarE);
                        o0VarE.g0(false);
                        eVar = eVarC3;
                    }
                    if (!z15) {
                        j16 = sgVar.D;
                    } else if (z16) {
                        j16 = sgVar.E;
                    } else if (zBooleanValue) {
                        j16 = sgVar.B;
                    } else {
                        j16 = sgVar.C;
                    }
                    long j29 = j16;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        a4 a4Var = a4.f135041a;
                        a4Var.getClass();
                        dVar2 = dVarC5;
                        objQ4 = p3.p0.g(a4Var, new by1.h(dVar2, 7));
                        o0VarE.K(objQ4);
                    } else {
                        dVar2 = r43;
                    }
                    x3 x3Var = (x3) objQ4;
                    if (pVar2 == null && charSequence.length() == 0 && ((Boolean) x3Var.getF182175a()).booleanValue()) {
                        o0VarE.C(-1890614312);
                        z3.e eVarC4 = z3.f.c(1405547205, new z1(dVar2, j29, x0Var, pVar2), o0VarE);
                        o0VarE.g0(false);
                        eVar2 = eVarC4;
                    } else {
                        o0VarE.C(-1890217110);
                        o0VarE.g0(false);
                        eVar2 = null;
                    }
                    if (!z15) {
                        j17 = sgVar.L;
                    } else if (z16) {
                        j17 = sgVar.M;
                    } else if (zBooleanValue) {
                        j17 = sgVar.J;
                    } else {
                        j17 = sgVar.K;
                    }
                    long j34 = j17;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        a4 a4Var2 = a4.f135041a;
                        a4Var2.getClass();
                        dVar3 = dVarC;
                        objQ5 = p3.p0.g(a4Var2, new by1.h(dVar3, 8));
                        o0VarE.K(objQ5);
                    } else {
                        dVar3 = r38;
                    }
                    x3 x3Var2 = (x3) objQ5;
                    if (pVar5 == null && ((Boolean) x3Var2.getF182175a()).booleanValue()) {
                        o0VarE.C(-1889877907);
                        dVar4 = dVar3;
                        z3.e eVarC5 = z3.f.c(606594655, new a2(dVar4, j34, x0Var, pVar5), o0VarE);
                        o0VarE.g0(false);
                        eVar3 = eVarC5;
                    } else {
                        dVar4 = dVar3;
                        o0VarE.C(-1889500886);
                        o0VarE.g0(false);
                        eVar3 = null;
                    }
                    if (!z15) {
                        j18 = sgVar.P;
                    } else if (z16) {
                        j18 = sgVar.Q;
                    } else if (zBooleanValue) {
                        j18 = sgVar.N;
                    } else {
                        j18 = sgVar.O;
                    }
                    if (pVar6 == null && ((Boolean) x3Var2.getF182175a()).booleanValue()) {
                        o0VarE.C(-1889301555);
                        eVarC2 = z3.f.c(-45078754, new b2(dVar4, j18, x0Var, pVar6), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1888924534);
                        o0VarE.g0(false);
                        eVarC2 = null;
                    }
                    if (!z15) {
                        j19 = sgVar.f89692r;
                    } else if (z16) {
                        j19 = sgVar.f89693s;
                    } else if (zBooleanValue) {
                        j19 = sgVar.f89690p;
                    } else {
                        j19 = sgVar.f89691q;
                    }
                    if (pVar3 == null) {
                        o0VarE.C(-1888749663);
                        o0VarE.g0(false);
                        eVar4 = null;
                    } else {
                        o0VarE.C(-1888749662);
                        z3.e eVarC6 = z3.f.c(-1736293487, new y1(j19, pVar3), o0VarE);
                        o0VarE.g0(false);
                        eVar4 = eVarC6;
                    }
                    if (!z15) {
                        j24 = sgVar.f89696v;
                    } else if (z16) {
                        j24 = sgVar.f89697w;
                    } else if (zBooleanValue) {
                        j24 = sgVar.f89694t;
                    } else {
                        j24 = sgVar.f89695u;
                    }
                    if (pVar4 == null) {
                        o0VarE.C(-1888469888);
                        o0VarE.g0(false);
                        eVar5 = null;
                    } else {
                        o0VarE.C(-1888469887);
                        z3.e eVarC7 = z3.f.c(1334518521, new d2(j24, pVar4), o0VarE);
                        o0VarE.g0(false);
                        eVar5 = eVarC7;
                    }
                    if (!z15) {
                        j25 = sgVar.H;
                    } else if (z16) {
                        j25 = sgVar.I;
                    } else if (zBooleanValue) {
                        j25 = sgVar.F;
                    } else {
                        j25 = sgVar.G;
                    }
                    if (pVar7 == null) {
                        o0VarE.C(-1888176380);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1888176379);
                        eVarC = z3.f.c(837168720, new c2(j25, x0Var2, pVar7), o0VarE);
                        o0VarE.g0(false);
                    }
                    i19 = a.f109308a[l2Var.ordinal()];
                    if (i19 != 1) {
                        o0VarE.C(-1887830698);
                        eh.c(h4.r.S, pVar, eVar, eVar2, eVar4, eVar5, eVar3, eVarC2, z14, bVar, new b(new p005kotlin.jvm.internal.g0(dVar) { // from class: l3.r1
                            @Override // p005kotlin.jvm.internal.g0, k23.m
                            public final Object get() {
                                return ((x3) this.receiver).getF182175a();
                            }
                        }), z3.f.c(-1729858187, new v1(pVar8), o0VarE), eVarC, h2Var, o0VarE, ((i24 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i24 << 18) & 1879048192), ((i25 >> 6) & 7168) | 48);
                        o0Var = o0VarE;
                        o0Var.g0(false);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (i19 == 2) {
                            throw kg.f.h(o0VarE, 493292232, false);
                        }
                        o0VarE.C(-1886778186);
                        objQ6 = o0VarE.q();
                        if (objQ6 == c2565a) {
                            n4.g.f123559b.getClass();
                            objQ6 = p3.p0.n(n4.g.a(0L));
                            o0VarE.K(objQ6);
                        }
                        p1Var = (p3.p1) objQ6;
                        z3.e eVar6 = eVarC2;
                        z3.e eVarC8 = z3.f.c(528115858, new u1(p1Var, bVar, h2Var, pVar8), o0VarE);
                        h4.r.a aVar2 = h4.r.S;
                        b bVar2 = new b(new p005kotlin.jvm.internal.g0(dVar) { // from class: l3.s1
                            @Override // p005kotlin.jvm.internal.g0, k23.m
                            public final Object get() {
                                return ((x3) this.receiver).getF182175a();
                            }
                        });
                        if ((i24 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zB3 = z17 | o0VarE.B(dVar);
                        objQ7 = o0VarE.q();
                        if (zB3 || objQ7 == c2565a) {
                            objQ7 = new k62.k(bVar, 20, dVar, p1Var);
                            o0VarE.K(objQ7);
                        }
                        na.c(aVar2, pVar, eVar2, eVar, eVar4, eVar5, eVar3, eVar6, z14, bVar, bVar2, (e23.l) objQ7, eVarC8, eVarC, h2Var, o0VarE, ((i24 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i24 << 18) & 1879048192), (57344 & (i25 >> 3)) | 384);
                        o0Var = o0VarE;
                        o0Var.g0(false);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else if (i34 != 3) {
                    lc.u0.r();
                    return;
                }
            }
            f19 = 1.0f;
            o0VarE.g0(false);
            dVarC = s1.w1.c(t1VarE, fValueOf3, Float.valueOf(f19), j2Var.invoke(t1VarE.f(), o0VarE, 0), d2Var, "PrefixSuffixOpacity", o0VarE, 196608);
            s1.f0 f0VarB3 = k9.b(h0Var, o0VarE);
            h2 h2Var3 = new h2(f0VarB3);
            a1Var2 = (a1) c2Var.getF182175a();
            o0VarE.C(-12973394);
            if (iArr[a1Var2.ordinal()] == 1) {
                j14 = j28;
            } else {
                j14 = j27;
            }
            o0VarE.g0(false);
            cVarG = o4.d0.g(j14);
            zB = o0VarE.B(cVarG);
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                o0VarE.K(objQ);
            }
            s1.c2 c2Var4 = (s1.c2) objQ;
            a1Var3 = (a1) a2Var.a();
            o0VarE.C(-12973394);
            if (iArr[a1Var3.ordinal()] == 1) {
                j15 = j28;
            } else {
                j15 = j27;
            }
            o0VarE.g0(false);
            o4.d0 d0VarA3 = o4.d0.a(j15);
            a1Var4 = (a1) c2Var.getF182175a();
            o0VarE.C(-12973394);
            if (iArr[a1Var4.ordinal()] == 1) {
                j27 = j28;
            }
            o0VarE.g0(false);
            dVarC2 = s1.w1.c(t1VarE, d0VarA3, o4.d0.a(j27), h2Var3.invoke(t1VarE.f(), o0VarE, 0), c2Var4, "LabelTextStyleColor", o0VarE, 196608);
            f2 f2Var2 = new f2(f0VarB3);
            o0VarE.C(-464752477);
            o0VarE.g0(false);
            cVarG2 = o4.d0.g(j8);
            zB2 = o0VarE.B(cVarG2);
            objQ2 = o0VarE.q();
            if (zB2) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = (s1.c2) r1.k0.f149133a.invoke(cVarG2);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = (s1.c2) r1.k0.f149133a.invoke(cVarG2);
                o0VarE.K(objQ2);
            }
            s1.c2 c2Var5 = (s1.c2) objQ2;
            o0VarE.C(-464752477);
            o0VarE.g0(false);
            o4.d0 d0VarA4 = o4.d0.a(j8);
            o0VarE.C(-464752477);
            o0VarE.g0(false);
            dVarC3 = s1.w1.c(t1VarE, d0VarA4, o4.d0.a(j8), f2Var2.invoke(t1VarE.f(), o0VarE, 0), c2Var5, "LabelContentColor", o0VarE, 196608);
            objQ3 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new e2(dVarC4);
                o0VarE.K(objQ3);
            }
            e2Var = (e2) objQ3;
            eVarC = null;
            if (qVar == null) {
                o0VarE.C(-1891724857);
                o0VarE.g0(false);
                dVar = dVarC4;
                eVar = null;
                x0Var = x0Var3;
                x0Var2 = x0Var4;
            } else {
                o0VarE.C(-1891724856);
                x1 x1Var3 = new x1(x0Var3, x0Var4, dVarC4, dVarC3, z24, dVarC2, qVar, e2Var);
                x0Var = x0Var3;
                x0Var2 = x0Var4;
                dVar = dVarC4;
                z3.e eVarC9 = z3.f.c(-1076580032, x1Var3, o0VarE);
                o0VarE.g0(false);
                eVar = eVarC9;
            }
            if (!z15) {
                j16 = sgVar.D;
            } else if (z16) {
                j16 = sgVar.E;
            } else if (zBooleanValue) {
                j16 = sgVar.B;
            } else {
                j16 = sgVar.C;
            }
            long j210 = j16;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                a4 a4Var3 = a4.f135041a;
                a4Var3.getClass();
                dVar2 = dVarC5;
                objQ4 = p3.p0.g(a4Var3, new by1.h(dVar2, 7));
                o0VarE.K(objQ4);
            } else {
                dVar2 = r43;
            }
            x3 x3Var3 = (x3) objQ4;
            if (pVar2 == null) {
                o0VarE.C(-1890217110);
                o0VarE.g0(false);
                eVar2 = null;
            } else {
                o0VarE.C(-1890217110);
                o0VarE.g0(false);
                eVar2 = null;
            }
            if (!z15) {
                j17 = sgVar.L;
            } else if (z16) {
                j17 = sgVar.M;
            } else if (zBooleanValue) {
                j17 = sgVar.J;
            } else {
                j17 = sgVar.K;
            }
            long j35 = j17;
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                a4 a4Var4 = a4.f135041a;
                a4Var4.getClass();
                dVar3 = dVarC;
                objQ5 = p3.p0.g(a4Var4, new by1.h(dVar3, 8));
                o0VarE.K(objQ5);
            } else {
                dVar3 = r38;
            }
            x3 x3Var4 = (x3) objQ5;
            if (pVar5 == null) {
                dVar4 = dVar3;
                o0VarE.C(-1889500886);
                o0VarE.g0(false);
                eVar3 = null;
            } else {
                dVar4 = dVar3;
                o0VarE.C(-1889500886);
                o0VarE.g0(false);
                eVar3 = null;
            }
            if (!z15) {
                j18 = sgVar.P;
            } else if (z16) {
                j18 = sgVar.Q;
            } else if (zBooleanValue) {
                j18 = sgVar.N;
            } else {
                j18 = sgVar.O;
            }
            if (pVar6 == null) {
                o0VarE.C(-1888924534);
                o0VarE.g0(false);
                eVarC2 = null;
            } else {
                o0VarE.C(-1888924534);
                o0VarE.g0(false);
                eVarC2 = null;
            }
            if (!z15) {
                j19 = sgVar.f89692r;
            } else if (z16) {
                j19 = sgVar.f89693s;
            } else if (zBooleanValue) {
                j19 = sgVar.f89690p;
            } else {
                j19 = sgVar.f89691q;
            }
            if (pVar3 == null) {
                o0VarE.C(-1888749663);
                o0VarE.g0(false);
                eVar4 = null;
            } else {
                o0VarE.C(-1888749662);
                z3.e eVarC10 = z3.f.c(-1736293487, new y1(j19, pVar3), o0VarE);
                o0VarE.g0(false);
                eVar4 = eVarC10;
            }
            if (!z15) {
                j24 = sgVar.f89696v;
            } else if (z16) {
                j24 = sgVar.f89697w;
            } else if (zBooleanValue) {
                j24 = sgVar.f89694t;
            } else {
                j24 = sgVar.f89695u;
            }
            if (pVar4 == null) {
                o0VarE.C(-1888469888);
                o0VarE.g0(false);
                eVar5 = null;
            } else {
                o0VarE.C(-1888469887);
                z3.e eVarC11 = z3.f.c(1334518521, new d2(j24, pVar4), o0VarE);
                o0VarE.g0(false);
                eVar5 = eVarC11;
            }
            if (!z15) {
                j25 = sgVar.H;
            } else if (z16) {
                j25 = sgVar.I;
            } else if (zBooleanValue) {
                j25 = sgVar.F;
            } else {
                j25 = sgVar.G;
            }
            if (pVar7 == null) {
                o0VarE.C(-1888176380);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1888176379);
                eVarC = z3.f.c(837168720, new c2(j25, x0Var2, pVar7), o0VarE);
                o0VarE.g0(false);
            }
            i19 = a.f109308a[l2Var.ordinal()];
            if (i19 != 1) {
                o0VarE.C(-1887830698);
                eh.c(h4.r.S, pVar, eVar, eVar2, eVar4, eVar5, eVar3, eVarC2, z14, bVar, new b(new p005kotlin.jvm.internal.g0(dVar) { // from class: l3.r1
                    @Override // p005kotlin.jvm.internal.g0, k23.m
                    public final Object get() {
                        return ((x3) this.receiver).getF182175a();
                    }
                }), z3.f.c(-1729858187, new v1(pVar8), o0VarE), eVarC, h2Var, o0VarE, ((i24 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i24 << 18) & 1879048192), ((i25 >> 6) & 7168) | 48);
                o0Var = o0VarE;
                o0Var.g0(false);
                Unit unit3 = Unit.INSTANCE;
            } else {
                if (i19 == 2) {
                    throw kg.f.h(o0VarE, 493292232, false);
                }
                o0VarE.C(-1886778186);
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    n4.g.f123559b.getClass();
                    objQ6 = p3.p0.n(n4.g.a(0L));
                    o0VarE.K(objQ6);
                }
                p1Var = (p3.p1) objQ6;
                z3.e eVar7 = eVarC2;
                z3.e eVarC12 = z3.f.c(528115858, new u1(p1Var, bVar, h2Var, pVar8), o0VarE);
                h4.r.a aVar3 = h4.r.S;
                b bVar3 = new b(new p005kotlin.jvm.internal.g0(dVar) { // from class: l3.s1
                    @Override // p005kotlin.jvm.internal.g0, k23.m
                    public final Object get() {
                        return ((x3) this.receiver).getF182175a();
                    }
                });
                if ((i24 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zB3 = z17 | o0VarE.B(dVar);
                objQ7 = o0VarE.q();
                if (zB3) {
                    objQ7 = new k62.k(bVar, 20, dVar, p1Var);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new k62.k(bVar, 20, dVar, p1Var);
                    o0VarE.K(objQ7);
                }
                na.c(aVar3, pVar, eVar2, eVar, eVar4, eVar5, eVar3, eVar7, z14, bVar, bVar3, (e23.l) objQ7, eVarC12, eVarC, h2Var, o0VarE, ((i24 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i24 << 18) & 1879048192), (57344 & (i25 >> 3)) | 384);
                o0Var = o0VarE;
                o0Var.g0(false);
                Unit unit4 = Unit.INSTANCE;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l3.q1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    k2.a(l2Var, charSequence, pVar, bVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, z14, z15, z16, iVar, h2Var, sgVar, pVar8, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(long j8, s5.x0 x0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(396611577);
        int i15 = (o0VarE.l(j8) ? 4 : 2) | i14 | (o0VarE.B(x0Var) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            k.b(j8, x0Var, pVar, o0VarE, i15 & 1022);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m1(j8, x0Var, pVar, i14, 1);
        }
    }

    public static final void c(long j8, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(590397809);
        int i15 = (o0VarE.l(j8) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.v.a(s2.f89590a.c(o4.d0.a(j8)), pVar, o0VarE, (i15 & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.z(j8, (e23.p) pVar, i14);
        }
    }

    public static final h4.r d(h4.r rVar, boolean z14, String str) {
        return z14 ? p5.v.c(new jl0.e(str, 17), rVar, false) : rVar;
    }

    public static final h4.d.b e(fh fhVar) {
        if (fhVar instanceof fh.a) {
            return ((fh.a) fhVar).f88118a;
        }
        if (fhVar instanceof fh.b) {
            return ((fh.b) fhVar).f88121c;
        }
        com.google.firebase.messaging.l.j(fhVar, "Unknown position: ");
        return null;
    }

    public static final h4.d.b f(fh fhVar) {
        if (fhVar instanceof fh.a) {
            return ((fh.a) fhVar).f88118a;
        }
        if (fhVar instanceof fh.b) {
            return ((fh.b) fhVar).f88120b;
        }
        com.google.firebase.messaging.l.j(fhVar, "Unknown position: ");
        return null;
    }

    public static final float g(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        long j8 = s7.c(mVar).f89553l.f157323b.f157308c;
        n3.g1.f122859a.getClass();
        long j14 = n3.g1.f122895m;
        if ((1095216660480L & j8) != 4294967296L) {
            j8 = j14;
        }
        float fH0 = ((g6.c) mVar.A(kotlin.t1.f91490h)).H0(j8) / 2;
        g6.f.a aVar = g6.f.f75994b;
        return fH0;
    }

    public static final float h(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        float f14 = ((g6.f) mVar.A(p7.f89282d)).f75997a;
        if (Float.isNaN(f14)) {
            f14 = 0;
        }
        n3.y0.f123325a.getClass();
        float f15 = (f14 - n3.y0.f123329e) / 2;
        float f16 = 0;
        return f15 < f16 ? f16 : f15;
    }
}
