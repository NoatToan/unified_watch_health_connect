package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("currentTime")
    private String f21854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resCode")
    private int f21855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("uploadInfoList")
    private List<c> f21856c;

    @SerializedName("reason")
    private String d;

    @SerializedName("fileUniqueFlag")
    private String e;

    @SerializedName("patchPolicyList")
    private i f;

    @SerializedName("policy")
    private String i;

    public String toString() {
        return "UploadInfoResponse{reason='" + this.d + "', resCode=" + this.f21855b + ", fileUniqueFlag='" + this.e + "', currentTime='" + this.f21854a + "', uploadInfoList=" + this.f21856c + ", policy='" + this.i + "', patchPolicyList=" + this.f + '}';
    }

    public List<c> b() {
        return this.f21856c;
    }

    public int c() {
        return this.f21855b;
    }

    public String a() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}
