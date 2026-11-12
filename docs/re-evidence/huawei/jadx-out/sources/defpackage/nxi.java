package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.device.model.FitnessData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Field;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class nxi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f43890b = UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CallbackBetweenClientAndController f43891a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f43892c;
    private BluetoothGatt d;
    private int e = 0;
    private final Object j;

    public void b(BluetoothGatt bluetoothGatt, int i) {
    }

    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    public void c() {
    }

    public void c(BluetoothGatt bluetoothGatt, int i) {
    }

    public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public void c(boolean z) {
    }

    public void e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public void e(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
    }

    public DeviceInformation h() {
        return null;
    }

    public void i() {
    }

    public nxi(BluetoothGatt bluetoothGatt, CallbackBetweenClientAndController callbackBetweenClientAndController, Object obj) {
        this.d = bluetoothGatt;
        this.f43891a = callbackBetweenClientAndController;
        this.j = obj;
    }

    public void d(String str) {
        this.f43892c = str;
    }

    public void d(BluetoothGatt bluetoothGatt) {
        this.d = bluetoothGatt;
    }

    public void a(int i) {
        this.e = i;
    }

    public void f() {
        LogUtil.d("Track_IDEQ_FitnessController", "resetControllerData");
    }

    protected void e(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2) {
        if (this.d == null || bluetoothGattCharacteristic == null) {
            LogUtil.j("Track_IDEQ_FitnessController", "BluetoothAdapter not initialized");
            return;
        }
        LogUtil.j("Track_IDEQ_FitnessController", "BluetoothAdapter initialized");
        LogUtil.a("Track_IDEQ_FitnessController", "FTMP_TS setCharacteristicNotification, mBluetoothGatt.setCharacteristicNotification:", bluetoothGattCharacteristic.getUuid().toString());
        try {
            ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessController", "isNotifySuccess ? ", Boolean.valueOf(this.d.setCharacteristicNotification(bluetoothGattCharacteristic, z)));
            if (z2) {
                LogUtil.a("Track_IDEQ_FitnessController", "FTMP_TS setCharacteristicNotification, will mBluetoothGatt.writeDescriptor");
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f43890b);
                if (descriptor == null) {
                    return;
                }
                if (z) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                LogUtil.a("Track_IDEQ_FitnessController", "FTMP_TS setCharacteristicNotification, mBluetoothGatt.writeDescriptor:", bluetoothGattCharacteristic.getUuid().toString(), ", and Descriptor is ", descriptor.getUuid().toString());
                ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessController", "isWriteOk ? ", Boolean.valueOf(this.d.writeDescriptor(descriptor)));
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessController", "! enableNotification");
        } catch (SecurityException e) {
            ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FitnessController", "setCharacteristicNotification, ", ExceptionUtils.c(e));
        }
    }

    protected void b(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2) {
        if (this.d == null || bluetoothGattCharacteristic == null) {
            LogUtil.j("Track_IDEQ_FitnessController", "BluetoothAdapter not initialized");
            return;
        }
        LogUtil.j("Track_IDEQ_FitnessController", "BluetoothAdapter initialized");
        try {
            this.d.setCharacteristicNotification(bluetoothGattCharacteristic, z);
            if (z2) {
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f43890b);
                if (descriptor == null) {
                    return;
                }
                if (z) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                LogUtil.a("Track_IDEQ_FitnessController", "FTMP_TS setCharacteristicIndication, mBluetoothGatt.writeDescriptor:", bluetoothGattCharacteristic.getUuid().toString(), ", and Descriptor is ", descriptor.getUuid().toString());
                LogUtil.a("Track_IDEQ_FitnessController", "writeDescriptor is success? ", Boolean.valueOf(this.d.writeDescriptor(descriptor)));
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessController", "! enableIndication");
        } catch (SecurityException e) {
            ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FitnessController", "setCharacteristicIndication, ", ExceptionUtils.c(e));
        }
    }

    protected boolean g() {
        BluetoothGatt bluetoothGatt = this.d;
        boolean z = false;
        if (bluetoothGatt == null) {
            LogUtil.j("Track_IDEQ_FitnessController", "mBluetoothGatt is null");
            return false;
        }
        try {
            Field declaredField = bluetoothGatt.getClass().getDeclaredField("mDeviceBusy");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.d);
            boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
            try {
                LogUtil.a("Track_IDEQ_FitnessController", "isDeviceBusy:", Boolean.valueOf(zBooleanValue));
                return zBooleanValue;
            } catch (IllegalAccessException e) {
                z = zBooleanValue;
                e = e;
                LogUtil.e("Track_IDEQ_FitnessController", "IllegalAccessException:", e.getMessage());
                return z;
            } catch (NoSuchFieldException e2) {
                z = zBooleanValue;
                e = e2;
                LogUtil.e("Track_IDEQ_FitnessController", "NoSuchFieldException:", e.getMessage());
                return z;
            }
        } catch (IllegalAccessException e3) {
            e = e3;
        } catch (NoSuchFieldException e4) {
            e = e4;
        }
    }

    protected boolean d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        boolean zWriteCharacteristic;
        synchronized (this.j) {
            LogUtil.a("Track_IDEQ_FitnessController", "writeCharacteristicValueBytes.");
            if (bluetoothGattCharacteristic != null && this.d != null && bArr != null) {
                bluetoothGattCharacteristic.setValue(bArr);
                try {
                    zWriteCharacteristic = this.d.writeCharacteristic(bluetoothGattCharacteristic);
                } catch (SecurityException e) {
                    ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FitnessController", "writeCharacteristic, ", ExceptionUtils.c(e));
                    zWriteCharacteristic = false;
                }
                ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessController", "writeCharacteristicValueBytes success? = ", Boolean.valueOf(zWriteCharacteristic));
                return zWriteCharacteristic;
            }
            LogUtil.j("Track_IDEQ_FitnessController", "WriteValueBytes: characteristic 、BluetoothGatt or bytes is null.");
            return false;
        }
    }

    protected void e(String str) {
        if (this.f43891a != null) {
            LogUtil.a("Track_IDEQ_FitnessController", "notifyFitnessDeviceDataOrStateCallback, intentAction is ", str);
            this.f43891a.notifyStateChanged(str);
        }
    }

    protected void c(FitnessData fitnessData) {
        if (this.f43891a == null || fitnessData == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA", fitnessData.getFitnessHashMap());
        LogUtil.a("Track_IDEQ_FitnessController", "notifyFitnessDeviceDataOrStateCallback");
        this.f43891a.notifyDataChange(902, bundle);
    }

    protected void e(FitnessData fitnessData, int i) {
        if (this.f43891a == null || fitnessData == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA", fitnessData.getFitnessHashMap());
        bundle.putInt("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_CSAFESTATE", i);
        LogUtil.d("Track_IDEQ_FitnessController", "notifyFitnessDeviceDataOrStateCallback state = " + i);
        this.f43891a.notifyDataChange(902, bundle);
    }

    protected void d(int i, String str) {
        LogUtil.d("Track_IDEQ_FitnessController", "notifyFitnessDeviceDataOrStateCallback intentAction = " + i);
        if (this.f43891a != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK", str);
            }
            this.f43891a.notifyDataChange(i, bundle);
        }
    }

    protected void c(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f43891a != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_ALLOWED_TO_SHOW_UI", z2);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_GOTO_START_FROM_FINISH", z3);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_HAS_NOT_DISCONNECTED", z);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_PRESS_ON_STOP_BTN", z4);
            LogUtil.d("Track_IDEQ_FitnessController", "notifyCallbackToFinishThisSegment");
            this.f43891a.notifyDataChange(905, bundle);
        }
    }
}
