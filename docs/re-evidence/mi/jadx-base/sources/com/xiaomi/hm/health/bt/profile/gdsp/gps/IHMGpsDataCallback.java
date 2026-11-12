package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IHMGpsDataCallback {
    void onData(List<GpsRecord> list);

    void onFinish(boolean z);

    void onProgress(Progress progress);

    void onStart();
}
