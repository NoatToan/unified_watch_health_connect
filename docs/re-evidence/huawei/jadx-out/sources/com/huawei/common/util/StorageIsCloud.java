package com.huawei.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.VersionDbManager;

/* JADX INFO: loaded from: classes2.dex */
public class StorageIsCloud {
    private static final String TAG = "Login_StorageIsCloud";

    private StorageIsCloud() {
    }

    public static void storageIsCloud(Context context) {
        String strD = VersionDbManager.b(BaseApplication.getContext()).d("have_cloud_or_not");
        LogUtil.a(TAG, "Health APP VersionDbManager = ", strD);
        String strD2 = VersionDbManager.b(BaseApplication.getContext()).d("local_country_code");
        String strD3 = VersionDbManager.b(BaseApplication.getContext()).d("local_language_code");
        if (TextUtils.isEmpty(strD2)) {
            strD2 = BaseApplication.getContext().getResources().getConfiguration().locale.getCountry();
            VersionDbManager.b(context).d("local_country_code", strD2, null);
            LogUtil.a(TAG, "get the countryCode and save ", strD2);
        }
        if (TextUtils.isEmpty(strD3)) {
            strD3 = BaseApplication.getContext().getResources().getConfiguration().locale.getLanguage();
            VersionDbManager.b(context).d("local_language_code", strD3, null);
            LogUtil.a(TAG, "get the languageCode and save ", strD3);
        }
        if (TextUtils.isEmpty(strD)) {
            if (getIf1Login(context)) {
                String str = isChinaSite() ? "0" : "1";
                LogUtil.a(TAG, "logied cloud state : ", str);
                HuaweiLoginManager.setCloudVersion(str, null);
                LogUtil.a(TAG, "If have login save ", str);
                return;
            }
            if ("cn".equalsIgnoreCase(strD2) && MLAsrConstants.LAN_ZH.equalsIgnoreCase(strD3)) {
                HuaweiLoginManager.setCloudVersion("1", null);
                LogUtil.a(TAG, "If it is china, save ", "1");
                return;
            } else {
                HuaweiLoginManager.setCloudVersion("0", null);
                LogUtil.a(TAG, "If it is not china, save ", "0");
                return;
            }
        }
        if (TextUtils.isEmpty(CommonUtil.y())) {
            CommonUtil.ab(strD);
            LogUtil.a(TAG, "CommonUtil.setIsNoCloud = ", strD);
        }
    }

    public static boolean getIf1Login(Context context) {
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        if ("0".equals(LoginInit.getInstance(context).getAccountInfo(1011))) {
            isLogined = false;
        }
        LogUtil.a(TAG, "getIf1login is loged ", Boolean.valueOf(isLogined));
        return isLogined;
    }

    public static boolean isChinaSite() {
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a(TAG, "site is ", Integer.valueOf(iN));
        return 1 != iN;
    }

    public static void isAllowedLogin(Context context) {
        LogUtil.a(TAG, "accountmigrate: isAllowedLogin() enter");
        String strD = VersionDbManager.b(BaseApplication.getContext()).d("allow_login_or_not");
        LogUtil.a(TAG, "accountmigrate: ifAllowLogin = ", strD);
        if (TextUtils.isEmpty(strD) && getIf1Login(context)) {
            HuaweiLoginManager.setIsAllowedLoginValueToDB(context, "1");
            LogUtil.a(TAG, "accountmigrate: isAllowedLogin() ifAllowLogin true");
        }
    }
}
