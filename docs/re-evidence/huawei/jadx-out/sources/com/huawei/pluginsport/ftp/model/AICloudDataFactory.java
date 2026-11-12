package com.huawei.pluginsport.ftp.model;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.lsl;
import health.compact.a.CommonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes42.dex */
public class AICloudDataFactory extends HealthDataCloudFactory {
    public AICloudDataFactory(Context context) {
        super(context);
    }

    @Override // com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory, com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        Map<String, String> headers = super.getHeaders();
        headers.put(CloudParamKeys.X_CLIENT_TIMEZONE, lsl.q(System.currentTimeMillis()));
        headers.put(j2.v, "gzip, deflate");
        headers.put("x-caller-trace-id", String.valueOf(System.currentTimeMillis()) + Math.random());
        headers.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015));
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1008))) {
            LogUtil.e("AICloudDataFactory", "callService severToken is null!");
            LoginInit.getInstance(BaseApplication.b()).moveInfoFromSPTODB();
            if (LoginInit.getInstance(BaseApplication.b()).getIsLogined()) {
                LoginInit.tryLoginWhenTokenInvalid();
            }
        }
        headers.put("x-version", CommonUtil.a(BaseApplication.b()));
        headers.put("x-os-version", CommonUtil.a(BaseApplication.b()));
        headers.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.a(BaseApplication.b()));
        return headers;
    }
}
