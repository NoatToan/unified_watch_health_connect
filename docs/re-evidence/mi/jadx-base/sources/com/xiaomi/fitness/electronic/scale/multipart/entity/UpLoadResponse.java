package com.xiaomi.fitness.electronic.scale.multipart.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class UpLoadResponse implements Serializable {
    private String accessKeyId;
    private String bucketName;
    private long expires;
    private String objectName;
    private String signature;

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public long getExpires() {
        return this.expires;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setExpires(long j) {
        this.expires = j;
    }

    public void setObjectName(String str) {
        this.objectName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }
}
