package sg0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$updateIncompleteConsents$1", f = "ManageChildViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f159129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f159130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(f0 f0Var, boolean z14, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f159129a = f0Var;
        this.f159130b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f159129a, this.f159130b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f0 f0Var = this.f159129a;
        p2 p2Var = f0Var.f159087f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, false, null, this.f159130b, false, false, null, null, 7935)));
        return Unit.INSTANCE;
    }
}
