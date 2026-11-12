package pj2;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class c implements Predicate<BluetoothGattDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f138050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothGatt f138051b;

    public c(b.CallableC2617b callableC2617b, byte[] bArr, BluetoothGatt bluetoothGatt) {
        this.f138050a = bArr;
        this.f138051b = bluetoothGatt;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGattDescriptor bluetoothGattDescriptor2 = bluetoothGattDescriptor;
        bluetoothGattDescriptor2.setValue(this.f138050a);
        return this.f138051b.writeDescriptor(bluetoothGattDescriptor2);
    }
}
