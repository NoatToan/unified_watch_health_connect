package com.huawei.health.h5pro.jsbridge.system.share;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class ShareImageObj extends ShareObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("uri")
    private String f6886a = "";

    @SerializedName("isReport")
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6887b = "";

    public String getFilePath() {
        return this.f6887b;
    }

    public String getUri() {
        return this.f6886a;
    }

    public boolean isReport() {
        return this.d;
    }

    public void setFilePath(String str) {
        this.f6887b = str;
    }

    public void setIsReport(boolean z) {
        this.d = z;
    }

    public void setUri(String str) {
        this.f6886a = str;
    }
}
