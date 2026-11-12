package com.xiaomi.hm.health.model.app_upgrade;

/* JADX INFO: loaded from: classes21.dex */
public class ResponseLogResult {
    private String cnChangeLog;
    private String enChangeLog;
    private String twChangeLog;

    public String getCnChangeLog() {
        return this.cnChangeLog;
    }

    public String getEnChangeLog() {
        return this.enChangeLog;
    }

    public String getTwChangeLog() {
        return this.twChangeLog;
    }

    public void setCnChangeLog(String cnChangeLog) {
        this.cnChangeLog = cnChangeLog;
    }

    public void setEnChangeLog(String enChangeLog) {
        this.enChangeLog = enChangeLog;
    }

    public void setTwChangeLog(String twChangeLog) {
        this.twChangeLog = twChangeLog;
    }

    public String toString() {
        return "\n----------------\ncnChangeLog:" + this.cnChangeLog + "\ntwChangeLog:" + this.twChangeLog + "\nenChangeLog:" + this.enChangeLog + "\n----------------\n";
    }
}
