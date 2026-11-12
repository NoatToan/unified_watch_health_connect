package com.huawei.hwcloudmodel.healthdatacloud;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.niz;
import defpackage.ofe;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HealthDataCloudFactory implements ParamsFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17207b;

    public HealthDataCloudFactory(Context context) {
        if (context == null) {
            this.f17207b = BaseApplication.b();
        } else {
            this.f17207b = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put(j2.v, "gzip, deflate");
        String strC = KeyValDbManager.d(this.f17207b).c("user_id");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("HealthDataCloudFactory", "huid isEmpty");
            LoginInit.getInstance(this.f17207b).moveInfoFromSPTODB();
        }
        if ("0".equals(strC)) {
            LogUtil.e("HealthDataCloudFactory", "huid is 0");
        }
        map.put("x-huid", strC);
        map.put("x-version", c(this.f17207b));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Connection", w9.j);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapD = ofe.d(obj);
        d(mapD);
        boolean zD = CloudUtils.d();
        LogUtil.a("HealthDataCloudFactory", "callService isOverSea =", Boolean.valueOf(zD));
        if (zD) {
            mapD.put("siteId", String.valueOf(LoginInit.getInstance(this.f17207b).getSiteId()));
            LogUtil.a("HealthDataCloudFactory", "callService getSiteId=", Integer.valueOf(LoginInit.getInstance(this.f17207b).getSiteId()));
        }
        mapD.put("deviceType", String.valueOf(CommonUtil.h(this.f17207b)));
        String deviceType = LoginInit.getInstance(this.f17207b).getDeviceType();
        LogUtil.d("HealthDataCloudFactory", "callService upDeviceType = ", deviceType);
        mapD.put("upDeviceType", deviceType);
        String deviceId = LoginInit.getInstance(this.f17207b).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        LogUtil.d("HealthDataCloudFactory", "callService deviceId=", deviceId);
        mapD.put("deviceId", deviceId);
        mapD.put("sysVersion", Build.VERSION.RELEASE);
        mapD.put("isManually", Integer.valueOf(ofe.d()));
        mapD.put("language", mapD.getOrDefault("language", MLAsrConstants.LAN_ZH));
        mapD.put("oaId", "");
        if ("true".equals(KeyValDbManager.d(this.f17207b).c("cloud_user_privacy10"))) {
            mapD.put("isTrackingEnabled", 1);
        } else {
            mapD.put("isTrackingEnabled", 0);
        }
        mapD.put("improveState", Boolean.valueOf(niz.c()));
        mapD.put("currentManufacturer", Build.MANUFACTURER);
        mapD.put("currentDeviceModel", Build.MODEL);
        mapD.put("rom", Build.DISPLAY);
        if (Utils.h()) {
            return mapD;
        }
        LogUtil.e("HealthDataCloudFactory", "request HEALTH_CLOUD in no-cloud country");
        return new HashMap(0);
    }

    private String c(Context context) {
        String strC = CommonUtil.c(context);
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_download_config");
        if (strE == null || !strE.contains("lfhealthtest2")) {
            return CommonUtil.cj() ? strC.replace("-Test3rdDevice", "-wearBeta") : strC;
        }
        return "and_health_10.1.1.999";
    }

    private void d(Map<String, Object> map) {
        Object objD;
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        String accountInfo = LoginInit.getInstance(this.f17207b).getAccountInfo(1008);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("HealthDataCloudFactory", "callService severToken is null!");
            LoginInit.getInstance(this.f17207b).moveInfoFromSPTODB();
            if (LoginInit.getInstance(this.f17207b).getIsLogined()) {
                LoginInit.tryLoginWhenTokenInvalid();
            }
        }
        map.put("token", accountInfo);
        if (LoginInit.getInstance(this.f17207b).isLoginedByWear()) {
            LogUtil.a("HealthDataCloudFactory", "callService appid wear logined");
            map.put("source", 2);
            objD = "com.huawei.bone";
        } else {
            LogUtil.a("HealthDataCloudFactory", "callService appid health logined");
            objD = BaseApplication.d();
            map.put("source", 1);
        }
        map.put("appId", objD);
    }
}
