package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("uploadUrl")
    private String f21826a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("headers")
    private Map<String, String> f21827c;

    @SerializedName("method")
    private String d;

    @SerializedName("objectId")
    private String e;

    public String toString() {
        return "UploadInfoList{uploadUrl='" + this.f21826a + "', method='" + this.d + "', headers=" + this.f21827c + ", objectId='" + this.e + "'}";
    }

    public String b() {
        return this.f21826a;
    }

    public String a() {
        return this.d;
    }

    public Map<String, String> c() {
        return this.f21827c;
    }
}
