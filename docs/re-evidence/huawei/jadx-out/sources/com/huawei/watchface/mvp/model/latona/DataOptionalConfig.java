package com.huawei.watchface.mvp.model.latona;

/* JADX INFO: loaded from: classes45.dex */
public class DataOptionalConfig {
    private String mDataType;
    private String mIndex;
    private String mResPreview;

    public String getDataType() {
        return this.mDataType;
    }

    public String getIndex() {
        return this.mIndex;
    }

    public String getResPreview() {
        return this.mResPreview;
    }

    public void setDataType(String str) {
        this.mDataType = str;
    }

    public void setIndex(String str) {
        this.mIndex = str;
    }

    public void setResPreview(String str) {
        this.mResPreview = str;
    }

    public String toString() {
        return "DataOptionalConfig{mIndex='" + this.mIndex + "', mResPreview='" + this.mResPreview + "', mDataType='" + this.mDataType + "'}";
    }
}
