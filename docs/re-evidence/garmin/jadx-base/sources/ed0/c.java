package ed0;

import android.bluetooth.BluetoothDevice;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$createDeviceBond$2", f = "DeviceSharingUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f63849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f63849a = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f63849a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        an2.a aVarA = a.a(a.f63825a);
        aVarA.getClass();
        String str = this.f63849a;
        str.getClass();
        try {
            BluetoothDevice bluetoothDeviceC = aVarA.f4495b.c(str);
            if (bluetoothDeviceC != null) {
                an2.a.d.a(an2.a.f4492e).debug("attempting to create system bond for ".concat(str));
                bluetoothDeviceC.createBond();
                z14 = true;
            } else {
                z14 = false;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z14);
    }
}
