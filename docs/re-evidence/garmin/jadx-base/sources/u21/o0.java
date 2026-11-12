package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu21/o0;", "Landroidx/lifecycle/u1;", "Lu21/h1;", "recommendationsData", "Lm01/g;", "nutritionRepo", "Lp01/a;", "nutritionDelegate", "Ls01/f;", "nutritionSettingsConfigProvider", "Lv01/r0;", "getMicronutrientsGuidanceUseCase", "<init>", "(Lu21/h1;Lm01/g;Lp01/a;Ls01/f;Lv01/r0;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f168056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m01.g f168057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p01.a f168058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s01.f f168059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v01.r0 f168060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f168061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f168062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f168063h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168064a;

        static {
            int[] iArr = new int[s21.a.values().length];
            try {
                iArr[s21.a.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.a.ACTIVITY_MULTIPLIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s21.a.CUSTOM_ACTIVE_CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f168064a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel$calculateNutritionGoals$2", f = "NutritionSetupRecommendationsViewModel.kt", l = {543}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f168065a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f168067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f168068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f168069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l01.a f168070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s21.s f168071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f168072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Integer f168073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l01.i f168074j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f168075k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14, int i15, Integer num, l01.a aVar, s21.s sVar, int i16, Integer num2, l01.i iVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f168067c = i14;
            this.f168068d = i15;
            this.f168069e = num;
            this.f168070f = aVar;
            this.f168071g = sVar;
            this.f168072h = i16;
            this.f168073i = num2;
            this.f168074j = iVar;
            this.f168075k = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o0.this.new b(this.f168067c, this.f168068d, this.f168069e, this.f168070f, this.f168071g, this.f168072h, this.f168073i, this.f168074j, this.f168075k, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objT;
            Object value;
            s21.x xVar;
            Integer num;
            s21.g gVar;
            int i14;
            int i15;
            s21.f fVar;
            s21.f fVar2;
            s21.f fVar3;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f168065a;
            o0 o0Var = o0.this;
            if (i16 == 0) {
                o13.r.b(obj);
                m01.g gVar2 = o0Var.f168057b;
                l01.l lVar = new l01.l(this.f168067c, this.f168068d, this.f168069e, this.f168070f, this.f168071g, new Integer(this.f168072h), this.f168073i, this.f168074j, this.f168075k);
                this.f168065a = 1;
                objT = gVar2.T(lVar, this);
                if (objT == aVar) {
                    return aVar;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objT = obj;
            }
            v2 v2Var = (v2) objT;
            if (v2Var instanceof v2.a) {
                p2 p2Var = o0Var.f168062g;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, s21.x.a((s21.x) value2, null, null, null, null, null, null, null, 0.0f, false, null, 7167)));
            } else {
                if (!(v2Var instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                l01.j jVar = (l01.j) ((v2.b) v2Var).f47386a;
                int i17 = jVar.f107872b;
                p2 p2Var2 = o0Var.f168062g;
                do {
                    value = p2Var2.getValue();
                    xVar = (s21.x) value;
                    num = new Integer(i17);
                    gVar = xVar.f156194c;
                    i14 = 30;
                    i15 = (gVar == null || (fVar3 = gVar.f156115a) == null) ? 30 : fVar3.f156105b;
                    if (gVar != null && (fVar2 = gVar.f156116b) != null) {
                        i14 = fVar2.f156105b;
                    }
                } while (!p2Var2.b(value, s21.x.a(xVar, num, o0.z4(i17, i15, i14, (gVar == null || (fVar = gVar.f156117c) == null) ? 40 : fVar.f156105b), null, null, null, null, jVar.f107871a, 0.0f, false, null, 7033)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls21/x;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel$recommendationsSetupState$1", f = "NutritionSetupRecommendationsViewModel.kt", l = {77, 79}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super s21.x>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f168076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l01.a f168077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f168078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f168079d;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o0.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s21.x> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0113  */
        /* JADX WARN: Code duplicated, block: B:48:0x0118  */
        /* JADX WARN: Code duplicated, block: B:51:0x0126  */
        /* JADX WARN: Code duplicated, block: B:52:0x0129  */
        /* JADX WARN: Code duplicated, block: B:63:0x0160  */
        /* JADX WARN: Code duplicated, block: B:65:0x0178  */
        /* JADX WARN: Code duplicated, block: B:69:0x0189  */
        /* JADX WARN: Code duplicated, block: B:72:0x0190  */
        /* JADX WARN: Code duplicated, block: B:74:0x019b  */
        /* JADX WARN: Code duplicated, block: B:76:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:81:0x01d4 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:86:0x01df A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:89:0x01e6  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objX4;
            s21.g gVar;
            Object value;
            Integer num;
            l01.a aVar;
            boolean z14;
            h1 h1Var;
            b63.o oVar;
            int iFloatValue;
            boolean z15;
            boolean z16;
            Float f14;
            double dFloatValue;
            double d14;
            Integer num2;
            l01.a aVar2;
            Integer num3;
            Integer num4;
            Object value2;
            s21.x xVar;
            Integer num5;
            b63.o oVarD;
            Integer num6;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f168079d;
            o0 o0Var = o0.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    objX4 = obj;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z14 = this.f168078c;
                    aVar = this.f168077b;
                    num = this.f168076a;
                    o13.r.b(obj);
                }
                h1 h1Var2 = o0Var.f168056a;
                h1Var = o0Var.f168056a;
                oVar = h1Var2.f167999l;
                iFloatValue = 0;
                if (oVar != null || oVar.compareTo(g22.l.d(b63.o.INSTANCE)) < 0) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (h1Var.f167988a) {
                    z16 = true;
                } else {
                    v21.f fVar = v21.f.f175333a;
                    num6 = h1Var.f167996i;
                    fVar.getClass();
                    if (v21.f.s(num6)) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                }
                if (z15 || z16) {
                    String string = fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString();
                    int i15 = h1Var.f167990c;
                    f14 = h1Var.f167992e;
                    int i16 = h1Var.f167991d;
                    s21.s sVar = h1Var.f167989b;
                    if (f14 == null && f14.floatValue() > 0.0f) {
                        iFloatValue = (int) f14.floatValue();
                    } else if (h1Var.f167989b != s21.s.MAINTAIN_WEIGHT) {
                        k42.b.f102880a.getClass();
                        if (k42.b.l() == 0) {
                            l3.a aVar4 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
                            aVar4.getClass();
                            d14 = 1000;
                        } else {
                            l3.a aVar5 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.A)).floatValue();
                            aVar5.getClass();
                            d14 = 453.592d;
                        }
                        iFloatValue = (int) (dFloatValue * d14);
                    }
                    int i17 = iFloatValue;
                    if (z14) {
                        num2 = num;
                    } else {
                        num2 = null;
                    }
                    if (aVar != null || z14) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    num3 = h1Var.f167996i;
                    if (num3 != null || z15 || z16) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    o0.this.A4(i15, i16, i17, sVar, string, o0Var.E4(), aVar2, num2, num4);
                } else {
                    p2 p2Var = o0Var.f168062g;
                    do {
                        value2 = p2Var.getValue();
                        xVar = (s21.x) value2;
                        num5 = h1Var.f167996i;
                        oVarD = h1Var.f167999l;
                        if (oVarD == null) {
                            oVarD = g22.l.d(b63.o.INSTANCE);
                        }
                    } while (!p2Var.b(value2, s21.x.a(xVar, num5, null, null, null, null, null, oVarD, 0.0f, false, null, 8061)));
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            this.f168079d = 1;
            objX4 = o0.x4(o0Var, this);
            if (objX4 == aVar3) {
                return aVar3;
            }
            u21.b bVar = (u21.b) objX4;
            Integer num7 = bVar.f167898a;
            boolean z17 = bVar.f167899b;
            l01.a aVar6 = bVar.f167900c;
            h1 h1Var3 = o0Var.f168056a;
            Integer num8 = h1Var3.f167996i;
            s21.e eVar = h1Var3.f167997j;
            Double d15 = eVar != null ? eVar.f156099c : null;
            Double d16 = eVar != null ? eVar.f156098b : null;
            Double d17 = eVar != null ? eVar.f156097a : null;
            if (num8 == null || d15 == null || d16 == null || d17 == null) {
                gVar = null;
            } else {
                double dDoubleValue = d17.doubleValue();
                double dDoubleValue2 = d16.doubleValue();
                double dDoubleValue3 = d15.doubleValue();
                int iIntValue = num8.intValue();
                v21.f.f175333a.getClass();
                int iB = v21.f.b(iIntValue, 4.0d, dDoubleValue3);
                int iB2 = v21.f.b(iIntValue, 9.0d, dDoubleValue2);
                int iB3 = v21.f.b(iIntValue, 4.0d, dDoubleValue);
                gVar = (iB + iB2) + iB3 == 100 ? new s21.g(new s21.f(dDoubleValue3, iB), new s21.f(dDoubleValue2, iB2), new s21.f(dDoubleValue, iB3)) : o0.z4(iIntValue, 30, 30, 40);
            }
            p2 p2Var2 = o0Var.f168062g;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, s21.x.a((s21.x) value, h1Var3.f167996i, gVar, null, null, null, null, null, 0.0f, false, null, 8185)));
            this.f168076a = num7;
            this.f168077b = aVar6;
            this.f168078c = z17;
            this.f168079d = 2;
            if (o0.y4(o0Var, this) == aVar3) {
                return aVar3;
            }
            num = num7;
            aVar = aVar6;
            z14 = z17;
            h1 h1Var4 = o0Var.f168056a;
            h1Var = o0Var.f168056a;
            oVar = h1Var4.f167999l;
            iFloatValue = 0;
            if (oVar != null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (h1Var.f167988a) {
                v21.f fVar2 = v21.f.f175333a;
                num6 = h1Var.f167996i;
                fVar2.getClass();
                if (v21.f.s(num6)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                z16 = true;
            }
            if (z15) {
                String string2 = fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString();
                int i18 = h1Var.f167990c;
                f14 = h1Var.f167992e;
                int i19 = h1Var.f167991d;
                s21.s sVar2 = h1Var.f167989b;
                if (f14 == null) {
                    if (h1Var.f167989b != s21.s.MAINTAIN_WEIGHT) {
                        k42.b.f102880a.getClass();
                        if (k42.b.l() == 0) {
                            l3.a aVar7 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
                            aVar7.getClass();
                            d14 = 1000;
                        } else {
                            l3.a aVar8 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.A)).floatValue();
                            aVar8.getClass();
                            d14 = 453.592d;
                        }
                        iFloatValue = (int) (dFloatValue * d14);
                    }
                } else if (h1Var.f167989b != s21.s.MAINTAIN_WEIGHT) {
                    k42.b.f102880a.getClass();
                    if (k42.b.l() == 0) {
                        l3.a aVar9 = l3.f23124b;
                        dFloatValue = ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
                        aVar9.getClass();
                        d14 = 1000;
                    } else {
                        l3.a aVar10 = l3.f23124b;
                        dFloatValue = ((Number) p13.h0.b0(v21.d.A)).floatValue();
                        aVar10.getClass();
                        d14 = 453.592d;
                    }
                    iFloatValue = (int) (dFloatValue * d14);
                }
                int i110 = iFloatValue;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                if (aVar != null) {
                    aVar2 = null;
                } else {
                    aVar2 = null;
                }
                num3 = h1Var.f167996i;
                if (num3 != null) {
                    num4 = null;
                } else {
                    num4 = null;
                }
                o0.this.A4(i18, i19, i110, sVar2, string2, o0Var.E4(), aVar2, num2, num4);
            } else {
                String string3 = fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString();
                int i111 = h1Var.f167990c;
                f14 = h1Var.f167992e;
                int i112 = h1Var.f167991d;
                s21.s sVar3 = h1Var.f167989b;
                if (f14 == null) {
                    if (h1Var.f167989b != s21.s.MAINTAIN_WEIGHT) {
                        k42.b.f102880a.getClass();
                        if (k42.b.l() == 0) {
                            l3.a aVar11 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
                            aVar11.getClass();
                            d14 = 1000;
                        } else {
                            l3.a aVar12 = l3.f23124b;
                            dFloatValue = ((Number) p13.h0.b0(v21.d.A)).floatValue();
                            aVar12.getClass();
                            d14 = 453.592d;
                        }
                        iFloatValue = (int) (dFloatValue * d14);
                    }
                } else if (h1Var.f167989b != s21.s.MAINTAIN_WEIGHT) {
                    k42.b.f102880a.getClass();
                    if (k42.b.l() == 0) {
                        l3.a aVar13 = l3.f23124b;
                        dFloatValue = ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
                        aVar13.getClass();
                        d14 = 1000;
                    } else {
                        l3.a aVar14 = l3.f23124b;
                        dFloatValue = ((Number) p13.h0.b0(v21.d.A)).floatValue();
                        aVar14.getClass();
                        d14 = 453.592d;
                    }
                    iFloatValue = (int) (dFloatValue * d14);
                }
                int i113 = iFloatValue;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                if (aVar != null) {
                    aVar2 = null;
                } else {
                    aVar2 = null;
                }
                num3 = h1Var.f167996i;
                if (num3 != null) {
                    num4 = null;
                } else {
                    num4 = null;
                }
                o0.this.A4(i111, i112, i113, sVar3, string3, o0Var.E4(), aVar2, num2, num4);
            }
            return Unit.INSTANCE;
        }
    }

    public o0(h1 h1Var, m01.g gVar, p01.a aVar, s01.f fVar, v01.r0 r0Var) {
        i53.c cVarB;
        i53.c cVarB2;
        h1Var.getClass();
        gVar.getClass();
        aVar.getClass();
        fVar.getClass();
        r0Var.getClass();
        this.f168056a = h1Var;
        this.f168057b = gVar;
        this.f168058c = aVar;
        this.f168059d = fVar;
        this.f168060e = r0Var;
        s21.s sVar = h1Var.f167989b;
        s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
        if (sVar == sVar2) {
            cVarB = j53.l.b();
        } else {
            k42.b.f102880a.getClass();
            cVarB = k42.b.l() == 0 ? v21.d.f175322z : v21.d.A;
        }
        p2 p2VarA = q2.a(new s21.x(false, null, null, null, null, null, null, null, F4(), cVarB, true, null, fVar.e(), 2303, null));
        this.f168062g = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        if (sVar == sVar2) {
            cVarB2 = j53.l.b();
        } else {
            k42.b.f102880a.getClass();
            cVarB2 = k42.b.l() == 0 ? v21.d.f175322z : v21.d.A;
        }
        this.f168063h = r53.s.K(vVar, aVarA, m2Var, new s21.x(false, null, null, null, null, null, null, null, F4(), cVarB2, true, null, false, 6399, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r1 == r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r1 == r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        if (r1 == r5) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(o0 o0Var, v13.c cVar) {
        r0 r0Var;
        Object value;
        Object value2;
        Object value3;
        p2 p2Var = o0Var.f168062g;
        h1 h1Var = o0Var.f168056a;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f168111c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r0Var.f168111c = i14 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(o0Var, cVar);
            }
        } else {
            r0Var = new r0(o0Var, cVar);
        }
        Object objB4 = r0Var.f168109a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = r0Var.f168111c;
        if (i15 == 0) {
            o13.r.b(objB4);
            v21.f fVar = v21.f.f175333a;
            Integer num = h1Var.f167993f;
            s21.a aVar = h1Var.f167994g;
            fVar.getClass();
            if (v21.f.s(num) && aVar == s21.a.CUSTOM_ACTIVE_CALORIES) {
                r0Var.f168111c = 1;
                objB4 = o0Var.B4(r0Var);
            } else if (v21.f.s(h1Var.f167993f) && aVar == s21.a.ACTIVE_CALORIES) {
                r0Var.f168111c = 2;
                objB4 = o0Var.B4(r0Var);
            } else {
                l01.a aVar2 = h1Var.f167995h;
                if (aVar2 == null || aVar2 == l01.a.UNKNOWN) {
                    aVar2 = null;
                }
                if (aVar2 == null || aVar != s21.a.ACTIVITY_MULTIPLIER) {
                    r0Var.f168111c = 4;
                    Object objB5 = o0Var.B4(r0Var);
                    if (objB5 != obj) {
                        return objB5;
                    }
                } else {
                    r0Var.f168111c = 3;
                    objB4 = o0Var.B4(r0Var);
                }
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objB4);
            u21.b bVar = (u21.b) objB4;
            Integer num2 = bVar.f167898a;
            boolean z14 = bVar.f167899b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, (num2 == null || !z14) ? null : num2, h1Var.f167993f, s21.a.CUSTOM_ACTIVE_CALORIES, null, null, 0.0f, false, null, 7111)));
            return new u21.b(h1Var.f167993f, true, null);
        }
        if (i15 == 2) {
            o13.r.b(objB4);
            u21.b bVar2 = (u21.b) objB4;
            Integer num3 = bVar2.f167898a;
            boolean z15 = bVar2.f167899b;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, s21.x.a((s21.x) value2, null, null, (num3 == null || !z15) ? null : num3, null, s21.a.ACTIVE_CALORIES, null, null, 0.0f, false, null, 7127)));
            return new u21.b(h1Var.f167993f, true, null);
        }
        if (i15 != 3) {
            if (i15 == 4) {
                o13.r.b(objB4);
                return objB4;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objB4);
        u21.b bVar3 = (u21.b) objB4;
        Integer num4 = bVar3.f167898a;
        boolean z16 = bVar3.f167899b;
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, s21.x.a((s21.x) value3, null, null, (num4 == null || !z16) ? null : num4, null, s21.a.ACTIVITY_MULTIPLIER, h1Var.f167995h, null, 0.0f, false, null, 7063)));
        return new u21.b(null, false, h1Var.f167995h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(o0 o0Var, v13.c cVar) {
        s0 s0Var;
        s21.o oVar;
        s21.o oVar2;
        p2 p2Var;
        Object value;
        o0Var.getClass();
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f168130c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f168130c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(o0Var, cVar);
            }
        } else {
            s0Var = new s0(o0Var, cVar);
        }
        Object objC4 = s0Var.f168128a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f168130c;
        if (i15 == 0) {
            o13.r.b(objC4);
            if (!o0Var.f168059d.e()) {
                return Unit.INSTANCE;
            }
            oVar = o0Var.f168056a.f167998k;
            if (oVar == null) {
                s0Var.f168130c = 1;
                objC4 = o0Var.C4(s0Var);
                if (objC4 == obj) {
                    return obj;
                }
            }
            oVar2 = oVar;
            p2Var = o0Var.f168062g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, false, oVar2, 6143)));
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC4);
        oVar = (s21.o) objC4;
        oVar2 = oVar;
        p2Var = o0Var.f168062g;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, false, oVar2, 6143)));
        return Unit.INSTANCE;
    }

    public static s21.g z4(int i14, int i15, int i16, int i17) {
        v21.f.f175333a.getClass();
        return new s21.g(new s21.f(v21.f.a(i14, i15, 4.0d), i15), new s21.f(v21.f.a(i14, i16, 9.0d), i16), new s21.f(v21.f.a(i14, i17, 4.0d), i17));
    }

    public final void A4(int i14, int i15, int i16, s21.s sVar, String str, l01.i iVar, l01.a aVar, Integer num, Integer num2) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168062g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, true, null, 7167)));
        ge1.b.T(v1.a(this), null, null, new b(i14, i15, num, aVar, sVar, i16, num2, iVar, str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object B4(v13.c cVar) {
        p0 p0Var;
        Object value;
        Object value2;
        Object value3;
        Double d14;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f168099c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f168099c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objA = p0Var.f168097a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f168099c;
        p2 p2Var = this.f168062g;
        if (i15 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, true, null, 7167)));
            b63.o.Companion companion = b63.o.INSTANCE;
            b63.o oVarD = g22.l.d(companion);
            b63.i.INSTANCE.getClass();
            DateTime dateTimeAtStartOfDay = g22.l.h(b63.q.c(oVarD, 27, b63.i.f16190d)).toDateTimeAtStartOfDay();
            DateTime dateTimeAtStartOfDay2 = g22.l.h(g22.l.d(companion)).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            dateTimeAtStartOfDay2.getClass();
            p0Var.f168099c = 1;
            objA = this.f168058c.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, p0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, s21.x.a((s21.x) value2, null, null, null, null, null, null, null, 0.0f, false, null, 7167)));
            return new u21.b(null, false, t0.f168148a);
        }
        q01.a aVar2 = (q01.a) ((v2.b) v2Var).f47386a;
        Integer num = (aVar2 == null || (d14 = aVar2.f141980a) == null) ? null : new Integer((int) d14.doubleValue());
        boolean z14 = (aVar2 != null ? aVar2.f141981b : 0) >= 21;
        v21.f.f175333a.getClass();
        boolean z15 = v21.f.s(num) && z14;
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, s21.x.a((s21.x) value3, null, null, z15 ? num : null, null, z15 ? s21.a.ACTIVE_CALORIES : s21.a.ACTIVITY_MULTIPLIER, null, null, 0.0f, false, null, 7127)));
        return new u21.b(num, z15, t0.f168148a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object C4(v13.c cVar) {
        q0 q0Var;
        Object value;
        Object value2;
        Object value3;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f168105c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f168105c = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objA = q0Var.f168103a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f168105c;
        p2 p2Var = this.f168062g;
        if (i15 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, true, null, 7167)));
            q0Var.f168105c = 1;
            objA = this.f168060e.a(q0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, s21.x.a((s21.x) value3, null, null, null, null, null, null, null, 0.0f, false, null, 7167)));
            return (s21.o) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, s21.x.a((s21.x) value2, null, null, null, null, null, null, null, 0.0f, false, null, 7167)));
        return null;
    }

    public final o13.p<l01.a, Integer> D4() {
        s21.x xVar = (s21.x) this.f168062g.getValue();
        s21.a aVar = xVar.f156197f;
        Integer num = xVar.f156195d;
        Integer num2 = xVar.f156196e;
        int i14 = a.f168064a[aVar.ordinal()];
        if (i14 == 1) {
            v21.f.f175333a.getClass();
            return v21.f.s(num) ? new o13.p<>(null, num) : new o13.p<>(t0.f168148a, null);
        }
        if (i14 == 2) {
            return new o13.p<>(xVar.f156198g, null);
        }
        if (i14 == 3) {
            v21.f.f175333a.getClass();
            return v21.f.s(num2) ? new o13.p<>(null, num2) : new o13.p<>(t0.f168148a, null);
        }
        lc.u0.r();
        return null;
    }

    public final l01.i E4() {
        s21.f fVar;
        s21.f fVar2;
        s21.f fVar3;
        s21.g gVar = ((s21.x) this.f168062g.getValue()).f156194c;
        Double dValueOf = Double.valueOf((gVar == null || (fVar3 = gVar.f156117c) == null) ? 40 : fVar3.f156105b);
        int i14 = 30;
        Double dValueOf2 = Double.valueOf((gVar == null || (fVar2 = gVar.f156116b) == null) ? 30 : fVar2.f156105b);
        if (gVar != null && (fVar = gVar.f156115a) != null) {
            i14 = fVar.f156105b;
        }
        return new l01.i(dValueOf, dValueOf2, Double.valueOf(i14));
    }

    public final float F4() {
        h1 h1Var = this.f168056a;
        s21.s sVar = h1Var.f167989b;
        Float f14 = h1Var.f167992e;
        if (sVar == s21.s.MAINTAIN_WEIGHT) {
            return 0.0f;
        }
        k42.b.f102880a.getClass();
        if (k42.b.l() != 0) {
            if (f14 == null || f14.floatValue() <= 0.0f) {
                return ((Number) p13.h0.b0(v21.d.A)).floatValue();
            }
            l3.a aVar = l3.f23124b;
            double dFloatValue = f14.floatValue();
            aVar.getClass();
            v21.f fVar = v21.f.f175333a;
            i53.f<Float> fVar2 = v21.d.A;
            fVar.getClass();
            return v21.f.l((float) (dFloatValue / 453.592d), fVar2);
        }
        if (f14 == null || f14.floatValue() <= 0.0f) {
            return ((Number) p13.h0.b0(v21.d.f175322z)).floatValue();
        }
        l3.a aVar2 = l3.f23124b;
        double dFloatValue2 = f14.floatValue();
        aVar2.getClass();
        double dP1 = l3.a.P1(dFloatValue2);
        v21.f fVar3 = v21.f.f175333a;
        i53.f<Float> fVar4 = v21.d.f175322z;
        fVar3.getClass();
        return v21.f.l((float) dP1, fVar4);
    }

    public final Integer G4() {
        Integer num = ((s21.x) this.f168062g.getValue()).f156193b;
        if (num == null || !this.f168061f) {
            return null;
        }
        return num;
    }
}
