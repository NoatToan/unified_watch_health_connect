package com.xiaomi.smarthome.framework.plugin.rn.report;

/* JADX INFO: loaded from: classes2.dex */
public class RnPluginOpenTimeInfo {
    private int curCacheSize;
    private String did;
    private int hotOpen;
    private int mCacheHitType;
    private int mClearHitType;
    private int mLaunchMsgType;
    private int mReInitNewRNRuntimeEnable;
    private int maxCacheSize;
    private String model;
    private int modelSupport;
    private long openTimeCost;
    private long packageId;
    private long pluginId;
    private int reuseStatus;
    private int reuseSwitchStatus;

    public RnPluginOpenTimeInfo(long j, long j2, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.packageId = j;
        this.pluginId = j2;
        this.model = str;
        this.did = str2;
        this.reuseSwitchStatus = i;
        this.modelSupport = i2;
        this.reuseStatus = i3;
        this.maxCacheSize = i4;
        this.curCacheSize = i5;
    }

    public int getCacheHitType() {
        return this.mCacheHitType;
    }

    public int getClearHitType() {
        return this.mClearHitType;
    }

    public int getCurCacheSize() {
        return this.curCacheSize;
    }

    public String getDid() {
        return this.did;
    }

    public int getHotOpen() {
        return this.hotOpen;
    }

    public int getLaunchMsgType() {
        return this.mLaunchMsgType;
    }

    public int getMaxCacheSize() {
        return this.maxCacheSize;
    }

    public String getModel() {
        return this.model;
    }

    public int getModelSupport() {
        return this.modelSupport;
    }

    public long getOpenTimeCost() {
        return this.openTimeCost;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public long getPluginId() {
        return this.pluginId;
    }

    public int getReInitNewRNRuntimeEnable() {
        return this.mReInitNewRNRuntimeEnable;
    }

    public int getReuseStatus() {
        return this.reuseStatus;
    }

    public int getReuseSwitchStatus() {
        return this.reuseSwitchStatus;
    }

    public void setCacheHitType(int i) {
        this.mCacheHitType = i;
    }

    public void setClearHitType(int i) {
        this.mClearHitType = i;
    }

    public void setCurCacheSize(int i) {
        this.curCacheSize = i;
    }

    public void setDid(String str) {
        this.did = str;
    }

    public void setHotOpen(boolean z) {
        if (z) {
            this.hotOpen = 1;
        } else {
            this.hotOpen = 0;
        }
    }

    public void setLaunchMsgType(int i) {
        this.mLaunchMsgType = i;
    }

    public void setMaxCacheSize(int i) {
        this.maxCacheSize = i;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModelSupport(int i) {
        this.modelSupport = i;
    }

    public void setOpenTimeCost(long j) {
        this.openTimeCost = j;
    }

    public void setPackageId(long j) {
        this.packageId = j;
    }

    public void setPluginId(long j) {
        this.pluginId = j;
    }

    public void setReInitNewRNRuntimeEnable(int i) {
        this.mReInitNewRNRuntimeEnable = i;
    }

    public void setReuseStatus(int i) {
        this.reuseStatus = i;
    }

    public void setReuseSwitchStatus(int i) {
        this.reuseSwitchStatus = i;
    }
}
