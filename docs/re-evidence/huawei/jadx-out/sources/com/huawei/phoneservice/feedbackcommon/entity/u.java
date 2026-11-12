package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;

/* JADX INFO: loaded from: classes41.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fileUniqueFlag")
    private String f21866b;

    @SerializedName("uploadTime")
    private String d;

    @SerializedName(FaqConstants.FAQ_SHASN)
    private String e;

    @SerializedName("countryCode")
    private String g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("appID")
    private String f21867c = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    @SerializedName("model")
    private String i = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("romVersion")
    private String f21865a = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String h = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String j = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    public void c(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.f21866b = str;
    }

    public u(String str, String str2) {
        this.e = str;
        this.g = str2;
    }
}
