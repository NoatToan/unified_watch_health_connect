package com.xiaomi.hm.health.model.app_upgrade;

/* JADX INFO: loaded from: classes21.dex */
public class ResponseVersionResult {
    private String versionName;
    private String versionTitle;

    public String getVersionName() {
        return this.versionName;
    }

    public String getVersionTitle() {
        return this.versionTitle;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public void setVersionTitle(String versionTitle) {
        this.versionTitle = versionTitle;
    }

    public String toString() {
        return "\n----------------\nversionName:" + this.versionName + "\nversionTitle:" + this.versionTitle + "\n----------------\n";
    }
}
