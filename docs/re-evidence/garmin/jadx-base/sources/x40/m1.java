package x40;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La50/g;", "data", "", "<anonymous>", "(La50/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$updateCoursePointList$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<a50.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a50.a f188758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l0 l0Var, a50.a aVar, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f188757b = l0Var;
        this.f188758c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m1 m1Var = new m1(this.f188757b, this.f188758c, dVar);
        m1Var.f188756a = obj;
        return m1Var;
    }

    @Override // e23.p
    public final Object invoke(a50.g gVar, t13.d<? super Unit> dVar) {
        return ((m1) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a50.g gVar = (a50.g) this.f188756a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188757b;
        p2 p2Var = l0Var.F;
        p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, gVar.f1393d, false, p13.h0.D0(((a50.g) l0Var.F.getValue()).f1396g, this.f188758c), null, null, 0, false, false, false, false, null, null, 65463));
        return Unit.INSTANCE;
    }
}
