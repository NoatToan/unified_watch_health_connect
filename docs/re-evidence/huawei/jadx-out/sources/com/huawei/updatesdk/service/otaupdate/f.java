package com.huawei.updatesdk.service.otaupdate;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class f {
    private static f d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30002c;

    public boolean e() {
        String str = this.f30000a;
        if (str != null) {
            return str.equals(this.f30001b);
        }
        return true;
    }

    public String d() {
        return this.f30002c;
    }

    public void c(String str) {
        this.f30002c = str;
    }

    public void b(String str) {
        this.f30000a = str;
    }

    public String b() {
        return this.f30000a;
    }

    public void a(String str) {
        this.f30001b = str;
    }

    public String a() {
        return !TextUtils.isEmpty(this.f30000a) ? this.f30000a : this.f30001b;
    }

    public static f c() {
        return d;
    }

    private f() {
    }
}
