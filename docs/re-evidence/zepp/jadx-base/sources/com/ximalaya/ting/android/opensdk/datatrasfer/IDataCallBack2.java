package com.ximalaya.ting.android.opensdk.datatrasfer;

import okhttp3.Headers;

/* JADX INFO: loaded from: classes22.dex */
public interface IDataCallBack2<T> {
    void onError(int i, String str);

    void onSuccess(T t, Headers headers);
}
