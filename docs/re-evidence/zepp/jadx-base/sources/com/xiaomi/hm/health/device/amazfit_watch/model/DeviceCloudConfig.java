package com.xiaomi.hm.health.device.amazfit_watch.model;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceCloudConfig {
    private HashMap<HMDeviceType, Boolean> a;

    public HashMap<HMDeviceType, Boolean> getDeviceBindHashMap() {
        return this.a;
    }

    public boolean isOn(HMDeviceType hMDeviceType) {
        Boolean bool;
        HashMap<HMDeviceType, Boolean> map = this.a;
        if (map == null || (bool = map.get(hMDeviceType)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setDeviceBindHashMap(HashMap<HMDeviceType, Boolean> map) {
        this.a = map;
    }
}
