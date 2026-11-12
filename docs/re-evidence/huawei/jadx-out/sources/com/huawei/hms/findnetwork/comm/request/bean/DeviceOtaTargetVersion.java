package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class DeviceOtaTargetVersion {
    private String description;
    private boolean needUpgrade;
    private String sn;
    private String targetVersion;

    public void setTargetVersion(String str) {
        this.targetVersion = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setNeedUpgrade(boolean z) {
        this.needUpgrade = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public boolean isNeedUpgrade() {
        return this.needUpgrade;
    }

    public String getTargetVersion() {
        return this.targetVersion;
    }

    public String getSn() {
        return this.sn;
    }

    public String getDescription() {
        return this.description;
    }
}
