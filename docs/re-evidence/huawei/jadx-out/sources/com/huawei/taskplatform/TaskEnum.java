package com.huawei.taskplatform;

import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public enum TaskEnum {
    ACTIVITY_CALORIES("T100310", 10017, "900200007"),
    ACTIVITY_HOURS("T100410", 10002, "900200009"),
    EXERCISE_DURATION("T100210", 10001, "900200008"),
    STEPS("T100110", 10006, "900200006"),
    SLEEP_DURATION("T121410", PrebakedEffectId.RT_SPEED_UP, "900300052", "sleepDurationGoal"),
    BEDTIME("T120410", 10010, "900300052", "sleepEarlyGoal"),
    WAKEUP_TIME("T120310", 10011, "900300052", "getUpRegularlyGoal"),
    AVG_DAILY_PRESSURE("T121510", 10024, "900300053", "pressureAvgGoal"),
    DECOMP_AND_RELAX("T121610", PrebakedEffectId.RT_ASSAULT_RIFLE, "900300053", "relaxationGoal"),
    DRINK_WATER("T120610", 10013, "900300054", "drinkingWaterGoal"),
    CALORIES_INTAKE("T121310", PrebakedEffectId.RT_DRAWING_ARROW, "900300054", "calorieIntakeGoal"),
    TAKE_MEDICINE("T120910", 10009),
    BLOOD_PRESS_MEASURE("T121010", 10032),
    WEIGHT_MEASURE("T121110", 10029);

    private static final Map<String, TaskEnum> TASK_ID_MAP = new HashMap();
    private String mConfigId;
    private String mConfigKey;
    private final int mTaskCategory;
    private final String mTaskId;
    private final int mTaskType;

    static {
        for (TaskEnum taskEnum : values()) {
            TASK_ID_MAP.put(taskEnum.getTaskId(), taskEnum);
        }
    }

    TaskEnum(String str, int i) {
        this.mTaskId = str;
        this.mTaskType = i;
        this.mTaskCategory = 3;
    }

    TaskEnum(String str, int i, String str2) {
        this.mTaskId = str;
        this.mTaskType = i;
        this.mConfigId = str2;
        this.mTaskCategory = 3;
    }

    TaskEnum(String str, int i, String str2, String str3) {
        this.mTaskId = str;
        this.mTaskType = i;
        this.mConfigId = str2;
        this.mConfigKey = str3;
        this.mTaskCategory = 3;
    }

    TaskEnum(String str, int i, int i2) {
        this.mTaskId = str;
        this.mTaskType = i;
        this.mTaskCategory = i2;
    }

    public String getTaskId() {
        return this.mTaskId;
    }

    public int getTaskType() {
        return this.mTaskType;
    }

    public int getTaskCategory() {
        return this.mTaskCategory;
    }

    public String getConfigKey() {
        return this.mConfigKey;
    }

    public String getConfigId() {
        return this.mConfigId;
    }

    public static TaskEnum fromTaskId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TASK_ID_MAP.get(str);
    }
}
