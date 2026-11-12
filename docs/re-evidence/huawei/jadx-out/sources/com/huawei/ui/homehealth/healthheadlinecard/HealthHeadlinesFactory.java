package com.huawei.ui.homehealth.healthheadlinecard;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
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
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class HealthHeadlinesFactory implements ParamsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25540a;

    public HealthHeadlinesFactory(Context context) {
        if (context == null) {
            this.f25540a = BaseApplication.b();
        } else {
            this.f25540a = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap(16);
        String usetId = LoginInit.getInstance(this.f25540a).getUsetId();
        if (!TextUtils.isEmpty(usetId)) {
            LogUtil.a("HealthHeadlinesFactory: userId is not null", new Object[0]);
            map.put("x-huid", usetId);
        } else {
            LogUtil.j("HealthHeadlinesFactory: userId is null", new Object[0]);
            map.put("x-huid", "");
        }
        map.put("x-version", CommonUtil.c(this.f25540a));
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapA = ofe.a(obj);
        mapA.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        mapA.put("token", LoginInit.getInstance(this.f25540a).getAccountInfo(1008));
        if (LoginInit.getInstance(this.f25540a).isLoginedByWear()) {
            mapA.put("appId", "com.huawei.bone");
        } else {
            mapA.put("appId", com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        }
        mapA.put("deviceType", PhoneInfoUtils.getDeviceModel());
        String deviceId = LoginInit.getInstance(this.f25540a).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        mapA.put("source", "1");
        mapA.put("timestamp", String.valueOf(fxk.d()));
        mapA.put("deviceId", deviceId);
        mapA.put("sysVersion", Build.VERSION.RELEASE);
        mapA.put("bindDeviceType", String.valueOf(CommonUtil.h(this.f25540a)));
        mapA.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        mapA.put("ts", String.valueOf(fxk.d()));
        mapA.put("iVersion", "5");
        String strB = pjn.b(null);
        if (strB != null) {
            strB = strB.toLowerCase();
        }
        mapA.put("lang", strB);
        mapA.put("siteId", LoginInit.getInstance(this.f25540a).getAccountInfo(1009));
        mapA.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        mapA.put("countryCode", LoginInit.getInstance(this.f25540a).getAccountInfo(1010));
        return mapA;
    }
}
