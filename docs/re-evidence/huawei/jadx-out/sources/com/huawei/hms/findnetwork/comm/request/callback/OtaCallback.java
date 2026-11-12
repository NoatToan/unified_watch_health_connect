package com.huawei.hms.findnetwork.comm.request.callback;

/* JADX INFO: loaded from: classes33.dex */
public interface OtaCallback {
    void onError(String str, int i, String str2);

    void onFinish();

    void onProgress(int i);

    void onStart();

    void onUpdate(String str);
}
