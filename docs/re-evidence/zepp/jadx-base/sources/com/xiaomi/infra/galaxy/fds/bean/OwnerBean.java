package com.xiaomi.infra.galaxy.fds.bean;

/* JADX INFO: loaded from: classes22.dex */
public class OwnerBean {
    private String a;
    private String b;

    public OwnerBean() {
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getId() {
        return this.a;
    }

    public void setDisplayName(String str) {
        this.b = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public OwnerBean(String str) {
        this.a = str;
    }

    public OwnerBean(String str, String str2) {
        this.a = str;
        setDisplayName(str2);
    }
}
