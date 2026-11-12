package com.unionpay;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10773b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;
    final /* synthetic */ IUnionCallback e;
    final /* synthetic */ g f;

    public i(g gVar, String str, String str2, Context context, String str3, IUnionCallback iUnionCallback) {
        this.f = gVar;
        this.f10772a = str;
        this.f10773b = str2;
        this.c = context;
        this.d = str3;
        this.e = iUnionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f.f10769a.sendEmptyMessageDelayed(1006, 5000L);
            String str = String.format(this.f10772a, com.unionpay.utils.b.b(this.f10773b));
            com.unionpay.utils.j.a("uppay", "merUrl: " + str);
            com.unionpay.a.d dVar = new com.unionpay.a.d(str);
            String strA = com.unionpay.utils.b.a(this.c);
            com.unionpay.a.c cVar = new com.unionpay.a.c(dVar, strA);
            int iA = TextUtils.isEmpty(this.f10773b) ? 22 : cVar.a();
            if (iA == 0) {
                ArrayList<String> arrayListA = this.f.a(this.c, cVar.b(), this.d);
                if (this.f.f10769a != null) {
                    this.f.f10769a.removeMessages(1006);
                    if (this.f.f10770b || this.f.c == null) {
                        return;
                    }
                    Message messageObtainMessage = this.f.f10769a.obtainMessage();
                    messageObtainMessage.what = 1007;
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("directApps", arrayListA);
                    messageObtainMessage.setData(bundle);
                    this.f.f10769a.sendMessage(messageObtainMessage);
                    return;
                }
                return;
            }
            if (iA != 22) {
                if (this.f.f10769a != null) {
                    this.f.f10769a.removeMessages(1006);
                }
                if (this.f.f10770b || this.f.c == null) {
                    return;
                }
                this.e.onError("02", "network error");
                g.c(this.f);
                return;
            }
            String str2 = String.format(this.f10772a, "conf_mode_02");
            dVar.b(str2);
            com.unionpay.utils.j.a("uppay", "baseUrl: " + str2);
            com.unionpay.a.c cVar2 = new com.unionpay.a.c(dVar, strA);
            int iA2 = cVar2.a();
            if (this.f.f10769a != null) {
                this.f.f10769a.removeMessages(1006);
            }
            if (iA2 != 0) {
                if (this.f.f10770b || this.f.c == null) {
                    return;
                }
                this.e.onError("02", "network error");
                g.c(this.f);
                return;
            }
            ArrayList<String> arrayListA2 = this.f.a(this.c, cVar2.b(), this.d);
            if (this.f.f10770b || this.f.c == null || this.f.f10769a == null) {
                return;
            }
            Message messageObtainMessage2 = this.f.f10769a.obtainMessage();
            messageObtainMessage2.what = 1007;
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("directApps", arrayListA2);
            messageObtainMessage2.setData(bundle2);
            this.f.f10769a.sendMessage(messageObtainMessage2);
        } catch (Exception unused) {
            if (this.f.f10769a != null) {
                this.f.f10769a.removeMessages(1006);
            }
            if (this.f.f10770b || this.f.c == null) {
                return;
            }
            this.e.onError("03", "unknown error");
            g.c(this.f);
        }
    }
}
