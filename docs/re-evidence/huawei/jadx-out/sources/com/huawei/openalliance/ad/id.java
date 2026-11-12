package com.huawei.openalliance.ad;

import android.os.Process;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes12.dex */
public class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18947c;
    private String e;
    private int f;
    private long d = 0;
    private final StringBuilder g = new StringBuilder();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        b(sb);
        return sb.toString();
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    public <T> id a(T t) {
        this.g.append(t);
        return this;
    }

    private id c() {
        this.d = System.currentTimeMillis();
        this.e = Thread.currentThread().getName();
        this.f = Process.myPid();
        return this;
    }

    private StringBuilder b(StringBuilder sb) {
        sb.append(' ');
        sb.append((CharSequence) this.g);
        return sb;
    }

    private StringBuilder a(StringBuilder sb) {
        SimpleDateFormat simpleDateFormatA = com.huawei.openalliance.ad.utils.as.a("yyyy-MM-dd HH:mm:ss.SSS");
        sb.append('[');
        sb.append(simpleDateFormatA.format(Long.valueOf(this.d)));
        String strA = ia.a(this.f18947c);
        sb.append(' ');
        sb.append(strA);
        sb.append('/');
        sb.append(this.f18945a);
        sb.append('/');
        sb.append(this.f18946b);
        sb.append(' ');
        sb.append(this.f);
        sb.append(':');
        sb.append(this.e);
        sb.append(']');
        return sb;
    }

    id(String str, int i, String str2) {
        this.f18945a = null;
        this.f18946b = "HA";
        this.f18947c = 0;
        this.f18945a = str;
        this.f18947c = i;
        if (str2 != null) {
            this.f18946b = str2;
        }
        c();
    }
}
