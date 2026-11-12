package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class v implements Serializable {
    private static final long serialVersionUID = -4589818087876763047L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("problemSourceCode")
    private String f21868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("languageCode")
    private String f21869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("emuiLanguageCode")
    private String f21870c;

    @SerializedName("countryCode")
    private String d;

    public v(String str, String str2, String str3, String str4) {
        this.f21868a = str;
        this.d = str2;
        this.f21869b = str3;
        this.f21870c = str4;
    }
}
