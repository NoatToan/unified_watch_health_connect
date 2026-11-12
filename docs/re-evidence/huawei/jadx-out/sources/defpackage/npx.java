package defpackage;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class npx {
    public static void a(String str, double d, double d2, Integer num, String str2, final ReverseGeocodeResultCallback reverseGeocodeResultCallback) {
        String string;
        if (reverseGeocodeResultCallback == null) {
            LogUtil.j("HwMapGeocodeUtil", "reverseGeocode callback is null");
            return;
        }
        String str3 = GRSManager.c(BaseApplication.getContext()).getUrl("SITE_SERVER") + "mapApi/v1/siteService/reverseGeocode";
        AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
        if (aGConnectInstance == null) {
            AGConnectInstance.initialize(BaseApplication.getContext());
            aGConnectInstance = AGConnectInstance.getInstance();
        }
        if (aGConnectInstance != null && aGConnectInstance.getOptions() != null) {
            string = aGConnectInstance.getOptions().getString("/client/api_key");
        } else {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("HwMapGeocodeUtil", "reverseGeocode get apiKy error");
            reverseGeocodeResultCallback.onFailure(new Throwable("akiKey is null"));
        } else {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("hwMapReverseGeocode", str);
            OpAnalyticsUtil.getInstance().setEvent(OperationKey.HW_MAP_SEARCH_80070013.value(), linkedHashMap);
            oet.d().c(str3, e(string), d(d, d2, num, str2), ReverseGeocodeResponse.class, new ResultCallback<ReverseGeocodeResponse>() { // from class: npx.1
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
                    LogUtil.a("HwMapGeocodeUtil", "reverseGeocode onSuccess returnCode = ", reverseGeocodeResponse.getReturnCode());
                    ReverseGeocodeResultCallback reverseGeocodeResultCallback2 = reverseGeocodeResultCallback;
                    if (reverseGeocodeResultCallback2 != null) {
                        reverseGeocodeResultCallback2.onSuccess(reverseGeocodeResponse);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.e("HwMapGeocodeUtil", "reverseGeocode onFailure errorMessage  = ", ExceptionUtils.c(th));
                    ReverseGeocodeResultCallback reverseGeocodeResultCallback2 = reverseGeocodeResultCallback;
                    if (reverseGeocodeResultCallback2 != null) {
                        reverseGeocodeResultCallback2.onFailure(th);
                    }
                }
            });
        }
    }

    private static Map<String, String> e(String str) {
        LogUtil.d("HwMapGeocodeUtil", "apiKey = ", str);
        HashMap map = new HashMap(16);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str);
        map.put("Content-Type", "application/json");
        String string = UUID.randomUUID().toString();
        LogUtil.a("HwMapGeocodeUtil", "getHeaders x-requestId= ", string);
        map.put("x-requestId", string);
        return map;
    }

    private static String d(double d, double d2, Integer num, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("lng", d);
            jSONObject2.put("lat", d2);
            jSONObject.put("location", jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("language", str);
            }
            if (num != null) {
                jSONObject.put("radius", num);
            }
        } catch (JSONException e) {
            LogUtil.e("GeocodingService", e.getMessage());
        }
        LogUtil.d("HwMapGeocodeUtil", "getReGeocBody = ", jSONObject);
        return jSONObject.toString();
    }
}
