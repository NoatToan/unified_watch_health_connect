package com.huami.watch.util;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class BTUtil {
    private static final String a = "Util-BT";
    private static boolean b;

    @Nullable
    private static BluetoothDevice a(String str) {
        Log.d(a, "Find Bond Device by MAC : " + str, new Object[0]);
        try {
            for (BluetoothDevice bluetoothDevice : getDefaultAdapter().getBondedDevices()) {
                Log.v(a, "Bond Device : " + bluetoothDevice, new Object[0]);
                if (bluetoothDevice.getAddress().equals(str)) {
                    return bluetoothDevice;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "Find Bond Device By MAC Error!!", e, new Object[0]);
            return null;
        }
    }

    public static boolean cancelDiscovery() {
        BluetoothAdapter defaultAdapter = getDefaultAdapter();
        Log.d(a, "Cancel Discovery: " + (defaultAdapter != null ? defaultAdapter.cancelDiscovery() : false), new Object[0]);
        return false;
    }

    public static BluetoothAdapter getDefaultAdapter() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    public static boolean hasBond(String str) {
        boolean z = a(str) != null;
        Log.d(a, "Has Bond Device <" + str + "> : " + z, new Object[0]);
        return z;
    }

    public static boolean isBluetoothOn() {
        BluetoothAdapter defaultAdapter = getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            Log.w(a, "Bluetooth is: OFF!!", new Object[0]);
            return false;
        }
        Log.d(a, "Bluetooth is: ON!!", new Object[0]);
        return true;
    }

    public static boolean removeBond(String str) {
        Log.i(a, "Remove Bond Device By MAC : " + str, new Object[0]);
        BluetoothDevice bluetoothDeviceA = a(str);
        return bluetoothDeviceA != null && removeBond(bluetoothDeviceA);
    }

    public static void requestEnableBluetooth(Activity activity) {
        requestEnableBluetooth(activity, false);
    }

    public static boolean startDiscovery() {
        BluetoothAdapter defaultAdapter = getDefaultAdapter();
        boolean zStartDiscovery = defaultAdapter != null ? defaultAdapter.startDiscovery() : false;
        Log.d(a, "Start Discovery..." + zStartDiscovery, new Object[0]);
        return zStartDiscovery;
    }

    public static void requestEnableBluetooth(Activity activity, boolean z) {
        BluetoothAdapter defaultAdapter;
        Log.d(a, "Request Enable Bluetooth, Already request : " + b, new Object[0]);
        if ((b && !z) || (defaultAdapter = getDefaultAdapter()) == null || defaultAdapter.isEnabled()) {
            return;
        }
        activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 0);
        b = true;
    }

    public static boolean removeBond(@NonNull BluetoothDevice bluetoothDevice) {
        Log.i(a, "Remove Bond Device : " + bluetoothDevice, new Object[0]);
        try {
            Boolean bool = (Boolean) Class.forName("android.bluetooth.BluetoothDevice").getMethod("removeBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
            Log.d(a, "Result : " + bool, new Object[0]);
            return bool.booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "Remove Bond Device Error!!", e, new Object[0]);
            return false;
        }
    }
}
