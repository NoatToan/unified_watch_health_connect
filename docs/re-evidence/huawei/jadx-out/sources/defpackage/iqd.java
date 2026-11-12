package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class iqd {
    private static final Object d = new Object();
    private static iqd e;

    public static iqd b() {
        iqd iqdVar;
        synchronized (d) {
            if (e == null) {
                e = new iqd();
            }
            iqdVar = e;
        }
        return iqdVar;
    }

    public void e(Context context, Intent intent) {
        synchronized (this) {
            if (b(context, intent)) {
                ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "enter login hwid account removed broadcast");
                String strD = d(intent);
                if (strD == null && !CommonUtil.z(context)) {
                    LogUtil.e("HwIdAccountLogoutUtil", "logout userId is null!");
                    return;
                }
                String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
                ReleaseLogUtil.c("HwIdAccountLogoutUtil", "logoutHwIdAccount lastId:", accountInfo, " userId:", strD);
                lmf.d().b("0", "0");
                if (CommonUtil.z(context) || TextUtils.isEmpty(accountInfo) || accountInfo.equals(strD)) {
                    ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "start logout");
                    e(context, intent, accountInfo);
                    ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "logout success");
                } else {
                    ReleaseLogUtil.d("R_HwIdAccountLogoutUtil", "hms not logout.");
                }
            }
        }
    }

    private void e(Context context, Intent intent, String str) {
        LoginInit.getInstance(context).setLastCountryCode();
        LoginInit.getInstance(context).setAccountInfo(1011, "", null);
        KeyValDbManager.d(context).d("key_user_name");
        KeyValDbManager.d(context).d("key_user_pic_path");
        ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "HealthLifeUtil reset");
        ffv.u();
        iuo.q();
        qdm.y();
        SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_FLY), "user_profile_scene", "0", null);
        SharedPreferenceManager.b(context, str, false);
        ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "Wallet walletAccountRemove");
        if (intent.getStringExtra(JsbMapKeyNames.H5_USER_ID) == null) {
            intent.putExtra(JsbMapKeyNames.H5_USER_ID, str);
        }
        try {
            ddy.e().walletAccountRemove(context, intent);
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_HwIdAccountLogoutUtil", "walletAccountRemove exception:", e2.getClass().getSimpleName());
        }
        StorageParams storageParams = new StorageParams();
        ReleaseLogUtil.c("HwIdAccountLogoutUtil", "Login Out Recover Default Map Type");
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_type_setting_key", Integer.toString(0), storageParams);
        c(context);
        c();
        pvb.c(context);
        lub.c().b();
        ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "profile accountLogout");
        mei.e().b();
        e(context);
        HuaweiHiHealth.clearCache();
        LoginInit.getInstance(context).setIsLogined(false);
        LoginInit.getInstance(context).logout();
        ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "deleteGrsConfig GrsConfigInteractor");
        lor.d(context);
        oet.d().b();
        foj.b().c();
        lua.b();
        ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "delete cloud pushToken");
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).deleteToken();
    }

    private void e(Context context) {
        HiHealthNativeApi.a(context).hiLogout(new HiCommonListener() { // from class: iqd.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                ReleaseLogUtil.c("R_HwIdAccountLogoutUtil", "accountmigrate: hiLogout success");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.b("R_HwIdAccountLogoutUtil", "accountmigrate: hiLogout failure");
            }
        });
    }

    private boolean b(Context context, Intent intent) {
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        LogUtil.a("HwIdAccountLogoutUtil", "isLoginAccount is : ", Boolean.valueOf(isLogined));
        return context != null && intent != null && isLogined && Action.ACTION_HW_ACCOUNT_LOGOUT.equals(intent.getAction());
    }

    private String d(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra(JsbMapKeyNames.H5_USER_ID);
            LogUtil.a("HwIdAccountLogoutUtil", "receive account removed broadcast, userId:", stringExtra);
            return stringExtra;
        } catch (BadParcelableException e2) {
            LogUtil.e("HwIdAccountLogoutUtil", "BadParcelableException exception :", e2.getMessage());
            return null;
        } catch (Exception unused) {
            LogUtil.e("HwIdAccountLogoutUtil", "Exception logoutHwIdAccount");
            return null;
        }
    }

    private void c(Context context) {
        SharedPreferenceManager.e(context, "socialsharedpreference", Constants.IS_SIGN_VMALL_ARG, Boolean.toString(true), null);
        SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_login_last_time", "", new StorageParams());
        SharedPreferenceManager.b(BaseApplication.getContext(), Integer.toString(10000), "privacy_last_clear_cloud_data_time");
        SharedPreferenceManager.b(BaseApplication.getContext(), Integer.toString(10000), "service_last_clear_cloud_data_time");
        SharedPreferenceManager.b(context, Integer.toString(10000), "grs_config_last_update_time");
        SharedPreferenceManager.b(context, Integer.toString(20002), "sport_sort_list_paras");
        SharedPreferenceManager.b(context, String.valueOf(10000), "AB_TEST_STRATEGY_INFO");
        SharedPreferenceManager.b(context, String.valueOf(10000), "AB_TEST_BI_INFO");
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "USER_VIP_INFO_KEY", "", new StorageParams());
        SharedPreferenceManager.b(context, "threeCircleSp", "animConfigInfo");
        SharedPreferenceManager.b(context, "threeCircleSp", "getAnimConfigInfoTime");
        SharedPreferenceManager.b(context, Integer.toString(10000), "kid_account_reboot_before");
        SharedPreferenceManager.b(context, Integer.toString(10000), "SHOW_PROMOTION_DIALOG");
        SharedPreferenceManager.b(context, Integer.toString(2039), "beta_log_switch");
        SharedPreferenceManager.b(context, Integer.toString(Constants.START_TO_INDOOR_RUNNING), "beta_debug_log_switch");
    }

    private void c() {
        Context context = BaseApplication.getContext();
        SharedPreferenceManager.e(context, "BIND_WEIGHT", "bind_weight_time", "", new StorageParams());
        ArrayList arrayList = new ArrayList(Arrays.asList("EXCE_SCORE__ERROR", "EXCE_LIGHTSLEEP__MIN_ERROR", "EXCE_LIGHTSLEEP__MIX _ERROR", "EXCE_DEEPSLEEP__MIN_ERROR", "EXCE_DEEPSLEEP__MIX _ERROR", "EXCE_REMLEEP__MIN_ERROR", "EXCE_REMSLEEP__MIX _ERROR", "EXCE_BREATH__SCORE_ERROR", "EXCE_TRUSLEEP__TIME_ERROR", "EXCE_NORMALSLEEP__TIME_ERROR"));
        KeyValDbManager.d(context).b("key_device_code", "");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wvf.e().b("", (String) it.next());
        }
        vbl.a(false);
        SharedPreferenceManager.b(context, Integer.toString(10100), "FirstJudgeSetFlase");
        SharedPreferenceManager.i(context, "privacy_center");
        SharedPreferenceManager.b(context, String.valueOf(1004), "cloud_user_privacy701");
        SharedPreferenceManager.b(context, String.valueOf(1004), "cloud_user_privacy11");
        SharedPreferenceManager.b(context, String.valueOf(1004), "cloud_user_privacy12");
        SharedPreferenceManager.b(context, String.valueOf(1004), "cloud_user_privacy16");
        niz.d();
        wsp.e();
    }
}
