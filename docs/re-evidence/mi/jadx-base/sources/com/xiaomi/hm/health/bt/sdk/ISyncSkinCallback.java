package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface ISyncSkinCallback {
    public static final int RESULT_BUSY = 2;
    public static final int RESULT_DISCONNECT = 1;
    public static final int RESULT_FULL = 3;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_SYNC_ERROR = 4;

    void onProgress(Progress progress);

    void onStart();

    void onStop(int i);
}
