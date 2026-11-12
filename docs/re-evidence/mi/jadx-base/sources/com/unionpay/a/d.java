package com.unionpay.a;

import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10744b;
    private String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10743a = 0;
    private HashMap c = null;
    private byte[] d = null;

    public d(String str) {
        this.f10744b = str;
    }

    public final URL a() {
        try {
            return new URL(this.f10744b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b() {
        return this.f10743a == 1 ? "POST" : "GET";
    }

    public final String c() {
        return this.e;
    }

    public final HashMap d() {
        return this.c;
    }

    public d(String str, byte b2) {
        this.f10744b = str;
    }

    public final void a(String str) {
        if (str != null) {
            this.d = str.getBytes();
            this.e = str;
        }
    }

    public final void b(String str) {
        this.f10744b = str;
    }
}
