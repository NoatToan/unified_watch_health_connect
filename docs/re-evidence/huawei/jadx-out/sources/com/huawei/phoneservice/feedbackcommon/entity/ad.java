package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class ad implements Serializable {
    private static final long serialVersionUID = -8045680007893341280L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fileMd5")
    private String f21822a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fileSize")
    private long f21823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileSha256")
    private String f21824c;

    public void a(String str) {
        this.f21824c = str;
    }

    public void d(long j) {
        this.f21823b = j;
    }
}
