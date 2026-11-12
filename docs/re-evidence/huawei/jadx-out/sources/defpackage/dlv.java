package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dlv {
    public static Map<String, String> d() {
        HashMap map = new HashMap(9);
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        if (!loginInit.isBrowseMode()) {
            map.put("x-huid", loginInit.getAccountInfo(1011));
            String accountInfo = loginInit.getAccountInfo(1008);
            map.put(CloudParamKeys.X_TOKEN, accountInfo);
            map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        }
        map.put(CloudParamKeys.X_SITE_ID, String.valueOf(loginInit.getAccountInfo(1009)));
        String strC = CommonUtil.c(BaseApplication.b());
        map.put("x-version", strC);
        map.put(CloudParamKeys.X_CLIENT_VERSION, strC);
        map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        return map;
    }
}
