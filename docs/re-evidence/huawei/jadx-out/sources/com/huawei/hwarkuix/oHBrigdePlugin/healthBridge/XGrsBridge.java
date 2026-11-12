package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.arkuixengine.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.ddv;
import defpackage.fej;
import defpackage.fxl;
import defpackage.fxn;
import defpackage.peh;
import defpackage.pjn;
import defpackage.qre;
import defpackage.qrf;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.Map;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class XGrsBridge extends OHProBridgePlugin {
    private static final String ACCOUNT_TYPE_HMS = "accountTypeHMS";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE = "application/json";
    private static final String DOMAIN_WISE_DEVICE = "domainWiseDeviceUrl";
    private static final String IS_SUPPORT_MARKETING = "isSupportMarketing";
    private static final String I_VERSION = "iVersion";
    private static final String PARAM_APP_ID = "x-app-id";
    private static final String PARAM_APP_TYPE = "x-app-type";
    private static final String PARAM_CALLER_TRACE_ID = "x-caller-trace-id";
    private static final String PARAM_CLIENT_TYPE = "clientType";
    private static final String PARAM_CLIENT_VERSION = "clientVersion";
    private static final String PARAM_CONTENT_TYPE = "Content-Type";
    private static final String PARAM_COUNTRY_CODE = "countryCode";
    private static final String PARAM_DEVICE_ID = "x-device-id";
    private static final String PARAM_DEVICE_TYPE = "x-device-type";
    private static final String PARAM_HUID = "x-huid";
    private static final String PARAM_LANGUAGE = "language";
    private static final String PARAM_SITE_ID = "x-site-id";
    private static final String PARAM_TOKEN = "x-token";
    private static final String PARAM_TOKEN_TYPE = "x-token-type";
    private static final String PARAM_TS = "x-ts";
    private static final String PARAM_VERSION = "x-client-version";
    private static final String PARAM_X_VERSION = "x-version";
    private static final String R_TAG = "R_ArkUIX_XGrsBridge";
    private static final String SOURCE = "source";
    private static final String SYS_VERSION = "sys_version";
    private static final String TAG = "ArkUIX_XGrsBridge";
    private static final String URL = "url";

    public XGrsBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XGrsBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    private String getConfig(String str, String str2, LoginInit loginInit) {
        str.hashCode();
        switch (str) {
            case "x-caller-trace-id":
            case "x-ts":
                return String.valueOf(System.currentTimeMillis() + ((long) qrf.d(10)));
            case "language":
                return pjn.b(null);
            case "countryCode":
                return !loginInit.isBrowseMode() ? loginInit.getAccountInfo(1010) : "";
            case "x-app-id":
                return BaseApplication.d();
            case "x-device-id":
                String deviceId = loginInit.getDeviceId();
                return TextUtils.isEmpty(deviceId) ? "clientnull" : deviceId;
            case "x-device-type":
                return loginInit.getDeviceType();
            case "x-token-type":
                return !loginInit.isBrowseMode() ? String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()) : "";
            case "x-huid":
                return !loginInit.isBrowseMode() ? loginInit.getAccountInfo(1011) : "";
            case "x-app-type":
                return String.valueOf(AppTypeUtils.getAppType());
            case "x-version":
            case "x-client-version":
                return CommonUtil.c(BaseApplication.b());
            case "Authorization":
                if (loginInit.isBrowseMode()) {
                    return "";
                }
                return "Bearer" + loginInit.getAccountInfo(1008);
            case "url":
                return getGRSUrl(str2);
            case "x-token":
                return !loginInit.isBrowseMode() ? loginInit.getAccountInfo(1008) : "";
            case "clientVersion":
                return fxl.d(BaseApplication.b());
            case "Content-Type":
                return "application/json";
            case "x-site-id":
                return loginInit.getAccountInfo(1009);
            case "clientType":
                return fxl.e();
            default:
                return getOtherConfig(str, loginInit);
        }
    }

    private static String getGRSUrl(String str) {
        if (DOMAIN_WISE_DEVICE.equals(str)) {
            return qre.f(R.string.domain_wise_device_url);
        }
        return GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    private String getOtherConfig(String str, LoginInit loginInit) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "sys_version":
                b2 = 0;
                break;
            case "source":
                b2 = 1;
                break;
            case "isSupportMarketing":
                b2 = 2;
                break;
            case "accountTypeHMS":
                b2 = 3;
                break;
            case "iVersion":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return Build.VERSION.RELEASE;
        }
        if (b2 == 1) {
            if (!loginInit.isBrowseMode()) {
                if (loginInit.isLoginedByWear()) {
                    return String.valueOf(2);
                }
                return String.valueOf(1);
            }
            return "";
        }
        if (b2 == 2) {
            if (Utils.o()) {
                return (((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(loginInit.getAccountInfo(1010)) && ddv.b().switchToMarketingTwo()) ? "1" : "0";
            }
            return "1";
        }
        if (b2 == 3) {
            return loginInit.getAccountInfo(1019);
        }
        if (b2 == 4) {
            return String.valueOf(6);
        }
        ReleaseLogUtil.c(TAG, "unsupported type");
        return "";
    }

    public void getHealthCloudHttpInfo(long j, String str) {
        Map<String, String> mapB = peh.b(str);
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        for (Map.Entry<String, String> entry : mapB.entrySet()) {
            entry.setValue(getConfig(entry.getKey(), entry.getValue(), loginInit));
        }
        LogUtil.a(TAG, "getHealthCloudHttpInfo,", mapB);
        ohProOnSuccess(j, HiJsonUtil.d(mapB));
    }

    public void getCloudConfig(int i) {
        ReleaseLogUtil.c(R_TAG, "getCloudConfig enter");
        boolean zG = fxn.g();
        boolean zJ = fxn.j();
        boolean zH = fxn.h();
        boolean zA = fxn.a("CE");
        boolean zA2 = fxn.a("PMDA");
        boolean zB = fxn.b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCE", zA);
            jSONObject.put("isEcgDia", zB);
            jSONObject.put("isSupportFeatureECG", zG);
            jSONObject.put("isSupportFeaturePPG", zJ);
            jSONObject.put("isSupportFeatureVascular", zH);
            jSONObject.put("isPMDA", zA2);
        } catch (JSONException unused) {
            ReleaseLogUtil.c(R_TAG, "getCloudConfig occur error.");
        }
        ReleaseLogUtil.c(R_TAG, "getCloudConfig resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void getAccountInfo(int i) {
        ReleaseLogUtil.c(R_TAG, "getAccountInfo enter");
        boolean zIsBrowseMode = LoginInit.getInstance(BaseApplication.b()).isBrowseMode();
        int iB = CommonUtil.b(BaseApplication.b(), SharedPreferenceUtil.getInstance(BaseApplication.b()).getAccountTypeHms(), -1);
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBrowseMode", zIsBrowseMode);
            jSONObject.put("ageGroupFlag", iB);
            jSONObject.put("registrationCountryCode", accountInfo);
            jSONObject.put("isSupportCloudFeature", !Utils.k());
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getAccountInfo occur error.");
        }
        ReleaseLogUtil.c(R_TAG, "getAccountInfo resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void getFeatureCloudConfig(int i) {
        ReleaseLogUtil.c(R_TAG, "getGRSCloudConfig enter");
        String strB = fej.b("com.huawei.health_deviceFeature_config", "txt");
        LogUtil.a(TAG, "featureConfig:", strB);
        ohProOnSuccess(i, strB);
    }

    public void obtainFormatTime(int i, String str) {
        LogUtil.a(TAG, "obtainFormatTime,", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strC = DateFormatUtil.c(jSONObject.getLong("timeStamp"), jSONObject.getString("format"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", strC);
            LogUtil.a(TAG, "str:", jSONObject2.toString());
            ohProOnSuccess(i, jSONObject2);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "JSONException");
            ohProOnFailure(i, "");
        }
    }

    public void getStringByNameSync(int i, String str) {
        LogUtil.a(TAG, "getStringByNameSync,", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
            String strA = qre.a(context.getResources().getIdentifier(jSONObject.getString("id"), "string", context.getPackageName()), peh.c(jSONObject.get(e.n).toString(), Object[].class).toArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", strA);
            LogUtil.a(TAG, "str:", jSONObject2.toString());
            ohProOnSuccess(i, jSONObject2);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getStringByNameSync JSONException");
            ohProOnFailure(i, "getStringByNameSync JSONException");
        } catch (Exception unused2) {
            LogUtil.c(TAG, "getStringByNameSync Exception");
            ohProOnFailure(i, "getStringByNameSync Exception");
        }
    }

    public void getGrsCountrycode(int i) {
        LogUtil.a(TAG, "getGrsCountrycode callbackId:", Integer.valueOf(i));
        try {
            JSONObject jSONObject = new JSONObject();
            String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
            jSONObject.put("countryCode", accountInfo);
            ReleaseLogUtil.c(R_TAG, "getGrsCountrycode resp: ", accountInfo);
            ohProOnSuccess(i, jSONObject);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "JSONException");
            ohProOnFailure(i, "getGrsCountrycode JSONException");
        }
    }
}
