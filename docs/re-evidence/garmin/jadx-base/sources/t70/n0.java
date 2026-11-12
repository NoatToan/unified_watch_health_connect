package t70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditInFocusViewModel$handleActivityTrendAdded$1", f = "EditInFocusViewModel.kt", l = {247}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f162934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o70.c f162935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l0 l0Var, o70.c cVar, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f162934b = l0Var;
        this.f162935c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f162934b, this.f162935c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162933a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.o oVar = this.f162934b.f162905b;
            this.f162933a = 1;
            if (oVar.b(this.f162935c, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
