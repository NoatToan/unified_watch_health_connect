package com.huawei.hms.iapfull.webpay;

import android.content.DialogInterface;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f13788a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        WebViewActivity webViewActivity;
        b bVar;
        y0.b("WebViewActivity", "user click continue");
        if (!this.f13788a.j) {
            webViewActivity = this.f13788a;
            bVar = new b(webViewActivity.e, this.f13788a);
        } else {
            webViewActivity = this.f13788a;
            bVar = new b(webViewActivity.f, this.f13788a);
        }
        webViewActivity.h = bVar;
        this.f13788a.h.b();
    }

    c(WebViewActivity webViewActivity) {
        this.f13788a = webViewActivity;
    }
}
