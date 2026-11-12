package com.xiaomi.infra.galaxy.fds.model;

/* JADX INFO: loaded from: classes22.dex */
public class TimestampAntiStealingLinkConfig {
    private boolean a;
    private String b;
    private String c;

    public String getPrimaryKey() {
        return this.b;
    }

    public String getSecondaryKey() {
        return this.c;
    }

    public boolean isEnabled() {
        return this.a;
    }

    public void setEnabled(boolean z) {
        this.a = z;
    }

    public void setPrimaryKey(String str) {
        this.b = str;
    }

    public void setSecondaryKey(String str) {
        this.c = str;
    }
}
