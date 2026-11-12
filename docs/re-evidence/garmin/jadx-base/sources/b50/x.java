package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "it", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$deleteCourse$3", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.q<r53.j<? super v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p pVar, t13.d<? super x> dVar) {
        super(3, dVar);
        this.f16096a = pVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new x(this.f16096a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f16096a.f16041y;
        p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, false, null, null, null, null, false, false, false, null, null, 4092));
        return Unit.INSTANCE;
    }
}
