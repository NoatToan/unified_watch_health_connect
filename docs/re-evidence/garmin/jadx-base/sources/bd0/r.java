package bd0;

import com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity$removeDevice$1", f = "CustomerGUIDMismatchActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomerGUIDMismatchActivity f17600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CustomerGUIDMismatchActivity customerGUIDMismatchActivity, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f17600a = customerGUIDMismatchActivity;
        this.f17601b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f17600a, this.f17601b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CustomerGUIDMismatchActivity customerGUIDMismatchActivity = this.f17600a;
        customerGUIDMismatchActivity.showProgressOverlay();
        long j8 = this.f17601b;
        CustomerGUIDMismatchActivity.da(customerGUIDMismatchActivity, j8);
        CustomerGUIDMismatchActivity.ca(customerGUIDMismatchActivity, j8, new p(customerGUIDMismatchActivity, 1));
        return Unit.INSTANCE;
    }
}
