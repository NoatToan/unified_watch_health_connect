package oj2;

import com.garmin.proto.generated.GDIDeviceStatus;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.garmin.device.batterystatus.BatteryStatusHandler$onBatteryStatusChangeNotification$1$1", f = "BatteryStatusHandler.kt", l = {}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.b f132400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification f132401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.b bVar, GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification, d<? super b> dVar) {
        super(2, dVar);
        this.f132400a = bVar;
        this.f132401b = remoteDeviceBatteryStatusChangedNotification;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f132400a, this.f132401b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            this.f132400a.a();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
