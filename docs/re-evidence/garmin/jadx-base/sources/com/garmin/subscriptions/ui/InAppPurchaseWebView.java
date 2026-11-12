package com.garmin.subscriptions.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.k;
import d53.n;
import d53.w;
import ey2.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;
import xx2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/subscriptions/ui/InAppPurchaseWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
public final class InAppPurchaseWebView extends WebView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f52775b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f52776a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/subscriptions/ui/InAppPurchaseWebView$a", "Landroid/webkit/WebViewClient;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            e eVar = InAppPurchaseWebView.this.f52776a;
            if (eVar != null) {
                eVar.e();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            e eVar = InAppPurchaseWebView.this.f52776a;
            if (eVar != null) {
                eVar.d();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            webView.getClass();
            webResourceRequest.getClass();
            webResourceError.getClass();
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                if (webResourceError.getErrorCode() == -8 || webResourceError.getErrorCode() == -6 || webResourceError.getErrorCode() == -2) {
                    int i14 = InAppPurchaseWebView.f52775b;
                    InAppPurchaseWebView inAppPurchaseWebView = InAppPurchaseWebView.this;
                    inAppPurchaseWebView.getClass();
                    webView.stopLoading();
                    webView.loadDataWithBaseURL(null, n.c("\n            <html>\n            <head>\n            <style>\n                body { color: #000000; background-color: #ffffff; }\n                @media (prefers-color-scheme: dark) {\n                    body { color: #ffffff; background-color: #000000; }\n                }\n            </style>\n            </head>\n            <body>\n                <h1>" + inAppPurchaseWebView.getContext().getString(R.string.mpf_txt_no_internet_connection) + "</h1>\n                <p>" + inAppPurchaseWebView.getContext().getString(R.string.mpf_msg_common_no_internet_try_again) + "</p>\n            </body>\n            </html>\n        "), "text/html", "UTF-8", null);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:116:0x019f  */
        /* JADX WARN: Code duplicated, block: B:118:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:24:0x0049  */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            Uri uriNormalizeScheme;
            com.garmin.subscriptions.ui.a bVar;
            e eVar;
            String host;
            String host2;
            boolean z14;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (uriNormalizeScheme = url.normalizeScheme()) != null) {
                com.garmin.subscriptions.ui.a.f52778c.getClass();
                String scheme = uriNormalizeScheme.getScheme();
                if (scheme == null) {
                    bVar = null;
                } else {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != -1740044386) {
                        if (iHashCode == 1100138591 && scheme.equals("revolut")) {
                            bVar = new com.garmin.subscriptions.ui.a.c(uriNormalizeScheme);
                        } else {
                            bVar = null;
                        }
                    } else if (scheme.equals("bepgenapp")) {
                        bVar = new com.garmin.subscriptions.ui.a.b(uriNormalizeScheme);
                    } else {
                        bVar = null;
                    }
                }
                InAppPurchaseWebView inAppPurchaseWebView = InAppPurchaseWebView.this;
                if (bVar != null) {
                    e eVar2 = inAppPurchaseWebView.f52776a;
                    if (eVar2 != null) {
                        eVar2.c(bVar);
                        return true;
                    }
                } else {
                    int i14 = InAppPurchaseWebView.f52775b;
                    inAppPurchaseWebView.getClass();
                    String path = uriNormalizeScheme.getPath();
                    if (path == null) {
                        path = "";
                    }
                    String scheme2 = uriNormalizeScheme.getScheme();
                    if (scheme2 == null) {
                        scheme2 = "";
                    }
                    if (scheme2.equals("mailto") || scheme2.equals("tel") || ((host = uriNormalizeScheme.getHost()) != null && (InAppPurchaseWebView.a(host, "support.garmin.com") || InAppPurchaseWebView.a(host, "discover.garmin.com") || (InAppPurchaseWebView.a(host, "garmin.com") && (w.z(path, "privacy", false) || w.z(path, "legal", false) || w.z(path, "account", false) || new k("^/[a-z]{2}-[A-Z]{2}/p/\\d+/?$").d(path)))))) {
                        eVar = inAppPurchaseWebView.f52776a;
                        if (eVar != null) {
                            eVar.b(uriNormalizeScheme);
                        }
                    } else {
                        String scheme3 = uriNormalizeScheme.getScheme();
                        if (scheme3 != null && (host2 = uriNormalizeScheme.getHost()) != null) {
                            String path2 = uriNormalizeScheme.getPath();
                            if (path2 == null) {
                                path2 = "";
                            }
                            String query = uriNormalizeScheme.getQuery();
                            String str = query != null ? query : "";
                            boolean z15 = scheme3.equals("http") || scheme3.equals("https");
                            Set setM0 = u.m0(new String[]{"checkoutshopper-test.adyen.com", "checkoutshopper-beta.adyen.com", "checkoutshopper-live.adyen.com", "checkoutshopper-live-au.adyen.com", "checkoutshopper-live-us.adyen.com", "checkoutshopper-live-apse.adyen.com", "checkoutshopper-live-in.adyen.com"});
                            if (!(setM0 instanceof Collection) || !setM0.isEmpty()) {
                                Iterator it = setM0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z14 = false;
                                        break;
                                    }
                                    if (w.z(host2, (String) it.next(), false)) {
                                        z14 = true;
                                        break;
                                    }
                                }
                            } else {
                                z14 = false;
                                break;
                            }
                            boolean z16 = w.z(path2, "/checkoutshopper/checkoutPaymentRedirect", false);
                            boolean z17 = w.z(str, "redirectData=", false);
                            if (z15 && z14 && z16 && z17) {
                                eVar = inAppPurchaseWebView.f52776a;
                                if (eVar != null) {
                                    eVar.b(uriNormalizeScheme);
                                }
                            }
                        }
                        d.f192590a.getClass();
                        if (s.g((String) d.f192595f.getValue(), uriNormalizeScheme.toString())) {
                            e eVar3 = inAppPurchaseWebView.f52776a;
                            if (eVar3 != null) {
                                eVar3.onSuccess();
                                return true;
                            }
                        } else if (s.g((String) d.f192596g.getValue(), uriNormalizeScheme.toString())) {
                            e eVar4 = inAppPurchaseWebView.f52776a;
                            if (eVar4 != null) {
                                eVar4.a();
                                return true;
                            }
                        } else if (s.g((String) d.f192597h.getValue(), uriNormalizeScheme.toString())) {
                            e eVar5 = inAppPurchaseWebView.f52776a;
                            if (eVar5 != null) {
                                eVar5.f();
                                return true;
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseWebView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        setFocusable(true);
        setFocusableInTouchMode(true);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        setWebViewClient(new a());
    }

    public static boolean a(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String strL0 = w.l0(lowerCase, '.');
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        String strL1 = w.l0(lowerCase2, '.');
        if (!s.g(strL0, strL1)) {
            if (!d53.u.p(strL0, "." + strL1, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseWebView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ InAppPurchaseWebView(Context context, AttributeSet attributeSet, int i14, int i15, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseWebView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
