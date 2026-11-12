package com.huawei.health.plan.aicoach;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.chf;
import defpackage.lsl;
import health.compact.a.CommonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AICoachFactory extends HealthDataCloudFactory {
    public AICoachFactory(Context context) {
        super(context);
    }

    @Override // com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory, com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> body = super.getBody(obj);
        body.put("language", chf.a());
        return body;
    }

    @Override // com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory, com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        Map<String, String> headers = super.getHeaders();
        headers.put(CloudParamKeys.X_CLIENT_TIMEZONE, lsl.q(System.currentTimeMillis()));
        headers.put("ts", String.valueOf(System.currentTimeMillis()));
        headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015));
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1008);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("AICoachFactory", "callService severToken is null!");
            LoginInit.getInstance(BaseApplication.b()).moveInfoFromSPTODB();
            if (LoginInit.getInstance(BaseApplication.b()).getIsLogined()) {
                LoginInit.tryLoginWhenTokenInvalid();
            }
        }
        headers.put("token", accountInfo);
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(BaseApplication.b()));
        return headers;
    }
}
