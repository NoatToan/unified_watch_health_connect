package com.huawei.watchface.utils.callback;

/* JADX INFO: loaded from: classes20.dex */
public interface IPhotoFileCallback {
    void onFailure(int i, String str);

    void onProgress(int i, String str);

    void onSuccess(int i, String str, String str2);
}
