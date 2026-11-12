package defpackage;

import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.data.DietDataApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hdp implements DietDataApi {
    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void getFoodRecommendArea(final UiCallback<hda> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendArea, Callback<FoodArea> == null");
        } else {
            LogUtil.a("Suggestion_DietDataImpl", "getFoodRecommendArea");
            hdi.e().getFoodRecommendArea(new DataCallback() { // from class: hdp.4
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendArea errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(-1, "data == null");
                        return;
                    }
                    hda hdaVar = (hda) HiJsonUtil.d(jSONObject.toString(), hda.class);
                    LogUtil.a("Suggestion_DietDataImpl", "getFoodRecommendArea foodArea:", hdaVar);
                    uiCallback.onSuccess(hdaVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, hda hdaVar, hcz hczVar, final UiCallback<hdh> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendDetail, Callback<Recipes> == null");
            return;
        }
        if (hczVar != null) {
            hczVar.b(hdaVar);
        }
        LogUtil.a("Suggestion_DietDataImpl", "getFoodRecommendDetail planId:", str, " recipesDate:", str2, " foodArea:", hdaVar);
        hdi.e().getFoodRecommendDetailCloud(str, str2, hczVar, new DataCallback() { // from class: hdp.2
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str3) {
                ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendDetail() errorCode:", Integer.valueOf(i), " errorInfo:", str3);
                uiCallback.onFailure(i, str3);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(-1, "data == null");
                    return;
                }
                hdh hdhVar = (hdh) HiJsonUtil.d(jSONObject.toString(), hdh.class);
                hdk.b(jSONObject);
                LogUtil.a("Suggestion_DietDataImpl", "getFoodRecommendDetail recipes:", hdhVar);
                uiCallback.onSuccess(hdhVar);
            }
        });
    }

    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void getFoodRecommendDetail(final String str, final String str2, final hcz hczVar, final UiCallback<hdh> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendDetailWithStatus, Callback<Recipes> == null");
        } else {
            getFoodRecommendArea(new UiCallback<hda>() { // from class: hdp.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str3) {
                    ReleaseLogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendArea errorCode:", Integer.valueOf(i), " errorInfo:", str3);
                    hdp.this.a(str, str2, null, hczVar, uiCallback);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(hda hdaVar) {
                    hdp.this.a(str, str2, hdaVar, hczVar, uiCallback);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void saveReplaceFood(final hde hdeVar, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DietDataImpl", "saveReplaceFood, Callback<String> == null");
        } else {
            LogUtil.a("Suggestion_DietDataImpl", "saveReplaceFood planId:", hdeVar.b(), " recipesDate:", hdeVar.e());
            getFoodRecommendArea(new UiCallback<hda>() { // from class: hdp.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_DietDataImpl", "saveReplaceFood errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    hdp.this.b(hdeVar, null, uiCallback);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(hda hdaVar) {
                    hdp.this.b(hdeVar, hdaVar, uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(hde hdeVar, hda hdaVar, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DietDataImpl", "saveReplaceFood, Callback<String> == null");
            return;
        }
        LogUtil.a("Suggestion_DietDataImpl", "saveReplaceFood planId:", hdeVar.b(), " recipesDate:", hdeVar.e(), " foodArea:", hdaVar);
        hcz hczVarD = hdeVar.d();
        if (hczVarD != null) {
            hczVarD.b(hdaVar);
        }
        hdi.e().saveReplaceFoodCloud(hdeVar, new DataCallback() { // from class: hdp.3
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_DietDataImpl", "saveReplaceFood() errorCode:", Integer.valueOf(i), " errorInfo:", str);
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(-1, "data == null");
                } else {
                    uiCallback.onSuccess(null);
                }
            }
        });
    }

    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void getDietSummaryCloud(double d, double d2, int i, int i2, final UiCallback<JSONObject> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DietDataImpl", "getDietSummaryCloud, Callback<FunctionAuthResult> == null");
        } else {
            LogUtil.a("Suggestion_DietDataImpl", "getDietSummaryCloud :", Double.valueOf(d), ",", Double.valueOf(d2), ",", Integer.valueOf(i), ",", Integer.valueOf(i2));
            hdi.e().getDietSummaryCloud(d, d2, i, i2, new DataCallback() { // from class: hdp.7
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) {
                    ReleaseLogUtil.a("Suggestion_DietDataImpl", "getDietSummaryCloud() errorCode=", Integer.valueOf(i3));
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(-1, "data == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DietDataImpl", "data = " + jSONObject);
                    uiCallback.onSuccess(jSONObject);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void getReplaceList(String str, int i, List<String> list, final UiCallback<List<hdc>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DietDataImpl", "getFoodRecommendDetail, Callback<Recipes> == null");
        } else {
            hdi.e().getReplaceList(str, i, list, new DataCallback() { // from class: hdp.9
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.a("Suggestion_DietDataImpl", "getReplaceList() errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("replacementFoods");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < length; i2++) {
                            arrayList.add((hdc) HiJsonUtil.d(((JSONObject) jSONArray.get(i2)).toString(), hdc.class));
                        }
                        LogUtil.a("Suggestion_DietDataImpl", "getReplaceList onSuccess。");
                        uiCallback.onSuccess(arrayList);
                    } catch (JSONException e) {
                        LogUtil.e("Suggestion_DietDataImpl", "getReplaceList() errorCode=", e);
                        uiCallback.onFailure(-1, e.toString());
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.data.DietDataApi
    public void getCustomFoods(int i, int i2, Set<String> set, final UiCallback<JSONObject> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DietDataImpl", "getCustomFoods() callback == null");
        } else {
            LogUtil.a("Suggestion_DietDataImpl", "getCustomFoods() ", Integer.valueOf(i), ", ", Integer.valueOf(i2), ", ", set);
            hdi.e().getCustomFoods(i, i2, set, new DataCallback() { // from class: hdp.8
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) {
                    ReleaseLogUtil.a("Suggestion_DietDataImpl", "getCustomFoods() errorCode=", Integer.valueOf(i3));
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(-1, "getCustomFoods() data == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DietDataImpl", "getCustomFoods() data = " + jSONObject);
                    uiCallback.onSuccess(jSONObject);
                }
            });
        }
    }
}
