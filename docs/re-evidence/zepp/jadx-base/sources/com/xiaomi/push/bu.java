package com.xiaomi.push;

import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class bu implements Cloneable {
    public static final String a = l.a;
    public static String b;
    private String c;
    private String d;
    private int e;
    private boolean f = bt.a;
    private boolean g = true;
    private String h;
    private bw i;

    public bu(Map<String, Integer> map, int i, String str, bw bwVar) {
        b(map, i, str, bwVar);
    }

    public static final String a() {
        String str = b;
        if (str != null) {
            return str;
        }
        if (j.m3789a()) {
            return "";
        }
        return j.b() ? a : "app.chat.global.xiaomi.net";
    }

    public static final void a(String str) {
        if (com.xiaomi.channel.commonutils.android.f.m3427a(com.xiaomi.channel.commonutils.android.k.m3431a()) && j.b()) {
            return;
        }
        b = str;
    }

    private void b(Map<String, Integer> map, int i, String str, bw bwVar) {
        this.e = i;
        this.c = str;
        this.i = bwVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m3611a() {
        return this.e;
    }

    public void a(boolean z) {
        this.f = z;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3612a() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo3613a() {
        return null;
    }

    public String b() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public String c() {
        if (this.d == null) {
            this.d = a();
        }
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }
}
