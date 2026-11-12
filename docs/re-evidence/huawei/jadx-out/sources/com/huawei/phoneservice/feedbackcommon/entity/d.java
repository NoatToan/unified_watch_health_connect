package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.ble.BleConstants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class d implements Serializable {
    private static final long serialVersionUID = -2965823344242365762L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ContentResource.FILE_NAME)
    private String f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("encryptKey")
    private String f21829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("patchSize")
    private long f21830c;

    @SerializedName("fileSize")
    private long d;

    @SerializedName("logType")
    private int e;

    @SerializedName("patchNum")
    private int h;

    @SerializedName("fileHashList")
    private List<ad> i;

    @SerializedName(FaqConstants.FAQ_SHASN)
    private String m;

    @SerializedName("countryCode")
    private String q;

    @SerializedName("appID")
    private String g = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);

    @SerializedName("model")
    private String n = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");

    @SerializedName("romVersion")
    private String l = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String o = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION);

    @SerializedName("osVersion")
    private String k = com.huawei.phoneservice.faq.base.util.i.d().getSdk("osVersion");

    @SerializedName("patchVer")
    private String f = "0";

    @SerializedName("others")
    private String j = BleConstants.WEIGHT_KEY;

    public void b(String str) {
        this.f21828a = str;
    }

    public void b(long j) {
        this.f21830c = j;
    }

    public void e(int i) {
        this.h = i;
    }

    public void a(List<ad> list) {
        this.i = list;
    }

    public void a(String str) {
        this.f21829b = str;
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(int i) {
        this.e = i;
    }

    public d(String str, String str2) {
        this.m = str;
        this.q = str2;
    }
}
