package com.xiaomi.infra.galaxy.fds.bean;

/* JADX INFO: loaded from: classes22.dex */
public class GranteeBean {
    private String a;
    private String b;

    public GranteeBean() {
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

    public GranteeBean(String str) {
        this.a = str;
    }

    public GranteeBean(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
