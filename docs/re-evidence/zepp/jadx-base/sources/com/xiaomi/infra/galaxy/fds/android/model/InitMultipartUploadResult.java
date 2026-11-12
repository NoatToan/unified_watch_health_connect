package com.xiaomi.infra.galaxy.fds.android.model;

/* JADX INFO: loaded from: classes22.dex */
public class InitMultipartUploadResult {
    private String a;
    private String b;
    private String c;

    public String getBucketName() {
        return this.a;
    }

    public String getObjectName() {
        return this.b;
    }

    public String getUploadId() {
        return this.c;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setObjectName(String str) {
        this.b = str;
    }

    public void setUploadId(String str) {
        this.c = str;
    }
}
