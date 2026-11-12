package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ekx {
    private static final Map<String, ekc.b> e = new ConcurrentHashMap();

    public static void c(ekc.b bVar) {
        if (bVar != null) {
            String productId = bVar.getProductId();
            if (TextUtils.isEmpty(productId)) {
                return;
            }
            e.put(productId, bVar);
        }
    }

    public static ekc.b c(String str) {
        return e.get(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("MassageGunConfigMap", "parseJsonFile urlJson is null ");
            return false;
        }
        LogUtil.b("MassageGunConfigMap", "parseJsonFile urlJson = ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("courseRecommended")) {
                return false;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("courseRecommended");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (a(jSONArray.getJSONObject(i), new ekc.b())) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            LogUtil.d("MassageGunConfigMap", "parseJsonFile JSONException");
            return false;
        }
    }

    private static boolean a(JSONObject jSONObject, ekc.b bVar) throws JSONException {
        String string;
        JSONArray jSONArrayOptJSONArray;
        if (!jSONObject.has("productId")) {
            string = "";
        } else {
            string = jSONObject.getString("productId");
            bVar.setProductId(string);
        }
        if (!jSONObject.has("recommendedCourseList") && !jSONObject.has("filterConfiguration")) {
            LogUtil.b("MassageGunConfigMap", "RECOMMENDED_COURSE_LIST or FILTER_CONFIGURATION is null");
            return true;
        }
        if (jSONObject.has("recommendedCourseList") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("recommendedCourseList")) != null && jSONArrayOptJSONArray.length() != 0) {
            bVar.setRecommendedCourseList(d(jSONArrayOptJSONArray));
        }
        boolean zC = c(bVar, jSONObject.getJSONObject("filterConfiguration"));
        if (!TextUtils.isEmpty(string) && bVar.getRecommendedCourseList() != null && bVar.getRecommendedCourseList().size() != 0 && zC) {
            c(bVar);
            return false;
        }
        LogUtil.b("MassageGunConfigMap", "productId or RecommendedCourseList is null");
        return true;
    }

    private static boolean c(ekc.b bVar, JSONObject jSONObject) {
        LogUtil.b("MassageGunConfigMap", "handleFilterConfiguration");
        if (jSONObject == null || bVar == null) {
            LogUtil.b("MassageGunConfigMap", "jsonObject or courseRecommended is null");
            return false;
        }
        ekc.b.e eVar = new ekc.b.e();
        try {
            if (jSONObject.has("allDataSortCondition")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("allDataSortCondition");
                ekc.b.a aVar = new ekc.b.a();
                if (jSONObject2.has("paramsList")) {
                    d(jSONObject2.getJSONArray("paramsList"), aVar, (ekc.b.f) null);
                }
                if (jSONObject2.has("sortRules")) {
                    aVar.setSortRules(jSONObject2.getString("sortRules"));
                }
                if (jSONObject2.has(MedalConstants.EVENT_KEY)) {
                    aVar.setKey(jSONObject2.getString(MedalConstants.EVENT_KEY));
                }
                eVar.setAllDataSortCondition(aVar);
            }
            if (jSONObject.has("filterCondition")) {
                eVar.setFilterConditions(b(jSONObject.getJSONArray("filterCondition")));
            }
            bVar.setFilterConfiguration(eVar);
            return true;
        } catch (JSONException unused) {
            LogUtil.d("MassageGunConfigMap", "handleFilterConfiguration JSONException");
            return false;
        }
    }

    private static List<ekc.b.C0313b> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    a(jSONArray, arrayList);
                    return arrayList;
                }
            } catch (JSONException unused) {
                LogUtil.d("MassageGunConfigMap", "handleFilterCondition JSONException");
            }
        }
        return arrayList;
    }

    private static void a(JSONArray jSONArray, List<ekc.b.C0313b> list) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            ekc.b.C0313b c0313b = new ekc.b.C0313b();
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject.has("conditionRules")) {
                    c0313b.setConditionRules(jSONObject.getString("conditionRules"));
                }
                if (jSONObject.has("matchingCondition")) {
                    c0313b.setMatchingCondition(e(jSONObject.getJSONArray("matchingCondition")));
                }
                if (jSONObject.has("sortCondition")) {
                    d(jSONObject.getJSONObject("sortCondition"), c0313b);
                }
                list.add(c0313b);
            }
        }
    }

    private static void d(JSONObject jSONObject, ekc.b.C0313b c0313b) {
        if (jSONObject == null || c0313b == null) {
            return;
        }
        try {
            ekc.b.f fVar = new ekc.b.f();
            if (jSONObject.has("sortRules")) {
                fVar.setSortRules(jSONObject.getString("sortRules"));
            }
            if (jSONObject.has(MedalConstants.EVENT_KEY)) {
                fVar.setKey(jSONObject.getString(MedalConstants.EVENT_KEY));
            }
            if (jSONObject.has("paramsList")) {
                d(jSONObject.getJSONArray("paramsList"), (ekc.b.a) null, fVar);
            }
            c0313b.setSortCondition(fVar);
        } catch (JSONException unused) {
            LogUtil.d("MassageGunConfigMap", "handleSortCondition JSONException");
        }
    }

    private static boolean d(JSONArray jSONArray, ekc.b.a aVar, ekc.b.f fVar) {
        LogUtil.b("MassageGunConfigMap", "handleParamsList");
        if (jSONArray == null || jSONArray.length() <= 0) {
            LogUtil.b("MassageGunConfigMap", "paramsListJsonObject is null");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has(MedalConstants.EVENT_KEY)) {
                    ekc.b.c cVar = new ekc.b.c();
                    cVar.setKey(jSONObject.getString(MedalConstants.EVENT_KEY));
                    arrayList.add(cVar);
                    b(aVar, fVar, arrayList);
                }
            } catch (JSONException unused) {
                LogUtil.d("MassageGunConfigMap", "handleParamsList JSONException");
                return false;
            }
        }
        return true;
    }

    private static void b(ekc.b.a aVar, ekc.b.f fVar, List<ekc.b.c> list) {
        if (aVar != null) {
            aVar.setParamsLists(list);
        }
        if (fVar != null) {
            fVar.setParamsLists(list);
        }
    }

    private static List<ekc.b.d> d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    break;
                }
                ekc.b.d dVar = new ekc.b.d();
                b(jSONObject, dVar);
                arrayList.add(dVar);
            } catch (JSONException unused) {
                LogUtil.d("MassageGunConfigMap", "handleRecommendedCourse JSONException");
            }
        }
        return arrayList;
    }

    private static void b(JSONObject jSONObject, ekc.b.d dVar) {
        try {
            if (jSONObject.has("courseId")) {
                dVar.setCourseId(jSONObject.getString("courseId"));
            }
            if (jSONObject.has("courseName")) {
                dVar.setCourseName(jSONObject.getString("courseName"));
            }
            if (jSONObject.has(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)) {
                dVar.setCourseType(jSONObject.getString(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE));
            }
            e(jSONObject, dVar);
            if (jSONObject.has("muscleGroup")) {
                dVar.setMuscleGroup(c(jSONObject.getJSONArray("muscleGroup")));
            }
            c(jSONObject, dVar);
        } catch (JSONException unused) {
            LogUtil.d("MassageGunConfigMap", "paresCourseInfo JSONException");
        }
    }

    private static void e(JSONObject jSONObject, ekc.b.d dVar) throws JSONException {
        if (jSONObject.has("muscleGroupImgName")) {
            dVar.setMuscleGroupImgName(jSONObject.getString("muscleGroupImgName"));
        }
        if (jSONObject.has("muscleGroupImgUrl")) {
            dVar.setMuscleGroupImgUrl(jSONObject.getString("muscleGroupImgUrl"));
        }
        if (jSONObject.has("moreData")) {
            dVar.setMoreDataUrl(jSONObject.getString("moreData"));
        }
        if (jSONObject.has("recommendedContent")) {
            dVar.setRecommendedContent(jSONObject.getInt("recommendedContent"));
        }
        if (jSONObject.has("courseInfo")) {
            d(dVar, jSONObject.getJSONArray("courseInfo"));
        }
    }

    private static void c(JSONObject jSONObject, ekc.b.d dVar) throws JSONException {
        if (jSONObject.has("matchingRules")) {
            dVar.setMatchingRules(jSONObject.getString("matchingRules"));
        }
        if (jSONObject.has("matchingCondition")) {
            dVar.setMatchingCondition(e(jSONObject.getJSONArray("matchingCondition")));
        }
    }

    private static void d(ekc.b.d dVar, JSONArray jSONArray) {
        try {
            dVar.setCourseInfo((List) new Gson().fromJson(jSONArray.toString(), new TypeToken<ArrayList<Object>>() { // from class: com.huawei.health.ecologydevice.manager.MassageGunConfigMap$1
            }.getType()));
        } catch (JsonSyntaxException unused) {
            LogUtil.d("MassageGunConfigMap", "handleCourseInfo JsonSyntaxException");
        } catch (NumberFormatException unused2) {
            LogUtil.d("MassageGunConfigMap", "handleCourseInfo NumberFormatException");
        }
    }

    private static List<String> c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.get(i) instanceof String) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (JSONException unused) {
                LogUtil.d("MassageGunConfigMap", "handleMuscleGroup JSONException");
            }
        }
        return arrayList;
    }

    private static List<String> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.get(i) instanceof String) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (JSONException unused) {
                LogUtil.d("MassageGunConfigMap", "handleMuscleGroup JSONException");
            }
        }
        return arrayList;
    }

    public static String c(String str, String str2) {
        JSONObject jSONObjectB;
        LogUtil.b("MassageGunConfigMap", "getCourseRecommendationResult");
        ekc.b bVarC = c(str2);
        if (bVarC == null) {
            LogUtil.b("MassageGunConfigMap", "courseRecommended is null");
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("MassageGunConfigMap", "activityJsonArray is null");
        }
        JSONObject jSONObject = null;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getJSONObject(i));
                }
            }
            LogUtil.b("MassageGunConfigMap", "jsonObjects.size() ", Integer.valueOf(arrayList.size()));
            jSONObjectB = ekr.b(bVarC.getFilterConfiguration(), arrayList);
            if (jSONObjectB == null) {
                try {
                    LogUtil.b("MassageGunConfigMap", "activityJson is null");
                    return c((JSONObject) null, bVarC);
                } catch (JSONException unused) {
                    jSONObject = jSONObjectB;
                    LogUtil.d("MassageGunConfigMap", "jsonArray JSONException");
                    jSONObjectB = jSONObject;
                    return c(jSONObjectB, bVarC);
                }
            }
        } catch (JSONException unused2) {
        }
        return c(jSONObjectB, bVarC);
    }

    private static String c(JSONObject jSONObject, ekc.b bVar) {
        LogUtil.b("MassageGunConfigMap", "filteringJson");
        if (bVar == null) {
            LogUtil.b("MassageGunConfigMap", "courseRecommended is null");
            return "";
        }
        HashMap map = new HashMap(16);
        List<ekc.b.d> recommendedCourseList = bVar.getRecommendedCourseList();
        if (recommendedCourseList == null || recommendedCourseList.size() <= 0) {
            LogUtil.b("MassageGunConfigMap", "recommendedCourses is null or recommendedCourses.size() <= 0");
            return "";
        }
        return d(jSONObject, map, recommendedCourseList);
    }

    private static String d(JSONObject jSONObject, Map<String, Object> map, List<ekc.b.d> list) {
        for (ekc.b.d dVar : list) {
            if (dVar.getMatchingCondition() == null || dVar.getMatchingCondition().size() <= 0) {
                return "";
            }
            map.clear();
            d(jSONObject, map, dVar);
            LogUtil.b("MassageGunConfigMap", "params ", map, " recommendedCours.getMatchingRules() ", dVar.getMatchingRules());
            if (ela.d().a(dVar.getMatchingRules(), map)) {
                LogUtil.b("MassageGunConfigMap", "select MatchingRules is ", dVar.getMatchingRules());
                return d(jSONObject, dVar);
            }
        }
        return "";
    }

    private static void d(JSONObject jSONObject, Map<String, Object> map, ekc.b.d dVar) {
        if (jSONObject == null) {
            LogUtil.b("MassageGunConfigMap", "activityJsonObject is null");
            map.put("dataSize", "0");
        } else {
            Iterator<String> it = dVar.getMatchingCondition().iterator();
            while (it.hasNext()) {
                d(jSONObject, map, it.next());
            }
        }
    }

    private static String d(JSONObject jSONObject, ekc.b.d dVar) {
        HashMap map = new HashMap();
        if (dVar == null) {
            return new Gson().toJson(map);
        }
        map.put("courseId", dVar.getCourseId());
        map.put("courseName", dVar.getCourseName());
        map.put("muscleGroupImgName", dVar.getMuscleGroupImgName());
        map.put("muscleGroupImgUrl", dVar.getMuscleGroupImgUrl());
        map.put(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE, dVar.getCourseType());
        map.put("courseInfo", dVar.getCourseInfo());
        map.put("muscleGroup", dVar.getMuscleGroup());
        map.put("recommendedContent", Integer.valueOf(dVar.getRecommendedContent()));
        map.put("moreData", dVar.getMoreDataUrl());
        c(jSONObject, map);
        return new Gson().toJson(map);
    }

    private static void d(JSONObject jSONObject, Map<String, Object> map, String str) {
        if ("currentTime".equals(str)) {
            map.put(str, String.valueOf(System.currentTimeMillis()));
        } else if ("dataSize".equals(str)) {
            map.put(str, "1");
        } else if (jSONObject.has(str)) {
            map.put(str, jSONObject.optString(str));
        }
    }

    private static void c(JSONObject jSONObject, Map<String, Object> map) {
        if (jSONObject == null) {
            return;
        }
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(jSONObject.has(BleConstants.SPORT_TYPE) ? e(d(jSONObject, BleConstants.SPORT_TYPE)) : 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    private static int e(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "257":
                b2 = 0;
                break;
            case "258":
                b2 = 1;
                break;
            case "259":
                b2 = 2;
                break;
            case "264":
                b2 = 3;
                break;
            case "265":
                b2 = 4;
                break;
            case "281":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 30005;
        }
        if (b2 == 1) {
            return 30006;
        }
        if (b2 == 2) {
            return 30007;
        }
        if (b2 == 3) {
            return 30006;
        }
        if (b2 == 4) {
            return 30007;
        }
        if (b2 == 5) {
            return 30005;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.d("MassageGunConfigMap", e2.getMessage());
            return 0;
        }
    }

    private static String d(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return String.valueOf(0);
        }
        try {
            if (!TextUtils.isEmpty(jSONObject.getString(str)) && !Constants.NULL.equals(jSONObject.getString(str))) {
                return jSONObject.getString(str);
            }
            return String.valueOf(0);
        } catch (JSONException unused) {
            LogUtil.d("MassageGunConfigMap", "getJsonString JSONException");
            return String.valueOf(0);
        }
    }
}
