package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hwcloudmodel.agreement.AccessTokenManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class prf {
    static /* synthetic */ void b(View view) {
    }

    static /* synthetic */ void d(View view) {
    }

    public static void c(Context context, String str) {
        d(context, str, 0, (String) null);
    }

    public static void d(Context context, String str) {
        d(context, "com.huawei.health.ecg.collection", 0, str);
    }

    public static void d(final Context context, final String str, final int i, final String str2) {
        LogUtil.a("QuickAppUtil", "startQuickApp ", str);
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("QuickAppUtil", "startQuickApp activity is null or packageName is empty");
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            LogUtil.j("QuickAppUtil", "startQuickApp switch to sub thread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: prl
                @Override // java.lang.Runnable
                public final void run() {
                    prf.d(context, str, i, str2);
                }
            });
        } else {
            if (c(context, i, str2, str)) {
                return;
            }
            Context context2 = BaseApplication.getContext();
            if ("com.huawei.health.mc".equals(str) || !CommonUtil.z(context2)) {
                return;
            }
            LogUtil.a("QuickAppUtil", "startQuickApp isHmsLiteEnable.");
            b(context2);
        }
    }

    private static boolean c(Context context, int i, String str, String str2) {
        str2.hashCode();
        if (str2.equals("com.huawei.health.h5.ecgce")) {
            d(context, i, str, "com.huawei.health.h5.ecgce");
            return true;
        }
        if (!str2.equals("com.huawei.health.ecg.collection")) {
            return false;
        }
        d(context, i, str, "com.huawei.health.h5.ecg");
        return true;
    }

    private static void d(Context context, int i, String str, String str2) {
        qrg.d(false);
        if (i == 5) {
            LogUtil.a("QuickAppUtil", "open the ecg collection.");
            HashMap map = new HashMap(16);
            map.put("click", 1);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEART_ECG_2090012.value(), map, 0);
            b(15);
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        c(i, builder);
        if (!TextUtils.isEmpty(str)) {
            builder.addCustomizeArg("enterType", str);
        }
        ddv.b().loadH5ProApp(context, str2, builder);
        if (TextUtils.isEmpty(str) || !(context instanceof Activity)) {
            return;
        }
        ((Activity) context).finish();
    }

    private static void c(int i, H5ProLaunchOption.Builder builder) {
        if (i != 0) {
            builder.addCustomizeArg("from", String.valueOf(i));
        }
    }

    public static void b(int i) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(i);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static void b(Context context) {
        final Activity activity = BaseApplication.getActivity();
        if (HuaweiLoginManager.checkIsInstallHuaweiAccount(context) && CommonUtil.i(context) >= 40000000) {
            LoginInit.getInstance(context).logoutWhenTokenInvalid(null);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setClassName(context, "com.huawei.health.StTimeoutActivity");
            context.startActivity(intent);
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: prc
            @Override // java.lang.Runnable
            public final void run() {
                prf.b(activity);
            }
        });
    }

    static /* synthetic */ void b(final Activity activity) {
        LogUtil.a("QuickAppUtil", "showHmsUpdateDialog dialog in main thread");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_hw_wechat_rank_show_common_title).b(R.string.IDS_vmall_hms_core_installed_alert).a(R.string.IDS_settings_jawbone_download, new View.OnClickListener() { // from class: prj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                prf.e(activity);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: pri
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                prf.b(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Activity activity) {
        final AccessTokenManager accessTokenManager = new AccessTokenManager(activity);
        accessTokenManager.hmsConnect(BaseApplication.getContext(), new HuaweiApiClient.ConnectionCallbacks() { // from class: prf.3
            @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
            public void onConnected() {
                AccessTokenManager accessTokenManager2 = accessTokenManager;
                if (accessTokenManager2 != null) {
                    accessTokenManager2.shutDownThread();
                }
            }

            @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
            public void onConnectionSuspended(int i) {
                AccessTokenManager accessTokenManager2 = accessTokenManager;
                if (accessTokenManager2 != null) {
                    accessTokenManager2.shutDownThread();
                }
            }
        }, new HuaweiApiClient.OnConnectionFailedListener() { // from class: prh
            @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
            public final void onConnectionFailed(ConnectionResult connectionResult) {
                prf.e(accessTokenManager, activity, connectionResult);
            }
        });
    }

    static /* synthetic */ void e(AccessTokenManager accessTokenManager, Activity activity, ConnectionResult connectionResult) {
        if (accessTokenManager != null) {
            accessTokenManager.shutDownThread();
        }
        int errorCode = connectionResult.getErrorCode();
        LogUtil.j("QuickAppUtil", "connectionFailed errorCode = ", Integer.valueOf(errorCode));
        HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
        if (huaweiApiAvailability.isUserResolvableError(errorCode)) {
            LogUtil.a("QuickAppUtil", "availability.isUserResolvableError(errorCode):true");
            huaweiApiAvailability.resolveError(activity, errorCode, 47000);
        }
    }

    public static void a(Context context) {
        LogUtil.a("QuickAppUtil", "showHmsUpdateDialog dialog in main thread");
        final Activity activity = BaseApplication.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: prk
            @Override // java.lang.Runnable
            public final void run() {
                prf.c(activity);
            }
        });
    }

    static /* synthetic */ void c(final Activity activity) {
        LogUtil.a("QuickAppUtil", "showHmsUpdateDialog dialog in main thread");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_hw_wechat_rank_show_common_title).b(R.string.IDS_vmall_hms_core_installed_alert).a(R.string.IDS_settings_jawbone_download, new View.OnClickListener() { // from class: pre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                prf.e(activity);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: prg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                prf.d(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void b(Activity activity, String str, String str2) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeArg("enterType", str2);
        builder.addCustomizeArg("donateId", str);
        ddv.b().loadH5ProApp(activity, efe.a() ? "com.huawei.health.h5.ecg" : "com.huawei.health.h5.ecgce", builder);
    }

    public static void c(Activity activity, String str, String str2) {
        String str3 = efe.a() ? "com.huawei.health.ecg.collection" : "com.huawei.health.h5.ecgce";
        if ("returnCard".equals(str2)) {
            d(activity, str3, 0, "interpretation");
            return;
        }
        if ("monthReport".equals(str2)) {
            d(activity, str3, 0, "monthReport");
            return;
        }
        if ("donate".equals(str2)) {
            b(activity, str, "donate");
        } else if ("electrocardiogram".equals(str2)) {
            qrg.a(false);
            d(activity, "com.huawei.health.h5.ecgce", 5, (String) null);
        } else if ("collection".equals(str2)) {
            d(activity, "com.huawei.health.ecg.collection", 5, (String) null);
        } else {
            d(activity, str3, 5, (String) null);
        }
        activity.finish();
    }
}
