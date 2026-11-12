package com.xiaomi.hm.health.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public class DeviceFilterUtils {
    private static final String a = "STF-AL00";
    private static final String b = "LG-H961N";
    private static ArrayList<String> c;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        c = arrayList;
        arrayList.add(a);
        c.add(b);
    }

    public static boolean isBluetoothConnectionFilteredDevice(String currentDevice) {
        if (TextUtils.isEmpty(currentDevice)) {
            return false;
        }
        Iterator<String> it2 = c.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(currentDevice)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBluetoothHasPairedDevice(String currentDeviceAddress) {
        Set<BluetoothDevice> bondedDevices;
        if (!TextUtils.isEmpty(currentDeviceAddress) && (bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices()) != null && bondedDevices.size() > 0) {
            Iterator<BluetoothDevice> it2 = bondedDevices.iterator();
            while (it2.hasNext()) {
                if (currentDeviceAddress.equals(it2.next().getAddress())) {
                    return true;
                }
            }
        }
        return false;
    }
}
