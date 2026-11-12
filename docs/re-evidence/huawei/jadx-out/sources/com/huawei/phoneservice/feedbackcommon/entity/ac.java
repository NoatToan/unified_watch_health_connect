package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("problemCatalogCode")
    private String f21819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("emuiLanguageCode")
    private String f21820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("problemSourceCode")
    private String f21821c;

    @SerializedName("countryCode")
    private String d;

    @SerializedName("languageCode")
    private String e;

    @SerializedName("problemDesc")
    private String f;

    @SerializedName("logPath")
    private String g;

    @SerializedName("sn")
    private String h;

    @SerializedName("contact")
    private String i;

    @SerializedName("attachs")
    private List<String> j;

    @SerializedName("appVersion")
    private String k;

    @SerializedName(FaqConstants.FAQ_SOFT_VERSION)
    private String l;

    @SerializedName(FaqConstants.FAQ_EMUIVERSION)
    private String m;

    @SerializedName("model")
    private String n;

    @SerializedName("accessToken")
    private String o;

    @SerializedName("uniqueCode")
    private String p;

    @SerializedName("parentProblemId")
    private String q;

    @SerializedName("srno")
    private String r;

    @SerializedName("uploadUrls")
    private List<FeedbackZipBean> s;

    @SerializedName("id")
    private Long t;

    public void s(String str) {
        this.p = str;
    }

    public void p(String str) {
        this.r = str;
    }

    public void o(String str) {
        this.l = str;
    }

    public void n(String str) {
        this.h = str;
    }

    public void l(String str) {
        this.f21821c = str;
    }

    public void m(String str) {
        this.f = str;
    }

    public void k(String str) {
        this.f21819a = str;
    }

    public void i(String str) {
        this.q = str;
    }

    public void g(String str) {
        this.n = str;
    }

    public void h(String str) {
        this.g = str;
    }

    public void j(String str) {
        this.e = str;
    }

    public void f(String str) {
        this.m = str;
    }

    public void d(String str) {
        this.f21820b = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void d(List<FeedbackZipBean> list) {
        this.s = list;
    }

    public void a(String str) {
        this.k = str;
    }

    public void e(List<String> list) {
        this.j = list;
    }

    public void c(String str) {
        this.o = str;
    }

    public void b(Long l) {
        this.t = l;
    }
}
