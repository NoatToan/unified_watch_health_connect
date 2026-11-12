package l02;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.g0;
import e2.i0;
import e23.p;
import h2.j0;
import kotlin.t1;
import o13.r;
import o4.d0;
import o4.r1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m2;
import p3.m1;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.x3;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.pager.GCInfiniteHorizontalPagerIndicatorKt$GCInfiniteHorizontalPagerIndicator$2$1$1", f = "GCInfiniteHorizontalPagerIndicator.kt", l = {190, 192}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f108001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f108002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f108003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i0 f108004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s1.k<Float> f108005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n1 f108006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1 f108007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m1 f108008i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, int i15, float f14, i0 i0Var, s1.k<Float> kVar, n1 n1Var, n1 n1Var2, m1 m1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f108001b = i14;
            this.f108002c = i15;
            this.f108003d = f14;
            this.f108004e = i0Var;
            this.f108005f = kVar;
            this.f108006g = n1Var;
            this.f108007h = n1Var2;
            this.f108008i = m1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f108001b, this.f108002c, this.f108003d, this.f108004e, this.f108005f, this.f108006g, this.f108007h, this.f108008i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        
            if (r8 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
        
            if (r8 == r0) goto L34;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int intValue;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108000a;
            if (i14 == 0) {
                r.b(obj);
                n1 n1Var = this.f108006g;
                int intValue2 = n1Var.getIntValue();
                int i15 = this.f108001b;
                n1 n1Var2 = this.f108007h;
                if (i15 >= intValue2) {
                    int intValue3 = n1Var.getIntValue();
                    int i16 = this.f108002c - 1;
                    if (intValue3 != i16) {
                        intValue = (i15 - n1Var.getIntValue()) + 1;
                        int intValue4 = i16 - n1Var.getIntValue();
                        if (intValue > intValue4) {
                            intValue = intValue4;
                        }
                    } else if (i15 <= n1Var2.getIntValue() || n1Var2.getIntValue() == 0) {
                        intValue = 0;
                    } else {
                        int i17 = -((n1Var2.getIntValue() - i15) + 1);
                        intValue = -n1Var2.getIntValue();
                        if (i17 >= intValue) {
                            intValue = i17;
                        }
                    }
                } else if (i15 <= n1Var2.getIntValue()) {
                    intValue = 0;
                } else {
                    intValue = 0;
                }
                n1Var2.t(n1Var2.getIntValue() + intValue);
                n1Var.t(n1Var.getIntValue() + intValue);
                m1 m1Var = this.f108008i;
                float floatValue = m1Var.getFloatValue();
                float f14 = this.f108003d;
                m1Var.i((intValue * f14) + floatValue);
                i0 i0Var = this.f108004e;
                float fH = (i0Var.h() * f14) + i0Var.i();
                if (Math.abs(intValue) > 1) {
                    float floatValue2 = m1Var.getFloatValue() - fH;
                    this.f108000a = 1;
                    obj = m2.b(i0Var, floatValue2, this);
                } else {
                    float floatValue3 = m1Var.getFloatValue() - fH;
                    this.f108000a = 2;
                    obj = m2.a(i0Var, floatValue3, this.f108005f, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                ((Number) obj).floatValue();
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                ((Number) obj).floatValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x0155  */
    /* JADX WARN: Code duplicated, block: B:122:0x015c  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x019f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x01db  */
    /* JADX WARN: Code duplicated, block: B:162:0x0234  */
    /* JADX WARN: Code duplicated, block: B:165:0x0249  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b A[ADDED_TO_REGION] */
    public static final void a(final h4.r rVar, final int i14, final int i15, int i16, final long j8, final long j14, float f14, float f15, float f16, float f17, r1 r1Var, s1.k<Float> kVar, final p<? super Integer, ? super Integer, String> pVar, p3.m mVar, final int i17, final int i18, final int i19) {
        int i24;
        int i25;
        int i26;
        float f18;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z14;
        final float f19;
        final float f22;
        final float f24;
        final r1 r1Var2;
        final s1.k<Float> kVar2;
        final float f25;
        final int i39;
        p2 p2VarI0;
        float f26;
        float f27;
        float f28;
        float f29;
        r1 r1Var3;
        s1.k<Float> kVarC;
        float f34;
        float f35;
        s1.k<Float> kVar3;
        float f36;
        float f37;
        r1 r1Var4;
        int i44;
        int i45;
        int i46;
        o0 o0VarE = mVar.E(1285807922);
        if ((i17 & 6) == 0) {
            i24 = (o0VarE.B(rVar) ? 4 : 2) | i17;
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i24 |= o0VarE.k(i15) ? 256 : 128;
        }
        int i47 = i19 & 8;
        if (i47 == 0) {
            if ((i17 & 3072) == 0) {
                i25 = i16;
                i24 |= o0VarE.k(i25) ? 2048 : 1024;
            }
            if ((i17 & 24576) == 0) {
                if (o0VarE.l(j8)) {
                    i46 = 16384;
                } else {
                    i46 = 8192;
                }
                i24 |= i46;
            }
            if ((i17 & 196608) == 0) {
                if (o0VarE.l(j14)) {
                    i45 = 131072;
                } else {
                    i45 = 65536;
                }
                i24 |= i45;
            }
            i26 = i19 & 64;
            if (i26 != 0) {
                i24 |= 1572864;
                f18 = f14;
            } else {
                f18 = f14;
                if ((i17 & 1572864) == 0) {
                    if (o0VarE.i(f18)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i24 |= i27;
                }
            }
            i28 = i19 & 128;
            if (i28 != 0) {
                i24 |= 12582912;
            } else if ((i17 & 12582912) == 0) {
                if (o0VarE.i(f15)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i24 |= i29;
            }
            i30 = i19 & 256;
            if (i30 != 0) {
                if ((i17 & 100663296) == 0) {
                    if (o0VarE.i(f16)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i24 |= i34;
                }
                if ((i17 & C.ENCODING_PCM_32BIT) != 0) {
                    i24 |= ((i19 & 512) == 0 || !o0VarE.i(f17)) ? 268435456 : 536870912;
                }
                if ((i18 & 6) == 0) {
                    i35 = i18 | (((i19 & 1024) == 0 || !o0VarE.B(r1Var)) ? 2 : 4);
                } else {
                    i35 = i18;
                }
                i36 = i19 & 2048;
                if (i36 != 0) {
                    if ((i18 & 48) == 0) {
                        if (o0VarE.r(kVar)) {
                            i37 = 32;
                        } else {
                            i37 = 16;
                        }
                        i35 |= i37;
                    }
                    if ((i18 & 384) != 0) {
                        if (o0VarE.r(pVar)) {
                            i44 = 256;
                        } else {
                            i44 = 128;
                        }
                        i35 |= i44;
                    }
                    int i48 = i35;
                    i38 = i24;
                    if ((i24 & 306783379) == 306783378 || (i48 & 147) != 146) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i38 & 1, z14)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0 || o0VarE.o0()) {
                            if (i47 != 0) {
                                i25 = 5;
                            }
                            if (i26 != 0) {
                                f26 = 8;
                                g6.f.a aVar = g6.f.f75994b;
                            } else {
                                f26 = f18;
                            }
                            if (i28 != 0) {
                                f27 = 6;
                                g6.f.a aVar2 = g6.f.f75994b;
                            } else {
                                f27 = f15;
                            }
                            if (i30 != 0) {
                                f28 = 4;
                                g6.f.a aVar3 = g6.f.f75994b;
                            } else {
                                f28 = f16;
                            }
                            if ((i19 & 512) != 0) {
                                f29 = f27;
                            } else {
                                f29 = f17;
                            }
                            if ((i19 & 1024) != 0) {
                                r1Var3 = k2.i.f102406a;
                            } else {
                                r1Var3 = r1Var;
                            }
                            if (i36 != 0) {
                                kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                            } else {
                                kVarC = kVar;
                            }
                            f34 = f26;
                            f35 = f27;
                            kVar3 = kVarC;
                            f36 = f28;
                            f37 = f29;
                            r1Var4 = r1Var3;
                        } else {
                            o0VarE.e();
                            f35 = f15;
                            f36 = f16;
                            f37 = f17;
                            r1Var4 = r1Var;
                            kVar3 = kVar;
                            f34 = f18;
                        }
                        o0VarE.h0();
                        x1 x1Var = n.f135158a;
                        y3 y3Var = t1.f91490h;
                        g6.c cVar = (g6.c) o0VarE.A(y3Var);
                        int i49 = i25;
                        v.a(y3Var.c(new g6.d((float) Math.rint(cVar.getF75991a()), cVar.getF75992b())), z3.f.c(-1263451150, new h(i49, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                        i39 = i49;
                        f25 = f34;
                        f24 = f37;
                        kVar2 = kVar3;
                        f22 = f36;
                        f19 = f35;
                        r1Var2 = r1Var4;
                    } else {
                        o0VarE.e();
                        f19 = f15;
                        f22 = f16;
                        f24 = f17;
                        r1Var2 = r1Var;
                        kVar2 = kVar;
                        f25 = f18;
                        i39 = i25;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p() { // from class: l02.i
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i17 | 1);
                                int iT2 = p0.t(i18);
                                k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i35 |= 48;
                if ((i18 & 384) != 0) {
                    if (o0VarE.r(pVar)) {
                        i44 = 256;
                    } else {
                        i44 = 128;
                    }
                    i35 |= i44;
                }
                int i410 = i35;
                i38 = i24;
                if ((i24 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i38 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar4 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar5 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar6 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    } else {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar7 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar8 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar9 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    }
                    o0VarE.h0();
                    x1 x1Var2 = n.f135158a;
                    y3 y3Var2 = t1.f91490h;
                    g6.c cVar2 = (g6.c) o0VarE.A(y3Var2);
                    int i411 = i25;
                    v.a(y3Var2.c(new g6.d((float) Math.rint(cVar2.getF75991a()), cVar2.getF75992b())), z3.f.c(-1263451150, new h(i411, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                    i39 = i411;
                    f25 = f34;
                    f24 = f37;
                    kVar2 = kVar3;
                    f22 = f36;
                    f19 = f35;
                    r1Var2 = r1Var4;
                } else {
                    o0VarE.e();
                    f19 = f15;
                    f22 = f16;
                    f24 = f17;
                    r1Var2 = r1Var;
                    kVar2 = kVar;
                    f25 = f18;
                    i39 = i25;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: l02.i
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i17 | 1);
                            int iT2 = p0.t(i18);
                            k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i24 |= 100663296;
            if ((i17 & C.ENCODING_PCM_32BIT) != 0) {
                i24 |= ((i19 & 512) == 0 || !o0VarE.i(f17)) ? 268435456 : 536870912;
            }
            if ((i18 & 6) == 0) {
                i35 = i18 | (((i19 & 1024) == 0 || !o0VarE.B(r1Var)) ? 2 : 4);
            } else {
                i35 = i18;
            }
            i36 = i19 & 2048;
            if (i36 != 0) {
                if ((i18 & 48) == 0) {
                    if (o0VarE.r(kVar)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i35 |= i37;
                }
                if ((i18 & 384) != 0) {
                    if (o0VarE.r(pVar)) {
                        i44 = 256;
                    } else {
                        i44 = 128;
                    }
                    i35 |= i44;
                }
                int i412 = i35;
                i38 = i24;
                if ((i24 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i38 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar10 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar11 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar12 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    } else {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar13 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar14 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar15 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    }
                    o0VarE.h0();
                    x1 x1Var3 = n.f135158a;
                    y3 y3Var3 = t1.f91490h;
                    g6.c cVar3 = (g6.c) o0VarE.A(y3Var3);
                    int i413 = i25;
                    v.a(y3Var3.c(new g6.d((float) Math.rint(cVar3.getF75991a()), cVar3.getF75992b())), z3.f.c(-1263451150, new h(i413, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                    i39 = i413;
                    f25 = f34;
                    f24 = f37;
                    kVar2 = kVar3;
                    f22 = f36;
                    f19 = f35;
                    r1Var2 = r1Var4;
                } else {
                    o0VarE.e();
                    f19 = f15;
                    f22 = f16;
                    f24 = f17;
                    r1Var2 = r1Var;
                    kVar2 = kVar;
                    f25 = f18;
                    i39 = i25;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: l02.i
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i17 | 1);
                            int iT2 = p0.t(i18);
                            k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i35 |= 48;
            if ((i18 & 384) != 0) {
                if (o0VarE.r(pVar)) {
                    i44 = 256;
                } else {
                    i44 = 128;
                }
                i35 |= i44;
            }
            int i414 = i35;
            i38 = i24;
            if ((i24 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i38 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar16 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar17 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar18 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                } else {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar19 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar110 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar111 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                }
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                y3 y3Var4 = t1.f91490h;
                g6.c cVar4 = (g6.c) o0VarE.A(y3Var4);
                int i415 = i25;
                v.a(y3Var4.c(new g6.d((float) Math.rint(cVar4.getF75991a()), cVar4.getF75992b())), z3.f.c(-1263451150, new h(i415, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                i39 = i415;
                f25 = f34;
                f24 = f37;
                kVar2 = kVar3;
                f22 = f36;
                f19 = f35;
                r1Var2 = r1Var4;
            } else {
                o0VarE.e();
                f19 = f15;
                f22 = f16;
                f24 = f17;
                r1Var2 = r1Var;
                kVar2 = kVar;
                f25 = f18;
                i39 = i25;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: l02.i
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i17 | 1);
                        int iT2 = p0.t(i18);
                        k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= 3072;
        i25 = i16;
        if ((i17 & 24576) == 0) {
            if (o0VarE.l(j8)) {
                i46 = 16384;
            } else {
                i46 = 8192;
            }
            i24 |= i46;
        }
        if ((i17 & 196608) == 0) {
            if (o0VarE.l(j14)) {
                i45 = 131072;
            } else {
                i45 = 65536;
            }
            i24 |= i45;
        }
        i26 = i19 & 64;
        if (i26 != 0) {
            i24 |= 1572864;
            f18 = f14;
        } else {
            f18 = f14;
            if ((i17 & 1572864) == 0) {
                if (o0VarE.i(f18)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i24 |= i27;
            }
        }
        i28 = i19 & 128;
        if (i28 != 0) {
            i24 |= 12582912;
        } else if ((i17 & 12582912) == 0) {
            if (o0VarE.i(f15)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i24 |= i29;
        }
        i30 = i19 & 256;
        if (i30 != 0) {
            if ((i17 & 100663296) == 0) {
                if (o0VarE.i(f16)) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i24 |= i34;
            }
            if ((i17 & C.ENCODING_PCM_32BIT) != 0) {
                i24 |= ((i19 & 512) == 0 || !o0VarE.i(f17)) ? 268435456 : 536870912;
            }
            if ((i18 & 6) == 0) {
                i35 = i18 | (((i19 & 1024) == 0 || !o0VarE.B(r1Var)) ? 2 : 4);
            } else {
                i35 = i18;
            }
            i36 = i19 & 2048;
            if (i36 != 0) {
                if ((i18 & 48) == 0) {
                    if (o0VarE.r(kVar)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i35 |= i37;
                }
                if ((i18 & 384) != 0) {
                    if (o0VarE.r(pVar)) {
                        i44 = 256;
                    } else {
                        i44 = 128;
                    }
                    i35 |= i44;
                }
                int i416 = i35;
                i38 = i24;
                if ((i24 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i38 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar112 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar113 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar114 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    } else {
                        if (i47 != 0) {
                            i25 = 5;
                        }
                        if (i26 != 0) {
                            f26 = 8;
                            g6.f.a aVar115 = g6.f.f75994b;
                        } else {
                            f26 = f18;
                        }
                        if (i28 != 0) {
                            f27 = 6;
                            g6.f.a aVar116 = g6.f.f75994b;
                        } else {
                            f27 = f15;
                        }
                        if (i30 != 0) {
                            f28 = 4;
                            g6.f.a aVar117 = g6.f.f75994b;
                        } else {
                            f28 = f16;
                        }
                        if ((i19 & 512) != 0) {
                            f29 = f27;
                        } else {
                            f29 = f17;
                        }
                        if ((i19 & 1024) != 0) {
                            r1Var3 = k2.i.f102406a;
                        } else {
                            r1Var3 = r1Var;
                        }
                        if (i36 != 0) {
                            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                        } else {
                            kVarC = kVar;
                        }
                        f34 = f26;
                        f35 = f27;
                        kVar3 = kVarC;
                        f36 = f28;
                        f37 = f29;
                        r1Var4 = r1Var3;
                    }
                    o0VarE.h0();
                    x1 x1Var5 = n.f135158a;
                    y3 y3Var5 = t1.f91490h;
                    g6.c cVar5 = (g6.c) o0VarE.A(y3Var5);
                    int i417 = i25;
                    v.a(y3Var5.c(new g6.d((float) Math.rint(cVar5.getF75991a()), cVar5.getF75992b())), z3.f.c(-1263451150, new h(i417, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                    i39 = i417;
                    f25 = f34;
                    f24 = f37;
                    kVar2 = kVar3;
                    f22 = f36;
                    f19 = f35;
                    r1Var2 = r1Var4;
                } else {
                    o0VarE.e();
                    f19 = f15;
                    f22 = f16;
                    f24 = f17;
                    r1Var2 = r1Var;
                    kVar2 = kVar;
                    f25 = f18;
                    i39 = i25;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: l02.i
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i17 | 1);
                            int iT2 = p0.t(i18);
                            k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i35 |= 48;
            if ((i18 & 384) != 0) {
                if (o0VarE.r(pVar)) {
                    i44 = 256;
                } else {
                    i44 = 128;
                }
                i35 |= i44;
            }
            int i418 = i35;
            i38 = i24;
            if ((i24 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i38 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar118 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar119 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar1110 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                } else {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar1111 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar1112 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar1113 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                }
                o0VarE.h0();
                x1 x1Var6 = n.f135158a;
                y3 y3Var6 = t1.f91490h;
                g6.c cVar6 = (g6.c) o0VarE.A(y3Var6);
                int i419 = i25;
                v.a(y3Var6.c(new g6.d((float) Math.rint(cVar6.getF75991a()), cVar6.getF75992b())), z3.f.c(-1263451150, new h(i419, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                i39 = i419;
                f25 = f34;
                f24 = f37;
                kVar2 = kVar3;
                f22 = f36;
                f19 = f35;
                r1Var2 = r1Var4;
            } else {
                o0VarE.e();
                f19 = f15;
                f22 = f16;
                f24 = f17;
                r1Var2 = r1Var;
                kVar2 = kVar;
                f25 = f18;
                i39 = i25;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: l02.i
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i17 | 1);
                        int iT2 = p0.t(i18);
                        k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= 100663296;
        if ((i17 & C.ENCODING_PCM_32BIT) != 0) {
            i24 |= ((i19 & 512) == 0 || !o0VarE.i(f17)) ? 268435456 : 536870912;
        }
        if ((i18 & 6) == 0) {
            i35 = i18 | (((i19 & 1024) == 0 || !o0VarE.B(r1Var)) ? 2 : 4);
        } else {
            i35 = i18;
        }
        i36 = i19 & 2048;
        if (i36 != 0) {
            if ((i18 & 48) == 0) {
                if (o0VarE.r(kVar)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i35 |= i37;
            }
            if ((i18 & 384) != 0) {
                if (o0VarE.r(pVar)) {
                    i44 = 256;
                } else {
                    i44 = 128;
                }
                i35 |= i44;
            }
            int i4110 = i35;
            i38 = i24;
            if ((i24 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i38 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar1114 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar1115 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar1116 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                } else {
                    if (i47 != 0) {
                        i25 = 5;
                    }
                    if (i26 != 0) {
                        f26 = 8;
                        g6.f.a aVar1117 = g6.f.f75994b;
                    } else {
                        f26 = f18;
                    }
                    if (i28 != 0) {
                        f27 = 6;
                        g6.f.a aVar1118 = g6.f.f75994b;
                    } else {
                        f27 = f15;
                    }
                    if (i30 != 0) {
                        f28 = 4;
                        g6.f.a aVar1119 = g6.f.f75994b;
                    } else {
                        f28 = f16;
                    }
                    if ((i19 & 512) != 0) {
                        f29 = f27;
                    } else {
                        f29 = f17;
                    }
                    if ((i19 & 1024) != 0) {
                        r1Var3 = k2.i.f102406a;
                    } else {
                        r1Var3 = r1Var;
                    }
                    if (i36 != 0) {
                        kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                    } else {
                        kVarC = kVar;
                    }
                    f34 = f26;
                    f35 = f27;
                    kVar3 = kVarC;
                    f36 = f28;
                    f37 = f29;
                    r1Var4 = r1Var3;
                }
                o0VarE.h0();
                x1 x1Var7 = n.f135158a;
                y3 y3Var7 = t1.f91490h;
                g6.c cVar7 = (g6.c) o0VarE.A(y3Var7);
                int i4111 = i25;
                v.a(y3Var7.c(new g6.d((float) Math.rint(cVar7.getF75991a()), cVar7.getF75992b())), z3.f.c(-1263451150, new h(i4111, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
                i39 = i4111;
                f25 = f34;
                f24 = f37;
                kVar2 = kVar3;
                f22 = f36;
                f19 = f35;
                r1Var2 = r1Var4;
            } else {
                o0VarE.e();
                f19 = f15;
                f22 = f16;
                f24 = f17;
                r1Var2 = r1Var;
                kVar2 = kVar;
                f25 = f18;
                i39 = i25;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: l02.i
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i17 | 1);
                        int iT2 = p0.t(i18);
                        k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i35 |= 48;
        if ((i18 & 384) != 0) {
            if (o0VarE.r(pVar)) {
                i44 = 256;
            } else {
                i44 = 128;
            }
            i35 |= i44;
        }
        int i4112 = i35;
        i38 = i24;
        if ((i24 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i38 & 1, z14)) {
            o0VarE.G0();
            if ((i17 & 1) != 0) {
                if (i47 != 0) {
                    i25 = 5;
                }
                if (i26 != 0) {
                    f26 = 8;
                    g6.f.a aVar11110 = g6.f.f75994b;
                } else {
                    f26 = f18;
                }
                if (i28 != 0) {
                    f27 = 6;
                    g6.f.a aVar11111 = g6.f.f75994b;
                } else {
                    f27 = f15;
                }
                if (i30 != 0) {
                    f28 = 4;
                    g6.f.a aVar11112 = g6.f.f75994b;
                } else {
                    f28 = f16;
                }
                if ((i19 & 512) != 0) {
                    f29 = f27;
                } else {
                    f29 = f17;
                }
                if ((i19 & 1024) != 0) {
                    r1Var3 = k2.i.f102406a;
                } else {
                    r1Var3 = r1Var;
                }
                if (i36 != 0) {
                    kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                } else {
                    kVarC = kVar;
                }
                f34 = f26;
                f35 = f27;
                kVar3 = kVarC;
                f36 = f28;
                f37 = f29;
                r1Var4 = r1Var3;
            } else {
                if (i47 != 0) {
                    i25 = 5;
                }
                if (i26 != 0) {
                    f26 = 8;
                    g6.f.a aVar11113 = g6.f.f75994b;
                } else {
                    f26 = f18;
                }
                if (i28 != 0) {
                    f27 = 6;
                    g6.f.a aVar11114 = g6.f.f75994b;
                } else {
                    f27 = f15;
                }
                if (i30 != 0) {
                    f28 = 4;
                    g6.f.a aVar11115 = g6.f.f75994b;
                } else {
                    f28 = f16;
                }
                if ((i19 & 512) != 0) {
                    f29 = f27;
                } else {
                    f29 = f17;
                }
                if ((i19 & 1024) != 0) {
                    r1Var3 = k2.i.f102406a;
                } else {
                    r1Var3 = r1Var;
                }
                if (i36 != 0) {
                    kVarC = s1.l.c(7, 0.0f, 0.0f, null);
                } else {
                    kVarC = kVar;
                }
                f34 = f26;
                f35 = f27;
                kVar3 = kVarC;
                f36 = f28;
                f37 = f29;
                r1Var4 = r1Var3;
            }
            o0VarE.h0();
            x1 x1Var8 = n.f135158a;
            y3 y3Var8 = t1.f91490h;
            g6.c cVar8 = (g6.c) o0VarE.A(y3Var8);
            int i4113 = i25;
            v.a(y3Var8.c(new g6.d((float) Math.rint(cVar8.getF75991a()), cVar8.getF75992b())), z3.f.c(-1263451150, new h(i4113, i15, f34, f37, i14, kVar3, rVar, pVar, f36, f35, r1Var4, j8, j14), o0VarE), o0VarE, 56);
            i39 = i4113;
            f25 = f34;
            f24 = f37;
            kVar2 = kVar3;
            f22 = f36;
            f19 = f35;
            r1Var2 = r1Var4;
        } else {
            o0VarE.e();
            f19 = f15;
            f22 = f16;
            f24 = f17;
            r1Var2 = r1Var;
            kVar2 = kVar;
            f25 = f18;
            i39 = i25;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: l02.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i17 | 1);
                    int iT2 = p0.t(i18);
                    k.a(rVar, i14, i15, i39, j8, j14, f25, f19, f22, f24, r1Var2, kVar2, pVar, (p3.m) obj, iT, iT2, i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, j0 j0Var, int i14, int i15, long j8, long j14, float f14, float f15, float f16, float f17, r1 r1Var, s1.k kVar, p3.m mVar, int i16) {
        int i17;
        int i18;
        o0 o0Var;
        int i19;
        long j15;
        long j16;
        float f18;
        float f19;
        float f22;
        float f24;
        r1 r1Var2;
        s1.k kVar2;
        int i24;
        s1.k kVarC;
        int i25;
        float f25;
        r1 r1Var3;
        long j17;
        long j18;
        float f26;
        float f27;
        float f28;
        j0Var.getClass();
        o0 o0VarE = mVar.E(-118823001);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.B(j0Var) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 256 : 128;
        } else {
            i18 = i14;
        }
        int i26 = i17 | 3072;
        if ((i16 & 24576) == 0) {
            i26 = i17 | 11264;
        }
        if ((196608 & i16) == 0) {
            i26 |= 65536;
        }
        int i27 = 114819072 | i26;
        if ((805306368 & i16) == 0) {
            i27 = 383254528 | i26;
        }
        if (o0VarE.n(i27 & 1, (306783379 & i27) != 306783378)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                long jA = d92.b.a(o0VarE).b().a().a();
                bVar.getClass();
                long j19 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                g6.f.a aVar = g6.f.f75994b;
                k2.h hVar = k2.i.f102406a;
                i24 = 5;
                kVarC = s1.l.c(5, 0.0f, 3000.0f, null);
                i25 = i27 & (-1879564289);
                f25 = 8;
                r1Var3 = hVar;
                j17 = jA;
                j18 = j19;
                f26 = 6;
                f27 = f26;
                f28 = 4;
            } else {
                o0VarE.e();
                i25 = i27 & (-1879564289);
                i24 = i15;
                j17 = j8;
                j18 = j14;
                f25 = f14;
                f26 = f15;
                f28 = f16;
                f27 = f17;
                r1Var3 = r1Var;
                kVarC = kVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.f(new g0(j0Var, 7));
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            a(rVar, ((Number) ((x3) objQ).getF182175a()).intValue(), i18, i24, j17, j18, f25, f26, f28, f27, r1Var3, kVarC, null, o0Var, i25 & 2147483534, 432, 0);
            i19 = i24;
            j15 = j17;
            j16 = j18;
            f18 = f25;
            f19 = f26;
            f22 = f28;
            f24 = f27;
            r1Var2 = r1Var3;
            kVar2 = kVarC;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i19 = i15;
            j15 = j8;
            j16 = j14;
            f18 = f14;
            f19 = f15;
            f22 = f16;
            f24 = f17;
            r1Var2 = r1Var;
            kVar2 = kVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, j0Var, i14, i19, j15, j16, f18, f19, f22, f24, r1Var2, kVar2, i16);
        }
    }
}
