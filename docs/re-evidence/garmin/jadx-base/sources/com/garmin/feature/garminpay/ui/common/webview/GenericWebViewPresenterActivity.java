package com.garmin.feature.garminpay.ui.common.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.android.apps.connectmobile.R;
import hn2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/webview/GenericWebViewPresenterActivity;", "Lhn2/c;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GenericWebViewPresenterActivity extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f51891g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/webview/GenericWebViewPresenterActivity$b;", "Landroid/webkit/WebViewClient;", "<init>", "(Lcom/garmin/feature/garminpay/ui/common/webview/GenericWebViewPresenterActivity;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            c.ba(GenericWebViewPresenterActivity.this, Boolean.FALSE, null, null, 14);
            webView.setVisibility(0);
            super.onPageFinished(webView, str);
        }
    }

    static {
        new a(null);
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f51891g != null) {
            super.onBackPressed();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_web_view_presenter, c.a.UP, getIntent().getStringExtra("ExtraActionBarTitle"));
        WebView webView = (WebView) findViewById(R.id.containedWebView);
        this.f51891g = webView;
        if (webView != null) {
            webView.setWebViewClient(new b());
        }
        WebView webView2 = this.f51891g;
        if (webView2 != null) {
            String stringExtra = getIntent().getStringExtra("ExtraUrl");
            if (stringExtra == null) {
                stringExtra = "";
            }
            webView2.loadUrl(stringExtra);
        }
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/webview/GenericWebViewPresenterActivity$a;", "", "<init>", "()V", "", "EXTRA_URL", "Ljava/lang/String;", "EXTRA_ACTION_BAR_TITLE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
