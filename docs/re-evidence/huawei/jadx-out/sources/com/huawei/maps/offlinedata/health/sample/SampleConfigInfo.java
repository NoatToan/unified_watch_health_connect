package com.huawei.maps.offlinedata.health.sample;

/* JADX INFO: loaded from: classes40.dex */
public class SampleConfigInfo {
    private int mSupportCapability;
    private String mType;
    private long mConfigId = -1;
    private int mConfigAction = -1;
    private byte[] mByteConfigData = null;
    private Long mConfigModifyTime = null;

    public byte[] getByteConfigData() {
        return this.mByteConfigData;
    }

    public int getConfigAction() {
        return this.mConfigAction;
    }

    public long getConfigId() {
        return this.mConfigId;
    }

    public Long getConfigModifyTime() {
        return this.mConfigModifyTime;
    }

    public int getSupportCapability() {
        return this.mSupportCapability;
    }

    public String getType() {
        return this.mType;
    }

    public void setByteConfigData(byte[] bArr) {
        this.mByteConfigData = bArr;
    }

    public void setConfigAction(int i) {
        this.mConfigAction = i;
    }

    public void setConfigId(long j) {
        this.mConfigId = j;
    }

    public void setConfigModifyTime(Long l) {
        this.mConfigModifyTime = l;
    }

    public void setSupportCapability(int i) {
        this.mSupportCapability = i;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
