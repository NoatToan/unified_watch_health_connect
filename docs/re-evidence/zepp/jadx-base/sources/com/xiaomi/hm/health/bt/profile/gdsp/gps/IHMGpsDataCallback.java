package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMGpsDataCallback {
    void onData(List<GpsRecord> records);

    void onFinish(boolean ret);

    void onProgress(Progress progress);

    void onStart();
}
