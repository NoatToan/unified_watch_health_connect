package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes41.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("patchNum")
    private String f21836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("patchVer")
    private String f21837b;

    @SerializedName("patchSize")
    private String d;

    public String toString() {
        return "UploadPatchPolicyList{patchVer='" + this.f21837b + "', patchNum='" + this.f21836a + "', patchSize='" + this.d + "'}";
    }

    public String a() {
        return this.f21836a;
    }
}
