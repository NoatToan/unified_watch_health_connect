package pm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes11.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f138641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm2.a f138642b;

    public a(rm2.a aVar) {
        this.f138642b = aVar;
    }

    public final void a(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
            if (!this.f138641a) {
                context.getApplicationContext().registerReceiver(this, intentFilter);
            }
        } finally {
            this.f138641a = true;
        }
    }

    public final void b(Context context) {
        if (this.f138641a) {
            context.getApplicationContext().unregisterReceiver(this);
            this.f138641a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public final void onReceive(Context context, Intent intent) {
        rm2.a aVar;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null || (aVar = this.f138642b) == null) {
            return;
        }
        switch (bluetoothDevice.getBondState()) {
            case 10:
            case 11:
                aVar.B(bluetoothDevice);
                break;
            case 12:
                aVar.j(bluetoothDevice);
                break;
        }
    }
}
