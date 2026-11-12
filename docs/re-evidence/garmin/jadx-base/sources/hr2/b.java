package hr2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import b00.g;
import c22.z3;
import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lhr2/b;", "Lhn2/c;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends hn2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f85292j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hr2.c f85293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hr2.a f85294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WebView f85295i;

    /* JADX INFO: renamed from: hr2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhr2/b$b;", "Landroid/webkit/WebViewClient;", "Lhr2/c;", "viewModel", "<init>", "(Lhr2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1693b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hr2.c f85296a;

        public C1693b(hr2.c cVar) {
            cVar.getClass();
            this.f85296a = cVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            com.airbnb.lottie.animation.keyframe.a.w("onLoadResource for url: ", str, b.f85292j);
            this.f85296a.getClass();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            com.airbnb.lottie.animation.keyframe.a.w("onPageFinished for url: ", str, b.f85292j);
            this.f85296a.f85301d.m(hr2.c.a.WEBVIEW_AVAILABLE);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.airbnb.lottie.animation.keyframe.a.w("onPageStarted for url: ", str, b.f85292j);
            this.f85296a.f85301d.m(hr2.c.a.LOADING);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85297a;

        static {
            int[] iArr = new int[hr2.c.a.values().length];
            try {
                iArr[hr2.c.a.WEBVIEW_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hr2.c.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hr2.c.a.PROVISIONING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85297a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f85292j = gt2.b.f79005a.h("PAY#WebViewPresenter");
    }

    public abstract void ca();

    public final hr2.c da() {
        hr2.c cVar = this.f85293g;
        if (cVar != null) {
            return cVar;
        }
        s.m("viewModel");
        throw null;
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f85295i != null) {
            super.onBackPressed();
        } else {
            s.m("containedWebView");
            throw null;
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("WebPageDataKey", hr2.a.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("WebPageDataKey") : null;
            if (!(parcelableExtra instanceof hr2.a)) {
                parcelableExtra = null;
            }
            parcelable = (hr2.a) parcelableExtra;
        }
        hr2.a aVar = (hr2.a) parcelable;
        if (aVar == null) {
            h.s("WebPageDataModel is null");
            return;
        }
        this.f85294h = aVar;
        R9(R.layout.activity_web_view_presenter, hn2.c.a.UP, aVar.f85288a);
        View viewFindViewById = findViewById(R.id.containedWebView);
        viewFindViewById.getClass();
        this.f85295i = (WebView) viewFindViewById;
        ca();
        WebView webView = this.f85295i;
        if (webView == null) {
            s.m("containedWebView");
            throw null;
        }
        webView.setVisibility(8);
        WebView webView2 = this.f85295i;
        if (webView2 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView2.setWebViewClient(new C1693b(da()));
        WebView webView3 = this.f85295i;
        if (webView3 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView3.setBackgroundColor(0);
        WebView webView4 = this.f85295i;
        if (webView4 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView4.setLayerType(1, null);
        WebView webView5 = this.f85295i;
        if (webView5 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView5.clearCache(true);
        WebView webView6 = this.f85295i;
        if (webView6 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView6.clearCache(true);
        webView6.setScrollbarFadingEnabled(true);
        webView6.setVerticalScrollBarEnabled(false);
        webView6.setOnTouchListener(new g(this, 4));
        z3.f23767a.getClass();
        WebSettings settings = webView6.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        da().f85301d.f(this, new a4.b(this, 26));
        hr2.c cVarDa = da();
        hr2.a aVar2 = this.f85294h;
        if (aVar2 != null) {
            cVarDa.x4(aVar2);
        } else {
            s.m("providerDataModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        if (this.f85295i == null) {
            s.m("containedWebView");
            throw null;
        }
        f85292j.debug("destroyWebView");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.webViewContainer);
        if (constraintLayout != null) {
            WebView webView = this.f85295i;
            if (webView == null) {
                s.m("containedWebView");
                throw null;
            }
            constraintLayout.removeView(webView);
        }
        WebView webView2 = this.f85295i;
        if (webView2 == null) {
            s.m("containedWebView");
            throw null;
        }
        webView2.clearHistory();
        webView2.clearCache(true);
        webView2.loadUrl("about:blank");
        webView2.onPause();
        webView2.removeAllViews();
        webView2.destroyDrawingCache();
        webView2.destroy();
        super.onDestroy();
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhr2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "WEB_PAGE_DATA_KEY", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
