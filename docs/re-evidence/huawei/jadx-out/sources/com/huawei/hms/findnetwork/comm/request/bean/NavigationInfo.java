package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class NavigationInfo {
    private String mExtendData;
    private int mFlag;
    private String mSn;
    private float[] mValue;

    public void setValues(float[] fArr) {
        this.mValue = fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public void setSn(String str) {
        this.mSn = str;
    }

    public void setFlag(int i) {
        this.mFlag = i;
    }

    public void setExtendData(String str) {
        this.mExtendData = str;
    }

    public float[] getValues() {
        float[] fArr = this.mValue;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public String getSn() {
        return this.mSn;
    }

    public int getFlag() {
        return this.mFlag;
    }

    public String getExtendData() {
        return this.mExtendData;
    }
}
