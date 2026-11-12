package com.huawei.ui.homehealth;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.homehealth.HomeOverseaPrivacyDialog;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import defpackage.ean;
import defpackage.ioi;
import defpackage.iox;
import defpackage.lmf;
import defpackage.lmn;
import defpackage.lsl;
import defpackage.qre;
import defpackage.qri;
import health.compact.a.CommonUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HomeOverseaPrivacyDialog {
    public static void e(final Context context) {
        boolean zE;
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.HomeOverseaPrivacyDialog$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HomeOverseaPrivacyDialog.e(context);
                }
            });
            return;
        }
        if (d(context)) {
            String strB = b("key_privacy_analysis");
            String strB2 = b("key_personalized_recommend");
            boolean zIsOperation = ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010));
            boolean z = true;
            boolean zE2 = false;
            if ("switch_keep_open".equals(strB)) {
                zE2 = e("key_privacy_analysis", true);
                zE = false;
            } else if ("switch_open".equals(strB)) {
                z = false;
                zE2 = e("key_privacy_analysis", false);
                zE = false;
            } else if ("switch_keep_open".equals(strB2)) {
                zE = e("key_personalized_recommend", true);
            } else if ("switch_open".equals(strB2)) {
                zE = e("key_personalized_recommend", false);
                z = false;
            } else {
                zE = false;
                z = false;
            }
            if (zE2) {
                String strF = qre.f(R.string.IDS_hwh_privacy_analysis_and_improvement);
                if (iox.e(context)) {
                    strF = qre.f(R.string.IDS_hw_dialog_analysis_improvement_title);
                }
                e(context, "key_privacy_analysis", strF, z);
                LogUtil.a("HomeOverseaPrivacyDialog", "showPrivacyDialog guid open analysis");
            } else if (zE && zIsOperation) {
                e(context, "key_personalized_recommend", qre.f(R.string.IDS_personalized_recommendation), z);
                LogUtil.a("HomeOverseaPrivacyDialog", "showPrivacyDialog guid open recommend");
            }
            LogUtil.a("HomeOverseaPrivacyDialog", "showDialog analysisStatus:", strB, " recommendStatus:", strB2, " isAnalysisAllowShow:", Boolean.valueOf(zE2), " isRecommendAllowShow:", Boolean.valueOf(zE), " isKeepShow:", Boolean.valueOf(z), " isOperation:", Boolean.valueOf(zIsOperation));
        }
    }

    private static boolean d(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (!LoginInit.getInstance(BaseApplication.b()).getIsLogined()) {
                    LogUtil.j("HomeOverseaPrivacyDialog", "isNoLogin");
                    return false;
                }
                if (LoginInit.getInstance(BaseApplication.b()).isKidAccount()) {
                    LogUtil.j("HomeOverseaPrivacyDialog", "isKidAccount");
                    return false;
                }
                if (!Utils.o()) {
                    LogUtil.j("HomeOverseaPrivacyDialog", "isNotOversea");
                    return false;
                }
                if (!Utils.k()) {
                    return true;
                }
                LogUtil.j("HomeOverseaPrivacyDialog", "isOverseaNoCloudVersion");
                return false;
            }
        }
        LogUtil.j("HomeOverseaPrivacyDialog", "context error");
        return false;
    }

    private static boolean e(String str, boolean z) {
        int iJ;
        int i;
        long j;
        Map<String, String> mapD = iox.d(str);
        if (CollectionUtils.c(mapD)) {
            iox.d(str, 0, lsl.r(System.currentTimeMillis()), 0);
            j = 0;
            i = 0;
            iJ = 0;
        } else {
            iJ = CommonUtils.j(mapD.get(SmartMsgConstant.MSG_SHOW_COUNT));
            int iJ2 = CommonUtils.j(mapD.get("showKeep"));
            long jI = CommonUtils.i(mapD.get(ContentRecord.LAST_SHOW_TIME));
            i = iJ2;
            j = jI;
        }
        LogUtil.a("HomeOverseaPrivacyDialog", "getTimesAllowShow key:", str, " showCount:", Integer.valueOf(iJ), " keepShowCount:", Integer.valueOf(i), " lastShowTime:", Long.valueOf(j));
        if (z) {
            return i < 1;
        }
        if (iJ >= 3) {
            return false;
        }
        int iA = j == 0 ? 0 : lsl.a(j, lsl.r(System.currentTimeMillis())) - 1;
        LogUtil.a("HomeOverseaPrivacyDialog", "getTimesAllowShow dayCount:", Integer.valueOf(iA));
        return iJ == 0 || iA >= 30;
    }

    private static void b(String str, boolean z) {
        int iJ;
        int iJ2;
        Map<String, String> mapD = iox.d(str);
        if (CollectionUtils.c(mapD)) {
            iJ = 0;
            iJ2 = 0;
        } else {
            iJ = CommonUtils.j(mapD.get(SmartMsgConstant.MSG_SHOW_COUNT));
            iJ2 = CommonUtils.j(mapD.get("showKeep"));
        }
        if (z) {
            iJ2++;
        } else {
            iJ++;
        }
        iox.d(str, iJ, lsl.r(System.currentTimeMillis()), iJ2);
    }

    private static String b(String str) {
        String strA;
        String strA2;
        if ("key_personalized_recommend".equals(str) && LoginInit.getInstance(BaseApplication.b()).isMinorAccount()) {
            LogUtil.j("HomeOverseaPrivacyDialog", "getSwitchStatus isMinorAccount");
            return "switch_close";
        }
        if ("key_personalized_recommend".equals(str)) {
            strA = iox.a(12);
            strA2 = iox.a("content-recommendation-001");
        } else if ("key_privacy_analysis".equals(str)) {
            strA = iox.a(11);
            strA2 = iox.a("ai-analysis-001");
        } else {
            LogUtil.j("HomeOverseaPrivacyDialog", "showPrivacyDialog not supported key");
            return "switch_close";
        }
        LogUtil.a("HomeOverseaPrivacyDialog", "getSwitchStatus key:", str, " userSwitchValue:", strA, " couldSwitchValue:", strA2, " localSwitchValue：", false);
        if (!"2".equals(strA2)) {
            return (String.valueOf(false).equals(strA) || TextUtils.isEmpty(strA)) ? "switch_open" : "switch_close";
        }
        TextUtils.isEmpty(strA);
        return "switch_close";
    }

    private static void e(final Context context, final String str, final String str2, final boolean z) {
        HandlerExecutor.b(new Runnable() { // from class: rhj
            @Override // java.lang.Runnable
            public final void run() {
                HomeOverseaPrivacyDialog.b(str, context, str2, z);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    public static /* synthetic */ void b(String str, Context context, String str2, boolean z) {
        Object objB;
        Object spannableString;
        ComponentActivity componentActivity;
        if (str.equals("key_privacy_analysis")) {
            if (iox.e(context)) {
                objB = iox.d(context, ServiceItemActivity.class);
            } else {
                spannableString = new SpannableString(qre.f(R.string.IDS_privacy_analysis_and_improvement_guide_content));
            }
            if (spannableString == null) {
                return;
            }
            if (!(context instanceof ComponentActivity)) {
                a(context, str, str2, spannableString, z);
                return;
            }
            componentActivity = (ComponentActivity) context;
            if (componentActivity.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED)) {
                a(context, str, str2, spannableString, z);
            } else {
                componentActivity.getLifecycle().addObserver(new PrivacyLifecycleObserver(context, str, str2, spannableString, z));
            }
        }
        if (str.equals("key_personalized_recommend")) {
            objB = iox.e(context) ? iox.b(context) : a(qre.f(R.string.IDS_open_recommend_guide3));
        } else {
            LogUtil.j("HomeOverseaPrivacyDialog", "showPrivacyDialogOnResume view is null");
            objB = null;
        }
        spannableString = objB;
        if (spannableString == null) {
            return;
        }
        if (!(context instanceof ComponentActivity)) {
            a(context, str, str2, spannableString, z);
            return;
        }
        componentActivity = (ComponentActivity) context;
        if (componentActivity.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED)) {
            a(context, str, str2, spannableString, z);
        } else {
            componentActivity.getLifecycle().addObserver(new PrivacyLifecycleObserver(context, str, str2, spannableString, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class PrivacyLifecycleObserver implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f25150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25151c;
        private final Context d;
        private final boolean e;

        PrivacyLifecycleObserver(Context context, String str, String str2, Object obj, boolean z) {
            this.d = context;
            this.f25151c = str;
            this.f25149a = str2;
            this.f25150b = obj;
            this.e = z;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            HomeOverseaPrivacyDialog.a(this.d, this.f25151c, this.f25149a, this.f25150b, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, final String str, String str2, Object obj, final boolean z) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                String upperCase = qre.f(R.string.ie_agree).toUpperCase();
                CustomAlertDialog.Builder builderD = new CustomAlertDialog.Builder(context).b(str2).e(upperCase, new DialogInterface.OnClickListener() { // from class: rhi
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HomeOverseaPrivacyDialog.e(context, str, true, z);
                    }
                }).d(qre.f(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(), new DialogInterface.OnClickListener() { // from class: rhh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HomeOverseaPrivacyDialog.e(context, str, false, z);
                    }
                });
                if (obj instanceof View) {
                    builderD.a((View) obj);
                } else if (obj instanceof SpannableString) {
                    builderD.e((SpannableString) obj);
                } else {
                    LogUtil.j("HomeOverseaPrivacyDialog", "showPrivacyDialog content unknown type.");
                }
                CustomAlertDialog customAlertDialogB = builderD.b();
                customAlertDialogB.setCancelable(false);
                customAlertDialogB.setBottomPadding();
                customAlertDialogB.show();
                ReleaseLogUtil.c("Dfx_HomeOverseaPrivacyDialog", "show dialog key:", str);
                return;
            }
        }
        LogUtil.j("HomeOverseaPrivacyDialog", "context error");
    }

    private static SpannableString a(String str) {
        String strF = qre.f(R.string.IDS_open_recommend_guide2);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_open_recommend_guide, strF, str));
        qri.e(spannableString, strF, R.string.textFontFamilyMedium);
        qri.b(spannableString, strF, R.color.textColorPrimary);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, String str, boolean z, boolean z2) {
        ReleaseLogUtil.c("HomeOverseaPrivacyDialog", "buttonClick key:", str, " isAllow:", Boolean.valueOf(z), " isKeepShow:", Boolean.valueOf(z2));
        if ("key_personalized_recommend".equals(str)) {
            ioi.d().e(12, z, String.valueOf(12), null);
            b("key_personalized_recommend", z2);
        } else if ("key_privacy_analysis".equals(str)) {
            ioi.d().e(11, z, null, null);
            d(z);
            ean.e(z);
            b("key_privacy_analysis", z2);
            if (z) {
                e(context);
            }
        }
    }

    private static void d(boolean z) {
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        HashMap map = new HashMap(16);
        map.put("entrance", "e1");
        map.put("click", 1);
        if (z) {
            map.put("type", 1);
            map.put("service_improvement_status", 1);
        } else {
            map.put("type", 3);
            map.put("service_improvement_status", 0);
        }
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Today_0001");
        lmnVar.d(map2);
        lmf.d().a(context, AnalyticsValue.HEALTH_MINE_SETTINGS_IMPROVE_PLAN_2040021.value(), lmnVar, 0);
        KeyValDbManager.d(context).b("key_user_experience_plan_check_box", String.valueOf(z));
    }
}
