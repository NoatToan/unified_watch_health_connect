package com.miuipub.internal.hybrid;

/* JADX INFO: loaded from: classes6.dex */
public class Permission {
    private boolean applySubDomain;
    private boolean forbidden;
    private String uri;

    public String getUri() {
        return this.uri;
    }

    public boolean isApplySubDomain() {
        return this.applySubDomain;
    }

    public boolean isForbidden() {
        return this.forbidden;
    }

    public void setApplySubDomain(boolean z) {
        this.applySubDomain = z;
    }

    public void setForbidden(boolean z) {
        this.forbidden = z;
    }

    public void setUri(String str) {
        this.uri = str;
    }
}
