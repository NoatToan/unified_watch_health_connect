package r82;

import android.view.KeyEvent;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxMap;
import e2.f0;
import e2.i0;
import e2.k0;
import f5.z0;
import h5.e0;
import i3.e5;
import kotlin.t1;
import o4.d0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.t3;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.u1;
import u1.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.picker.GenericWheelPickerKt$ListPicker$2$1", f = "GenericWheelPicker.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f151282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f151283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i53.c<T> f151284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f151285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n1 f151286f;

        /* JADX INFO: renamed from: r82.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, MapboxMap.QFE_OFFSET}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.ui.patterns.picker.GenericWheelPickerKt$ListPicker$2$1$3", f = "GenericWheelPicker.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2845a extends v13.i implements e23.q<Integer, Integer, t13.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ int f151287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f151288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f151289c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i53.c<T> f151290d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2845a(float f14, i53.c<? extends T> cVar, t13.d<? super C2845a> dVar) {
                super(3, dVar);
                this.f151289c = f14;
                this.f151290d = cVar;
            }

            @Override // e23.q
            public final Object invoke(Integer num, Integer num2, t13.d<? super Integer> dVar) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                C2845a c2845a = new C2845a(this.f151289c, this.f151290d, dVar);
                c2845a.f151287a = iIntValue;
                c2845a.f151288b = iIntValue2;
                return c2845a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                int i14 = this.f151287a;
                int i15 = this.f151288b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                if (i15 > this.f151289c) {
                    i14++;
                }
                return new Integer(j23.t.e(i14, 0, this.f151290d.size() - 1));
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<Integer, Unit> f151291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f151292b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(e23.l<? super Integer, Unit> lVar, n1 n1Var) {
                this.f151291a = lVar;
                this.f151292b = n1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int iIntValue = ((Number) obj).intValue();
                this.f151292b.t(iIntValue);
                this.f151291a.invoke(new Integer(iIntValue));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i0 i0Var, float f14, i53.c<? extends T> cVar, e23.l<? super Integer, Unit> lVar, n1 n1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151282b = i0Var;
            this.f151283c = f14;
            this.f151284d = cVar;
            this.f151285e = lVar;
            this.f151286f = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f151282b, this.f151283c, this.f151284d, this.f151285e, this.f151286f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151281a;
            if (i14 == 0) {
                o13.r.b(obj);
                i0 i0Var = this.f151282b;
                r53.i iVarS = r53.s.s(new u1(p0.s(new ct1.c(i0Var, 10)), p0.s(new ct1.c(i0Var, 11)), new C2845a(this.f151283c, this.f151284d, null)));
                b bVar = new b(this.f151285e, this.f151286f);
                this.f151281a = 1;
                if (iVarS.collect(bVar, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<z4.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f151293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f151294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i53.c<T> f151295c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(i0 i0Var, b0 b0Var, i53.c<? extends T> cVar) {
            this.f151293a = i0Var;
            this.f151294b = b0Var;
            this.f151295c = cVar;
        }

        @Override // e23.l
        public final Boolean invoke(z4.b bVar) {
            KeyEvent keyEvent = bVar.f202306a;
            keyEvent.getClass();
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            boolean z14 = false;
            if (iB == z4.c.f202309d) {
                i0 i0Var = this.f151293a;
                int iH = i0Var.h();
                long jA = z4.f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                boolean zA = z4.a.a(jA, z4.a.f202285g);
                b0 b0Var = this.f151294b;
                i53.c<T> cVar = this.f151295c;
                if (zA) {
                    ge1.b.T(b0Var, null, null, new l(iH, cVar, i0Var, null), 3);
                } else if (z4.a.a(jA, z4.a.f202284f)) {
                    ge1.b.T(b0Var, null, null, new m(iH, cVar, i0Var, null), 3);
                }
                z14 = true;
            }
            return Boolean.valueOf(z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x0164  */
    /* JADX WARN: Code duplicated, block: B:109:0x0168  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0173  */
    /* JADX WARN: Code duplicated, block: B:115:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0192  */
    /* JADX WARN: Code duplicated, block: B:123:0x0198  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x0226  */
    /* JADX WARN: Code duplicated, block: B:135:0x023d  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    public static final <T> void a(h4.r rVar, final i53.c<? extends T> cVar, final int i14, e23.l<? super T, String> lVar, float f14, boolean z14, boolean z15, long j8, h4.d.b bVar, e23.l<? super Integer, Unit> lVar2, p3.m mVar, final int i15, final int i16) {
        int i17;
        int i18;
        e23.l<? super T, String> lVar3;
        int i19;
        float f15;
        int i24;
        boolean z16;
        int i25;
        boolean z17;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z18;
        o0 o0Var;
        final h4.r rVar2;
        final e23.l<? super Integer, Unit> lVar4;
        final e23.l<? super T, String> lVar5;
        final float f16;
        final boolean z19;
        final boolean z24;
        final long j14;
        final h4.d.b bVar2;
        p2 p2VarI0;
        h4.r rVar3;
        e23.l<? super T, String> lVar6;
        float f17;
        long jC;
        int i30;
        h4.d.b bVar3;
        int i34;
        h4.r rVar4;
        Object objQ;
        cVar.getClass();
        o0 o0VarE = mVar.E(97787692);
        int i35 = i16 & 1;
        if (i35 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 256 : 128;
        } else {
            i18 = i14;
        }
        int i36 = i16 & 8;
        if (i36 != 0) {
            i19 = i17 | 3072;
            lVar3 = lVar;
        } else {
            lVar3 = lVar;
            i19 = i17 | (o0VarE.r(lVar3) ? 2048 : 1024);
        }
        int i37 = i16 & 16;
        if (i37 != 0) {
            i24 = i19 | 24576;
            f15 = f14;
        } else {
            f15 = f14;
            i24 = i19 | (o0VarE.i(f15) ? 16384 : 8192);
        }
        int i38 = i16 & 32;
        if (i38 != 0) {
            i25 = i24 | 196608;
            z16 = z14;
        } else {
            z16 = z14;
            i25 = i24 | (o0VarE.h(z16) ? 131072 : 65536);
        }
        int i39 = i16 & 64;
        if (i39 != 0) {
            i26 = i25 | 1572864;
            z17 = z15;
        } else {
            z17 = z15;
            i26 = i25 | (o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i44 = i26 | (((i16 & 128) == 0 && o0VarE.l(j8)) ? 8388608 : 4194304);
        int i45 = i16 & 256;
        if (i45 == 0) {
            if ((100663296 & i15) == 0) {
                i44 |= o0VarE.B(bVar) ? 67108864 : 33554432;
            }
            i27 = i16 & 512;
            if (i27 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i44 |= i28;
                }
                i29 = i44;
                if ((i44 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i29 & 1, z18)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0 || o0VarE.o0()) {
                        if (i35 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i36 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i37 != 0) {
                            f17 = 52;
                            g6.f.a aVar = g6.f.f75994b;
                        } else {
                            f17 = f15;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        }
                        if (i39 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jC = d92.b.a(o0VarE).j().c();
                            i30 = i29 & (-29360129);
                        } else {
                            jC = j8;
                            i30 = i29;
                        }
                        if (i45 != 0) {
                            h4.d.f81522a.getClass();
                            bVar3 = h4.d.a.f81537o;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(1);
                                o0VarE.K(objQ);
                            }
                            lVar2 = (e23.l) objQ;
                            lVar3 = lVar6;
                            f15 = f17;
                            j8 = jC;
                            bVar = bVar3;
                            z16 = z16;
                            z17 = z17;
                            rVar4 = rVar3;
                            i34 = i30;
                        } else {
                            lVar2 = lVar2;
                            i34 = i30;
                            lVar3 = lVar6;
                            f15 = f17;
                            j8 = jC;
                            bVar = bVar3;
                            z16 = z16;
                            z17 = z17;
                            rVar4 = rVar3;
                        }
                    } else {
                        o0VarE.e();
                        i34 = (i16 & 128) != 0 ? i29 & (-29360129) : i29;
                        rVar4 = rVar;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    int i46 = i34 << 3;
                    o0Var = o0VarE;
                    b(rVar4, cVar, i18, lVar3, null, f15, z16, z17, j8, bVar, lVar2, o0Var, (i34 & 14) | 24576 | (i34 & 112) | (i34 & 896) | (i34 & 7168) | (458752 & i46) | (3670016 & i46) | (29360128 & i46) | (234881024 & i46) | (i46 & 1879048192), (i34 >> 27) & 14, 0);
                    rVar2 = rVar4;
                    lVar5 = lVar3;
                    f16 = f15;
                    z19 = z16;
                    z24 = z17;
                    j14 = j8;
                    bVar2 = bVar;
                    lVar4 = lVar2;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    f16 = f15;
                    z19 = z16;
                    z24 = z17;
                    j14 = j8;
                    bVar2 = bVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: r82.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.a(rVar2, cVar, i14, lVar5, f16, z19, z24, j14, bVar2, lVar4, (p3.m) obj, p0.t(i15 | 1), i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i44 |= C.ENCODING_PCM_32BIT;
            i29 = i44;
            if ((i44 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i29 & 1, z18)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i36 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i37 != 0) {
                        f17 = 52;
                        g6.f.a aVar2 = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    }
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).j().c();
                        i30 = i29 & (-29360129);
                    } else {
                        jC = j8;
                        i30 = i29;
                    }
                    if (i45 != 0) {
                        h4.d.f81522a.getClass();
                        bVar3 = h4.d.a.f81537o;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(1);
                            o0VarE.K(objQ);
                        }
                        lVar2 = (e23.l) objQ;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                        i34 = i30;
                    } else {
                        lVar2 = lVar2;
                        i34 = i30;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i35 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i36 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i37 != 0) {
                        f17 = 52;
                        g6.f.a aVar3 = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    }
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).j().c();
                        i30 = i29 & (-29360129);
                    } else {
                        jC = j8;
                        i30 = i29;
                    }
                    if (i45 != 0) {
                        h4.d.f81522a.getClass();
                        bVar3 = h4.d.a.f81537o;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(1);
                            o0VarE.K(objQ);
                        }
                        lVar2 = (e23.l) objQ;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                        i34 = i30;
                    } else {
                        lVar2 = lVar2;
                        i34 = i30;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                    }
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                int i47 = i34 << 3;
                o0Var = o0VarE;
                b(rVar4, cVar, i18, lVar3, null, f15, z16, z17, j8, bVar, lVar2, o0Var, (i34 & 14) | 24576 | (i34 & 112) | (i34 & 896) | (i34 & 7168) | (458752 & i47) | (3670016 & i47) | (29360128 & i47) | (234881024 & i47) | (i47 & 1879048192), (i34 >> 27) & 14, 0);
                rVar2 = rVar4;
                lVar5 = lVar3;
                f16 = f15;
                z19 = z16;
                z24 = z17;
                j14 = j8;
                bVar2 = bVar;
                lVar4 = lVar2;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                lVar4 = lVar2;
                lVar5 = lVar3;
                f16 = f15;
                z19 = z16;
                z24 = z17;
                j14 = j8;
                bVar2 = bVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.a(rVar2, cVar, i14, lVar5, f16, z19, z24, j14, bVar2, lVar4, (p3.m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i44 |= 100663296;
        i27 = i16 & 512;
        if (i27 != 0) {
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar2)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i44 |= i28;
            }
            i29 = i44;
            if ((i44 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i29 & 1, z18)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i36 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i37 != 0) {
                        f17 = 52;
                        g6.f.a aVar4 = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    }
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).j().c();
                        i30 = i29 & (-29360129);
                    } else {
                        jC = j8;
                        i30 = i29;
                    }
                    if (i45 != 0) {
                        h4.d.f81522a.getClass();
                        bVar3 = h4.d.a.f81537o;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(1);
                            o0VarE.K(objQ);
                        }
                        lVar2 = (e23.l) objQ;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                        i34 = i30;
                    } else {
                        lVar2 = lVar2;
                        i34 = i30;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i35 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i36 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i37 != 0) {
                        f17 = 52;
                        g6.f.a aVar5 = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    }
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).j().c();
                        i30 = i29 & (-29360129);
                    } else {
                        jC = j8;
                        i30 = i29;
                    }
                    if (i45 != 0) {
                        h4.d.f81522a.getClass();
                        bVar3 = h4.d.a.f81537o;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(1);
                            o0VarE.K(objQ);
                        }
                        lVar2 = (e23.l) objQ;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                        i34 = i30;
                    } else {
                        lVar2 = lVar2;
                        i34 = i30;
                        lVar3 = lVar6;
                        f15 = f17;
                        j8 = jC;
                        bVar = bVar3;
                        z16 = z16;
                        z17 = z17;
                        rVar4 = rVar3;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                int i48 = i34 << 3;
                o0Var = o0VarE;
                b(rVar4, cVar, i18, lVar3, null, f15, z16, z17, j8, bVar, lVar2, o0Var, (i34 & 14) | 24576 | (i34 & 112) | (i34 & 896) | (i34 & 7168) | (458752 & i48) | (3670016 & i48) | (29360128 & i48) | (234881024 & i48) | (i48 & 1879048192), (i34 >> 27) & 14, 0);
                rVar2 = rVar4;
                lVar5 = lVar3;
                f16 = f15;
                z19 = z16;
                z24 = z17;
                j14 = j8;
                bVar2 = bVar;
                lVar4 = lVar2;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                lVar4 = lVar2;
                lVar5 = lVar3;
                f16 = f15;
                z19 = z16;
                z24 = z17;
                j14 = j8;
                bVar2 = bVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.a(rVar2, cVar, i14, lVar5, f16, z19, z24, j14, bVar2, lVar4, (p3.m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i44 |= C.ENCODING_PCM_32BIT;
        i29 = i44;
        if ((i44 & 306783379) != 306783378) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i29 & 1, z18)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i36 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i37 != 0) {
                    f17 = 52;
                    g6.f.a aVar6 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                if (i38 != 0) {
                    z16 = true;
                }
                if (i39 != 0) {
                    z17 = true;
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    i30 = i29 & (-29360129);
                } else {
                    jC = j8;
                    i30 = i29;
                }
                if (i45 != 0) {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81537o;
                } else {
                    bVar3 = bVar;
                }
                if (i27 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(1);
                        o0VarE.K(objQ);
                    }
                    lVar2 = (e23.l) objQ;
                    lVar3 = lVar6;
                    f15 = f17;
                    j8 = jC;
                    bVar = bVar3;
                    z16 = z16;
                    z17 = z17;
                    rVar4 = rVar3;
                    i34 = i30;
                } else {
                    lVar2 = lVar2;
                    i34 = i30;
                    lVar3 = lVar6;
                    f15 = f17;
                    j8 = jC;
                    bVar = bVar3;
                    z16 = z16;
                    z17 = z17;
                    rVar4 = rVar3;
                }
            } else {
                if (i35 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i36 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i37 != 0) {
                    f17 = 52;
                    g6.f.a aVar7 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                if (i38 != 0) {
                    z16 = true;
                }
                if (i39 != 0) {
                    z17 = true;
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    i30 = i29 & (-29360129);
                } else {
                    jC = j8;
                    i30 = i29;
                }
                if (i45 != 0) {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81537o;
                } else {
                    bVar3 = bVar;
                }
                if (i27 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(1);
                        o0VarE.K(objQ);
                    }
                    lVar2 = (e23.l) objQ;
                    lVar3 = lVar6;
                    f15 = f17;
                    j8 = jC;
                    bVar = bVar3;
                    z16 = z16;
                    z17 = z17;
                    rVar4 = rVar3;
                    i34 = i30;
                } else {
                    lVar2 = lVar2;
                    i34 = i30;
                    lVar3 = lVar6;
                    f15 = f17;
                    j8 = jC;
                    bVar = bVar3;
                    z16 = z16;
                    z17 = z17;
                    rVar4 = rVar3;
                }
            }
            o0VarE.h0();
            x1 x1Var4 = p3.n.f135158a;
            int i49 = i34 << 3;
            o0Var = o0VarE;
            b(rVar4, cVar, i18, lVar3, null, f15, z16, z17, j8, bVar, lVar2, o0Var, (i34 & 14) | 24576 | (i34 & 112) | (i34 & 896) | (i34 & 7168) | (458752 & i49) | (3670016 & i49) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), (i34 >> 27) & 14, 0);
            rVar2 = rVar4;
            lVar5 = lVar3;
            f16 = f15;
            z19 = z16;
            z24 = z17;
            j14 = j8;
            bVar2 = bVar;
            lVar4 = lVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            lVar4 = lVar2;
            lVar5 = lVar3;
            f16 = f15;
            z19 = z16;
            z24 = z17;
            j14 = j8;
            bVar2 = bVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: r82.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.a(rVar2, cVar, i14, lVar5, f16, z19, z24, j14, bVar2, lVar4, (p3.m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x0228  */
    /* JADX WARN: Code duplicated, block: B:150:0x0232  */
    /* JADX WARN: Code duplicated, block: B:151:0x0234  */
    /* JADX WARN: Code duplicated, block: B:157:0x0251  */
    /* JADX WARN: Code duplicated, block: B:160:0x029f  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0303  */
    /* JADX WARN: Code duplicated, block: B:173:0x030a  */
    /* JADX WARN: Code duplicated, block: B:174:0x030e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0329  */
    /* JADX WARN: Code duplicated, block: B:182:0x0341  */
    /* JADX WARN: Code duplicated, block: B:183:0x0344  */
    /* JADX WARN: Code duplicated, block: B:186:0x0365  */
    /* JADX WARN: Code duplicated, block: B:187:0x0368  */
    /* JADX WARN: Code duplicated, block: B:190:0x038c  */
    /* JADX WARN: Code duplicated, block: B:193:0x039d  */
    /* JADX WARN: Code duplicated, block: B:196:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:204:0x041c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0422  */
    /* JADX WARN: Code duplicated, block: B:209:0x042b  */
    /* JADX WARN: Code duplicated, block: B:211:0x042f  */
    /* JADX WARN: Code duplicated, block: B:215:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x043d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0457  */
    /* JADX WARN: Code duplicated, block: B:221:0x045b  */
    /* JADX WARN: Code duplicated, block: B:223:0x045f  */
    /* JADX WARN: Code duplicated, block: B:229:0x046c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0474  */
    /* JADX WARN: Code duplicated, block: B:233:0x0476  */
    /* JADX WARN: Code duplicated, block: B:236:0x0480  */
    /* JADX WARN: Code duplicated, block: B:237:0x0482  */
    /* JADX WARN: Code duplicated, block: B:240:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x0492  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:249:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final <T> void b(final h4.r rVar, final i53.c<? extends T> cVar, final int i14, final e23.l<? super T, String> lVar, final i53.c<String> cVar2, float f14, boolean z14, boolean z15, long j8, h4.d.b bVar, final e23.l<? super Integer, Unit> lVar2, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        float f15;
        boolean z16;
        boolean z17;
        int i19;
        int i24;
        int i25;
        boolean z18;
        o0 o0Var;
        final long j14;
        final h4.d.b bVar2;
        final float f16;
        final boolean z19;
        final boolean z24;
        p2 p2VarI0;
        float f17;
        long jC;
        h4.d.b bVar3;
        float f18;
        h4.d.b bVar4;
        long j15;
        i0 i0VarA;
        Object objQ;
        p3.m.a.C2565a c2565a;
        final n1 n1Var;
        final float f19;
        h4.r rVarE;
        h4.r rVarU;
        float fS0;
        float f22;
        int i26;
        boolean z25;
        boolean z26;
        boolean z27;
        Object aVar;
        p3.m.a.C2565a c2565a2;
        boolean z28;
        i0 i0Var;
        i53.c<? extends T> cVar3;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar5;
        h5.g.a.f fVar;
        z zVarA;
        boolean z29;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        long j16;
        m1.a aVar3;
        long j17;
        Object objQ2;
        p3.m.a.C2565a c2565a3;
        b0 b0Var;
        Object objQ3;
        p1 p1Var;
        Object objQ4;
        int i27;
        boolean z34;
        i53.c<? extends T> cVar4;
        int i28;
        boolean z35;
        boolean z36;
        Object objQ5;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z44;
        boolean z45;
        Object objQ6;
        final float f24;
        int i29;
        cVar.getClass();
        o0 o0VarE = mVar.E(-293983496);
        p3.c<?> cVar5 = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= (i15 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.B(cVar2) ? 16384 : 8192;
        }
        int i30 = i17 & 32;
        if (i30 != 0) {
            i18 |= 196608;
            f15 = f14;
        } else {
            f15 = f14;
            if ((i15 & 196608) == 0) {
                i18 |= o0VarE.i(f15) ? 131072 : 65536;
            }
        }
        int i34 = i17 & 64;
        if (i34 != 0) {
            i18 |= 1572864;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i15 & 1572864) == 0) {
                i18 |= o0VarE.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i35 = i17 & 128;
        if (i35 != 0) {
            i18 |= 12582912;
            z17 = z15;
        } else {
            z17 = z15;
            if ((i15 & 12582912) == 0) {
                i18 |= o0VarE.h(z17) ? 8388608 : 4194304;
            }
        }
        if ((i15 & 100663296) == 0) {
            int i36 = i18;
            if ((i17 & 256) == 0) {
                i24 = i35;
                int i37 = o0VarE.l(j8) ? 67108864 : 33554432;
                i19 = i36 | i37;
            } else {
                i24 = i35;
            }
            i19 = i36 | i37;
        } else {
            i19 = i18;
            i24 = i35;
        }
        int i38 = i17 & 512;
        if (i38 == 0) {
            if ((805306368 & i15) == 0) {
                i19 |= o0VarE.B(bVar) ? 536870912 : 268435456;
            }
            if ((i16 & 6) == 0) {
                if (o0VarE.r(lVar2)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i25 = i16 | i29;
            } else {
                i25 = i16;
            }
            if ((i19 & 306783379) == 306783378 || (i25 & 3) != 2) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i19 & 1, z18)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    if (i30 != 0) {
                        f17 = 52;
                        g6.f.a aVar4 = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    if (i34 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if ((i17 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).j().c();
                        i19 &= -234881025;
                    } else {
                        jC = j8;
                    }
                    if (i38 != 0) {
                        h4.d.f81522a.getClass();
                        bVar3 = h4.d.a.f81537o;
                    } else {
                        bVar3 = bVar;
                    }
                    f18 = f17;
                    bVar4 = bVar3;
                    j15 = jC;
                } else {
                    o0VarE.e();
                    if ((i17 & 256) != 0) {
                        i19 &= -234881025;
                    }
                    j15 = j8;
                    bVar4 = bVar;
                    f18 = f15;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                o0VarE.N(949718375, cVar);
                i0VarA = k0.a(i14, (i19 >> 6) & 14, 2, o0VarE);
                o0VarE.g0(false);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(i14, o0VarE);
                }
                n1Var = (n1) objQ;
                float f25 = 1;
                g6.f.a aVar5 = g6.f.f75994b;
                f19 = 64;
                rVarE = h4.r.S;
                rVarU = x2.u(x2.h(rVarE, f25), f19);
                float f26 = 2;
                float f27 = (f25 * f26) + (3 * f18);
                fS0 = ((g6.c) o0VarE.A(t1.f91490h)).s0(f18) / f26;
                boolean zB = o0VarE.B(i0VarA) | o0VarE.i(fS0);
                f22 = f18;
                i26 = i19 & 112;
                if (i26 != 32 || ((i19 & 64) != 0 && o0VarE.r(cVar))) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z46 = zB | z25;
                if ((i25 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z46 | z26;
                Object objQ7 = o0VarE.q();
                if (!z27 || objQ7 == c2565a) {
                    c2565a2 = c2565a;
                    z28 = false;
                    aVar = new a(i0VarA, fS0, cVar, lVar2, n1Var, null);
                    i0Var = i0VarA;
                    cVar3 = cVar;
                    o0VarE.K(aVar);
                } else {
                    i0Var = i0VarA;
                    aVar = objQ7;
                    c2565a2 = c2565a;
                    z28 = false;
                    cVar3 = cVar;
                }
                l0.f(i0Var, cVar3, (e23.p) aVar, o0VarE);
                h4.r rVarH = x2.h(x2.z(rVar, null, 3), f27);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81528f, z28);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarH, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar5 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar5 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarU2 = x2.u(x2.c(rVarE, 1.0f), f19);
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                z29 = z16;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarU2, o0VarE);
                if (cVar5 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                c2.l.f(x2.u(b0Var2.a(rVarE, 1.0f, true), f19), o0VarE);
                if (z29) {
                    j16 = j15;
                } else {
                    d0.f128823b.getClass();
                    j16 = d0.f128831j;
                }
                aVar3 = m1.f128891a;
                c2.l.f(u1.n.e(rVarU, j16, aVar3), o0VarE);
                c2.l.f(x2.u(b0Var2.a(rVarE, 1.0f, true), f19), o0VarE);
                if (z17 != 0) {
                    j17 = j15;
                } else {
                    d0.f128823b.getClass();
                    j17 = d0.f128831j;
                }
                c2.l.f(u1.n.e(rVarU, j17, aVar3), o0VarE);
                c2.l.f(x2.u(b0Var2.a(rVarE, 1.0f, true), f19), o0VarE);
                o0VarE.g0(true);
                objQ2 = o0VarE.q();
                c2565a3 = c2565a2;
                if (objQ2 == c2565a3) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (b0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a3) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                h4.r rVarC3 = x2.c(rVarE, 1.0f);
                objQ4 = o0VarE.q();
                i27 = 12;
                if (objQ4 == c2565a3) {
                    objQ4 = new pp.b(p1Var, i27);
                    o0VarE.K(objQ4);
                }
                h4.r rVarB = m4.e.b(rVarC3, (e23.l) objQ4);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-687634252);
                    h4.r rVarB2 = x2.b(rVarE, f19, 0.0f, 2);
                    d92.b.f58623a.getClass();
                    rVarE = u1.n.e(rVarB2, d92.b.a(o0VarE).e().g(), aVar3);
                    z34 = false;
                    o0VarE.g0(false);
                } else {
                    z34 = false;
                    o0VarE.C(-687445896);
                    o0VarE.g0(false);
                }
                h4.r rVarThen = rVarB.then(m0.a(x2.z(rVarE, null, 3), true, null));
                boolean zB2 = o0VarE.B(i0Var) | o0VarE.r(b0Var);
                if (i26 != 32) {
                    i28 = i19;
                    if ((i28 & 64) != 0) {
                        cVar4 = cVar;
                        if (o0VarE.r(cVar4)) {
                        }
                        z36 = zB2 | z35;
                        objQ5 = o0VarE.q();
                        if (z36 || objQ5 == c2565a3) {
                            objQ5 = new b(i0Var, b0Var, cVar4);
                            o0VarE.K(objQ5);
                        }
                        h4.r rVarB3 = z4.f.b(rVarThen, (e23.l) objQ5);
                        t3 t3VarC = z1.g.c(i0Var, o0VarE);
                        if ((i28 & 458752) == 131072) {
                            z37 = true;
                        } else {
                            z37 = z34;
                        }
                        if (i26 != 32 || ((i28 & 64) != 0 && o0VarE.r(cVar4))) {
                            z38 = true;
                        } else {
                            z38 = z34;
                        }
                        boolean z47 = z38 | z37;
                        if ((i28 & 7168) == 2048) {
                            z39 = true;
                        } else {
                            z39 = z34;
                        }
                        boolean z48 = z47 | z39;
                        if ((57344 & i28) == 16384) {
                            z44 = true;
                        } else {
                            z44 = z34;
                        }
                        z45 = z48 | z44;
                        objQ6 = o0VarE.q();
                        if (!z45 || objQ6 == c2565a3) {
                            final i53.c<? extends T> cVar6 = cVar4;
                            f24 = f22;
                            e23.l lVar3 = new e23.l() { // from class: r82.i
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    f0 f0Var = (f0) obj;
                                    f0Var.getClass();
                                    float f28 = f24;
                                    float f29 = f19;
                                    f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f28, f29, 1)), 3);
                                    i53.c cVar7 = cVar6;
                                    f0.f(f0Var, cVar7.size(), null, new z3.e(1170138068, true, new cv1.g(f28, lVar, cVar7, cVar2, n1Var)), 6);
                                    f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f28, f29, 2)), 3);
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar3);
                            objQ6 = lVar3;
                        } else {
                            f24 = f22;
                        }
                        h4.d.b bVar6 = bVar4;
                        e2.c.b(rVarB3, i0Var, null, null, bVar6, t3VarC, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                        o0Var = o0VarE;
                        o0Var.g0(true);
                        x1 x1Var2 = p3.n.f135158a;
                        z19 = z17;
                        f16 = f24;
                        bVar2 = bVar6;
                        j14 = j15;
                        z24 = z29;
                    } else {
                        cVar4 = cVar;
                    }
                    z35 = z34;
                    z36 = zB2 | z35;
                    objQ5 = o0VarE.q();
                    if (z36) {
                        objQ5 = new b(i0Var, b0Var, cVar4);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new b(i0Var, b0Var, cVar4);
                        o0VarE.K(objQ5);
                    }
                    h4.r rVarB4 = z4.f.b(rVarThen, (e23.l) objQ5);
                    t3 t3VarC2 = z1.g.c(i0Var, o0VarE);
                    if ((i28 & 458752) == 131072) {
                        z37 = true;
                    } else {
                        z37 = z34;
                    }
                    if (i26 != 32) {
                        z38 = true;
                    } else {
                        z38 = true;
                    }
                    boolean z49 = z38 | z37;
                    if ((i28 & 7168) == 2048) {
                        z39 = true;
                    } else {
                        z39 = z34;
                    }
                    boolean z410 = z49 | z39;
                    if ((57344 & i28) == 16384) {
                        z44 = true;
                    } else {
                        z44 = z34;
                    }
                    z45 = z410 | z44;
                    objQ6 = o0VarE.q();
                    if (z45) {
                        final i53.c cVar7 = cVar4;
                        f24 = f22;
                        e23.l lVar4 = new e23.l() { // from class: r82.i
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                float f28 = f24;
                                float f29 = f19;
                                f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f28, f29, 1)), 3);
                                i53.c cVar8 = cVar7;
                                f0.f(f0Var, cVar8.size(), null, new z3.e(1170138068, true, new cv1.g(f28, lVar, cVar8, cVar2, n1Var)), 6);
                                f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f28, f29, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar4);
                        objQ6 = lVar4;
                    } else {
                        final i53.c cVar8 = cVar4;
                        f24 = f22;
                        e23.l lVar5 = new e23.l() { // from class: r82.i
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                float f28 = f24;
                                float f29 = f19;
                                f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f28, f29, 1)), 3);
                                i53.c cVar9 = cVar8;
                                f0.f(f0Var, cVar9.size(), null, new z3.e(1170138068, true, new cv1.g(f28, lVar, cVar9, cVar2, n1Var)), 6);
                                f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f28, f29, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar5);
                        objQ6 = lVar5;
                    }
                    h4.d.b bVar7 = bVar4;
                    e2.c.b(rVarB4, i0Var, null, null, bVar7, t3VarC2, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    x1 x1Var3 = p3.n.f135158a;
                    z19 = z17;
                    f16 = f24;
                    bVar2 = bVar7;
                    j14 = j15;
                    z24 = z29;
                } else {
                    cVar4 = cVar;
                    i28 = i19;
                }
                z35 = true;
                z36 = zB2 | z35;
                objQ5 = o0VarE.q();
                if (z36) {
                    objQ5 = new b(i0Var, b0Var, cVar4);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new b(i0Var, b0Var, cVar4);
                    o0VarE.K(objQ5);
                }
                h4.r rVarB5 = z4.f.b(rVarThen, (e23.l) objQ5);
                t3 t3VarC3 = z1.g.c(i0Var, o0VarE);
                if ((i28 & 458752) == 131072) {
                    z37 = true;
                } else {
                    z37 = z34;
                }
                if (i26 != 32) {
                    z38 = true;
                } else {
                    z38 = true;
                }
                boolean z411 = z38 | z37;
                if ((i28 & 7168) == 2048) {
                    z39 = true;
                } else {
                    z39 = z34;
                }
                boolean z412 = z411 | z39;
                if ((57344 & i28) == 16384) {
                    z44 = true;
                } else {
                    z44 = z34;
                }
                z45 = z412 | z44;
                objQ6 = o0VarE.q();
                if (z45) {
                    final i53.c cVar9 = cVar4;
                    f24 = f22;
                    e23.l lVar6 = new e23.l() { // from class: r82.i
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            float f28 = f24;
                            float f29 = f19;
                            f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f28, f29, 1)), 3);
                            i53.c cVar10 = cVar9;
                            f0.f(f0Var, cVar10.size(), null, new z3.e(1170138068, true, new cv1.g(f28, lVar, cVar10, cVar2, n1Var)), 6);
                            f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f28, f29, 2)), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar6);
                    objQ6 = lVar6;
                } else {
                    final i53.c cVar10 = cVar4;
                    f24 = f22;
                    e23.l lVar7 = new e23.l() { // from class: r82.i
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            float f28 = f24;
                            float f29 = f19;
                            f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f28, f29, 1)), 3);
                            i53.c cVar11 = cVar10;
                            f0.f(f0Var, cVar11.size(), null, new z3.e(1170138068, true, new cv1.g(f28, lVar, cVar11, cVar2, n1Var)), 6);
                            f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f28, f29, 2)), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar7);
                    objQ6 = lVar7;
                }
                h4.d.b bVar8 = bVar4;
                e2.c.b(rVarB5, i0Var, null, null, bVar8, t3VarC3, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                o0Var = o0VarE;
                o0Var.g0(true);
                x1 x1Var4 = p3.n.f135158a;
                z19 = z17;
                f16 = f24;
                bVar2 = bVar8;
                j14 = j15;
                z24 = z29;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                j14 = j8;
                bVar2 = bVar;
                f16 = f15;
                z19 = z17;
                z24 = z16;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.j
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        k.b(rVar, cVar, i14, lVar, cVar2, f16, z24, z19, j14, bVar2, lVar2, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= C.ENCODING_PCM_32BIT;
        if ((i16 & 6) == 0) {
            if (o0VarE.r(lVar2)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i25 = i16 | i29;
        } else {
            i25 = i16;
        }
        if ((i19 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (o0VarE.n(i19 & 1, z18)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i30 != 0) {
                    f17 = 52;
                    g6.f.a aVar6 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                if (i34 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if ((i17 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    i19 &= -234881025;
                } else {
                    jC = j8;
                }
                if (i38 != 0) {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81537o;
                } else {
                    bVar3 = bVar;
                }
                f18 = f17;
                bVar4 = bVar3;
                j15 = jC;
            } else {
                if (i30 != 0) {
                    f17 = 52;
                    g6.f.a aVar7 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                if (i34 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if ((i17 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    i19 &= -234881025;
                } else {
                    jC = j8;
                }
                if (i38 != 0) {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81537o;
                } else {
                    bVar3 = bVar;
                }
                f18 = f17;
                bVar4 = bVar3;
                j15 = jC;
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            o0VarE.N(949718375, cVar);
            i0VarA = k0.a(i14, (i19 >> 6) & 14, 2, o0VarE);
            o0VarE.g0(false);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(i14, o0VarE);
            }
            n1Var = (n1) objQ;
            float f28 = 1;
            g6.f.a aVar8 = g6.f.f75994b;
            f19 = 64;
            rVarE = h4.r.S;
            rVarU = x2.u(x2.h(rVarE, f28), f19);
            float f29 = 2;
            float f210 = (f28 * f29) + (3 * f18);
            fS0 = ((g6.c) o0VarE.A(t1.f91490h)).s0(f18) / f29;
            boolean zB3 = o0VarE.B(i0VarA) | o0VarE.i(fS0);
            f22 = f18;
            i26 = i19 & 112;
            if (i26 != 32) {
                z25 = true;
            } else {
                z25 = true;
            }
            boolean z413 = zB3 | z25;
            if ((i25 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z413 | z26;
            Object objQ8 = o0VarE.q();
            if (z27) {
                c2565a2 = c2565a;
                z28 = false;
                aVar = new a(i0VarA, fS0, cVar, lVar2, n1Var, null);
                i0Var = i0VarA;
                cVar3 = cVar;
                o0VarE.K(aVar);
            } else {
                c2565a2 = c2565a;
                z28 = false;
                aVar = new a(i0VarA, fS0, cVar, lVar2, n1Var, null);
                i0Var = i0VarA;
                cVar3 = cVar;
                o0VarE.K(aVar);
            }
            l0.f(i0Var, cVar3, (e23.p) aVar, o0VarE);
            h4.r rVarH2 = x2.h(x2.z(rVar, null, 3), f210);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81528f, z28);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarH2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar5 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarU3 = x2.u(x2.c(rVarE, 1.0f), f19);
            c2.j.f22691a.getClass();
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            z29 = z16;
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarU3, o0VarE);
            if (cVar5 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            c2.l.f(x2.u(b0Var3.a(rVarE, 1.0f, true), f19), o0VarE);
            if (z29) {
                j16 = j15;
            } else {
                d0.f128823b.getClass();
                j16 = d0.f128831j;
            }
            aVar3 = m1.f128891a;
            c2.l.f(u1.n.e(rVarU, j16, aVar3), o0VarE);
            c2.l.f(x2.u(b0Var3.a(rVarE, 1.0f, true), f19), o0VarE);
            if (z17 != 0) {
                j17 = j15;
            } else {
                d0.f128823b.getClass();
                j17 = d0.f128831j;
            }
            c2.l.f(u1.n.e(rVarU, j17, aVar3), o0VarE);
            c2.l.f(x2.u(b0Var3.a(rVarE, 1.0f, true), f19), o0VarE);
            o0VarE.g0(true);
            objQ2 = o0VarE.q();
            c2565a3 = c2565a2;
            if (objQ2 == c2565a3) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0Var = (b0) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a3) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var = (p1) objQ3;
            h4.r rVarC4 = x2.c(rVarE, 1.0f);
            objQ4 = o0VarE.q();
            i27 = 12;
            if (objQ4 == c2565a3) {
                objQ4 = new pp.b(p1Var, i27);
                o0VarE.K(objQ4);
            }
            h4.r rVarB6 = m4.e.b(rVarC4, (e23.l) objQ4);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-687634252);
                h4.r rVarB7 = x2.b(rVarE, f19, 0.0f, 2);
                d92.b.f58623a.getClass();
                rVarE = u1.n.e(rVarB7, d92.b.a(o0VarE).e().g(), aVar3);
                z34 = false;
                o0VarE.g0(false);
            } else {
                z34 = false;
                o0VarE.C(-687445896);
                o0VarE.g0(false);
            }
            h4.r rVarThen2 = rVarB6.then(m0.a(x2.z(rVarE, null, 3), true, null));
            boolean zB4 = o0VarE.B(i0Var) | o0VarE.r(b0Var);
            if (i26 != 32) {
                i28 = i19;
                if ((i28 & 64) != 0) {
                    cVar4 = cVar;
                    if (o0VarE.r(cVar4)) {
                    }
                    z36 = zB4 | z35;
                    objQ5 = o0VarE.q();
                    if (z36) {
                        objQ5 = new b(i0Var, b0Var, cVar4);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new b(i0Var, b0Var, cVar4);
                        o0VarE.K(objQ5);
                    }
                    h4.r rVarB8 = z4.f.b(rVarThen2, (e23.l) objQ5);
                    t3 t3VarC4 = z1.g.c(i0Var, o0VarE);
                    if ((i28 & 458752) == 131072) {
                        z37 = true;
                    } else {
                        z37 = z34;
                    }
                    if (i26 != 32) {
                        z38 = true;
                    } else {
                        z38 = true;
                    }
                    boolean z414 = z38 | z37;
                    if ((i28 & 7168) == 2048) {
                        z39 = true;
                    } else {
                        z39 = z34;
                    }
                    boolean z415 = z414 | z39;
                    if ((57344 & i28) == 16384) {
                        z44 = true;
                    } else {
                        z44 = z34;
                    }
                    z45 = z415 | z44;
                    objQ6 = o0VarE.q();
                    if (z45) {
                        final i53.c cVar11 = cVar4;
                        f24 = f22;
                        e23.l lVar8 = new e23.l() { // from class: r82.i
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                float f211 = f24;
                                float f212 = f19;
                                f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                                i53.c cVar12 = cVar11;
                                f0.f(f0Var, cVar12.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar12, cVar2, n1Var)), 6);
                                f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar8);
                        objQ6 = lVar8;
                    } else {
                        final i53.c cVar12 = cVar4;
                        f24 = f22;
                        e23.l lVar9 = new e23.l() { // from class: r82.i
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                float f211 = f24;
                                float f212 = f19;
                                f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                                i53.c cVar13 = cVar12;
                                f0.f(f0Var, cVar13.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar13, cVar2, n1Var)), 6);
                                f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar9);
                        objQ6 = lVar9;
                    }
                    h4.d.b bVar9 = bVar4;
                    e2.c.b(rVarB8, i0Var, null, null, bVar9, t3VarC4, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    x1 x1Var6 = p3.n.f135158a;
                    z19 = z17;
                    f16 = f24;
                    bVar2 = bVar9;
                    j14 = j15;
                    z24 = z29;
                } else {
                    cVar4 = cVar;
                }
                z35 = z34;
                z36 = zB4 | z35;
                objQ5 = o0VarE.q();
                if (z36) {
                    objQ5 = new b(i0Var, b0Var, cVar4);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new b(i0Var, b0Var, cVar4);
                    o0VarE.K(objQ5);
                }
                h4.r rVarB9 = z4.f.b(rVarThen2, (e23.l) objQ5);
                t3 t3VarC5 = z1.g.c(i0Var, o0VarE);
                if ((i28 & 458752) == 131072) {
                    z37 = true;
                } else {
                    z37 = z34;
                }
                if (i26 != 32) {
                    z38 = true;
                } else {
                    z38 = true;
                }
                boolean z416 = z38 | z37;
                if ((i28 & 7168) == 2048) {
                    z39 = true;
                } else {
                    z39 = z34;
                }
                boolean z417 = z416 | z39;
                if ((57344 & i28) == 16384) {
                    z44 = true;
                } else {
                    z44 = z34;
                }
                z45 = z417 | z44;
                objQ6 = o0VarE.q();
                if (z45) {
                    final i53.c cVar13 = cVar4;
                    f24 = f22;
                    e23.l lVar10 = new e23.l() { // from class: r82.i
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            float f211 = f24;
                            float f212 = f19;
                            f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                            i53.c cVar14 = cVar13;
                            f0.f(f0Var, cVar14.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar14, cVar2, n1Var)), 6);
                            f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar10);
                    objQ6 = lVar10;
                } else {
                    final i53.c cVar14 = cVar4;
                    f24 = f22;
                    e23.l lVar11 = new e23.l() { // from class: r82.i
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            float f211 = f24;
                            float f212 = f19;
                            f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                            i53.c cVar15 = cVar14;
                            f0.f(f0Var, cVar15.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar15, cVar2, n1Var)), 6);
                            f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar11);
                    objQ6 = lVar11;
                }
                h4.d.b bVar10 = bVar4;
                e2.c.b(rVarB9, i0Var, null, null, bVar10, t3VarC5, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                o0Var = o0VarE;
                o0Var.g0(true);
                x1 x1Var7 = p3.n.f135158a;
                z19 = z17;
                f16 = f24;
                bVar2 = bVar10;
                j14 = j15;
                z24 = z29;
            } else {
                cVar4 = cVar;
                i28 = i19;
            }
            z35 = true;
            z36 = zB4 | z35;
            objQ5 = o0VarE.q();
            if (z36) {
                objQ5 = new b(i0Var, b0Var, cVar4);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new b(i0Var, b0Var, cVar4);
                o0VarE.K(objQ5);
            }
            h4.r rVarB10 = z4.f.b(rVarThen2, (e23.l) objQ5);
            t3 t3VarC6 = z1.g.c(i0Var, o0VarE);
            if ((i28 & 458752) == 131072) {
                z37 = true;
            } else {
                z37 = z34;
            }
            if (i26 != 32) {
                z38 = true;
            } else {
                z38 = true;
            }
            boolean z418 = z38 | z37;
            if ((i28 & 7168) == 2048) {
                z39 = true;
            } else {
                z39 = z34;
            }
            boolean z419 = z418 | z39;
            if ((57344 & i28) == 16384) {
                z44 = true;
            } else {
                z44 = z34;
            }
            z45 = z419 | z44;
            objQ6 = o0VarE.q();
            if (z45) {
                final i53.c cVar15 = cVar4;
                f24 = f22;
                e23.l lVar12 = new e23.l() { // from class: r82.i
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        float f211 = f24;
                        float f212 = f19;
                        f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                        i53.c cVar16 = cVar15;
                        f0.f(f0Var, cVar16.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar16, cVar2, n1Var)), 6);
                        f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar12);
                objQ6 = lVar12;
            } else {
                final i53.c cVar16 = cVar4;
                f24 = f22;
                e23.l lVar13 = new e23.l() { // from class: r82.i
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        float f211 = f24;
                        float f212 = f19;
                        f0.b(f0Var, null, new z3.e(417486909, true, new g02.e(f211, f212, 1)), 3);
                        i53.c cVar17 = cVar16;
                        f0.f(f0Var, cVar17.size(), null, new z3.e(1170138068, true, new cv1.g(f211, lVar, cVar17, cVar2, n1Var)), 6);
                        f0.b(f0Var, null, new z3.e(446233894, true, new g02.e(f211, f212, 2)), 3);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar13);
                objQ6 = lVar13;
            }
            h4.d.b bVar11 = bVar4;
            e2.c.b(rVarB10, i0Var, null, null, bVar11, t3VarC6, false, null, (e23.l) objQ6, o0VarE, (i28 >> 12) & 458752, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
            o0Var = o0VarE;
            o0Var.g0(true);
            x1 x1Var8 = p3.n.f135158a;
            z19 = z17;
            f16 = f24;
            bVar2 = bVar11;
            j14 = j15;
            z24 = z29;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            j14 = j8;
            bVar2 = bVar;
            f16 = f15;
            z19 = z17;
            z24 = z16;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: r82.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    k.b(rVar, cVar, i14, lVar, cVar2, f16, z24, z19, j14, bVar2, lVar2, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(h4.r rVar, i53.c<p<Object>> cVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        i53.c<p<Object>> cVar2;
        h4.r rVar3;
        long jC;
        boolean z14;
        boolean z15 = false;
        cVar.getClass();
        o0 o0VarE = mVar.E(-1579255535);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            cVar2 = cVar;
            i16 |= o0VarE.B(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        boolean z16 = true;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-1154563850);
            for (p<Object> pVar : cVar2) {
                e23.p<p3.m, Integer, Unit> pVar2 = pVar.f151307d;
                if (pVar2 == null) {
                    o0VarE.C(612472211);
                } else {
                    o0VarE.C(2097967150);
                    pVar2.invoke(o0VarE, 0);
                }
                o0VarE.g0(z15);
                i53.c<Object> cVar3 = pVar.f151304a;
                int i18 = pVar.f151305b;
                e23.l<Object, String> lVar = pVar.f151306c;
                float f14 = pVar.f151309f;
                boolean z17 = z16;
                boolean z18 = pVar.f151310g;
                boolean z19 = pVar.f151311h;
                d0 d0Var = pVar.f151312i;
                if (d0Var == null) {
                    o0VarE.C(2097981997);
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    o0VarE.g0(z15);
                } else {
                    o0VarE.C(2097980509);
                    o0VarE.g0(z15);
                    jC = d0Var.f128833a;
                }
                h4.r rVar5 = rVar4;
                a(null, cVar3, i18, lVar, f14, z18, z19, jC, pVar.f151313j, pVar.f151314k, o0VarE, 0, 1);
                e23.p<p3.m, Integer, Unit> pVar3 = pVar.f151308e;
                if (pVar3 == null) {
                    o0VarE.C(613118003);
                    z14 = false;
                } else {
                    z14 = false;
                    o0VarE.C(2097987982);
                    pVar3.invoke(o0VarE, 0);
                }
                o0VarE.g0(z14);
                z16 = z17;
                z15 = z14;
                rVar4 = rVar5;
            }
            o0VarE.g0(z15);
            o0VarE.g0(z16);
            x1 x1Var2 = p3.n.f135158a;
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f((Object) rVar3, (Object) cVar, false, i14, i15, 16);
        }
    }
}
