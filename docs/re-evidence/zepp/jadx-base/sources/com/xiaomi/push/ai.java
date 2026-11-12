package com.xiaomi.push;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes22.dex */
public final class ai {
    private String a;
    private int b;

    public ai(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static ai a(String str, int i) {
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                int i2 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                if (i2 > 0) {
                    i = i2;
                }
            } catch (NumberFormatException unused) {
            }
            str = strSubstring;
        }
        return new ai(str, i);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static InetSocketAddress m3495a(String str, int i) {
        ai aiVarA = a(str, i);
        return new InetSocketAddress(aiVarA.m3496a(), aiVarA.a());
    }

    public int a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3496a() {
        return this.a;
    }

    public String toString() {
        if (this.b <= 0) {
            return this.a;
        }
        return this.a + ":" + this.b;
    }
}
