package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes41.dex */
public class h implements Serializable {
    private static final long serialVersionUID = -8764490769713094093L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("responseDesc")
    private String f21835b;

    @SerializedName("responseCode")
    private String d;

    @SerializedName("responseData")
    private q e;

    public q b() {
        return this.e;
    }

    public String d() {
        return this.d;
    }
}
