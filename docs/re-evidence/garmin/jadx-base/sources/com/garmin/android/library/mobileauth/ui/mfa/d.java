package com.garmin.android.library.mobileauth.ui.mfa;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.m;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/d;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends MobileAuthAbstractWebFrag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50534a = new a(null);

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        return "";
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public final String constructURL$mobile_auth_release() throws UnsupportedEncodingException {
        String ssoHost = getSsoHost();
        String string = requireArguments().getString("loginToken");
        boolean z14 = requireArguments().getBoolean("permanentMFA");
        String locale = getLocale();
        String clientIDLoggingOnly = getClientIDLoggingOnly();
        String strEncode = URLEncoder.encode(requireArguments().getString("service"), "UTF-8");
        String strEncode2 = URLEncoder.encode(getCssUrl(), "UTF-8");
        String consentIDsQueryString = getConsentIDsQueryString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(ssoHost);
        sb3.append("/sso/login?logintoken=");
        sb3.append(string);
        sb3.append("&performMFACheck=true&permanentMFA=");
        sb3.append(z14);
        sn.a.t(sb3, "&mobile=true&locale=", locale, "&clientId=", clientIDLoggingOnly);
        sn.a.t(sb3, "&service=", strEncode, "&cssUrl=", strEncode2);
        sb3.append(consentIDsQueryString);
        return sb3.toString();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public final boolean onBackPressedHandled$mobile_auth_release() {
        if (!getWebView().canGoBack()) {
            return false;
        }
        getWebView().goBack();
        return true;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public final void onBeforeLoadWebURL$mobile_auth_release(WebView webView) {
        webView.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final void onToolbarBackPressed$mobile_auth_release() {
        m activity = getActivity();
        activity.getClass();
        ((MFACasFlowActivity) activity).onBackPressed();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag, com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.library.mobileauth.ui.a) activity).V9();
        super.onViewCreated(view2, bundle);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177781v;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177780u;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/d$a;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
