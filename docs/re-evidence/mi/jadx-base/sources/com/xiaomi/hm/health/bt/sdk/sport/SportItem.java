package com.xiaomi.hm.health.bt.sdk.sport;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class SportItem implements Serializable {
    private static final long serialVersionUID = 1;
    private DeviceInfoExt deviceInfoExt;
    private GpsRecord gpsRecord;

    public DeviceInfoExt getDeviceInfoExt() {
        return this.deviceInfoExt;
    }

    public GpsRecord getGpsRecord() {
        return this.gpsRecord;
    }

    public void setDeviceInfoExt(DeviceInfoExt deviceInfoExt) {
        this.deviceInfoExt = deviceInfoExt;
    }

    public void setGpsRecord(GpsRecord gpsRecord) {
        this.gpsRecord = gpsRecord;
    }
}
