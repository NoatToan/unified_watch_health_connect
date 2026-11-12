package bd0;

import com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity$pairDevice$1", f = "CustomerGUIDMismatchActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomerGUIDMismatchActivity f17598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CustomerGUIDMismatchActivity customerGUIDMismatchActivity, long j8, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f17598a = customerGUIDMismatchActivity;
        this.f17599b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f17598a, this.f17599b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CustomerGUIDMismatchActivity customerGUIDMismatchActivity = this.f17598a;
        customerGUIDMismatchActivity.showProgressOverlay();
        long j8 = this.f17599b;
        CustomerGUIDMismatchActivity.da(customerGUIDMismatchActivity, j8);
        CustomerGUIDMismatchActivity.ca(customerGUIDMismatchActivity, j8, new p(customerGUIDMismatchActivity, 0));
        return Unit.INSTANCE;
    }
}
