package com.alipay.sdk.m.a0;

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
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.on;
import defpackage.ou;
import defpackage.ox;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class e extends LinearLayout {
    public static Handler e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f2097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f2098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f2099c;
    public ImageView d;
    public final C0017e f;
    public h g;
    public WebView h;
    public g i;
    public f j;
    public final float k;
    public final on l;
    public View.OnClickListener m;

    public class a implements View.OnClickListener {

        public class b implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f2100c;

            public b(View view) {
                this.f2100c = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2100c.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.g;
            if (hVar != null) {
                view.setEnabled(false);
                e.e.postDelayed(new b(view), 256L);
                if (view == e.this.f2097a) {
                    hVar.a(e.this);
                } else if (view == e.this.d) {
                    hVar.b(e.this);
                }
            }
        }
    }

    public class b implements DownloadListener {
        public final /* synthetic */ Context d;

        public b(Context context) {
            this.d = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                intent.setFlags(268435456);
                this.d.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.j.a(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (!e.this.f.f2104a) {
                e.this.f2099c.setVisibility(8);
            } else {
                if (i > 90) {
                    e.this.f2099c.setVisibility(4);
                    return;
                }
                if (e.this.f2099c.getVisibility() == 4) {
                    e.this.f2099c.setVisibility(0);
                }
                e.this.f2099c.setProgress(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.j.a(e.this, str);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.i.d(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.i.c(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (e.this.i.a(e.this, i, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.i.a(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return e.this.i.a(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.i.b(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.e$e, reason: collision with other inner class name */
    public static final class C0017e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2104a;
        public boolean e;

        public C0017e(boolean z, boolean z2) {
            this.e = z;
            this.f2104a = z2;
        }
    }

    public interface f {
        void a(e eVar, String str);

        boolean a(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    public interface g {
        WebResourceResponse a(WebView webView, String str);

        boolean a(e eVar, int i, String str, String str2);

        boolean a(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean b(e eVar, String str);

        boolean c(e eVar, String str);

        boolean d(e eVar, String str);
    }

    public interface h {
        void a(e eVar);

        void b(e eVar);
    }

    public e(Context context, on onVar, C0017e c0017e) {
        this(context, null, onVar, c0017e);
    }

    public ImageView getBackButton() {
        return this.f2097a;
    }

    public ProgressBar getProgressbar() {
        return this.f2099c;
    }

    public ImageView getRefreshButton() {
        return this.d;
    }

    public TextView getTitle() {
        return this.f2098b;
    }

    public String getUrl() {
        return this.h.getUrl();
    }

    public WebView getWebView() {
        return this.h;
    }

    public void setChromeProxy(f fVar) {
        this.j = fVar;
        if (fVar == null) {
            this.h.setWebChromeClient(null);
        } else {
            this.h.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.i = gVar;
        if (gVar == null) {
            this.h.setWebViewClient(null);
        } else {
            this.h.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.g = hVar;
    }

    public e(Context context, AttributeSet attributeSet, on onVar, C0017e c0017e) {
        super(context, attributeSet);
        this.m = new a();
        this.f = c0017e == null ? new C0017e(false, false) : c0017e;
        this.l = onVar;
        this.k = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        e(context);
        c(context);
        b(context);
    }

    public final void b(Context context) {
        WebView webView = new WebView(context);
        this.h = webView;
        webView.setVerticalScrollbarOverlay(true);
        b(this.h, context);
        WebSettings settings = this.h.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.h.setVerticalScrollbarOverlay(true);
        this.h.setDownloadListener(new b(context));
        try {
            try {
                this.h.removeJavascriptInterface("searchBoxJavaBridge_");
                this.h.removeJavascriptInterface("accessibility");
                this.h.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.h.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (method != null) {
                method.invoke(this.h, "searchBoxJavaBridge_");
                method.invoke(this.h, "accessibility");
                method.invoke(this.h, "accessibilityTraversal");
            }
        }
        com.alipay.sdk.m.a0.c.a(this.h);
        addView(this.h, new LinearLayout.LayoutParams(-1, -1));
    }

    public final void c(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f2099c = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f2099c.setMax(100);
        this.f2099c.setBackgroundColor(-218103809);
        addView(this.f2099c, new LinearLayout.LayoutParams(-1, b(2)));
    }

    public final void e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f.e ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f2097a = imageView;
        imageView.setOnClickListener(this.m);
        this.f2097a.setScaleType(ImageView.ScaleType.CENTER);
        this.f2097a.setImageDrawable(ou.b("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", context));
        this.f2097a.setPadding(b(12), 0, b(12), 0);
        linearLayout.addView(this.f2097a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(b(1), b(25)));
        TextView textView = new TextView(context);
        this.f2098b = textView;
        textView.setTextColor(-15658735);
        this.f2098b.setTextSize(17.0f);
        this.f2098b.setMaxLines(1);
        this.f2098b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(b(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f2098b, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setOnClickListener(this.m);
        this.d.setScaleType(ImageView.ScaleType.CENTER);
        this.d.setImageDrawable(ou.b("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", context));
        this.d.setPadding(b(12), 0, b(12), 0);
        linearLayout.addView(this.d, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, b(48)));
    }

    public void b() {
        removeAllViews();
        this.h.removeAllViews();
        this.h.setWebViewClient(null);
        this.h.setWebChromeClient(null);
        this.h.destroy();
    }

    public void b(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + ox.f(context));
    }

    public void e(String str) {
        this.h.loadUrl(str);
        com.alipay.sdk.m.a0.c.a(this.h);
    }

    public void d(String str, byte[] bArr) {
        this.h.postUrl(str, bArr);
    }

    public final int b(int i) {
        return (int) (i * this.k);
    }
}
