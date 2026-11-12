package com.unionpay;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10767b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;

    public d(String str, String str2, Context context, String str3) {
        this.f10766a = str;
        this.f10767b = str2;
        this.c = context;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = String.format(this.f10766a, com.unionpay.utils.b.b(this.f10767b));
            com.unionpay.utils.j.a("uppay", "merUrl: " + str);
            com.unionpay.a.d dVar = new com.unionpay.a.d(str);
            String strA = com.unionpay.utils.b.a(this.c);
            com.unionpay.a.c cVar = new com.unionpay.a.c(dVar, strA);
            int iA = TextUtils.isEmpty(this.f10767b) ? 22 : cVar.a();
            if (iA == 0) {
                UPPayAssistEx.a(this.c, cVar.b(), this.d);
                return;
            }
            if (iA == 22) {
                String str2 = String.format(this.f10766a, "conf_mode_02");
                com.unionpay.utils.j.a("uppay", "baseUrl: " + str2);
                dVar.b(str2);
                com.unionpay.a.c cVar2 = new com.unionpay.a.c(dVar, strA);
                if (cVar2.a() == 0) {
                    UPPayAssistEx.a(this.c, cVar2.b(), this.d);
                }
            }
        } catch (Exception unused) {
        }
    }
}
