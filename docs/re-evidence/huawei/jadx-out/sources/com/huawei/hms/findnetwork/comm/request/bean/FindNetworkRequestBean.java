package com.huawei.hms.findnetwork.comm.request.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes33.dex */
public class FindNetworkRequestBean<T> extends BaseRequestBean {

    @SerializedName("data")
    private T data;

    public void setData(T t) {
        this.data = t;
    }

    public T getData() {
        return this.data;
    }

    public FindNetworkRequestBean(T t) {
        this.data = t;
    }
}
