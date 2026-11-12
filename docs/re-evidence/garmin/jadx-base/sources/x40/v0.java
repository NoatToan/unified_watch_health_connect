package x40;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$navigateToEditWaypoints$3", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.q<r53.j<? super List<? extends String>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f188800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l0 l0Var, t13.d<? super v0> dVar) {
        super(3, dVar);
        this.f188800a = l0Var;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super List<? extends String>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new v0(this.f188800a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f188800a.D4(new a50.e.h0(false));
        return Unit.INSTANCE;
    }
}
