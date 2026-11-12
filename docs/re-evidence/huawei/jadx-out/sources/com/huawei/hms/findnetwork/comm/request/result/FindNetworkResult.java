package com.huawei.hms.findnetwork.comm.request.result;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkResult<T> {
    private T mData;
    private String mDescription;
    private int mRespCode;
    private String mSrcTransId;

    public FindNetworkResult() {
    }

    public FindNetworkResult(int i, String str, T t) {
        this.mRespCode = i;
        this.mDescription = str;
        this.mData = t;
    }

    public void setSrcTransId(String str) {
        this.mSrcTransId = str;
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

    public String getSrcTransId() {
        return this.mSrcTransId;
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
