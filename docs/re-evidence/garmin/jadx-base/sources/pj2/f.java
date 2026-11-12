package pj2;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.garmin.device.ble.BleCommunicationException;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public class f implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UUID f138056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f138057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f138058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f138059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f138060e;

    public f(b bVar, UUID uuid, UUID uuid2, int i14, byte[] bArr) {
        this.f138060e = bVar;
        this.f138056a = uuid;
        this.f138057b = uuid2;
        this.f138058c = i14;
        this.f138059d = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws BleCommunicationException {
        b bVar;
        BluetoothGatt bluetoothGatt = this.f138060e.f138029o.get();
        b bVar2 = this.f138060e;
        if (bluetoothGatt == null) {
            bVar2.f138015a.warn("Attempt to write characteristic with no BluetoothGatt.");
            throw new BleCommunicationException("Write failed", Integer.MIN_VALUE);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = bVar2.B(bluetoothGatt, this.f138056a, this.f138057b);
        if (bluetoothGattCharacteristicB == null) {
            throw new BleCommunicationException("Write failed: characteristic does not exist");
        }
        int i14 = (this.f138058c != 1 || (bluetoothGattCharacteristicB.getProperties() & 4) == 0) ? 2 : this.f138058c;
        b.e<Void> eVar = new b.e<>(this.f138060e.f138015a, "Write");
        synchronized (this.f138060e.f138019e) {
            bVar = this.f138060e;
            bVar.f138022h = eVar;
            bVar.f138020f = bluetoothGattCharacteristicB;
        }
        try {
            try {
                b.x(bVar, new e(this, i14, bluetoothGatt), bluetoothGattCharacteristicB, "Write");
                Void voidA = eVar.a(30000, true);
                this.f138060e.f138026l.set(0);
                synchronized (this.f138060e.f138019e) {
                    b bVar3 = this.f138060e;
                    bVar3.f138022h = null;
                    bVar3.f138020f = null;
                }
                return voidA;
            } catch (Exception e4) {
                if (this.f138060e.f138026l.incrementAndGet() >= 5) {
                    this.f138060e.f138015a.error("Multiple write failures. Resetting connection", (Throwable) e4);
                    b bVar4 = this.f138060e;
                    bVar4.z();
                    BluetoothGatt bluetoothGatt2 = bVar4.f138029o.get();
                    if (bluetoothGatt2 != null) {
                        try {
                            bluetoothGatt2.disconnect();
                        } catch (Exception e14) {
                            bVar4.f138015a.warn("Suppressing NPE in BT stack.", (Throwable) e14);
                        }
                    }
                }
                throw e4;
            }
        } catch (Throwable th3) {
            synchronized (this.f138060e.f138019e) {
                b bVar5 = this.f138060e;
                bVar5.f138022h = null;
                bVar5.f138020f = null;
                throw th3;
            }
        }
    }
}
