package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ugn implements ParamsFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f50062c;
    private final LoginInit d;

    public ugn() {
        Context context = BaseApplication.getContext();
        this.f50062c = context;
        this.d = LoginInit.getInstance(context);
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String huidOrDefault = this.d.getHuidOrDefault();
        if (!this.d.isBrowseMode() && huidOrDefault != null) {
            map.put("x-huid", huidOrDefault);
        }
        map.put("x-version", CommonUtil.c(this.f50062c));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = obj == null ? new HashMap<>() : ofe.a(obj);
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        if (this.d.getAccountInfo(1011) != null) {
            map.put("token", this.d.getAccountInfo(1008));
            map.put("siteId", Integer.valueOf(CommonUtils.j(this.d.getAccountInfo(1009))));
        }
        map.put("oaId", "");
        String strE = SharedPreferenceManager.e(this.f50062c, Integer.toString(10000), "health_product_recommend");
        if (strE == null) {
            map.put("isTrackingEnabled", "0");
        } else {
            map.put("isTrackingEnabled", strE);
        }
        if (this.d.isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", xkd.e());
        }
        map.put("deviceType", xkd.c());
        map.put("upDeviceType", this.d.getDeviceType());
        map.put("deviceId", this.d.getDeviceId());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        map.put("bindDeviceType", null);
        e(map);
        return map;
    }

    private void e(Map<String, Object> map) {
        map.put("manufacturer", Build.MANUFACTURER);
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            map.put("appType", 2);
        } else {
            map.put("appType", 1);
        }
        map.put("ts", Long.valueOf(ifw.b(Calendar.getInstance().getTimeInMillis())));
        map.put("timeZone", ieg.d());
        ReleaseLogUtil.d("Suggestion_CloudFactory", "the iVersion is: ", "5");
        map.put("iVersion", "5");
        if (LanguageUtil.o(this.f50062c)) {
            map.put("language", ProfileRequestConstants.X_LANGUAGE_VALUE);
        } else {
            map.put("language", "en_US");
        }
        map.put("environment", Integer.valueOf(CommonUtil.o(BaseApplication.getContext())));
        map.put("countryCode", GRSManager.c(this.f50062c).getCommonCountryCode());
    }
}
