package com.xiaomi.smarthome.library.http.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewCookieManager {
    static final String TAG = "CookieManager";
    private static final boolean USES_LEGACY_STORE = false;
    private CookieManager mCookieManager;
    private CookieSaver mCookieSaver;

    public class CookieSaver {
        private static final int MSG_PERSIST_COOKIES = 1;
        private static final int TIMEOUT = 30000;
        private final Handler mHandler;

        public CookieSaver() {
            this.mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.CookieSaver.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message.what != 1) {
                        return false;
                    }
                    CookieSaver.this.persistCookies();
                    return true;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(21)
        public void flush() {
            WebViewCookieManager.this.getCookieManager().flush();
        }

        public void onCookiesModified() {
            if (WebViewCookieManager.USES_LEGACY_STORE) {
                this.mHandler.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        public void persistCookies() {
            this.mHandler.removeMessages(1);
            WebViewCookieManager.this.runInBackground(new Runnable() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.CookieSaver.2
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewCookieManager.USES_LEGACY_STORE) {
                        CookieSyncManager.getInstance().sync();
                    } else {
                        CookieSaver.this.flush();
                    }
                }
            });
        }
    }

    public static class WebViewCookieManagerInner {
        static WebViewCookieManager instance = new WebViewCookieManager();

        private WebViewCookieManagerInner() {
        }
    }

    @TargetApi(21)
    private void addCookieAsync(String str, String str2) {
        getCookieManager().setCookie(str, str2, null);
    }

    @TargetApi(21)
    private void clearCookiesAsync() {
        getCookieManager().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                WebViewCookieManager.this.mCookieSaver.onCookiesModified();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager getCookieManager() {
        if (this.mCookieManager == null) {
            possiblyWorkaroundSyncManager(MiJiaEnvironment.getAppContext());
            CookieManager cookieManager = CookieManager.getInstance();
            this.mCookieManager = cookieManager;
            if (USES_LEGACY_STORE) {
                cookieManager.removeExpiredCookie();
            }
        }
        return this.mCookieManager;
    }

    public static WebViewCookieManager getInstance() {
        return WebViewCookieManagerInner.instance;
    }

    private static void possiblyWorkaroundSyncManager(Context context) {
        if (USES_LEGACY_STORE) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInBackground(final Runnable runnable) {
        new AsyncTask<Void, Void, Void>() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.4
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                runnable.run();
                return null;
            }
        }.execute(new Void[0]);
    }

    public String getCookie(String str) {
        String cookie = getCookieManager().getCookie(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getCookie(): ");
        sb.append(str);
        sb.append(", ");
        sb.append(cookie);
        return cookie;
    }

    public void removeAllCookies() {
        if (USES_LEGACY_STORE) {
            new AsyncTask<Void, Void, Void>() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.2
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    WebViewCookieManager.this.getCookieManager().removeAllCookie();
                    WebViewCookieManager.this.mCookieSaver.onCookiesModified();
                    return null;
                }
            }.execute(new Void[0]);
        } else {
            clearCookiesAsync();
        }
    }

    public void removeCookie(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("removeCookie(): ");
        sb.append(str);
        String[] strArrSplit = getCookie(str).split(";");
        if (strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length > 0 && !TextUtils.isEmpty(strArrSplit2[0])) {
                    setCookie(str, strArrSplit2[0] + "=EXPIRED; domain=" + str + "; expires=Thu, 01-Dec-1994 16:00:00 GMT");
                }
            }
        }
    }

    public void setCookie(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        setCookie(str3, str + "=" + str2 + "; domain=" + str3);
    }

    private WebViewCookieManager() {
        this.mCookieSaver = new CookieSaver();
    }

    public void setCookie(final String str, final String str2) {
        if (USES_LEGACY_STORE) {
            runInBackground(new Runnable() { // from class: com.xiaomi.smarthome.library.http.util.WebViewCookieManager.1
                @Override // java.lang.Runnable
                public void run() {
                    WebViewCookieManager.this.getCookieManager().setCookie(str, str2);
                    WebViewCookieManager.this.mCookieSaver.onCookiesModified();
                }
            });
        } else {
            addCookieAsync(str, str2);
            this.mCookieSaver.onCookiesModified();
        }
    }
}
