package com.xiaomi.passport.utils;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.onetrack.util.z;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public class WebSsoCookieUtils {
    private static final String TAG = "WebSsoCookieUtils";
    private final Context context;
    final String cookieDomain;
    final String cookiePath;
    private final ServiceTokenVerifier serviceTokenVerifier;
    private final String sid;
    private final String url;

    public static final class Builder {
        private Context context;
        private String cookieDomain;
        private String cookiePath = "/";
        private ServiceTokenVerifier serviceTokenVerifier;
        private String sid;
        private String url;

        private void throwIfNull(Object obj, String str) {
            if (obj != null) {
                return;
            }
            throw new IllegalArgumentException("" + str + " is null");
        }

        public WebSsoCookieUtils build() {
            throwIfNull(this.context, "context");
            throwIfNull(this.sid, "sid");
            throwIfNull(this.url, "url");
            throwIfNull(this.cookiePath, "cookiePath");
            if (this.cookieDomain == null) {
                try {
                    this.cookieDomain = new URL(this.url).getHost();
                } catch (MalformedURLException e) {
                    AccountLogger.log(WebSsoCookieUtils.TAG, "bad url", e);
                }
            }
            throwIfNull(this.cookieDomain, "cookieDomain");
            return new WebSsoCookieUtils(this);
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder cookieDomain(String str) {
            this.cookieDomain = str;
            return this;
        }

        public Builder cookiePath(String str) {
            this.cookiePath = str;
            return this;
        }

        public Builder serviceTokenVerifier(ServiceTokenVerifier serviceTokenVerifier) {
            this.serviceTokenVerifier = serviceTokenVerifier;
            return this;
        }

        public Builder sid(String str) {
            this.sid = str;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    public interface ServiceTokenVerifier {
        boolean verify(ServiceTokenResult serviceTokenResult);
    }

    public static String getCookie(String str, String str2, String str3, String str4) {
        return String.format("%s=%s; domain=%s; path=%s", str2, str3, str, str4);
    }

    private ServiceTokenResult getServiceTokenResult(boolean z) {
        ServiceTokenResult serviceTokenResult = getAm().getServiceToken(getAm().getXiaomiAccount(), this.sid, null).get();
        if (TextUtils.isEmpty(serviceTokenResult.serviceToken)) {
            AccountLogger.log(TAG, String.format("setCookie error: no serviceToken for sid %s", this.sid));
            return null;
        }
        if (TextUtils.isEmpty(serviceTokenResult.cUserId)) {
            AccountLogger.log(TAG, "setCookie error: no cUserId");
            return null;
        }
        if (TextUtils.isEmpty(serviceTokenResult.slh)) {
            AccountLogger.log(TAG, String.format("setCookie error: no %s_slh", this.sid));
            if (z) {
                return reGetServiceTokenResult(serviceTokenResult);
            }
            return null;
        }
        if (TextUtils.isEmpty(serviceTokenResult.ph)) {
            AccountLogger.log(TAG, String.format("setCookie error: no %s_ph", this.sid));
            if (z) {
                return reGetServiceTokenResult(serviceTokenResult);
            }
            return null;
        }
        if (!verifyAndFail(z, serviceTokenResult, this.serviceTokenVerifier)) {
            return serviceTokenResult;
        }
        AccountLogger.log(TAG, String.format("serviceToken for sid %s is invalid. Re-get again.", this.sid));
        return reGetServiceTokenResult(serviceTokenResult);
    }

    private ServiceTokenResult reGetServiceTokenResult(ServiceTokenResult serviceTokenResult) {
        getAm().invalidateServiceToken(serviceTokenResult);
        return getServiceTokenResult(false);
    }

    public static String rootDomain(String str) {
        String[] strArrSplit = str.split(z.f14007a);
        int length = strArrSplit.length;
        return length <= 2 ? str : String.format(".%s.%s", strArrSplit[length - 2], strArrSplit[length - 1]);
    }

    private static boolean verifyAndFail(boolean z, ServiceTokenResult serviceTokenResult, ServiceTokenVerifier serviceTokenVerifier) {
        return z && serviceTokenResult.peeked && serviceTokenVerifier != null && !serviceTokenVerifier.verify(serviceTokenResult);
    }

    public boolean fastCheckSlhPhCompatibility() {
        return true;
    }

    public XiaomiAccountManager getAm() {
        return XiaomiAccountManager.get(this.context);
    }

    public CookieManager getCookieManager() {
        return CookieManager.getInstance();
    }

    public boolean isInMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public boolean setCookie() {
        return setCookieRet() != null;
    }

    public ServiceTokenResult setCookieRet() {
        if (isInMainThread()) {
            throw new IllegalStateException("WebSsoCookieUtils#setCookie() should NOT be called on main thread!");
        }
        if (!fastCheckSlhPhCompatibility()) {
            AccountLogger.log(TAG, "setCookie error: blocked on old miui versin");
            return null;
        }
        ServiceTokenResult serviceTokenResult = getServiceTokenResult(true);
        if (serviceTokenResult == null) {
            return null;
        }
        CookieSyncManager.createInstance(this.context);
        CookieManager cookieManager = getCookieManager();
        cookieManager.setCookie(this.url, getCookie(this.cookieDomain, "cUserId", serviceTokenResult.cUserId, this.cookiePath));
        cookieManager.setCookie(this.url, getCookie(this.cookieDomain, "serviceToken", serviceTokenResult.serviceToken, this.cookiePath));
        cookieManager.setCookie(this.url, getCookie(rootDomain(this.cookieDomain), this.sid + "_slh", serviceTokenResult.slh, this.cookiePath));
        cookieManager.setCookie(this.url, getCookie(this.cookieDomain, this.sid + "_ph", serviceTokenResult.ph, this.cookiePath));
        CookieSyncManager.getInstance().sync();
        return serviceTokenResult;
    }

    private WebSsoCookieUtils(Builder builder) {
        this.context = builder.context;
        this.sid = builder.sid;
        this.url = builder.url;
        this.cookiePath = builder.cookiePath;
        this.cookieDomain = builder.cookieDomain;
        this.serviceTokenVerifier = builder.serviceTokenVerifier;
    }
}
