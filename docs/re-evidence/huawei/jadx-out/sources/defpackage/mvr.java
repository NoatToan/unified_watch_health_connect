package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.DeviceDbForHomeCards;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.WorkoutTypeMapManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.jsoperation.JsUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mvr implements SampleSequenceAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess
    public HiHealthData onSampleSequenceAfterProcess(HiDataInsertOption hiDataInsertOption, HiHealthData hiHealthData, String str) {
        if (!c(hiHealthData)) {
            return hiHealthData;
        }
        String sequenceData = hiHealthData.getSequenceData();
        try {
            JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
            if (jSONObject.has(JsUtil.SUMMARIES_KEY)) {
                LogUtil.a("ThirdWorkoutSequenceAfterProcess", "summary data has summaries");
                jSONObject = jSONObject.getJSONObject(JsUtil.SUMMARIES_KEY);
            }
            LogUtil.a("ThirdWorkoutSequenceAfterProcess", "getMetaData result: ", jSONObject.toString());
            b(hiHealthData, jSONObject);
            LogUtil.a("ThirdWorkoutSequenceAfterProcess", "convertMetaData result: ", jSONObject.toString());
            hiHealthData.setMetaData(jSONObject.toString());
            if (TextUtils.isEmpty(sequenceData)) {
                hiHealthData.setSequenceData("{}");
                LogUtil.a("ThirdWorkoutSequenceAfterProcess", "detailData is null");
            } else {
                hiHealthData.setSequenceData(eeq.d(sequenceData));
                LogUtil.a("ThirdWorkoutSequenceAfterProcess", "detailData result: ", eeq.d(sequenceData));
            }
            DeviceDbForHomeCards.updateExerciseInsertTime(System.currentTimeMillis());
            return hiHealthData;
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_ThirdWorkout_ThirdWorkoutSequenceAfterProcess", "metadata jsonException");
            return hiHealthData;
        }
    }

    private boolean c(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            ReleaseLogUtil.e("BTSYNC_ThirdWorkout_ThirdWorkoutSequenceAfterProcess", "checkParameters hiHealthData is null");
            return false;
        }
        if (TextUtils.isEmpty(hiHealthData.getDeviceUuid())) {
            ReleaseLogUtil.e("BTSYNC_ThirdWorkout_ThirdWorkoutSequenceAfterProcess", "checkParameters deviceUuid isEmpty");
            return false;
        }
        if (TextUtils.isEmpty(hiHealthData.getMetaData())) {
            ReleaseLogUtil.e("BTSYNC_ThirdWorkout_ThirdWorkoutSequenceAfterProcess", "checkParameters metaData isEmpty");
            return false;
        }
        LogUtil.a("ThirdWorkoutSequenceAfterProcess", "metaData is ", hiHealthData.getMetaData());
        LogUtil.a("ThirdWorkoutSequenceAfterProcess", "detailData is ", hiHealthData.getSequenceData());
        return true;
    }

    private void b(HiHealthData hiHealthData, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("mapType")) {
                jSONObject.put("vendor", jSONObject.getInt("mapType") == 0 ? "AMAP" : "GOOGLE");
            }
            hiHealthData.setType(30001);
            if (jSONObject.has(BleConstants.SPORT_TYPE)) {
                int i = jSONObject.getInt(BleConstants.SPORT_TYPE);
                int workoutType = WorkoutTypeMapManager.getWorkoutType(i);
                if (workoutType != 0) {
                    i = workoutType;
                }
                hiHealthData.setSubType(i);
                jSONObject.put("chiefSportDataType", 1);
                jSONObject.put("trackType", nfo.d(ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "ThirdWorkoutSequenceAfterProcess")));
                if (jSONObject.has("totalTime")) {
                    jSONObject.put("totalTime", jSONObject.getLong("totalTime") * 1000);
                }
                JSONObject jSONObject2 = new JSONObject();
                b(jSONObject, jSONObject2, "packageName");
                b(jSONObject, jSONObject2, "appName");
                b(jSONObject, jSONObject2, "version");
                b(jSONObject, jSONObject2, "aerobicLoadPeak");
                b(jSONObject, jSONObject2, "anaerobicLoadPeak");
                b(jSONObject, jSONObject2, "loadPeakLevel");
                if (i == 129) {
                    b(jSONObject, jSONObject2, "avgShotSpeed");
                    b(jSONObject, jSONObject2, "shots");
                    b(jSONObject, jSONObject2, "maxContinuousRally");
                    b(jSONObject, jSONObject2, "forehandStroke");
                    b(jSONObject, jSONObject2, "backhandStroke");
                    b(jSONObject, jSONObject2, "smash");
                    b(jSONObject, jSONObject2, "highClear");
                    b(jSONObject, jSONObject2, "maxShotSpeed");
                    b(jSONObject, jSONObject2, "overhandStroke");
                    b(jSONObject, jSONObject2, "underhandStroke");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                } else if (i == 130) {
                    b(jSONObject, jSONObject2, "serve");
                    b(jSONObject, jSONObject2, "forehand");
                    b(jSONObject, jSONObject2, "forehandTopspin");
                    b(jSONObject, jSONObject2, "forehandFlat");
                    b(jSONObject, jSONObject2, "forehandBackspin");
                    b(jSONObject, jSONObject2, "forehandVolley");
                    b(jSONObject, jSONObject2, "backhand");
                    b(jSONObject, jSONObject2, "backhandTopspin");
                    b(jSONObject, jSONObject2, "backhandBackspin");
                    b(jSONObject, jSONObject2, "backhandVolley");
                    b(jSONObject, jSONObject2, "swingTimes");
                    b(jSONObject, jSONObject2, "maxContinuousRally");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                } else if (i == 140) {
                    b(jSONObject, jSONObject2, "finishedGroups");
                    b(jSONObject, jSONObject2, "trainingActionCount");
                    b(jSONObject, jSONObject2, "actionName");
                    b(jSONObject, jSONObject2, "totalTrainingVolume");
                    b(jSONObject, jSONObject2, "trainingVolume");
                    b(jSONObject, jSONObject2, "groupCount");
                    b(jSONObject, jSONObject2, "trainingWeight");
                    b(jSONObject, jSONObject2, "rpe");
                    b(jSONObject, jSONObject2, "groupTime");
                    b(jSONObject, jSONObject2, "groupRestingTime");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                } else if (i == 228) {
                    b(jSONObject, jSONObject2, "forehand");
                    b(jSONObject, jSONObject2, "backhand");
                    b(jSONObject, jSONObject2, "forehandDrop");
                    b(jSONObject, jSONObject2, "forehandBackspin");
                    b(jSONObject, jSONObject2, "forehandVolley");
                    b(jSONObject, jSONObject2, "forehandDrive");
                    b(jSONObject, jSONObject2, "backhandDrop");
                    b(jSONObject, jSONObject2, "backhandBackspin");
                    b(jSONObject, jSONObject2, "backhandVolley");
                    b(jSONObject, jSONObject2, "backhandDrive");
                    b(jSONObject, jSONObject2, "swingSpeed");
                    b(jSONObject, jSONObject2, "swingTimes");
                    b(jSONObject, jSONObject2, "maxContinuousRally");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                } else if (i == 261) {
                    b(jSONObject, jSONObject2, "floors");
                    b(jSONObject, jSONObject2, "stairs");
                    b(jSONObject, jSONObject2, "avgFloorSpeed");
                    b(jSONObject, jSONObject2, "segmentNum");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                    d(jSONObject, jSONObject, "elevationGain", "creepingWave");
                } else if (i == 270) {
                    b(jSONObject, jSONObject2, "jumpTimes");
                    b(jSONObject, jSONObject2, "maxJumpHeight");
                    b(jSONObject, jSONObject2, "sprintTimes");
                    b(jSONObject, jSONObject2, "maxAcceleration");
                    b(jSONObject, jSONObject2, "turnSpeedUpTimes");
                    b(jSONObject, jSONObject2, "swerveSpeedUpTimes");
                    b(jSONObject, jSONObject2, "playerPosition");
                    b(jSONObject, jSONObject2, "goalsTimes");
                    b(jSONObject, jSONObject2, "assistsTimes");
                    b(jSONObject, jSONObject2, "savesTimes");
                    b(jSONObject, jSONObject2, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
                }
                jSONObject.put(BleConstants.EXTEND_TRACK_DATA_MAP, jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                d(jSONObject, jSONObject3, "loadPeak", "load_peak");
                d(jSONObject, jSONObject3, "aerobicTrainingStress", "etraining_effect");
                d(jSONObject, jSONObject3, "anaerobicTrainingStress", "anaerobic_exercise_etraining_effect");
                d(jSONObject, jSONObject3, "recoveryTime", "recovery_time");
                jSONObject.put("wearSportData", jSONObject3);
            }
        } catch (JSONException e) {
            LogUtil.e("ThirdWorkoutSequenceAfterProcess", "parseMetaData error:", e.getMessage());
        }
    }

    private void b(JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        d(jSONObject, jSONObject2, str, null);
    }

    private void d(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) throws JSONException {
        if (jSONObject.has(str)) {
            if (TextUtils.isEmpty(str2)) {
                jSONObject2.put(str, jSONObject.get(str));
            } else {
                jSONObject2.put(str2, jSONObject.get(str));
            }
            jSONObject.remove(str);
        }
    }
}
