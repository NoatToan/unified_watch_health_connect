package r50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lk30/u;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$fetchCourseData$3", f = "CoursePointListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.q<r53.j<? super k30.u>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f150419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g gVar, t13.d<? super e0> dVar) {
        super(3, dVar);
        this.f150419a = gVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super k30.u> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new e0(this.f150419a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f150419a.f150432k;
        p2Var.k(null, t50.e.a((t50.e) p2Var.getValue(), false, false, null, null, 30));
        return Unit.INSTANCE;
    }
}
