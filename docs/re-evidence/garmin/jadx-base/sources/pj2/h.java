package pj2;

import android.bluetooth.BluetoothGatt;
import com.garmin.device.ble.BleCommunicationException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public class h implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f138062a;

    public h(b bVar) {
        this.f138062a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws BleCommunicationException {
        b.e<Void> eVar;
        BluetoothGatt bluetoothGatt = this.f138062a.f138029o.get();
        b bVar = this.f138062a;
        if (bluetoothGatt == null) {
            bVar.f138015a.warn("Attempt to read characteristic with no BluetoothGatt.");
            throw new BleCommunicationException("Read failed", Integer.MIN_VALUE);
        }
        b.e<Void> eVar2 = new b.e<>(bVar.f138015a, "RequestMtu");
        synchronized (this.f138062a.f138019e) {
            try {
                eVar = j.e() ? this.f138062a.f138025k : null;
                if (eVar == null) {
                    this.f138062a.f138025k = eVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        b bVar2 = this.f138062a;
        if (eVar != null) {
            bVar2.f138015a.warn("Previous mtuResult already detected, skipping duplicate requestMtu");
            return eVar.a(5000L, true);
        }
        try {
            b.x(bVar2, new g(this, bluetoothGatt), null, "RequestMtu");
            return eVar2.a(!j.e() ? 30000 : 5000, false);
        } finally {
            this.f138062a.f138025k = null;
        }
    }
}
