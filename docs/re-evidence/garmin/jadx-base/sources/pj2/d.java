package pj2;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class d implements Predicate<BluetoothGattCharacteristic> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothGatt f138052a;

    public d(b.c cVar, BluetoothGatt bluetoothGatt) {
        this.f138052a = bluetoothGatt;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f138052a.readCharacteristic(bluetoothGattCharacteristic);
    }
}
