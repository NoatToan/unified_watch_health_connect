package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;

/* JADX INFO: loaded from: classes3.dex */
public class ovs extends bys {
    public jms U;

    public ovs(Context context, BluetoothDevice bluetoothDevice) {
        super(context, bluetoothDevice);
        this.U = null;
    }

    @Override // defpackage.bys
    public boolean g1() {
        return V() && this.U.E1();
    }

    @Override // defpackage.bys
    public void j1(long j, HMCallback<WeightSyncResult> hMCallback) {
        k1(this.U, j, hMCallback);
    }

    @Override // defpackage.bys
    public boolean l1(IOFMeasurementCallback iOFMeasurementCallback, boolean z) {
        return V() && this.U.B1(iOFMeasurementCallback, z);
    }

    @Override // defpackage.bys
    public boolean m1(kf kfVar) {
        return V() && this.U.A1(kfVar.a());
    }

    @Override // defpackage.bys
    public boolean o1(boolean z) {
        return V() && this.U.F1(z);
    }

    @Override // defpackage.bys, defpackage.n1t
    public yus q0(Context context, BluetoothDevice bluetoothDevice) {
        jms jmsVar = new jms(context, bluetoothDevice, this);
        this.U = jmsVar;
        jmsVar.y1(this);
        return this.U;
    }

    public ovs(Context context, String str) {
        super(context, str);
        this.U = null;
    }
}
