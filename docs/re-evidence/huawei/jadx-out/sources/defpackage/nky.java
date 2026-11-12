package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nky implements ParamsFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LoginInit f43245c;
    private final Context e;

    public nky() {
        Context context = BaseApplication.getContext();
        this.e = context;
        this.f43245c = LoginInit.getInstance(context);
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String huidOrDefault = this.f43245c.getHuidOrDefault();
        if (!this.f43245c.isBrowseMode() && huidOrDefault != null) {
            map.put("x-huid", huidOrDefault);
        }
        map.put("x-version", CommonUtil.c(this.e));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> map = obj == null ? new HashMap<>() : ofe.a(obj);
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        a(map);
        map.put("oaId", "");
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_product_recommend");
        if (strE == null) {
            map.put("isTrackingEnabled", "0");
        } else {
            map.put("isTrackingEnabled", strE);
        }
        if (this.f43245c.isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
            map.put("source", 2);
        } else {
            map.put("appId", xkd.e());
            map.put("source", 1);
        }
        map.put("deviceType", xkd.c());
        map.put("upDeviceType", this.f43245c.getDeviceType());
        map.put("deviceId", this.f43245c.getDeviceId());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        b(map);
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("appType", Integer.valueOf("com.huawei.bone".equals(BaseApplication.getAppPackage()) ? 2 : 1));
        map.put("ts", Long.valueOf(ifw.b(Calendar.getInstance().getTimeInMillis())));
        map.put("timeZone", ieg.d());
        LogUtil.a("HealthWeight_WeightCloudFactory", "the iVersion is: ", "6");
        map.put("iVersion", "6");
        map.put("language", b());
        map.put("lang", chf.b());
        map.put("environment", Integer.valueOf(CommonUtil.o(BaseApplication.getContext())));
        map.put("countryCode", GRSManager.c(this.e).getCommonCountryCode());
        return map;
    }

    private String b() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        String strA = LanguageUtil.a(locale);
        String country = locale.getCountry();
        if ("ZH".equalsIgnoreCase(strA)) {
            String script = locale.getScript();
            if ("HANS".equalsIgnoreCase(script)) {
                return "zh-CN";
            }
            if ("HANT".equalsIgnoreCase(script) && "CN".equalsIgnoreCase(country)) {
                return "zh-HK";
            }
        }
        return TextUtils.concat(strA, Constants.LINK, country).toString();
    }

    private void a(Map<String, Object> map) {
        if (this.f43245c.getAccountInfo(1011) != null) {
            map.put("token", this.f43245c.getAccountInfo(1008));
            map.put("siteId", Integer.valueOf(CommonUtils.j(this.f43245c.getAccountInfo(1009))));
        }
    }

    private void b(Map<String, Object> map) {
        map.put("bindDeviceType", null);
    }
}
