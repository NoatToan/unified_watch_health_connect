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
import defpackage.ofe;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class GlobalSearchFactory implements ParamsFactory {
    private static final String API_SUPPORT_VERSION = "1";
    private static final String HEALTH_SOURCE_VALUE = "1";
    private static final String SOURCE = "source";
    private static final String TAG = "GlobalSearchFactory";
    private static final String TIMESTAMP = "timestamp";
    private Context mContext;

    public GlobalSearchFactory(Context context) {
        this.mContext = context;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap(16);
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() && !TextUtils.isEmpty(accountInfo)) {
            LogUtil.a(TAG, "userId is not null");
            map.put("x-huid", accountInfo);
        }
        map.put("x-version", CommonUtil.c(this.mContext));
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapA = ofe.a(obj);
        mapA.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        mapA.put("token", LoginInit.getInstance(this.mContext).getAccountInfo(1008));
        if (LoginInit.getInstance(this.mContext).isLoginedByWear()) {
            mapA.put("appId", "com.huawei.bone");
        } else {
            mapA.put("appId", BaseApplication.getAppPackage());
        }
        mapA.put("deviceType", PhoneInfoUtils.getDeviceModel());
        String deviceId = LoginInit.getInstance(this.mContext).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        mapA.put("source", "1");
        mapA.put("timestamp", String.valueOf(fxk.d()));
        mapA.put("deviceId", deviceId);
        mapA.put("sysVersion", Build.VERSION.RELEASE);
        mapA.put("bindDeviceType", String.valueOf(CommonUtil.h(this.mContext)));
        mapA.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        mapA.put("ts", String.valueOf(fxk.d()));
        mapA.put("iVersion", "1");
        String strB = pjn.b(null);
        if (strB != null) {
            strB = strB.toLowerCase();
        }
        mapA.put("language", strB);
        mapA.put("environment", Integer.valueOf(CommonUtil.o(this.mContext)));
        mapA.put("siteId", String.valueOf(LoginInit.getInstance(this.mContext).getSiteId()));
        mapA.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        return mapA;
    }
}
