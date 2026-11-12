package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private long f21841a;

    @SerializedName("uniqueCode")
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public void e(long j) {
        this.f21841a = j;
    }
}
