package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.LangFile;
import com.huawei.basefitnessadvice.model.TrainStatistics;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.pluginfitnessadvice.Cover;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import com.huawei.pluginfitnessadvice.Pictures;
import com.huawei.pluginfitnessadvice.TrainAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.tencent.connect.share.QzonePublish;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class gzq {
    public static List<LangFile> c(JSONObject jSONObject) {
        List<LangFile> arrayList = new ArrayList<>(10);
        if (jSONObject == null) {
            return arrayList;
        }
        String strOptString = jSONObject.optString("langfiles");
        if (!TextUtils.isEmpty(strOptString)) {
            arrayList = peh.c(strOptString, LangFile[].class);
        }
        LogUtil.a("Suggestion_DataFitnessConvert", "the langFileList size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static List<Attribute> e(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        return peh.c(jSONArray.toString(), Attribute[].class);
    }

    private static void d(List<Video> list, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Video video = new Video();
                video.saveId(jSONObjectOptJSONObject.optString("id"));
                video.saveName(jSONObjectOptJSONObject.optString("name"));
                video.saveType(jSONObjectOptJSONObject.optInt("type"));
                video.saveActionCount(jSONObjectOptJSONObject.optInt("actionCount"));
                video.saveDuring(jSONObjectOptJSONObject.optInt("during"));
                video.saveGender(jSONObjectOptJSONObject.optInt("sex"));
                video.saveLength(jSONObjectOptJSONObject.optInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE));
                video.saveThumbnail(jSONObjectOptJSONObject.optString("thumbnail"));
                video.saveUrl(jSONObjectOptJSONObject.optString("videoUrl"));
                video.saveLogoImgUrl(jSONObjectOptJSONObject.optString("logoImgUrl"));
                video.setIsLongVideo(jSONObjectOptJSONObject.optInt("isLongVideo"));
                video.setFileId(jSONObjectOptJSONObject.optString(RecommendConstants.FILE_ID));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("videoSegmentList");
                if (jSONArrayOptJSONArray != null) {
                    video.setVideoSegmentList(g(jSONArrayOptJSONArray));
                }
                list.add(video);
            }
        }
    }

    private static List<VideoSegment> g(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                VideoSegment videoSegment = new VideoSegment();
                videoSegment.setStartTime(jSONObjectOptJSONObject.optLong("startTime"));
                videoSegment.setEndTime(jSONObjectOptJSONObject.optLong("endTime"));
                videoSegment.setDuration(jSONObjectOptJSONObject.optInt("duration"));
                videoSegment.setThumbnail(jSONObjectOptJSONObject.optString("thumbnail"));
                arrayList.add(videoSegment);
            }
        }
        return arrayList;
    }

    public static List<WorkoutAction> e(JSONArray jSONArray, int i, int i2) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    WorkoutAction workoutAction = new WorkoutAction();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("playAudios");
                    if (jSONArrayOptJSONArray != null) {
                        workoutAction.saveCommentaryTraining(e(jSONArrayOptJSONArray, i));
                    }
                    a(jSONObjectOptJSONObject, workoutAction);
                    int iB = b(i, i2);
                    LogUtil.a("Suggestion_DataFitnessConvert", "DataFitnessConvert toWorkoutActions  gender: ", Integer.valueOf(iB));
                    if (iB == 0) {
                        workoutAction.saveCalorie((float) jSONObjectOptJSONObject.optDouble("calorieMan"));
                        workoutAction.saveDuration(jSONObjectOptJSONObject.optInt("durationMan"));
                    } else {
                        workoutAction.saveCalorie((float) jSONObjectOptJSONObject.optDouble("calorie"));
                        workoutAction.saveDuration(jSONObjectOptJSONObject.optInt("duration"));
                    }
                    AtomicAction atomicActionC = c(jSONObjectOptJSONObject, i, i2);
                    workoutAction.saveActionId(atomicActionC.getId());
                    workoutAction.saveAction(atomicActionC);
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("videos");
                    if (jSONArrayOptJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        d(arrayList2, jSONArrayOptJSONArray2);
                        workoutAction.saveVideos(arrayList2);
                    }
                    d(jSONObjectOptJSONObject, workoutAction);
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("pictures");
                    if (jSONArrayOptJSONArray3 != null) {
                        workoutAction.setPictures(i(jSONArrayOptJSONArray3));
                    }
                    arrayList.add(workoutAction);
                }
            }
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, WorkoutAction workoutAction) {
        Comment comment = new Comment();
        comment.saveName(jSONObject.optString("textPrompt"));
        comment.saveContent(jSONObject.optString("textPrompt"));
        workoutAction.saveCommentaryGap(new ArrayList(10));
        workoutAction.acquireCommentaryGap().add(comment);
        workoutAction.saveGroup(jSONObject.optInt(MessageConstant.GROUP_MEDAL_TYPE));
        workoutAction.saveGap(jSONObject.optInt("gap"));
        workoutAction.saveValue(jSONObject.optInt("repeatTimes"));
    }

    private static void d(JSONObject jSONObject, WorkoutAction workoutAction) {
        workoutAction.setActionStep(jSONObject.optString("actionStep"));
        workoutAction.setIntroduceLyric(jSONObject.optString("introduceLyric"));
        workoutAction.setBreath(jSONObject.optString("breath"));
        workoutAction.setFeeling(jSONObject.optString("feeling"));
        workoutAction.setCommonError(jSONObject.optString("commonError"));
    }

    private static List<Comment> e(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && (i != 1 || jSONObjectOptJSONObject.optInt("sex") == 1)) {
                Comment comment = new Comment();
                comment.saveId(jSONObjectOptJSONObject.optString("audioId"));
                comment.saveName(jSONObjectOptJSONObject.optString("audioUrl"));
                comment.saveTime(jSONObjectOptJSONObject.optInt("playTime"));
                comment.saveType(jSONObjectOptJSONObject.optInt("displayorder"));
                comment.saveLength(jSONObjectOptJSONObject.optInt("audioSize"));
                arrayList.add(comment);
            }
        }
        return arrayList;
    }

    public static List<WorkoutAction> e(JSONObject jSONObject, FitWorkout fitWorkout) {
        fitWorkout.saveRunActionNum(jSONObject.optInt("runActionNum"));
        fitWorkout.saveSequenceName(jSONObject.optString("sequenceName"));
        fitWorkout.saveSequenceStage(jSONObject.optString("sequenceStage"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("warmUpRunAction");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("runActionList");
        int iOptInt = jSONObject.optInt("repeatTimes", 1);
        fitWorkout.saveRepeatTimes(iOptInt);
        if (jSONObjectOptJSONObject != null) {
            WorkoutAction workoutAction = new WorkoutAction();
            e(jSONObjectOptJSONObject, workoutAction, fitWorkout.getType());
            fitWorkout.saveWarmUpRunAction(workoutAction);
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < iOptInt && jSONArrayOptJSONArray != null; i++) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                try {
                    d(jSONArrayOptJSONArray.getJSONObject(i2), arrayList, fitWorkout.getType());
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_DataFitnessConvert", "workoutRuntoWorkoutActions exception: ", LogAnonymous.b(e));
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("coolDownRunAction");
        if (jSONObjectOptJSONObject2 != null) {
            WorkoutAction workoutAction2 = new WorkoutAction();
            e(jSONObjectOptJSONObject2, workoutAction2, fitWorkout.getType());
            fitWorkout.saveCoolDownRunAction(workoutAction2);
        }
        return arrayList;
    }

    private static void d(JSONObject jSONObject, List<WorkoutAction> list, int i) {
        WorkoutAction workoutAction = new WorkoutAction();
        if (jSONObject != null) {
            e(jSONObject, workoutAction, i);
            list.add(workoutAction);
        }
    }

    private static void e(JSONObject jSONObject, WorkoutAction workoutAction, int i) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("playAudios");
        if (jSONArrayOptJSONArray != null) {
            workoutAction.saveCommentaryTraining(a(jSONArrayOptJSONArray, i));
        }
        e(jSONObject, workoutAction);
        if (jSONObject.isNull("treadmillSpeed")) {
            workoutAction.saveSpecifiedSpeed(0.0d);
        } else {
            workoutAction.saveSpecifiedSpeed(jSONObject.optDouble("treadmillSpeed"));
        }
        if (jSONObject.isNull("treadmillSlope")) {
            workoutAction.saveSpecifiedSlope(0.0d);
        } else {
            workoutAction.saveSpecifiedSlope(jSONObject.optDouble("treadmillSlope"));
        }
        b(jSONObject, workoutAction);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("actionMusic");
        if (jSONObjectOptJSONObject != null) {
            b(workoutAction, jSONObjectOptJSONObject);
        }
        workoutAction.saveAction(g(jSONObject));
    }

    private static void b(JSONObject jSONObject, WorkoutAction workoutAction) {
        workoutAction.saveGroup(jSONObject.optInt(MessageConstant.GROUP_MEDAL_TYPE, 1));
        workoutAction.saveActionId(jSONObject.optString("runActionId"));
        workoutAction.saveMeasurementType(jSONObject.optInt("measurementType"));
        workoutAction.saveMeasurementValue(jSONObject.optInt("measurementValue"));
        workoutAction.saveGap(jSONObject.optInt("restSecond"));
        workoutAction.saveTabloidPicUrl(jSONObject.optString("picture"));
    }

    private static void b(WorkoutAction workoutAction, JSONObject jSONObject) {
        Audio audio = new Audio();
        audio.saveUrl(jSONObject.optString("url"));
        audio.saveLength(jSONObject.optInt("length"));
        audio.setId("");
        audio.setDuring(0);
        audio.setIdentification("");
        audio.saveName("");
        audio.saveGender(0);
        workoutAction.setActionMusic(audio);
    }

    private static void e(JSONObject jSONObject, WorkoutAction workoutAction) {
        workoutAction.saveIntensityType(jSONObject.optInt("intensityType"));
        workoutAction.saveSpeedH(jSONObject.optInt("speedH"));
        workoutAction.saveSpeedL(jSONObject.optInt("speedL"));
        workoutAction.saveAbsoluteHeartRateH(jSONObject.optString("absoluteHeartRateH"));
        workoutAction.saveAbsoluteHeartRateL(jSONObject.optString("absoluteHeartRateL"));
        workoutAction.saveRelativeHeartRatePercentH(jSONObject.optInt("relativeHeartRatePercentH"));
        workoutAction.saveRelativeHeartRatePercentL(jSONObject.optInt("relativeHeartRatePercentL"));
        workoutAction.saveRelativeHeartRateRangeH(jSONObject.optInt("relativeHeartRateRangeH"));
        workoutAction.saveRelativeHeartRateRangeL(jSONObject.optInt("relativeHeartRateRangeL"));
        workoutAction.saveReserveHeartRatePercentH(jSONObject.optInt("heartRRH"));
        workoutAction.saveReserveHeartRatePercentL(jSONObject.optInt("heartRRL"));
        workoutAction.saveReserveHeartRateRangeH(jSONObject.optInt("heartRRIntervalH"));
        workoutAction.saveReserveHeartRateRangeL(jSONObject.optInt("heartRRIntervalL"));
        workoutAction.saveMaf180HeartRateBase(jSONObject.optInt("baseOfMAF180"));
        workoutAction.saveMaf180HeartRateRange(jSONObject.optInt("heartRIntervalofMAF180"));
    }

    private static List<Comment> a(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && (i != 1 || jSONObjectOptJSONObject.optInt("sex") == 1)) {
                Comment comment = new Comment();
                comment.saveId(jSONObjectOptJSONObject.optString("audioId"));
                comment.saveName(jSONObjectOptJSONObject.optString("audioUrl"));
                comment.saveType(jSONObjectOptJSONObject.optInt("displayorder"));
                comment.saveLength(jSONObjectOptJSONObject.optInt("audioSize"));
                comment.savePlayValue(jSONObjectOptJSONObject.optString("playValue"));
                comment.savePlayType(jSONObjectOptJSONObject.optString("playType"));
                arrayList.add(comment);
            }
        }
        return arrayList;
    }

    private static AtomicAction g(JSONObject jSONObject) {
        AtomicAction atomicAction = new AtomicAction();
        atomicAction.setId(jSONObject.optString("runActionId"));
        atomicAction.setName(jSONObject.optString("userRunActionName"));
        atomicAction.setDifficulty(jSONObject.optInt("difficulty"));
        atomicAction.setDefaultTargetType(jSONObject.optInt("measurementType"));
        atomicAction.putExtendProperty("frequency", jSONObject.optString("measurementValue"));
        atomicAction.putExtendProperty("logoImgUrl", jSONObject.optString("logoImgUrl"));
        ArrayList arrayList = new ArrayList(10);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("voicePrompt");
        LogUtil.d("Suggestion_DataFitnessConvert", "SingleRunActionInfo.VOICEPROMPT:", String.valueOf(jSONArrayOptJSONArray));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Audio audio = new Audio();
                    audio.saveUrl(jSONObjectOptJSONObject.optString("audioUrl"));
                    audio.saveName(jSONObjectOptJSONObject.optString("audioUrl"));
                    audio.saveGender(jSONObjectOptJSONObject.optInt("sex"));
                    audio.saveLength(jSONObjectOptJSONObject.optInt("audioSize"));
                    arrayList.add(audio);
                }
            }
        }
        atomicAction.putExtendProperty("audios", arrayList);
        List<Cover> arrayList2 = new ArrayList<>(10);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pictures");
        LogUtil.d("Suggestion_DataFitnessConvert", "pictureArray:", String.valueOf(jSONArrayOptJSONArray2));
        if (jSONArrayOptJSONArray2 != null) {
            LogUtil.d("Suggestion_DataFitnessConvert", "pictureArray:", String.valueOf(jSONArrayOptJSONArray2));
            StringBuffer stringBufferB = b(jSONArrayOptJSONArray2);
            List<Cover> listD = d(jSONArrayOptJSONArray2);
            atomicAction.setDescription(stringBufferB.toString());
            arrayList2 = listD;
        }
        atomicAction.setCovers(arrayList2);
        atomicAction.setEquipments(e(jSONObject.optJSONArray("equipments")));
        atomicAction.setTrainingPoints(e(jSONObject.optJSONArray("trainingPoints")));
        return atomicAction;
    }

    private static int b(int i, int i2) {
        int iE = ied.e();
        if (i == 1) {
            return i2 != 2 ? i2 : iE;
        }
        return 1;
    }

    private static AtomicAction c(JSONObject jSONObject, int i, int i2) {
        AtomicAction atomicAction = new AtomicAction();
        a(jSONObject, i, i2, atomicAction);
        atomicAction.putExtendProperty("frequency", jSONObject.optString("repeatTimes"));
        atomicAction.setActionSportType(jSONObject.optInt("measurement") + 1);
        atomicAction.setEquipments(e(jSONObject.optJSONArray("equipments")));
        atomicAction.setTrainingPoints(e(jSONObject.optJSONArray("trainingPoints")));
        ArrayList<Video> arrayList = new ArrayList(10);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("videos");
        if (jSONArrayOptJSONArray != null) {
            d(arrayList, jSONArrayOptJSONArray);
            if (arrayList.size() == 1) {
                d(arrayList, jSONArrayOptJSONArray);
            }
            for (Video video : arrayList) {
                if (video != null) {
                    video.saveIdentification("identification");
                }
            }
        }
        atomicAction.putExtendProperty("actionVideo", arrayList);
        ArrayList arrayList2 = new ArrayList(10);
        a(jSONObject, arrayList2);
        atomicAction.putExtendProperty("audios", arrayList2);
        List<Cover> arrayList3 = new ArrayList<>(10);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pictures");
        if (jSONArrayOptJSONArray2 != null) {
            StringBuffer stringBufferB = b(jSONArrayOptJSONArray2);
            List<Cover> listD = d(jSONArrayOptJSONArray2);
            atomicAction.setDescription(stringBufferB.toString());
            arrayList3 = listD;
        }
        atomicAction.setCovers(arrayList3);
        return atomicAction;
    }

    private static void a(JSONObject jSONObject, List<Audio> list) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("voicePrompt");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Audio audio = new Audio();
                    audio.saveUrl(jSONObjectOptJSONObject.optString("audioUrl"));
                    audio.saveName(jSONObjectOptJSONObject.optString("audioUrl"));
                    audio.saveGender(jSONObjectOptJSONObject.optInt("sex"));
                    audio.saveLength(jSONObjectOptJSONObject.optInt("audioSize"));
                    list.add(audio);
                }
            }
        }
    }

    private static void a(JSONObject jSONObject, int i, int i2, AtomicAction atomicAction) {
        atomicAction.saveId(jSONObject.optString("actionId"));
        atomicAction.saveName(jSONObject.optString("name"));
        int iB = b(i, i2);
        LogUtil.a("Suggestion_DataFitnessConvert", "DataFitnessConvert toAction gender: ", Integer.valueOf(iB));
        if (iB == 0) {
            atomicAction.setDifficulty(jSONObject.optInt("difficultyMan"));
        } else {
            atomicAction.setDifficulty(jSONObject.optInt("difficulty"));
        }
        atomicAction.setVersion(jSONObject.optString("version"));
    }

    public static TrainStatistics f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        TrainStatistics trainStatistics = new TrainStatistics();
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("userTrainStatisticsBean")) == null) {
            return trainStatistics;
        }
        trainStatistics.saveCalorie(jSONObjectOptJSONObject.optLong("calorie"));
        trainStatistics.saveDuration(jSONObjectOptJSONObject.optLong("duration"));
        trainStatistics.saveTotalTimes(jSONObjectOptJSONObject.optLong("totalTimes"));
        return trainStatistics;
    }

    public static PlanStatistics a(JSONObject jSONObject) {
        PlanStatistics planStatistics = new PlanStatistics();
        if (jSONObject == null) {
            return planStatistics;
        }
        planStatistics.saveCalorie(jSONObject.optLong("totalCalorie"));
        planStatistics.saveDuration(jSONObject.optLong("totalDuration"));
        planStatistics.setTotalDistance(jSONObject.optDouble(BleConstants.TOTAL_DISTANCE));
        planStatistics.saveTotalPlan(jSONObject.optInt("totalPlan"));
        return planStatistics;
    }

    public static List<PlanStatistics> e(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList(10);
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("userPlanStatisticsList")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    PlanStatistics planStatistics = new PlanStatistics();
                    planStatistics.saveType(jSONObjectOptJSONObject.optInt("type"));
                    if (planStatistics.acquireType() == 0) {
                        planStatistics.saveDuration(jSONObjectOptJSONObject.optLong("totalDuration"));
                        planStatistics.setTotalDistance(jSONObjectOptJSONObject.optDouble(BleConstants.TOTAL_DISTANCE));
                    } else {
                        planStatistics.saveDuration(jSONObjectOptJSONObject.optLong("totalDuration"));
                    }
                    planStatistics.saveCalorie(jSONObjectOptJSONObject.optLong("totalCalorie"));
                    planStatistics.saveTotalPlan(jSONObjectOptJSONObject.optInt("totalPlan"));
                    arrayList.add(planStatistics);
                }
            }
        }
        return arrayList;
    }

    public static TrainStatistics d(String str) {
        TrainStatistics trainStatistics = new TrainStatistics();
        if (!TextUtils.isEmpty(str)) {
            try {
                Map map = (Map) new Gson().fromJson(str, new TypeToken<Map<String, Long>>() { // from class: com.huawei.health.sport.model.data.DataFitnessConvert$1
                }.getType());
                if (map != null) {
                    Long l = (Long) map.get("calorie");
                    Long l2 = (Long) map.get("duration");
                    Long l3 = (Long) map.get("totalTimes");
                    if (l == null) {
                        l = 0L;
                    }
                    if (l2 == null) {
                        l2 = 0L;
                    }
                    if (l3 == null) {
                        l3 = 0L;
                    }
                    trainStatistics.saveCalorie(l.longValue());
                    trainStatistics.saveDuration(l2.longValue());
                    trainStatistics.saveTotalTimes(l3.longValue());
                    return trainStatistics;
                }
            } catch (JsonSyntaxException e) {
                LogUtil.e("Suggestion_DataFitnessConvert", "fromTrainStatisticsMap exception: ", LogAnonymous.b(e));
                return trainStatistics;
            }
        }
        return trainStatistics;
    }

    public static String c(TrainStatistics trainStatistics) {
        if (trainStatistics == null) {
            return null;
        }
        HashMap map = new HashMap(3);
        map.put("calorie", Long.valueOf(trainStatistics.acquireCalorie()));
        map.put("duration", Long.valueOf(trainStatistics.acquireDuration()));
        map.put("totalTimes", Long.valueOf(trainStatistics.acquireTotalTimes()));
        return new Gson().toJson(map);
    }

    public static String a(PlanStatistics planStatistics) {
        if (planStatistics == null) {
            return null;
        }
        HashMap map = new HashMap(5);
        map.put("totalCalorie", Long.valueOf(planStatistics.acquireCalorie()));
        map.put("totalDuration", Long.valueOf(planStatistics.acquireDuration()));
        map.put("totalPlan", Integer.valueOf(planStatistics.acquireTotalPlan()));
        map.put(BleConstants.TOTAL_DISTANCE, Double.valueOf(planStatistics.getTotalDistance()));
        map.put("type", Long.valueOf(planStatistics.acquireType()));
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();
        return gsonBuilder.create().toJson(map);
    }

    public static List<TrainAction> d(String str, JSONArray jSONArray) {
        try {
            LogUtil.a("Suggestion_DataFitnessConvert", "parseToTrainActions actionArray");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                TrainAction trainAction = new TrainAction();
                trainAction.saveUserId(str);
                trainAction.saveId(jSONObject.optString("actionId"));
                trainAction.saveName(jSONObject.optString("name"));
                trainAction.saveMotionType(d(jSONObject.optInt("measurement")));
                trainAction.saveDifficulty(jSONObject.getInt("difficulty"));
                List<Cover> arrayList2 = new ArrayList<>(10);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pictures");
                if (jSONArrayOptJSONArray != null) {
                    StringBuffer stringBufferB = b(jSONArrayOptJSONArray);
                    List<Cover> listD = d(jSONArrayOptJSONArray);
                    trainAction.saveDescription(stringBufferB.toString());
                    arrayList2 = listD;
                }
                trainAction.saveCovers(arrayList2);
                trainAction.saveEquipments(e(jSONObject.optJSONArray("equipments")));
                trainAction.saveTrainingpoints(e(jSONObject.optJSONArray("trainingPoints")));
                ArrayList arrayList3 = new ArrayList(10);
                d(arrayList3, jSONObject.getJSONArray("videos"));
                trainAction.saveVideos(arrayList3);
                trainAction.saveVersion(jSONObject.optString("version"));
                trainAction.saveModified(System.currentTimeMillis());
                arrayList.add(trainAction);
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("Suggestion_DataFitnessConvert", "parseToTrainActions exception", LogAnonymous.b(e));
            return null;
        }
    }

    public static List<AtomicAction> c(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList arrayList = new ArrayList(10);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AtomicAction atomicAction = new AtomicAction();
                    atomicAction.setId(jSONObject.optString("actionId"));
                    atomicAction.saveName(jSONObject.optString("name"));
                    atomicAction.setVersion(jSONObject.optString("version"));
                    ArrayList arrayList2 = new ArrayList(10);
                    d(arrayList2, jSONObject.optJSONArray("actionVideo"));
                    atomicAction.putExtendProperty("actionVideo", arrayList2);
                    atomicAction.setTrainingPoints(j(jSONObject.optJSONArray("trainingPoints")));
                    atomicAction.putExtendProperty("actionStep", jSONObject.optString("actionStep"));
                    atomicAction.putExtendProperty("breath", jSONObject.optString("breath"));
                    atomicAction.putExtendProperty("calorie", jSONObject.optString("calorie"));
                    atomicAction.putExtendProperty("commonError", jSONObject.optString("commonError"));
                    atomicAction.putExtendProperty("feeling", jSONObject.optString("feeling"));
                    atomicAction.putExtendProperty("introduceLyric", jSONObject.optString("introduceLyric"));
                    atomicAction.setShowInActionLibrary(jSONObject.optInt("showInActionLibrary"));
                    arrayList.add(atomicAction);
                }
                return arrayList;
            } catch (JSONException e) {
                LogUtil.e("Suggestion_DataFitnessConvert", "parseToFitnessActionList exception", LogAnonymous.b(e));
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static List<AtomicAction> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AtomicAction atomicAction = new AtomicAction();
                    atomicAction.setId(jSONObject.optString("actionId"));
                    atomicAction.saveName(jSONObject.optString("name"));
                    atomicAction.setDescription(jSONObject.optString("actionDesc"));
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_DataFitnessConvert", "parseToCustomActionList exception", LogAnonymous.b(e));
                }
            }
        }
        return arrayList;
    }

    public static AtomicAction d(JSONObject jSONObject) {
        AtomicAction atomicAction = new AtomicAction();
        if (jSONObject != null) {
            atomicAction.setId(jSONObject.optString("actionId"));
            atomicAction.setName(jSONObject.optString("name"));
            atomicAction.setVersion(jSONObject.optString("version"));
            ArrayList arrayList = new ArrayList(10);
            d(arrayList, jSONObject.optJSONArray("actionVideo"));
            atomicAction.putExtendProperty("actionVideo", arrayList);
            atomicAction.putExtendProperty("actionStep", jSONObject.optString("actionStep"));
            atomicAction.setTrainingPoints(j(jSONObject.optJSONArray("trainingPoints")));
            atomicAction.putExtendProperty("pictures", i(jSONObject.optJSONArray("pictures")));
            atomicAction.setDifficulty(jSONObject.optInt("difficulty"));
            atomicAction.putExtendProperty("breath", jSONObject.optString("breath"));
            atomicAction.putExtendProperty("calorie", jSONObject.optString("calorie"));
            atomicAction.putExtendProperty("commonError", jSONObject.optString("commonError"));
            atomicAction.putExtendProperty("feeling", jSONObject.optString("feeling"));
            atomicAction.putExtendProperty("introduceLyric", jSONObject.optString("introduceLyric"));
            atomicAction.setShowInActionLibrary(jSONObject.optInt("showInActionLibrary"));
            atomicAction.putExtendProperty("aiFlag", jSONObject.optString("aiFlag"));
            atomicAction.putExtendProperty("completeTimes", jSONObject.optString("completeTimes"));
            atomicAction.putExtendProperty("aiMeasurement", jSONObject.optString("aiMeasurement"));
            atomicAction.putExtendProperty("duration", String.valueOf(jSONObject.optLong("duration")));
        }
        return atomicAction;
    }

    private static List<Attribute> j(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("id");
                    String string2 = jSONObject.getString("name");
                    Attribute attribute = new Attribute();
                    attribute.saveId(string);
                    attribute.saveName(string2);
                    arrayList.add(attribute);
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_DataFitnessConvert", "parseToFitnessActions exception", LogAnonymous.b(e));
                }
            }
        }
        return arrayList;
    }

    private static List<Pictures> i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String strOptString = jSONObject.optString("backMusclePicUrl");
                    String strOptString2 = jSONObject.optString("displayorder");
                    String strOptString3 = jSONObject.optString("frontMusclePicUrl");
                    String strOptString4 = jSONObject.optString("sex");
                    String strOptString5 = jSONObject.optString("sexId");
                    Pictures pictures = new Pictures();
                    pictures.setBackMusclePicUrl(strOptString);
                    pictures.setDisplayorder(strOptString2);
                    pictures.setFrontMusclePicUrl(strOptString3);
                    pictures.setSex(strOptString4);
                    pictures.setSexId(strOptString5);
                    arrayList.add(pictures);
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_DataFitnessConvert", "toPictures exception", LogAnonymous.b(e));
                }
            }
        }
        return arrayList;
    }

    private static StringBuffer b(JSONArray jSONArray) {
        StringBuffer stringBuffer = new StringBuffer();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && i == 0) {
                    stringBuffer.append(jSONObjectOptJSONObject.optString("imageDesc"));
                }
            }
        }
        return stringBuffer;
    }

    private static List<Cover> d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Cover cover = new Cover();
                    cover.saveUrl(jSONObjectOptJSONObject.optString("imageUrl"));
                    cover.saveGender(jSONObjectOptJSONObject.optInt("sex"));
                    arrayList.add(cover);
                }
            }
        }
        return arrayList;
    }

    public static int a() {
        return Utils.o() ? 204 : 4;
    }

    public static LongVideoInfo b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LongVideoInfo longVideoInfo = new LongVideoInfo();
        longVideoInfo.setUrl(jSONObject.optString("url"));
        longVideoInfo.setSubtitlesUrl(jSONObject.optString("subtitlesUrl"));
        longVideoInfo.setResultCode(jSONObject.optInt("resultCode"));
        longVideoInfo.setResultDesc(jSONObject.optString("resultDesc"));
        return longVideoInfo;
    }

    public static String d(int i) {
        if (i == 1) {
            return "beating";
        }
        if (i == 2) {
            return "timer";
        }
        return "hotbody";
    }
}
