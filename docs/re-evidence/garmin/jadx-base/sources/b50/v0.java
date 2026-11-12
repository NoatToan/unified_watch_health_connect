package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le50/d;", "value", "", "<anonymous>", "(Le50/d;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshAllData$3", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<e50.d, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(p pVar, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f16092b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v0 v0Var = new v0(this.f16092b, dVar);
        v0Var.f16091a = obj;
        return v0Var;
    }

    @Override // e23.p
    public final Object invoke(e50.d dVar, t13.d<? super Unit> dVar2) {
        return ((v0) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e50.d dVar = (e50.d) this.f16091a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f16092b;
        pVar.f16041y.setValue(dVar);
        if (!dVar.f62989a && dVar.f62992d == null) {
            pVar.z4(e50.b.v.f62973a);
        }
        return Unit.INSTANCE;
    }
}
