package com.huawei.watchface;

import com.huawei.hwbasemgr.IBaseResponseCallback;

/* JADX INFO: loaded from: classes20.dex */
public interface WatchFaceApi {
    void openMyWatchFace(IBaseResponseCallback iBaseResponseCallback);

    void openWatchFaceDetail(int i, IBaseResponseCallback iBaseResponseCallback);

    void openWatchFaceDetail(String str, String str2, IBaseResponseCallback iBaseResponseCallback);
}
