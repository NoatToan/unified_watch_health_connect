package org.cybergarage.upnp;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class DeviceList extends Vector {
    public static final String ELEM_NAME = "deviceList";

    public Device getDevice(int i) {
        return (Device) get(i);
    }
}
