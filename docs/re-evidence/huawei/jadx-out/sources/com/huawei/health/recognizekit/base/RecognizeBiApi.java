package com.huawei.health.recognizekit.base;

import defpackage.lmn;

/* JADX INFO: loaded from: classes8.dex */
public interface RecognizeBiApi {
    void onAlbumEvent(String str);

    void onEnterEvent(int i, String str);

    void onRecognizeEvent(String str, lmn lmnVar);

    void onRecognizeEvent(boolean z);

    void onRecognizeResultEvent(boolean z, boolean z2);

    void onTipsEvent(String str);
}
