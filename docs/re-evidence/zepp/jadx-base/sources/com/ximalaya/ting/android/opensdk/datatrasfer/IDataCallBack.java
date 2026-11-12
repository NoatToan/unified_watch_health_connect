package com.ximalaya.ting.android.opensdk.datatrasfer;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes22.dex */
public interface IDataCallBack<T> {
    void onError(int i, String str);

    void onSuccess(@Nullable T t);
}
