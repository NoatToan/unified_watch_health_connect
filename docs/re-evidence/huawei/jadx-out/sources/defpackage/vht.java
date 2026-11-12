package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class vht {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ParamsFactory f51124b = new nky();
    private static volatile vht e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gson f51125c = new Gson();

    private vht() {
    }

    public static vht c() {
        if (e == null) {
            synchronized (vht.class) {
                if (e == null) {
                    e = new vht();
                }
            }
        }
        return e;
    }

    private static <T> void d(String str, Map<String, String> map, String str2, Class<T> cls, ResultCallback<T> resultCallback) {
        LogUtil.a("DietCloudManager", "callHttpPost url ", str, " headers ", map, " body ", str2);
        try {
            oet.d().c(str, map, str2, cls, resultCallback);
        } catch (OutOfMemoryError e2) {
            LogUtil.e("DietCloudManager", "callHttpPost error ", LogAnonymous.b(e2), " url ", str, " headers ", map, " body ", str2, " responseType ", cls, " callback ", resultCallback);
        }
    }

    public void d(IRequest iRequest, final ResponseCallback<String> responseCallback) {
        if (NetworkUtil.h()) {
            ParamsFactory paramsFactory = f51124b;
            d(iRequest.getUrl(), paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)).replaceAll("modifiedTime", ParsedFieldTag.TASK_MODIFY_TIME), String.class, new ResultCallback<String>() { // from class: vht.5
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        ReleaseLogUtil.d("DietCloudManager", "addFullDiet jsonObject ", jSONObject);
                        jSONObject.optInt("resultCode");
                        responseCallback.onResponse(0, jSONObject.optString("resultDesc"));
                    } catch (JSONException unused) {
                        ReleaseLogUtil.a("DietCloudManager", "calculateGoal JSONException");
                        responseCallback.onResponse(-1, "calculateGoal JSONException");
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("DietCloudManager", "calculateGoal getData onFailure");
                    responseCallback.onResponse(-1, "calculateGoal onFailure");
                }
            });
        } else if (responseCallback != null) {
            responseCallback.onResponse(-2, "");
        }
    }

    public void b(IRequest iRequest, final ResponseCallback<via> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("DietCloudManager", "getDietFilterAnon callback is null request ", iRequest);
        } else {
            if (!NetworkUtil.h()) {
                responseCallback.onResponse(-2, null);
                return;
            }
            String url = iRequest.getUrl();
            ParamsFactory paramsFactory = f51124b;
            d(url, paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: vht.2
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    vht.e(str, responseCallback);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("DietCloudManager", "getDietFilterAnon onFailure throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, ResponseCallback<via> responseCallback) {
        LogUtil.a("DietCloudManager", "getDietaryIntake onSuccess json", str);
        via viaVar = new via();
        try {
            JSONObject jSONObject = new JSONObject(str.replaceAll(ParsedFieldTag.TASK_MODIFY_TIME, "modifiedTime").replaceAll("date", "localDate"));
            List<vgo> list = (List) HiJsonUtil.d(jSONObject.optString("dietDayRecordList"), new TypeToken<List<vgo>>() { // from class: com.huawei.ui.main.stories.health.weight.repository.DietCloudManager$3
            }.getType());
            for (vgo vgoVar : list) {
                if (vgoVar != null) {
                    vgoVar.f();
                }
            }
            viaVar.b(jSONObject.optInt("resultCode"));
            viaVar.e(jSONObject.optString("resultDesc"));
            viaVar.a(list);
            responseCallback.onResponse(0, viaVar);
        } catch (JSONException e2) {
            ReleaseLogUtil.a("DietCloudManager", "getDietaryIntake exception ", ExceptionUtils.c(e2));
            responseCallback.onResponse(-1, null);
        }
    }
}
