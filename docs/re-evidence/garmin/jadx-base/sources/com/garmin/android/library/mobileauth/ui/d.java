package com.garmin.android.library.mobileauth.ui;

import android.content.res.Resources;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import i3.e5;
import java.net.URLEncoder;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import re2.i0;
import re2.l0;
import ve2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\bH\u0090@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001a\u0010\u0003¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/d;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "<init>", "()V", "", "constructURL$mobile_auth_release", "()Ljava/lang/String;", "constructURL", "", "constructToolbarTitle$mobile_auth_release", "(Lt13/d;)Ljava/lang/Object;", "constructToolbarTitle", "", "useBackgroundImage$mobile_auth_release", "()Z", "useBackgroundImage", "shouldBlurBackgroundImage$mobile_auth_release", "shouldBlurBackgroundImage", "onBackPressedHandled$mobile_auth_release", "onBackPressedHandled", "Landroid/webkit/WebView;", "webView", "", "onBeforeLoadWebURL$mobile_auth_release", "(Landroid/webkit/WebView;)V", "onBeforeLoadWebURL", "onToolbarBackPressed$mobile_auth_release", "onToolbarBackPressed", "Companion", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends MobileAuthAbstractWebFrag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public Object constructToolbarTitle$mobile_auth_release(t13.d<? super CharSequence> dVar) {
        Companion companion = INSTANCE;
        Resources resources = getResources();
        resources.getClass();
        ve2.e environment = getEnvironment();
        companion.getClass();
        l0 l0Var = l0.f152316a;
        String string = resources.getString(R.string.txt_sign_in_button);
        string.getClass();
        l0Var.getClass();
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new i0(environment, resources, string, null), dVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public String constructURL$mobile_auth_release() {
        String ssoHost = getSsoHost();
        String clientIDLoggingOnly = getClientIDLoggingOnly();
        String locale = getLocale();
        String ssoHost2 = getSsoHost();
        boolean showPassword = getShowPassword();
        String cssUrl = getCssUrl();
        String strN = "";
        String str = (getEnvironment() == ve2.e.f177705e || getEnvironment() == ve2.e.f177706f) ? "&socialEnabled=false" : "";
        if (getMultiUserMode() != null) {
            m multiUserMode = getMultiUserMode();
            multiUserMode.getClass();
            if (multiUserMode.f177789d != null) {
                m multiUserMode2 = getMultiUserMode();
                multiUserMode2.getClass();
                strN = fb1.c.n("&lockToEmailAddress=", URLEncoder.encode(multiUserMode2.f177789d, "UTF-8"));
            }
        }
        String consentIDsQueryString = getConsentIDsQueryString();
        StringBuilder sbL = e5.l(ssoHost, "/sso/embed?clientId=", clientIDLoggingOnly, "&locale=", locale);
        com.airbnb.lottie.animation.keyframe.a.t("&gauthHost=", ssoHost2, "/sso&reauth=true&mobile=true&id=gauth-widget&embedWidget=true&createAccountShown=false&displayNameShown=false&showPassword=", sbL, showPassword);
        sn.a.t(sbL, "&cssUrl=", cssUrl, str, strN);
        sbL.append(consentIDsQueryString);
        return sbL.toString();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public boolean onBackPressedHandled$mobile_auth_release() {
        if (!w.z(getCurrentlyLoadedURL(), "support.garmin.com", false) || !getWebView().canGoBack()) {
            return false;
        }
        getWebView().goBack();
        return true;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public void onBeforeLoadWebURL$mobile_auth_release(WebView webView) {
        webView.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public void onToolbarBackPressed$mobile_auth_release() {
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((AuthenticationActivity) activity).onBackPressed();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177781v;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177780u;
    }

    /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/d$a;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
