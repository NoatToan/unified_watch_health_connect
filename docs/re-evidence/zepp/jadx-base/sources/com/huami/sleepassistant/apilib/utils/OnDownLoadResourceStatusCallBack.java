package com.huami.sleepassistant.apilib.utils;

/* JADX INFO: loaded from: classes13.dex */
public interface OnDownLoadResourceStatusCallBack {
    void callback(String str);

    void downFail();

    void downProgress(Integer... numArr);

    void endDown();

    void startDown();
}
