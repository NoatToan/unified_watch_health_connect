package af2;

import a11.n;
import android.content.ActivityNotFoundException;
import android.webkit.WebView;
import com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity;
import d53.w;
import e23.p;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import re2.g0;
import re2.l0;
import v13.i;
import we2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0090@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Laf2/c;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "<init>", "()V", "", "constructToolbarTitle$mobile_auth_release", "(Lt13/d;)Ljava/lang/Object;", "constructToolbarTitle", "", "onBackPressedHandled$mobile_auth_release", "()Z", "onBackPressedHandled", "", "onToolbarBackPressed$mobile_auth_release", "onToolbarBackPressed", "onDestroyView", "Landroid/webkit/WebView;", "webView", "onBeforeLoadWebURL$mobile_auth_release", "(Landroid/webkit/WebView;)V", "onBeforeLoadWebURL", "Lwe2/e;", "d", "Lwe2/e;", "getCurrentPageLoadFlowName", "()Lwe2/e;", "setCurrentPageLoadFlowName", "(Lwe2/e;)V", "currentPageLoadFlowName", "Companion", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c extends MobileAuthAbstractWebFrag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3115a = m.b(new a03.d(21));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f3116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u53.d f3117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public we2.e currentPageLoadFlowName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3120b;

        static {
            int[] iArr = new int[we2.e.values().length];
            try {
                iArr[we2.e.CHANGE_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3119a = iArr;
            int[] iArr2 = new int[we2.d.values().length];
            try {
                iArr2[we2.d.PAGE_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[we2.d.USER_AUTHENTICATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[we2.d.COMMUNICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[we2.d.BOOTSTRAP_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[we2.d.USER_EXIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[we2.d.SESSION_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[we2.d.EXTERNAL_LINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            f3120b = iArr2;
        }
    }

    /* JADX INFO: renamed from: af2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.portal.MobileAuthAbstractPortalWebFrag$onBeforeLoadWebURL$1", f = "MobileAuthAbstractPortalWebFrag.kt", l = {}, m = "invokeSuspend")
    public static final class C0050c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f3122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0050c(WebView webView, t13.d<? super C0050c> dVar) {
            super(2, dVar);
            this.f3122b = webView;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C0050c(this.f3122b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0050c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            c cVar = c.this;
            cVar.H6().debug("initializing portal support...");
            cVar.f3116b = new e(cVar.getFragListener$mobile_auth_release().d7());
            g0.c(new n(17, this.f3122b, cVar), cVar);
            c.access$pollForPortalMessages(cVar);
            return Unit.INSTANCE;
        }
    }

    public static final void access$pollForPortalMessages(c cVar) throws InterruptedException {
        f fVar;
        String title;
        String serviceUrl;
        we2.a communication;
        e eVar = cVar.f3116b;
        if (eVar == null || (fVar = eVar.f3128e) == null) {
            return;
        }
        cVar.H6().debug("pollForPortalMessages");
        while (true) {
            boolean z14 = false;
            while (true) {
                if (!z14 && fVar.f3134d.get()) {
                    h hVarPoll = fVar.f3133c.poll(750L, TimeUnit.MILLISECONDS);
                    if (hVarPoll != null) {
                        if (cVar.getFragListener$mobile_auth_release().d7()) {
                            cVar.H6().debug("consumePortalMessage: {}", hVarPoll.toString());
                        } else {
                            cVar.H6().debug("consumePortalMessage: {}", hVarPoll.a(true));
                        }
                        switch (b.f3120b[hVarPoll.getEventType().ordinal()]) {
                            case 1:
                                we2.e flowName = hVarPoll.getFlowName();
                                if (flowName != null) {
                                    g gVar = cVar instanceof g ? (g) cVar : null;
                                    if (gVar != null) {
                                        gVar.setCurrentPageLoadFlowName(flowName);
                                    }
                                }
                                we2.c data = hVarPoll.getData();
                                if (data == null || (title = data.getTitle()) == null) {
                                    title = "";
                                }
                                cVar.updateToolbarTitle(title);
                                continue;
                                break;
                            case 2:
                                we2.c data2 = hVarPoll.getData();
                                if (data2 == null || (serviceUrl = data2.getServiceUrl()) == null) {
                                    cVar.H6().error("consumePortalMessage: USER_AUTHENTICATED event received without a service URL");
                                } else {
                                    String serviceTicket = hVarPoll.getData().getServiceTicket();
                                    if (serviceTicket != null) {
                                        cVar.getFragListener$mobile_auth_release().w6(new sc2.h(serviceUrl, serviceTicket));
                                    } else {
                                        cVar.H6().error("consumePortalMessage: USER_AUTHENTICATED event received without a service ticket");
                                    }
                                }
                                break;
                            case 3:
                                we2.c data3 = hVarPoll.getData();
                                if (data3 == null || (communication = data3.getCommunication()) == null) {
                                    cVar.H6().error("consumePortalMessage: COMMUNICATION event received without a communication object");
                                } else {
                                    g0.c(new n(16, cVar, communication), cVar);
                                }
                                break;
                            case 4:
                                cVar.getFragListener$mobile_auth_release().R4();
                                break;
                            case 5:
                                cVar.getFragListener$mobile_auth_release().F1();
                                break;
                            case 6:
                                cVar.getFragListener$mobile_auth_release().t5();
                                break;
                            case 7:
                                try {
                                    if (hVarPoll.getData() != null) {
                                        String url = hVarPoll.getData().getUrl();
                                        if (url != null && !w.J(url)) {
                                            URL url2 = new URL(hVarPoll.getData().getUrl());
                                            androidx.fragment.app.m activity = cVar.getActivity();
                                            if (activity == null) {
                                            }
                                            activity.runOnUiThread(new a8.d(activity, 1, url2, cVar));
                                        }
                                        cVar.H6().error("consumePortalMessage: EXTERNAL_LINK event received without a data.url value");
                                        continue;
                                    }
                                    cVar.H6().error("consumePortalMessage: EXTERNAL_LINK event received without a data object");
                                } catch (ActivityNotFoundException unused) {
                                    Logger loggerH6 = cVar.H6();
                                    we2.c data4 = hVarPoll.getData();
                                    data4.getClass();
                                    loggerH6.warn("consumePortalMessage: EXTERNAL_LINK event received but no Android activity found for handling [" + data4.getUrl() + "], loading in webview instead");
                                    WebView webView = cVar.getWebView();
                                    String url3 = hVarPoll.getData().getUrl();
                                    url3.getClass();
                                    webView.loadUrl(url3);
                                } catch (MalformedURLException unused2) {
                                    Logger loggerH7 = cVar.H6();
                                    we2.c data5 = hVarPoll.getData();
                                    data5.getClass();
                                    com.airbnb.lottie.animation.keyframe.a.z("consumePortalMessage: EXTERNAL_LINK event received with a malformed URL [", data5.getUrl(), "]", loggerH7);
                                }
                                break;
                            default:
                                u0.r();
                                return;
                        }
                        z14 = true;
                    }
                }
            }
        }
        cVar.H6().debug("stopped polling for portal messages");
    }

    public static final Logger logger_delegate$lambda$0() {
        l0.f152316a.getClass();
        return l0.c("AbstractPortalWebFrag");
    }

    public final Logger H6() {
        return (Logger) this.f3115a.getValue();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        return "";
    }

    public final we2.e getCurrentPageLoadFlowName() {
        return this.currentPageLoadFlowName;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public boolean onBackPressedHandled$mobile_auth_release() {
        if (w.z(getCurrentlyLoadedURL(), "support.garmin.com", true) && getWebView().canGoBack()) {
            getWebView().goBack();
            return true;
        }
        we2.e eVar = this.currentPageLoadFlowName;
        if (eVar == null || b.f3119a[eVar.ordinal()] != 1) {
            return false;
        }
        getWebView().loadUrl(constructURL$mobile_auth_release());
        return true;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public void onBeforeLoadWebURL$mobile_auth_release(WebView webView) {
        webView.getClass();
        x53.c cVar = s0.f129406a;
        u53.d dVarA = c0.a(x53.b.f189152a.plus(new a0("AbstractPortalWebFrag")));
        this.f3117c = dVarA;
        ge1.b.T(dVarA, null, null, new C0050c(webView, null), 3);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        H6().debug("onDestroyView");
        try {
            u53.d dVar = this.f3117c;
            if (dVar != null) {
                c0.c(dVar, new CancellationException("fragment onDestroyView"));
            }
        } catch (Exception unused) {
        }
        try {
            e eVar = this.f3116b;
            if (eVar != null) {
                eVar.a();
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public void onToolbarBackPressed$mobile_auth_release() {
        androidx.fragment.app.m activity = getActivity();
        AuthenticationActivity authenticationActivity = activity instanceof AuthenticationActivity ? (AuthenticationActivity) activity : null;
        if (authenticationActivity != null) {
            authenticationActivity.onBackPressed();
        }
        androidx.fragment.app.m activity2 = getActivity();
        MFAPortalFlowActivity mFAPortalFlowActivity = activity2 instanceof MFAPortalFlowActivity ? (MFAPortalFlowActivity) activity2 : null;
        if (mFAPortalFlowActivity != null) {
            mFAPortalFlowActivity.onBackPressed();
        }
        androidx.fragment.app.m activity3 = getActivity();
        AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity = activity3 instanceof AuthenticateAndFetchCustomerGUIDActivity ? (AuthenticateAndFetchCustomerGUIDActivity) activity3 : null;
        if (authenticateAndFetchCustomerGUIDActivity != null) {
            authenticateAndFetchCustomerGUIDActivity.onBackPressed();
        }
    }

    public final void setCurrentPageLoadFlowName(we2.e eVar) {
        this.currentPageLoadFlowName = eVar;
    }

    /* JADX INFO: renamed from: af2.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laf2/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
