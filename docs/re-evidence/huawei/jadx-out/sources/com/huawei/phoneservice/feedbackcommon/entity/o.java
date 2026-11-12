package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class o implements Serializable {
    private static final long serialVersionUID = -3641436311375093508L;

    @SerializedName("uploadTime")
    private String d;

    @SerializedName("fileUniqueFlag")
    private String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("appID")
    private String f21849a = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(FaqConstants.FAQ_SHASN)
    private String f21850b = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);

    @SerializedName("model")
    private String g = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("romVersion")
    private String f21851c = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String i = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String h = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    @SerializedName("countryCode")
    private String j = com.huawei.phoneservice.faq.base.util.i.d().getSdk("country");

    public void b(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.e = str;
    }
}
