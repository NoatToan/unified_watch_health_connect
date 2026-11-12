package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.engine.StageDelegateProxy;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class iov {
    public static boolean d(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static void d(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.j("ActivityUtils", "startActivity intent is null.");
            return;
        }
        if (!(context instanceof Activity)) {
            Activity activityJ = BaseApplication.j();
            if (activityJ != null) {
                context = activityJ;
            } else {
                intent.addFlags(268435456);
            }
        }
        if (context == null) {
            LogUtil.j("ActivityUtils", "startActivity context is null.");
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("ActivityUtils", "startActivity exception: ", LogAnonymous.b(e));
        }
    }

    public static void c(Context context, Intent intent) {
        if (StageDelegateProxy.getInstance().isAlreadyAvailable()) {
            a(context, intent);
        } else {
            StageDelegateProxy.getInstance().loadPlugins((Application) BaseApplication.b(), true, new AnonymousClass5(intent, context));
        }
    }

    /* JADX INFO: renamed from: iov$5, reason: invalid class name */
    class AnonymousClass5 implements AppBundleLauncher.InstallCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f37931b;

        AnonymousClass5(Intent intent, Context context) {
            this.f37931b = intent;
            this.f37930a = context;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            boolean zIsAlreadyAvailable = StageDelegateProxy.getInstance().isAlreadyAvailable();
            ReleaseLogUtil.d("R_ActivityUtils", "startStageActivity call isAlreadyAvailable ", Boolean.valueOf(zIsAlreadyAvailable));
            if (zIsAlreadyAvailable) {
                Intent intent2 = this.f37931b;
                long longExtra = intent2 == null ? 0L : intent2.getLongExtra("DELAY_MILLIS", 0L);
                ReleaseLogUtil.d("R_ActivityUtils", "startStageActivity call delayMillis ", Long.valueOf(longExtra));
                if (longExtra > 0) {
                    final Context context2 = this.f37930a;
                    final Intent intent3 = this.f37931b;
                    HandlerExecutor.c(new Runnable() { // from class: iow
                        @Override // java.lang.Runnable
                        public final void run() {
                            iov.a(context2, intent3);
                        }
                    }, longExtra);
                    return zIsAlreadyAvailable;
                }
                final Context context3 = this.f37930a;
                final Intent intent4 = this.f37931b;
                HandlerExecutor.b(new Runnable() { // from class: ioz
                    @Override // java.lang.Runnable
                    public final void run() {
                        iov.a(context3, intent4);
                    }
                });
            }
            return zIsAlreadyAvailable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.j("ActivityUtils", "startStageActivity intent is null.");
            return;
        }
        if (context instanceof Activity) {
            context = a((Activity) context);
        }
        if (!(context instanceof Activity)) {
            Activity activityJ = BaseApplication.j();
            if (activityJ != null) {
                context = activityJ;
            } else {
                intent.addFlags(268435456);
            }
        }
        if (context == null) {
            LogUtil.j("ActivityUtils", "startStageActivity context is null.");
            return;
        }
        StageDelegateProxy.getInstance().launchActivity(context, intent);
        if (intent.getBooleanExtra("IS_SUPPORT_TRANSITION_ANIMATOR", false) && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    public static Activity a(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? BaseApplication.j() : activity;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.e("ActivityUtils", "gotoOrderDetail context or pageId is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            String string = IntentParams.builder().addPageId(str).addPageType(str2).addBuildConfigInfo(CommonUtil.a()).addOrderCode(str3).build().toString();
            LogUtil.a("ActivityUtils", "gotoOrderDetail params: " + string);
            intent.putExtra(e.n, string);
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 4);
            c(context, intent);
        } catch (Exception e) {
            LogUtil.e("ActivityUtils", "gotoOrderDetail error: " + e.getMessage(), e);
        }
    }

    public static void e(Uri uri) {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.d(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_BLOOD_SUGAR).addBuildConfigInfo(CommonUtil.a()).addRecord("{'chooserType':1, 'entrance':\"entrance\"}").addBiFrom("Today_0001", "healthTrends".equals(uri.getQueryParameter("from")) ? "healthTrend_entry" : "", "").build();
            LogUtil.a("ActivityUtils", "gotoOrderDetail params: " + intentParamsBuild.toString());
            intent.putExtra(e.n, intentParamsBuild.toString());
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 5);
            c(BaseApplication.b(), intent);
        } catch (Exception e) {
            LogUtil.e("ActivityUtils", "gotoOrderDetail error: " + e.getMessage(), e);
        }
    }

    public static void d(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("ActivityUtils", "startMainActivityWithToast failed");
            return;
        }
        LogUtil.a("ActivityUtils", "startMainActivityWithToast");
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), BaseApplication.d() + ".MainActivity");
        intent.setFlags(67108864);
        intent.putExtra("TOAST", str2);
        intent.putExtra(Constants.HOME_TAB_NAME, str);
        d(context, intent);
    }
}
