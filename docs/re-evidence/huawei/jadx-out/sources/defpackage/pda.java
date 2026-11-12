package defpackage;

import com.google.gson.JsonParseException;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public final class pda {
    public static List<Workout> b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ArrayList(0);
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("itemList");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("workoutPackageList");
            List<FitWorkout> listA = a(jSONObject);
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray == null) {
                LogUtil.a("Suggestion_CloudDataParseUtil", "itemList is invalid");
                return arrayList;
            }
            List<pco> list = pcr.a().parse(CommonUtil.u(), jSONArrayOptJSONArray);
            for (int i = 0; i < list.size(); i++) {
                int iIntValue = list.get(i).d().intValue();
                int iIntValue2 = list.get(i).e().intValue();
                long jLongValue = list.get(i).b().longValue();
                if (iIntValue == 0) {
                    FitWorkout fitWorkout = listA.get(iIntValue2);
                    fitWorkout.setNewUseWorkoutTime(jLongValue);
                    arrayList.add(fitWorkout);
                } else if (iIntValue != 2 || jSONArrayOptJSONArray2 == null) {
                    LogUtil.a("Suggestion_CloudDataParseUtil", "type is invalid");
                } else {
                    WorkoutPackageInfo workoutPackageInfo = pcr.b().parse(CommonUtil.u(), jSONArrayOptJSONArray2).get(iIntValue2);
                    workoutPackageInfo.setNewUseWorkoutTime(jLongValue);
                    arrayList.add(workoutPackageInfo);
                }
            }
            return arrayList;
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseWorkouts failed with JsonParseException", e.getMessage());
            return new ArrayList(0);
        }
    }

    public static List<FitWorkout> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("workoutList");
            if (jSONArrayOptJSONArray == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                FitWorkout fitWorkoutD = d(CommonUtil.u(), jSONArrayOptJSONArray.optJSONObject(i));
                if (fitWorkoutD != null) {
                    arrayList.add(fitWorkoutD);
                }
            }
            return arrayList;
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkouts failed with JsonParseException", e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    public static FitWorkout d(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkout failed with null input, lan: ", str);
            return null;
        }
        int iOptInt = jSONObject.optInt("type");
        if (!FitWorkout.a.d(iOptInt)) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkout failed with type error, lan: ", str, " type:", Integer.valueOf(iOptInt));
            return null;
        }
        try {
            return pcr.b(iOptInt).parse(str, jSONObject);
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkout failed with JsonParseException", e.getMessage());
            return null;
        }
    }

    public static FitWorkout c(String str, JSONObject jSONObject) {
        if (jSONObject == null || str == null) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkoutDetail failed with null input, lan: ", str);
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("workoutInfo");
            int iOptInt = jSONObjectOptJSONObject.optInt("type");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actionList");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("actionComposition");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("userWorkoutRunActionInfo");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("userWorkoutRunSequenceInfo");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("equipmentWorkoutAction");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("portraitUrlList");
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("roadBook");
            FitWorkout fitWorkout = pcr.b(iOptInt).parse(str, jSONObjectOptJSONObject);
            fitWorkout.setPortraitUrlList(a(jSONArrayOptJSONArray3));
            if (iOptInt == 1 && jSONArrayOptJSONArray != null) {
                fitWorkout.saveWorkoutActions(gzq.e(jSONArrayOptJSONArray, iOptInt, fitWorkout.getCourseAttr()));
                return fitWorkout;
            }
            if (iOptInt == 2 && jSONObjectOptJSONObject2 != null) {
                fitWorkout.saveWorkoutActions(gzq.e(jSONObjectOptJSONObject2, fitWorkout));
                return fitWorkout;
            }
            if (iOptInt == 3 && jSONObjectOptJSONObject3 != null) {
                fitWorkout.saveWorkoutActions(gzq.e(jSONObjectOptJSONObject3, fitWorkout));
                return fitWorkout;
            }
            if (iOptInt == 4 && jSONArrayOptJSONArray2 != null) {
                fitWorkout.setCourseActions(pcr.e(iOptInt).parse(str, jSONArrayOptJSONArray2));
                return fitWorkout;
            }
            if (iOptInt != 5 || jSONObjectOptJSONObject4 == null) {
                LogUtil.a("Suggestion_CloudDataParseUtil", "type is invalid");
                return fitWorkout;
            }
            fitWorkout.setEquipmentWorkoutAction(pcr.c().parse(str, jSONObjectOptJSONObject4));
            fitWorkout.setRoadBookList(pcr.d().parse(str, jSONArrayOptJSONArray4));
            LogUtil.a("Suggestion_CloudDataParseUtil", "the equipmentActionInfo json : ", fitWorkout.getEquipmentWorkoutAction());
            return fitWorkout;
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseTopicList failed with JsonParseException", e.getMessage());
            return null;
        }
    }

    private static List<String> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.optString(i));
            } catch (Exception e) {
                LogUtil.a("Suggestion_CloudDataParseUtil", "optString from JsonArray failed... e:", e);
            }
        }
        return arrayList;
    }

    public static List<FitWorkout> b(String str, JSONObject jSONObject) {
        if (jSONObject == null || str == null) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkoutsDetail failed with null input, lan: ", str);
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("workoutDetails");
            if (jSONArrayOptJSONArray == null) {
                ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "workoutDetailsArray is null");
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(c(str, jSONArrayOptJSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseCourseWorkoutsDetail failed with JsonParseException", e.getMessage());
            return null;
        }
    }

    public static List<Topic> c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            return pcr.e().parse(CommonUtil.u(), jSONObject.optJSONArray("topicList"));
        } catch (JsonParseException e) {
            ReleaseLogUtil.a("Suggestion_CloudDataParseUtil", "parseTopicList failed with JsonParseException", e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }
}
