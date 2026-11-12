package com.huawei.hms.iapfull.webpay;

import android.content.DialogInterface;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f13791a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        y0.b("WebViewActivity", "cancel by user");
        WebViewActivity webViewActivity = this.f13791a;
        webViewActivity.a(WebViewActivity.e(webViewActivity), "payment cancelled by user");
    }

    f(WebViewActivity webViewActivity) {
        this.f13791a = webViewActivity;
    }
}
