package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class chj implements ParamsFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LoginInit f1607c;
    private final Context d;

    public chj() {
        Context context = BaseApplication.getContext();
        this.d = context;
        this.f1607c = LoginInit.getInstance(context);
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String huidOrDefault = this.f1607c.getHuidOrDefault();
        if (!this.f1607c.isBrowseMode() && huidOrDefault != null) {
            map.put("x-huid", huidOrDefault);
        }
        map.put("x-version", CommonUtil.c(this.d));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = obj == null ? new HashMap<>() : ofe.a(obj);
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        d(map);
        map.put("oaId", "");
        String strE = SharedPreferenceManager.e(this.d, Integer.toString(10000), "health_product_recommend");
        if (strE == null) {
            map.put("isTrackingEnabled", "0");
        } else {
            map.put("isTrackingEnabled", strE);
        }
        if (this.f1607c.isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", xkd.e());
        }
        map.put("deviceType", xkd.c());
        map.put("upDeviceType", this.f1607c.getDeviceType());
        map.put("deviceId", this.f1607c.getDeviceId());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        b(map);
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("appType", Integer.valueOf("com.huawei.bone".equals(BaseApplication.getAppPackage()) ? 2 : 1));
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("timeZone", lsl.q(System.currentTimeMillis()));
        LogUtil.a("Suggestion_CloudFactory", "the iVersion is: ", "6");
        map.put("iVersion", "6");
        map.put("language", LanguageUtil.o(this.d) ? ProfileRequestConstants.X_LANGUAGE_VALUE : "en_US");
        map.put("lang", chf.b());
        map.put("environment", Integer.valueOf(CommonUtil.o(BaseApplication.getContext())));
        map.put("countryCode", GRSManager.c(this.d).getCommonCountryCode());
        return map;
    }

    private void d(Map<String, Object> map) {
        if (this.f1607c.getAccountInfo(1011) != null) {
            map.put("token", this.f1607c.getAccountInfo(1008));
            map.put("siteId", Integer.valueOf(Integer.parseInt(this.f1607c.getAccountInfo(1009))));
        }
    }

    private void b(Map<String, Object> map) {
        map.put("bindDeviceType", null);
    }
}
