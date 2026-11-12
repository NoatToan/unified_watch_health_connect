package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw20/d;", "data", "", "<anonymous>", "(Lw20/d;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshPaceProData$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<w20.d, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p pVar, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f16098b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f16098b, dVar);
        x0Var.f16097a = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(w20.d dVar, t13.d<? super Unit> dVar2) {
        return ((x0) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w20.d dVar = (w20.d) this.f16097a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f16098b.f16041y;
        p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, false, null, null, dVar, null, false, false, false, null, null, 4063));
        return Unit.INSTANCE;
    }
}
