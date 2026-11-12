package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resCode")
    private int f21838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("uploadInfoList")
    private List<c> f21839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileUniqueFlag")
    private String f21840c;

    @SerializedName("currentTime")
    private String d;

    @SerializedName("reason")
    private String e;

    @SerializedName("policy")
    private String h;

    @SerializedName("patchPolicyList")
    private i j;

    public String toString() {
        return "UploadInfoResponse{reason='" + this.e + "', resCode=" + this.f21838a + ", fileUniqueFlag='" + this.f21840c + "', currentTime='" + this.d + "', uploadInfoList=" + this.f21839b + ", policy='" + this.h + "', patchPolicyList=" + this.j + '}';
    }

    public List<c> d() {
        return this.f21839b;
    }

    public int c() {
        return this.f21838a;
    }

    public String a() {
        return this.e;
    }

    public i b() {
        return this.j;
    }

    public String e() {
        return this.f21840c;
    }
}
