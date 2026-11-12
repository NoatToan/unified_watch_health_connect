package com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback;

/* JADX INFO: loaded from: classes10.dex */
public interface DeviceDfxBaseResponseCallback {
    void onFailure(int i, String str);

    void onProgress(int i, String str);

    void onSuccess(int i, String str);
}
