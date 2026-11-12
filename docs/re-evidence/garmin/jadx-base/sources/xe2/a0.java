package xe2;

import android.content.res.Resources;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0090@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001b"}, d2 = {"Lxe2/a0;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "<init>", "()V", "", "constructURL$mobile_auth_release", "()Ljava/lang/String;", "constructURL", "constructToolbarTitle$mobile_auth_release", "(Lt13/d;)Ljava/lang/Object;", "constructToolbarTitle", "", "useBackgroundImage$mobile_auth_release", "()Z", "useBackgroundImage", "shouldBlurBackgroundImage$mobile_auth_release", "shouldBlurBackgroundImage", "onBackPressedHandled$mobile_auth_release", "onBackPressedHandled", "Landroid/webkit/WebView;", "webView", "", "onBeforeLoadWebURL$mobile_auth_release", "(Landroid/webkit/WebView;)V", "onBeforeLoadWebURL", "onToolbarBackPressed$mobile_auth_release", "onToolbarBackPressed", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 extends MobileAuthAbstractWebFrag {
    public static final int $stable = 8;

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        re2.l0 l0Var = re2.l0.f152316a;
        Resources resources = getResources();
        resources.getClass();
        String string = getString(R.string.account_create_account_button);
        string.getClass();
        ve2.e environment = getEnvironment();
        l0Var.getClass();
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new re2.i0(environment, resources, string, null), dVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public String constructURL$mobile_auth_release() {
        String ssoHost = getSsoHost();
        String clientIDLoggingOnly = getClientIDLoggingOnly();
        String locale = getLocale();
        String ssoHost2 = getSsoHost();
        boolean z14 = getMobileAuthConfig$mobile_auth_release().f177769j;
        boolean z15 = getMobileAuthConfig$mobile_auth_release().f177771l;
        boolean showPassword = getShowPassword();
        String cssUrl = getCssUrl();
        String consentIDsQueryString = getConsentIDsQueryString();
        StringBuilder sbL = e5.l(ssoHost, "/sso/embed?clientId=", clientIDLoggingOnly, "&locale=", locale);
        com.airbnb.lottie.animation.keyframe.a.t("&gauthHost=", ssoHost2, "/sso&reauth=true&mobile=true&id=gauth-widget&embedWidget=true&openCreateAccount=true&globalOptInShown=", sbL, z14);
        com.airbnb.lottie.animation.keyframe.a.v("&connectLegalTerms=true&locationPromptShown=true&showConnectLegalAge=", "&showPassword=", sbL, z15, showPassword);
        return v.e0.h(sbL, "&cssUrl=", cssUrl, consentIDsQueryString);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public boolean onBackPressedHandled$mobile_auth_release() {
        return false;
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
        return getMobileAuthConfig$mobile_auth_release().f177783x;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177782w;
    }
}
