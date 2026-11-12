package defpackage;

import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.suggestion.cloud.DietCloudApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.LogAnonymous;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hdm implements DietCloudApi {
    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void getFoodRecommendArea(DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "getFoodRecommendArea DataCallback == null");
        } else {
            hdk.c("/healthExpansion/food/recommend/getPreference", null, dataCallback);
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void getFoodRecommendDetailCloud(String str, String str2, hcz hczVar, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "getFoodRecommendDetailCloud DataCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("iVersion", "2");
            jSONObject.put("planId", str);
            jSONObject.put("recipesDate", str2);
            jSONObject.put("foodMatchConditions", new JSONObject(new Gson().toJson(hczVar)));
            jSONObject.put("management", hczVar.a());
            LogUtil.a("Suggestion_DietCloudApiImpl", "foodConditions" + hczVar.toString());
            hdk.c("/healthExpansion/food/recommend/detail", jSONObject, dataCallback);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void saveReplaceFoodCloud(hde hdeVar, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "saveReplaceFoodCloud DataCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("iVersion", "2");
            jSONObject.put("replaceType", hdeVar.i());
            jSONObject.put("planId", hdeVar.b());
            jSONObject.put("recipesDate", hdeVar.e());
            jSONObject.put("foodMatchConditions", new JSONObject(new Gson().toJson(hdeVar.d())));
            jSONObject.put("recommendDetail", new JSONObject(new Gson().toJson(hdeVar.c())));
            jSONObject.put("mealType", hdeVar.a());
            hdk.c("/healthExpansion/food/saveReplaceFood", jSONObject, dataCallback);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void getDietSummaryCloud(double d, double d2, int i, int i2, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "getDietSummaryCloud DataCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("iVersion", "1");
            jSONObject.put("weight", d);
            jSONObject.put("height", d2);
            jSONObject.put("averageDailyEnergyCommend", i);
            jSONObject.put("averageDailyEnergy", i2);
            hdk.c("/healthExpansion/diet/getDietSummary", jSONObject, dataCallback);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void batchGetFood(Set<String> set, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "batchGetFood DataCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("iVersion", "1");
            jSONObject.put("foodIds", jSONArray);
            hdk.c("/healthExpansion/food/list", jSONObject, dataCallback);
            LogUtil.a("Suggestion_DietCloudApiImpl", "batch get food params is " + jSONObject);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void getReplaceList(String str, int i, List<String> list, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "getReplaceList DataCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("iVersion", "2");
            jSONObject.put("replaceType", String.valueOf(2));
            jSONObject.put("recipesDate", str);
            jSONObject.put("mealType", i);
            if (njy.b(list)) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("immutableFoodIds", jSONArray);
            }
            hdk.c("/healthExpansion/food/getReplaceList", jSONObject, dataCallback);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }

    @Override // com.huawei.health.suggestion.cloud.DietCloudApi
    public void getCustomFoods(int i, int i2, Set<String> set, DataCallback dataCallback) {
        if (dataCallback == null) {
            LogUtil.j("Suggestion_DietCloudApiImpl", "getCustomFoods() callback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("iVersion", "1");
            jSONObject.put("pageNum", i);
            jSONObject.put(IAchieveDBMgr.PARAM_PAGE_SIZE, i2);
            if (njy.b(set)) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("customFoodIds", jSONArray);
            }
            hdk.c("/healthExpansion/food/getCustomFoods", jSONObject, dataCallback);
            LogUtil.a("Suggestion_DietCloudApiImpl", "getCustomFoods() params: " + jSONObject);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DietCloudApiImpl", LogAnonymous.b(e));
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
    }
}
