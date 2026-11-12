package defpackage;

import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nlq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ParamsFactory f43250c = new nky();

    private static <T> void d(String str, Map<String, String> map, String str2, Class<T> cls, ResultCallback<T> resultCallback) {
        LogUtil.a("HealthWeight_FatLossCloudManager", "callHttpPost url ", str, " headers ", map, " body ", str2);
        try {
            oet.d().c(str, map, str2, cls, resultCallback);
        } catch (OutOfMemoryError e) {
            LogUtil.e("HealthWeight_FatLossCloudManager", "callHttpPost error ", LogAnonymous.b(e), " url ", str, " headers ", map, " body ", str2, " responseType ", cls, " callback ", resultCallback);
        }
    }

    private static boolean a() {
        boolean zAb = CommonUtil.ab(BaseApplication.b());
        boolean zH = Utils.h();
        ReleaseLogUtil.d("HealthWeight_FatLossCloudManager", "isVerify isNetworkConnected ", Boolean.valueOf(zAb), " isAllowLogin ", Boolean.valueOf(zH));
        return zAb && zH;
    }

    public static void b(IRequest iRequest, final UiCallback<iuu> uiCallback) {
        if (a()) {
            ParamsFactory paramsFactory = f43250c;
            d(iRequest.getUrl(), paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: nlq.1
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        ReleaseLogUtil.d("HealthWeight_FatLossCloudManager", "calculateGoal jsonObject ", jSONObject);
                        int iOptInt = jSONObject.optInt("resultCode");
                        String strOptString = jSONObject.optString("resultDesc");
                        if (iOptInt != 0) {
                            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "calculateGoal onFailure resultCode ", Integer.valueOf(iOptInt), " desc ", strOptString);
                            uiCallback.onFailure(iOptInt, strOptString);
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("goalDetail");
                            ReleaseLogUtil.d("HealthWeight_FatLossCloudManager", "calculateGoal object ", jSONObject2);
                            uiCallback.onSuccess((iuu) peh.b(jSONObject2.toString(), iuu.class));
                        }
                    } catch (JSONException unused) {
                        ReleaseLogUtil.a("HealthWeight_FatLossCloudManager", "calculateGoal JSONException");
                        uiCallback.onFailure(-1, "calculateGoal JSONException");
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "calculateGoal getData onFailure");
                    uiCallback.onFailure(-1, "calculateGoal onFailure");
                }
            });
        } else if (uiCallback != null) {
            uiCallback.onFailure(-1, "");
        }
    }

    private static void a(IRequest iRequest, final ResponseCallback<JSONObject> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getDietFilterAnon callback is null request ", iRequest);
        } else {
            if (!a()) {
                responseCallback.onResponse(-1, null);
                return;
            }
            String url = iRequest.getUrl();
            ParamsFactory paramsFactory = f43250c;
            d(url, paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: nlq.5
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("HealthWeight_FatLossCloudManager", "getDietFilterAnon onSuccess json ", str);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        responseCallback.onResponse(jSONObject.optInt("resultCode"), jSONObject);
                    } catch (JSONException e) {
                        ReleaseLogUtil.a("HealthWeight_FatLossCloudManager", "getDietFilterAnon exception ", ExceptionUtils.c(e));
                        responseCallback.onResponse(-1, null);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getDietFilterAnon onFailure throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public static void b(IRequest iRequest, final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getSupportDietSetting callback is null request ", iRequest);
        } else {
            a(iRequest, new ResponseCallback() { // from class: nls
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    nlq.c(responseCallback, i, (JSONObject) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, JSONObject jSONObject) {
        if (jSONObject == null || i != 0) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getSupportDietSetting jsonObject is null errorCode ", Integer.valueOf(i));
            responseCallback.onResponse(i, false);
            return;
        }
        LogUtil.a("HealthWeight_FatLossCloudManager", "diet setting is ", jSONObject.toString());
        iuo.x();
        iuo.e(jSONObject.optInt("display") == 1, "THIRD_DIET_TIME_MILLIS", System.currentTimeMillis());
        iuo.e(jSONObject.optInt("simplifyDisplay") == 1, "SIMPLIFY_DIET_TIME_MILLIS", System.currentTimeMillis());
        iuo.e(jSONObject.optInt("dietAnalysis") == 1, "DIET_ANALYSIS_TIME_MILLIS", System.currentTimeMillis());
        iuo.e(jSONObject.optInt("recommendRecipe") == 1, "RECOMMEND_DIET_TIME_MILLIS", System.currentTimeMillis());
        responseCallback.onResponse(i, true);
    }

    private static void e(IRequest iRequest, final ResponseCallback<JSONObject> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getDietAnalysis callback is null request ", iRequest);
        } else {
            if (!a()) {
                responseCallback.onResponse(-1, null);
                return;
            }
            String url = iRequest.getUrl();
            ParamsFactory paramsFactory = f43250c;
            d(url, paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: nlq.3
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    JSONObject jSONObject;
                    int iOptInt;
                    LogUtil.a("HealthWeight_FatLossCloudManager", "getDietAnalysis onSuccess json ", str);
                    try {
                        jSONObject = new JSONObject(str);
                        try {
                            iOptInt = jSONObject.optInt("resultCode");
                        } catch (JSONException e) {
                            e = e;
                            ReleaseLogUtil.a("HealthWeight_FatLossCloudManager", "getDietAnalysis onSuccess exception ", ExceptionUtils.c(e));
                            iOptInt = -1;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        jSONObject = null;
                    }
                    responseCallback.onResponse(iOptInt, jSONObject);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getDietAnalysis onFailure throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public static void c(IRequest iRequest, final ResponseCallback<Map<String, efb>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getNutritionAnalysisItem callback is null request ", iRequest);
        } else {
            e(iRequest, new ResponseCallback() { // from class: nlv
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    nlq.e(responseCallback, i, (JSONObject) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getNutritionAnalysisItem jsonObject is null errorCode ", Integer.valueOf(i));
            responseCallback.onResponse(i, new HashMap());
            return;
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fatAnalysis");
        if (jSONObjectOptJSONObject != null) {
            map.put("fatAnalysis", (efb) HiJsonUtil.d(jSONObjectOptJSONObject.toString(), efb.class));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("proteinAnalysis");
        if (jSONObjectOptJSONObject2 != null) {
            map.put("proteinAnalysis", (efb) HiJsonUtil.d(jSONObjectOptJSONObject2.toString(), efb.class));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("carbohydrateAnalysis");
        if (jSONObjectOptJSONObject3 != null) {
            map.put("carbohydrateAnalysis", (efb) HiJsonUtil.d(jSONObjectOptJSONObject3.toString(), efb.class));
        }
        responseCallback.onResponse(i, map);
    }

    public static void d(IRequest iRequest, final ResponseCallback<List<eex>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getFoodList callback is null request ", iRequest);
        } else {
            if (!a()) {
                responseCallback.onResponse(-1, null);
                return;
            }
            String url = iRequest.getUrl();
            ParamsFactory paramsFactory = f43250c;
            d(url, paramsFactory.getHeaders(), HiJsonUtil.d(paramsFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: nlq.4
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    JSONObject jSONObject;
                    int iOptInt;
                    JSONArray jSONArrayOptJSONArray;
                    LogUtil.a("HealthWeight_FatLossCloudManager", "getFoodList onSuccess json ", str);
                    try {
                        jSONObject = new JSONObject(str);
                        try {
                            iOptInt = jSONObject.optInt("resultCode");
                        } catch (JSONException e) {
                            e = e;
                            ReleaseLogUtil.a("HealthWeight_FatLossCloudManager", "getFoodList onSuccess exception ", ExceptionUtils.c(e));
                            iOptInt = -1;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        jSONObject = null;
                    }
                    List arrayList = new ArrayList();
                    if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("foodList")) != null) {
                        arrayList = (List) HiJsonUtil.d(jSONArrayOptJSONArray.toString(), new TypeToken<List<eex>>() { // from class: com.huawei.hwhealthdatamgr.util.FatLossCloudUtil$4$1
                        }.getType());
                    }
                    responseCallback.onResponse(iOptInt, arrayList);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("HealthWeight_FatLossCloudManager", "getFoodList onFailure throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, Collections.EMPTY_LIST);
                }
            });
        }
    }
}
