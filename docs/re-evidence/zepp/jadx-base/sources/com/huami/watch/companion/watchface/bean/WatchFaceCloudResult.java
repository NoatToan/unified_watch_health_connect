package com.huami.watch.companion.watchface.bean;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceCloudResult<T> {
    private T data;
    private boolean successful;

    public WatchFaceCloudResult() {
        this((Object) null);
    }

    public T getData() {
        return this.data;
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setSuccessful(boolean z) {
        this.successful = z;
    }

    public String toString() {
        return "<Successful: " + this.successful + ", DataList: " + this.data + Typography.greater;
    }

    public WatchFaceCloudResult(boolean z) {
        this(z, null);
    }

    public WatchFaceCloudResult(T t) {
        this(false, t);
    }

    public WatchFaceCloudResult(boolean z, T t) {
        this.successful = z;
        this.data = t;
    }
}
