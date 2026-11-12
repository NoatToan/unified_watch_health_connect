package com.garmin.android.library.mobileauth.ui.mfa;

import am.j;
import i3.e5;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import p005kotlin.Metadata;
import ve2.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/e;", "Laf2/c;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends af2.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50535e = new a(null);

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public final String constructURL$mobile_auth_release() throws UnsupportedEncodingException {
        l mobileAuthConfig$mobile_auth_release = getMobileAuthConfig$mobile_auth_release();
        String string = requireArguments().getString("environment");
        string.getClass();
        URL urlF = mobileAuthConfig$mobile_auth_release.f(ve2.e.valueOf(string));
        String ssoHost = getSsoHost();
        String strE = mobileAuthConfig$mobile_auth_release.e();
        String locale = getLocale();
        boolean z14 = requireArguments().getBoolean("permanent.mfa");
        String string2 = requireArguments().getString("login.token");
        String strEncode = URLEncoder.encode(String.valueOf(urlF), "UTF-8");
        StringBuilder sbL = e5.l(ssoHost, "/mobile/gateway/login?clientId=", strE, "&locale=", locale);
        sbL.append("&performMFACheck=true&permanentMFA=");
        sbL.append(z14);
        sbL.append("&loginToken=");
        sbL.append(string2);
        return j.o("&service=", strEncode, sbL);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177781v;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177780u;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/e$a;", "", "<init>", "()V", "", "EXTRA_LOGIN_TOKEN", "Ljava/lang/String;", "EXTRA_PERMANENT_MFA", "EXTRA_ENVIRONMENT", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
