package com.huawei.hms.findnetwork.comm.request.callback;

/* JADX INFO: loaded from: classes33.dex */
public interface GrabTagLogListener {
    void onFinished();

    void onGrabFail(int i, String str);

    void onGrabing(byte[] bArr);

    void onStartGrab();
}
