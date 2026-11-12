package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class g implements Serializable {
    private static final long serialVersionUID = 7368877497797411927L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileUniqueFlag")
    private String f21834c;

    @SerializedName("appID")
    private String e = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(FaqConstants.FAQ_SHASN)
    private String f21832a = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("model")
    private String f21833b = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    @SerializedName("romVersion")
    private String f = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String g = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String i = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    @SerializedName("countryCode")
    private String j = com.huawei.phoneservice.faq.base.util.i.d().getSdk("country");

    @SerializedName("patchVer")
    private String d = "0";

    public void d(String str) {
        this.f21834c = str;
    }
}
