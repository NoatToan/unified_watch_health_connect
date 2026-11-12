package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
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
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gkw implements ParamsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LoginInit f35444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f35445b;

    public gkw() {
        Context context = BaseApplication.getContext();
        this.f35445b = context;
        this.f35444a = LoginInit.getInstance(context);
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String huidOrDefault = this.f35444a.getHuidOrDefault();
        if (!this.f35444a.isBrowseMode()) {
            if (huidOrDefault != null) {
                map.put("x-huid", huidOrDefault);
            }
            String accountInfo = this.f35444a.getAccountInfo(1008);
            if (!TextUtils.isEmpty(accountInfo)) {
                map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
                map.put(CloudParamKeys.X_TOKEN, accountInfo);
                map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            }
        }
        map.put("x-version", CommonUtil.c(this.f35445b));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = obj == null ? new HashMap<>() : ofe.a(obj);
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        a(map);
        map.put("oaId", "");
        String strE = SharedPreferenceManager.e(this.f35445b, Integer.toString(10000), "health_product_recommend");
        if (strE == null) {
            map.put("isTrackingEnabled", "0");
        } else {
            map.put("isTrackingEnabled", strE);
        }
        if (this.f35444a.isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", xkd.e());
        }
        map.put("deviceType", xkd.c());
        map.put("upDeviceType", this.f35444a.getDeviceType());
        map.put("deviceId", this.f35444a.getDeviceId());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        b(map);
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("appType", Integer.valueOf("com.huawei.bone".equals(BaseApplication.getAppPackage()) ? 2 : 1));
        map.put("ts", Long.valueOf(ifw.b(Calendar.getInstance().getTimeInMillis())));
        map.put("timeZone", ieg.d());
        LogUtil.a("Suggestion_CloudFactory", "the iVersion is: ", "6");
        map.put("iVersion", "6");
        map.put("language", LanguageUtil.o(this.f35445b) ? ProfileRequestConstants.X_LANGUAGE_VALUE : "en_US");
        map.put("lang", gld.d());
        map.put("environment", Integer.valueOf(CommonUtil.o(BaseApplication.getContext())));
        map.put("countryCode", GRSManager.c(this.f35445b).getCommonCountryCode());
        return map;
    }

    private void a(Map<String, Object> map) {
        if (this.f35444a.getAccountInfo(1011) != null) {
            map.put("token", this.f35444a.getAccountInfo(1008));
            map.put("siteId", Integer.valueOf(Integer.parseInt(this.f35444a.getAccountInfo(1009))));
        }
    }

    private void b(Map<String, Object> map) {
        map.put("bindDeviceType", null);
    }
}
