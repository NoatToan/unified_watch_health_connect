package com.xiaomi.infra.galaxy.fds.model;

/* JADX INFO: loaded from: classes22.dex */
public class AccessLogConfig {
    private String a;
    private boolean b;
    private String c;
    private String d;
    private boolean e;
    private String f;

    public String getBucketName() {
        return this.a;
    }

    public String getCdnLogPrefix() {
        return this.f;
    }

    public String getLogBucketName() {
        return this.c;
    }

    public String getLogPrefix() {
        return this.d;
    }

    public boolean isCdnEnabled() {
        return this.e;
    }

    public boolean isEnabled() {
        return this.b;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setCdnEnabled(boolean z) {
        this.e = z;
    }

    public void setCdnLogPrefix(String str) {
        this.f = str;
    }

    public void setEnabled(boolean z) {
        this.b = z;
    }

    public void setLogBucketName(String str) {
        this.c = str;
    }

    public void setLogPrefix(String str) {
        this.d = str;
    }
}
