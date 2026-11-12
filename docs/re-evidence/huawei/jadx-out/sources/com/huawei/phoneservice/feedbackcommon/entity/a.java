package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class a implements Serializable {
    private static final long serialVersionUID = 735508157925975893L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(FaqConstants.FAQ_SHASN)
    private String f21817c;

    @SerializedName("countryCode")
    private String g;

    @SerializedName("appID")
    private String e = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    @SerializedName("model")
    private String d = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("romVersion")
    private String f21815a = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String f21816b = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String i = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    public a(String str, String str2) {
        this.f21817c = str;
        this.g = str2;
    }
}
