package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes34.dex */
public class TokenResult extends CodeResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15894c;

    public TokenResult() {
    }

    public String getToken() {
        return this.f15894c;
    }

    public void setToken(String str) {
        this.f15894c = str;
    }

    public TokenResult(int i) {
        super(i);
    }

    public TokenResult(int i, String str) {
        super(i, str);
    }

    public TokenResult(String str) {
        this.f15894c = str;
    }
}
