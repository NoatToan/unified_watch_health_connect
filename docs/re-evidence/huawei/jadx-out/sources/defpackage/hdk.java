package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hdk {
    public static void c(final String str, final JSONObject jSONObject, final DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.d("Suggestion_DietCloudApiHelper", "postGrs, callback == null");
            return;
        }
        if (!Utils.h()) {
            LogUtil.e("Suggestion_DietCloudApiHelper", "fetch HEALTH_CLOUD from no_cloud user");
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hdk.1
                @Override // java.lang.Runnable
                public void run() {
                    hdk.c(str, jSONObject, dataCallback);
                }
            });
            return;
        }
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        final String str2 = GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + str;
        Map<String, Object> body = healthDataCloudFactory.getBody((Map) peh.d(jSONObject == null ? null : jSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.huawei.health.suggestion.cloud.DietCloudApiHelper$2
        }.getType()));
        e(body);
        oet.d().c(str2, healthDataCloudFactory.getHeaders(), ofe.c(body), String.class, new ResultCallback<String>() { // from class: hdk.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str3) {
                try {
                    hdk.b(str2, new JSONObject(str3), dataCallback);
                } catch (JSONException e) {
                    ReleaseLogUtil.c("Suggestion_DietCloudApiHelper", " postGrs success failed.", e.getMessage());
                    hdk.d(str2, new Exception(e), dataCallback);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                hdk.d(str2, new Exception(th), dataCallback);
            }
        });
    }

    private static void e(Map<String, Object> map) {
        map.put("language", pjn.b(null));
        map.put("timeZone", ieg.d());
        map.put(CloudParamKeys.CLIENT_TYPE, Integer.valueOf(qrs.d()));
        map.put("countryCode", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, JSONObject jSONObject, DataCallback dataCallback) {
        int iOptInt = 9999;
        String strC = ResultUtil.c(9999);
        if (jSONObject != null) {
            LogUtil.c("Suggestion_DietCloudApiHelper", "data = ", jSONObject);
            iOptInt = jSONObject.optInt("resultCode");
            ReleaseLogUtil.c("Suggestion_DietCloudApiHelper", "resultCode = ", Integer.valueOf(iOptInt));
            if (iOptInt == 0) {
                if (dataCallback != null) {
                    dataCallback.onSuccess(jSONObject);
                }
                LogUtil.c("Suggestion_DietCloudApiHelper", str, jSONObject.toString());
            } else if (dataCallback != null) {
                dataCallback.onFailure(iOptInt, jSONObject.optString("resultDesc"));
            }
            strC = "";
        } else if (dataCallback != null) {
            dataCallback.onFailure(9999, strC);
        }
        LogUtil.c("Suggestion_DietCloudApiHelper", str, ResultUtil.c(iOptInt), strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Exception exc, DataCallback dataCallback) {
        if (dataCallback != null) {
            dataCallback.onFailure(9999, ResultUtil.c(9999));
        }
        LogUtil.d("Suggestion_DietCloudApiHelper", "resultCode=", 9999);
        ReleaseLogUtil.b("Suggestion_DietCloudApiHelper", str, ResultUtil.c(9999), exc.getMessage());
    }

    public static hdf b(JSONObject jSONObject) {
        hdf hdfVar = new hdf();
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recommendDetail");
                if (jSONObjectOptJSONObject != null) {
                    return (hdf) HiJsonUtil.d(jSONObjectOptJSONObject.toString(), hdf.class);
                }
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.b("Suggestion_DietCloudApiHelper", "toRecipes exception: ", LogAnonymous.b(e));
            }
        }
        return hdfVar;
    }
}
