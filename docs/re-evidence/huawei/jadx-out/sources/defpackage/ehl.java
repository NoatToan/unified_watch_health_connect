package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class ehl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32982a = false;

    public boolean b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null) {
            return false;
        }
        boolean zB = b(1, bluetoothGatt, bArr, bluetoothGattCharacteristic);
        if (zB) {
            LogUtil.d("Ecology_BluetoothGattUtils", "writeCharacteristic succeed");
            return zB;
        }
        LogUtil.a("Ecology_BluetoothGattUtils", "writeCharacteristic failed");
        return zB;
    }

    public boolean e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return b(bluetoothGatt, bluetoothGattCharacteristic, null);
    }

    private boolean b(int i, BluetoothGatt bluetoothGatt, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < 2000 && a(bluetoothGatt)) {
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                LogUtil.e("Ecology_BluetoothGattUtils", "InterruptedException:", e.getMessage());
            }
        }
        try {
            if (i == 1) {
                LogUtil.a("Ecology_BluetoothGattUtils", "writeCharacteristic ");
                this.f32982a = true;
                return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
            if (i != 2) {
                return false;
            }
            LogUtil.a("Ecology_BluetoothGattUtils", "readCharacteristic ");
            this.f32982a = true;
            return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
        } catch (SecurityException e2) {
            LogUtil.e("Ecology_BluetoothGattUtils", "optionCharcteristic SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public boolean d(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGatt != null && bluetoothGattDescriptor != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (System.currentTimeMillis() - jCurrentTimeMillis < 2000 && a(bluetoothGatt)) {
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException e) {
                    LogUtil.e("Ecology_BluetoothGattUtils", "InterruptedException:", e.getMessage());
                }
            }
            try {
                LogUtil.a("Ecology_BluetoothGattUtils", "writeDescriptor ");
                this.f32982a = true;
                boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
                if (zWriteDescriptor) {
                    LogUtil.a("Ecology_BluetoothGattUtils", "writeDescriptor succeed");
                } else {
                    LogUtil.a("Ecology_BluetoothGattUtils", "writeDescriptor failed");
                }
                return zWriteDescriptor;
            } catch (SecurityException e2) {
                LogUtil.e("Ecology_BluetoothGattUtils", "writeDescriptor SecurityException:", ExceptionUtils.c(e2));
            }
        }
        return false;
    }

    private boolean a(BluetoothGatt bluetoothGatt) {
        try {
            Field declaredField = bluetoothGatt.getClass().getDeclaredField("mDeviceBusy");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(bluetoothGatt);
            boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
            LogUtil.a("Ecology_BluetoothGattUtils", "isDeviceBusy:", Boolean.valueOf(zBooleanValue));
            return zBooleanValue;
        } catch (IllegalAccessException e) {
            LogUtil.e("Ecology_BluetoothGattUtils", Boolean.valueOf(this.f32982a), ":IllegalAccessException:", e.getMessage());
            return this.f32982a;
        } catch (NoSuchFieldException e2) {
            LogUtil.e("Ecology_BluetoothGattUtils", Boolean.valueOf(this.f32982a), ":NoSuchFieldException:", e2.getMessage());
            return this.f32982a;
        }
    }

    public void b(boolean z) {
        this.f32982a = z;
    }
}
