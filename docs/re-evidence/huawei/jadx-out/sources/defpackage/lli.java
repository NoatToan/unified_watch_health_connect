package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.entity.Builder;
import com.huawei.phoneservice.faq.base.util.SdkListener;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.feedback.utils.SdkFeedbackProblemManager;
import com.huawei.phoneservice.feedbackcommon.utils.e;
import health.compact.a.BuildTypeConfig;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.WhiteBoxManager;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lli implements SdkListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40413c = new Object();
    private static volatile lli d;
    private static volatile boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f40414a;
    private WeakReference<Handler> f;
    private volatile boolean j = false;
    private volatile boolean h = false;
    private volatile boolean g = false;
    private boolean i = false;

    private lli() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        whiteBoxManagerB.a(1, 34);
        whiteBoxManagerB.a(1, 1034);
        whiteBoxManagerB.a(1, 2034);
    }

    public static lli e() {
        if (d == null) {
            synchronized (f40413c) {
                if (d == null) {
                    d = new lli();
                }
            }
        }
        return d;
    }

    public static boolean c() {
        String strD = lon.c().d("common_config_feedbacksdk_switch");
        LogUtil.a("HwFeedbackApi", "isFeedbackSwitchOpen , COMMON_CONFIG_FEEDBACKSDK_SWITCH = ", strD);
        return "on".equalsIgnoreCase(strD);
    }

    public static boolean a() {
        String strD = lon.c().d("common_config_feedbacksdk_switch");
        LogUtil.a("HwFeedbackApi", "isFeedbackSwitchClose , COMMON_CONFIG_FEEDBACKSDK_SWITCH = ", strD);
        return "off".equalsIgnoreCase(strD);
    }

    private boolean g() {
        String strD = lon.c().d("common_config_feedbacksdk_switch");
        LogUtil.a("HwFeedbackApi", "isFeedbackSwitchValidate , COMMON_CONFIG_FEEDBACKSDK_SWITCH = ", strD);
        if (Utils.o()) {
            return "on".equalsIgnoreCase(strD);
        }
        return !"off".equalsIgnoreCase(strD);
    }

    public void e(Context context) {
        LogUtil.a("HwFeedbackApi", "enter resetSdkLanguage");
        e.f().saveSdk("language", a(context));
    }

    public int a(Activity activity, boolean z) {
        return c(activity, z, false, "", "");
    }

    public int c(Activity activity, boolean z, boolean z2, String str, String str2) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.a("HwFeedbackApi", "init activity is null, finish or destroyed");
            return -1;
        }
        this.f40414a = new WeakReference<>(activity);
        this.i = z;
        ReleaseLogUtil.c("R_HwFeedbackApi", "init mIsInit = ", Boolean.valueOf(this.h));
        if (this.h) {
            if (this.i) {
                this.i = false;
                c(activity, z2, str, str2);
            }
            return 0;
        }
        b(this.i, null);
        return -1;
    }

    public void b(final boolean z, final Handler handler) {
        if (!h()) {
            LogUtil.a("HwFeedbackApi", "not need init sdk");
        } else if (HandlerExecutor.c()) {
            i();
            lsy.a(new Runnable() { // from class: lli.5
                @Override // java.lang.Runnable
                public void run() {
                    lli.this.d(z, handler);
                }
            });
        } else {
            HandlerExecutor.c(new Runnable() { // from class: lli.1
                @Override // java.lang.Runnable
                public void run() {
                    lli.this.b(z, handler);
                }
            });
        }
    }

    private boolean h() {
        return !((SystemInfo.e(true) || CommonUtil.h(BaseApplication.b()) == 0) && Utils.o()) && Utils.h() && LoginInit.getInstance(BaseApplication.b()).getIsLogined() && !CommonUtil.bq() && g();
    }

    private void i() {
        if (e) {
            return;
        }
        e = true;
        e.f().init(BaseApplication.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, Handler handler) {
        LogUtil.a("HwFeedbackApi", "initAsync()");
        this.f = new WeakReference<>(handler);
        this.i = z;
        Application applicationF = BaseApplication.f();
        this.j = true;
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "Initialized_Feedback", false);
        Builder builder = new Builder();
        e(LoginInit.getInstance(applicationF).getAccountInfo(1015));
        if (TextUtils.isEmpty(f40412b)) {
            d(applicationF);
        }
        builder.set("channel", "1020").set("language", a(applicationF)).set("country", c(applicationF)).set("appVersion", CommonUtil.a(applicationF)).set("accessToken", f40412b).set(FaqConstants.FAQ_LOG_SERVER_APPID, "1019").set(FaqConstants.FAQ_SHASN, CommonUtil.k(applicationF)).set("romVersion", CommonUtil.ag()).set("osVersion", Build.VERSION.RELEASE).set("countryCode", Constants.DEFAULT_MCC_CODE).set(FaqConstants.FAQ_USE_OLD_DOMAIN, "Y").set(FaqConstants.FAQ_UPLOAD_FLAG, "2").set(FaqConstants.FAQ_CONTACT_NOT_NECESSARY, "Y");
        if (CommonUtil.bu()) {
            builder.set(FaqConstants.FAQ_LOG_SERVER_LOG_PATH, BaseApplication.d());
        } else {
            builder.set(FaqConstants.FAQ_LOG_SERVER_LOG_PATH, "huaweisystem/" + BaseApplication.d()).set(FaqConstants.FAQ_LOG_SERVER_LOG_SDCARD, "Y");
        }
        if (!CommonUtil.bg()) {
            builder.set(FaqConstants.FAQ_EMUIVERSION, "10.1.0");
        }
        e.f().init(applicationF, builder, this);
        if (BuildTypeConfig.e()) {
            return;
        }
        i.a().showReleaseLog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        f40412b = str;
    }

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public void onSdkInit(int i, int i2, String str) {
        ReleaseLogUtil.c("R_HwFeedbackApi", "init onSdkInit result:", Integer.valueOf(i), " code:", Integer.valueOf(i2), " msg:", str);
        this.h = i == 0;
        this.j = false;
        if (!this.h && 3 == i2) {
            this.g = true;
        }
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "Initialized_Feedback", this.h);
        WeakReference<Handler> weakReference = this.f;
        if (weakReference == null) {
            LogUtil.j("HwFeedbackApi", "init onSdkInit mHandlerWeakReference is null");
            return;
        }
        Handler handler = weakReference.get();
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 16;
            messageObtainMessage.obj = Boolean.valueOf(this.h);
            handler.sendMessage(messageObtainMessage);
        }
        WeakReference<Activity> weakReference2 = this.f40414a;
        if (weakReference2 == null) {
            LogUtil.j("HwFeedbackApi", "init onSdkInit mActivityWeakReference is null");
            return;
        }
        Activity activity = weakReference2.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.a("HwFeedbackApi", "init onSdkInit activity is null, finish or destroyed");
        } else if (this.h && this.i) {
            this.i = false;
            c(activity, false, "", "");
        }
    }

    public boolean f() {
        return this.j;
    }

    public boolean b() {
        return this.h;
    }

    public boolean d() {
        return this.g;
    }

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public void onSdkErr(String str, String str2) {
        LogUtil.j("HwFeedbackApi", "init onSdkErr key:", str);
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo) || accountInfo.equals(str2)) {
            d(BaseApplication.b());
        } else {
            e.f().saveSdk("accessToken", accountInfo);
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public boolean haveSdkErr(String str) {
        LogUtil.j("HwFeedbackApi", "init haveSdkErr key:", str);
        return "accessToken".equals(str);
    }

    private String a(Context context) {
        String strB = LanguageUtil.b(context);
        return !TextUtils.isEmpty(strB) ? strB : MLAsrConstants.LAN_ZH;
    }

    private String c(Context context) {
        if (context != null) {
            LoginInit loginInit = LoginInit.getInstance(context);
            if (loginInit.getIsLogined()) {
                String accountInfo = loginInit.getAccountInfo(1010);
                if (!TextUtils.isEmpty(accountInfo)) {
                    return accountInfo;
                }
            }
        }
        String country = Locale.getDefault().getCountry();
        return TextUtils.isEmpty(country) ? "CN" : country;
    }

    private void d(Context context) {
        WeakReference<Activity> weakReference = this.f40414a;
        if (weakReference == null) {
            LogUtil.j("HwFeedbackApi", "obtainToken mActivityWeakReference == null");
        } else if (weakReference.get() == null) {
            LogUtil.j("HwFeedbackApi", "init onSdkErr activity is null");
        } else {
            LoginInit.getInstance(context).refreshAccessToken(new ILoginCallback() { // from class: lli.2
                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginSuccess(Object obj) {
                    if (!(obj instanceof String)) {
                        LogUtil.j("HwFeedbackApi", "obtainToken object convert fail");
                        return;
                    }
                    String str = (String) obj;
                    lli.e(str);
                    e.f().saveSdk("accessToken", str);
                }

                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginFailed(Object obj) {
                    LogUtil.j("HwFeedbackApi", "onLoginFailed:", obj);
                }
            });
        }
    }

    private void c(Activity activity, boolean z, String str, String str2) {
        String accountInfo = LoginInit.getInstance(activity).getAccountInfo(1015);
        if (TextUtils.isEmpty(f40412b) && TextUtils.isEmpty(accountInfo)) {
            d(activity.getApplicationContext());
        } else if (TextUtils.isEmpty(f40412b) && !TextUtils.isEmpty(accountInfo)) {
            e(accountInfo);
            e.f().saveSdk("accessToken", accountInfo);
        } else {
            LogUtil.a("HwFeedbackApi", "startActivity , init sdk complete");
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            boolean zContains = str2.contains(Constants.LEFT_BRACKET_ONLY);
            if (z && zContains) {
                str2 = str2.substring(0, str2.indexOf(Constants.LEFT_BRACKET_ONLY));
            }
            e.f().saveSdk("model", str);
            e.f().saveSdk(FaqConstants.FAQ_SOFT_VERSION, str2);
        }
        ReleaseLogUtil.c("R_HwFeedbackApi", "gotoFeedback");
        SdkFeedbackProblemManager.getManager().gotoFeedback(activity, null, -1);
    }

    public void j() {
        ReleaseLogUtil.c("R_HwFeedbackApi", "resetInitFlag");
        this.h = false;
        this.j = false;
    }
}
