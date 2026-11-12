package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.BelongInfo;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LayoutTemplateInfo;
import com.huawei.pluginfitnessadvice.ResourceType;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pcz implements CloudDataParse<FitWorkout> {
    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    public List<FitWorkout> parse(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            FitWorkout fitWorkout = parse(str, jSONArray.optJSONObject(i));
            if (fitWorkout != null) {
                arrayList.add(fitWorkout);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FitWorkout parse(String str, JSONObject jSONObject) {
        FitWorkout fitWorkout = new FitWorkout();
        fitWorkout.saveId(jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID));
        fitWorkout.setType(jSONObject.optInt("type"));
        fitWorkout.saveDistance(jSONObject.optDouble("distance"));
        fitWorkout.saveMeasurementType(jSONObject.optInt("measurementType"));
        fitWorkout.saveName(jSONObject.optString("name"));
        if (TextUtils.isEmpty(jSONObject.optString("version"))) {
            fitWorkout.saveVersion("2.0");
        } else {
            fitWorkout.saveVersion(jSONObject.optString("version"));
        }
        fitWorkout.setCourseAttr(jSONObject.optInt("courseAttr", 2));
        fitWorkout.saveDuration(jSONObject.optInt("duration"));
        fitWorkout.saveCalorie(jSONObject.optInt("calorie"));
        fitWorkout.saveMidPicture(jSONObject.optString("midPicture"));
        fitWorkout.saveDescription(jSONObject.optString("description"));
        fitWorkout.saveModified(jSONObject.optLong(ParsedFieldTag.TASK_MODIFY_TIME));
        fitWorkout.savePublishDate(jSONObject.optLong("createTime"));
        fitWorkout.saveDifficulty(jSONObject.optInt("difficulty"));
        fitWorkout.saveIsSupportDevice(jSONObject.optInt("supportWear"));
        fitWorkout.savePicture(jSONObject.optString("picture"));
        fitWorkout.saveEquipments(pcx.a(jSONObject.optJSONArray("equipments"), Attribute[].class));
        fitWorkout.saveUsers(jSONObject.optInt("users"));
        fitWorkout.saveExerciseTimes(jSONObject.optInt("exerciseTimes"));
        fitWorkout.saveTrainingpoints(pcx.a(jSONObject.optJSONArray("trainingPoints"), Attribute[].class));
        fitWorkout.saveNarrowPicture(jSONObject.optString("narrowPicture"));
        fitWorkout.saveNarrowDesc(d(jSONObject.optString("narrowDesc"), jSONObject.optString("extendMap")));
        fitWorkout.setIntervals(jSONObject.optInt("intervals", -4));
        fitWorkout.saveListRelativeWorkouts(peh.c(jSONObject.optString("narrowDesc"), String[].class));
        fitWorkout.saveExtendSeaMap(jSONObject.optString("extendSeaMap"));
        fitWorkout.saveStage(jSONObject.optInt("stage"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("secondClassify");
        if (jSONArrayOptJSONArray != null) {
            fitWorkout.saveClassifyInfo(pcx.a(jSONArrayOptJSONArray, Classify[].class));
        }
        fitWorkout.saveClasses(pcx.a(jSONObject.optJSONArray("classList"), Attribute[].class));
        fitWorkout.setWorkoutType(jSONObject.optInt(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("primaryClassify");
        if (jSONArrayOptJSONArray2 != null) {
            fitWorkout.setPrimaryClassify(pcx.a(jSONArrayOptJSONArray2, Classify[].class));
        }
        fitWorkout.setTopicPreviewPicUrl(jSONObject.optString("topicPreviewPicUrl"));
        fitWorkout.setSmartScreeFlag(jSONObject.optInt("smartScreenFlag"));
        fitWorkout.setTemplateType(jSONObject.optInt("extendTemplateType"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extendTemplateInfo");
        if (jSONObjectOptJSONObject != null) {
            fitWorkout.setLayoutTemplateInfo((LayoutTemplateInfo) new Gson().fromJson(jSONObjectOptJSONObject.toString(), LayoutTemplateInfo.class));
        }
        LogUtil.a("Suggestion_CourseWorkoutParse", "fitWorkout templateInfo: ", fitWorkout.getLayoutTemplateInfo());
        fitWorkout.setCommodityFlag(jSONObject.optInt("commodityFlag"));
        fitWorkout.setIsAi(jSONObject.optInt("isAi"));
        fitWorkout.setAuthResult(jSONObject.optInt("transactionStatus"));
        fitWorkout.setCornerImgDisplay(jSONObject.optInt("cornerImgDisplay"));
        fitWorkout.setBuyNotesTitle(jSONObject.optString("buyNotesTitle"));
        fitWorkout.setBuyNotesUrl(jSONObject.optString("buyNotesUrl"));
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("cornerList");
        if (jSONArrayOptJSONArray3 != null) {
            fitWorkout.setPriceTagBeanList(pcx.a(jSONArrayOptJSONArray3, PriceTagBean[].class));
        }
        fitWorkout.setPreviewVideoUrl(jSONObject.optString("previewVideoUrl"));
        fitWorkout.setSupplierLogoUrl(jSONObject.optString("supplierLogoUrl"));
        fitWorkout.setCategory(jSONObject.optInt("courseCategory", 0));
        fitWorkout.setCourseLibraryFlag(jSONObject.optInt("courseLibraryFlag"));
        fitWorkout.setCourseDefineType(jSONObject.optInt("userDefinedType"));
        fitWorkout.setAntiScreenRecording(jSONObject.optInt("antiScreenRecording"));
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("belongs");
        if (jSONArrayOptJSONArray4 != null) {
            fitWorkout.setBelongInfoList(pcx.a(jSONArrayOptJSONArray4, BelongInfo[].class));
        }
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("resourceType");
        if (jSONArrayOptJSONArray5 != null) {
            fitWorkout.setResourceTypeListToExtend(pcx.a(jSONArrayOptJSONArray5, ResourceType[].class));
        }
        fitWorkout.setTimbre(jSONObject.optString("timbre"));
        fitWorkout.setBackgroundMusic(jSONObject.optString("backgroundMusic"));
        fitWorkout.setCalorieStartTime(jSONObject.optInt("calorieStartTime"));
        return fitWorkout;
    }

    private static String d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("recommendCourses", str);
            jSONObject.putOpt("extendMap", str2);
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.e("Suggestion_CourseWorkoutParse", "toDetailInfoJson JSONException:", LogAnonymous.b(e));
            return null;
        }
    }
}
