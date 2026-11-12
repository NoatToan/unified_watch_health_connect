package com.huawei.ui.main.stories.health.request;

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
import defpackage.ofe;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class InvoiceInfoFactory implements ParamsFactory {
    private Context e;

    public InvoiceInfoFactory(Context context) {
        if (context == null) {
            this.e = BaseApplication.getContext();
        } else {
            this.e = context;
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        LogUtil.a("InvoiceInfoFactory", "getHeaders");
        LoginInit loginInit = LoginInit.getInstance(this.e);
        HashMap map = new HashMap(16);
        map.put("Content-type", "application/json");
        String accountInfo = loginInit.getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
            map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            map.put(CloudParamKeys.X_TOKEN, loginInit.getAccountInfo(1008));
        }
        map.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(this.e));
        map.put(CloudParamKeys.X_SITE_ID, loginInit.getAccountInfo(1009));
        map.put(CloudParamKeys.X_APP_ID, BaseApplication.getAppPackage());
        String deviceId = loginInit.getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put(CloudParamKeys.X_DEVICE_ID, deviceId);
        map.put(CloudParamKeys.X_DEVICE_TYPE, loginInit.getDeviceType());
        map.put(CloudParamKeys.X_TS, String.valueOf(b()));
        map.put(CloudParamKeys.X_APP_TYPE, String.valueOf(AppTypeUtils.getAppType()));
        map.put("x-caller-trace-id", String.valueOf(b()) + Math.random());
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        LogUtil.a("InvoiceInfoFactory", "getBody");
        Map<String, Object> mapA = ofe.a(obj);
        mapA.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        mapA.put("token", LoginInit.getInstance(this.e).getAccountInfo(1008));
        if (LoginInit.getInstance(this.e).isLoginedByWear()) {
            mapA.put("appId", "com.huawei.bone");
        } else {
            mapA.put("appId", BaseApplication.getAppPackage());
        }
        mapA.put("deviceType", PhoneInfoUtils.getDeviceModel());
        String deviceId = LoginInit.getInstance(this.e).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        mapA.put("source", "1");
        mapA.put("timestamp", String.valueOf(fxk.d()));
        mapA.put("deviceId", deviceId);
        mapA.put("sysVersion", Build.VERSION.RELEASE);
        mapA.put("bindDeviceType", String.valueOf(CommonUtil.h(this.e)));
        mapA.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        mapA.put("ts", String.valueOf(fxk.d()));
        mapA.put("iVersion", "1");
        mapA.put("language", pjn.b(null));
        mapA.put("environment", Integer.valueOf(CommonUtil.o(this.e)));
        mapA.put("siteId", String.valueOf(LoginInit.getInstance(this.e).getSiteId()));
        mapA.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        mapA.put("timeZone", HiDateUtil.c((String) null));
        mapA.put("countryCode", LoginInit.getInstance(this.e).getAccountInfo(1010));
        return mapA;
    }

    private static long b() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }
}
