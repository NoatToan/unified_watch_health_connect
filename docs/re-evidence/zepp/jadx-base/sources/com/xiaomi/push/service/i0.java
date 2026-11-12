package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
final class i0 extends com.xiaomi.push.o.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Notification e;

    public i0(int i, String str, Context context, String str2, Notification notification) {
        this.a = i;
        this.b = str;
        this.c = context;
        this.d = str2;
        this.e = notification;
    }

    @Override // com.xiaomi.push.o.a
    public String a() {
        return br.i(this.a, this.b);
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public void run() {
        br.k(this.c, this.d, this.a, this.b, this.e);
    }
}
