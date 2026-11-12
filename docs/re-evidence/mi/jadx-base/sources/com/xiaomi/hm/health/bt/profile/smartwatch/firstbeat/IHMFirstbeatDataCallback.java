package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback;

/* JADX INFO: loaded from: classes11.dex */
public interface IHMFirstbeatDataCallback extends IHMGpsDataCallback {
    void onFirstbeatData(BleFirstbeatData bleFirstbeatData);
}
