package x40;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La50/g;", "data", "", "<anonymous>", "(La50/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$addClimbToCourse$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<a50.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l0 l0Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f188786b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f188786b, dVar);
        sVar.f188785a = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(a50.g gVar, t13.d<? super Unit> dVar) {
        return ((s) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a50.g gVar = (a50.g) this.f188785a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188786b;
        if (gVar == null) {
            l0Var.D4(new a50.e.s0(((a50.g) l0Var.F.getValue()).f1397h));
        } else {
            l0Var.L4(gVar);
        }
        return Unit.INSTANCE;
    }
}
