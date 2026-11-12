package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ln30/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$refreshAllData$3", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.q<r53.j<? super n30.f>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f109575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(z zVar, t13.d<? super g0> dVar) {
        super(3, dVar);
        this.f109575a = zVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super n30.f> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new g0(this.f109575a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f109575a.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, 0, false, null, null, 2046));
        return Unit.INSTANCE;
    }
}
