package k90;

import android.bluetooth.BluetoothDevice;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BtcDeviceDiscoveryFilterImpl$filterDevice$2", f = "BtcDeviceDiscoveryFilterImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f103590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f103591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BluetoothDevice bluetoothDevice, o oVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f103590c = bluetoothDevice;
        this.f103591d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f103590c, this.f103591d, dVar);
        pVar.f103589b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f103589b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103588a;
        BluetoothDevice bluetoothDevice = this.f103590c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (bluetoothDevice.getType() == 3) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strG = v.e0.g("Device [", bluetoothDevice.getName(), ",", bluetoothDevice.getAddress(), "] is DEVICE_TYPE_DUAL, filtering out");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceTypeDiscoveryFilter", strG);
                return Boolean.FALSE;
            }
            String name = bluetoothDevice.getName();
            if (name == null || d53.w.J(name)) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                String strE = c22.t.e(bluetoothDevice.getType(), "Device [", bluetoothDevice.getAddress(), ",", "] has no name, filtering out");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "DeviceTypeDiscoveryFilter", strE);
                return Boolean.FALSE;
            }
            String address = bluetoothDevice.getAddress();
            if (address == null || d53.w.J(address)) {
                a2 a2Var3 = a2.DEVICE_SETUP;
                String strE2 = c22.t.e(bluetoothDevice.getType(), "Device [", bluetoothDevice.getName(), ",", "] has no mac address, filtering out");
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "DeviceTypeDiscoveryFilter", strE2);
                return Boolean.FALSE;
            }
            int i15 = o.f103585c;
            o oVar = this.f103591d;
            oVar.getClass();
            if (bluetoothDevice.getBondState() == 12) {
                i0 i0Var = oVar.f103586a;
                this.f103589b = b0Var;
                this.f103588a = 1;
                obj = ge1.b.e0(i0Var.f103499b, new h0(i0Var, bluetoothDevice, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.TRUE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        if (((Boolean) obj).booleanValue()) {
            a2 a2Var4 = a2.DEVICE_SETUP;
            String name2 = bluetoothDevice.getName();
            String address2 = bluetoothDevice.getAddress();
            String strQ = am.j.q(p6.b.i("Device [", name2, ",", address2, ","), bluetoothDevice.getType(), "] already bonded and paired, filtering out");
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "DeviceTypeDiscoveryFilter", strQ);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
