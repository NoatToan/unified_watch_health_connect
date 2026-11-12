package r50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$editFinishDetails$1", f = "CoursePointListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f150468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g gVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f150468a = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f150468a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((w) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f150468a.f150432k;
        p2Var.k(null, t50.e.a((t50.e) p2Var.getValue(), true, false, null, null, 30));
        return Unit.INSTANCE;
    }
}
