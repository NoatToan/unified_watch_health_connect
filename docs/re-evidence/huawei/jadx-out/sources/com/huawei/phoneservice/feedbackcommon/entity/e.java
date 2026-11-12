package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appId")
    private String f21831b;

    @SerializedName("problemIdList")
    private List<String> d;

    @SerializedName("accessToken")
    private String e;

    public void e(String str) {
        this.f21831b = str;
    }

    public void c(List<String> list) {
        this.d = list;
    }

    public void a(String str) {
        this.e = str;
    }
}
