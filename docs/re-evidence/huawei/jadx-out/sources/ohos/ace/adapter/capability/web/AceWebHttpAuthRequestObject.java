package ohos.ace.adapter.capability.web;

import android.content.Context;
import android.webkit.HttpAuthHandler;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebHttpAuthRequestObject {
    private static final String LOG_TAG = "AceWebHttpAuthRequestObject";
    private Context context;
    private HttpAuthHandler handler;
    private String host;
    private String realm;

    public AceWebHttpAuthRequestObject(HttpAuthHandler httpAuthHandler, String str, String str2, Context context) {
        this.handler = httpAuthHandler;
        this.host = str;
        this.realm = str2;
        this.context = context;
    }

    private Context getContext() {
        return this.context;
    }

    public HttpAuthHandler getRequestUrl() {
        return this.handler;
    }

    public String getHost() {
        return this.host;
    }

    public String getRealm() {
        return this.realm;
    }

    public void cancel() {
        try {
            this.handler.cancel();
        } catch (Exception unused) {
            ALog.e(LOG_TAG, "call cancel method failed");
        }
    }

    public boolean proceed(String str, String str2) {
        try {
            this.handler.proceed(str, str2);
            return true;
        } catch (Exception unused) {
            ALog.e(LOG_TAG, "call proceed method failed");
            return true;
        }
    }

    public boolean useHttpAuthUsernamePassword() {
        WebDataBaseManager webDataBaseManager;
        WebDataBaseCredential httpAuthCredential;
        try {
            boolean zUseHttpAuthUsernamePassword = this.handler.useHttpAuthUsernamePassword();
            if (zUseHttpAuthUsernamePassword && (webDataBaseManager = WebDataBaseManager.getInstance(getContext())) != null && (httpAuthCredential = webDataBaseManager.getHttpAuthCredential(getHost(), getRealm())) != null) {
                proceed(httpAuthCredential.getUsername(), httpAuthCredential.getPassword());
            }
            return zUseHttpAuthUsernamePassword;
        } catch (Exception unused) {
            ALog.e(LOG_TAG, "call useHttpAuthUsernamePassword method failed");
            return false;
        }
    }
}
