package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qdn implements ParamsFactory {
    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        Context contextB = BaseApplication.b();
        LoginInit loginInit = LoginInit.getInstance(contextB);
        if (!loginInit.isBrowseMode()) {
            String huidOrDefault = loginInit.getHuidOrDefault();
            if (!TextUtils.isEmpty(huidOrDefault)) {
                map.put("x-huid", huidOrDefault);
            }
        }
        map.put("x-version", CommonUtil.c(contextB));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map map = obj == null ? new HashMap() : ofe.a(obj);
        map.put("oaId", "");
        map.put("bindDeviceType", null);
        map.put("iVersion", "6");
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        map.put("deviceType", xkd.c());
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put("ts", Long.valueOf(jCurrentTimeMillis));
        map.put("timeZone", lsl.q(jCurrentTimeMillis));
        map.put("appType", Integer.valueOf("com.huawei.bone".equals(BaseApplication.d()) ? 2 : 1));
        Context contextB = BaseApplication.b();
        map.put("environment", Integer.valueOf(CommonUtil.o(contextB)));
        map.put("countryCode", GRSManager.c(contextB).getCommonCountryCode());
        String strE = SharedPreferenceManager.e(contextB, String.valueOf(10000), "health_product_recommend");
        if (TextUtils.isEmpty(strE)) {
            map.put("isTrackingEnabled", "0");
        } else {
            map.put("isTrackingEnabled", strE);
        }
        LoginInit loginInit = LoginInit.getInstance(contextB);
        map.put("deviceId", loginInit.getDeviceId());
        map.put("upDeviceType", loginInit.getDeviceType());
        if (loginInit.getAccountInfo(1011) != null) {
            map.put("token", loginInit.getAccountInfo(1008));
            map.put("siteId", Integer.valueOf(CommonUtils.j(loginInit.getAccountInfo(1009))));
        }
        if (loginInit.isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
            map.put("source", 2);
        } else {
            map.put("appId", xkd.e());
            map.put("source", 1);
        }
        map.put("lang", chf.b());
        map.put("language", LanguageUtil.a());
        return map;
    }
}
