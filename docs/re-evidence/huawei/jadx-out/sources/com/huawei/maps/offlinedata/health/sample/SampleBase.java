package com.huawei.maps.offlinedata.health.sample;

/* JADX INFO: loaded from: classes40.dex */
public class SampleBase {
    private int mCommandId = -1;
    private String mSrcPkgName;
    private String mWearPkgName;

    public int getCommandId() {
        return this.mCommandId;
    }

    public String getSrcPkgName() {
        return this.mSrcPkgName;
    }

    public String getWearPkgName() {
        return this.mWearPkgName;
    }

    public void setCommandId(int i) {
        this.mCommandId = i;
    }

    public void setSrcPkgName(String str) {
        this.mSrcPkgName = str;
    }

    public void setWearPkgName(String str) {
        this.mWearPkgName = str;
    }

    public String toString() {
        return "SampleBase{mSrcPkgName=" + this.mSrcPkgName + ", mWearPkgName=" + this.mWearPkgName + ", mCommandId=" + this.mCommandId + '}';
    }
}
