package pj2;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class e implements Predicate<BluetoothGattCharacteristic> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothGatt f138054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f138055c;

    public e(f fVar, int i14, BluetoothGatt bluetoothGatt) {
        this.f138055c = fVar;
        this.f138053a = i14;
        this.f138054b = bluetoothGatt;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
        bluetoothGattCharacteristic2.setWriteType(this.f138053a);
        if (bluetoothGattCharacteristic2.setValue(this.f138055c.f138059d)) {
            return this.f138054b.writeCharacteristic(bluetoothGattCharacteristic2);
        }
        return false;
    }
}
