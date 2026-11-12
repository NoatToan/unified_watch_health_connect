package com.huawei.health.h5pro.jsbridge.system.prerequest;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.file.core.util.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class PreResult<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Utils.REQUEST_TIME)
    private long f6876b;

    @SerializedName("data")
    private T e;

    public PreResult() {
    }

    public T getData() {
        return this.e;
    }

    public long getRequestTime() {
        return this.f6876b;
    }

    public void setData(T t) {
        this.e = t;
    }

    public void setRequestTime(long j) {
        this.f6876b = j;
    }

    public PreResult(long j, T t) {
        this.f6876b = j;
        this.e = t;
    }
}
