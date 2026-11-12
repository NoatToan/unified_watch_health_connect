package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.common.util.Utils;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.ble.BleConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ecw {
    private static final String APP_NAME;
    private static final int AT_SUBSTRING_FOUR = 4;
    private static final int FALSE_VERSION = 0;
    private static final int NON_PERSONALIZED = 1;
    private static final String PERMISSION = "true";
    private static final int PERSONALIZED = 0;
    private static final String SERVICE_SUFFIX;
    private static final String TAG = "HealthInfoUtils";
    private static final String TAG_RELEASE = "R_HealthInfoUtils";
    private static final int TRUE_VERSION = 1;

    static {
        String str;
        if (CommonUtil.cl()) {
            str = BleConstants.WEIGHT_KEY;
        } else {
            str = CommonUtil.ba() ? "green" : "";
        }
        SERVICE_SUFFIX = str;
        APP_NAME = Utils.SERVICE_HEALTH_CLOUD + str;
    }

    public Map<String, Object> getHmsLiteAccountInfo(Context context) {
        boolean zEquals;
        HashMap map = new HashMap(16);
        map.put("severToken", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        map.put("deviceId", LoginInit.getInstance(BaseApplication.getContext()).getDeviceId());
        map.put("deviceType", CommonUtil.h());
        map.put("siteId", Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009))));
        map.put("uid", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        map.put("nationalCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("account", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1007));
        ioi ioiVarD = ioi.d();
        String strC = ioiVarD.c(13);
        String strC2 = ioiVarD.c(14);
        String strC3 = ioiVarD.c(15);
        map.put(JsbMapKeyNames.H5_NPA, Integer.valueOf(!"true".equals(strC) ? 1 : 0));
        map.put(JsbMapKeyNames.HW_DSP_NPA, Integer.valueOf(!"true".equals(strC2) ? 1 : 0));
        map.put(JsbMapKeyNames.THIRD_DSP_NPA, Integer.valueOf(!"true".equals(strC3) ? 1 : 0));
        String strC4 = ioiVarD.c(12);
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_recommend");
        if (TextUtils.isEmpty(strE)) {
            zEquals = "true".equals(strC4);
            map.put("nonPersonalizedRecommend", Integer.valueOf(!"true".equals(strC4) ? 1 : 0));
        } else {
            boolean zEquals2 = "1".equals(strE);
            map.put("nonPersonalizedRecommend", Integer.valueOf(!"1".equals(strE) ? 1 : 0));
            zEquals = zEquals2;
        }
        handleWatchfacePersonalSwitch(context, map, zEquals);
        return map;
    }

    private void handleWatchfacePersonalSwitch(Context context, Map map, boolean z) {
        boolean zEquals;
        String strC = ioi.d().c(17);
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_watch_face_recommend");
        if (TextUtils.isEmpty(strE)) {
            zEquals = "true".equals(strC);
        } else {
            zEquals = "1".equals(strE);
        }
        if (!z && !zEquals) {
            map.put("watchfacePersonalSwitch", "0");
        } else {
            map.put("watchfacePersonalSwitch", "1");
        }
    }

    public String getCommonCountryCode() {
        return GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
    }

    public void initFullSdkGrs() {
        LogUtil.a(TAG, "initFullSdkGrs:", Boolean.valueOf(health.compact.a.Utils.o()));
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        grsBaseInfo.setAppName(APP_NAME);
        grsBaseInfo.setCountrySource(accountInfo);
        grsBaseInfo.setSerCountry(accountInfo);
        grsBaseInfo.setRegCountry(accountInfo);
        grsBaseInfo.setVersionName(Build.VERSION.RELEASE);
        GrsApi.grsSdkInit(BaseApplication.getContext(), grsBaseInfo);
    }

    public Map<String, Integer> getHealthVersionType() {
        HashMap map = new HashMap(16);
        map.put("Release", Integer.valueOf(CommonUtil.bu() ? 1 : 0));
        map.put("Debug", Integer.valueOf(CommonUtil.ao() ? 1 : 0));
        map.put("Test", Integer.valueOf(CommonUtil.cl() ? 1 : 0));
        map.put("Beta", Integer.valueOf(CommonUtil.ap() ? 1 : 0));
        map.put("NoCloudVersion", Integer.valueOf(health.compact.a.Utils.m() ? 1 : 0));
        map.put("GooglePlayOemDisable", 0);
        return map;
    }

    public boolean isHmsLiteEnable(Context context) {
        LogUtil.a(TAG, "isHmsLiteEnable:");
        return CommonUtil.z(context);
    }

    public static void loginByHealthHms(Context context, final ILoginCallback iLoginCallback) {
        if (iLoginCallback != null) {
            LoginInit.getInstance(context).loginHms(context, new ILoginCallback() { // from class: ecw.2
                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginSuccess(Object obj) {
                    iLoginCallback.onLoginSuccess(obj);
                }

                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginFailed(Object obj) {
                    iLoginCallback.onLoginFailed(obj);
                }
            });
        }
    }

    public static void loginByHealthHmsLite(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            ThirdPartyLoginManager.getInstance().thirdPartyPhoneLogin(context, new IBaseResponseCallback() { // from class: ecw.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d(ecw.TAG_RELEASE, "thirdPartyPhoneLogin errorCode:", Integer.valueOf(i));
                    iBaseResponseCallback.a(i, obj);
                }
            });
        }
    }

    public boolean ifAllowLogin() {
        return health.compact.a.Utils.h();
    }

    public String getServerToken() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.d(TAG_RELEASE, "getServerToken: ", accountInfo.substring(0, 4));
        }
        return accountInfo;
    }

    public int getServerTokenType() {
        int tokenTypeValue = ThirdLoginDataStorageUtil.getTokenTypeValue();
        ReleaseLogUtil.d(TAG_RELEASE, "getServerTokenType: ", Integer.valueOf(tokenTypeValue));
        return tokenTypeValue;
    }

    public String getHealthDeviceCapability() {
        LogUtil.a(TAG, "getHealthDeviceCapability:");
        return new Gson().toJson(eej.c());
    }

    public boolean checkSupportCapbility(int i) {
        boolean zD = eey.d(eej.a(), i);
        LogUtil.a(TAG, "is support index :", Integer.valueOf(i), ",result:", Boolean.valueOf(zD));
        return zD;
    }

    public boolean isOversea() {
        LogUtil.a(TAG, "isOversea:", Boolean.valueOf(health.compact.a.Utils.o()));
        return health.compact.a.Utils.o();
    }

    public String getServiceCountryCode() {
        LogUtil.a(TAG, "getServiceCountryCode");
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
    }

    public boolean getAnalyticsStatus() {
        boolean zC = niz.c();
        LogUtil.a(TAG, "getAnalyticsStatus:", Boolean.valueOf(zC));
        return zC;
    }

    public void printLog(String str, String str2, int i, String str3) {
        if (CommonUtil.bu()) {
            return;
        }
        String str4 = str + "_" + str2;
        if (i == 0) {
            LogUtil.g(str4, str3);
            return;
        }
        if (i == 1) {
            LogUtil.d(str4, str3);
            return;
        }
        if (i == 2) {
            LogUtil.a(str4, str3);
            return;
        }
        if (i == 3) {
            LogUtil.j(str4, str3);
        } else if (i == 4) {
            LogUtil.e(str4, str3);
        } else {
            LogUtil.j(TAG, "printLog logType is wrong");
        }
    }

    public void printReleaseLog(String str, String str2, int i, String str3) {
        String str4 = "R_" + str + "_" + str2;
        if (i == 2) {
            ReleaseLogUtil.d(str4, str3);
        } else if (i == 3) {
            ReleaseLogUtil.e(str4, str3);
        } else {
            if (i != 4) {
                return;
            }
            ReleaseLogUtil.a(str4, str3);
        }
    }

    public Map<String, String> getDeviceInfo() {
        return new HashMap(16);
    }

    public void launchActivity(Context context, Intent intent) {
        AppBundle.d().launchActivity(context, intent, null);
    }
}
