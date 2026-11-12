package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljg2/d;", "<anonymous>", "(Lo53/b0;)Ljg2/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivitySessionTypeProviderImpl$getValueEstimationSessionInfo$2", f = "LiveActivitySessionTypeProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e4 extends v13.i implements e23.p<o53.b0, t13.d<? super jg2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4 f104049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f104050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, long j8, t13.d<? super e4> dVar) {
        super(2, dVar);
        this.f104049a = g4Var;
        this.f104050b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e4(this.f104049a, this.f104050b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super jg2.d> dVar) {
        return ((e4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return this.f104049a.f104089c.f().get(new Long(this.f104050b));
    }
}
