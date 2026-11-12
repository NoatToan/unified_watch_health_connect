package com.huawei.openalliance.ad;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes12.dex */
public class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f18835a;

    public String toString() {
        try {
            return this.f18835a.toString();
        } catch (Throwable unused) {
            hw.d("SafeBundle", "toString exception.");
            return null;
        }
    }

    public IBinder e(String str) {
        try {
            return this.f18835a.getBinder(str);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getBinder exception ex.");
            return null;
        }
    }

    public String d(String str) {
        try {
            return this.f18835a.getString(str);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getString exception ex.");
            return "";
        }
    }

    public long c(String str) {
        return a(str, 0L);
    }

    public gr b(String str, boolean z) {
        try {
            this.f18835a.putBoolean(str, z);
            return this;
        } catch (Throwable unused) {
            hw.d("SafeBundle", "putBoolean exception ex.");
            return this;
        }
    }

    public gr b(String str, String str2) {
        try {
            this.f18835a.putString(str, str2);
            return this;
        } catch (Throwable unused) {
            hw.d("SafeBundle", "putString exception ex.");
            return this;
        }
    }

    public gr b(String str, long j) {
        try {
            this.f18835a.putLong(str, j);
            return this;
        } catch (Throwable unused) {
            hw.d("SafeBundle", "putLong exception ex.");
            return this;
        }
    }

    public gr b(String str, int i) {
        try {
            this.f18835a.putInt(str, i);
            return this;
        } catch (Throwable unused) {
            hw.d("SafeBundle", "putInt exception ex.");
            return this;
        }
    }

    public int b(String str) {
        return a(str, 0);
    }

    public boolean a(String str, boolean z) {
        try {
            return this.f18835a.getBoolean(str, z);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getBoolean exception  ex.");
            return z;
        }
    }

    public boolean a(String str) {
        return a(str, false);
    }

    public String a(String str, String str2) {
        try {
            return this.f18835a.getString(str, str2);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getString exception ex.");
            return str2;
        }
    }

    public gr a(String str, IBinder iBinder) {
        try {
            this.f18835a.putBinder(str, iBinder);
            return this;
        } catch (Throwable unused) {
            hw.d("SafeBundle", "putBundle exception ex.");
            return this;
        }
    }

    public Bundle a() {
        return this.f18835a;
    }

    public long a(String str, long j) {
        try {
            return this.f18835a.getLong(str, j);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getLong exception ex.");
            return j;
        }
    }

    public int a(String str, int i) {
        try {
            return this.f18835a.getInt(str, i);
        } catch (Throwable unused) {
            hw.d("SafeBundle", "getInt exception ex.");
            return i;
        }
    }

    public gr(Bundle bundle) {
        this.f18835a = bundle == null ? new Bundle() : bundle;
    }

    public gr() {
        this(new Bundle());
    }
}
