package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/f;", "newState", "", "<anonymous>", "(Ln30/f;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$undoState$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<n30.f, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(z zVar, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f109606b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f109606b, dVar);
        m0Var.f109605a = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(n30.f fVar, t13.d<? super Unit> dVar) {
        return ((m0) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n30.f fVar = (n30.f) this.f109605a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z zVar = this.f109606b;
        if (fVar != null) {
            zVar.f109668w.k(null, fVar);
        } else {
            zVar.z4(n30.c.f0.f123412a);
        }
        return Unit.INSTANCE;
    }
}
