package com.huami.wallet.accessdoor.utils;

import com.huami.components.devicestatus.DeviceStatusNavigator;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.wallet.accessdoor.helper.AccessDoorPageHelper;

/* JADX INFO: loaded from: classes10.dex */
public class AccessDoorUI {
    private static volatile AccessDoorUI c;
    private DeviceStatusNavigator a;
    private DeviceStatusStringProvider b;

    public static AccessDoorUI getInstance() {
        if (c == null) {
            synchronized (AccessDoorUI.class) {
                if (c == null) {
                    c = new AccessDoorUI();
                }
            }
        }
        return c;
    }

    public DeviceStatusStringProvider getDeviceStatusStringProvider() {
        return this.b;
    }

    public boolean isInAccessDoor() {
        return AccessDoorPageHelper.getInstance().getCreatedActivityCount() > 0;
    }

    public void setDeviceStatusNavigator(DeviceStatusNavigator deviceStatusNavigator) {
        this.a = deviceStatusNavigator;
    }

    public void setDeviceStatusStringProvider(DeviceStatusStringProvider deviceStatusStringProvider) {
        this.b = deviceStatusStringProvider;
    }
}
