package com.garmin.android.library.mobileauth.ui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.k;
import d53.u;
import d53.w;
import e23.p;
import i3.e5;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import lc.u0;
import o13.l;
import o13.r;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import re2.g0;
import re2.l0;
import v13.i;
import vb.h;
import ve2.m;
import xa1.j;
import xd2.m0;
import xe2.b0;
import xe2.n0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 q2\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH ¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0003J5\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\b¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102R\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u00102R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00104\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u00102R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0010R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00104R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00104\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u00102R(\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u00104\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u00102R\"\u0010`\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u00102R\"\u0010c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u00104\u001a\u0004\bd\u0010\u0006\"\u0004\be\u00102R\"\u0010f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010\n\"\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "<init>", "()V", "", "constructURL$mobile_auth_release", "()Ljava/lang/String;", "constructURL", "", "onBackPressedHandled$mobile_auth_release", "()Z", "onBackPressedHandled", "Landroid/webkit/WebView;", "webView", "", "onBeforeLoadWebURL$mobile_auth_release", "(Landroid/webkit/WebView;)V", "onBeforeLoadWebURL", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "dismissAlertDialog", "onDestroyView", "funcName", "url", "log", "", "getCookieEntries", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;", "Landroid/webkit/WebViewClient;", "constructWebViewClient", "()Landroid/webkit/WebViewClient;", "msg", "showWebViewError", "(Ljava/lang/String;)V", "ssoHost", "Ljava/lang/String;", "getSsoHost", "setSsoHost", "locale", "getLocale", "setLocale", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "webURL", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthTextView;", "toolbarTitle", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthTextView;", "getToolbarTitle", "()Lcom/garmin/android/library/mobileauth/ui/MobileAuthTextView;", "setToolbarTitle", "(Lcom/garmin/android/library/mobileauth/ui/MobileAuthTextView;)V", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "getAlertDialog", "()Landroid/app/AlertDialog;", "setAlertDialog", "(Landroid/app/AlertDialog;)V", "Lve2/e;", "environment", "Lve2/e;", "getEnvironment", "()Lve2/e;", "setEnvironment", "(Lve2/e;)V", "currentlyLoadedURL", "getCurrentlyLoadedURL", "setCurrentlyLoadedURL", "Lve2/m;", "value", "multiUserMode", "Lve2/m;", "getMultiUserMode", "()Lve2/m;", "clientIDLoggingOnly", "getClientIDLoggingOnly", "setClientIDLoggingOnly", "cssUrl", "getCssUrl", "setCssUrl", "consentIDsQueryString", "getConsentIDsQueryString", "setConsentIDsQueryString", "showPassword", "Z", "getShowPassword", "setShowPassword", "(Z)V", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "Companion", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MobileAuthAbstractWebFrag extends MobileAuthBgBlurCapableFrag {
    private static final String TAG = "AbstractWebFrag";
    private AlertDialog alertDialog;
    public String clientIDLoggingOnly;
    public String cssUrl;
    public ve2.e environment;
    public String locale;
    private m multiUserMode;
    private boolean showPassword;
    public String ssoHost;
    private MobileAuthTextView toolbarTitle;
    private String webURL;
    public WebView webView;
    public static final int $stable = 8;
    private String currentlyLoadedURL = "";
    private String consentIDsQueryString = "";

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final l logger = o13.m.b(new j(26));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag$b", "Lxe2/b0;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends b0 {
        public b() {
        }

        @Override // xe2.b0, android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            super.onLoadResource(webView, str);
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag = MobileAuthAbstractWebFrag.this;
            mobileAuthAbstractWebFrag.getFragListener$mobile_auth_release().p9(webView, str, mobileAuthAbstractWebFrag.getSsoHost());
        }

        @Override // xe2.b0, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            super.onPageFinished(webView, str);
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag = MobileAuthAbstractWebFrag.this;
            mobileAuthAbstractWebFrag.setCurrentlyLoadedURL(str);
            mobileAuthAbstractWebFrag.getFragListener$mobile_auth_release().Y3(webView, str, mobileAuthAbstractWebFrag.getSsoHost());
        }

        @Override // xe2.b0, android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            webView.getClass();
            str.getClass();
            super.onPageStarted(webView, str, bitmap);
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag = MobileAuthAbstractWebFrag.this;
            mobileAuthAbstractWebFrag.getFragListener$mobile_auth_release().n7(webView, str, mobileAuthAbstractWebFrag.getSsoHost());
        }

        @Override // xe2.b0, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            webView.getClass();
            webResourceRequest.getClass();
            webResourceResponse.getClass();
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (503 == webResourceResponse.getStatusCode()) {
                String string = webResourceRequest.getUrl().toString();
                MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag = MobileAuthAbstractWebFrag.this;
                String str = mobileAuthAbstractWebFrag.webURL;
                if (str == null) {
                    s.m("webURL");
                    throw null;
                }
                if (s.g(string, str)) {
                    String string2 = mobileAuthAbstractWebFrag.getString(R.string.mobile_auth_connectivity_issues);
                    string2.getClass();
                    mobileAuthAbstractWebFrag.showWebViewError(string2);
                }
            }
        }

        @Override // xe2.b0, android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            webView.getClass();
            sslErrorHandler.getClass();
            sslError.getClass();
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String string = sslError.toString();
            string.getClass();
            MobileAuthAbstractWebFrag.this.showWebViewError(string);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag$onAttach$1", f = "MobileAuthAbstractWebFrag.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
    public static final class c extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MobileAuthAbstractWebFrag f50397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50398b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50400a;

            static {
                int[] iArr = new int[re2.b.c.values().length];
                try {
                    iArr[re2.b.c.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[re2.b.c.MULTI_USER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50400a = iArr;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MobileAuthAbstractWebFrag.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag;
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50398b;
            if (i14 == 0) {
                r.b(obj);
                re2.b.f152215a.getClass();
                int i15 = a.f50400a[re2.b.f152226l.ordinal()];
                mobileAuthAbstractWebFrag = MobileAuthAbstractWebFrag.this;
                if (i15 == 1) {
                    this.f50397a = mobileAuthAbstractWebFrag;
                    this.f50398b = 1;
                    obj = re2.b.q(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    mobileAuthAbstractWebFrag2 = mobileAuthAbstractWebFrag;
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return null;
                    }
                    androidx.fragment.app.m mVarRequireActivity = mobileAuthAbstractWebFrag.requireActivity();
                    mVarRequireActivity.getClass();
                    mobileAuthAbstractWebFrag.multiUserMode = ((com.garmin.android.library.mobileauth.ui.a) mVarRequireActivity).S9();
                    m multiUserMode = mobileAuthAbstractWebFrag.getMultiUserMode();
                    if (multiUserMode == null || (eVar = multiUserMode.f177786a) == null) {
                        kg.f.n("onAttach: null 'MultiUserMode' object");
                        return null;
                    }
                }
                mobileAuthAbstractWebFrag.setEnvironment(eVar);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mobileAuthAbstractWebFrag2 = this.f50397a;
            r.b(obj);
            ve2.e eVar = (ve2.e) obj;
            mobileAuthAbstractWebFrag = mobileAuthAbstractWebFrag2;
            mobileAuthAbstractWebFrag.setEnvironment(eVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag$d", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f50401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MobileAuthAbstractWebFrag f50402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f50403c;

        public d(View view2, MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, int i14) {
            this.f50401a = view2;
            this.f50402b = mobileAuthAbstractWebFrag;
            this.f50403c = i14;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f50401a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f50402b.getFragListener$mobile_auth_release().c1();
            if (setC1.size() >= 2) {
                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Set<Integer> set = setC1;
                marginLayoutParams.topMargin = ((Number) h0.W(set, 0)).intValue();
                toolbar.setLayoutParams(marginLayoutParams);
                WebView webView = (WebView) view2.findViewById(this.f50403c);
                ViewGroup.LayoutParams layoutParams2 = webView.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = ((Number) h0.W(set, 1)).intValue();
                webView.setLayoutParams(marginLayoutParams2);
            }
            return true;
        }
    }

    private final WebViewClient constructWebViewClient() {
        return new b();
    }

    public static /* synthetic */ Map getCookieEntries$default(MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, String str, String str2, boolean z14, int i14, Object obj) {
        if (obj != null) {
            org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: getCookieEntries");
            return null;
        }
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        return mobileAuthAbstractWebFrag.getCookieEntries(str, str2, z14);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger logger_delegate$lambda$0() {
        l0.f152316a.getClass();
        return l0.c(TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onAttach$lambda$3$lambda$2$lambda$1(String str) {
        str.getClass();
        return "consentTypeIds=".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10$lambda$9(CookieManager cookieManager, MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, Boolean bool) {
        cookieManager.setAcceptCookie(true);
        WebView webView = mobileAuthAbstractWebFrag.getWebView();
        webView.requestFocus();
        mobileAuthAbstractWebFrag.onBeforeLoadWebURL$mobile_auth_release(webView);
        String str = mobileAuthAbstractWebFrag.webURL;
        if (str != null) {
            webView.loadUrl(str);
        } else {
            s.m("webURL");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$7$lambda$6(MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, View view2, MotionEvent motionEvent) {
        l0 l0Var = l0.f152316a;
        Context contextRequireContext = mobileAuthAbstractWebFrag.requireContext();
        contextRequireContext.getClass();
        l0Var.getClass();
        return !l0.e(contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWebViewError(String msg) {
        g0.c(new wz1.c(20, this, msg), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showWebViewError$lambda$15(MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, String str) {
        mobileAuthAbstractWebFrag.dismissAlertDialog();
        androidx.fragment.app.m mVarRequireActivity = mobileAuthAbstractWebFrag.requireActivity();
        mVarRequireActivity.getClass();
        mobileAuthAbstractWebFrag.alertDialog = n0.a(mVarRequireActivity, mobileAuthAbstractWebFrag.getString(R.string.mobile_auth_connection_error), str, new af2.b(mobileAuthAbstractWebFrag, 6), null, null, null, 112);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWebViewError$lambda$15$lambda$14(MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, DialogInterface dialogInterface) {
        g0.c(new wd.c(mobileAuthAbstractWebFrag, 26), mobileAuthAbstractWebFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showWebViewError$lambda$15$lambda$14$lambda$13(MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag) {
        mobileAuthAbstractWebFrag.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    public abstract String constructURL$mobile_auth_release();

    public final void dismissAlertDialog() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.alertDialog = null;
    }

    public final AlertDialog getAlertDialog() {
        return this.alertDialog;
    }

    public final String getClientIDLoggingOnly() {
        String str = this.clientIDLoggingOnly;
        if (str != null) {
            return str;
        }
        s.m("clientIDLoggingOnly");
        throw null;
    }

    public final String getConsentIDsQueryString() {
        return this.consentIDsQueryString;
    }

    public final Map<String, String> getCookieEntries(String funcName, String url, boolean log) {
        Collection collectionS0;
        funcName.getClass();
        url.getClass();
        HashMap map = new HashMap();
        String cookie = CookieManager.getInstance().getCookie(url);
        if (cookie != null) {
            StringBuilder sb3 = log ? new StringBuilder(e5.g(funcName, ": ", url)) : null;
            if (sb3 != null) {
                sb3.append("\nfull cookie -> ");
                sb3.append(cookie);
            }
            List listG = new k(";").g(0, u.v(cookie, StringUtils.SPACE, "", false));
            if (!listG.isEmpty()) {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionS0 = j0.f134944a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionS0 = j0.f134944a;
                break;
            }
            Object[] array = collectionS0.toArray(new String[0]);
            int length = array.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int i16 = i15 + 1;
                String str = (String) array[i14];
                if (sb3 != null) {
                    sb3.append("\n\n   entry[" + i15 + "]:");
                    sb3.append(str);
                }
                String[] strArr = (String[]) w.X(str, new char[]{'='}).toArray(new String[0]);
                if (strArr.length == 2) {
                    String string = w.i0(strArr[0]).toString();
                    String string2 = w.i0(strArr[1]).toString();
                    map.put(string, string2);
                    if (sb3 != null) {
                        sb3.append("\n      ");
                        sb3.append("key:" + ((Object) string));
                    }
                    if (sb3 != null) {
                        sb3.append("\n      ");
                        sb3.append("value:" + ((Object) string2));
                    }
                } else if (sb3 != null) {
                    sb3.append("\n      *** WARNING: split on '=' resulted in [" + strArr.length + "] values (expected 2)");
                }
                i14++;
                i15 = i16;
            }
            if (sb3 != null) {
                getLogger().debug(sb3.toString());
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public final String getCssUrl() {
        String str = this.cssUrl;
        if (str != null) {
            return str;
        }
        s.m("cssUrl");
        throw null;
    }

    public final String getCurrentlyLoadedURL() {
        return this.currentlyLoadedURL;
    }

    public final ve2.e getEnvironment() {
        ve2.e eVar = this.environment;
        if (eVar != null) {
            return eVar;
        }
        s.m("environment");
        throw null;
    }

    public final String getLocale() {
        String str = this.locale;
        if (str != null) {
            return str;
        }
        s.m("locale");
        throw null;
    }

    public final m getMultiUserMode() {
        return this.multiUserMode;
    }

    public final boolean getShowPassword() {
        return this.showPassword;
    }

    public final String getSsoHost() {
        String str = this.ssoHost;
        if (str != null) {
            return str;
        }
        s.m("ssoHost");
        throw null;
    }

    public final MobileAuthTextView getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final WebView getWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView;
        }
        s.m("webView");
        throw null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public void onAttach(Context context) throws Throwable {
        String str;
        String str2;
        context.getClass();
        super.onAttach(context);
        ge1.b.W(t13.h.f161748a, new c(null));
        ve2.l mobileAuthConfig$mobile_auth_release = getMobileAuthConfig$mobile_auth_release();
        boolean zG = mobileAuthConfig$mobile_auth_release.g();
        ve2.p pVar = mobileAuthConfig$mobile_auth_release.f177761b.f177843a;
        String str3 = "";
        if (!zG) {
            if (pVar == null || (str2 = pVar.f177816a) == null) {
                str2 = "";
            }
            setClientIDLoggingOnly(str2);
            HashMap<String, String> map = mobileAuthConfig$mobile_auth_release.M;
            map.getClass();
            String str4 = map.get(getEnvironment().name());
            str4.getClass();
            setCssUrl(str4);
            this.showPassword = mobileAuthConfig$mobile_auth_release.f177772m;
            HashSet<String> hashSet = mobileAuthConfig$mobile_auth_release.F;
            if (hashSet == null) {
                s.m("appConsentIDs");
                throw null;
            }
            if (!hashSet.isEmpty()) {
                this.consentIDsQueryString = h0.k0(hashSet, "&", "&", null, new m0(3), 28);
            }
        }
        String packageName = requireContext().getPackageName();
        packageName.getClass();
        if (w.z(packageName, "com.garmin.di.sso.sampleapp", false)) {
            if (pVar != null && (str = pVar.f177816a) != null) {
                str3 = str;
            }
            setClientIDLoggingOnly(str3);
            HashMap<String, String> map2 = mobileAuthConfig$mobile_auth_release.M;
            map2.getClass();
            String str5 = map2.get(getEnvironment().name());
            str5.getClass();
            setCssUrl(str5);
        }
        setSsoHost(getEnvironment().f177719a);
        setLocale(l0.b(context));
        this.webURL = constructURL$mobile_auth_release();
    }

    public abstract boolean onBackPressedHandled$mobile_auth_release();

    public abstract void onBeforeLoadWebURL$mobile_auth_release(WebView webView);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = inflater.inflate(R.layout.mobileauth_webview, container, false);
        ((WebView) viewInflate.findViewById(R.id.web_view)).setLayerType(1, null);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getLogger().debug("onDestroyView");
        try {
            WebView webView = getWebView();
            webView.stopLoading();
            webView.clearHistory();
            webView.clearCache(true);
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getLogger().debug("onPause");
        getWebView().onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLogger().debug("onResume");
        getWebView().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getLogger().debug("onStop");
        try {
            getWebView().stopLoading();
        } catch (Exception unused) {
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            dismissAlertDialog();
            Object systemService = activity.getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWebView().getWindowToken(), 0);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled"})
    public void onViewCreated(View view2, Bundle savedInstanceState) {
        view2.getClass();
        super.onViewCreated(view2, savedInstanceState);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new d(view2, this, R.id.web_view));
        }
        setWebView((WebView) view2.findViewById(R.id.web_view));
        WebView webView = getWebView();
        if (!useBackgroundImage$mobile_auth_release() || getFragListener$mobile_auth_release().getF50348q() == -1) {
            webView.setBackgroundColor(0);
        } else {
            webView.setBackgroundColor(a7.b.getColor(requireContext(), android.R.color.transparent));
        }
        webView.setWebViewClient(constructWebViewClient());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        getLogger().debug("onViewCreated: webview user-agent -> " + settings.getUserAgentString());
        webView.setOnTouchListener(new b00.g(this, 11));
        webView.clearHistory();
        webView.clearFormData();
        webView.clearCache(true);
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: xe2.j0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                MobileAuthAbstractWebFrag.onViewCreated$lambda$10$lambda$9(cookieManager, this, (Boolean) obj);
            }
        });
    }

    public final void setAlertDialog(AlertDialog alertDialog) {
        this.alertDialog = alertDialog;
    }

    public final void setClientIDLoggingOnly(String str) {
        str.getClass();
        this.clientIDLoggingOnly = str;
    }

    public final void setConsentIDsQueryString(String str) {
        str.getClass();
        this.consentIDsQueryString = str;
    }

    public final void setCssUrl(String str) {
        str.getClass();
        this.cssUrl = str;
    }

    public final void setCurrentlyLoadedURL(String str) {
        str.getClass();
        this.currentlyLoadedURL = str;
    }

    public final void setEnvironment(ve2.e eVar) {
        eVar.getClass();
        this.environment = eVar;
    }

    public final void setLocale(String str) {
        str.getClass();
        this.locale = str;
    }

    public final void setShowPassword(boolean z14) {
        this.showPassword = z14;
    }

    public final void setSsoHost(String str) {
        str.getClass();
        this.ssoHost = str;
    }

    public final void setToolbarTitle(MobileAuthTextView mobileAuthTextView) {
        this.toolbarTitle = mobileAuthTextView;
    }

    public final void setWebView(WebView webView) {
        webView.getClass();
        this.webView = webView;
    }
}
