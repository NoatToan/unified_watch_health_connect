package com.huawei.pluginsocialshare.cloud.suggestcloud;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.fxl;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ShareDataCloudFactory implements ParamsFactory {
    private Context d;

    public ShareDataCloudFactory(Context context) {
        if (context == null) {
            this.d = BaseApplication.b();
        } else {
            this.d = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
        String strC = CommonUtil.c(this.d);
        if (accountInfo != null) {
            map.put("x-huid", accountInfo);
        }
        map.put("x-version", strC);
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapA = ofe.a(obj);
        c(mapA);
        b(mapA);
        return mapA;
    }

    private void c(Map<String, Object> map) {
        PackageInfo packageInfo;
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        LoginInit loginInit = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        map.put("token", loginInit.getAccountInfo(1008));
        map.put("siteId", loginInit.getAccountInfo(1009));
        map.put("oaId", "");
        if (LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            try {
                packageInfo = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageManager().getPackageInfo(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                LogUtil.e("ShareDataCloudFactory", LogAnonymous.b(e));
                packageInfo = null;
            }
            map.put("appId", packageInfo != null ? packageInfo.packageName : "");
        }
        map.put("deviceType", Build.MODEL);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        map.put("upDeviceType", LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getDeviceType());
        map.put("deviceId", LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getDeviceId());
        map.put("sysVersion", Build.VERSION.RELEASE);
    }

    private void b(Map<String, Object> map) {
        if ("com.huawei.bone".equals(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage())) {
            map.put("appType", 2);
        } else {
            map.put("appType", 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        map.put("ts", Long.valueOf(calendar.getTimeInMillis()));
        map.put("timeZone", new SimpleDateFormat("ZZZ").format(new Date()));
        if (LanguageUtil.o(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            map.put("language", ProfileRequestConstants.X_LANGUAGE_VALUE);
        } else {
            map.put("language", CommonUtil.u());
        }
        map.put("countryCode", LoginInit.getInstance(this.d).getAccountInfo(1010));
        map.put("environment", Integer.valueOf(CommonUtil.o(com.huawei.hwcommonmodel.application.BaseApplication.getContext())));
        map.put("manufacturer", Build.MANUFACTURER);
    }
}
