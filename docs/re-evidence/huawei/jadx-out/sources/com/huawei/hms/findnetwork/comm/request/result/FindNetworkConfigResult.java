package com.huawei.hms.findnetwork.comm.request.result;

/* JADX INFO: loaded from: classes33.dex */
public class FindNetworkConfigResult<T> {
    private T mData;
    private String mDescription;
    private int mRespCode;

    public FindNetworkConfigResult() {
    }

    public FindNetworkConfigResult(int i, String str, T t) {
        this.mRespCode = i;
        this.mDescription = str;
        this.mData = t;
    }

    public void setRespCode(int i) {
        this.mRespCode = i;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setData(T t) {
        this.mData = t;
    }

    public int getRespCode() {
        return this.mRespCode;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public T getData() {
        return this.mData;
    }
}
