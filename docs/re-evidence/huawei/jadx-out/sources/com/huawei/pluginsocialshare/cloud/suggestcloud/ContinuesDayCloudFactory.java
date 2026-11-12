package com.huawei.pluginsocialshare.cloud.suggestcloud;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ContinuesDayCloudFactory implements ParamsFactory {
    private Context d;

    public ContinuesDayCloudFactory(Context context) {
        if (context == null) {
            this.d = BaseApplication.b();
        } else {
            this.d = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
        if (accountInfo != null) {
            map.put("x-huid", accountInfo);
        }
        map.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(this.d));
        String accountInfo2 = LoginInit.getInstance(this.d).getAccountInfo(1008);
        map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put(CloudParamKeys.X_TOKEN, accountInfo2);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        return ofe.a(obj);
    }
}
