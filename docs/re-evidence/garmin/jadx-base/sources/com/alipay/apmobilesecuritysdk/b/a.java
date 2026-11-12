package com.alipay.apmobilesecuritysdk.b;

import oi0.c;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f28357b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28358a = 0;

    public static String a(String str, String str2) {
        return k.g(str, str2);
    }

    public final int b() {
        return this.f28358a;
    }

    public final String c() {
        String str;
        if (c.k(null)) {
            return null;
        }
        int i14 = this.f28358a;
        if (i14 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i14 == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i14 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i14 != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }

    public static a a() {
        return f28357b;
    }

    public final void a(int i14) {
        this.f28358a = i14;
    }
}
