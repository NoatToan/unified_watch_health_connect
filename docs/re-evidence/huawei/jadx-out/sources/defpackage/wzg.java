package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzg<T> {
    Class<T> clazz;
    String urlPath;

    wzg(Class<T> cls, String str) {
        this.urlPath = str;
        this.clazz = cls;
    }

    public Map<String, Object> createParams() {
        return addCommonParams(new HashMap());
    }

    protected Map<String, Object> addCommonParams(Map<String, Object> map) {
        map.put("ts", String.valueOf(System.currentTimeMillis()));
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("token", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        map.put("source", String.valueOf(1));
        map.put("appId", com.huawei.haf.application.BaseApplication.d());
        map.put("deviceType", String.valueOf(CommonUtil.h(BaseApplication.getContext())));
        map.put("upDeviceType", LoginInit.getInstance(BaseApplication.getContext()).getDeviceType());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("iVersion", String.valueOf(Utils.e()));
        map.put("isManually", String.valueOf(Utils.d()));
        map.put("improveState", String.valueOf(niz.c()));
        map.put("currentManufacturer", Build.MANUFACTURER);
        return map;
    }

    protected String getParamSiteID() {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
    }

    Map<String, String> createHeader() {
        HashMap map = new HashMap();
        map.put(j2.v, Constants.GZIP);
        map.put("Content-Encoding", Constants.GZIP);
        map.put("x-huid", KeyValDbManager.d(BaseApplication.getContext()).c("user_id"));
        map.put("Connection", w9.j);
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("x-version", dealAiLifeBetaName(BaseApplication.getContext()));
        return map;
    }

    private String dealAiLifeBetaName(Context context) {
        String strC = CommonUtil.c(context);
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_download_config");
        return (strE == null || !strE.contains("lfhealthtest2")) ? strC : "and_health_10.1.1.999";
    }
}
