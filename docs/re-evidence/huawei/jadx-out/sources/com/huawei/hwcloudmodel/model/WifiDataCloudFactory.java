package com.huawei.hwcloudmodel.model;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.niz;
import defpackage.ofe;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class WifiDataCloudFactory implements ParamsFactory {
    private static final String APP_ID = "appId";
    private static final String BI_UPLOAD_ENABLE = "improveState";
    private static final String CURRENT_MANUFACTURER = "currentManufacturer";
    private static final String DEVICE_IMEI = "deviceId";
    private static final String DEVICE_TYPE = "deviceType";
    private static final String IS_MANUALLY = "isManually";
    private static final String IS_TRACKING_ENABLED = "isTrackingEnabled";
    private static final String I_VERSION = "iVersion";
    private static final String LANGUAGE = "language";
    private static final String OAID = "oaId";
    private static final int PRIVACY_GOODS = 10;
    private static final String SITE_ID = "siteId";
    private static final String SOURCE = "source";
    private static final String SYS_VERSION = "sysVersion";
    private static final String TAG = "WifiDataCloudFactory";
    private static final String TOKEN = "token";
    private static final String TOKEN_TYPE = "tokenType";
    private static final String TS = "ts";
    private static final String UP_DEVICE_TYPE = "upDeviceType";
    private static final String USER_PRIVACY_KEY = "cloud_user_privacy";
    private Context context;

    public WifiDataCloudFactory(Context context) {
        if (context == null) {
            this.context = BaseApplication.getContext();
        } else {
            this.context = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put(j2.v, "gzip, deflate");
        String strC = KeyValDbManager.d(this.context).c("user_id");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j(TAG, "huid isEmpty");
            LoginInit.getInstance(this.context).moveInfoFromSPTODB();
        }
        if ("0".equals(strC)) {
            LogUtil.j(TAG, "huid is 0");
        }
        map.put("x-huid", strC);
        map.put("x-version", dealAiLifeBetaName(this.context));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Connection", w9.j);
        return map;
    }

    private String dealAiLifeBetaName(Context context) {
        String strC = CommonUtil.c(context);
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_download_config");
        return (strE == null || !strE.contains("lfhealthtest2")) ? strC : "and_health_10.1.1.999";
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = new HashMap<>(16);
        if (obj != null && (map = ofe.a(obj)) == null) {
            map = new HashMap<>(16);
        }
        putBodyParam(map);
        boolean zD = CloudUtils.d();
        LogUtil.a(TAG, "callService isOverSea =", Boolean.valueOf(zD));
        if (zD) {
            map.put("siteId", LoginInit.getInstance(this.context).getAccountInfo(1009));
        }
        map.put("deviceType", String.valueOf(CommonUtil.h(this.context)));
        map.put("upDeviceType", LoginInit.getInstance(this.context).getDeviceType());
        String deviceId = LoginInit.getInstance(this.context).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("iVersion", Integer.valueOf(Utils.e()));
        map.put(IS_MANUALLY, Integer.valueOf(Utils.d()));
        map.put("language", MLAsrConstants.LAN_ZH);
        map.put(OAID, "");
        if ("true".equals(KeyValDbManager.d(this.context).c("cloud_user_privacy10"))) {
            map.put(IS_TRACKING_ENABLED, 1);
        } else {
            map.put(IS_TRACKING_ENABLED, 0);
        }
        map.put(BI_UPLOAD_ENABLE, Boolean.valueOf(niz.c()));
        map.put(CURRENT_MANUFACTURER, Build.MANUFACTURER);
        return map;
    }

    private void putBodyParam(Map<String, Object> map) {
        Object appPackage;
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        String accountInfo = LoginInit.getInstance(this.context).getAccountInfo(1008);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e(TAG, "callService severToken is null!");
            LoginInit.getInstance(this.context).moveInfoFromSPTODB();
            if (LoginInit.getInstance(this.context).getIsLogined()) {
                LoginInit.tryLoginWhenTokenInvalid();
            }
        }
        map.put("token", accountInfo);
        if (LoginInit.getInstance(this.context).isLoginedByWear()) {
            LogUtil.a(TAG, "callService appid wear logined");
            map.put("source", 2);
            appPackage = "com.huawei.bone";
        } else {
            LogUtil.a(TAG, "callService appid health logined");
            appPackage = BaseApplication.getAppPackage();
            map.put("source", 1);
        }
        map.put("appId", appPackage);
    }

    public String getRequestUrl(String str) {
        String strE;
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("healthDeviceUrl");
        if (CommonUtil.ap() && (strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "key_download_config")) != null && strE.contains("lfhealthtest2")) {
            url = strE;
        }
        return url + str;
    }
}
