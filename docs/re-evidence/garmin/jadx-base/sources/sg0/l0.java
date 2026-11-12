package sg0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$updateChild$1", f = "ManageChildViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f159115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ue0.l f159116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f0 f0Var, ue0.l lVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f159115a = f0Var;
        this.f159116b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f159115a, this.f159116b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Long userId;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = f0.f159081i;
        f0 f0Var = this.f159115a;
        f0Var.getClass();
        p2 p2Var = f0Var.f159087f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, new u(this.f159116b, null, null, null, null, false, null, false, false, false, false, null, null, 8190, null)));
        f0Var.f159082a.f(p2Var.getValue(), "MANAGE_CHILD_UI_STATE");
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, new u(this.f159116b, null, null, null, null, false, null, false, false, false, false, null, null, 7166, null)));
        ue0.l lVar = this.f159116b;
        if (lVar != null && (userId = lVar.getUserId()) != null) {
            long jLongValue = userId.longValue();
            ge1.b.T(v1.a(f0Var), null, null, new g0(f0Var, jLongValue, null), 3);
            ge1.b.T(v1.a(f0Var), null, null, new k0(f0Var, jLongValue, null), 3);
            f0Var.x4(jLongValue);
            ge1.b.T(v1.a(f0Var), null, null, new h0(f0Var, null), 3);
        }
        return Unit.INSTANCE;
    }
}
