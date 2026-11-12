package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes41.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("accessToken")
    private String f21860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("reason")
    private String f21861b;

    @SerializedName("serverDomain")
    private String d;

    @SerializedName("resCode")
    private int e;

    public String a() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public String c() {
        return this.f21861b;
    }

    public String e() {
        return this.f21860a;
    }
}
