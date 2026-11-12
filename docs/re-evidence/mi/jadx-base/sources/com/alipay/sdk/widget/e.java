package com.alipay.sdk.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.util.h;
import com.alipay.sdk.util.k;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e extends LinearLayout {
    public static Handler m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f5908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f5909b;
    public ImageView c;
    public ProgressBar d;
    public WebView e;
    public final a f;
    public b g;
    public c h;
    public d i;
    public final com.alipay.sdk.sys.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnClickListener f5910k;
    public final float l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5919b;

        public a(boolean z, boolean z2) {
            this.f5918a = z;
            this.f5919b = z2;
        }
    }

    public interface b {
        boolean b(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);

        void f(e eVar, String str);
    }

    public interface c {
        boolean a(e eVar, int i, String str, String str2);

        boolean c(e eVar, String str);

        boolean d(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean e(e eVar, String str);

        boolean g(e eVar, String str);
    }

    public interface d {
        void h(e eVar);

        void i(e eVar);
    }

    public e(Context context, com.alipay.sdk.sys.a aVar, a aVar2) {
        this(context, null, aVar, aVar2);
    }

    public final int a(int i) {
        return (int) (i * this.l);
    }

    public void c() {
        removeAllViews();
        this.e.removeAllViews();
        this.e.setWebViewClient(null);
        this.e.setWebChromeClient(null);
        this.e.destroy();
    }

    public final void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f.f5918a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f5908a = imageView;
        imageView.setOnClickListener(this.f5910k);
        ImageView imageView2 = this.f5908a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f5908a.setImageDrawable(h.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", context));
        this.f5908a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f5908a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f5909b = textView;
        textView.setTextColor(-15658735);
        this.f5909b.setTextSize(17.0f);
        this.f5909b.setMaxLines(1);
        this.f5909b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f5909b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.c = imageView3;
        imageView3.setOnClickListener(this.f5910k);
        this.c.setScaleType(scaleType);
        this.c.setImageDrawable(h.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", context));
        this.c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + k.x(context));
    }

    public void f(String str) {
        this.e.loadUrl(str);
        com.alipay.sdk.widget.c.k(this.e);
    }

    public void g(String str, byte[] bArr) {
        this.e.postUrl(str, bArr);
    }

    public ImageView getBackButton() {
        return this.f5908a;
    }

    public ProgressBar getProgressbar() {
        return this.d;
    }

    public ImageView getRefreshButton() {
        return this.c;
    }

    public TextView getTitle() {
        return this.f5909b;
    }

    public String getUrl() {
        return this.e.getUrl();
    }

    public WebView getWebView() {
        return this.e;
    }

    public final void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.d.setMax(100);
        this.d.setBackgroundColor(-218103809);
        addView(this.d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    public final void l(final Context context) {
        WebView webView = new WebView(context);
        this.e = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.e, context);
        WebSettings settings = this.e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        this.e.setVerticalScrollbarOverlay(true);
        this.e.setDownloadListener(new DownloadListener() { // from class: com.alipay.sdk.widget.e.2
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                } catch (Throwable unused) {
                }
            }
        });
        try {
            try {
                this.e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.e.removeJavascriptInterface("accessibility");
                this.e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.e.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (method != null) {
                method.invoke(this.e, "searchBoxJavaBridge_");
                method.invoke(this.e, "accessibility");
                method.invoke(this.e, "accessibilityTraversal");
            }
        }
        com.alipay.sdk.widget.c.k(this.e);
        addView(this.e, new LinearLayout.LayoutParams(-1, -1));
    }

    public void setChromeProxy(b bVar) {
        this.g = bVar;
        if (bVar == null) {
            this.e.setWebChromeClient(null);
        } else {
            this.e.setWebChromeClient(new WebChromeClient() { // from class: com.alipay.sdk.widget.e.3
                @Override // android.webkit.WebChromeClient
                public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    return e.this.g.b(e.this, str, str2, str3, jsPromptResult);
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    if (!e.this.f.f5919b) {
                        e.this.d.setVisibility(8);
                    } else {
                        if (i > 90) {
                            e.this.d.setVisibility(4);
                            return;
                        }
                        if (e.this.d.getVisibility() == 4) {
                            e.this.d.setVisibility(0);
                        }
                        e.this.d.setProgress(i);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    e.this.g.f(e.this, str);
                }
            });
        }
    }

    public void setWebClientProxy(c cVar) {
        this.h = cVar;
        if (cVar == null) {
            this.e.setWebViewClient(null);
        } else {
            this.e.setWebViewClient(new WebViewClient() { // from class: com.alipay.sdk.widget.e.4
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    if (e.this.h.e(e.this, str)) {
                        return;
                    }
                    super.onPageFinished(webView, str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    if (e.this.h.c(e.this, str)) {
                        return;
                    }
                    super.onPageFinished(webView, str);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    if (e.this.h.a(e.this, i, str, str2)) {
                        return;
                    }
                    super.onReceivedError(webView, i, str, str2);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (e.this.h.d(e.this, sslErrorHandler, sslError)) {
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (e.this.h.g(e.this, str)) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            });
        }
    }

    public void setWebEventProxy(d dVar) {
        this.i = dVar;
    }

    public e(Context context, AttributeSet attributeSet, com.alipay.sdk.sys.a aVar, a aVar2) {
        super(context, attributeSet);
        this.f5910k = new View.OnClickListener() { // from class: com.alipay.sdk.widget.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                d dVar = e.this.i;
                if (dVar != null) {
                    view.setEnabled(false);
                    e.m.postDelayed(new Runnable() { // from class: com.alipay.sdk.widget.e.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            view.setEnabled(true);
                        }
                    }, 256L);
                    if (view == e.this.f5908a) {
                        dVar.h(e.this);
                    } else if (view == e.this.c) {
                        dVar.i(e.this);
                    }
                }
            }
        };
        this.f = aVar2 == null ? new a(false, false) : aVar2;
        this.j = aVar;
        this.l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }
}
