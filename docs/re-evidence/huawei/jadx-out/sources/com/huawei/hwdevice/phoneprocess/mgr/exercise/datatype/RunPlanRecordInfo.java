package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class RunPlanRecordInfo {

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_ALG_TYPE)
    private int runPlanAlgType = 0;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ACHIEVE_PERCENT)
    private int runPlanRecordAchievePercent;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ETRAINING_EFFECT)
    private int runPlanRecordEtrainingEffect;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CALORIE)
    private int runPlanRecordInfoCalorie;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CLIMB)
    private int runPlanRecordInfoClimb;

    @SerializedName("run_plan_record_info_daily_score")
    private int runPlanRecordInfoDailyScore;

    @SerializedName("run_plan_record_info_date_info")
    private int runPlanRecordInfoDateInfo;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_DISTANCE)
    private int runPlanRecordInfoDistance;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_END_TIME)
    private long runPlanRecordInfoEndTime;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_EPOC)
    private int runPlanRecordInfoEpoc;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_DURATION)
    private long runPlanRecordInfoExerciseDuration;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MAX_HEART_RATE)
    private int runPlanRecordInfoHrabsMax;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MIN_HEART_RATE)
    private int runPlanRecordInfoHrabsMin;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID)
    private int runPlanRecordInfoId;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_LOAD_PEAK)
    private int runPlanRecordInfoLoadPeak;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_MAX_MET)
    private int runPlanRecordInfoMaxMet;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_RECOVERY_TIME)
    private int runPlanRecordInfoRecoveryTime;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_SPEED)
    private float runPlanRecordInfoSpeed;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_START_TIME)
    private long runPlanRecordInfoStartTime;

    @SerializedName(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_STATUS)
    private int runPlanRecordInfoStatus;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_STEP)
    private int runPlanRecordInfoStep;

    @SerializedName("run_plan_record_info_total_time")
    private int runPlanRecordInfoTotalTime;

    @SerializedName("run_plan_record_info_wourkout_id")
    private int runPlanRecordInfoWourkoutId;

    public int getRunPlanRecordInfoId() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoId))).intValue();
    }

    public void setRunPlanRecordInfoId(int i) {
        this.runPlanRecordInfoId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoWourkoutId() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoWourkoutId))).intValue();
    }

    public void setRunPlanRecordInfoWourkoutId(int i) {
        this.runPlanRecordInfoWourkoutId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoStatus() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoStatus))).intValue();
    }

    public void setRunPlanRecordInfoStatus(int i) {
        this.runPlanRecordInfoStatus = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getRunPlanRecordInfoStartTime() {
        return ((Long) lst.d(Long.valueOf(this.runPlanRecordInfoStartTime))).longValue();
    }

    public void setRunPlanRecordInfoStartTime(long j) {
        this.runPlanRecordInfoStartTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getRunPlanRecordInfoEndTime() {
        return ((Long) lst.d(Long.valueOf(this.runPlanRecordInfoEndTime))).longValue();
    }

    public void setRunPlanRecordInfoEndTime(long j) {
        this.runPlanRecordInfoEndTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getRunPlanRecordInfoCalorie() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoCalorie))).intValue();
    }

    public void setRunPlanRecordInfoCalorie(int i) {
        this.runPlanRecordInfoCalorie = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoDistance))).intValue();
    }

    public void setRunPlanRecordInfoDistance(int i) {
        this.runPlanRecordInfoDistance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoStep() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoStep))).intValue();
    }

    public void setRunPlanRecordInfoStep(int i) {
        this.runPlanRecordInfoStep = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoTotalTime() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoTotalTime))).intValue();
    }

    public void setRunPlanRecordInfoTotalTime(int i) {
        this.runPlanRecordInfoTotalTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public float getRunPlanRecordInfoSpeed() {
        return ((Float) lst.d(Float.valueOf(this.runPlanRecordInfoSpeed))).floatValue();
    }

    public void setRunPlanRecordInfoSpeed(float f) {
        this.runPlanRecordInfoSpeed = ((Float) lst.d(Float.valueOf(f))).floatValue();
    }

    public int getRunPlanRecordInfoClimb() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoClimb))).intValue();
    }

    public void setRunPlanRecordInfoClimb(int i) {
        this.runPlanRecordInfoClimb = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoHrabsMin() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoHrabsMin))).intValue();
    }

    public void setRunPlanRecordInfoHrabsMin(int i) {
        this.runPlanRecordInfoHrabsMin = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoHrabsMax() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoHrabsMax))).intValue();
    }

    public void setRunPlanRecordInfoHrabsMax(int i) {
        this.runPlanRecordInfoHrabsMax = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoLoadPeak() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoLoadPeak))).intValue();
    }

    public void setRunPlanRecordInfoLoadPeak(int i) {
        this.runPlanRecordInfoLoadPeak = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordEtrainingEffect() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordEtrainingEffect))).intValue();
    }

    public void setRunPlanRecordEtrainingEffect(int i) {
        this.runPlanRecordEtrainingEffect = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordAchievePercent() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordAchievePercent))).intValue();
    }

    public void setRunPlanRecordAchievePercent(int i) {
        this.runPlanRecordAchievePercent = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoEpoc() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoEpoc))).intValue();
    }

    public void setRunPlanRecordInfoEpoc(int i) {
        this.runPlanRecordInfoEpoc = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoMaxMet() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoMaxMet))).intValue();
    }

    public void setRunPlanRecordInfoMaxMet(int i) {
        this.runPlanRecordInfoMaxMet = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoRecoveryTime() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoRecoveryTime))).intValue();
    }

    public void setRunPlanRecordInfoRecoveryTime(int i) {
        this.runPlanRecordInfoRecoveryTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanRecordInfoDailyScore() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoDailyScore))).intValue();
    }

    public void setRunPlanRecordInfoDailyScore(int i) {
        this.runPlanRecordInfoDailyScore = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getRunPlanRecordInfoExerciseDuration() {
        return ((Long) lst.d(Long.valueOf(this.runPlanRecordInfoExerciseDuration))).longValue();
    }

    public void setRunPlanRecordInfoExerciseDuration(long j) {
        this.runPlanRecordInfoExerciseDuration = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getRunPlanRecordInfoDateInfo() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordInfoDateInfo))).intValue();
    }

    public void setRunPlanRecordInfoDateInfo(int i) {
        this.runPlanRecordInfoDateInfo = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanAlgType() {
        return this.runPlanAlgType;
    }

    public void setRunPlanAlgType(int i) {
        this.runPlanAlgType = i;
    }
}
