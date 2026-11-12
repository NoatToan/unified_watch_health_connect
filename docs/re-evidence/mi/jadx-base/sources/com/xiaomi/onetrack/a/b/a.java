package com.xiaomi.onetrack.a.b;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.p;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13702a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13703b = 1;
    public static final int c = 2;
    private static final String d = "AdMonitor";
    private int e;
    private String f;
    private long g;
    private String h = "";
    private String i = "";
    private String j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13704k = 0;

    public String a() {
        return this.j;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public String e() {
        return this.h;
    }

    public String f() {
        return this.i;
    }

    public int g() {
        return this.f13704k;
    }

    public boolean h() {
        try {
            return (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.i)) ? false : true;
        } catch (Exception e) {
            p.a(d, "check AdMonitor isValid error:" + e.getMessage());
            return false;
        }
    }

    public void a(String str) {
        this.j = str;
    }

    public void b(String str) {
        this.f = str;
    }

    public void c(String str) {
        this.h = str;
    }

    public void d(String str) {
        this.i = str;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f13704k = i;
    }

    public void a(long j) {
        this.g = j;
    }
}
