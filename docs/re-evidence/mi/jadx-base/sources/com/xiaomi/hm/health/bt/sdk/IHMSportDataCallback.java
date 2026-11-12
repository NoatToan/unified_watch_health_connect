package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback;
import com.xiaomi.hm.health.bt.sdk.sport.SportResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IHMSportDataCallback implements IHMGpsDataCallback {
    private DeviceInfoExt deviceInfoExt;

    public abstract void onData(SportResult sportResult);

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
    public final void onData(List<GpsRecord> list) {
        SportResult sportResult = new SportResult();
        sportResult.setResult(list, this.deviceInfoExt);
        onData(sportResult);
    }

    public void setDeviceInfoExt(DeviceInfoExt deviceInfoExt) {
        this.deviceInfoExt = deviceInfoExt;
    }
}
