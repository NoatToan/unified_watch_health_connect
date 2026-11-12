package na2;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.gfdi.framework.DeviceManager;
import la2.g;

/* JADX INFO: loaded from: classes7.dex */
public class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceManager f125215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f125216b;

    public b(c cVar, DeviceManager deviceManager) {
        this.f125216b = cVar;
        this.f125215a = deviceManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g gVar;
        try {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (this.f125216b.f125217a.equals(bluetoothDevice == null ? null : bluetoothDevice.getAddress())) {
                this.f125215a.terminate();
                this.f125216b.f125219c.unregisterReceiver(this);
                c cVar = this.f125216b;
                synchronized (cVar.f125220d) {
                    gVar = cVar.f125222f;
                }
                if (gVar != null) {
                    gVar.e(cVar.f125217a, -2, null);
                }
            }
        } catch (Throwable th3) {
            this.f125216b.f125221e.error("Failed to notify disconnection", th3);
        }
    }
}
