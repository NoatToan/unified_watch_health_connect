package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f87964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f87965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f87966c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f87967a;

        public a(e23.a<Unit> aVar) {
            this.f87967a = aVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objF = p008y1.k3.f(h0Var, null, null, new m8(this.f87967a, 1), dVar, 7);
            return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87968a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pc.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pc.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87968a = iArr;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f87964a = 48;
        f87965b = 24;
        f87966c = o4.l1.b(0.5f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:156:0x021c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0226  */
    /* JADX WARN: Code duplicated, block: B:161:0x022f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0248  */
    /* JADX WARN: Code duplicated, block: B:166:0x026f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0275  */
    /* JADX WARN: Code duplicated, block: B:174:0x0294  */
    /* JADX WARN: Code duplicated, block: B:177:0x029c  */
    /* JADX WARN: Code duplicated, block: B:178:0x029f  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02de  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:196:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x0300  */
    /* JADX WARN: Code duplicated, block: B:200:0x0315  */
    /* JADX WARN: Code duplicated, block: B:204:0x031f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0325 A[PHI: r47
      0x0325: PHI (r47v3 i3.f9) = (r47v1 i3.f9), (r47v4 i3.f9) binds: [B:205:0x0323, B:203:0x031c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x0328  */
    /* JADX WARN: Code duplicated, block: B:210:0x032d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0330  */
    /* JADX WARN: Code duplicated, block: B:214:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x033d  */
    /* JADX WARN: Code duplicated, block: B:220:0x034e  */
    /* JADX WARN: Code duplicated, block: B:223:0x035f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0365  */
    /* JADX WARN: Code duplicated, block: B:231:0x037c  */
    /* JADX WARN: Code duplicated, block: B:232:0x037f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0387 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x0389  */
    /* JADX WARN: Code duplicated, block: B:239:0x0400  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:241:0x040c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0412  */
    /* JADX WARN: Code duplicated, block: B:249:0x041f  */
    /* JADX WARN: Code duplicated, block: B:251:0x0423  */
    /* JADX WARN: Code duplicated, block: B:253:0x0436  */
    /* JADX WARN: Code duplicated, block: B:255:0x0450  */
    /* JADX WARN: Code duplicated, block: B:258:0x046e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    public static final void a(final e23.a aVar, h4.r rVar, mc mcVar, float f14, boolean z14, o4.r1 r1Var, long j8, long j14, float f15, long j15, final e23.p pVar, e23.p pVar2, f9 f9Var, final z3.e eVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        h4.r rVar2;
        int i18;
        int i19;
        int i24;
        long jE;
        long j16;
        int i25;
        int i26;
        final e23.p pVar3;
        int i27;
        int i28;
        int i29;
        boolean z15;
        boolean z16;
        final float f16;
        final boolean z17;
        final o4.r1 r1Var2;
        final f9 f9Var2;
        p3.o0 o0Var;
        final h4.r rVar3;
        final long j17;
        final float f17;
        final long j18;
        final long j19;
        p3.p2 p2VarI0;
        f0 f0Var;
        boolean z18;
        o4.r1 r1VarC;
        long jB;
        int i30;
        float f18;
        long jC;
        f9 f9Var3;
        int i34;
        e23.p pVar4;
        int i35;
        long j24;
        long j25;
        boolean z19;
        float f19;
        long j26;
        s1.f0 f0VarB;
        s1.f0 f0VarB2;
        s1.f0 f0VarB3;
        int i36;
        boolean zR;
        Object objQ;
        p3.m.a aVar2;
        mc mcVar2;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        o53.b0 b0Var;
        int i37;
        boolean z24;
        boolean z25;
        Object objQ3;
        f9 f9Var4;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objQ4;
        Object objQ5;
        s1.b bVar;
        boolean z29;
        boolean z34;
        Object objQ6;
        Object objQ7;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        final mc mcVar3 = mcVar;
        p3.o0 o0VarE = mVar.E(1904798512);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i48 = i16 & 2;
        if (i48 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.B(mcVar3)) {
                    i47 = 256;
                } else {
                    i47 = 128;
                }
                i17 |= i47;
            }
            i18 = i17 | 3072;
            i19 = i16 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.h(z14)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i18 |= i24;
                }
                if ((i14 & 196608) != 0) {
                    if ((i16 & 32) == 0 || !o0VarE.B(r1Var)) {
                        i46 = 65536;
                    } else {
                        i46 = 131072;
                    }
                    i18 |= i46;
                }
                if ((i14 & 1572864) == 0) {
                    jE = j8;
                    if ((i16 & 64) == 0 || !o0VarE.l(jE)) {
                        i45 = 524288;
                    } else {
                        i45 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    }
                    i18 |= i45;
                } else {
                    jE = j8;
                }
                if ((i14 & 12582912) == 0) {
                    j16 = j14;
                    if ((i16 & 128) == 0 || !o0VarE.l(j16)) {
                        i44 = 4194304;
                    } else {
                        i44 = 8388608;
                    }
                    i18 |= i44;
                } else {
                    j16 = j14;
                }
                i25 = i18 | 100663296;
                if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
                    if ((i16 & 512) == 0 || !o0VarE.l(j15)) {
                        i39 = 268435456;
                    } else {
                        i39 = 536870912;
                    }
                    i25 |= i39;
                }
                if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i26 = i15 | i38;
                } else {
                    i26 = i15;
                }
                if ((i16 & 2048) == 0) {
                    pVar3 = pVar2;
                    int i49 = o0VarE.r(pVar3) ? 32 : 16;
                    i27 = i26 | i49;
                    i28 = i16 & 4096;
                    if (i28 != 0) {
                        if ((i15 & 384) == 0) {
                            if (o0VarE.B(f9Var)) {
                                i29 = 256;
                            } else {
                                i29 = 128;
                            }
                            i27 |= i29;
                        }
                        z15 = true;
                        if ((i25 & 306783379) == 306783378 || (i27 & 1171) != 1170) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i25 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0 || o0VarE.o0()) {
                                if (i48 != 0) {
                                    rVar2 = h4.r.S;
                                }
                                f0Var = f0.f88041a;
                                f0Var.getClass();
                                float f22 = f0.f88043c;
                                if (i19 != 0) {
                                    z18 = true;
                                } else {
                                    z18 = z14;
                                }
                                if ((i16 & 32) != 0) {
                                    f0Var.getClass();
                                    p3.x1 x1Var = p3.n.f135158a;
                                    n3.w0.f123292a.getClass();
                                    r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                    i25 &= -458753;
                                } else {
                                    r1VarC = r1Var;
                                }
                                if ((i16 & 64) != 0) {
                                    f0Var.getClass();
                                    p3.x1 x1Var2 = p3.n.f135158a;
                                    n3.w0.f123292a.getClass();
                                    jE = k2.e(n3.w0.f123293b, o0VarE);
                                    i25 &= -3670017;
                                }
                                if ((i16 & 128) != 0) {
                                    jB = k2.b(jE, o0VarE);
                                    i25 &= -29360129;
                                } else {
                                    jB = j16;
                                }
                                i30 = i27;
                                f18 = 0;
                                g6.f.a aVar3 = g6.f.f75994b;
                                if ((i16 & 512) != 0) {
                                    f0Var.getClass();
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    n3.t0.f123259a.getClass();
                                    jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                    i25 &= -1879048193;
                                } else {
                                    jC = j15;
                                }
                                if ((i16 & 2048) != 0) {
                                    pVar3 = o8.f89157a;
                                    i30 &= -113;
                                }
                                if (i28 != 0) {
                                    f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    f9Var3 = f9Var;
                                }
                                i34 = i25;
                                pVar4 = pVar3;
                                i35 = i30;
                                j24 = jC;
                                j25 = jE;
                                z19 = z18;
                                f19 = f22;
                                j26 = jB;
                            } else {
                                o0VarE.e();
                                if ((i16 & 32) != 0) {
                                    i25 &= -458753;
                                }
                                if ((i16 & 64) != 0) {
                                    i25 &= -3670017;
                                }
                                if ((i16 & 128) != 0) {
                                    i25 &= -29360129;
                                }
                                if ((i16 & 512) != 0) {
                                    i25 &= -1879048193;
                                }
                                if ((i16 & 2048) != 0) {
                                    i27 &= -113;
                                }
                                int i54 = i25;
                                i35 = i27;
                                i34 = i54;
                                r1VarC = r1Var;
                                f18 = f15;
                                j24 = j15;
                                j25 = jE;
                                pVar4 = pVar3;
                                f19 = f14;
                                z19 = z14;
                                j26 = j16;
                                f9Var3 = f9Var;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var4 = p3.n.f135158a;
                            n3.h0 h0Var = n3.h0.DefaultSpatial;
                            e23.p pVar5 = pVar4;
                            f0VarB = k9.b(h0Var, o0VarE);
                            f0VarB2 = k9.b(h0Var, o0VarE);
                            f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                            long j27 = j25;
                            i36 = (i34 & 896) ^ 384;
                            zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                            objQ = o0VarE.q();
                            aVar2 = p3.m.f135153a;
                            if (zR) {
                                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                mcVar2 = mcVar;
                                o0VarE.K(objQ);
                            } else {
                                aVar2.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                    mcVar2 = mcVar;
                                    o0VarE.K(objQ);
                                } else {
                                    mcVar2 = mcVar;
                                }
                            }
                            p3.l0.i((e23.a) objQ, o0VarE);
                            objQ2 = o0VarE.q();
                            aVar2.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ2 == c2565a) {
                                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                                o0VarE.K(objQ2);
                            }
                            b0Var = (o53.b0) objQ2;
                            boolean zR2 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                            i37 = i34 & 14;
                            if (i37 == 4) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zR2 | z24;
                            objQ3 = o0VarE.q();
                            if (z25 || objQ3 == c2565a) {
                                objQ3 = new eu.b(mcVar2, b0Var, aVar);
                                o0VarE.K(objQ3);
                            }
                            e23.a aVar4 = (e23.a) objQ3;
                            boolean zR3 = o0VarE.r(b0Var);
                            if (i36 > 256 || !o0VarE.B(mcVar2)) {
                                f9Var4 = f9Var3;
                                if ((i34 & 384) != 256) {
                                    z26 = false;
                                }
                                boolean z35 = z26 | zR3;
                                if (i37 == 4) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                z28 = z35 | z27;
                                objQ4 = o0VarE.q();
                                if (z28 || objQ4 == c2565a) {
                                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                                    o0VarE.K(objQ4);
                                }
                                e23.l lVar = (e23.l) objQ4;
                                objQ5 = o0VarE.q();
                                if (objQ5 == c2565a) {
                                    objQ5 = s1.d.a(0.0f, 0.01f);
                                    o0VarE.K(objQ5);
                                }
                                bVar = (s1.b) objQ5;
                                boolean zR4 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                                if (i37 == 4) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zR4 | z29;
                                objQ6 = o0VarE.q();
                                if (z34 || objQ6 == c2565a) {
                                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                                    o0VarE.K(objQ6);
                                }
                                e23.a aVar5 = (e23.a) objQ6;
                                int i55 = i34;
                                h4.r rVar4 = rVar2;
                                o4.r1 r1Var3 = r1VarC;
                                f9 f9Var5 = f9Var4;
                                long j28 = j24;
                                mcVar3 = mcVar;
                                i9.a(aVar5, j26, f9Var5, bVar, z3.f.c(1010026864, new s8(j28, aVar4, mcVar, f9Var5, bVar, b0Var, lVar, rVar4, f19, z19, r1Var3, j27, j26, f18, pVar, pVar5, eVar), o0VarE), o0VarE, (i35 & 896) | ((i55 >> 18) & 112) | 24576 | 4096);
                                if (mcVar3.f88996e.e().d(pc.Expanded)) {
                                    o0VarE.C(748459762);
                                    if ((i36 > 256 || !o0VarE.B(mcVar3)) && (i55 & 384) != 256) {
                                    }
                                    objQ7 = o0VarE.q();
                                    if (z15 || objQ7 == c2565a) {
                                        objQ7 = new t8(mcVar3, null);
                                        o0VarE.K(objQ7);
                                    }
                                    p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                                    o0VarE.g0(false);
                                } else {
                                    o0VarE.C(748521266);
                                    o0VarE.g0(false);
                                }
                                o0Var = o0VarE;
                                f16 = f19;
                                r1Var2 = r1Var3;
                                j19 = j27;
                                j17 = j28;
                                rVar3 = rVar4;
                                j18 = j26;
                                pVar3 = pVar5;
                                f9Var2 = f9Var5;
                                z17 = z19;
                                f17 = f18;
                            } else {
                                f9Var4 = f9Var3;
                            }
                            z26 = true;
                            boolean z36 = z26 | zR3;
                            if (i37 == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            z28 = z36 | z27;
                            objQ4 = o0VarE.q();
                            if (z28) {
                                objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                                o0VarE.K(objQ4);
                            } else {
                                objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                                o0VarE.K(objQ4);
                            }
                            e23.l lVar2 = (e23.l) objQ4;
                            objQ5 = o0VarE.q();
                            if (objQ5 == c2565a) {
                                objQ5 = s1.d.a(0.0f, 0.01f);
                                o0VarE.K(objQ5);
                            }
                            bVar = (s1.b) objQ5;
                            boolean zR5 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                            if (i37 == 4) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zR5 | z29;
                            objQ6 = o0VarE.q();
                            if (z34) {
                                objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                                o0VarE.K(objQ6);
                            } else {
                                objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                                o0VarE.K(objQ6);
                            }
                            e23.a aVar6 = (e23.a) objQ6;
                            int i56 = i34;
                            h4.r rVar5 = rVar2;
                            o4.r1 r1Var4 = r1VarC;
                            f9 f9Var6 = f9Var4;
                            long j29 = j24;
                            mcVar3 = mcVar;
                            i9.a(aVar6, j26, f9Var6, bVar, z3.f.c(1010026864, new s8(j29, aVar4, mcVar, f9Var6, bVar, b0Var, lVar2, rVar5, f19, z19, r1Var4, j27, j26, f18, pVar, pVar5, eVar), o0VarE), o0VarE, (i35 & 896) | ((i56 >> 18) & 112) | 24576 | 4096);
                            if (mcVar3.f88996e.e().d(pc.Expanded)) {
                                o0VarE.C(748459762);
                                z15 = i36 > 256 ? false : false;
                                objQ7 = o0VarE.q();
                                if (z15) {
                                    objQ7 = new t8(mcVar3, null);
                                    o0VarE.K(objQ7);
                                } else {
                                    objQ7 = new t8(mcVar3, null);
                                    o0VarE.K(objQ7);
                                }
                                p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(748521266);
                                o0VarE.g0(false);
                            }
                            o0Var = o0VarE;
                            f16 = f19;
                            r1Var2 = r1Var4;
                            j19 = j27;
                            j17 = j29;
                            rVar3 = rVar5;
                            j18 = j26;
                            pVar3 = pVar5;
                            f9Var2 = f9Var6;
                            z17 = z19;
                            f17 = f18;
                        } else {
                            o0VarE.e();
                            f16 = f14;
                            z17 = z14;
                            r1Var2 = r1Var;
                            f9Var2 = f9Var;
                            o0Var = o0VarE;
                            rVar3 = rVar2;
                            j17 = j15;
                            f17 = f15;
                            j18 = j16;
                            j19 = jE;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i27 |= 384;
                    z15 = true;
                    if ((i25 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i25 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f24 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar7 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f24;
                            j26 = jB;
                        } else {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f25 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar8 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f25;
                            j26 = jB;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var11 = p3.n.f135158a;
                        n3.h0 h0Var2 = n3.h0.DefaultSpatial;
                        e23.p pVar6 = pVar4;
                        f0VarB = k9.b(h0Var2, o0VarE);
                        f0VarB2 = k9.b(h0Var2, o0VarE);
                        f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                        long j210 = j25;
                        i36 = (i34 & 896) ^ 384;
                        zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                        objQ = o0VarE.q();
                        aVar2 = p3.m.f135153a;
                        if (zR) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                mcVar2 = mcVar;
                                o0VarE.K(objQ);
                            } else {
                                mcVar2 = mcVar;
                            }
                        } else {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        }
                        p3.l0.i((e23.a) objQ, o0VarE);
                        objQ2 = o0VarE.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                            o0VarE.K(objQ2);
                        }
                        b0Var = (o53.b0) objQ2;
                        boolean zR6 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                        i37 = i34 & 14;
                        if (i37 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zR6 | z24;
                        objQ3 = o0VarE.q();
                        if (z25) {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar9 = (e23.a) objQ3;
                        boolean zR7 = o0VarE.r(b0Var);
                        if (i36 > 256) {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean z37 = z26 | zR7;
                        if (i37 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z37 | z27;
                        objQ4 = o0VarE.q();
                        if (z28) {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        }
                        e23.l lVar3 = (e23.l) objQ4;
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a) {
                            objQ5 = s1.d.a(0.0f, 0.01f);
                            o0VarE.K(objQ5);
                        }
                        bVar = (s1.b) objQ5;
                        boolean zR8 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                        if (i37 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zR8 | z29;
                        objQ6 = o0VarE.q();
                        if (z34) {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        }
                        e23.a aVar10 = (e23.a) objQ6;
                        int i57 = i34;
                        h4.r rVar6 = rVar2;
                        o4.r1 r1Var5 = r1VarC;
                        f9 f9Var7 = f9Var4;
                        long j211 = j24;
                        mcVar3 = mcVar;
                        i9.a(aVar10, j26, f9Var7, bVar, z3.f.c(1010026864, new s8(j211, aVar9, mcVar, f9Var7, bVar, b0Var, lVar3, rVar6, f19, z19, r1Var5, j210, j26, f18, pVar, pVar6, eVar), o0VarE), o0VarE, (i35 & 896) | ((i57 >> 18) & 112) | 24576 | 4096);
                        if (mcVar3.f88996e.e().d(pc.Expanded)) {
                            o0VarE.C(748459762);
                            if (i36 > 256) {
                            }
                            objQ7 = o0VarE.q();
                            if (z15) {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            } else {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            }
                            p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(748521266);
                            o0VarE.g0(false);
                        }
                        o0Var = o0VarE;
                        f16 = f19;
                        r1Var2 = r1Var5;
                        j19 = j210;
                        j17 = j211;
                        rVar3 = rVar6;
                        j18 = j26;
                        pVar3 = pVar6;
                        f9Var2 = f9Var7;
                        z17 = z19;
                        f17 = f18;
                    } else {
                        o0VarE.e();
                        f16 = f14;
                        z17 = z14;
                        r1Var2 = r1Var;
                        f9Var2 = f9Var;
                        o0Var = o0VarE;
                        rVar3 = rVar2;
                        j17 = j15;
                        f17 = f15;
                        j18 = j16;
                        j19 = jE;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                pVar3 = pVar2;
                i27 = i26 | i49;
                i28 = i16 & 4096;
                if (i28 != 0) {
                    if ((i15 & 384) == 0) {
                        if (o0VarE.B(f9Var)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i27 |= i29;
                    }
                    z15 = true;
                    if ((i25 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i25 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f26 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar11 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f26;
                            j26 = jB;
                        } else {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f27 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar12 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var17 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f27;
                            j26 = jB;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var18 = p3.n.f135158a;
                        n3.h0 h0Var3 = n3.h0.DefaultSpatial;
                        e23.p pVar7 = pVar4;
                        f0VarB = k9.b(h0Var3, o0VarE);
                        f0VarB2 = k9.b(h0Var3, o0VarE);
                        f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                        long j212 = j25;
                        i36 = (i34 & 896) ^ 384;
                        zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                        objQ = o0VarE.q();
                        aVar2 = p3.m.f135153a;
                        if (zR) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                mcVar2 = mcVar;
                                o0VarE.K(objQ);
                            } else {
                                mcVar2 = mcVar;
                            }
                        } else {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        }
                        p3.l0.i((e23.a) objQ, o0VarE);
                        objQ2 = o0VarE.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                            o0VarE.K(objQ2);
                        }
                        b0Var = (o53.b0) objQ2;
                        boolean zR9 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                        i37 = i34 & 14;
                        if (i37 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zR9 | z24;
                        objQ3 = o0VarE.q();
                        if (z25) {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar13 = (e23.a) objQ3;
                        boolean zR10 = o0VarE.r(b0Var);
                        if (i36 > 256) {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean z38 = z26 | zR10;
                        if (i37 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z38 | z27;
                        objQ4 = o0VarE.q();
                        if (z28) {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        }
                        e23.l lVar4 = (e23.l) objQ4;
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a) {
                            objQ5 = s1.d.a(0.0f, 0.01f);
                            o0VarE.K(objQ5);
                        }
                        bVar = (s1.b) objQ5;
                        boolean zR11 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                        if (i37 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zR11 | z29;
                        objQ6 = o0VarE.q();
                        if (z34) {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        }
                        e23.a aVar14 = (e23.a) objQ6;
                        int i58 = i34;
                        h4.r rVar7 = rVar2;
                        o4.r1 r1Var6 = r1VarC;
                        f9 f9Var8 = f9Var4;
                        long j213 = j24;
                        mcVar3 = mcVar;
                        i9.a(aVar14, j26, f9Var8, bVar, z3.f.c(1010026864, new s8(j213, aVar13, mcVar, f9Var8, bVar, b0Var, lVar4, rVar7, f19, z19, r1Var6, j212, j26, f18, pVar, pVar7, eVar), o0VarE), o0VarE, (i35 & 896) | ((i58 >> 18) & 112) | 24576 | 4096);
                        if (mcVar3.f88996e.e().d(pc.Expanded)) {
                            o0VarE.C(748459762);
                            if (i36 > 256) {
                            }
                            objQ7 = o0VarE.q();
                            if (z15) {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            } else {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            }
                            p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(748521266);
                            o0VarE.g0(false);
                        }
                        o0Var = o0VarE;
                        f16 = f19;
                        r1Var2 = r1Var6;
                        j19 = j212;
                        j17 = j213;
                        rVar3 = rVar7;
                        j18 = j26;
                        pVar3 = pVar7;
                        f9Var2 = f9Var8;
                        z17 = z19;
                        f17 = f18;
                    } else {
                        o0VarE.e();
                        f16 = f14;
                        z17 = z14;
                        r1Var2 = r1Var;
                        f9Var2 = f9Var;
                        o0Var = o0VarE;
                        rVar3 = rVar2;
                        j17 = j15;
                        f17 = f15;
                        j18 = j16;
                        j19 = jE;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i27 |= 384;
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f28 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var19 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var110 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar15 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f28;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f29 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var112 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var113 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar16 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var114 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f29;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var115 = p3.n.f135158a;
                    n3.h0 h0Var4 = n3.h0.DefaultSpatial;
                    e23.p pVar8 = pVar4;
                    f0VarB = k9.b(h0Var4, o0VarE);
                    f0VarB2 = k9.b(h0Var4, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j214 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR12 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR12 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar17 = (e23.a) objQ3;
                    boolean zR13 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z39 = z26 | zR13;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z39 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar5 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR14 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR14 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar18 = (e23.a) objQ6;
                    int i59 = i34;
                    h4.r rVar8 = rVar2;
                    o4.r1 r1Var7 = r1VarC;
                    f9 f9Var9 = f9Var4;
                    long j215 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar18, j26, f9Var9, bVar, z3.f.c(1010026864, new s8(j215, aVar17, mcVar, f9Var9, bVar, b0Var, lVar5, rVar8, f19, z19, r1Var7, j214, j26, f18, pVar, pVar8, eVar), o0VarE), o0VarE, (i35 & 896) | ((i59 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var7;
                    j19 = j214;
                    j17 = j215;
                    rVar3 = rVar8;
                    j18 = j26;
                    pVar3 = pVar8;
                    f9Var2 = f9Var9;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i18 = i17 | 27648;
            if ((i14 & 196608) != 0) {
                if ((i16 & 32) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i18 |= i46;
            }
            if ((i14 & 1572864) == 0) {
                jE = j8;
                if ((i16 & 64) == 0) {
                    i45 = 524288;
                } else {
                    i45 = 524288;
                }
                i18 |= i45;
            } else {
                jE = j8;
            }
            if ((i14 & 12582912) == 0) {
                j16 = j14;
                if ((i16 & 128) == 0) {
                    i44 = 4194304;
                } else {
                    i44 = 4194304;
                }
                i18 |= i44;
            } else {
                j16 = j14;
            }
            i25 = i18 | 100663296;
            if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
                if ((i16 & 512) == 0) {
                    i39 = 268435456;
                } else {
                    i39 = 268435456;
                }
                i25 |= i39;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i26 = i15 | i38;
            } else {
                i26 = i15;
            }
            if ((i16 & 2048) == 0) {
                pVar3 = pVar2;
                if (o0VarE.r(pVar3)) {
                }
                i27 = i26 | i49;
                i28 = i16 & 4096;
                if (i28 != 0) {
                    if ((i15 & 384) == 0) {
                        if (o0VarE.B(f9Var)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i27 |= i29;
                    }
                    z15 = true;
                    if ((i25 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i25 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f210 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var116 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var117 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar19 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var118 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f210;
                            j26 = jB;
                        } else {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f211 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var119 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var1110 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar110 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var1111 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f211;
                            j26 = jB;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1112 = p3.n.f135158a;
                        n3.h0 h0Var5 = n3.h0.DefaultSpatial;
                        e23.p pVar9 = pVar4;
                        f0VarB = k9.b(h0Var5, o0VarE);
                        f0VarB2 = k9.b(h0Var5, o0VarE);
                        f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                        long j216 = j25;
                        i36 = (i34 & 896) ^ 384;
                        zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                        objQ = o0VarE.q();
                        aVar2 = p3.m.f135153a;
                        if (zR) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                mcVar2 = mcVar;
                                o0VarE.K(objQ);
                            } else {
                                mcVar2 = mcVar;
                            }
                        } else {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        }
                        p3.l0.i((e23.a) objQ, o0VarE);
                        objQ2 = o0VarE.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                            o0VarE.K(objQ2);
                        }
                        b0Var = (o53.b0) objQ2;
                        boolean zR15 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                        i37 = i34 & 14;
                        if (i37 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zR15 | z24;
                        objQ3 = o0VarE.q();
                        if (z25) {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar111 = (e23.a) objQ3;
                        boolean zR16 = o0VarE.r(b0Var);
                        if (i36 > 256) {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean z310 = z26 | zR16;
                        if (i37 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z310 | z27;
                        objQ4 = o0VarE.q();
                        if (z28) {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        }
                        e23.l lVar6 = (e23.l) objQ4;
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a) {
                            objQ5 = s1.d.a(0.0f, 0.01f);
                            o0VarE.K(objQ5);
                        }
                        bVar = (s1.b) objQ5;
                        boolean zR17 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                        if (i37 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zR17 | z29;
                        objQ6 = o0VarE.q();
                        if (z34) {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        }
                        e23.a aVar112 = (e23.a) objQ6;
                        int i510 = i34;
                        h4.r rVar9 = rVar2;
                        o4.r1 r1Var8 = r1VarC;
                        f9 f9Var10 = f9Var4;
                        long j217 = j24;
                        mcVar3 = mcVar;
                        i9.a(aVar112, j26, f9Var10, bVar, z3.f.c(1010026864, new s8(j217, aVar111, mcVar, f9Var10, bVar, b0Var, lVar6, rVar9, f19, z19, r1Var8, j216, j26, f18, pVar, pVar9, eVar), o0VarE), o0VarE, (i35 & 896) | ((i510 >> 18) & 112) | 24576 | 4096);
                        if (mcVar3.f88996e.e().d(pc.Expanded)) {
                            o0VarE.C(748459762);
                            if (i36 > 256) {
                            }
                            objQ7 = o0VarE.q();
                            if (z15) {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            } else {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            }
                            p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(748521266);
                            o0VarE.g0(false);
                        }
                        o0Var = o0VarE;
                        f16 = f19;
                        r1Var2 = r1Var8;
                        j19 = j216;
                        j17 = j217;
                        rVar3 = rVar9;
                        j18 = j26;
                        pVar3 = pVar9;
                        f9Var2 = f9Var10;
                        z17 = z19;
                        f17 = f18;
                    } else {
                        o0VarE.e();
                        f16 = f14;
                        z17 = z14;
                        r1Var2 = r1Var;
                        f9Var2 = f9Var;
                        o0Var = o0VarE;
                        rVar3 = rVar2;
                        j17 = j15;
                        f17 = f15;
                        j18 = j16;
                        j19 = jE;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i27 |= 384;
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f212 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1113 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1114 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar113 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1115 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f212;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f213 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1116 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1117 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar114 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1118 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f213;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1119 = p3.n.f135158a;
                    n3.h0 h0Var6 = n3.h0.DefaultSpatial;
                    e23.p pVar10 = pVar4;
                    f0VarB = k9.b(h0Var6, o0VarE);
                    f0VarB2 = k9.b(h0Var6, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j218 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR18 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR18 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar115 = (e23.a) objQ3;
                    boolean zR19 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z311 = z26 | zR19;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z311 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar7 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR110 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR110 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar116 = (e23.a) objQ6;
                    int i511 = i34;
                    h4.r rVar10 = rVar2;
                    o4.r1 r1Var9 = r1VarC;
                    f9 f9Var11 = f9Var4;
                    long j219 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar116, j26, f9Var11, bVar, z3.f.c(1010026864, new s8(j219, aVar115, mcVar, f9Var11, bVar, b0Var, lVar7, rVar10, f19, z19, r1Var9, j218, j26, f18, pVar, pVar10, eVar), o0VarE), o0VarE, (i35 & 896) | ((i511 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var9;
                    j19 = j218;
                    j17 = j219;
                    rVar3 = rVar10;
                    j18 = j26;
                    pVar3 = pVar10;
                    f9Var2 = f9Var11;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            pVar3 = pVar2;
            i27 = i26 | i49;
            i28 = i16 & 4096;
            if (i28 != 0) {
                if ((i15 & 384) == 0) {
                    if (o0VarE.B(f9Var)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i27 |= i29;
                }
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f214 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11110 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11111 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar117 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11112 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f214;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f215 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11113 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11114 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar118 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11115 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f215;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11116 = p3.n.f135158a;
                    n3.h0 h0Var7 = n3.h0.DefaultSpatial;
                    e23.p pVar11 = pVar4;
                    f0VarB = k9.b(h0Var7, o0VarE);
                    f0VarB2 = k9.b(h0Var7, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j2110 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR111 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR111 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar119 = (e23.a) objQ3;
                    boolean zR112 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z312 = z26 | zR112;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z312 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar8 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR113 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR113 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar1110 = (e23.a) objQ6;
                    int i512 = i34;
                    h4.r rVar11 = rVar2;
                    o4.r1 r1Var10 = r1VarC;
                    f9 f9Var12 = f9Var4;
                    long j2111 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar1110, j26, f9Var12, bVar, z3.f.c(1010026864, new s8(j2111, aVar119, mcVar, f9Var12, bVar, b0Var, lVar8, rVar11, f19, z19, r1Var10, j2110, j26, f18, pVar, pVar11, eVar), o0VarE), o0VarE, (i35 & 896) | ((i512 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var10;
                    j19 = j2110;
                    j17 = j2111;
                    rVar3 = rVar11;
                    j18 = j26;
                    pVar3 = pVar11;
                    f9Var2 = f9Var12;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i27 |= 384;
            z15 = true;
            if ((i25 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f216 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11117 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11118 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar1111 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11119 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f216;
                    j26 = jB;
                } else {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f217 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var111110 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var111111 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar1112 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var111112 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f217;
                    j26 = jB;
                }
                o0VarE.h0();
                p3.x1 x1Var111113 = p3.n.f135158a;
                n3.h0 h0Var8 = n3.h0.DefaultSpatial;
                e23.p pVar12 = pVar4;
                f0VarB = k9.b(h0Var8, o0VarE);
                f0VarB2 = k9.b(h0Var8, o0VarE);
                f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                long j2112 = j25;
                i36 = (i34 & 896) ^ 384;
                zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (zR) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    } else {
                        mcVar2 = mcVar;
                    }
                } else {
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                    mcVar2 = mcVar;
                    o0VarE.K(objQ);
                }
                p3.l0.i((e23.a) objQ, o0VarE);
                objQ2 = o0VarE.q();
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (o53.b0) objQ2;
                boolean zR114 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                i37 = i34 & 14;
                if (i37 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zR114 | z24;
                objQ3 = o0VarE.q();
                if (z25) {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                }
                e23.a aVar1113 = (e23.a) objQ3;
                boolean zR115 = o0VarE.r(b0Var);
                if (i36 > 256) {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean z313 = z26 | zR115;
                if (i37 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z313 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                }
                e23.l lVar9 = (e23.l) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = s1.d.a(0.0f, 0.01f);
                    o0VarE.K(objQ5);
                }
                bVar = (s1.b) objQ5;
                boolean zR116 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                if (i37 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = zR116 | z29;
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                }
                e23.a aVar1114 = (e23.a) objQ6;
                int i513 = i34;
                h4.r rVar12 = rVar2;
                o4.r1 r1Var11 = r1VarC;
                f9 f9Var13 = f9Var4;
                long j2113 = j24;
                mcVar3 = mcVar;
                i9.a(aVar1114, j26, f9Var13, bVar, z3.f.c(1010026864, new s8(j2113, aVar1113, mcVar, f9Var13, bVar, b0Var, lVar9, rVar12, f19, z19, r1Var11, j2112, j26, f18, pVar, pVar12, eVar), o0VarE), o0VarE, (i35 & 896) | ((i513 >> 18) & 112) | 24576 | 4096);
                if (mcVar3.f88996e.e().d(pc.Expanded)) {
                    o0VarE.C(748459762);
                    if (i36 > 256) {
                    }
                    objQ7 = o0VarE.q();
                    if (z15) {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    } else {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    }
                    p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(748521266);
                    o0VarE.g0(false);
                }
                o0Var = o0VarE;
                f16 = f19;
                r1Var2 = r1Var11;
                j19 = j2112;
                j17 = j2113;
                rVar3 = rVar12;
                j18 = j26;
                pVar3 = pVar12;
                f9Var2 = f9Var13;
                z17 = z19;
                f17 = f18;
            } else {
                o0VarE.e();
                f16 = f14;
                z17 = z14;
                r1Var2 = r1Var;
                f9Var2 = f9Var;
                o0Var = o0VarE;
                rVar3 = rVar2;
                j17 = j15;
                f17 = f15;
                j18 = j16;
                j19 = jE;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.B(mcVar3)) {
                i47 = 256;
            } else {
                i47 = 128;
            }
            i17 |= i47;
        }
        i18 = i17 | 3072;
        i19 = i16 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.h(z14)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i18 |= i24;
            }
            if ((i14 & 196608) != 0) {
                if ((i16 & 32) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i18 |= i46;
            }
            if ((i14 & 1572864) == 0) {
                jE = j8;
                if ((i16 & 64) == 0) {
                    i45 = 524288;
                } else {
                    i45 = 524288;
                }
                i18 |= i45;
            } else {
                jE = j8;
            }
            if ((i14 & 12582912) == 0) {
                j16 = j14;
                if ((i16 & 128) == 0) {
                    i44 = 4194304;
                } else {
                    i44 = 4194304;
                }
                i18 |= i44;
            } else {
                j16 = j14;
            }
            i25 = i18 | 100663296;
            if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
                if ((i16 & 512) == 0) {
                    i39 = 268435456;
                } else {
                    i39 = 268435456;
                }
                i25 |= i39;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i26 = i15 | i38;
            } else {
                i26 = i15;
            }
            if ((i16 & 2048) == 0) {
                pVar3 = pVar2;
                if (o0VarE.r(pVar3)) {
                }
                i27 = i26 | i49;
                i28 = i16 & 4096;
                if (i28 != 0) {
                    if ((i15 & 384) == 0) {
                        if (o0VarE.B(f9Var)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i27 |= i29;
                    }
                    z15 = true;
                    if ((i25 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i25 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f218 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111114 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111115 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar1115 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111116 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f218;
                            j26 = jB;
                        } else {
                            if (i48 != 0) {
                                rVar2 = h4.r.S;
                            }
                            f0Var = f0.f88041a;
                            f0Var.getClass();
                            float f219 = f0.f88043c;
                            if (i19 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if ((i16 & 32) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111117 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                                i25 &= -458753;
                            } else {
                                r1VarC = r1Var;
                            }
                            if ((i16 & 64) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111118 = p3.n.f135158a;
                                n3.w0.f123292a.getClass();
                                jE = k2.e(n3.w0.f123293b, o0VarE);
                                i25 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jB = k2.b(jE, o0VarE);
                                i25 &= -29360129;
                            } else {
                                jB = j16;
                            }
                            i30 = i27;
                            f18 = 0;
                            g6.f.a aVar1116 = g6.f.f75994b;
                            if ((i16 & 512) != 0) {
                                f0Var.getClass();
                                p3.x1 x1Var111119 = p3.n.f135158a;
                                n3.t0.f123259a.getClass();
                                jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                                i25 &= -1879048193;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 2048) != 0) {
                                pVar3 = o8.f89157a;
                                i30 &= -113;
                            }
                            if (i28 != 0) {
                                f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                            } else {
                                f9Var3 = f9Var;
                            }
                            i34 = i25;
                            pVar4 = pVar3;
                            i35 = i30;
                            j24 = jC;
                            j25 = jE;
                            z19 = z18;
                            f19 = f219;
                            j26 = jB;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1111110 = p3.n.f135158a;
                        n3.h0 h0Var9 = n3.h0.DefaultSpatial;
                        e23.p pVar13 = pVar4;
                        f0VarB = k9.b(h0Var9, o0VarE);
                        f0VarB2 = k9.b(h0Var9, o0VarE);
                        f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                        long j2114 = j25;
                        i36 = (i34 & 896) ^ 384;
                        zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                        objQ = o0VarE.q();
                        aVar2 = p3.m.f135153a;
                        if (zR) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                                mcVar2 = mcVar;
                                o0VarE.K(objQ);
                            } else {
                                mcVar2 = mcVar;
                            }
                        } else {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        }
                        p3.l0.i((e23.a) objQ, o0VarE);
                        objQ2 = o0VarE.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                            o0VarE.K(objQ2);
                        }
                        b0Var = (o53.b0) objQ2;
                        boolean zR117 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                        i37 = i34 & 14;
                        if (i37 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zR117 | z24;
                        objQ3 = o0VarE.q();
                        if (z25) {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new eu.b(mcVar2, b0Var, aVar);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar1117 = (e23.a) objQ3;
                        boolean zR118 = o0VarE.r(b0Var);
                        if (i36 > 256) {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            f9Var4 = f9Var3;
                            if ((i34 & 384) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean z314 = z26 | zR118;
                        if (i37 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z314 | z27;
                        objQ4 = o0VarE.q();
                        if (z28) {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                            o0VarE.K(objQ4);
                        }
                        e23.l lVar10 = (e23.l) objQ4;
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a) {
                            objQ5 = s1.d.a(0.0f, 0.01f);
                            o0VarE.K(objQ5);
                        }
                        bVar = (s1.b) objQ5;
                        boolean zR119 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                        if (i37 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zR119 | z29;
                        objQ6 = o0VarE.q();
                        if (z34) {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                            o0VarE.K(objQ6);
                        }
                        e23.a aVar1118 = (e23.a) objQ6;
                        int i514 = i34;
                        h4.r rVar13 = rVar2;
                        o4.r1 r1Var12 = r1VarC;
                        f9 f9Var14 = f9Var4;
                        long j2115 = j24;
                        mcVar3 = mcVar;
                        i9.a(aVar1118, j26, f9Var14, bVar, z3.f.c(1010026864, new s8(j2115, aVar1117, mcVar, f9Var14, bVar, b0Var, lVar10, rVar13, f19, z19, r1Var12, j2114, j26, f18, pVar, pVar13, eVar), o0VarE), o0VarE, (i35 & 896) | ((i514 >> 18) & 112) | 24576 | 4096);
                        if (mcVar3.f88996e.e().d(pc.Expanded)) {
                            o0VarE.C(748459762);
                            if (i36 > 256) {
                            }
                            objQ7 = o0VarE.q();
                            if (z15) {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            } else {
                                objQ7 = new t8(mcVar3, null);
                                o0VarE.K(objQ7);
                            }
                            p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(748521266);
                            o0VarE.g0(false);
                        }
                        o0Var = o0VarE;
                        f16 = f19;
                        r1Var2 = r1Var12;
                        j19 = j2114;
                        j17 = j2115;
                        rVar3 = rVar13;
                        j18 = j26;
                        pVar3 = pVar13;
                        f9Var2 = f9Var14;
                        z17 = z19;
                        f17 = f18;
                    } else {
                        o0VarE.e();
                        f16 = f14;
                        z17 = z14;
                        r1Var2 = r1Var;
                        f9Var2 = f9Var;
                        o0Var = o0VarE;
                        rVar3 = rVar2;
                        j17 = j15;
                        f17 = f15;
                        j18 = j16;
                        j19 = jE;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i27 |= 384;
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2110 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111111 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111112 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar1119 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111113 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2110;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2111 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111114 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111115 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar11110 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111116 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2111;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1111117 = p3.n.f135158a;
                    n3.h0 h0Var10 = n3.h0.DefaultSpatial;
                    e23.p pVar14 = pVar4;
                    f0VarB = k9.b(h0Var10, o0VarE);
                    f0VarB2 = k9.b(h0Var10, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j2116 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR1110 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR1110 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar11111 = (e23.a) objQ3;
                    boolean zR1111 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z315 = z26 | zR1111;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z315 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar11 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR1112 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR1112 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar11112 = (e23.a) objQ6;
                    int i515 = i34;
                    h4.r rVar14 = rVar2;
                    o4.r1 r1Var13 = r1VarC;
                    f9 f9Var15 = f9Var4;
                    long j2117 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar11112, j26, f9Var15, bVar, z3.f.c(1010026864, new s8(j2117, aVar11111, mcVar, f9Var15, bVar, b0Var, lVar11, rVar14, f19, z19, r1Var13, j2116, j26, f18, pVar, pVar14, eVar), o0VarE), o0VarE, (i35 & 896) | ((i515 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var13;
                    j19 = j2116;
                    j17 = j2117;
                    rVar3 = rVar14;
                    j18 = j26;
                    pVar3 = pVar14;
                    f9Var2 = f9Var15;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            pVar3 = pVar2;
            i27 = i26 | i49;
            i28 = i16 & 4096;
            if (i28 != 0) {
                if ((i15 & 384) == 0) {
                    if (o0VarE.B(f9Var)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i27 |= i29;
                }
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2112 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111118 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var1111119 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar11113 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11111110 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2112;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2113 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11111111 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11111112 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar11114 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var11111113 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2113;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11111114 = p3.n.f135158a;
                    n3.h0 h0Var11 = n3.h0.DefaultSpatial;
                    e23.p pVar15 = pVar4;
                    f0VarB = k9.b(h0Var11, o0VarE);
                    f0VarB2 = k9.b(h0Var11, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j2118 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR1113 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR1113 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar11115 = (e23.a) objQ3;
                    boolean zR1114 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z316 = z26 | zR1114;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z316 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar12 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR1115 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR1115 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar11116 = (e23.a) objQ6;
                    int i516 = i34;
                    h4.r rVar15 = rVar2;
                    o4.r1 r1Var14 = r1VarC;
                    f9 f9Var16 = f9Var4;
                    long j2119 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar11116, j26, f9Var16, bVar, z3.f.c(1010026864, new s8(j2119, aVar11115, mcVar, f9Var16, bVar, b0Var, lVar12, rVar15, f19, z19, r1Var14, j2118, j26, f18, pVar, pVar15, eVar), o0VarE), o0VarE, (i35 & 896) | ((i516 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var14;
                    j19 = j2118;
                    j17 = j2119;
                    rVar3 = rVar15;
                    j18 = j26;
                    pVar3 = pVar15;
                    f9Var2 = f9Var16;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i27 |= 384;
            z15 = true;
            if ((i25 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f2114 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111115 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111116 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar11117 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111117 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f2114;
                    j26 = jB;
                } else {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f2115 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111118 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111119 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar11118 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var111111110 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f2115;
                    j26 = jB;
                }
                o0VarE.h0();
                p3.x1 x1Var111111111 = p3.n.f135158a;
                n3.h0 h0Var12 = n3.h0.DefaultSpatial;
                e23.p pVar16 = pVar4;
                f0VarB = k9.b(h0Var12, o0VarE);
                f0VarB2 = k9.b(h0Var12, o0VarE);
                f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                long j21110 = j25;
                i36 = (i34 & 896) ^ 384;
                zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (zR) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    } else {
                        mcVar2 = mcVar;
                    }
                } else {
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                    mcVar2 = mcVar;
                    o0VarE.K(objQ);
                }
                p3.l0.i((e23.a) objQ, o0VarE);
                objQ2 = o0VarE.q();
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (o53.b0) objQ2;
                boolean zR1116 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                i37 = i34 & 14;
                if (i37 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zR1116 | z24;
                objQ3 = o0VarE.q();
                if (z25) {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                }
                e23.a aVar11119 = (e23.a) objQ3;
                boolean zR1117 = o0VarE.r(b0Var);
                if (i36 > 256) {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean z317 = z26 | zR1117;
                if (i37 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z317 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                }
                e23.l lVar13 = (e23.l) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = s1.d.a(0.0f, 0.01f);
                    o0VarE.K(objQ5);
                }
                bVar = (s1.b) objQ5;
                boolean zR1118 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                if (i37 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = zR1118 | z29;
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                }
                e23.a aVar111110 = (e23.a) objQ6;
                int i517 = i34;
                h4.r rVar16 = rVar2;
                o4.r1 r1Var15 = r1VarC;
                f9 f9Var17 = f9Var4;
                long j21111 = j24;
                mcVar3 = mcVar;
                i9.a(aVar111110, j26, f9Var17, bVar, z3.f.c(1010026864, new s8(j21111, aVar11119, mcVar, f9Var17, bVar, b0Var, lVar13, rVar16, f19, z19, r1Var15, j21110, j26, f18, pVar, pVar16, eVar), o0VarE), o0VarE, (i35 & 896) | ((i517 >> 18) & 112) | 24576 | 4096);
                if (mcVar3.f88996e.e().d(pc.Expanded)) {
                    o0VarE.C(748459762);
                    if (i36 > 256) {
                    }
                    objQ7 = o0VarE.q();
                    if (z15) {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    } else {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    }
                    p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(748521266);
                    o0VarE.g0(false);
                }
                o0Var = o0VarE;
                f16 = f19;
                r1Var2 = r1Var15;
                j19 = j21110;
                j17 = j21111;
                rVar3 = rVar16;
                j18 = j26;
                pVar3 = pVar16;
                f9Var2 = f9Var17;
                z17 = z19;
                f17 = f18;
            } else {
                o0VarE.e();
                f16 = f14;
                z17 = z14;
                r1Var2 = r1Var;
                f9Var2 = f9Var;
                o0Var = o0VarE;
                rVar3 = rVar2;
                j17 = j15;
                f17 = f15;
                j18 = j16;
                j19 = jE;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 = i17 | 27648;
        if ((i14 & 196608) != 0) {
            if ((i16 & 32) == 0) {
                i46 = 65536;
            } else {
                i46 = 65536;
            }
            i18 |= i46;
        }
        if ((i14 & 1572864) == 0) {
            jE = j8;
            if ((i16 & 64) == 0) {
                i45 = 524288;
            } else {
                i45 = 524288;
            }
            i18 |= i45;
        } else {
            jE = j8;
        }
        if ((i14 & 12582912) == 0) {
            j16 = j14;
            if ((i16 & 128) == 0) {
                i44 = 4194304;
            } else {
                i44 = 4194304;
            }
            i18 |= i44;
        } else {
            j16 = j14;
        }
        i25 = i18 | 100663296;
        if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
            if ((i16 & 512) == 0) {
                i39 = 268435456;
            } else {
                i39 = 268435456;
            }
            i25 |= i39;
        }
        if ((i15 & 6) == 0) {
            if (o0VarE.r(pVar)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i26 = i15 | i38;
        } else {
            i26 = i15;
        }
        if ((i16 & 2048) == 0) {
            pVar3 = pVar2;
            if (o0VarE.r(pVar3)) {
            }
            i27 = i26 | i49;
            i28 = i16 & 4096;
            if (i28 != 0) {
                if ((i15 & 384) == 0) {
                    if (o0VarE.B(f9Var)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i27 |= i29;
                }
                z15 = true;
                if ((i25 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2116 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111112 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111113 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar111111 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111114 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2116;
                        j26 = jB;
                    } else {
                        if (i48 != 0) {
                            rVar2 = h4.r.S;
                        }
                        f0Var = f0.f88041a;
                        f0Var.getClass();
                        float f2117 = f0.f88043c;
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i16 & 32) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111115 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                            i25 &= -458753;
                        } else {
                            r1VarC = r1Var;
                        }
                        if ((i16 & 64) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111116 = p3.n.f135158a;
                            n3.w0.f123292a.getClass();
                            jE = k2.e(n3.w0.f123293b, o0VarE);
                            i25 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jB = k2.b(jE, o0VarE);
                            i25 &= -29360129;
                        } else {
                            jB = j16;
                        }
                        i30 = i27;
                        f18 = 0;
                        g6.f.a aVar111112 = g6.f.f75994b;
                        if ((i16 & 512) != 0) {
                            f0Var.getClass();
                            p3.x1 x1Var111111117 = p3.n.f135158a;
                            n3.t0.f123259a.getClass();
                            jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                            i25 &= -1879048193;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 2048) != 0) {
                            pVar3 = o8.f89157a;
                            i30 &= -113;
                        }
                        if (i28 != 0) {
                            f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                        } else {
                            f9Var3 = f9Var;
                        }
                        i34 = i25;
                        pVar4 = pVar3;
                        i35 = i30;
                        j24 = jC;
                        j25 = jE;
                        z19 = z18;
                        f19 = f2117;
                        j26 = jB;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111111118 = p3.n.f135158a;
                    n3.h0 h0Var13 = n3.h0.DefaultSpatial;
                    e23.p pVar17 = pVar4;
                    f0VarB = k9.b(h0Var13, o0VarE);
                    f0VarB2 = k9.b(h0Var13, o0VarE);
                    f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                    long j21112 = j25;
                    i36 = (i34 & 896) ^ 384;
                    zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                    objQ = o0VarE.q();
                    aVar2 = p3.m.f135153a;
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                            mcVar2 = mcVar;
                            o0VarE.K(objQ);
                        } else {
                            mcVar2 = mcVar;
                        }
                    } else {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    }
                    p3.l0.i((e23.a) objQ, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (o53.b0) objQ2;
                    boolean zR1119 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                    i37 = i34 & 14;
                    if (i37 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR1119 | z24;
                    objQ3 = o0VarE.q();
                    if (z25) {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new eu.b(mcVar2, b0Var, aVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar111113 = (e23.a) objQ3;
                    boolean zR11110 = o0VarE.r(b0Var);
                    if (i36 > 256) {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        f9Var4 = f9Var3;
                        if ((i34 & 384) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean z318 = z26 | zR11110;
                    if (i37 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z318 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar14 = (e23.l) objQ4;
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = s1.d.a(0.0f, 0.01f);
                        o0VarE.K(objQ5);
                    }
                    bVar = (s1.b) objQ5;
                    boolean zR11111 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                    if (i37 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zR11111 | z29;
                    objQ6 = o0VarE.q();
                    if (z34) {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                        o0VarE.K(objQ6);
                    }
                    e23.a aVar111114 = (e23.a) objQ6;
                    int i518 = i34;
                    h4.r rVar17 = rVar2;
                    o4.r1 r1Var16 = r1VarC;
                    f9 f9Var18 = f9Var4;
                    long j21113 = j24;
                    mcVar3 = mcVar;
                    i9.a(aVar111114, j26, f9Var18, bVar, z3.f.c(1010026864, new s8(j21113, aVar111113, mcVar, f9Var18, bVar, b0Var, lVar14, rVar17, f19, z19, r1Var16, j21112, j26, f18, pVar, pVar17, eVar), o0VarE), o0VarE, (i35 & 896) | ((i518 >> 18) & 112) | 24576 | 4096);
                    if (mcVar3.f88996e.e().d(pc.Expanded)) {
                        o0VarE.C(748459762);
                        if (i36 > 256) {
                        }
                        objQ7 = o0VarE.q();
                        if (z15) {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        } else {
                            objQ7 = new t8(mcVar3, null);
                            o0VarE.K(objQ7);
                        }
                        p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(748521266);
                        o0VarE.g0(false);
                    }
                    o0Var = o0VarE;
                    f16 = f19;
                    r1Var2 = r1Var16;
                    j19 = j21112;
                    j17 = j21113;
                    rVar3 = rVar17;
                    j18 = j26;
                    pVar3 = pVar17;
                    f9Var2 = f9Var18;
                    z17 = z19;
                    f17 = f18;
                } else {
                    o0VarE.e();
                    f16 = f14;
                    z17 = z14;
                    r1Var2 = r1Var;
                    f9Var2 = f9Var;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    j17 = j15;
                    f17 = f15;
                    j18 = j16;
                    j19 = jE;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i27 |= 384;
            z15 = true;
            if ((i25 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f2118 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var111111119 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111110 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar111115 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111111 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f2118;
                    j26 = jB;
                } else {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f2119 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111112 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111113 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar111116 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111114 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f2119;
                    j26 = jB;
                }
                o0VarE.h0();
                p3.x1 x1Var1111111115 = p3.n.f135158a;
                n3.h0 h0Var14 = n3.h0.DefaultSpatial;
                e23.p pVar18 = pVar4;
                f0VarB = k9.b(h0Var14, o0VarE);
                f0VarB2 = k9.b(h0Var14, o0VarE);
                f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                long j21114 = j25;
                i36 = (i34 & 896) ^ 384;
                zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (zR) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    } else {
                        mcVar2 = mcVar;
                    }
                } else {
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                    mcVar2 = mcVar;
                    o0VarE.K(objQ);
                }
                p3.l0.i((e23.a) objQ, o0VarE);
                objQ2 = o0VarE.q();
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (o53.b0) objQ2;
                boolean zR11112 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                i37 = i34 & 14;
                if (i37 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zR11112 | z24;
                objQ3 = o0VarE.q();
                if (z25) {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                }
                e23.a aVar111117 = (e23.a) objQ3;
                boolean zR11113 = o0VarE.r(b0Var);
                if (i36 > 256) {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean z319 = z26 | zR11113;
                if (i37 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z319 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                }
                e23.l lVar15 = (e23.l) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = s1.d.a(0.0f, 0.01f);
                    o0VarE.K(objQ5);
                }
                bVar = (s1.b) objQ5;
                boolean zR11114 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                if (i37 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = zR11114 | z29;
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                }
                e23.a aVar111118 = (e23.a) objQ6;
                int i519 = i34;
                h4.r rVar18 = rVar2;
                o4.r1 r1Var17 = r1VarC;
                f9 f9Var19 = f9Var4;
                long j21115 = j24;
                mcVar3 = mcVar;
                i9.a(aVar111118, j26, f9Var19, bVar, z3.f.c(1010026864, new s8(j21115, aVar111117, mcVar, f9Var19, bVar, b0Var, lVar15, rVar18, f19, z19, r1Var17, j21114, j26, f18, pVar, pVar18, eVar), o0VarE), o0VarE, (i35 & 896) | ((i519 >> 18) & 112) | 24576 | 4096);
                if (mcVar3.f88996e.e().d(pc.Expanded)) {
                    o0VarE.C(748459762);
                    if (i36 > 256) {
                    }
                    objQ7 = o0VarE.q();
                    if (z15) {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    } else {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    }
                    p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(748521266);
                    o0VarE.g0(false);
                }
                o0Var = o0VarE;
                f16 = f19;
                r1Var2 = r1Var17;
                j19 = j21114;
                j17 = j21115;
                rVar3 = rVar18;
                j18 = j26;
                pVar3 = pVar18;
                f9Var2 = f9Var19;
                z17 = z19;
                f17 = f18;
            } else {
                o0VarE.e();
                f16 = f14;
                z17 = z14;
                r1Var2 = r1Var;
                f9Var2 = f9Var;
                o0Var = o0VarE;
                rVar3 = rVar2;
                j17 = j15;
                f17 = f15;
                j18 = j16;
                j19 = jE;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        pVar3 = pVar2;
        i27 = i26 | i49;
        i28 = i16 & 4096;
        if (i28 != 0) {
            if ((i15 & 384) == 0) {
                if (o0VarE.B(f9Var)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i27 |= i29;
            }
            z15 = true;
            if ((i25 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f21110 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111116 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111117 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar111119 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111118 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f21110;
                    j26 = jB;
                } else {
                    if (i48 != 0) {
                        rVar2 = h4.r.S;
                    }
                    f0Var = f0.f88041a;
                    f0Var.getClass();
                    float f21111 = f0.f88043c;
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i16 & 32) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var1111111119 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                        i25 &= -458753;
                    } else {
                        r1VarC = r1Var;
                    }
                    if ((i16 & 64) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111111110 = p3.n.f135158a;
                        n3.w0.f123292a.getClass();
                        jE = k2.e(n3.w0.f123293b, o0VarE);
                        i25 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jB = k2.b(jE, o0VarE);
                        i25 &= -29360129;
                    } else {
                        jB = j16;
                    }
                    i30 = i27;
                    f18 = 0;
                    g6.f.a aVar1111110 = g6.f.f75994b;
                    if ((i16 & 512) != 0) {
                        f0Var.getClass();
                        p3.x1 x1Var11111111111 = p3.n.f135158a;
                        n3.t0.f123259a.getClass();
                        jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                        i25 &= -1879048193;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 2048) != 0) {
                        pVar3 = o8.f89157a;
                        i30 &= -113;
                    }
                    if (i28 != 0) {
                        f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                    } else {
                        f9Var3 = f9Var;
                    }
                    i34 = i25;
                    pVar4 = pVar3;
                    i35 = i30;
                    j24 = jC;
                    j25 = jE;
                    z19 = z18;
                    f19 = f21111;
                    j26 = jB;
                }
                o0VarE.h0();
                p3.x1 x1Var11111111112 = p3.n.f135158a;
                n3.h0 h0Var15 = n3.h0.DefaultSpatial;
                e23.p pVar19 = pVar4;
                f0VarB = k9.b(h0Var15, o0VarE);
                f0VarB2 = k9.b(h0Var15, o0VarE);
                f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
                long j21116 = j25;
                i36 = (i34 & 896) ^ 384;
                zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (zR) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                        mcVar2 = mcVar;
                        o0VarE.K(objQ);
                    } else {
                        mcVar2 = mcVar;
                    }
                } else {
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                    mcVar2 = mcVar;
                    o0VarE.K(objQ);
                }
                p3.l0.i((e23.a) objQ, o0VarE);
                objQ2 = o0VarE.q();
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (o53.b0) objQ2;
                boolean zR11115 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
                i37 = i34 & 14;
                if (i37 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zR11115 | z24;
                objQ3 = o0VarE.q();
                if (z25) {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new eu.b(mcVar2, b0Var, aVar);
                    o0VarE.K(objQ3);
                }
                e23.a aVar1111111 = (e23.a) objQ3;
                boolean zR11116 = o0VarE.r(b0Var);
                if (i36 > 256) {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    f9Var4 = f9Var3;
                    if ((i34 & 384) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean z3110 = z26 | zR11116;
                if (i37 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z3110 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                    o0VarE.K(objQ4);
                }
                e23.l lVar16 = (e23.l) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = s1.d.a(0.0f, 0.01f);
                    o0VarE.K(objQ5);
                }
                bVar = (s1.b) objQ5;
                boolean zR11117 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
                if (i37 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = zR11117 | z29;
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                    o0VarE.K(objQ6);
                }
                e23.a aVar1111112 = (e23.a) objQ6;
                int i5110 = i34;
                h4.r rVar19 = rVar2;
                o4.r1 r1Var18 = r1VarC;
                f9 f9Var110 = f9Var4;
                long j21117 = j24;
                mcVar3 = mcVar;
                i9.a(aVar1111112, j26, f9Var110, bVar, z3.f.c(1010026864, new s8(j21117, aVar1111111, mcVar, f9Var110, bVar, b0Var, lVar16, rVar19, f19, z19, r1Var18, j21116, j26, f18, pVar, pVar19, eVar), o0VarE), o0VarE, (i35 & 896) | ((i5110 >> 18) & 112) | 24576 | 4096);
                if (mcVar3.f88996e.e().d(pc.Expanded)) {
                    o0VarE.C(748459762);
                    if (i36 > 256) {
                    }
                    objQ7 = o0VarE.q();
                    if (z15) {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    } else {
                        objQ7 = new t8(mcVar3, null);
                        o0VarE.K(objQ7);
                    }
                    p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(748521266);
                    o0VarE.g0(false);
                }
                o0Var = o0VarE;
                f16 = f19;
                r1Var2 = r1Var18;
                j19 = j21116;
                j17 = j21117;
                rVar3 = rVar19;
                j18 = j26;
                pVar3 = pVar19;
                f9Var2 = f9Var110;
                z17 = z19;
                f17 = f18;
            } else {
                o0VarE.e();
                f16 = f14;
                z17 = z14;
                r1Var2 = r1Var;
                f9Var2 = f9Var;
                o0Var = o0VarE;
                rVar3 = rVar2;
                j17 = j15;
                f17 = f15;
                j18 = j16;
                j19 = jE;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i27 |= 384;
        z15 = true;
        if ((i25 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i48 != 0) {
                    rVar2 = h4.r.S;
                }
                f0Var = f0.f88041a;
                f0Var.getClass();
                float f21112 = f0.f88043c;
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if ((i16 & 32) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111113 = p3.n.f135158a;
                    n3.w0.f123292a.getClass();
                    r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                    i25 &= -458753;
                } else {
                    r1VarC = r1Var;
                }
                if ((i16 & 64) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111114 = p3.n.f135158a;
                    n3.w0.f123292a.getClass();
                    jE = k2.e(n3.w0.f123293b, o0VarE);
                    i25 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    jB = k2.b(jE, o0VarE);
                    i25 &= -29360129;
                } else {
                    jB = j16;
                }
                i30 = i27;
                f18 = 0;
                g6.f.a aVar1111113 = g6.f.f75994b;
                if ((i16 & 512) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111115 = p3.n.f135158a;
                    n3.t0.f123259a.getClass();
                    jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                    i25 &= -1879048193;
                } else {
                    jC = j15;
                }
                if ((i16 & 2048) != 0) {
                    pVar3 = o8.f89157a;
                    i30 &= -113;
                }
                if (i28 != 0) {
                    f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                } else {
                    f9Var3 = f9Var;
                }
                i34 = i25;
                pVar4 = pVar3;
                i35 = i30;
                j24 = jC;
                j25 = jE;
                z19 = z18;
                f19 = f21112;
                j26 = jB;
            } else {
                if (i48 != 0) {
                    rVar2 = h4.r.S;
                }
                f0Var = f0.f88041a;
                f0Var.getClass();
                float f21113 = f0.f88043c;
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if ((i16 & 32) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111116 = p3.n.f135158a;
                    n3.w0.f123292a.getClass();
                    r1VarC = fc.c(n3.w0.f123294c, o0VarE);
                    i25 &= -458753;
                } else {
                    r1VarC = r1Var;
                }
                if ((i16 & 64) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111117 = p3.n.f135158a;
                    n3.w0.f123292a.getClass();
                    jE = k2.e(n3.w0.f123293b, o0VarE);
                    i25 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    jB = k2.b(jE, o0VarE);
                    i25 &= -29360129;
                } else {
                    jB = j16;
                }
                i30 = i27;
                f18 = 0;
                g6.f.a aVar1111114 = g6.f.f75994b;
                if ((i16 & 512) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var11111111118 = p3.n.f135158a;
                    n3.t0.f123259a.getClass();
                    jC = o4.d0.c(0.32f, k2.e(n3.t0.f123260b, o0VarE), 14);
                    i25 &= -1879048193;
                } else {
                    jC = j15;
                }
                if ((i16 & 2048) != 0) {
                    pVar3 = o8.f89157a;
                    i30 &= -113;
                }
                if (i28 != 0) {
                    f9Var3 = new f9(false, false, 3, (p005kotlin.jvm.internal.j) null);
                } else {
                    f9Var3 = f9Var;
                }
                i34 = i25;
                pVar4 = pVar3;
                i35 = i30;
                j24 = jC;
                j25 = jE;
                z19 = z18;
                f19 = f21113;
                j26 = jB;
            }
            o0VarE.h0();
            p3.x1 x1Var11111111119 = p3.n.f135158a;
            n3.h0 h0Var16 = n3.h0.DefaultSpatial;
            e23.p pVar110 = pVar4;
            f0VarB = k9.b(h0Var16, o0VarE);
            f0VarB2 = k9.b(h0Var16, o0VarE);
            f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
            long j21118 = j25;
            i36 = (i34 & 896) ^ 384;
            zR = ((i36 <= 256 && o0VarE.B(mcVar3)) || (i34 & 384) == 256) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
            objQ = o0VarE.q();
            aVar2 = p3.m.f135153a;
            if (zR) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                    mcVar2 = mcVar;
                    o0VarE.K(objQ);
                } else {
                    mcVar2 = mcVar;
                }
            } else {
                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 1);
                mcVar2 = mcVar;
                o0VarE.K(objQ);
            }
            p3.l0.i((e23.a) objQ, o0VarE);
            objQ2 = o0VarE.q();
            aVar2.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0Var = (o53.b0) objQ2;
            boolean zR11118 = o0VarE.r(b0Var) | ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256);
            i37 = i34 & 14;
            if (i37 == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zR11118 | z24;
            objQ3 = o0VarE.q();
            if (z25) {
                objQ3 = new eu.b(mcVar2, b0Var, aVar);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new eu.b(mcVar2, b0Var, aVar);
                o0VarE.K(objQ3);
            }
            e23.a aVar1111115 = (e23.a) objQ3;
            boolean zR11119 = o0VarE.r(b0Var);
            if (i36 > 256) {
                f9Var4 = f9Var3;
                if ((i34 & 384) != 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            } else {
                f9Var4 = f9Var3;
                if ((i34 & 384) != 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            }
            boolean z3111 = z26 | zR11119;
            if (i37 == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = z3111 | z27;
            objQ4 = o0VarE.q();
            if (z28) {
                objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new k8(b0Var, mcVar2, aVar, 0);
                o0VarE.K(objQ4);
            }
            e23.l lVar17 = (e23.l) objQ4;
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = s1.d.a(0.0f, 0.01f);
                o0VarE.K(objQ5);
            }
            bVar = (s1.b) objQ5;
            boolean zR111110 = ((i36 <= 256 && o0VarE.B(mcVar2)) || (i34 & 384) == 256) | o0VarE.r(b0Var) | o0VarE.r(bVar);
            if (i37 == 4) {
                z29 = true;
            } else {
                z29 = false;
            }
            z34 = zR111110 | z29;
            objQ6 = o0VarE.q();
            if (z34) {
                objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new ho.d0((Object) mcVar2, (Object) b0Var, (Object) bVar, aVar, 4);
                o0VarE.K(objQ6);
            }
            e23.a aVar1111116 = (e23.a) objQ6;
            int i5111 = i34;
            h4.r rVar110 = rVar2;
            o4.r1 r1Var19 = r1VarC;
            f9 f9Var111 = f9Var4;
            long j21119 = j24;
            mcVar3 = mcVar;
            i9.a(aVar1111116, j26, f9Var111, bVar, z3.f.c(1010026864, new s8(j21119, aVar1111115, mcVar, f9Var111, bVar, b0Var, lVar17, rVar110, f19, z19, r1Var19, j21118, j26, f18, pVar, pVar110, eVar), o0VarE), o0VarE, (i35 & 896) | ((i5111 >> 18) & 112) | 24576 | 4096);
            if (mcVar3.f88996e.e().d(pc.Expanded)) {
                o0VarE.C(748459762);
                if (i36 > 256) {
                }
                objQ7 = o0VarE.q();
                if (z15) {
                    objQ7 = new t8(mcVar3, null);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new t8(mcVar3, null);
                    o0VarE.K(objQ7);
                }
                p3.l0.e((e23.p) objQ7, mcVar3, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(748521266);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            f16 = f19;
            r1Var2 = r1Var19;
            j19 = j21118;
            j17 = j21119;
            rVar3 = rVar110;
            j18 = j26;
            pVar3 = pVar110;
            f9Var2 = f9Var111;
            z17 = z19;
            f17 = f18;
        } else {
            o0VarE.e();
            f16 = f14;
            z17 = z14;
            r1Var2 = r1Var;
            f9Var2 = f9Var;
            o0Var = o0VarE;
            rVar3 = rVar2;
            j17 = j15;
            f17 = f15;
            j18 = j16;
            j19 = jE;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.l8
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    e9.a(aVar, rVar3, mcVar3, f16, z17, r1Var2, j19, j18, f17, j17, pVar, pVar3, f9Var2, eVar, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:145:0x0276  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    public static final void b(final c2.t tVar, final s1.b bVar, final o53.b0 b0Var, final e23.a aVar, final e23.l lVar, final h4.r rVar, final mc mcVar, final float f14, final boolean z14, final o4.r1 r1Var, final long j8, final long j14, final float f15, final e23.p pVar, final e23.p pVar2, final e23.q qVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        h4.r rVarA;
        p3.o0 o0VarE = mVar.E(-37400432);
        int i15 = i14 | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(b0Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.B(rVar) ? 131072 : 65536) | (o0VarE.B(mcVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.i(f14) ? 8388608 : 4194304) | (o0VarE.h(z14) ? 67108864 : 33554432) | (o0VarE.B(r1Var) ? 536870912 : 268435456);
        int i16 = (o0VarE.l(j8) ? 4 : 2) | (o0VarE.l(j14) ? 32 : 16) | (o0VarE.i(f15) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(pVar2) ? 16384 : 8192) | (o0VarE.r(qVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 74899) == 74898) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.m3c_bottom_sheet_pane_title);
            h4.d.f81522a.getClass();
            h4.r rVarF = c2.x2.f(c2.x2.w(tVar.c(rVar, h4.d.a.f81525c), 0.0f, f14, 1), 1.0f);
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                o0VarE.C(-1582035383);
                h4.r.a aVar3 = h4.r.S;
                boolean z15 = (((i15 & 3670016) ^ 1572864) > 1048576 && o0VarE.B(mcVar)) || (i15 & 1572864) == 1048576;
                Object objQ = o0VarE.q();
                if (z15) {
                    p008y1.b2 b2Var = p008y1.b2.Vertical;
                    float f16 = kc.f88702a;
                    objQ = new hc(mcVar, lVar, b2Var);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        p008y1.b2 b2Var2 = p008y1.b2.Vertical;
                        float f17 = kc.f88702a;
                        objQ = new hc(mcVar, lVar, b2Var2);
                        o0VarE.K(objQ);
                    }
                }
                rVarA = a5.f.a(aVar3, (a5.a) objQ, null);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1582020872);
                o0VarE.g0(false);
                rVarA = h4.r.S;
            }
            h4.r rVarThen = rVarF.then(rVarA);
            l3.m<pc> mVar2 = mcVar.f88996e;
            l3.m<pc> mVar3 = mcVar.f88996e;
            p008y1.b2 b2Var3 = p008y1.b2.Vertical;
            int i18 = (i15 & 3670016) ^ 1572864;
            boolean z16 = (i18 > 1048576 && o0VarE.B(mcVar)) || (i15 & 1572864) == 1048576;
            Object objQ2 = o0VarE.q();
            int i19 = 24;
            if (z16) {
                objQ2 = new fp0.l(mcVar, i19);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fp0.l(mcVar, i19);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarE = l3.k.e(rVarThen, mVar2, b2Var3, (e23.p) objQ2);
            l3.m.e eVar = mVar3.f109324f;
            boolean z17 = z14 && mcVar.e();
            boolean zF = mVar3.f();
            boolean z18 = (i15 & 57344) == 16384;
            Object objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new w8(lVar, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new w8(lVar, null);
                    o0VarE.K(objQ3);
                }
            }
            h4.r rVarA2 = p008y1.a1.a(rVarE, eVar, b2Var3, z17, null, zF, null, (e23.q) objQ3, false, 168);
            boolean zB = o0VarE.B(strH);
            Object objQ4 = o0VarE.q();
            if (zB) {
                objQ4 = new i11.g(strH, 9);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new i11.g(strH, 9);
                    o0VarE.K(objQ4);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ4, rVarA2, false);
            int floatValue = (int) mVar3.f109328j.getFloatValue();
            if (floatValue < 0) {
                floatValue = 0;
            }
            h4.r rVarK = c2.l.k(rVarC, c2.n3.a(floatValue, 13));
            boolean z19 = ((i18 > 1048576 && o0VarE.B(mcVar)) || (i15 & 1572864) == 1048576) | ((i15 & 112) == 32 || o0VarE.r(bVar));
            Object objQ5 = o0VarE.q();
            if (z19) {
                objQ5 = new hy.h(4, mcVar, bVar);
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new hy.h(4, mcVar, bVar);
                    o0VarE.K(objQ5);
                }
            }
            int i24 = i16 << 6;
            o0Var = o0VarE;
            ve.a(o4.s0.a(o4.s0.a(rVarK, (e23.l) objQ5), new j0(mcVar, 1)), r1Var, j8, j14, f15, 0.0f, null, z3.f.c(728743275, new d9(pVar2, bVar, mcVar, pVar, qVar, aVar, b0Var, z14), o0VarE), o0Var, ((i15 >> 24) & 112) | 12582912 | (i24 & 896) | (i24 & 7168) | (i24 & 57344), 96);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(bVar, b0Var, aVar, lVar, rVar, mcVar, f14, z14, r1Var, j8, j14, f15, pVar, pVar2, qVar, i14) { // from class: i3.j8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s1.b f88533b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o53.b0 f88534c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a f88535d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f88536e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ h4.r f88537f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ mc f88538g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f88539h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f88540i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f88541j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f88542k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f88543l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ float f88544m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e23.p f88545n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.p f88546o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ e23.q f88547p;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(71);
                    e9.b(this.f88532a, this.f88533b, this.f88534c, this.f88535d, this.f88536e, this.f88537f, this.f88538g, this.f88539h, this.f88540i, this.f88541j, this.f88542k, this.f88543l, this.f88544m, this.f88545n, this.f88546o, this.f88547p, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    public static final void c(int i14, long j8, e23.a aVar, p3.m mVar, boolean z14, boolean z15) {
        h4.r rVarC;
        p3.o0 o0VarE = mVar.E(-391613911);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (j8 != 16) {
                o0VarE.C(-1438582326);
                p3.x3 x3VarB = s1.f.b(z14 ? 1.0f : 0.0f, k9.b(n3.h0.DefaultEffects, o0VarE), null, o0VarE, 0, 28);
                int i16 = l3.n1.f109367b;
                String strH = l3.k.h(o0VarE, R.string.close_sheet);
                p3.m.a aVar2 = p3.m.f135153a;
                if (z15) {
                    o0VarE.C(-1438283579);
                    h4.r.a aVar3 = h4.r.S;
                    int i17 = i15 & 112;
                    boolean z16 = i17 == 32;
                    Object objQ = o0VarE.q();
                    if (z16) {
                        objQ = new a(aVar);
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(aVar);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarB = b5.s0.b(aVar3, aVar, (PointerInputEventHandler) objQ);
                    boolean zB = (i17 == 32) | o0VarE.B(strH);
                    Object objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new n8(strH, aVar, 0);
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new n8(strH, aVar, 0);
                            o0VarE.K(objQ2);
                        }
                    }
                    rVarC = p5.v.c((e23.l) objQ2, rVarB, true);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1437857391);
                    o0VarE.g0(false);
                    rVarC = h4.r.S;
                }
                h4.r rVarThen = c2.x2.d(h4.r.S, 1.0f).then(rVarC);
                boolean zB2 = ((i15 & 14) == 4) | o0VarE.B(x3VarB);
                Object objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new a03.g0(j8, x3VarB, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a03.g0(j8, x3VarB, 1);
                        o0VarE.K(objQ3);
                    }
                }
                u1.n.b(rVarThen, (e23.l) objQ3, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1437676103);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i8(j8, aVar, z14, z15, i14);
        }
    }

    public static final float d(o4.t0 t0Var, float f14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (t0Var.getF128919r() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (gl.b.J(0.0f, Math.min(t0Var.s0(f87964a), fIntBitsToFloat), f14) / fIntBitsToFloat);
    }

    public static final float e(o4.t0 t0Var, float f14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (t0Var.getF128919r() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (gl.b.J(0.0f, Math.min(t0Var.s0(f87965b), fIntBitsToFloat), f14) / fIntBitsToFloat);
    }

    public static final mc f(boolean z14, e23.l<? super pc, Boolean> lVar, p3.m mVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            z14 = false;
        }
        boolean z15 = z14;
        if ((i15 & 2) != 0) {
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i11.f(19);
                mVar.K(objQ);
            }
            lVar = (e23.l) objQ;
        }
        p3.x1 x1Var = p3.n.f135158a;
        return kc.b(z15, lVar, pc.Hidden, false, mVar, (i14 & 14) | 384 | (i14 & 112), 56);
    }
}
