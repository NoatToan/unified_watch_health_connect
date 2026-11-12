package com.xiaomi.hm.health.bt.sdk.sport;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportResult implements Serializable {
    private static final long serialVersionUID = 1;
    private List<SportItem> sportList = new ArrayList();

    public List<SportItem> getSportList() {
        return this.sportList;
    }

    public void setResult(List<GpsRecord> list, DeviceInfoExt deviceInfoExt) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (GpsRecord gpsRecord : list) {
            SportItem sportItem = new SportItem();
            sportItem.setDeviceInfoExt(deviceInfoExt);
            sportItem.setGpsRecord(gpsRecord);
            this.sportList.add(sportItem);
        }
    }
}
