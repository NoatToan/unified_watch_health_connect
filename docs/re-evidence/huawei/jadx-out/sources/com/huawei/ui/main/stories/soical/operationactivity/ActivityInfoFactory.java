package com.huawei.ui.main.stories.soical.operationactivity;

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
import defpackage.fxl;
import defpackage.ltb;
import defpackage.ofe;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ActivityInfoFactory implements ParamsFactory {
    private static final String API_SUPPORT_VERSION = "2";
    private static final String PARAM_ACTIVITY_ID = "activityId";
    private static final String PARAM_ACTIVITY_ID_LIST = "activityList";
    private static final String QUERY_TYPE = "queryType";
    private static final String TAG = "ActivityInfoFactory";
    private Context mContext;

    public ActivityInfoFactory(Context context) {
        this.mContext = context;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        LogUtil.j(TAG, "getHeaders");
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
        LogUtil.j(TAG, "getBody");
        Map map = obj == null ? new HashMap() : ofe.a(obj);
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("token", LoginInit.getInstance(this.mContext).getAccountInfo(1008));
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("siteId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        map.put("appId", BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(this.mContext).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", "2");
        map.put("language", pjn.b(null));
        map.put("timeZone", HiDateUtil.c((String) null));
        map.put("countryCode", LoginInit.getInstance(this.mContext).getAccountInfo(1010));
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        map.put("ts", String.valueOf(ltb.h()));
        map.put("manufacturer", Build.MANUFACTURER);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        return map;
    }
}
