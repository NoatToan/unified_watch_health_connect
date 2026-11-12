package com.huawei.health.marketing.request;

import android.content.Context;
import android.os.Build;
import com.huawei.hwcommonmodel.application.BaseApplication;
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

/* JADX INFO: loaded from: classes7.dex */
public class ActivityInfoListFactory implements ParamsFactory {
    private static final String API_SUPPORT_VERSION = "1";
    private static final String TAG = "ActivityInfoListFactory";
    private Context mContext;

    public ActivityInfoListFactory(Context context) {
        this.mContext = context;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap(16);
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        if (accountInfo != null) {
            map.put("x-huid", accountInfo);
        }
        map.put("x-version", CommonUtil.c(this.mContext));
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = obj == null ? new HashMap<>() : ofe.a(obj);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("phoneType", PhoneInfoUtils.getHuaweiManufaturerOrEmui());
        String deviceId = LoginInit.getInstance(this.mContext).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", String.valueOf(CommonUtil.h(this.mContext)));
        map.put("wearType", "");
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", "1");
        map.put("countryCode", LoginInit.getInstance(this.mContext).getAccountInfo(1010));
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(fxk.d()));
        map.put("token", LoginInit.getInstance(this.mContext).getAccountInfo(1008));
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("upDeviceType", LoginInit.getInstance(this.mContext).getDeviceType());
        if (LoginInit.getInstance(this.mContext).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        map.put("siteId", LoginInit.getInstance(this.mContext).getAccountInfo(1009));
        map.put("manufacturer", Build.MANUFACTURER);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        return map;
    }
}
