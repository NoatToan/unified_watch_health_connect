package com.huawei.updatesdk.service.bean;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final Object e = new Object();
    private static volatile a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f29941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29943c;
    private boolean d = false;

    public void d(String str) {
        this.f29943c = str;
    }

    public void d() {
        if (this.d) {
            return;
        }
        b("updatesdk.sign.param");
        b("updatesdk.signkey");
        b("updatesdk.signtime");
        b("updatesdk.lastInitAccountTime" + this.f29943c);
        b("updatesdk.lastAccountZone" + this.f29943c);
        this.d = true;
    }

    public void c(String str) {
        this.f29942b = str;
    }

    public void b(String str) {
        this.f29941a.a(str);
    }

    public long b() {
        return this.f29941a.a("updatesdk.lastCheckDate", 0L);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29941a.b(str, str2);
    }

    public void a(long j) {
        this.f29941a.b("updatesdk.lastCheckDate", j);
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? "" : this.f29941a.a(str, "");
    }

    public String a() {
        return this.f29942b;
    }

    public static a c() {
        if (f == null) {
            synchronized (e) {
                if (f == null) {
                    f = new a(com.huawei.updatesdk.sdk.service.app.a.c().a());
                }
            }
        }
        return f;
    }

    private a(Context context) {
        this.f29941a = b.a("DeviceSessionUpdateSDK_V1", context);
    }
}
