package com.huami.devicex.manager;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.huami.devicex.DeviceXBuilder;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class b {
    public static boolean b(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !BluetoothAdapter.checkBluetoothAddress(str)) {
            return false;
        }
        return (Build.VERSION.SDK_INT <= 30 || ContextCompat.checkSelfPermission(DeviceXBuilder.INSTANCE.getContext(), "android.permission.BLUETOOTH_CONNECT") == 0) && ContextCompat.checkSelfPermission(DeviceXBuilder.INSTANCE.getContext(), "android.permission.BLUETOOTH") == 0 && defaultAdapter.getRemoteDevice(str).getBondState() == 12;
    }

    private static boolean c(Device device) {
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            return b(device.getDevice_address());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(Device device, Device device2) {
        if (device == null && device2 == null) {
            return 0;
        }
        if (device == null) {
            return -1;
        }
        if (device2 == null) {
            return 1;
        }
        return device2.getDevice_bind_time().compareTo(device.getDevice_bind_time());
    }

    public static List<Device> e(List<Device> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Device device : list) {
            if (device.getDevice_type().intValue() == HMDeviceType.MILI.getValue() || device.getDevice_type().intValue() == HMDeviceType.WATCH.getValue()) {
                arrayList.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.WEIGHT.getValue()) {
                arrayList2.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.SHOES.getValue()) {
                arrayList3.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.OTHER.getValue()) {
                arrayList4.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.TREADMILL.getValue()) {
                arrayList5.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.HEADSET.getValue()) {
                if (c(device)) {
                    arrayList6.add(device);
                }
            } else if (device.getDevice_type().intValue() == HMDeviceType.EARBUD.getValue()) {
                arrayList7.add(device);
            }
        }
        a aVar = new Comparator() { // from class: com.huami.devicex.manager.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((Device) obj, (Device) obj2);
            }
        };
        Collections.sort(arrayList, aVar);
        Collections.sort(arrayList2, aVar);
        Collections.sort(arrayList3, aVar);
        Collections.sort(arrayList5, aVar);
        Collections.sort(arrayList6, aVar);
        Collections.sort(arrayList4, aVar);
        Collections.sort(arrayList7, aVar);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList);
        arrayList8.addAll(arrayList2);
        arrayList8.addAll(arrayList3);
        arrayList8.addAll(arrayList4);
        arrayList8.addAll(arrayList5);
        arrayList8.addAll(arrayList6);
        arrayList8.addAll(arrayList7);
        return arrayList8;
    }
}
