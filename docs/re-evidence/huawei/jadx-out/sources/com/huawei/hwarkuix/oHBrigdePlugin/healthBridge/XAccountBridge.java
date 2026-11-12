package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.up.model.UserInfomation;
import defpackage.ioy;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class XAccountBridge extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_XAccountBridge";
    private static final String TAG = "ArkUIX_XAccountBridge";

    public XAccountBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XAccountBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void getAccountInfo(int i) {
        int age;
        int i2;
        String str;
        OHProBridgePlugin oHProBridgePlugin;
        ReleaseLogUtil.c(R_TAG, "getAccountInfo enter");
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        boolean zIsBrowseMode = loginInit.isBrowseMode();
        int iB = CommonUtil.b(BaseApplication.b(), SharedPreferenceUtil.getInstance(BaseApplication.b()).getAccountTypeHms(), 0);
        String accountInfo = loginInit.getAccountInfo(1010);
        String accountInfo2 = loginInit.getAccountInfo(1014);
        String accountInfo3 = loginInit.getAccountInfo(1017);
        String accountInfo4 = loginInit.getAccountInfo(1018);
        String accountInfo5 = loginInit.getAccountInfo(1000);
        String accountInfo6 = loginInit.getAccountInfo(1011);
        String accountInfo7 = loginInit.getAccountInfo(1002);
        String accountInfo8 = loginInit.getAccountInfo(1003);
        String accountInfo9 = loginInit.getAccountInfo(1005);
        String accountInfo10 = loginInit.getAccountInfo(1006);
        String accountInfo11 = loginInit.getAccountInfo(1009);
        boolean z = iB == 2;
        UserInfomation userInfomationA = ioy.a();
        if (userInfomationA == null) {
            LogUtil.d(TAG, "userInfomation is null");
            age = 0;
        } else {
            age = userInfomationA.getAge();
        }
        JSONObject jSONObject = new JSONObject();
        int i3 = age;
        try {
            jSONObject.put("isBrowseMode", zIsBrowseMode);
            jSONObject.put("ageGroupFlag", iB);
            jSONObject.put("registrationCountryCode", accountInfo);
            jSONObject.put(CommonConstant.KEY_SERVICE_COUNTRY_CODE, accountInfo2);
            jSONObject.put("siteId", accountInfo11);
            jSONObject.put("isKidAccount", Boolean.valueOf(z));
            jSONObject.put("isSupportCloudFeature", !Utils.k());
            jSONObject.put("mobileNumber", accountInfo3);
            jSONObject.put("email", accountInfo4);
            jSONObject.put("account", accountInfo5);
            jSONObject.put(JsbMapKeyNames.H5_USER_ID, accountInfo6);
            jSONObject.put("nickName", accountInfo7);
            jSONObject.put("displayPicture", accountInfo8);
            jSONObject.put(CommonConstant.KEY_GENDER, accountInfo9);
            jSONObject.put("birthday", accountInfo10);
            jSONObject.put("age", i3);
            oHProBridgePlugin = this;
            i2 = i;
            str = r0;
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getAccountInfo occur error.");
            i2 = i;
            str = TAG;
            oHProBridgePlugin = this;
            oHProBridgePlugin.ohProOnFailure(i2, "getAccountInfo JSONException");
        }
        LogUtil.a(str, "getAccountInfo resp: ", jSONObject.toString());
        ReleaseLogUtil.c(R_TAG, "getAccountInfo resp success");
        oHProBridgePlugin.ohProOnSuccess(i2, jSONObject);
    }

    public void isLogined(int i) {
        ReleaseLogUtil.c(R_TAG, "isLogined enter");
        boolean isLogined = LoginInit.getInstance(BaseApplication.b()).getIsLogined();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isLogined", isLogined);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isLogined put error");
        }
        ReleaseLogUtil.c(R_TAG, "isLogined resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }
}
