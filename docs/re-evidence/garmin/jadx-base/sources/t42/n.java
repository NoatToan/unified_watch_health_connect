package t42;

import e2.i0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q42.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.components.WeightDailyTimelineChartKt$WeightDailyTimelineChart$1$1", f = "WeightDailyTimelineChart.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f162362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<l42.d> f162363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l42.d f162364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f162365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f162366e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.components.WeightDailyTimelineChartKt$WeightDailyTimelineChart$1$1$1", f = "WeightDailyTimelineChart.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<l42.d> f162368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l42.d f162369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f162370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y f162371e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends l42.d> list, l42.d dVar, i0 i0Var, y yVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f162368b = list;
            this.f162369c = dVar;
            this.f162370d = i0Var;
            this.f162371e = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f162368b, this.f162369c, this.f162370d, this.f162371e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f162367a;
            if (i14 == 0) {
                o13.r.b(obj);
                int iIndexOf = this.f162368b.indexOf(this.f162369c);
                if (iIndexOf != -1) {
                    this.f162367a = 1;
                    if (i0.f(this.f162370d, iIndexOf, this) == aVar) {
                        return aVar;
                    }
                } else {
                    t60.a aVar2 = y.f142744q;
                    this.f162371e.B4(l42.d.WEIGHT);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(b0 b0Var, List<? extends l42.d> list, l42.d dVar, i0 i0Var, y yVar, t13.d<? super n> dVar2) {
        super(2, dVar2);
        this.f162362a = b0Var;
        this.f162363b = list;
        this.f162364c = dVar;
        this.f162365d = i0Var;
        this.f162366e = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f162362a, this.f162363b, this.f162364c, this.f162365d, this.f162366e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f162362a, null, null, new a(this.f162363b, this.f162364c, this.f162365d, this.f162366e, null), 3);
        return Unit.INSTANCE;
    }
}
