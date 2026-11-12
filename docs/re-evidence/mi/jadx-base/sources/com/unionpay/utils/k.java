package com.unionpay.utils;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class k {
    private static k f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10818a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10819b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    public static k a() {
        if (f == null) {
            f = Locale.getDefault().toString().startsWith("zh") ? new l() : new m();
        }
        return f;
    }
}
