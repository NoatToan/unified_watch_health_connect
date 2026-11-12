package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class egj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f32940b = UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ehl f32941a = new ehl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected DeviceInformation f32942c;
    private BluetoothGatt d;
    private final Object e;

    public egj(BluetoothGatt bluetoothGatt, Object obj) {
        this.d = bluetoothGatt;
        this.e = obj;
    }

    public void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            LogUtil.e("PDROPE_BaseRopeController", "gatt is null");
        }
        this.d = bluetoothGatt;
    }

    public void e(BluetoothGatt bluetoothGatt) {
        this.d = bluetoothGatt;
    }

    protected void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2) {
        if (this.d == null || bluetoothGattCharacteristic == null || !emh.b().g()) {
            LogUtil.j("PDROPE_BaseRopeController", "BluetoothAdapter not initialized");
            return;
        }
        LogUtil.j("PDROPE_BaseRopeController", "BluetoothAdapter initialized");
        try {
            this.d.setCharacteristicNotification(bluetoothGattCharacteristic, z);
            if (z2) {
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f32940b);
                if (descriptor == null) {
                    LogUtil.j("PDROPE_BaseRopeController", "setCharacteristicNotification, get descriptor is null");
                    return;
                }
                if (z) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_BaseRopeController", "setCharacteristicNotification, writeDescriptor:", bluetoothGattCharacteristic.getUuid(), ", and Descriptor is ", descriptor.getUuid());
                ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_BaseRopeController", "setCharacteristicNotification, writeDescriptor:", Boolean.valueOf(this.f32941a.d(this.d, descriptor)));
                return;
            }
            LogUtil.j("PDROPE_BaseRopeController", "! enableNotification");
        } catch (SecurityException e) {
            ReleaseLogUtil.a("DEVMGR_EcologyDevice_PDROPE_BaseRopeController", "setCharacteristicNotification, ", ExceptionUtils.c(e));
        }
    }

    protected boolean d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        synchronized (this.e) {
            if (bluetoothGattCharacteristic != null) {
                if (this.d != null && bArr != null) {
                    ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_BaseRopeController", "app --> device: writeCharacteristicValueBytes :", erh.a(bArr, ""));
                    bluetoothGattCharacteristic.setValue(bArr);
                    return this.f32941a.b(this.d, bluetoothGattCharacteristic, bArr);
                }
            }
            LogUtil.j("PDROPE_BaseRopeController", "WriteValueBytes: something is null.");
            if (bluetoothGattCharacteristic == null) {
                LogUtil.j("PDROPE_BaseRopeController", "WriteValueBytes: characteristic is null.");
            }
            if (this.d == null) {
                LogUtil.j("PDROPE_BaseRopeController", "WriteValueBytes: mBluetoothGatt is null.");
            }
            return false;
        }
    }

    public DeviceInformation c() {
        return this.f32942c;
    }
}
