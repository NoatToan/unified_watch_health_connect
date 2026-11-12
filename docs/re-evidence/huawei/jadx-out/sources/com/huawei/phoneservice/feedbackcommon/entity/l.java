package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.ble.BleConstants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l implements Serializable {
    private static final long serialVersionUID = -8115898618013300188L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("patchNum")
    private int f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fileSize")
    private long f21843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("patchSize")
    private long f21844c;

    @SerializedName(ContentResource.FILE_NAME)
    private String d;

    @SerializedName("fileHashList")
    private List<ad> i;

    @SerializedName("appID")
    private String f = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    @SerializedName(FaqConstants.FAQ_SHASN)
    private String h = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);

    @SerializedName("model")
    private String o = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    @SerializedName("romVersion")
    private String m = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String j = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String k = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    @SerializedName("countryCode")
    private String n = com.huawei.phoneservice.faq.base.util.i.d().getSdk("country");

    @SerializedName("patchVer")
    private String g = "0";

    @SerializedName("logType")
    private int e = 0;

    @SerializedName("others")
    private String l = BleConstants.WEIGHT_KEY;

    public void a(long j) {
        this.f21844c = j;
    }

    public void a(List<ad> list) {
        this.i = list;
    }

    public void c(String str) {
        this.d = str;
    }

    public void b(long j) {
        this.f21843b = j;
    }

    public void c(int i) {
        this.f21842a = i;
    }
}
