package com.huawei.openalliance.ad.views.web;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.cg;
import com.huawei.openalliance.ad.views.interfaces.w;
import com.huawei.operation.utils.Constants;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes12.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21429a = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProgressBar f21430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f21431c;

    @Override // com.huawei.openalliance.ad.views.web.d, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hw.a(f21429a, "shouldOverrideUrlLoading url=%s", str);
        if (a(str)) {
            return true;
        }
        b(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        hw.a(f21429a, "WebResourceRequest url=%s", webResourceRequest.getUrl().toString());
        String string = webResourceRequest.getUrl().toString();
        if (a(string)) {
            return true;
        }
        b(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        hw.a(f21429a, "onReceivedError error:%s", webResourceError.getDescription());
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        hw.a(f21429a, "onReceivedError description:%s", str);
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hw.a(f21429a, "onPageStarted url=%s", str);
        ProgressBar progressBar = this.f21430b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressBar progressBar = this.f21430b;
        if (progressBar != null) {
            progressBar.setVisibility(4);
            this.f21430b.setProgress(100);
        }
        b();
    }

    public void a(ProgressBar progressBar) {
        this.f21430b = progressBar;
    }

    @Override // com.huawei.openalliance.ad.views.web.d
    protected void a(WebView webView) {
        hw.b(f21429a, "onReceivedError");
        webView.loadUrl(Constants.ABOUT_BLANK);
        ProgressBar progressBar = this.f21430b;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.f21430b.setVisibility(4);
        }
        w wVar = this.f21431c;
        if (wVar != null) {
            wVar.a();
        }
    }

    private String c() {
        return cc.a(this.f21431c.getContext()).d() ? "com.android.browser" : "com.android.chrome";
    }

    private void b(String str) {
        String str2;
        String str3;
        Context context = this.f21431c.getContext();
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        cg cgVar = new cg(context);
        SafeIntent safeIntent = new SafeIntent(CommonConstant.ACTION.HWID_SCHEME_URL);
        safeIntent.setData(Uri.parse(str));
        String strA = cgVar.a(safeIntent);
        hw.a(f21429a, "preferred browser:%s", strA);
        if (!TextUtils.isEmpty(strA)) {
            safeIntent.setPackage(strA);
        } else if (cgVar.a(c())) {
            strA = c();
            safeIntent.setPackage(strA);
        }
        try {
            safeIntent.setClipData(com.huawei.openalliance.ad.constant.Constants.CLIP_DATA);
            context.startActivity(safeIntent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.no_browser_tips, 1).show();
            str2 = f21429a;
            str3 = "openUrlByBrowser ActivityNotFoundException";
            hw.d(str2, str3);
        } catch (Exception unused2) {
            str2 = f21429a;
            str3 = "openUrlByBrowser Exception";
            hw.d(str2, str3);
        }
    }

    private void b() {
        hw.b(f21429a, "onPageFinished");
        this.f21431c.c();
    }

    private boolean a(String str) {
        Context context = this.f21431c.getContext();
        if (context != null && !TextUtils.isEmpty(str)) {
            if (TextUtils.equals(str, "oobe://more")) {
                try {
                    Intent intent = new Intent();
                    intent.setClassName("com.huawei.systemmanager", "com.huawei.dataprivacycenter.MainActivity");
                    intent.setClipData(com.huawei.openalliance.ad.constant.Constants.CLIP_DATA);
                    context.startActivity(intent);
                } catch (Exception e) {
                    hw.c(f21429a, e.getClass().getSimpleName());
                }
                return true;
            }
            if (!str.startsWith("http")) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (context.getPackageManager().queryIntentActivities(uri, 0).size() > 0) {
                        uri.setClipData(com.huawei.openalliance.ad.constant.Constants.CLIP_DATA);
                        context.startActivity(uri);
                    }
                } catch (URISyntaxException e2) {
                    hw.c(f21429a, e2.getClass().getSimpleName());
                }
                return true;
            }
        }
        return false;
    }

    public e(w wVar) {
        this.f21431c = wVar;
    }
}
