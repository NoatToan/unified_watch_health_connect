package com.xiaomi.hm.health.model.app_upgrade;

/* JADX INFO: loaded from: classes21.dex */
public class NewResponseUpgradeResult {
    private ResponseLogResult changeLog;
    private String createTime;
    private ResponseFileResult fileInfo;
    private int status;
    private int updateTime;
    private int upgradeType;
    private int versionCode;
    private ResponseVersionResult versionInfo;

    public ResponseLogResult getChangeLog() {
        return this.changeLog;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ResponseFileResult getFileInfo() {
        return this.fileInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public int getUpdateTime() {
        return this.updateTime;
    }

    public int getUpgradeType() {
        return this.upgradeType;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public ResponseVersionResult getVersionInfo() {
        return this.versionInfo;
    }

    public void setChangeLog(ResponseLogResult changeLog) {
        this.changeLog = changeLog;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setFileInfo(ResponseFileResult fileInfo) {
        this.fileInfo = fileInfo;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    public void setUpgradeType(int upgradeType) {
        this.upgradeType = upgradeType;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public void setVersionInfo(ResponseVersionResult versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String toString() {
        return "\n----------------\nversionCode:" + this.versionCode + "\nchangeLog:" + this.changeLog + "\ncreateTime:" + this.createTime + "\nupgradeType:" + this.upgradeType + "\nupdateTime:" + this.updateTime + "\nfileInfo:" + this.fileInfo + "\nversionInfo:" + this.versionInfo + "\nstatus:" + this.status + "\n----------------\n";
    }
}
