package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Le50/d;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshAllData$4", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.q<r53.j<? super e50.d>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f16095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(e23.a<Unit> aVar, t13.d<? super w0> dVar) {
        super(3, dVar);
        this.f16095a = aVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super e50.d> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new w0(this.f16095a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        e23.a<Unit> aVar2 = this.f16095a;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return Unit.INSTANCE;
    }
}
