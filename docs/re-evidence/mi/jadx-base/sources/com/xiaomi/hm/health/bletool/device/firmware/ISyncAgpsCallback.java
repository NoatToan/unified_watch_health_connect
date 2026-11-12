package com.xiaomi.hm.health.bletool.device.firmware;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface ISyncAgpsCallback {
    void onProgress(Progress progress);

    void onStart();

    void onStop(boolean z);
}
