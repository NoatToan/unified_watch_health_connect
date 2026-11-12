package com.xiaomi.hm.health.dataprocess;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.le;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class StepsInfo implements Serializable {
    public static final int ALGOLIB_FLASH_ERROR = 3;
    public static final int ALGOLIB_SLEEP_MALLOC_FAILURE = 2;
    public static final int ALGOLIB_STEP_MALLOC_FAILURE = 1;
    public static final int ALGOLIB_SUCCESS = 0;
    public static final String KEY_ACTIVITY_LIST = "actives";
    public static final String KEY_CALORIES = "cal";
    public static final String KEY_DISTANCE = "dis";
    public static final String KEY_NEW_CALORIES = "ncal";
    public static final String KEY_STAGE = "stage";
    public static final String KEY_STEPS = "ttl";
    public static final String KEY_STEP_INFO = "stp";
    public static final String KEY_STEP_RUN_CALORIES = "runCal";
    public static final String KEY_STEP_RUN_DISTANCE = "runDist";
    public static final String KEY_STEP_RUN_TIME = "rn";
    public static final String KEY_STEP_WALK_TIME = "wk";
    private static final String TAG = "StepsInfo";
    private SportDay sDay;
    private int steps = 0;
    private int time = 0;
    private int runtime = 0;
    private int distance = 0;
    private int runDistance = 0;
    private int walkDistance = 0;
    private int calories = 0;
    private int runCalories = 0;
    private int walkCalories = 0;
    private int forefootSteps = 0;
    private int mifitSteps = 0;
    private int mifitDistance = 0;
    private int mifitRunDistance = 0;
    private int mifitWalkDistance = 0;
    private int mifitCalories = 0;
    private int mifitNewCalories = 0;
    private int mifitRunCalories = 0;
    private int mifitWalkCalories = 0;
    private int basalCalories = 0;
    private int defaultDailyCaloriesGoal = 0;
    private boolean isCalorieIncludeSport = false;
    private ArrayList<StageSteps> stageSteps = new ArrayList<>();
    private int activeMinutes = 0;
    private int continusActive = 0;
    private ArrayList<ActiveItem> activeList = new ArrayList<>();
    private ArrayList<ActiveItem> fullActiveList = new ArrayList<>();
    private int statusCode = 0;

    public StepsInfo() {
        this.sDay = null;
        this.sDay = new SportDay();
    }

    public void clear() {
        this.steps = 0;
        this.time = 0;
        this.runtime = 0;
        this.distance = 0;
        this.runDistance = 0;
        this.walkDistance = 0;
        this.calories = 0;
        this.runCalories = 0;
        this.walkCalories = 0;
        this.forefootSteps = 0;
        this.mifitSteps = 0;
        this.mifitDistance = 0;
        this.mifitRunDistance = 0;
        this.mifitWalkDistance = 0;
        this.mifitCalories = 0;
        this.mifitNewCalories = 0;
        this.mifitRunCalories = 0;
        this.mifitWalkCalories = 0;
        this.basalCalories = 0;
        this.defaultDailyCaloriesGoal = 0;
        this.stageSteps.clear();
        this.activeList.clear();
        this.fullActiveList.clear();
        this.activeMinutes = 0;
        this.continusActive = 0;
    }

    public void copy(StepsInfo stepsInfo) {
        this.steps = stepsInfo.steps;
        this.time = stepsInfo.time;
        this.runtime = stepsInfo.runtime;
        this.distance = stepsInfo.distance;
        this.runDistance = stepsInfo.runDistance;
        this.walkDistance = stepsInfo.walkDistance;
        this.calories = stepsInfo.calories;
        this.runCalories = stepsInfo.runCalories;
        this.walkCalories = stepsInfo.walkCalories;
        this.activeMinutes = stepsInfo.activeMinutes;
        this.continusActive = stepsInfo.continusActive;
        this.forefootSteps = stepsInfo.forefootSteps;
        this.mifitSteps = stepsInfo.mifitSteps;
        this.mifitDistance = stepsInfo.mifitDistance;
        this.mifitRunDistance = stepsInfo.mifitRunDistance;
        this.mifitWalkDistance = stepsInfo.mifitWalkDistance;
        this.mifitCalories = stepsInfo.mifitCalories;
        this.mifitRunCalories = stepsInfo.mifitRunCalories;
        this.mifitWalkCalories = stepsInfo.mifitWalkCalories;
        this.statusCode = stepsInfo.statusCode;
        this.stageSteps.clear();
        this.stageSteps.addAll(stepsInfo.stageSteps);
        this.activeList.clear();
        this.activeList.addAll(stepsInfo.activeList);
        this.fullActiveList.clear();
        this.fullActiveList.addAll(stepsInfo.fullActiveList);
    }

    public int getActMinutes() {
        return this.activeMinutes;
    }

    public ArrayList<ActiveItem> getActiveList() {
        return this.activeList;
    }

    public int getCalories() {
        int i = this.mifitNewCalories;
        int i2 = this.mifitCalories;
        return i > i2 ? i : i2;
    }

    public int getContinuesActive() {
        return this.continusActive;
    }

    public int getDistance() {
        return this.mifitDistance;
    }

    public ArrayList<ActiveItem> getFullActiveList() {
        return this.fullActiveList;
    }

    public int getMifitNewCalories() {
        return this.mifitNewCalories;
    }

    public int getRunCalories() {
        return this.mifitRunCalories;
    }

    public int getRunDistance() {
        return this.mifitRunDistance;
    }

    public int getRunTimeCount() {
        return this.runtime;
    }

    public SportDay getSportDay() {
        return this.sDay;
    }

    public String getStageStepSummaryJson() {
        JSONException e;
        JSONArray jSONArray;
        ArrayList<StageSteps> arrayList = this.stageSteps;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        try {
            jSONArray = new JSONArray();
            try {
                for (StageSteps stageSteps : this.stageSteps) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", stageSteps.time);
                    jSONObject.put("count", stageSteps.count);
                    jSONObject.put(KEY_DISTANCE, stageSteps.distance);
                    jSONObject.put(KEY_CALORIES, stageSteps.cal);
                    jSONObject.put("step", stageSteps.steps);
                    jSONArray.put(jSONObject);
                }
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (JSONException e3) {
            e = e3;
            jSONArray = null;
        }
        return jSONArray.toString();
    }

    public ArrayList<StageSteps> getStageSteps() {
        return this.stageSteps;
    }

    public int getStepsCount() {
        return this.mifitSteps;
    }

    public int getStepsTimeCount() {
        return this.time;
    }

    public JSONObject getSummaryJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_STEPS, this.mifitSteps);
            jSONObject.put(KEY_DISTANCE, this.mifitDistance);
            jSONObject.put(KEY_CALORIES, this.mifitCalories);
            int i = this.mifitNewCalories;
            if (i > 0) {
                jSONObject.put(KEY_NEW_CALORIES, i);
            }
            jSONObject.put(KEY_STEP_WALK_TIME, this.time);
            jSONObject.put("rn", this.runtime);
            jSONObject.put(KEY_STEP_RUN_DISTANCE, this.mifitRunDistance);
            jSONObject.put(KEY_STEP_RUN_CALORIES, this.mifitRunCalories);
            if (!this.activeList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (ActiveItem activeItem : this.activeList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StatConstants.PARAM_START, activeItem.start);
                    jSONObject2.put(BroadcastsKt.SILENT_PUSHING_STOP, activeItem.stop);
                    jSONObject2.put("mode", activeItem.mode);
                    jSONObject2.put(KEY_DISTANCE, activeItem.distance);
                    jSONObject2.put(KEY_CALORIES, activeItem.calories);
                    jSONObject2.put("step", activeItem.steps);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(KEY_STAGE, jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public int getWalkCalories() {
        return this.mifitWalkCalories;
    }

    public int getWalkDistance() {
        return this.walkDistance;
    }

    public int getforefootSteps() {
        return this.forefootSteps;
    }

    public boolean isCalorieIncludeSport() {
        return this.isCalorieIncludeSport;
    }

    public void setActMinutes(int i) {
        this.activeMinutes = i;
    }

    public void setActiveList(ArrayList<ActiveItem> arrayList) {
        this.activeList.clear();
        this.activeList.addAll(arrayList);
    }

    public void setCalories(int i) {
        this.mifitCalories = i;
    }

    public void setContinuesActive(int i) {
        this.continusActive = i;
    }

    public void setDistance(int i) {
        this.mifitDistance = i;
    }

    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, ArrayList<StageSteps> arrayList, ArrayList<ActiveItem> arrayList2, ArrayList<ActiveItem> arrayList3, int i20, int i21) {
        this.steps = i;
        this.time = i2;
        this.runtime = i3;
        this.distance = i4;
        this.runDistance = i5;
        this.walkDistance = i6;
        this.calories = i7;
        this.runCalories = i8;
        this.walkCalories = i9;
        this.activeMinutes = i11;
        this.continusActive = i19;
        this.stageSteps = arrayList;
        this.activeList = arrayList2;
        this.fullActiveList = arrayList3;
        this.mifitSteps = i12;
        this.mifitDistance = i13;
        this.mifitRunDistance = i14;
        this.mifitWalkDistance = i15;
        this.mifitCalories = i16;
        this.mifitRunCalories = i17;
        this.mifitWalkCalories = i18;
        this.statusCode = i20;
        this.isCalorieIncludeSport = i21 == 1;
    }

    public void setMifitNewCalories(int i) {
        this.mifitNewCalories = i;
    }

    public void setRunCalories(int i) {
        this.mifitRunCalories = i;
    }

    public void setRunDistance(int i) {
        this.mifitRunDistance = i;
    }

    public void setRunTimeCount(int i) {
        this.runtime = i;
    }

    public void setSportDay(SportDay sportDay) {
        this.sDay = sportDay;
    }

    public void setStageSteps(ArrayList<StageSteps> arrayList) {
        this.stageSteps.clear();
        this.stageSteps.addAll(arrayList);
    }

    public void setStepsCount(int i) {
        this.mifitSteps = i;
    }

    public void setStepsTimeCount(int i) {
        this.time = i;
    }

    public void setWalkCalories(int i) {
        this.mifitWalkCalories = i;
    }

    public void setWalkDistance(int i) {
        this.walkDistance = i;
    }

    public void setforefootSteps(int i) {
        this.forefootSteps = i;
    }

    public String toString() {
        return "\nBaseStepsInfo:,steps:" + this.mifitSteps + ",time:" + this.time + ",runtime:" + this.runtime + ",distance:" + this.distance + ",runDistance:" + this.runDistance + ",walkDistance:" + this.mifitWalkDistance + ",calories:" + this.mifitCalories + ",new calories:" + this.mifitNewCalories + ",runCalories:" + this.runCalories + ",walkCalories:" + this.walkCalories + ",activeMinutes:" + this.activeMinutes + ",continusActive:" + this.continusActive + ",isCalorieIncludeSport:" + this.isCalorieIncludeSport + ",activeList:" + this.activeList.size() + ",fullActiveList:" + this.fullActiveList.size() + ",statusCode:" + this.statusCode;
    }

    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, ArrayList<StageSteps> arrayList, ArrayList<ActiveItem> arrayList2) {
        this.steps = i;
        this.time = i2;
        this.runtime = i3;
        this.distance = i4;
        this.runDistance = i5;
        this.walkDistance = i6;
        this.calories = i7;
        this.runCalories = i8;
        this.walkCalories = i9;
        this.activeMinutes = i11;
        this.continusActive = i19;
        this.stageSteps = arrayList;
        this.activeList = arrayList2;
        this.mifitSteps = i12;
        this.mifitDistance = i13;
        this.mifitRunDistance = i14;
        this.mifitWalkDistance = i15;
        this.mifitCalories = i16;
        this.mifitRunCalories = i17;
        this.mifitWalkCalories = i18;
        le.c(TAG, toString(), new Object[0]);
    }

    public StepsInfo(SportDay sportDay) {
        this.sDay = null;
        this.sDay = sportDay;
    }
}
