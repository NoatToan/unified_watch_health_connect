package com.xiaomi.smarthome.core.server.internal.util;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class ClassicBtUtil {
    public static boolean connectBluetoothProfile(BluetoothDevice bluetoothDevice, BluetoothProfile bluetoothProfile) {
        if (bluetoothDevice == null || bluetoothProfile == null) {
            return false;
        }
        if (bluetoothDevice.getBondState() != 12) {
            BluetoothLog.w("ClassicBtUtil connectBluetoothProfile ,device is un bonded ");
            return false;
        }
        setPriority(bluetoothDevice, bluetoothProfile, 100);
        try {
            Method declaredMethod = bluetoothProfile.getClass().getDeclaredMethod("connect", BluetoothDevice.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(bluetoothProfile, bluetoothDevice);
            return true;
        } catch (Exception e) {
            BluetoothLog.e("ClassBtUtil connect exception:" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public static boolean disconnectBluetoothProfile(BluetoothDevice bluetoothDevice, BluetoothProfile bluetoothProfile) {
        if (bluetoothDevice == null || bluetoothProfile == null) {
            BluetoothLog.w("ClassicBtUtil disconnectBluetoothProfile ,device or profile is null! ");
            return false;
        }
        if (bluetoothDevice.getBondState() != 12) {
            BluetoothLog.w("ClassicBtUtil disconnectBluetoothProfile ,device is un bonded ");
            return false;
        }
        setPriority(bluetoothDevice, bluetoothProfile, 0);
        try {
            Method declaredMethod = bluetoothProfile.getClass().getDeclaredMethod("disconnect", BluetoothDevice.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(bluetoothProfile, bluetoothDevice);
            return true;
        } catch (Exception e) {
            BluetoothLog.e("ClassBtUtil disconnect exception:" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public static void setPriority(BluetoothDevice bluetoothDevice, BluetoothProfile bluetoothProfile, int i) {
        if (bluetoothProfile != null) {
            try {
                bluetoothProfile.getClass().getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(bluetoothProfile, bluetoothDevice, Integer.valueOf(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
