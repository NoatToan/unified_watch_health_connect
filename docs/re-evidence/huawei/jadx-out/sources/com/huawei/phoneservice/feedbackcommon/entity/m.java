package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes41.dex */
public class m implements Serializable {
    private static final long serialVersionUID = -8764490769713094093L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("responseCode")
    private String f21845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("responseDesc")
    private String f21846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("responseData")
    private j f21847c;

    public j b() {
        return this.f21847c;
    }

    public String c() {
        return this.f21845a;
    }
}
