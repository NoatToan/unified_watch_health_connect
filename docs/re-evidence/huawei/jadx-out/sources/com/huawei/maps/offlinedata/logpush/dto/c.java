package com.huawei.maps.offlinedata.logpush.dto;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f17857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17859c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public JSONObject a() {
        return this.f17857a;
    }

    public String b() {
        return this.f17858b;
    }

    public String c() {
        return this.f17859c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.j;
    }

    public String k() {
        return this.k;
    }

    public void a(String str) {
        a("", str);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str)) {
            this.f17858b = str2;
            return;
        }
        this.f17858b = str + " : " + str2;
    }
}
