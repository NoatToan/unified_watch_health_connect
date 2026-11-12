package com.xiaomi.fitness.privacy.logoff;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0010\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/privacy/logoff/PassportWebViewClientKotlin;", "Landroid/webkit/WebViewClient;", "webView", "Lcom/xiaomi/fitness/privacy/logoff/PassportWebViewKotlin;", "<init>", "(Lcom/xiaomi/fitness/privacy/logoff/PassportWebViewKotlin;)V", "onReceivedLoginRequest", "", "view", "Landroid/webkit/WebView;", "realm", "", "account", "args", "onPageFinished", "url", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PassportWebViewClientKotlin extends WebViewClient {

    @NotNull
    private final PassportWebViewKotlin webView;

    public PassportWebViewClientKotlin(@NotNull PassportWebViewKotlin webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        this.webView.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        this.webView.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(@Nullable WebView view, @Nullable String realm, @Nullable String account, @Nullable String args) {
        this.webView.onReceivedLoginRequest(realm, args);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.webView.shouldOverrideUrlLoading(view, url);
    }
}
