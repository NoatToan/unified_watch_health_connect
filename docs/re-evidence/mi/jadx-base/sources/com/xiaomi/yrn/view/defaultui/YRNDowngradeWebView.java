package com.xiaomi.yrn.view.defaultui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.miui.tsmclient.database.DatabaseConstants;
import defpackage.bzr;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDowngradeWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f14543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f14544b;

    public class a implements DownloadListener {
        public a() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            YRNDowngradeWebView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public static class b extends WebChromeClient {

        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f14546a;

            public a(JsResult jsResult) {
                this.f14546a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f14546a.confirm();
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.yrn.view.defaultui.YRNDowngradeWebView$b$b, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0903b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f14548a;

            public DialogInterfaceOnClickListenerC0903b(JsResult jsResult) {
                this.f14548a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f14548a.confirm();
            }
        }

        public class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f14550a;

            public c(JsResult jsResult) {
                this.f14550a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f14550a.cancel();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            androidx.appcompat.app.a.C0006a c0006a = new androidx.appcompat.app.a.C0006a(webView.getContext());
            c0006a.e(str2);
            c0006a.i("确定", new a(jsResult));
            c0006a.b(false);
            c0006a.create().show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            androidx.appcompat.app.a.C0006a c0006a = new androidx.appcompat.app.a.C0006a(webView.getContext());
            c0006a.e(str2);
            c0006a.i("确定", new DialogInterfaceOnClickListenerC0903b(jsResult));
            c0006a.g("取消", new c(jsResult));
            c0006a.b(false);
            c0006a.create().show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            bzr.k("" + str2);
            return true;
        }
    }

    public static class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            if (str.startsWith("tel") || str.startsWith("mailto")) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("tmall") || str.startsWith("taobao")) {
                Uri uri = Uri.parse(str);
                Intent intent = new Intent();
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(uri);
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(uri);
                    context.startActivity(intent2);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public YRNDowngradeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void a(Context context) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(getContext().getDir(DatabaseConstants.TABLE_CACHE, 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setUserAgentString(settings.getUserAgentString());
        setWebChromeClient(new b());
        setWebViewClient(new c());
        setDownloadListener(new a());
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (webChromeClient instanceof b) {
            this.f14544b = (b) webChromeClient;
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient instanceof c) {
            this.f14543a = (c) webViewClient;
        }
        super.setWebViewClient(webViewClient);
    }
}
