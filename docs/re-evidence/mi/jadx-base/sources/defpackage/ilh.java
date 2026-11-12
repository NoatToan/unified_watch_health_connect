package defpackage;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;

/* JADX INFO: loaded from: classes9.dex */
public class ilh {
    public static boolean c;
    public static boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f21272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f21273b;

    public ilh(Context context, WebView webView) {
        this.f21273b = context;
        this.f21272a = webView;
    }

    public void a() {
        Context context = this.f21273b;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public void b() {
        Logger.i("UnregisterJsBridge", "exitApp");
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        CheckerUserSettingManagerExtKt.getInstance(companion).reportRemovePrivacyAgreeTime();
        CheckerUserSettingManagerExtKt.getInstance(companion).startSplashActivity((Activity) this.f21273b, Boolean.TRUE);
    }

    @JavascriptInterface
    public void endPassportProcess() {
        Logger.i("UnregisterJsBridge", "endPassportProcess");
        if (c) {
            b();
        } else {
            a();
        }
    }

    @JavascriptInterface
    public void notifyPassportStatus(String str) {
        Logger.i("UnregisterJsBridge", "notifyPassportStatus, processType=" + str);
        if ("unregisterSuccess".equals(str) || "delAccountSuccess".equals(str)) {
            c = true;
            d = true;
        }
    }
}
