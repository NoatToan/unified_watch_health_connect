package ta0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDetectionScreenKt$DeviceDetectionRoute$4$1", f = "DeviceDetectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f163449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l90.d f163450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, l90.d dVar, t13.d<? super v> dVar2) {
        super(2, dVar2);
        this.f163449a = xVar;
        this.f163450b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f163449a, this.f163450b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x xVar = this.f163449a;
        xVar.getClass();
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Starting all device types discovery");
        xVar.f163479y = ge1.b.T(v1.a(xVar), null, null, new c0(xVar, this.f163450b, null), 3);
        return Unit.INSTANCE;
    }
}
