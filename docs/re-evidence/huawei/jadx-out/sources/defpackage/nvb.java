package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.versionmgr.betaversionmgr.BetaVersionMgrApi;
import com.huawei.health.versionmgr.betaversionmgr.CheckBetaUpdateCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes11.dex */
public class nvb {
    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, int i, boolean z2) {
        LogUtil.a("OTA_UpdateSdkUtil", "checkClientOtaUpdate...");
        if (context == null) {
            LogUtil.j("OTA_UpdateSdkUtil", "checkClientOtaUpdate: context is null");
        } else if (checkUpdateCallBack == null) {
            LogUtil.j("OTA_UpdateSdkUtil", "checkClientOtaUpdate: callback is null");
        } else {
            UpdateSdkAPI.checkClientOTAUpdate(context, checkUpdateCallBack, z, (int) ((((long) i) * 60000) / 86400000), z2);
        }
    }

    public static void c(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        LogUtil.a("OTA_UpdateSdkUtil", "showUpdateDialog...");
        if (context == null) {
            LogUtil.j("OTA_UpdateSdkUtil", "showUpdateDialog: context is null");
        } else {
            apkUpgradeInfo.setDevType_(0);
            UpdateSdkAPI.showUpdateDialog(context, apkUpgradeInfo, z);
        }
    }

    public static void a(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        LogUtil.a("OTA_UpdateSdkUtil", "checkTargetAppUpdate...");
        if (context == null) {
            LogUtil.j("OTA_UpdateSdkUtil", "checkTargetAppUpdate: context is null");
        } else if (checkUpdateCallBack == null) {
            LogUtil.j("OTA_UpdateSdkUtil", "checkTargetAppUpdate: callback is null");
        } else {
            UpdateSdkAPI.checkTargetAppUpdate(context, str, checkUpdateCallBack);
        }
    }

    public static boolean a() {
        if (CommonUtil.ap()) {
            return true;
        }
        return "on".equalsIgnoreCase(lon.c().d("common_config_updatesdk_switch_new"));
    }

    public static boolean c() {
        if (CommonUtil.ap()) {
            return true;
        }
        return !"off".equalsIgnoreCase(lon.c().d("common_config_ota_switch_new"));
    }

    public static int d() {
        try {
            return Integer.parseInt(lon.c().d("ota_time"));
        } catch (NumberFormatException unused) {
            LogUtil.e("OTA_UpdateSdkUtil", "getOtaTime() NumberFormatException");
            return 4320;
        }
    }

    public static void a(final boolean z) {
        LogUtil.a("OTA_UpdateSdkUtil", "checkNewBetaVersion()...");
        ((BetaVersionMgrApi) Services.b("HWBetaVersionMgr", BetaVersionMgrApi.class)).checkBetaAppVersion(new CheckBetaUpdateCallBack() { // from class: nvb.3
            @Override // com.huawei.health.versionmgr.betaversionmgr.CheckBetaUpdateCallBack
            public void onUpdateBetaInfo(Intent intent) {
                nvb.e(z ? 0 : 2);
                if (intent == null) {
                    LogUtil.j("OTA_UpdateSdkUtil", "mBetaUpdateCallBack onUpdateInfo: intent is null.");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    nvb.e(extras, !z);
                } else {
                    LogUtil.j("OTA_UpdateSdkUtil", "mBetaUpdateCallBack onUpdateInfo: bundle is null.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Bundle bundle, boolean z) {
        boolean z2 = bundle.getBoolean("hasNewBetaVersion");
        int i = bundle.getInt("responseCode");
        if (z2) {
            Context contextB = BaseApplication.b();
            nvd.i("hasNewBetaVersion", contextB);
            nvd.g(String.valueOf(CommonUtil.e(contextB)), contextB);
        }
        d(z2, z, i);
    }

    private static void d(boolean z, boolean z2, int i) {
        Intent intent;
        LogUtil.a("OTA_UpdateSdkUtil", "broadcastBetaAppCheckResult() in");
        if (z2) {
            intent = new Intent("action_app_check_new_version_state");
        } else {
            intent = new Intent("action_band_auto_check_new_version_result");
            intent.putExtra("result", 5);
        }
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("hasNewBetaVersion", z);
        intent.putExtra("isManual", z2);
        intent.putExtra("responseCode", i);
        intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageName());
        com.huawei.hwcommonmodel.application.BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i) {
        if (i == 0) {
            SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10023), "key_last_check_timestamp", String.valueOf(System.currentTimeMillis()), null);
        }
    }

    public static boolean b() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10023), "key_last_check_timestamp");
        if (!TextUtils.isEmpty(strE)) {
            return Math.abs(System.currentTimeMillis() - CommonUtil.i(strE)) > (CommonUtil.ap() ? 86400000L : ((long) d()) * 60000);
        }
        ReleaseLogUtil.d("OTA_UpdateSdkUtil", "isCanAutoCheckNewVersion lastCheckTime ", strE);
        return true;
    }
}
