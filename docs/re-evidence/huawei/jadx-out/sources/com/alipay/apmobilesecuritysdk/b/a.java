package com.alipay.apmobilesecuritysdk.b;

import defpackage.kj;
import defpackage.ly;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f2024b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2025a = 0;

    public String c() {
        String str;
        String strA = ly.a();
        if (kj.e(strA)) {
            return strA;
        }
        int i = this.f2025a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }

    public int b() {
        return this.f2025a;
    }

    public void a(int i) {
        this.f2025a = i;
    }

    private String a(String str, String str2) {
        return str + str2;
    }

    public static a a() {
        return f2024b;
    }
}
