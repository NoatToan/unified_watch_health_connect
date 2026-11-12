package com.xiaomi.infra.galaxy.fds.result;

/* JADX INFO: loaded from: classes22.dex */
public class NotificationResult {
    private String a;
    private String b;
    private long c;
    private long d;
    private String e;

    public enum NotificationMethod {
        PUT,
        POST,
        DELETE
    }

    public String getBucketName() {
        return this.a;
    }

    public long getContentLength() {
        return this.d;
    }

    public String getMethod() {
        return this.e;
    }

    public String getObjectName() {
        return this.b;
    }

    public long getUpdateTime() {
        return this.c;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setContentLength(long j) {
        this.d = j;
    }

    public void setMethod(String str) {
        this.e = str;
    }

    public void setObjectName(String str) {
        this.b = str;
    }

    public void setUpdateTime(long j) {
        this.c = j;
    }
}
