package defpackage;

import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mij {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41709c = "HealthCloudUtil";

    public static int b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d(f41709c, "getHealthCloudId deviceInfo is null");
            return -1;
        }
        if (CompileParameterUtil.c("IS_RELEASE_VERSION", false) || deviceInfo.getProductType() < 55) {
            LogUtil.b(f41709c, "getHealthCloudId productType:", Integer.valueOf(deviceInfo.getProductType()));
            return 0;
        }
        String strB = b(deviceInfo.getProductType());
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strB);
        String str = f41709c;
        LogUtil.b(str, "getHealthCloudId uuid:", strB, "; isPluginAvailable", Boolean.valueOf(zIsResourcesAvailable));
        if (zIsResourcesAvailable) {
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strB);
            if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                LogUtil.e(str, "getHealthCloudId info or WearDeviceInfo is null");
            } else {
                edz edzVarI = pluginInfoByUuid.i();
                int iAt = edzVarI.at();
                try {
                    String string = new JSONObject(edzVarI.e()).getString("ai_tips_product_" + deviceInfo.getHiLinkDeviceId());
                    LogUtil.b(str, "getHealthCloudId hiLinkDeviceInfo is:", string);
                    JSONObject jSONObject = new JSONObject(string);
                    if (!jSONObject.has("health_cloud_productId")) {
                        return iAt;
                    }
                    iAt = jSONObject.getInt("health_cloud_productId");
                    LogUtil.b(str, "healthCloudId is ", Integer.valueOf(iAt));
                    return iAt;
                } catch (JSONException unused) {
                    LogUtil.d(f41709c, "getIntelligentHomeSwitchFromCloud JSONException");
                    return iAt;
                }
            }
        }
        return -1;
    }

    private static String b(int i) {
        String key = "";
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                key = entry.getKey();
                if ((edg.b().get(key) != null ? edg.b().get(key).intValue() : 0) == i) {
                    break;
                }
            }
        }
        return key;
    }
}
