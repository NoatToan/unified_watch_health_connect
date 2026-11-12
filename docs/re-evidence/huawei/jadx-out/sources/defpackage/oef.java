package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.kit.awareness.b.a.a;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudGzipFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.EUICCDeviceInfo;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class oef {
    public static void a(EUICCDeviceInfo eUICCDeviceInfo, ResultCallback<String> resultCallback) {
        if (resultCallback == null) {
            ReleaseLogUtil.a("DEVMGR_CloudSimDeviceInfoManager", "resultCallback is null.");
            return;
        }
        if (eUICCDeviceInfo == null) {
            ReleaseLogUtil.a("DEVMGR_CloudSimDeviceInfoManager", "euiccDeviceInfo is null.");
            return;
        }
        HealthDataCloudGzipFactory healthDataCloudGzipFactory = new HealthDataCloudGzipFactory(BaseApplication.b());
        String str = GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/commonAbility/eSimDevice/getESimDeviceInfo";
        LogUtil.a("CloudSimDeviceInfoManager", "url = ", str);
        HashMap map = new HashMap();
        map.put("eSimDeviceInfo", eUICCDeviceInfo);
        String strC = ofe.c(healthDataCloudGzipFactory.getBody(map));
        LogUtil.a("CloudSimDeviceInfoManager", "body = ", strC);
        oet.d().c(str, d(healthDataCloudGzipFactory), strC, String.class, resultCallback);
    }

    public static void a(oei oeiVar, ResultCallback<String> resultCallback) {
        HealthDataCloudGzipFactory healthDataCloudGzipFactory = new HealthDataCloudGzipFactory(BaseApplication.b());
        HashMap map = new HashMap();
        String str = GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/commonAbility/eSimDevice/getESimProfile";
        LogUtil.a("CloudSimDeviceInfoManager", "url = ", str);
        map.put("encESimProfileInfo", oeiVar);
        String strC = ofe.c(healthDataCloudGzipFactory.getBody(map));
        LogUtil.a("CloudSimDeviceInfoManager", "body = ", strC);
        oet.d().c(str, d(healthDataCloudGzipFactory), strC, String.class, resultCallback);
    }

    public static void e(String str, String str2, ResultCallback<String> resultCallback) {
        if (resultCallback == null) {
            ReleaseLogUtil.a("DEVMGR_CloudSimDeviceInfoManager", "resultCallback is null.");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.a("DEVMGR_CloudSimDeviceInfoManager", "params is invalidation.");
            return;
        }
        HealthDataCloudGzipFactory healthDataCloudGzipFactory = new HealthDataCloudGzipFactory(BaseApplication.b());
        HashMap map = new HashMap();
        map.put("carrierType", 2);
        map.put(a.g, str);
        map.put("accessCode", str2);
        String strC = ofe.c(healthDataCloudGzipFactory.getBody(map));
        Map<String, String> mapD = d(healthDataCloudGzipFactory);
        String str3 = GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/commonAbility/eSimDevice/getMobile";
        LogUtil.a("CloudSimDeviceInfoManager", "url = ", str3);
        oet.d().c(str3, mapD, strC, String.class, resultCallback);
    }

    private static Map<String, String> d(HealthDataCloudFactory healthDataCloudFactory) {
        Map<String, String> headers = healthDataCloudFactory.getHeaders();
        headers.put("Content-Encoding", HealthEngineRequestManager.CONTENT_TYPE);
        return headers;
    }
}
