package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/f;", "data", "", "<anonymous>", "(Ln30/f;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$updateCoursePointList$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<n30.f, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n30.g f109617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z zVar, n30.g gVar, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f109616b = zVar;
        this.f109617c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p0 p0Var = new p0(this.f109616b, this.f109617c, dVar);
        p0Var.f109615a = obj;
        return p0Var;
    }

    @Override // e23.p
    public final Object invoke(n30.f fVar, t13.d<? super Unit> dVar) {
        return ((p0) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n30.f fVar = (n30.f) this.f109615a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z zVar = this.f109616b;
        p2 p2Var = zVar.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, fVar.f123456d, p13.h0.D0(((n30.f) zVar.f109668w.getValue()).f123458f, this.f109617c), null, 0, false, null, null, 2007));
        return Unit.INSTANCE;
    }
}
