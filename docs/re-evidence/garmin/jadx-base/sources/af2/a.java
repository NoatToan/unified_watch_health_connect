package af2;

import android.os.Bundle;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0010¢\u0006\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Laf2/a;", "Laf2/c;", "<init>", "()V", "", "constructURL$mobile_auth_release", "()Ljava/lang/String;", "constructURL", "", "useBackgroundImage$mobile_auth_release", "()Z", "useBackgroundImage", "shouldBlurBackgroundImage$mobile_auth_release", "shouldBlurBackgroundImage", "Companion", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends c {
    public static final String ARG_PARENTAL_CONSENT_REQUIRED = "parentalConsentRequired";
    public static final int $stable = 8;

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public String constructURL$mobile_auth_release() {
        String ssoHost = getSsoHost();
        String locale = getLocale();
        String strE = getMobileAuthConfig$mobile_auth_release().e();
        Bundle arguments = getArguments();
        String str = (arguments == null || !arguments.getBoolean(ARG_PARENTAL_CONSENT_REQUIRED, false)) ? "" : "&parentalConsentRequired=true";
        StringBuilder sbL = e5.l(ssoHost, "/mobile/sso/", locale, "/create-account?clientId=", strE);
        sbL.append(str);
        return sbL.toString();
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
