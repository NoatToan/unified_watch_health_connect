package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes41.dex */
public class n implements Serializable {
    private static final long serialVersionUID = -8764490769713094093L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("responseCode")
    private String f21848b;

    @SerializedName("responseDesc")
    private String d;

    @SerializedName("responseData")
    private y e;

    public String d() {
        return this.d;
    }

    public y b() {
        return this.e;
    }

    public String a() {
        return this.f21848b;
    }
}
