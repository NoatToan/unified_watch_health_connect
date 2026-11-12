package com.xiaomi.infra.galaxy.fds.bean;

/* JADX INFO: loaded from: classes22.dex */
public class ExistModeBean {
    public String a;
    public String b;
    public int c;
    public MetadataBean d;

    public ExistModeBean() {
    }

    public String getBucketName() {
        return this.a;
    }

    public MetadataBean getMetadataBean() {
        return this.d;
    }

    public int getMode() {
        return this.c;
    }

    public String getObjectName() {
        return this.b;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setMetadataBean(MetadataBean metadataBean) {
        this.d = metadataBean;
    }

    public void setMode(int i) {
        this.c = i;
    }

    public void setObjectName(String str) {
        this.b = str;
    }

    public ExistModeBean(String str, String str2, int i, MetadataBean metadataBean) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = metadataBean;
    }
}
