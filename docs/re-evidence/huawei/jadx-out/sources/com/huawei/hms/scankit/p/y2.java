package com.huawei.hms.scankit.p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes10.dex */
final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e7 f16430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f16431c;
    int d;
    private int e;
    private d7 f;
    private int g;

    public void a(m2 m2Var, m2 m2Var2) {
    }

    y2(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c2 = (char) (bytes[i] & 255);
            if (c2 == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.f16429a = sb.toString();
        this.f16430b = e7.FORCE_NONE;
        this.f16431c = new StringBuilder(str.length());
        this.e = -1;
    }

    public String d() {
        return this.f16429a;
    }

    public char c() {
        return this.f16429a.charAt(this.d);
    }

    public StringBuilder b() {
        return this.f16431c;
    }

    public int a() {
        return this.f16431c.length();
    }

    public int e() {
        return this.e;
    }

    public void j() {
        this.e = -1;
    }

    public boolean i() {
        return this.d < h();
    }

    private int h() {
        return this.f16429a.length() - this.g;
    }

    public int f() {
        return h() - this.d;
    }

    public d7 g() {
        return this.f;
    }

    public void l() {
        c(a());
    }

    public void k() {
        this.f = null;
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(int i) {
        d7 d7Var = this.f;
        if (d7Var == null || i > d7Var.a()) {
            this.f = d7.a(i, this.f16430b, null, null, true);
        }
    }

    public void a(e7 e7Var) {
        this.f16430b = e7Var;
    }

    public void a(char c2) {
        this.f16431c.append(c2);
    }

    public void a(String str) {
        this.f16431c.append(str);
    }
}
