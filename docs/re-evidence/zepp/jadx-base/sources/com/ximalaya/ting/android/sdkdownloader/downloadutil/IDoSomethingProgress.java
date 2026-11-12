package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.sdkdownloader.exception.BaseRuntimeException;

/* JADX INFO: loaded from: classes22.dex */
public interface IDoSomethingProgress<T extends BaseRuntimeException> {
    void begin();

    void fail(T t);

    void success();
}
