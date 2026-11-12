package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f89584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f89585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f89586c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<s1.t1.b<r5.a>, p3.m, Integer, s1.f0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f89587a;

        public a(s1.f0<Float> f0Var) {
            this.f89587a = f0Var;
        }

        @Override // e23.q
        public final s1.f0<Float> invoke(s1.t1.b<r5.a> bVar, p3.m mVar, Integer num) {
            s1.f0<Float> h1Var;
            s1.t1.b<r5.a> bVar2 = bVar;
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(630790831);
            p3.x1 x1Var = p3.n.f135158a;
            r5.a aVarC = bVar2.c();
            r5.a aVar = r5.a.Off;
            if (aVarC == aVar) {
                h1Var = s1.l.b();
            } else {
                h1Var = bVar2.f() == aVar ? new s1.h1<>(100) : this.f89587a;
            }
            mVar2.f();
            return h1Var;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<s1.t1.b<r5.a>, p3.m, Integer, s1.f0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f89588a;

        public b(s1.f0<Float> f0Var) {
            this.f89588a = f0Var;
        }

        @Override // e23.q
        public final s1.f0<Float> invoke(s1.t1.b<r5.a> bVar, p3.m mVar, Integer num) {
            s1.t1.b<r5.a> bVar2 = bVar;
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(1780794470);
            p3.x1 x1Var = p3.n.f135158a;
            r5.a aVarC = bVar2.c();
            r5.a aVar = r5.a.Off;
            s1.f0<Float> h1Var = this.f89588a;
            if (aVarC != aVar && bVar2.f() == aVar) {
                h1Var = new s1.h1<>(100);
            }
            mVar2.f();
            return h1Var;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89589a;

        static {
            int[] iArr = new int[r5.a.values().length];
            try {
                iArr[r5.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r5.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r5.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89589a = iArr;
        }
    }

    static {
        float f14 = 2;
        g6.f.a aVar = g6.f.f75994b;
        f89584a = f14;
        f89585b = 20;
        f89586c = f14;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, e23.l lVar, h4.r rVar, boolean z15, q1 q1Var, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        h4.r rVar3;
        boolean z18;
        p3.p2 p2VarI0;
        h4.r rVar4;
        h4.r rVar5;
        r5.a aVar;
        e23.a aVar2;
        boolean z19;
        boolean z24;
        Object objQ;
        int i24;
        p3.o0 o0VarE = mVar.E(-1406741137);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z16 = z15;
                    if (o0VarE.h(z16)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(q1Var)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i19 = i16 | 196608;
                if ((74899 & i19) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i19 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i25 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        }
                        rVar5 = rVar4;
                    } else {
                        o0VarE.e();
                        rVar5 = rVar2;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                    r1.f89474a.getClass();
                    float fFloor = (float) Math.floor(cVar.s0(r1.f89475b));
                    if (z14) {
                        aVar = r5.a.On;
                    } else {
                        aVar = r5.a.Off;
                    }
                    if (lVar != null) {
                        o0VarE.C(2066152950);
                        if ((i19 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z19 | ((i19 & 14) == 4);
                        objQ = o0VarE.q();
                        if (z24) {
                            objQ = new ad0.e(lVar, z14, 7);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad0.e(lVar, z14, 7);
                                o0VarE.K(objQ);
                            }
                        }
                        aVar2 = (e23.a) objQ;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(2066218639);
                        o0VarE.g0(false);
                        aVar2 = null;
                    }
                    e23.a aVar3 = aVar2;
                    o4.u1.f129010b.getClass();
                    boolean z25 = z16;
                    c(aVar, aVar3, new q4.k(fFloor, 0.0f, o4.u1.f129012d, 0, null, 26, null), new q4.k(fFloor, 0.0f, 0, 0, null, 30, null), rVar5, z25, q1Var, o0VarE, (i19 << 6) & 33546240);
                    rVar3 = rVar5;
                    z18 = z25;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z18 = z16;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, q1Var, i14, i15, 2);
                }
            }
            i16 |= 3072;
            z16 = z15;
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(q1Var)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i19 = i16 | 196608;
            if ((74899 & i19) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i19 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                    rVar5 = rVar4;
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                    rVar5 = rVar4;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                g6.c cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                r1.f89474a.getClass();
                float fFloor2 = (float) Math.floor(cVar2.s0(r1.f89475b));
                if (z14) {
                    aVar = r5.a.On;
                } else {
                    aVar = r5.a.Off;
                }
                if (lVar != null) {
                    o0VarE.C(2066152950);
                    if ((i19 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | ((i19 & 14) == 4);
                    objQ = o0VarE.q();
                    if (z24) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 7);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ad0.e(lVar, z14, 7);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2066218639);
                    o0VarE.g0(false);
                    aVar2 = null;
                }
                e23.a aVar4 = aVar2;
                o4.u1.f129010b.getClass();
                boolean z26 = z16;
                c(aVar, aVar4, new q4.k(fFloor2, 0.0f, o4.u1.f129012d, 0, null, 26, null), new q4.k(fFloor2, 0.0f, 0, 0, null, 30, null), rVar5, z26, q1Var, o0VarE, (i19 << 6) & 33546240);
                rVar3 = rVar5;
                z18 = z26;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, q1Var, i14, i15, 2);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(q1Var)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i19 = i16 | 196608;
            if ((74899 & i19) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i19 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                    rVar5 = rVar4;
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                    rVar5 = rVar4;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                g6.c cVar3 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                r1.f89474a.getClass();
                float fFloor3 = (float) Math.floor(cVar3.s0(r1.f89475b));
                if (z14) {
                    aVar = r5.a.On;
                } else {
                    aVar = r5.a.Off;
                }
                if (lVar != null) {
                    o0VarE.C(2066152950);
                    if ((i19 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | ((i19 & 14) == 4);
                    objQ = o0VarE.q();
                    if (z24) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 7);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ad0.e(lVar, z14, 7);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2066218639);
                    o0VarE.g0(false);
                    aVar2 = null;
                }
                e23.a aVar5 = aVar2;
                o4.u1.f129010b.getClass();
                boolean z27 = z16;
                c(aVar, aVar5, new q4.k(fFloor3, 0.0f, o4.u1.f129012d, 0, null, 26, null), new q4.k(fFloor3, 0.0f, 0, 0, null, 30, null), rVar5, z27, q1Var, o0VarE, (i19 << 6) & 33546240);
                rVar3 = rVar5;
                z18 = z27;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, q1Var, i14, i15, 2);
            }
        }
        i16 |= 3072;
        z16 = z15;
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(q1Var)) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i16 |= i24;
        }
        i19 = i16 | 196608;
        if ((74899 & i19) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i19 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                rVar5 = rVar4;
            } else {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                rVar5 = rVar4;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            g6.c cVar4 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            r1.f89474a.getClass();
            float fFloor4 = (float) Math.floor(cVar4.s0(r1.f89475b));
            if (z14) {
                aVar = r5.a.On;
            } else {
                aVar = r5.a.Off;
            }
            if (lVar != null) {
                o0VarE.C(2066152950);
                if ((i19 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | ((i19 & 14) == 4);
                objQ = o0VarE.q();
                if (z24) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ad0.e(lVar, z14, 7);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ad0.e(lVar, z14, 7);
                    o0VarE.K(objQ);
                }
                aVar2 = (e23.a) objQ;
                o0VarE.g0(false);
            } else {
                o0VarE.C(2066218639);
                o0VarE.g0(false);
                aVar2 = null;
            }
            e23.a aVar6 = aVar2;
            o4.u1.f129010b.getClass();
            boolean z28 = z16;
            c(aVar, aVar6, new q4.k(fFloor4, 0.0f, o4.u1.f129012d, 0, null, 26, null), new q4.k(fFloor4, 0.0f, 0, 0, null, 30, null), rVar5, z28, q1Var, o0VarE, (i19 << 6) & 33546240);
            rVar3 = rVar5;
            z18 = z28;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z18 = z16;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, q1Var, i14, i15, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z14, r5.a aVar, h4.r rVar, q1 q1Var, q4.k kVar, q4.k kVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        float f14;
        float f15;
        float f16;
        long j8;
        Object objQ;
        long j14;
        Object objQ2;
        p3.o0 o0VarE = mVar.E(-891330208);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(aVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(q1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(kVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(kVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            s1.t1 t1VarE = s1.w1.e(aVar, null, o0VarE, (i15 >> 3) & 14, 2);
            p3.c2 c2Var = t1VarE.f155747d;
            s1.a2<S> a2Var = t1VarE.f155744a;
            s1.f0 f0VarB = k9.b(n3.h0.DefaultSpatial, o0VarE);
            b bVar = new b(f0VarB);
            p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
            s1.d2 d2Var = s1.e2.f155568a;
            r5.a aVar2 = (r5.a) a2Var.a();
            o0VarE.C(-768316570);
            int[] iArr = c.f89589a;
            int i16 = iArr[aVar2.ordinal()];
            float f17 = 0.0f;
            if (i16 == 1) {
                f14 = 1.0f;
            } else if (i16 != 2) {
                if (i16 != 3) {
                    lc.u0.r();
                    return;
                }
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            o0VarE.g0(false);
            Float fValueOf = Float.valueOf(f14);
            r5.a aVar3 = (r5.a) c2Var.getF182175a();
            o0VarE.C(-768316570);
            int i17 = iArr[aVar3.ordinal()];
            if (i17 == 1) {
                f15 = 1.0f;
            } else if (i17 != 2) {
                if (i17 != 3) {
                    lc.u0.r();
                    return;
                }
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            o0VarE.g0(false);
            s1.t1.d dVarC = s1.w1.c(t1VarE, fValueOf, Float.valueOf(f15), bVar.invoke(t1VarE.f(), o0VarE, 0), d2Var, "FloatAnimation", o0VarE, 0);
            o0Var = o0VarE;
            a aVar4 = new a(f0VarB);
            r5.a aVar5 = (r5.a) a2Var.a();
            o0Var.C(1840054703);
            int i18 = iArr[aVar5.ordinal()];
            if (i18 == 1 || i18 == 2) {
                f16 = 0.0f;
            } else {
                if (i18 != 3) {
                    lc.u0.r();
                    return;
                }
                f16 = 1.0f;
            }
            o0Var.g0(false);
            Float fValueOf2 = Float.valueOf(f16);
            r5.a aVar6 = (r5.a) c2Var.getF182175a();
            o0Var.C(1840054703);
            int i19 = iArr[aVar6.ordinal()];
            if (i19 != 1 && i19 != 2) {
                if (i19 != 3) {
                    lc.u0.r();
                    return;
                }
                f17 = 1.0f;
            }
            o0Var.g0(false);
            s1.t1.d dVarC2 = s1.w1.c(t1VarE, fValueOf2, Float.valueOf(f17), aVar4.invoke(t1VarE.f(), o0Var, 0), d2Var, "FloatAnimation", o0Var, 0);
            Object objQ3 = o0Var.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                p1 p1Var = new p1(null, null, null, 7, null);
                o0Var.K(p1Var);
                objQ3 = p1Var;
            }
            p1 p1Var2 = (p1) objQ3;
            p3.x3 x3VarA = r1.f2.a(aVar == r5.a.Off ? q1Var.f89372b : q1Var.f89371a, q1.a(aVar, o0Var), o0Var);
            if (z14) {
                int i24 = q1.a.f89383a[aVar.ordinal()];
                if (i24 == 1 || i24 == 2) {
                    j8 = q1Var.f89373c;
                } else {
                    if (i24 != 3) {
                        lc.u0.r();
                        return;
                    }
                    j8 = q1Var.f89374d;
                }
            } else {
                int i25 = q1.a.f89383a[aVar.ordinal()];
                if (i25 == 1) {
                    j8 = q1Var.f89375e;
                } else if (i25 == 2) {
                    j8 = q1Var.f89377g;
                } else {
                    if (i25 != 3) {
                        lc.u0.r();
                        return;
                    }
                    j8 = q1Var.f89376f;
                }
            }
            if (z14) {
                o0Var.C(496051715);
                objQ = r1.f2.a(j8, q1.a(aVar, o0Var), o0Var);
                o0Var.g0(false);
            } else {
                o0Var.C(496141925);
                objQ = p3.p0.q(o4.d0.a(j8), o0Var);
                o0Var.g0(false);
            }
            if (z14) {
                int i26 = q1.a.f89383a[aVar.ordinal()];
                if (i26 == 1 || i26 == 2) {
                    j14 = q1Var.f89378h;
                } else {
                    if (i26 != 3) {
                        lc.u0.r();
                        return;
                    }
                    j14 = q1Var.f89379i;
                }
            } else {
                int i27 = q1.a.f89383a[aVar.ordinal()];
                if (i27 == 1) {
                    j14 = q1Var.f89380j;
                } else if (i27 == 2) {
                    j14 = q1Var.f89382l;
                } else {
                    if (i27 != 3) {
                        lc.u0.r();
                        return;
                    }
                    j14 = q1Var.f89381k;
                }
            }
            if (z14) {
                o0Var.C(633231558);
                objQ2 = r1.f2.a(j14, q1.a(aVar, o0Var), o0Var);
                o0Var.g0(false);
            } else {
                o0Var.C(633321768);
                objQ2 = p3.p0.q(o4.d0.a(j14), o0Var);
                o0Var.g0(false);
            }
            h4.d.f81522a.getClass();
            h4.r rVarM = c2.x2.m(c2.x2.y(rVar, h4.d.a.f81528f, 2), f89585b);
            boolean zB = o0Var.B(objQ) | o0Var.B(objQ2) | o0Var.r(kVar2) | o0Var.B(x3VarA) | o0Var.B(dVarC) | o0Var.B(dVarC2) | o0Var.r(kVar);
            Object objQ4 = o0Var.q();
            if (zB || objQ4 == c2565a) {
                b21.a5 a5Var = new b21.a5(objQ, objQ2, kVar2, x3VarA, dVarC, dVarC2, kVar, p1Var2, 4);
                o0Var.K(a5Var);
                objQ4 = a5Var;
            }
            u1.n.b(rVarM, (e23.l) objQ4, o0Var, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(z14, aVar, rVar, q1Var, kVar, kVar2, i14);
        }
    }

    public static final void c(r5.a aVar, e23.a aVar2, q4.k kVar, q4.k kVar2, h4.r rVar, boolean z14, q1 q1Var, p3.m mVar, int i14) {
        int i15;
        h4.r rVarC;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-406243761);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(aVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(kVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(kVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(q1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(null) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (aVar2 != null) {
                h4.r.a aVar3 = h4.r.S;
                p5.l.f136032b.getClass();
                int i17 = p5.l.f136033c;
                n3.i.f122954a.getClass();
                float f14 = n3.i.f122958e / 2;
                g6.f.a aVar4 = g6.f.f75994b;
                rVarC = j2.g.c(aVar3, aVar, fb.a(f14, 4, 0L, false), z14, p5.l.a(i17), aVar2);
            } else {
                rVarC = h4.r.S;
            }
            if (aVar2 != null) {
                h4.r.a aVar5 = h4.r.S;
                f5.p pVar = p7.f89279a;
                rVar2 = d8.f87832a;
                aVar5.getClass();
            } else {
                rVar2 = h4.r.S;
            }
            int i18 = i16 << 6;
            b(z14, aVar, c2.l.y(rVar.then(rVar2).then(rVarC), f89584a), q1Var, kVar, kVar2, o0VarE, ((i16 >> 15) & 14) | ((i16 << 3) & 112) | ((i16 >> 9) & 7168) | (57344 & i18) | (i18 & 458752));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.n9(aVar, aVar2, kVar, kVar2, rVar, z14, q1Var, i14);
        }
    }
}
