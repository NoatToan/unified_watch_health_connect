package com.huawei.health.healthlife.constant;

import com.huawei.health.servicesapi.R;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
public enum WearTaskEnum {
    TASK_STEP("T100110", 2, R.string.IDS_settings_steps, 1),
    TASK_INTENSITY("T100210", 3, R.string.IDS_active_workout, 1),
    TASK_RELAXATION("T121610", 5, R.string.IDS_stress_relax, 2),
    TASK_WAKEUP_TIME("T120310", 6, R.string.IDS_regular_wake_up, 3),
    TASK_BED_TIME("T120410", 7, R.string.IDS_regular_bedtime, 3),
    TASK_DRINK_WATER("T120610", 10, R.string.IDS_drink_water_new, 4),
    TASK_TAKE_MEDICINE("T120910", 11, R.string.IDS_medicine, 0),
    TASK_BLOOD_PRESS_MEASURE("T121010", 12, R.string.IDS_blood_pressure_measure_new, 0),
    WEIGHT_MEASURE("T121110", 14, R.string.IDS_measure_weight, 0),
    TASK_ACTIVE_CALORIE("T100310", 15, R.string.IDS_active_caloric, 1),
    TASK_ACTIVE_HOUR("T100410", 16, R.string.IDS_active_hours, 1),
    TASK_DIETARY_CALORIE("T121310", 17, R.string.IDS_diet_caloric, 4),
    TASK_SLEEP_DURATION("T121410", 18, R.string.IDS_sleep_duration_today, 3),
    TASK_PRESSURE("T121510", 19, R.string.IDS_stress_mean, 2);

    private static final String TAG = "WearTaskEnum";
    private final String mTaskId;
    private final int mTaskNameResId;
    private final int mTaskType;
    private final int mWearTaskId;

    WearTaskEnum(String str, int i, int i2, int i3) {
        this.mTaskId = str;
        this.mWearTaskId = i;
        this.mTaskNameResId = i2;
        this.mTaskType = i3;
    }

    private String getTargetId() {
        return this.mTaskId;
    }

    private int getWearTaskId() {
        return this.mWearTaskId;
    }

    private int getTaskNameResId() {
        return this.mTaskNameResId;
    }

    private int getTaskType() {
        return this.mTaskType;
    }

    public static int getWearTaskIdByCloudId(String str) {
        for (WearTaskEnum wearTaskEnum : values()) {
            if (wearTaskEnum != null && wearTaskEnum.getTargetId() != null && wearTaskEnum.getTargetId().equals(str)) {
                return wearTaskEnum.getWearTaskId();
            }
        }
        return 0;
    }

    public static boolean isHasTaskId(int i) {
        for (WearTaskEnum wearTaskEnum : values()) {
            if (wearTaskEnum != null && wearTaskEnum.getWearTaskId() == i) {
                return true;
            }
        }
        return false;
    }

    public static String getTaskNameByTaskId(String str) {
        for (WearTaskEnum wearTaskEnum : values()) {
            if (wearTaskEnum != null && wearTaskEnum.getTargetId() != null && wearTaskEnum.getTargetId().equals(str)) {
                int taskNameResId = wearTaskEnum.getTaskNameResId();
                String strF = qre.f(taskNameResId);
                LogUtil.b(TAG, "getTaskNameByTaskId cloudTaskId ", str, " taskNameResId ", Integer.valueOf(taskNameResId), " taskName ", strF, " language ", CommonUtil.u());
                return strF;
            }
        }
        return "";
    }

    public static int getTaskTypeByTaskId(String str, boolean z) {
        for (WearTaskEnum wearTaskEnum : values()) {
            if (wearTaskEnum != null && wearTaskEnum.getTargetId() != null) {
                if (!z && !isDefaultBasicTask(str)) {
                    return 0;
                }
                if (wearTaskEnum.getTargetId().equals(str)) {
                    return wearTaskEnum.getTaskType();
                }
            }
        }
        return 0;
    }

    private static boolean isDefaultBasicTask(String str) {
        return "T120310".equals(str) || "T100110".equals(str) || "T121610".equals(str) || "T100210".equals(str);
    }
}
