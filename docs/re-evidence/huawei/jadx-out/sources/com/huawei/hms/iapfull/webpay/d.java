package com.huawei.hms.iapfull.webpay;

import android.content.DialogInterface;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f13789a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        y0.b("WebViewActivity", "user click cancel");
        WebViewActivity webViewActivity = this.f13789a;
        webViewActivity.a(WebViewActivity.e(webViewActivity), "Device has been rooted, payment cancelled by user");
    }

    d(WebViewActivity webViewActivity) {
        this.f13789a = webViewActivity;
    }
}
