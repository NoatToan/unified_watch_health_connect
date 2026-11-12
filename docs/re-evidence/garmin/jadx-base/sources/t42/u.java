package t42;

import e2.i0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q42.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.components.WeightWeeklyTimelineChartKt$WeightWeeklyTimelineChart$1$1", f = "WeightWeeklyTimelineChart.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f162381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<l42.d> f162382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l42.d f162383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f162384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f162385e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.components.WeightWeeklyTimelineChartKt$WeightWeeklyTimelineChart$1$1$1", f = "WeightWeeklyTimelineChart.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<l42.d> f162387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l42.d f162388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f162389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y f162390e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends l42.d> list, l42.d dVar, i0 i0Var, y yVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f162387b = list;
            this.f162388c = dVar;
            this.f162389d = i0Var;
            this.f162390e = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f162387b, this.f162388c, this.f162389d, this.f162390e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f162386a;
            if (i14 == 0) {
                o13.r.b(obj);
                int iIndexOf = this.f162387b.indexOf(this.f162388c);
                if (iIndexOf != -1) {
                    this.f162386a = 1;
                    if (i0.f(this.f162389d, iIndexOf, this) == aVar) {
                        return aVar;
                    }
                } else {
                    t60.a aVar2 = y.f142744q;
                    this.f162390e.B4(l42.d.WEIGHT);
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
    public u(b0 b0Var, List<? extends l42.d> list, l42.d dVar, i0 i0Var, y yVar, t13.d<? super u> dVar2) {
        super(2, dVar2);
        this.f162381a = b0Var;
        this.f162382b = list;
        this.f162383c = dVar;
        this.f162384d = i0Var;
        this.f162385e = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f162381a, this.f162382b, this.f162383c, this.f162384d, this.f162385e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f162381a, null, null, new a(this.f162382b, this.f162383c, this.f162384d, this.f162385e, null), 3);
        return Unit.INSTANCE;
    }
}
