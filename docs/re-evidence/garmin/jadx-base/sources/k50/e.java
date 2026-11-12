package k50;

import e23.q;
import k30.u;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lk30/u;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapViewModel$fetchCourseData$3", f = "CourseMapViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends i implements q<j<? super u>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f102924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(3, dVar);
        this.f102924a = fVar;
    }

    @Override // e23.q
    public final Object invoke(j<? super u> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new e(this.f102924a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f102924a.f102925a;
        p2Var.k(null, m50.c.a((m50.c) p2Var.getValue(), false, null, null, 6));
        return Unit.INSTANCE;
    }
}
