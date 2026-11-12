package com.amap.api.col.p0003sl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ix f3047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3048c;

    public lg(Context context, ix ixVar, String str) {
        this.f3046a = context.getApplicationContext();
        this.f3047b = ixVar;
        this.f3048c = str;
    }

    final byte[] a() {
        return iy.a(a(this.f3046a, this.f3047b, this.f3048c));
    }

    private static String a(Context context, ix ixVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(ixVar.c());
            sb.append("\",\"product\":\"");
            sb.append(ixVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(ip.c(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }
}
