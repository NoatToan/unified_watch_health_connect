package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationNavKt$deviceCustomizationGraph$1$19$2$1", f = "DeviceCustomizationNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f26215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e23.a<Unit> aVar, p3.x3<Boolean> x3Var, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f26214b = aVar;
        this.f26215c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f26214b, this.f26215c, dVar);
        f0Var.f26213a = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f26215c.getF182175a().booleanValue()) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceCustomizationNav", "Customization complete and data saved successfully, finishing flow");
            this.f26214b.invoke();
        }
        return Unit.INSTANCE;
    }
}
