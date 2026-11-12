package com.ximalaya.ting.android.opensdk.httputil;

/* JADX INFO: loaded from: classes22.dex */
public interface IDataSupportCallBack<T> {
    void onError(int i, String str);

    void onSuccess(T t);
}
