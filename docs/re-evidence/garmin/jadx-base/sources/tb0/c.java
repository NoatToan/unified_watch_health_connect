package tb0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, n.class, "onSkipTutorial", "onSkipTutorial()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            Object value2;
            n nVar = (n) this.receiver;
            hv.a aVar = nVar.f163653f;
            if (aVar != null) {
                p2 p2Var = nVar.f163654g;
                do {
                    value2 = p2Var.getValue();
                    ((Number) value2).intValue();
                } while (!p2Var.b(value2, Integer.valueOf(aVar.f85745d - 1)));
            }
            Unit unit = Unit.INSTANCE;
            p2 p2Var2 = nVar.f163659l;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, ub0.m.SKIP_TUTORIAL));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, n.class, "onViewTutorials", "onViewTutorials()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            n nVar = (n) this.receiver;
            p2 p2Var = nVar.f163659l;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ub0.m.VIEW_TUTORIALS));
            Unit unit = Unit.INSTANCE;
            nVar.x4(ub0.a.PLAY);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: tb0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C3080c extends p005kotlin.jvm.internal.q implements e23.l<ub0.a, Unit> {
        public C3080c(Object obj) {
            super(1, obj, n.class, "onAnimationAction", "onAnimationAction(Lcom/garmin/android/apps/connectmobile/device/setup/presentation/tutorials/components/AnimationAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(ub0.a aVar) {
            ub0.a aVar2 = aVar;
            aVar2.getClass();
            ((n) this.receiver).x4(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.DeviceGestureLegacyTutorialScreenKt$TutorialScreen$2$1", f = "DeviceGestureLegacyTutorialScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f163603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f163604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f163605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1 f163607e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z14, int i14, t tVar, e23.a<Unit> aVar, n1 n1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f163603a = z14;
            this.f163604b = i14;
            this.f163605c = tVar;
            this.f163606d = aVar;
            this.f163607e = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f163603a, this.f163604b, this.f163605c, this.f163606d, this.f163607e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = this.f163603a;
            if (!z14 || (i14 = this.f163604b) == -1) {
                i14 = R.string.common_learn_more;
            }
            this.f163607e.t(i14);
            if (z14 && this.f163605c.f163709e) {
                this.f163606d.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ub0.m f163608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f163609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hv.a f163610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<ub0.a, Unit> f163611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163614g;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f163615a;

            static {
                int[] iArr = new int[ub0.m.values().length];
                try {
                    iArr[ub0.m.VIEW_TUTORIALS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ub0.m.SKIP_TUTORIAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f163615a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(ub0.m mVar, int i14, hv.a aVar, e23.l<? super ub0.a, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
            this.f163608a = mVar;
            this.f163609b = i14;
            this.f163610c = aVar;
            this.f163611d = lVar;
            this.f163612e = aVar2;
            this.f163613f = aVar3;
            this.f163614g = aVar4;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                ub0.m mVar3 = this.f163608a;
                int i14 = mVar3 == null ? -1 : a.f163615a[mVar3.ordinal()];
                if (i14 == -1) {
                    mVar2.C(-1913019731);
                    ub0.k.f(x2.f(h4.r.S, 1.0f), this.f163613f, this.f163614g, mVar2, 6);
                    mVar2.f();
                } else if (i14 == 1) {
                    mVar2.C(-1913535230);
                    ub0.k.c(x2.f(h4.r.S, 1.0f), this.f163609b, this.f163610c.f85745d, this.f163611d, this.f163612e, mVar2, 6);
                    mVar2.f();
                } else {
                    if (i14 != 2) {
                        throw n23.j.m(mVar2, -1170107185);
                    }
                    mVar2.C(-1913113692);
                    mVar2.f();
                    this.f163612e.invoke();
                }
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, hv.a aVar, int i14, int i15, boolean z14, p3.m mVar, int i16) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1936795724);
        int i17 = i16 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t52.c(14);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = ((i17 & 896) == 256) | o0VarE.r(aVar) | ((i17 & 7168) == 2048) | ((i17 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                rb0.e eVar = new rb0.e(aVar, i14, i15, z14, 1);
                o0VarE.K(eVar);
                objQ2 = eVar;
            }
            e23.l lVar2 = (e23.l) objQ2;
            o0Var = o0VarE;
            p002j6.c.b(lVar, rVar, lVar2, o0Var, 54, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rb0.f(rVar, aVar, i14, i15, z14, i16, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(n nVar, String str, o90.a aVar, int i14, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar4, p3.m mVar, int i15, int i16) {
        int i17;
        String str2;
        int i18;
        e23.l<? super Float, Unit> lVar2;
        e23.a<Unit> aVar5;
        int i19;
        boolean z14;
        o0 o0Var;
        e23.a<Unit> aVar6;
        p3.p2 p2VarI0;
        e23.a<Unit> aVar7;
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-967788105);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.r(nVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            str2 = str;
            i17 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i15 & 384) == 0) {
            i17 |= (i15 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 2048 : 1024;
        } else {
            i18 = i14;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            lVar2 = lVar;
            i17 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar2 = lVar;
        }
        int i24 = i16 & 128;
        if (i24 == 0) {
            if ((12582912 & i15) == 0) {
                aVar5 = aVar4;
                i17 |= o0VarE.r(aVar5) ? 8388608 : 4194304;
            }
            i19 = i17;
            if ((4793491 & i19) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                if (i24 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar5;
                }
                x1 x1Var = p3.n.f135158a;
                p1 p1VarC = s9.c.c(nVar.f163658k, o0VarE);
                o0Var = o0VarE;
                da0.p.d("device_gesture_legacy_tutorial_screen", ((t) p1VarC.getF182175a()).f163705a, aVar7, null, null, null, z3.f.c(389303360, new bt1.o(nVar, str2, i18, aVar2, aVar3, lVar2, aVar, p1VarC, s9.c.c(nVar.f163660m, o0VarE)), o0VarE), o0Var, ((i19 >> 15) & 896) | 12582918, 120);
                aVar6 = aVar7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar5;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f10.j(nVar, str, aVar, i14, aVar2, aVar3, lVar, aVar6, i15, i16);
            }
        }
        i17 |= 12582912;
        aVar5 = aVar4;
        i19 = i17;
        if ((4793491 & i19) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            if (i24 != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar5;
            }
            x1 x1Var2 = p3.n.f135158a;
            p1 p1VarC2 = s9.c.c(nVar.f163658k, o0VarE);
            o0Var = o0VarE;
            da0.p.d("device_gesture_legacy_tutorial_screen", ((t) p1VarC2.getF182175a()).f163705a, aVar7, null, null, null, z3.f.c(389303360, new bt1.o(nVar, str2, i18, aVar2, aVar3, lVar2, aVar, p1VarC2, s9.c.c(nVar.f163660m, o0VarE)), o0VarE), o0Var, ((i19 >> 15) & 896) | 12582918, 120);
            aVar6 = aVar7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar6 = aVar5;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f10.j(nVar, str, aVar, i14, aVar2, aVar3, lVar, aVar6, i15, i16);
        }
    }

    public static final void c(final t tVar, final ub0.m mVar, final String str, final int i14, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final e23.a<Unit> aVar4, final e23.l<? super ub0.a, Unit> lVar, final e23.l<? super Float, Unit> lVar2, p3.m mVar2, final int i15) {
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar2.E(663592745);
        int i16 = i15 | (o0VarE.r(tVar) ? 4 : 2) | (o0VarE.k(mVar == null ? -1 : mVar.ordinal()) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432) | (o0VarE.r(lVar2) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            hv.a aVar5 = tVar.f163707c;
            if (aVar5 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p(tVar, mVar, str, i14, aVar, aVar2, aVar3, aVar4, lVar, lVar2, i15, i17) { // from class: tb0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f163592a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f163593b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ ub0.m f163594c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f163595d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f163596e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163597f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163598g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163599h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163600i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163601j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163602k;

                    {
                        this.f163592a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f163592a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                c.c(this.f163593b, this.f163594c, this.f163595d, this.f163596e, this.f163597f, this.f163598g, this.f163599h, this.f163600i, this.f163601j, this.f163602k, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                c.c(this.f163593b, this.f163594c, this.f163595d, this.f163596e, this.f163597f, this.f163598g, this.f163599h, this.f163600i, this.f163601j, this.f163602k, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                int i18 = tVar.f163710f;
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1 n1Var = (n1) objQ;
                boolean z14 = i18 == aVar5.f85745d + (-1);
                String strP = gl1.y.P(R.string.msg_initial_tutorial, new Object[]{str == null ? "" : str}, o0VarE);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(strP);
                    o0VarE.K(objQ2);
                }
                p1 p1Var = (p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(R.string.common_learn_more, o0VarE);
                }
                n1 n1Var2 = (n1) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = hb.a.n(aVar5.a(-1, -1) != null, o0VarE);
                }
                p1 p1Var2 = (p1) objQ4;
                Boolean boolValueOf = Boolean.valueOf(z14);
                boolean zH = o0VarE.h(z14) | ((i16 & 7168) == 2048) | o0VarE.r(tVar) | ((i16 & 458752) == 131072);
                Object objQ5 = o0VarE.q();
                if (zH || objQ5 == c2565a) {
                    d dVar = new d(z14, i14, tVar, aVar2, n1Var2, null);
                    o0VarE.K(dVar);
                    objQ5 = dVar;
                }
                l0.e((e23.p) objQ5, boolValueOf, o0VarE);
                b82.c.c(z3.f.c(1250177663, new e(mVar, i18, aVar5, lVar, aVar, aVar3, aVar4), o0VarE), z3.f.c(102643321, new pp.c(lVar2, i18, aVar5, n1Var, p1Var2, p1Var, str, n1Var2), o0VarE), o0VarE, 54);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            pVar = new e23.p(tVar, mVar, str, i14, aVar, aVar2, aVar3, aVar4, lVar, lVar2, i15, i19) { // from class: tb0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f163592a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f163593b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ub0.m f163594c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f163595d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f163596e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f163597f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f163598g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f163599h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.a f163600i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.l f163601j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.l f163602k;

                {
                    this.f163592a = i19;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f163592a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            c.c(this.f163593b, this.f163594c, this.f163595d, this.f163596e, this.f163597f, this.f163598g, this.f163599h, this.f163600i, this.f163601j, this.f163602k, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            c.c(this.f163593b, this.f163594c, this.f163595d, this.f163596e, this.f163597f, this.f163598g, this.f163599h, this.f163600i, this.f163601j, this.f163602k, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void d(h4.r rVar, hv.a aVar, int i14, e23.l lVar, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(905460872);
        int i16 = i15 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t52.c(15);
                o0VarE.K(objQ);
            }
            e23.l lVar2 = (e23.l) objQ;
            boolean zR = ((i16 & 896) == 256) | o0VarE.r(aVar) | ((i16 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new rb0.c(aVar, i14, lVar, 1);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar2, rVar, (e23.l) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rb0.d(rVar, aVar, i14, lVar, i15, 1);
        }
    }
}
