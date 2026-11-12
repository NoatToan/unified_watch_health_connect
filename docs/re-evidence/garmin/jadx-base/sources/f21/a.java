package f21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.composable.CaloriesChartChipsGroupKt$CaloriesChartChipsGroup$2$1", f = "CaloriesChartChipsGroup.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<g21.v> f68468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g21.v f68469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f68470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f68471d;

    /* JADX INFO: renamed from: f21.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.composable.CaloriesChartChipsGroupKt$CaloriesChartChipsGroup$2$1$1", f = "CaloriesChartChipsGroup.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class C1418a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f68473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f68474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1418a(e2.i0 i0Var, int i14, t13.d<? super C1418a> dVar) {
            super(2, dVar);
            this.f68473b = i0Var;
            this.f68474c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1418a(this.f68473b, this.f68474c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1418a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68472a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f68472a = 1;
                if (e2.i0.f(this.f68473b, this.f68474c, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends g21.v> list, g21.v vVar, o53.b0 b0Var, e2.i0 i0Var, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f68468a = list;
        this.f68469b = vVar;
        this.f68470c = b0Var;
        this.f68471d = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f68468a, this.f68469b, this.f68470c, this.f68471d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<g21.v> list = this.f68468a;
        int iIndexOf = list != null ? list.indexOf(this.f68469b) : -1;
        if (iIndexOf != -1) {
            ge1.b.T(this.f68470c, null, null, new C1418a(this.f68471d, iIndexOf, null), 3);
        }
        return Unit.INSTANCE;
    }
}
