package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;

/* JADX INFO: loaded from: classes41.dex */
public class t {

    @SerializedName(FaqConstants.FAQ_SHASN)
    private String d;

    @SerializedName("fileUniqueFlag")
    private String e;

    @SerializedName("countryCode")
    private String f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appID")
    private String f21863b = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    @SerializedName("model")
    private String g = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    @SerializedName("romVersion")
    private String i = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String h = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("osVersion")
    private String f21862a = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("patchVer")
    private String f21864c = "0";

    public void e(String str) {
        this.e = str;
    }

    public t(String str, String str2) {
        this.d = str;
        this.f = str2;
    }
}
