package x40;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw20/a;", "newCourseData", "", "<anonymous>", "(Lw20/a;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$updateCourseType$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<w20.a, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(l0 l0Var, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f188773b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p1 p1Var = new p1(this.f188773b, dVar);
        p1Var.f188772a = obj;
        return p1Var;
    }

    @Override // e23.p
    public final Object invoke(w20.a aVar, t13.d<? super Unit> dVar) {
        return ((p1) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w20.a aVar = (w20.a) this.f188772a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188773b;
        l0Var.L4(a50.g.a((a50.g) l0Var.F.getValue(), false, null, false, aVar, false, null, null, null, 0, false, false, false, false, null, null, 65511));
        return Unit.INSTANCE;
    }
}
