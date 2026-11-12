package com.huawei.networkclient;

/* JADX INFO: loaded from: classes12.dex */
public interface ProgressListener<T> {
    void onFail(Throwable th);

    void onFinish(T t);

    void onProgress(long j, long j2, boolean z);
}
