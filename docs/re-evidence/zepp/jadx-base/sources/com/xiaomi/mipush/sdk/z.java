package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
final class z implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    public z(String str, Context context, c cVar) {
        this.a = str;
        this.b = context;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strSubstring;
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        String[] strArrSplit = this.a.split(Constants.WAVE_SEPARATOR);
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strSubstring = "";
                break;
            }
            String str = strArrSplit[i];
            if (!TextUtils.isEmpty(str) && str.startsWith("token:")) {
                strSubstring = str.substring(str.indexOf(":") + 1);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : receive correct token");
        g.h(this.b, this.c, strSubstring);
        g.e(this.b);
    }
}
