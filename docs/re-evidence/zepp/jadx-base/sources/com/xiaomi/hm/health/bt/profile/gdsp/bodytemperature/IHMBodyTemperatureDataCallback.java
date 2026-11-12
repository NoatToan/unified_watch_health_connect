package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback;

/* JADX INFO: loaded from: classes14.dex */
public interface IHMBodyTemperatureDataCallback extends IHMGpsDataCallback {
    void onTemperatureData(HMBodyTemperatureData data);
}
