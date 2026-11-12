package k90;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import c22.e1;
import c22.g1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ll90/f;", "<anonymous>", "(Lo53/b0;)Ll90/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDeviceScanUnavailableReasonUseCase$invoke$2", f = "GetDeviceScanUnavailableReasonUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super l90.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f103505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l90.b f103506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, l90.b bVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f103505b = l0Var;
        this.f103506c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f103505b, this.f103506c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l90.f> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        e1.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103504a;
        l90.b bVar = this.f103506c;
        l0 l0Var = this.f103505b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (l0Var.f103579c.b(false) != l90.e.GRANTED) {
                return l90.f.PERMISSION_REQUIRED;
            }
            if (!hb2.i.a(l0Var.f103578b)) {
                return l90.f.NO_INTERNET;
            }
            this.f103504a = 1;
            obj = ge1.b.e0(l0Var.f103580d, new k0(bVar, l0Var, null), this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return l90.f.TRU_SWING_ALREADY_PAIRED;
        }
        if (bVar.f111518c) {
            Context context = l0Var.f103578b;
            if (BluetoothAdapter.getDefaultAdapter() != null) {
                try {
                    BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
                    if (bluetoothManager != null && bluetoothManager.getAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                        g1.f23058a = new g1();
                    }
                    aVar = g1.f23058a == null ? e1.a.SYSTEM_FEATURE_NULL : null;
                } catch (Throwable unused) {
                    aVar = e1.a.SYSTEM_FEATURE_NULL;
                }
            } else {
                aVar = e1.a.ADAPTER_NULL;
            }
            if (aVar != null) {
                return l90.f.NO_BLE_SUPPORT;
            }
        }
        if (e1.a()) {
            return null;
        }
        return l90.f.NO_BLUETOOTH_SUPPORT;
    }
}
