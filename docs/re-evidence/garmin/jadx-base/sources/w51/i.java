package w51;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesNavigationKt$pendingActivityDetailsBySummary$1$1$1", f = "PendingActivitiesNavigation.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f182272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<String> f182273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f182274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lc.v vVar, x3<String> x3Var, q0 q0Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f182272a = vVar;
        this.f182273b = x3Var;
        this.f182274c = q0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f182272a, this.f182273b, this.f182274c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String f182175a = this.f182273b.getF182175a();
        if (f182175a != null) {
            this.f182274c.F4(f182175a);
        }
        this.f182272a.a().f(null, "activityTypeResultKey");
        return Unit.INSTANCE;
    }
}
