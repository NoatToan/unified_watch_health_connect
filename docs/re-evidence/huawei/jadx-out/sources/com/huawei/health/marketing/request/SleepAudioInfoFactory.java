package com.huawei.health.marketing.request;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.lsl;
import defpackage.ofe;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class SleepAudioInfoFactory implements ParamsFactory {
    private static final String API_SUPPORT_VERSION = "1";
    private static final String CONTENT_TYPE = "application/json";
    private static final String HEALTH_SOURCE_VALUE = "1";
    private static final String SOURCE = "source";
    private static final String TAG = "SleepAudioInfoFactory";
    private static final String TIMESTAMP = "timestamp";
    private Context context;

    public SleepAudioInfoFactory(Context context) {
        if (context == null) {
            this.context = BaseApplication.getContext();
        } else {
            this.context = context;
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        LogUtil.a(TAG, "getHeaders");
        LoginInit loginInit = LoginInit.getInstance(this.context);
        HashMap map = new HashMap(16);
        map.put("Content-Type", "application/json");
        String accountInfo = loginInit.getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
            map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            map.put(CloudParamKeys.X_TOKEN, loginInit.getAccountInfo(1008));
        }
        map.put("x-version", CommonUtil.c(this.context));
        map.put("siteId", loginInit.getAccountInfo(1009));
        map.put("appId", BaseApplication.getAppPackage());
        String deviceId = loginInit.getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("deviceType", loginInit.getDeviceType());
        map.put("ts", String.valueOf(getUtcTime()));
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("x-caller-trace-id", String.valueOf(getUtcTime()) + Math.random());
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        LogUtil.a(TAG, "getBody");
        Map<String, Object> mapA = ofe.a(obj);
        mapA.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        mapA.put("token", LoginInit.getInstance(this.context).getAccountInfo(1008));
        if (LoginInit.getInstance(this.context).isLoginedByWear()) {
            mapA.put("appId", "com.huawei.bone");
        } else {
            mapA.put("appId", BaseApplication.getAppPackage());
        }
        mapA.put("deviceType", PhoneInfoUtils.getDeviceModel());
        String deviceId = LoginInit.getInstance(this.context).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        mapA.put("source", "1");
        mapA.put("timestamp", String.valueOf(fxk.d()));
        mapA.put("deviceId", deviceId);
        mapA.put("sysVersion", Build.VERSION.RELEASE);
        mapA.put("bindDeviceType", String.valueOf(CommonUtil.h(this.context)));
        mapA.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        mapA.put("ts", String.valueOf(fxk.d()));
        mapA.put("iVersion", "1");
        mapA.put("language", pjn.b(null));
        mapA.put("environment", Integer.valueOf(CommonUtil.o(this.context)));
        mapA.put("siteId", String.valueOf(LoginInit.getInstance(this.context).getSiteId()));
        mapA.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        mapA.put("timeZone", lsl.q(System.currentTimeMillis()));
        mapA.put("countryCode", LoginInit.getInstance(this.context).getAccountInfo(1010));
        return mapA;
    }

    private static long getUtcTime() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }
}
