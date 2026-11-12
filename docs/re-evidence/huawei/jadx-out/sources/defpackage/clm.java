package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase;
import com.huawei.devicesdk.connect.retry.ExecuteActionInterface;
import com.huawei.devicesdk.connect.retry.RetryCallbackInterface;
import health.compact.a.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class clm extends OpenBlePhysicalServiceBase {
    private final Object d = new Object();

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void onServiceDiscovery(final BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            LogUtil.d("OperableBlePhysicalService", "gatt is null");
            return;
        }
        LogUtil.b("OperableBlePhysicalService", "onServiceDiscovery:", bluetoothGatt.getDevice());
        this.mServiceDiscoveryExecutor.c(new ExecuteActionInterface() { // from class: clm.1
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "ServiceDiscovery";
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                try {
                    return bluetoothGatt.getService(cmj.d) != null;
                } catch (SecurityException e) {
                    LogUtil.d("OperableBlePhysicalService", "onServiceDiscovery SecurityException", cpc.c(e));
                    return false;
                }
            }
        }, new RetryCallbackInterface() { // from class: clm.2
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i) {
                int size = bluetoothGatt.getServices().size();
                LogUtil.e("OperableBlePhysicalService", "not found user data service", " find service num=", Integer.valueOf(size), cpl.a(clm.this.mDeviceInfo));
                if (clm.this.mConnectHandler == null) {
                    LogUtil.e("OperableBlePhysicalService", "mConnectHandler is null", cpl.a(clm.this.mDeviceInfo));
                    clm.this.updateDeviceConnectState(3, cpi.c(2, 303));
                } else {
                    clm.this.mConnectHandler.a(2);
                    clm.this.mConnectHandler.e(2, 200L);
                    LogUtil.b("OperableBlePhysicalService", "send discovery message", cpl.a(clm.this.mDeviceInfo));
                }
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                clm.this.mBluetoothGatt = bluetoothGatt;
                clm.this.mConnectHandler.a(7);
                clm.this.mConnectHandler.e(7, 100L);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
                clm.this.updateDeviceConnectState(3, cpi.c(2, 301));
            }
        }, true);
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void onCharacteristicChange(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            LogUtil.d("OperableBlePhysicalService", "characteristic is null");
            return;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        byte[] value = bluetoothGattCharacteristic.getValue();
        cpl.d("OperableBlePhysicalService", value, "onCharacteristicChanged uuid:", string, cpl.a(this.mDeviceInfo), " Device-->SDK:");
        onMessageReceived(string, value, 0);
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public boolean writeCharacteristicValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        synchronized (this.d) {
            try {
                if (bluetoothGattCharacteristic == null) {
                    LogUtil.d("OperableBlePhysicalService", "characteristic is invalid.");
                    return false;
                }
                try {
                    bluetoothGattCharacteristic.setValue(bArr);
                    bluetoothGattCharacteristic.setWriteType(1);
                    BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
                    if (bluetoothGatt == null) {
                        return false;
                    }
                    this.mIsLocked.set(true);
                    cpl.d("OperableBlePhysicalService", bArr, "SDK-->Device:");
                    boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                    LogUtil.b("OperableBlePhysicalService", "writeCharacteristicValue status: ", Boolean.valueOf(zWriteCharacteristic));
                    if (zWriteCharacteristic) {
                        lock(bluetoothGattCharacteristic.getUuid().toString());
                    } else {
                        this.mIsLocked.set(false);
                    }
                    return zWriteCharacteristic;
                } catch (SecurityException unused) {
                    LogUtil.d("OperableBlePhysicalService", "writeCharacteristicValue SecurityException.");
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void descriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (bluetoothGattDescriptor == null) {
            LogUtil.d("OperableBlePhysicalService", "descriptor is null");
            return;
        }
        LogUtil.b("OperableBlePhysicalService", "onCharacteristicWrite uuid:", bluetoothGattDescriptor.getCharacteristic().getUuid().toString(), " status:", Integer.valueOf(i), cpl.a(this.mDeviceInfo));
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void characteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null) {
            LogUtil.d("OperableBlePhysicalService", "characteristic is null");
            return;
        }
        LogUtil.b("OperableBlePhysicalService", "onCharacteristicWrite uuid:", bluetoothGattCharacteristic.getUuid().toString(), " status:", Integer.valueOf(i), cpl.a(this.mDeviceInfo));
    }

    @Override // com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase
    public void setDescriptorValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor, List<byte[]> list) {
        if (bluetoothGattDescriptor == null || list == null) {
            LogUtil.d("OperableBlePhysicalService", "descriptor or descriptorValue is null");
            return;
        }
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            bluetoothGattDescriptor.setValue(it.next());
        }
    }
}
