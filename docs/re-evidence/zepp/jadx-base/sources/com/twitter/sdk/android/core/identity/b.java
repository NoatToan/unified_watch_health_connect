package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthConstants;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* JADX INFO: loaded from: classes18.dex */
class b implements e.a {
    public final c a;
    public TwitterAuthToken b;
    private final ProgressBar c;
    private final WebView d;
    private final TwitterAuthConfig e;
    private final OAuth1aService f;

    public class a extends Callback<OAuthResponse> {
        public a() {
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            Twitter.getLogger().e("Twitter", "Failed to get request token", twitterException);
            b.this.h(1, new TwitterAuthException("Failed to get request token"));
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<OAuthResponse> result) {
            b bVar = b.this;
            bVar.b = result.data.authToken;
            String authorizeUrl = bVar.f.getAuthorizeUrl(b.this.b);
            Twitter.getLogger().d("Twitter", "Redirecting user to web view to complete authorization flow");
            b bVar2 = b.this;
            bVar2.m(bVar2.d, new e(b.this.f.buildCallbackUrl(b.this.e), b.this), authorizeUrl, new d());
        }
    }

    /* JADX INFO: renamed from: com.twitter.sdk.android.core.identity.b$b, reason: collision with other inner class name */
    public class C0759b extends Callback<OAuthResponse> {
        public C0759b() {
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            Twitter.getLogger().e("Twitter", "Failed to get access token", twitterException);
            b.this.h(1, new TwitterAuthException("Failed to get access token"));
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<OAuthResponse> result) {
            Intent intent = new Intent();
            OAuthResponse oAuthResponse = result.data;
            intent.putExtra("screen_name", oAuthResponse.userName);
            intent.putExtra("user_id", oAuthResponse.userId);
            intent.putExtra(AuthHandler.c, oAuthResponse.authToken.token);
            intent.putExtra(AuthHandler.d, oAuthResponse.authToken.secret);
            b.this.a.onComplete(-1, intent);
        }
    }

    public interface c {
        void onComplete(int i, Intent intent);
    }

    public b(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, c cVar) {
        this.c = progressBar;
        this.d = webView;
        this.e = twitterAuthConfig;
        this.f = oAuth1aService;
        this.a = cVar;
    }

    private void f() {
        this.c.setVisibility(8);
    }

    private void g() {
        this.d.stopLoading();
        f();
    }

    private void i(g gVar) {
        Twitter.getLogger().e("Twitter", "OAuth web view completed with an error", gVar);
        h(1, new TwitterAuthException("OAuth web view completed with an error"));
    }

    private void j(Bundle bundle) {
        String string;
        Twitter.getLogger().d("Twitter", "OAuth web view completed successfully");
        if (bundle != null && (string = bundle.getString(OAuthConstants.PARAM_VERIFIER)) != null) {
            Twitter.getLogger().d("Twitter", "Converting the request token to an access token.");
            this.f.requestAccessToken(k(), this.b, string);
            return;
        }
        Twitter.getLogger().e("Twitter", "Failed to get authorization, bundle incomplete " + bundle, null);
        h(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
    }

    @Override // com.twitter.sdk.android.core.identity.e.a
    public void a(WebView webView, String str) {
        f();
        webView.setVisibility(0);
    }

    @Override // com.twitter.sdk.android.core.identity.e.a
    public void b(g gVar) {
        i(gVar);
        g();
    }

    public void h(int i, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra(AuthHandler.g, twitterAuthException);
        this.a.onComplete(i, intent);
    }

    public Callback<OAuthResponse> k() {
        return new C0759b();
    }

    public Callback<OAuthResponse> l() {
        return new a();
    }

    public void m(WebView webView, WebViewClient webViewClient, String str, WebChromeClient webChromeClient) {
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(str);
        webView.setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }

    public void n() {
        Twitter.getLogger().d("Twitter", "Obtaining request token to start the sign in flow");
        this.f.requestTempToken(l());
    }

    @Override // com.twitter.sdk.android.core.identity.e.a
    public void onSuccess(Bundle bundle) {
        j(bundle);
        g();
    }
}
