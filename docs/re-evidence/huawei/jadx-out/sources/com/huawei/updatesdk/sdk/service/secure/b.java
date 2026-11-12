package com.huawei.updatesdk.sdk.service.secure;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f29918a;

    public boolean d() {
        return this.f29918a != null;
    }

    public Intent c() {
        return this.f29918a;
    }

    public Bundle b() {
        if (d()) {
            return this.f29918a.getExtras();
        }
        return null;
    }

    public long b(String str, int i) {
        if (d()) {
            try {
                return this.f29918a.getLongExtra(str, i);
            } catch (Throwable unused) {
                com.huawei.updatesdk.sdk.foundation.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i;
    }

    public boolean a(String str, boolean z) {
        if (d()) {
            try {
                return this.f29918a.getBooleanExtra(str, z);
            } catch (Throwable unused) {
                com.huawei.updatesdk.sdk.foundation.a.a("SecureIntent", "getBooleanExtra exception!");
            }
        }
        return z;
    }

    public String a(String str) {
        if (!d()) {
            return "";
        }
        try {
            return this.f29918a.getStringExtra(str);
        } catch (Throwable unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("SecureIntent", "getStringExtra exception!");
            return "";
        }
    }

    public String a() {
        String action;
        return (!d() || (action = this.f29918a.getAction()) == null) ? "" : action;
    }

    public int a(String str, int i) {
        if (d()) {
            try {
                return this.f29918a.getIntExtra(str, i);
            } catch (Throwable unused) {
                com.huawei.updatesdk.sdk.foundation.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i;
    }

    public static b a(Intent intent) {
        return new b(intent);
    }

    private b(Intent intent) {
        this.f29918a = intent;
    }
}
