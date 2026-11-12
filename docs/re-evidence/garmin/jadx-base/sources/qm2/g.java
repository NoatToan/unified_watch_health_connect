package qm2;

import android.bluetooth.BluetoothDevice;
import java.util.TimerTask;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqm2/g;", "Ljava/util/TimerTask;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f145709a;

    public g(b bVar) {
        this.f145709a = bVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        b bVar = this.f145709a;
        b.a aVar = b.A;
        bVar.getClass();
        try {
            synchronized (bVar.f145661f) {
                try {
                    bVar.b();
                    BluetoothDevice bluetoothDevice = bVar.f145670o;
                    if (bluetoothDevice != null && bluetoothDevice.getType() != 2) {
                        b.B.debug("removeBond");
                        bluetoothDevice.getClass().getMethod("removeBond", null).invoke(bluetoothDevice, null);
                        bVar.f145665j = true;
                        bluetoothDevice.createBond();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Exception e4) {
            b.B.error("Failed to remove bond", (Throwable) e4);
        }
    }
}
