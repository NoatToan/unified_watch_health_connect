package k11;

import c2.n0;
import c2.n3;
import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.f0;
import h5.e0;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.pc;
import i3.v2;
import ii0.i0;
import java.util.ArrayList;
import java.util.Iterator;
import l72.c1;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.FoodDetailsScreenKt$FoodDetailsScreen$6$1", f = "FoodDetailsScreen.kt", l = {113, 118, 130}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l11.a.d f102228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<b63.o, b11.i.a, Unit> f102229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.p<String, Boolean, Unit> f102230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l11.a.b f102231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fe f102232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f102233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f102234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e23.p<b63.o, b11.i, Unit> f102235i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f102236j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f102237k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l11.a f102238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l11.a.d dVar, e23.p<? super b63.o, ? super b11.i.a, Unit> pVar, e23.p<? super String, ? super Boolean, Unit> pVar2, l11.a.b bVar, fe feVar, String str, String str2, e23.p<? super b63.o, ? super b11.i, Unit> pVar3, e23.a<Unit> aVar, String str3, l11.a aVar2, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f102228b = dVar;
            this.f102229c = pVar;
            this.f102230d = pVar2;
            this.f102231e = bVar;
            this.f102232f = feVar;
            this.f102233g = str;
            this.f102234h = str2;
            this.f102235i = pVar3;
            this.f102236j = aVar;
            this.f102237k = str3;
            this.f102238l = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f102228b, this.f102229c, this.f102230d, this.f102231e, this.f102232f, this.f102233g, this.f102234h, this.f102235i, this.f102236j, this.f102237k, this.f102238l, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (i3.fe.b(r14.f102232f, r14.f102233g, null, null, r14, 14) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        
            if (i3.fe.b(r5.f102232f, r5.f102234h, null, null, r5, 14) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
        
            if (i3.fe.b(r5.f102232f, r5.f102237k, null, null, r5, 14) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            b11.i.a aVar2;
            b11.d dVar;
            b11.i.a aVar3;
            b11.d dVar2;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f102227a;
            String str = null;
            if (i14 == 0) {
                o13.r.b(obj);
                l11.a.d dVar3 = this.f102228b;
                if (dVar3 instanceof l11.a.d.j) {
                    l11.a.d.j jVar = (l11.a.d.j) dVar3;
                    this.f102229c.invoke(jVar.f108106a, jVar.f108107b);
                    Unit unit = Unit.INSTANCE;
                } else {
                    boolean z14 = dVar3 instanceof l11.a.d.C2076d;
                    l11.a.b bVar = this.f102231e;
                    e23.p<String, Boolean, Unit> pVar = this.f102230d;
                    if (z14) {
                        if (bVar != null && (aVar3 = bVar.f108075a) != null && (dVar2 = aVar3.f14301g) != null) {
                            str = dVar2.f14253a;
                        }
                        pVar.invoke(str, Boolean.TRUE);
                        this.f102227a = 1;
                    } else {
                        aVar = this;
                        if (dVar3 instanceof l11.a.d.l) {
                            if (bVar != null && (aVar2 = bVar.f108075a) != null && (dVar = aVar2.f14301g) != null) {
                                str = dVar.f14253a;
                            }
                            pVar.invoke(str, Boolean.FALSE);
                            aVar.f102227a = 2;
                        } else if (dVar3 instanceof l11.a.d.b) {
                            l11.a.d.b bVar2 = (l11.a.d.b) dVar3;
                            aVar.f102235i.invoke(bVar2.f108097a, bVar2.f108098b);
                            Unit unit2 = Unit.INSTANCE;
                        } else if (dVar3 instanceof l11.a.d.C2075a) {
                            aVar.f102236j.invoke();
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            if (dVar3 instanceof l11.a.d.e) {
                                aVar.f102227a = 3;
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                }
            } else if (i14 == 1 || i14 == 2) {
                o13.r.b(obj);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
                aVar.f102238l.f108073x.setValue(l11.a.d.h.f108104a);
                Unit unit5 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<b11.s, Unit> {
        public b(Object obj) {
            super(1, obj, l11.a.class, "updateNutritionUnit", "updateNutritionUnit(Lcom/garmin/android/apps/connectmobile/nutrition/presentation/common/model/NutritionContentUIModel;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(b11.s sVar) {
            b11.s sVar2 = sVar;
            sVar2.getClass();
            l11.a aVar = (l11.a) this.receiver;
            aVar.getClass();
            p2 p2Var = aVar.f108064m;
            l11.a.b bVar = (l11.a.b) p2Var.getValue();
            if (bVar != null) {
                p2Var.k(null, l11.a.b.a(bVar, b11.i.a.i(bVar.f108075a, null, 0.0d, false, 0L, null, sVar2, null, 895), null, false, 62));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<a11.r, Unit> {
        public c(Object obj) {
            super(1, obj, e01.a.class, "setLastServingQtyInputType", "setLastServingQtyInputType(Lcom/garmin/android/apps/connectmobile/nutrition/presentation/common/composable/dialog/FractionInputDialogTab;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(a11.r rVar) {
            a11.r rVar2 = rVar;
            rVar2.getClass();
            ((e01.a) this.receiver).A(rVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<Double, Unit> {
        public d(Object obj) {
            super(1, obj, l11.a.class, "updateServingAmount", "updateServingAmount(D)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Double d14) {
            l11.a.d dVar;
            double dDoubleValue = d14.doubleValue();
            l11.a aVar = (l11.a) this.receiver;
            p2 p2Var = aVar.f108064m;
            l11.a.b bVar = (l11.a.b) p2Var.getValue();
            if (bVar != null) {
                p2 p2Var2 = aVar.f108073x;
                j11.c cVar = aVar.f108054c;
                j11.c cVar2 = j11.c.RECIPE;
                if (cVar != cVar2 || (0.001d <= dDoubleValue && dDoubleValue <= 99999.999d)) {
                    dVar = (cVar == cVar2 || (0.0d <= dDoubleValue && dDoubleValue <= 99999.999d)) ? l11.a.d.h.f108104a : l11.a.d.f.f108102a;
                } else {
                    dVar = l11.a.d.k.f108108a;
                }
                p2Var2.setValue(dVar);
                p2Var.k(null, l11.a.b.a(bVar, b11.i.a.i(bVar.f108075a, null, dDoubleValue, false, 0L, null, null, null, 1015), null, false, 62));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.FoodDetailsScreenKt$FoodDetailsScreen$9$1$7$1$1", f = "FoodDetailsScreen.kt", l = {260}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f102240b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f102240b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f102240b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f102239a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f102239a = 1;
                if (this.f102240b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.FoodDetailsScreenKt$ReportIssueSection$1$1", f = "FoodDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f102241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f102242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z14, p1<Boolean> p1Var, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f102241a = z14;
            this.f102242b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f102241a, this.f102242b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f102241a) {
                this.f102242b.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.FoodDetailsScreenKt$ReportIssueSection$3$1$1", f = "FoodDetailsScreen.kt", l = {594}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f102244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f102245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(fe feVar, String str, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f102244b = feVar;
            this.f102245c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f102244b, this.f102245c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f102243a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f102243a = 1;
                if (fe.b(this.f102244b, this.f102245c, null, null, this, 14) == aVar) {
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

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102246a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102246a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:107:0x017a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0186  */
    /* JADX WARN: Code duplicated, block: B:111:0x0189  */
    /* JADX WARN: Code duplicated, block: B:113:0x0192  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01da  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0283  */
    /* JADX WARN: Code duplicated, block: B:128:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x0293  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02db  */
    /* JADX WARN: Code duplicated, block: B:153:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x0431  */
    /* JADX WARN: Code duplicated, block: B:167:0x0446  */
    /* JADX WARN: Code duplicated, block: B:169:0x0476  */
    /* JADX WARN: Code duplicated, block: B:172:0x047b  */
    /* JADX WARN: Code duplicated, block: B:173:0x047d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0493  */
    /* JADX WARN: Code duplicated, block: B:178:0x0495  */
    /* JADX WARN: Code duplicated, block: B:181:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:194:0x0509  */
    /* JADX WARN: Code duplicated, block: B:197:0x051c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0531  */
    /* JADX WARN: Code duplicated, block: B:201:0x0547  */
    /* JADX WARN: Code duplicated, block: B:204:0x0559  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r1v52, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r37v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r5v24, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r5v26, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(l11.a aVar, v21.e eVar, e01.a aVar2, fe feVar, e23.p<? super b63.o, ? super b11.i.a, Unit> pVar, e23.p<? super b63.o, ? super b11.i, Unit> pVar2, e23.p<? super String, ? super Boolean, Unit> pVar3, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p<? super b63.o, ? super b11.i, Unit> pVar4;
        e23.p<? super String, ? super Boolean, Unit> pVar5;
        int i17;
        e23.a<Unit> aVar6;
        int i18;
        int i19;
        e23.a<Unit> aVar7;
        int i24;
        boolean z14;
        l11.a aVar8;
        v21.e eVar2;
        e01.a aVar9;
        e23.a<Unit> aVar10;
        e23.a<Unit> aVar11;
        e23.p<? super b63.o, ? super b11.i, Unit> pVar6;
        ?? r14;
        p3.p2 p2VarI0;
        int i25;
        p3.m.a aVar12;
        Object objQ;
        p3.m.a.C2565a c2565a;
        int i26;
        v21.e eVar3;
        Object objQ2;
        e01.a aVar13;
        int i27;
        e23.p<? super b63.o, ? super b11.i, Unit> pVar7;
        e23.a<Unit> aVar14;
        v21.e eVar4;
        e01.a aVar15;
        e23.p<? super b63.o, ? super b11.i, Unit> pVar8;
        e23.a<Unit> aVar16;
        e23.a<Unit> aVar17;
        Object objQ3;
        Object objQ4;
        Object objQ5;
        Object objQ6;
        Object obj;
        Object objQ7;
        p1 p1Var;
        Object objQ8;
        p1 p1Var2;
        l11.a.d dVar;
        l11.a.b bVar;
        String strQ;
        String strQ2;
        String strQ3;
        boolean z15;
        boolean z16;
        int i28;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zB;
        Object objQ9;
        o0 o0Var;
        l11.a.d dVar2;
        fe feVar2;
        l11.a.d dVar3;
        o0 o0Var2;
        Object objQ10;
        Object obj2;
        l11.a.d dVar4;
        p1 p1Var3;
        ?? r15;
        ?? r16;
        Object obj3;
        ?? r17;
        boolean zR;
        Object objQ11;
        Object obj4;
        p1 p1Var4;
        Object objQ12;
        boolean zR2;
        Object objQ13;
        Object obj5;
        int i29;
        ?? r18;
        Object objQ14;
        boolean zR3;
        Object objQ15;
        int i30;
        int i34;
        int i35;
        l11.a aVar18 = aVar;
        aVar18.getClass();
        feVar.getClass();
        pVar.getClass();
        pVar3.getClass();
        aVar5.getClass();
        o0 o0VarE = mVar.E(-385486550);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar18) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(feVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        int i36 = i15 & 32;
        if (i36 == 0) {
            if ((196608 & i14) == 0) {
                pVar4 = pVar2;
                i16 |= o0VarE.r(pVar4) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                pVar5 = pVar3;
                if (o0VarE.r(pVar5)) {
                    i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i35 = 524288;
                }
                i16 |= i35;
            } else {
                pVar5 = pVar3;
            }
            i17 = i15 & 128;
            if (i17 != 0) {
                i16 |= 12582912;
                aVar6 = aVar3;
            } else {
                aVar6 = aVar3;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar6)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 256;
            if (i19 != 0) {
                i16 |= 100663296;
                aVar7 = aVar4;
            } else {
                aVar7 = aVar4;
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(aVar7)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i16 |= i24;
                }
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(aVar5)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i16 |= i34;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                i25 = i14 & 1;
                aVar12 = p3.m.f135153a;
                if (i25 != 0 || o0VarE.o0()) {
                    objQ = o0VarE.q();
                    aVar12.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        i26 = 6;
                        objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        o0VarE.K(objQ);
                    } else {
                        i26 = 6;
                    }
                    eVar3 = (v21.e) objQ;
                    objQ2 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ2 == c2565a) {
                        objQ2 = (e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, i26, null);
                        o0VarE.K(objQ2);
                    }
                    aVar13 = (e01.a) objQ2;
                    i27 = i16 & (-1009);
                    if (i36 != 0) {
                        objQ5 = o0VarE.q();
                        aVar12.getClass();
                        if (objQ5 == c2565a) {
                            objQ5 = new k11.c((byte) 0, 5);
                            o0VarE.K(objQ5);
                        }
                        pVar7 = (e23.p) objQ5;
                    } else {
                        pVar7 = pVar4;
                    }
                    if (i17 != 0) {
                        objQ4 = o0VarE.q();
                        aVar12.getClass();
                        if (objQ4 == c2565a) {
                            objQ4 = new k01.a(7);
                            o0VarE.K(objQ4);
                        }
                        aVar14 = (e23.a) objQ4;
                    } else {
                        aVar14 = aVar6;
                    }
                    if (i19 != 0) {
                        objQ3 = o0VarE.q();
                        aVar12.getClass();
                        if (objQ3 == c2565a) {
                            objQ3 = new k01.a(8);
                            o0VarE.K(objQ3);
                        }
                        eVar4 = eVar3;
                        aVar15 = aVar13;
                        pVar8 = pVar7;
                        aVar16 = aVar14;
                        aVar17 = (e23.a) objQ3;
                    } else {
                        eVar4 = eVar3;
                        aVar15 = aVar13;
                        pVar8 = pVar7;
                        aVar16 = aVar14;
                        aVar17 = aVar7;
                    }
                } else {
                    o0VarE.e();
                    i27 = i16 & (-1009);
                    eVar4 = eVar;
                    aVar15 = aVar2;
                    aVar16 = aVar6;
                    aVar17 = aVar7;
                    pVar8 = pVar4;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ6 = o0VarE.q();
                aVar12.getClass();
                obj = p3.m.a.f135155b;
                if (objQ6 == obj) {
                    objQ6 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ6);
                }
                b0 b0Var = (b0) objQ6;
                objQ7 = o0VarE.q();
                if (objQ7 == obj) {
                    objQ7 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ7);
                }
                p1Var = (p1) objQ7;
                objQ8 = o0VarE.q();
                if (objQ8 == obj) {
                    objQ8 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ8);
                }
                p1Var2 = (p1) objQ8;
                dVar = (l11.a.d) s9.c.c(aVar18.f108074y, o0VarE).getF182175a();
                bVar = (l11.a.b) s9.c.c(aVar18.f108065n, o0VarE).getF182175a();
                b11.l lVar = (b11.l) s9.c.c(aVar18.f108067p, o0VarE).getF182175a();
                g21.u uVar = (g21.u) s9.c.c(aVar18.f108068q, o0VarE).getF182175a();
                b11.f fVar = (b11.f) s9.c.c(aVar18.f108069r, o0VarE).getF182175a();
                f0 f0Var = (f0) s9.c.c(aVar18.f108070t, o0VarE).getF182175a();
                i53.c cVar = (i53.c) s9.c.c(aVar18.f108071v, o0VarE).getF182175a();
                p1 p1VarC = s9.c.c(aVar18.f108072w, o0VarE);
                strQ = gl1.y.Q(o0VarE, R.string.generic_error_message);
                strQ2 = gl1.y.Q(o0VarE, R.string.food_added_to_favorites);
                strQ3 = gl1.y.Q(o0VarE, R.string.food_removed_from_favorites);
                boolean zB2 = o0VarE.B(dVar);
                if ((i27 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z24 = zB2 | z15;
                if ((3670016 & i27) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zR4 = z24 | z16 | o0VarE.r(bVar);
                i28 = i27;
                if ((i27 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB3 = z17 | zR4 | o0VarE.B(strQ2) | o0VarE.B(strQ3);
                if ((i28 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z25 = zB3 | z18;
                if ((i28 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zB = z25 | z19 | o0VarE.B(strQ) | o0VarE.r(aVar18);
                objQ9 = o0VarE.q();
                if (!zB || objQ9 == obj) {
                    o0Var = o0VarE;
                    a aVar19 = new a(dVar, pVar, pVar5, bVar, feVar, strQ2, strQ3, pVar8, aVar17, strQ, aVar18, null);
                    dVar2 = dVar;
                    bVar = bVar;
                    feVar2 = feVar;
                    aVar18 = aVar18;
                    o0Var.K(aVar19);
                    objQ9 = aVar19;
                } else {
                    dVar2 = dVar;
                    feVar2 = feVar;
                    o0Var = o0VarE;
                }
                l0.e((e23.p) objQ9, dVar2, o0Var);
                z3.e eVarC = z3.f.c(486935109, new jt1.m(aVar5, aVar18, dVar2), o0Var);
                z3.e eVarC2 = z3.f.c(14937700, new ak0.o(feVar2, 17), o0Var);
                n0 n0Var = n3.f22788a;
                l11.a.b bVar2 = bVar;
                o0 o0Var3 = o0Var;
                e01.a aVar20 = aVar15;
                e23.a<Unit> aVar21 = aVar16;
                v21.e eVar5 = eVar4;
                dVar3 = dVar2;
                z02.d.a(dVar2 instanceof l11.a.d.i, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(-1401054527, new i0(bVar2, mcVarF, eVar5, aVar18, aVar20, dVar2, lVar, cVar, b0Var, fVar, f0Var, uVar, aVar21, p1Var, p1Var2, p1VarC), o0Var3), o0Var3, 197040, 8);
                o0Var2 = o0Var3;
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ10 = o0Var2.q();
                if (objQ10 == obj) {
                    objQ10 = new jt1.h(p1Var, 21);
                    o0Var2.K(objQ10);
                }
                f(zBooleanValue, (e23.a) objQ10, feVar, bVar2, aVar, o0Var2, ((i28 >> 3) & 896) | 48 | ((i28 << 12) & 57344));
                if (dVar3 instanceof l11.a.d.c) {
                    o0Var2.C(723060123);
                    c1 c1Var = c1.f110940a;
                    String strQ4 = gl1.y.Q(o0Var2, R.string.pregnancy_something_went_wrong);
                    String strQ5 = gl1.y.Q(o0Var2, R.string.connect_iq_try_again);
                    String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_ok);
                    zR3 = o0Var2.r(aVar);
                    objQ15 = o0Var2.q();
                    if (!zR3 || objQ15 == obj) {
                        i30 = 0;
                        objQ15 = new k11.f(aVar, i30);
                        o0Var2.K(objQ15);
                    } else {
                        i30 = 0;
                    }
                    p1Var3 = p1Var2;
                    dVar4 = dVar3;
                    obj2 = obj;
                    ?? r19 = i30;
                    c1Var.a(true, strQ4, strQ5, null, null, strQ6, false, false, (e23.a) objQ15, null, null, o0Var2, 6, 0, 1752);
                    ?? r24 = o0Var2;
                    r24.g0(r19);
                    r15 = r19;
                    r16 = r24;
                } else {
                    obj2 = obj;
                    dVar4 = dVar3;
                    p1Var3 = p1Var2;
                    r15 = 0;
                    o0Var2.C(723426264);
                    o0Var2.g0(false);
                    r16 = o0Var2;
                }
                if (dVar4 instanceof l11.a.d.g) {
                    r16.C(723516257);
                    ?? r25 = c1.f110940a;
                    String strQ7 = gl1.y.Q(r16, R.string.pregnancy_something_went_wrong);
                    String strQ8 = gl1.y.Q(r16, R.string.connect_iq_try_again);
                    String strQ9 = gl1.y.Q(r16, R.string.lbl_ok);
                    String strQ10 = gl1.y.Q(r16, R.string.lbl_cancel);
                    zR2 = r16.r(aVar);
                    objQ13 = r16.q();
                    if (zR2) {
                        obj5 = obj2;
                    } else {
                        obj5 = obj2;
                        if (objQ13 == obj5) {
                            i29 = 1;
                        }
                        e23.a aVar22 = (e23.a) objQ13;
                        if ((i28 & 1879048192) == 536870912) {
                            r18 = i29;
                        } else {
                            r18 = r15;
                        }
                        objQ14 = r16.q();
                        if (r18 == 0 || objQ14 == obj5) {
                            objQ14 = new j22.d(aVar5, 17);
                            r16.K(objQ14);
                        }
                        ?? r37 = r16;
                        obj3 = obj5;
                        r25.a(true, strQ7, strQ8, null, null, strQ9, false, false, aVar22, strQ10, (e23.a) objQ14, r37, 6, 0, 216);
                        ?? r26 = r37;
                        r26.g0(r15);
                        r17 = r26;
                    }
                    i29 = 1;
                    objQ13 = new k11.f(aVar, i29);
                    r16.K(objQ13);
                    e23.a aVar23 = (e23.a) objQ13;
                    if ((i28 & 1879048192) == 536870912) {
                        r18 = i29;
                    } else {
                        r18 = r15;
                    }
                    objQ14 = r16.q();
                    if (r18 == 0) {
                        objQ14 = new j22.d(aVar5, 17);
                        r16.K(objQ14);
                    } else {
                        objQ14 = new j22.d(aVar5, 17);
                        r16.K(objQ14);
                    }
                    ?? r38 = r16;
                    obj3 = obj5;
                    r25.a(true, strQ7, strQ8, null, null, strQ9, false, false, aVar23, strQ10, (e23.a) objQ14, r38, 6, 0, 216);
                    ?? r27 = r38;
                    r27.g0(r15);
                    r17 = r27;
                } else {
                    obj3 = obj2;
                    r16.C(724005592);
                    r16.g0(r15);
                    r17 = r16;
                }
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    r17.C(724051658);
                    c22.i iVarB = c22.i.b(R.string.delete_custom_food);
                    c22.i iVarB2 = c22.i.b(R.string.delete_food_this_cannot_be_undone);
                    aVar8 = aVar;
                    zR = r17.r(aVar8);
                    objQ11 = r17.q();
                    obj4 = obj3;
                    if (!zR || objQ11 == obj4) {
                        p1Var4 = p1Var3;
                        objQ11 = new k11.h((int) r15, aVar8, p1Var4);
                        r17.K(objQ11);
                    } else {
                        p1Var4 = p1Var3;
                    }
                    e23.a aVar24 = (e23.a) objQ11;
                    objQ12 = r17.q();
                    if (objQ12 == obj4) {
                        objQ12 = new jt1.h(p1Var4, 20);
                        r17.K(objQ12);
                    }
                    o53.f0.c(iVarB, iVarB2, aVar24, (e23.a) objQ12, r17, 3072);
                    r17.g0(r15);
                } else {
                    aVar8 = aVar;
                    r17.C(724434136);
                    r17.g0(r15);
                }
                pVar6 = pVar8;
                aVar11 = aVar17;
                eVar2 = eVar5;
                aVar9 = aVar20;
                aVar10 = aVar21;
                r14 = r17;
            } else {
                o0 o0Var4 = o0VarE;
                aVar8 = aVar18;
                o0Var4.e();
                eVar2 = eVar;
                aVar9 = aVar2;
                aVar10 = aVar6;
                aVar11 = aVar7;
                pVar6 = pVar4;
                r14 = o0Var4;
            }
            p2VarI0 = r14.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new j(aVar8, eVar2, aVar9, feVar, pVar, pVar6, pVar3, aVar10, aVar11, aVar5, i14, i15, 0);
            }
        }
        i16 |= 196608;
        pVar4 = pVar2;
        if ((1572864 & i14) == 0) {
            pVar5 = pVar3;
            if (o0VarE.r(pVar5)) {
                i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i35 = 524288;
            }
            i16 |= i35;
        } else {
            pVar5 = pVar3;
        }
        i17 = i15 & 128;
        if (i17 != 0) {
            i16 |= 12582912;
            aVar6 = aVar3;
        } else {
            aVar6 = aVar3;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar6)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 256;
        if (i19 != 0) {
            i16 |= 100663296;
            aVar7 = aVar4;
        } else {
            aVar7 = aVar4;
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar7)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i16 |= i24;
            }
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(aVar5)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i16 |= i34;
        }
        if ((i16 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            i25 = i14 & 1;
            aVar12 = p3.m.f135153a;
            if (i25 != 0) {
                objQ = o0VarE.q();
                aVar12.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    i26 = 6;
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                } else {
                    i26 = 6;
                }
                eVar3 = (v21.e) objQ;
                objQ2 = o0VarE.q();
                aVar12.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = (e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, i26, null);
                    o0VarE.K(objQ2);
                }
                aVar13 = (e01.a) objQ2;
                i27 = i16 & (-1009);
                if (i36 != 0) {
                    objQ5 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ5 == c2565a) {
                        objQ5 = new k11.c((byte) 0, 5);
                        o0VarE.K(objQ5);
                    }
                    pVar7 = (e23.p) objQ5;
                } else {
                    pVar7 = pVar4;
                }
                if (i17 != 0) {
                    objQ4 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ4 == c2565a) {
                        objQ4 = new k01.a(7);
                        o0VarE.K(objQ4);
                    }
                    aVar14 = (e23.a) objQ4;
                } else {
                    aVar14 = aVar6;
                }
                if (i19 != 0) {
                    objQ3 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ3 == c2565a) {
                        objQ3 = new k01.a(8);
                        o0VarE.K(objQ3);
                    }
                    eVar4 = eVar3;
                    aVar15 = aVar13;
                    pVar8 = pVar7;
                    aVar16 = aVar14;
                    aVar17 = (e23.a) objQ3;
                } else {
                    eVar4 = eVar3;
                    aVar15 = aVar13;
                    pVar8 = pVar7;
                    aVar16 = aVar14;
                    aVar17 = aVar7;
                }
            } else {
                objQ = o0VarE.q();
                aVar12.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    i26 = 6;
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                } else {
                    i26 = 6;
                }
                eVar3 = (v21.e) objQ;
                objQ2 = o0VarE.q();
                aVar12.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = (e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, i26, null);
                    o0VarE.K(objQ2);
                }
                aVar13 = (e01.a) objQ2;
                i27 = i16 & (-1009);
                if (i36 != 0) {
                    objQ5 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ5 == c2565a) {
                        objQ5 = new k11.c((byte) 0, 5);
                        o0VarE.K(objQ5);
                    }
                    pVar7 = (e23.p) objQ5;
                } else {
                    pVar7 = pVar4;
                }
                if (i17 != 0) {
                    objQ4 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ4 == c2565a) {
                        objQ4 = new k01.a(7);
                        o0VarE.K(objQ4);
                    }
                    aVar14 = (e23.a) objQ4;
                } else {
                    aVar14 = aVar6;
                }
                if (i19 != 0) {
                    objQ3 = o0VarE.q();
                    aVar12.getClass();
                    if (objQ3 == c2565a) {
                        objQ3 = new k01.a(8);
                        o0VarE.K(objQ3);
                    }
                    eVar4 = eVar3;
                    aVar15 = aVar13;
                    pVar8 = pVar7;
                    aVar16 = aVar14;
                    aVar17 = (e23.a) objQ3;
                } else {
                    eVar4 = eVar3;
                    aVar15 = aVar13;
                    pVar8 = pVar7;
                    aVar16 = aVar14;
                    aVar17 = aVar7;
                }
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            mc mcVarF2 = e9.f(true, null, o0VarE, 6, 2);
            objQ6 = o0VarE.q();
            aVar12.getClass();
            obj = p3.m.a.f135155b;
            if (objQ6 == obj) {
                objQ6 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ6);
            }
            b0 b0Var2 = (b0) objQ6;
            objQ7 = o0VarE.q();
            if (objQ7 == obj) {
                objQ7 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            p1Var = (p1) objQ7;
            objQ8 = o0VarE.q();
            if (objQ8 == obj) {
                objQ8 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ8);
            }
            p1Var2 = (p1) objQ8;
            dVar = (l11.a.d) s9.c.c(aVar18.f108074y, o0VarE).getF182175a();
            bVar = (l11.a.b) s9.c.c(aVar18.f108065n, o0VarE).getF182175a();
            b11.l lVar2 = (b11.l) s9.c.c(aVar18.f108067p, o0VarE).getF182175a();
            g21.u uVar2 = (g21.u) s9.c.c(aVar18.f108068q, o0VarE).getF182175a();
            b11.f fVar2 = (b11.f) s9.c.c(aVar18.f108069r, o0VarE).getF182175a();
            f0 f0Var2 = (f0) s9.c.c(aVar18.f108070t, o0VarE).getF182175a();
            i53.c cVar2 = (i53.c) s9.c.c(aVar18.f108071v, o0VarE).getF182175a();
            p1 p1VarC2 = s9.c.c(aVar18.f108072w, o0VarE);
            strQ = gl1.y.Q(o0VarE, R.string.generic_error_message);
            strQ2 = gl1.y.Q(o0VarE, R.string.food_added_to_favorites);
            strQ3 = gl1.y.Q(o0VarE, R.string.food_removed_from_favorites);
            boolean zB4 = o0VarE.B(dVar);
            if ((i27 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z26 = zB4 | z15;
            if ((3670016 & i27) == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zR5 = z26 | z16 | o0VarE.r(bVar);
            i28 = i27;
            if ((i27 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zB5 = z17 | zR5 | o0VarE.B(strQ2) | o0VarE.B(strQ3);
            if ((i28 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z27 = zB5 | z18;
            if ((i28 & 234881024) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            zB = z27 | z19 | o0VarE.B(strQ) | o0VarE.r(aVar18);
            objQ9 = o0VarE.q();
            if (zB) {
                o0Var = o0VarE;
                a aVar110 = new a(dVar, pVar, pVar5, bVar, feVar, strQ2, strQ3, pVar8, aVar17, strQ, aVar18, null);
                dVar2 = dVar;
                bVar = bVar;
                feVar2 = feVar;
                aVar18 = aVar18;
                o0Var.K(aVar110);
                objQ9 = aVar110;
            } else {
                o0Var = o0VarE;
                a aVar111 = new a(dVar, pVar, pVar5, bVar, feVar, strQ2, strQ3, pVar8, aVar17, strQ, aVar18, null);
                dVar2 = dVar;
                bVar = bVar;
                feVar2 = feVar;
                aVar18 = aVar18;
                o0Var.K(aVar111);
                objQ9 = aVar111;
            }
            l0.e((e23.p) objQ9, dVar2, o0Var);
            z3.e eVarC3 = z3.f.c(486935109, new jt1.m(aVar5, aVar18, dVar2), o0Var);
            z3.e eVarC4 = z3.f.c(14937700, new ak0.o(feVar2, 17), o0Var);
            n0 n0Var2 = n3.f22788a;
            l11.a.b bVar3 = bVar;
            o0 o0Var5 = o0Var;
            e01.a aVar25 = aVar15;
            e23.a<Unit> aVar26 = aVar16;
            v21.e eVar6 = eVar4;
            dVar3 = dVar2;
            z02.d.a(dVar2 instanceof l11.a.d.i, eVarC3, eVarC4, null, new n0(0, 0, 0, 0), z3.f.c(-1401054527, new i0(bVar3, mcVarF2, eVar6, aVar18, aVar25, dVar2, lVar2, cVar2, b0Var2, fVar2, f0Var2, uVar2, aVar26, p1Var, p1Var2, p1VarC2), o0Var5), o0Var5, 197040, 8);
            o0Var2 = o0Var5;
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ10 = o0Var2.q();
            if (objQ10 == obj) {
                objQ10 = new jt1.h(p1Var, 21);
                o0Var2.K(objQ10);
            }
            f(zBooleanValue2, (e23.a) objQ10, feVar, bVar3, aVar, o0Var2, ((i28 >> 3) & 896) | 48 | ((i28 << 12) & 57344));
            if (dVar3 instanceof l11.a.d.c) {
                o0Var2.C(723060123);
                c1 c1Var2 = c1.f110940a;
                String strQ11 = gl1.y.Q(o0Var2, R.string.pregnancy_something_went_wrong);
                String strQ12 = gl1.y.Q(o0Var2, R.string.connect_iq_try_again);
                String strQ13 = gl1.y.Q(o0Var2, R.string.lbl_ok);
                zR3 = o0Var2.r(aVar);
                objQ15 = o0Var2.q();
                if (zR3) {
                    i30 = 0;
                    objQ15 = new k11.f(aVar, i30);
                    o0Var2.K(objQ15);
                } else {
                    i30 = 0;
                    objQ15 = new k11.f(aVar, i30);
                    o0Var2.K(objQ15);
                }
                p1Var3 = p1Var2;
                dVar4 = dVar3;
                obj2 = obj;
                ?? r110 = i30;
                c1Var2.a(true, strQ11, strQ12, null, null, strQ13, false, false, (e23.a) objQ15, null, null, o0Var2, 6, 0, 1752);
                ?? r28 = o0Var2;
                r28.g0(r110);
                r15 = r110;
                r16 = r28;
            } else {
                obj2 = obj;
                dVar4 = dVar3;
                p1Var3 = p1Var2;
                r15 = 0;
                o0Var2.C(723426264);
                o0Var2.g0(false);
                r16 = o0Var2;
            }
            if (dVar4 instanceof l11.a.d.g) {
                r16.C(723516257);
                ?? r29 = c1.f110940a;
                String strQ14 = gl1.y.Q(r16, R.string.pregnancy_something_went_wrong);
                String strQ15 = gl1.y.Q(r16, R.string.connect_iq_try_again);
                String strQ16 = gl1.y.Q(r16, R.string.lbl_ok);
                String strQ17 = gl1.y.Q(r16, R.string.lbl_cancel);
                zR2 = r16.r(aVar);
                objQ13 = r16.q();
                if (zR2) {
                    obj5 = obj2;
                    if (objQ13 == obj5) {
                        i29 = 1;
                    }
                    e23.a aVar27 = (e23.a) objQ13;
                    if ((i28 & 1879048192) == 536870912) {
                        r18 = i29;
                    } else {
                        r18 = r15;
                    }
                    objQ14 = r16.q();
                    if (r18 == 0) {
                        objQ14 = new j22.d(aVar5, 17);
                        r16.K(objQ14);
                    } else {
                        objQ14 = new j22.d(aVar5, 17);
                        r16.K(objQ14);
                    }
                    ?? r39 = r16;
                    obj3 = obj5;
                    r29.a(true, strQ14, strQ15, null, null, strQ16, false, false, aVar27, strQ17, (e23.a) objQ14, r39, 6, 0, 216);
                    ?? r210 = r39;
                    r210.g0(r15);
                    r17 = r210;
                } else {
                    obj5 = obj2;
                }
                i29 = 1;
                objQ13 = new k11.f(aVar, i29);
                r16.K(objQ13);
                e23.a aVar28 = (e23.a) objQ13;
                if ((i28 & 1879048192) == 536870912) {
                    r18 = i29;
                } else {
                    r18 = r15;
                }
                objQ14 = r16.q();
                if (r18 == 0) {
                    objQ14 = new j22.d(aVar5, 17);
                    r16.K(objQ14);
                } else {
                    objQ14 = new j22.d(aVar5, 17);
                    r16.K(objQ14);
                }
                ?? r310 = r16;
                obj3 = obj5;
                r29.a(true, strQ14, strQ15, null, null, strQ16, false, false, aVar28, strQ17, (e23.a) objQ14, r310, 6, 0, 216);
                ?? r211 = r310;
                r211.g0(r15);
                r17 = r211;
            } else {
                obj3 = obj2;
                r16.C(724005592);
                r16.g0(r15);
                r17 = r16;
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                r17.C(724051658);
                c22.i iVarB3 = c22.i.b(R.string.delete_custom_food);
                c22.i iVarB4 = c22.i.b(R.string.delete_food_this_cannot_be_undone);
                aVar8 = aVar;
                zR = r17.r(aVar8);
                objQ11 = r17.q();
                obj4 = obj3;
                if (zR) {
                    p1Var4 = p1Var3;
                    objQ11 = new k11.h((int) r15, aVar8, p1Var4);
                    r17.K(objQ11);
                } else {
                    p1Var4 = p1Var3;
                    objQ11 = new k11.h((int) r15, aVar8, p1Var4);
                    r17.K(objQ11);
                }
                e23.a aVar29 = (e23.a) objQ11;
                objQ12 = r17.q();
                if (objQ12 == obj4) {
                    objQ12 = new jt1.h(p1Var4, 20);
                    r17.K(objQ12);
                }
                o53.f0.c(iVarB3, iVarB4, aVar29, (e23.a) objQ12, r17, 3072);
                r17.g0(r15);
            } else {
                aVar8 = aVar;
                r17.C(724434136);
                r17.g0(r15);
            }
            pVar6 = pVar8;
            aVar11 = aVar17;
            eVar2 = eVar6;
            aVar9 = aVar25;
            aVar10 = aVar26;
            r14 = r17;
        } else {
            o0 o0Var6 = o0VarE;
            aVar8 = aVar18;
            o0Var6.e();
            eVar2 = eVar;
            aVar9 = aVar2;
            aVar10 = aVar6;
            aVar11 = aVar7;
            pVar6 = pVar4;
            r14 = o0Var6;
        }
        p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(aVar8, eVar2, aVar9, feVar, pVar, pVar6, pVar3, aVar10, aVar11, aVar5, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    public static final void b(l11.a aVar, b11.i.a aVar2, e23.a<Unit> aVar3, e23.l<? super Boolean, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        boolean z14 = aVar2.f14303i;
        aVar3.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1138152316);
        int i15 = 2;
        int i16 = 4;
        int i17 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            g01.u uVar = aVar2.f14301g.f14257e;
            boolean z15 = uVar == g01.u.FATSECRET;
            l11.a.c cVar = aVar.f108055d;
            boolean z16 = cVar instanceof l11.a.c.b;
            int i18 = 3;
            p3.m.a aVar4 = p3.m.f135153a;
            if (z16) {
                o0VarE.C(2071552301);
                boolean z17 = aVar2.f14299e;
                boolean z18 = !z14;
                boolean zR = o0VarE.r(aVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new k11.g(aVar, i18);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k11.g(aVar, i18);
                        o0VarE.K(objQ);
                    }
                }
                e23.l lVar3 = (e23.l) objQ;
                boolean zR2 = o0VarE.r(aVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new k11.f(aVar, i15);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new k11.f(aVar, i15);
                        o0VarE.K(objQ2);
                    }
                }
                e(z17, z18, z15, lVar, lVar3, (e23.a) objQ2, o0VarE, 3072);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else if ((cVar instanceof l11.a.c.C2073a) && ((l11.a.c.C2073a) cVar).f108087g && uVar == g01.u.GARMIN && !z14) {
                o0VarE.C(1452316645);
                boolean z19 = aVar2.f14299e;
                boolean zR3 = o0VarE.r(aVar);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new k11.g(aVar, i16);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new k11.g(aVar, i16);
                        o0VarE.K(objQ3);
                    }
                }
                c(z19, aVar3, (e23.l) objQ3, lVar2, o0VarE, (i17 >> 3) & 7280);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1452328038);
                boolean z24 = aVar2.f14299e;
                boolean z25 = (z14 || aVar.f108054c == j11.c.PHOTO_RESULT || aVar.f108056e == i01.i.IMAGE_RECOGNITION) ? false : true;
                boolean zR4 = o0VarE.r(aVar);
                Object objQ4 = o0VarE.q();
                if (zR4) {
                    objQ4 = new k11.g(aVar, 5);
                    o0VarE.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new k11.g(aVar, 5);
                        o0VarE.K(objQ4);
                    }
                }
                d(z24, z25, z15, (e23.l) objQ4, lVar, o0VarE, 24576);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(aVar, aVar2, aVar3, lVar, lVar2, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z14, e23.a<Unit> aVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1973259286);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            i11.o.a(((i15 >> 3) & 112) | (i15 & 14), lVar, null, o0VarE, z14);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new v2(p1Var, 18);
                o0VarE.K(objQ2);
            }
            i11.n.a(zBooleanValue, (e23.l) objQ2, z3.f.c(2019399426, new i(aVar, p1Var, lVar2, 0), o0VarE), null, o0VarE, 432);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(z14, aVar, lVar, lVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(boolean z14, boolean z15, boolean z16, e23.l<? super Boolean, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1152916136);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z16) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            if (z15) {
                o0VarE.C(-328636078);
                i11.o.a(((i15 >> 6) & 112) | (i15 & 14), lVar, null, o0VarE, z14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-328505382);
                o0VarE.g0(false);
            }
            if (z16) {
                o0VarE.C(-328458014);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new v2(p1Var, 19);
                    o0VarE.K(objQ2);
                }
                i11.n.a(zBooleanValue, (e23.l) objQ2, z3.f.c(1721968230, new k(lVar2, p1Var, i16), o0VarE), null, o0VarE, 432);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-327881414);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(z14, z15, z16, lVar, lVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(boolean z14, boolean z15, boolean z16, e23.l<? super Boolean, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.l<? super Boolean, Unit> lVar3;
        o0 o0VarE = mVar.E(-968070747);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z15) {
                o0VarE.C(755744189);
                i11.o.a(((i15 >> 9) & 112) | (i15 & 14), lVar2, null, o0VarE, z14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(755894105);
                o0VarE.g0(false);
            }
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new v2(p1Var, 17);
                o0VarE.K(objQ2);
            }
            lVar3 = lVar;
            i11.n.a(zBooleanValue, (e23.l) objQ2, z3.f.c(-796694727, new h21.m(aVar, z16, lVar3, p1Var), o0VarE), null, o0VarE, 432);
            o0VarE.g0(true);
        } else {
            lVar3 = lVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.i(z14, z15, z16, lVar3, lVar2, aVar, i14);
        }
    }

    public static final void f(boolean z14, e23.a<Unit> aVar, fe feVar, l11.a.b bVar, l11.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1887689364);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new v2(p1Var, 14);
                o0VarE.K(objQ3);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ3, o0VarE, 54, 0);
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean z15 = (i15 & 14) == 4;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new f(z14, p1Var, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, boolValueOf, o0VarE);
            if (!z14 || bVar == null) {
                o0VarE.C(-2144505802);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2145241928);
                b11.i.a aVar3 = bVar.f108075a;
                b11.d dVar = aVar3.f14301g;
                String str = dVar.f14258f;
                String str2 = dVar.f14253a;
                String str3 = aVar3.f14302h.f14372a;
                l11.a.c cVar = aVar2.f108055d;
                l11.a.c.C2073a c2073a = cVar instanceof l11.a.c.C2073a ? (l11.a.c.C2073a) cVar : null;
                l11.h hVar = new l11.h(str, str2, str3, c2073a != null ? c2073a.f108088h : null);
                boolean z16 = (i15 & 112) == 32;
                Object objQ5 = o0VarE.q();
                if (z16 || objQ5 == c2565a) {
                    objQ5 = new a11.a0(aVar, p1Var, 19);
                    o0VarE.K(objQ5);
                }
                e23.a aVar4 = (e23.a) objQ5;
                boolean zR = o0VarE.r(b0Var) | ((i15 & 896) == 256);
                Object objQ6 = o0VarE.q();
                if (zR || objQ6 == c2565a) {
                    objQ6 = new jt1.d(6, b0Var, feVar);
                    o0VarE.K(objQ6);
                }
                s.a(mcVarF, hVar, null, aVar4, (e23.l) objQ6, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, aVar, feVar, bVar, aVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(b11.i.a aVar, v21.e eVar, l11.a.b bVar, e23.l<? super b11.s, Unit> lVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        p1 p1Var;
        l11.a.b bVar2 = bVar;
        e23.l<? super b11.s, Unit> lVar2 = lVar;
        o0 o0VarE = mVar.E(-978456865);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(bVar2) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            i53.c<b11.s> cVar = bVar2.f108076b;
            if (cVar.size() == 1) {
                o0VarE.C(734939407);
                o0VarE.g0(false);
                aVar2 = null;
            } else {
                o0VarE.C(734966036);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new jt1.h(p1Var2, 18);
                    o0VarE.K(objQ2);
                }
                aVar2 = (e23.a) objQ2;
                o0VarE.g0(false);
            }
            e23.a<Unit> aVar3 = aVar2;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.serving_size);
            b11.s sVar = aVar.f14302h;
            b11.d dVar = aVar.f14301g;
            double d14 = sVar.f14374c;
            String strB = sVar.b(dVar.f14257e, d14, o0VarE, 0);
            eVar.getClass();
            l22.a aVar4 = eVar.f175325b;
            if (d14 != 1.0d) {
                strB = aVar4.a(R.string.string_space_string_pattern, v21.e.h(d14), strB);
            }
            p2Var.h(strQ, strB, null, null, null, false, false, null, null, null, aVar3, o0VarE, 0, 0, 1020);
            o0VarE = o0VarE;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(735459277);
                o0VarE.C(300819744);
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (b11.s sVar2 : cVar) {
                    double d15 = sVar2.f14374c;
                    String strB2 = sVar2.b(dVar.f14257e, 0.0d, o0VarE, 2);
                    if (d15 != 1.0d) {
                        strB2 = aVar4.a(R.string.string_space_string_pattern, v21.e.h(d15), strB2);
                    }
                    arrayList.add(strB2);
                }
                o0VarE.g0(false);
                i53.f fVarJ = i53.a.j(arrayList);
                Iterator<b11.s> it = cVar.iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i16 = -1;
                        break;
                    } else if (it.next().f14372a.equals(aVar.f14302h.f14372a)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = i16;
                String strQ2 = gl1.y.Q(o0VarE, R.string.serving_size);
                bVar2 = bVar;
                boolean zR = o0VarE.r(bVar2) | ((i15 & 7168) == 2048);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    lVar2 = lVar;
                    p1Var = p1Var2;
                    objQ3 = new gw1.d(bVar2, 29, lVar2, p1Var);
                    o0VarE.K(objQ3);
                } else {
                    lVar2 = lVar;
                    p1Var = p1Var2;
                }
                e23.l lVar3 = (e23.l) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new jt1.h(p1Var, 19);
                    o0VarE.K(objQ4);
                }
                a11.i0.a(strQ2, fVarJ, i17, null, null, lVar3, (e23.a) objQ4, o0VarE, 1572864);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                bVar2 = bVar;
                lVar2 = lVar;
                o0VarE.C(736310723);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(aVar, eVar, bVar2, lVar2, i14, 5);
        }
    }
}
