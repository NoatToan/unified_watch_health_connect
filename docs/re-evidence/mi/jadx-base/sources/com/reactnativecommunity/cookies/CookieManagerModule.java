package com.reactnativecommunity.cookies;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.accountsdk.utils.DateUtils;
import java.io.IOException;
import java.net.HttpCookie;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class CookieManagerModule extends ReactContextBaseJavaModule {
    private static final String CLEAR_BY_NAME_NOT_SUPPORTED = "Cannot remove a single cookie by name on Android";
    private static final String GET_ALL_NOT_SUPPORTED = "Get all cookies not supported for Android (iOS only)";
    private static final String INVALID_COOKIE_VALUES = "Unable to add cookie - invalid values";
    private static final String INVALID_DOMAINS = "Cookie URL host %s and domain %s mismatched. The cookie won't set correctly.";
    private static final String INVALID_URL_MISSING_HTTP = "Invalid URL: It may be missing a protocol (ex. http:// or https://).";
    private CookieSyncManager mCookieSyncManager;
    private static final boolean USES_LEGACY_STORE = false;
    private static final boolean HTTP_ONLY_SUPPORTED = true;

    public class a implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f10504a;

        public a(Promise promise) {
            this.f10504a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f10504a.resolve(bool);
        }
    }

    public class b implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f10506a;

        public b(Promise promise) {
            this.f10506a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f10506a.resolve(bool);
        }
    }

    public class c implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f10508a;

        public c(Promise promise) {
            this.f10508a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f10508a.resolve(bool);
        }
    }

    public CookieManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieSyncManager = CookieSyncManager.createInstance(reactApplicationContext);
    }

    private DateFormat RFC1123dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.PATTERN_RFC1123, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private void addCookies(String str, String str2, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (USES_LEGACY_STORE) {
                cookieManager.setCookie(str, str2);
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            } else {
                cookieManager.setCookie(str, str2, new c(promise));
                cookieManager.flush();
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    private WritableMap createCookieData(HttpCookie httpCookie) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", httpCookie.getName());
        writableMapCreateMap.putString("value", httpCookie.getValue());
        writableMapCreateMap.putString("domain", httpCookie.getDomain());
        writableMapCreateMap.putString("path", httpCookie.getPath());
        writableMapCreateMap.putBoolean(CardInfo.KEY_SECURE, httpCookie.getSecure());
        if (HTTP_ONLY_SUPPORTED) {
            writableMapCreateMap.putBoolean("httpOnly", httpCookie.isHttpOnly());
        }
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0) {
            String date = formatDate(new Date(maxAge));
            if (!isEmpty(date)) {
                writableMapCreateMap.putString("expires", date);
            }
        }
        return writableMapCreateMap;
    }

    private WritableMap createCookieList(String str) throws Exception {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (!isEmpty(str)) {
            for (String str2 : str.split(";")) {
                for (HttpCookie httpCookie : HttpCookie.parse(str2)) {
                    if (httpCookie != null) {
                        String name = httpCookie.getName();
                        String value = httpCookie.getValue();
                        if (!isEmpty(name) && !isEmpty(value)) {
                            writableMapCreateMap.putMap(name, createCookieData(httpCookie));
                        }
                    }
                }
            }
        }
        return writableMapCreateMap;
    }

    private DateFormat dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private String formatDate(Date date) {
        return formatDate(date, false);
    }

    private CookieManager getCookieManager() throws Exception {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            return cookieManager;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private HttpCookie makeHTTPCookieObject(String str, ReadableMap readableMap) throws Exception {
        Date date;
        try {
            String host = new URL(str).getHost();
            if (isEmpty(host)) {
                throw new Exception(INVALID_URL_MISSING_HTTP);
            }
            HttpCookie httpCookie = new HttpCookie(readableMap.getString("name"), readableMap.getString("value"));
            if (!readableMap.hasKey("domain") || isEmpty(readableMap.getString("domain"))) {
                httpCookie.setDomain(host);
            } else {
                String string = readableMap.getString("domain");
                if (string.startsWith(".")) {
                    string = string.substring(1);
                }
                if (!host.contains(string) && !host.equals(string)) {
                    throw new Exception(String.format(INVALID_DOMAINS, host, string));
                }
                httpCookie.setDomain(string);
            }
            if (readableMap.hasKey("path") && !isEmpty(readableMap.getString("path"))) {
                httpCookie.setPath(readableMap.getString("path"));
            }
            if (readableMap.hasKey("expires") && !isEmpty(readableMap.getString("expires")) && (date = parseDate(readableMap.getString("expires"))) != null) {
                httpCookie.setMaxAge(date.getTime());
            }
            if (readableMap.hasKey(CardInfo.KEY_SECURE) && readableMap.getBoolean(CardInfo.KEY_SECURE)) {
                httpCookie.setSecure(true);
            }
            if (HTTP_ONLY_SUPPORTED && readableMap.hasKey("httpOnly") && readableMap.getBoolean("httpOnly")) {
                httpCookie.setHttpOnly(true);
            }
            return httpCookie;
        } catch (Exception unused) {
            throw new Exception(INVALID_URL_MISSING_HTTP);
        }
    }

    private Date parseDate(String str) {
        return parseDate(str, false);
    }

    private String toRFC6265string(HttpCookie httpCookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(httpCookie.getName());
        sb.append('=');
        sb.append(httpCookie.getValue());
        if (!httpCookie.hasExpired()) {
            long maxAge = httpCookie.getMaxAge();
            if (maxAge > 0) {
                String date = formatDate(new Date(maxAge), true);
                if (!isEmpty(date)) {
                    sb.append("; expires=");
                    sb.append(date);
                }
            }
        }
        if (!isEmpty(httpCookie.getDomain())) {
            sb.append("; domain=");
            sb.append(httpCookie.getDomain());
        }
        if (!isEmpty(httpCookie.getPath())) {
            sb.append("; path=");
            sb.append(httpCookie.getPath());
        }
        if (httpCookie.getSecure()) {
            sb.append("; secure");
        }
        if (HTTP_ONLY_SUPPORTED && httpCookie.isHttpOnly()) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    @ReactMethod
    public void clearAll(Boolean bool, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (USES_LEGACY_STORE) {
                cookieManager.removeAllCookie();
                cookieManager.removeSessionCookie();
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            } else {
                cookieManager.removeAllCookies(new b(promise));
                cookieManager.flush();
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void clearByName(String str, String str2, Boolean bool, Promise promise) {
        promise.reject(new Exception(CLEAR_BY_NAME_NOT_SUPPORTED));
    }

    @ReactMethod
    public void flush(Promise promise) {
        try {
            getCookieManager().flush();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void get(String str, Boolean bool, Promise promise) {
        if (isEmpty(str)) {
            promise.reject(new Exception(INVALID_URL_MISSING_HTTP));
            return;
        }
        try {
            promise.resolve(createCookieList(getCookieManager().getCookie(str)));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void getAll(Boolean bool, Promise promise) {
        promise.reject(new Exception(GET_ALL_NOT_SUPPORTED));
    }

    @ReactMethod
    public void getFromResponse(String str, Promise promise) throws URISyntaxException, IOException {
        promise.resolve(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCookieManagerAndroid";
    }

    @ReactMethod
    public void removeSessionCookies(Promise promise) {
        try {
            getCookieManager().removeSessionCookies(new a(promise));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void set(String str, ReadableMap readableMap, Boolean bool, Promise promise) {
        try {
            String rFC6265string = toRFC6265string(makeHTTPCookieObject(str, readableMap));
            if (rFC6265string == null) {
                promise.reject(new Exception(INVALID_COOKIE_VALUES));
            } else {
                addCookies(str, rFC6265string, promise);
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void setFromResponse(String str, String str2, Promise promise) {
        if (str2 == null) {
            promise.reject(new Exception(INVALID_COOKIE_VALUES));
        } else {
            addCookies(str, str2, promise);
        }
    }

    private String formatDate(Date date, boolean z) {
        try {
            return (z ? RFC1123dateFormatter() : dateFormatter()).format(date);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private Date parseDate(String str, boolean z) {
        try {
            return (z ? RFC1123dateFormatter() : dateFormatter()).parse(str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
