package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mow extends mor {
    @Override // defpackage.mor, com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonHeaders() {
        HashMap map = new HashMap();
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015);
        String string = Integer.toString(BaseApplication.c());
        map.put("x-usertoken", accountInfo);
        LogUtil.a("ThemeCloudRequestParamFactory", "getCommonHeaders app version:", string);
        if (CommonUtil.ao()) {
            LogUtil.a("ThemeCloudRequestParamFactory", "getCommonHeaders debug version");
            map.put("x-versioncode", "888888888");
        } else {
            map.put("x-versioncode", string);
        }
        map.put("Content-type", "application/json; charset=UTF-8");
        LogUtil.a("ThemeCloudRequestParamFactory", "getCommonHeaders header:", map);
        return map;
    }

    @Override // defpackage.mor, com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonBody(DeviceInfo deviceInfo) {
        return new HashMap();
    }
}
