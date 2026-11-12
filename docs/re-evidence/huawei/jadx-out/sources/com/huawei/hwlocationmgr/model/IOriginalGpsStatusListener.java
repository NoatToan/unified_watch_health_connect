package com.huawei.hwlocationmgr.model;

import android.location.GnssStatus;
import android.location.GpsStatus;

/* JADX INFO: loaded from: classes11.dex */
public interface IOriginalGpsStatusListener {
    void updateGnssStatus(GnssStatus gnssStatus);

    void updateGpsStatus(int i);

    void updateGpsStatus(GpsStatus gpsStatus);
}
