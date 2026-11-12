package kd0;

import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lps/m;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lps/m;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl$getCachedActivityPolyline$2", f = "TrainingPlanDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k6 extends v13.i implements e23.p<o53.b0, t13.d<? super ps.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f104173a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(long j8, t13.d<? super k6> dVar) {
        super(2, dVar);
        this.f104173a = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k6(this.f104173a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ps.m> dVar) {
        return ((k6) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return CacheDatabase.i().e().e(this.f104173a);
    }
}
