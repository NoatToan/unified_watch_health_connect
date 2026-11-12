package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Message;
import com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cln extends OpenBlePhysicalServiceBase {
    private final Object e = new Object();

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void onServiceDiscovery(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            LogUtil.d("TransparentBlePhysicalService", "gatt is null");
            return;
        }
        LogUtil.b("TransparentBlePhysicalService", "onServiceDiscovery:", bluetoothGatt.getDevice());
        this.mBluetoothGatt = bluetoothGatt;
        updateDeviceConnectState(2, 100000);
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void onCharacteristicChange(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getUuid() == null) {
            LogUtil.d("TransparentBlePhysicalService", "characteristic is null");
            return;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        byte[] value = bluetoothGattCharacteristic.getValue();
        int properties = bluetoothGattCharacteristic.getProperties();
        cpl.d("TransparentBlePhysicalService", value, "onCharacteristicChanged uuid:", string, " properties:", Integer.valueOf(properties), cpl.a(this.mDeviceInfo), " Device-->SDK:");
        b(string, value, properties);
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public boolean writeCharacteristicValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        synchronized (this.e) {
            try {
                if (bluetoothGattCharacteristic == null) {
                    LogUtil.d("TransparentBlePhysicalService", "characteristic is invalid.");
                    return false;
                }
                bluetoothGattCharacteristic.setValue(bArr);
                if (this.mBluetoothGatt == null) {
                    return false;
                }
                this.mIsLocked.set(true);
                cpl.d("TransparentBlePhysicalService", bArr, "SDK-->Device:");
                boolean zWriteCharacteristic = this.mBluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                LogUtil.b("TransparentBlePhysicalService", "writeCharacteristicValue status:", Boolean.valueOf(zWriteCharacteristic));
                if (zWriteCharacteristic) {
                    lock(bluetoothGattCharacteristic.getUuid().toString());
                } else {
                    this.mIsLocked.set(false);
                }
                return zWriteCharacteristic;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void descriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (bluetoothGattDescriptor == null || bluetoothGattDescriptor.getCharacteristic() == null || bluetoothGattDescriptor.getCharacteristic().getUuid() == null) {
            LogUtil.d("TransparentBlePhysicalService", "descriptor is null");
        } else {
            LogUtil.b("TransparentBlePhysicalService", "descriptorWrite characterUuid:", bluetoothGattDescriptor.getCharacteristic().getUuid().toString(), "status:", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void characteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getUuid() == null) {
            LogUtil.d("TransparentBlePhysicalService", "characteristic is null");
            return;
        }
        cpl.d("TransparentBlePhysicalService", bluetoothGattCharacteristic.getValue(), "onCharacteristicRead uuid:", bluetoothGattCharacteristic.getUuid(), cpl.a(this.mDeviceInfo), " data:");
        String string = bluetoothGattCharacteristic.getUuid().toString();
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (i != 0) {
            onMessageReceived(string, value, 1);
        } else {
            onMessageReceived(string, value, 0);
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void setDescriptorValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor, List<byte[]> list) {
        if (bluetoothGattCharacteristic == null || bluetoothGattDescriptor == null) {
            LogUtil.d("TransparentBlePhysicalService", "characteristic or descriptor is null");
        } else if ((bluetoothGattCharacteristic.getProperties() & 16) == 0) {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        }
    }

    private void b(String str, byte[] bArr, int i) {
        cmm cmmVar = new cmm();
        cmmVar.c(str);
        cmmVar.a(bArr);
        cmmVar.c(i);
        Message messageE = this.mConnectHandler.e(9);
        messageE.arg1 = 0;
        messageE.obj = cmmVar;
        this.mConnectHandler.c(messageE);
    }
}
