package com.amap.api.mapcore.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ix {
    private Context a;
    private gt b;
    private String c;

    public ix(Context context, gt gtVar, String str) {
        this.a = context.getApplicationContext();
        this.b = gtVar;
        this.c = str;
    }

    public final byte[] a() {
        return gu.a(a(this.a, this.b, this.c));
    }

    private static String a(Context context, gt gtVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(gtVar.c());
            sb.append("\",\"product\":\"");
            sb.append(gtVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(gn.d(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }
}
