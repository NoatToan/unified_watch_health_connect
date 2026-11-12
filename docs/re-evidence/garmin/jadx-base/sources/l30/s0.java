package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/f;", "newState", "", "<anonymous>", "(Ln30/f;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$updateCourseType$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<n30.f, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z zVar, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f109626b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s0 s0Var = new s0(this.f109626b, dVar);
        s0Var.f109625a = obj;
        return s0Var;
    }

    @Override // e23.p
    public final Object invoke(n30.f fVar, t13.d<? super Unit> dVar) {
        return ((s0) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n30.f fVar = (n30.f) this.f109625a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f109626b.f109668w.k(null, n30.f.a(fVar, false, null, false, null, null, null, 0, false, null, null, 2031));
        return Unit.INSTANCE;
    }
}
