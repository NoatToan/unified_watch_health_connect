package k50;

import e23.p;
import k30.u;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lk30/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapViewModel$fetchCourseData$1", f = "CourseMapViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<j<? super u>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f102920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f102920a = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f102920a, dVar);
    }

    @Override // e23.p
    public final Object invoke(j<? super u> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f102920a.f102925a;
        p2Var.k(null, m50.c.a((m50.c) p2Var.getValue(), true, null, null, 6));
        return Unit.INSTANCE;
    }
}
