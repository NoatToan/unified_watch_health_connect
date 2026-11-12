package com.ingenic.iwds.uniconnect.link;

import com.ingenic.iwds.DeviceDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteDeviceDescriptorStorage {
    private static RemoteDeviceDescriptorStorage a;
    private static ArrayList<DeviceDescriptor> b;

    private RemoteDeviceDescriptorStorage() {
        b = new ArrayList<>();
    }

    public static RemoteDeviceDescriptorStorage getInstance() {
        if (a == null) {
            a = new RemoteDeviceDescriptorStorage();
        }
        return a;
    }

    public void addDeviceDescriptors(DeviceDescriptor deviceDescriptor) {
        synchronized (b) {
            b.add(deviceDescriptor);
        }
    }

    public DeviceDescriptor[] getDeviceDescriptorsArray() {
        DeviceDescriptor[] deviceDescriptorArr;
        synchronized (b) {
            Object[] array = b.toArray();
            int length = array.length;
            deviceDescriptorArr = new DeviceDescriptor[length];
            for (int i = 0; i < length; i++) {
                deviceDescriptorArr[i] = (DeviceDescriptor) array[i];
            }
        }
        return deviceDescriptorArr;
    }

    public void removeDeviceDescriptor(DeviceDescriptor deviceDescriptor) {
        synchronized (b) {
            b.remove(deviceDescriptor);
        }
    }
}
