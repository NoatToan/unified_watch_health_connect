package com.huawei.health.tradeservice.cloud;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class TradeServiceCloudFactory implements ParamsFactory {
    private static final String CONTENT_TYPE = "application/json";
    private static final String TAG = "TradeService_TradeServiceCloudFactory";
    private Context context;

    public TradeServiceCloudFactory(Context context) {
        if (context == null) {
            this.context = BaseApplication.getContext();
        } else {
            this.context = context;
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        LoginInit loginInit = LoginInit.getInstance(this.context);
        HashMap map = new HashMap(16);
        map.put("Content-type", "application/json");
        String accountInfo = loginInit.getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
            map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            map.put(CloudParamKeys.X_TOKEN, loginInit.getAccountInfo(1008));
        }
        map.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(this.context));
        map.put(CloudParamKeys.X_SITE_ID, loginInit.getAccountInfo(1009));
        map.put(CloudParamKeys.X_APP_ID, BaseApplication.getAppPackage());
        String deviceId = loginInit.getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put(CloudParamKeys.X_DEVICE_ID, deviceId);
        map.put(CloudParamKeys.X_DEVICE_TYPE, loginInit.getDeviceType());
        map.put(CloudParamKeys.X_TS, String.valueOf(getUtcTime()));
        map.put(CloudParamKeys.X_APP_TYPE, String.valueOf(AppTypeUtils.getAppType()));
        map.put("x-caller-trace-id", String.valueOf(getUtcTime()) + Math.random());
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        return new HashMap();
    }

    private static long getUtcTime() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }
}
