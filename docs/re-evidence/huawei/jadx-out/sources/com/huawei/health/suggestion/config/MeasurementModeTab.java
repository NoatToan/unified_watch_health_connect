package com.huawei.health.suggestion.config;

import com.huawei.health.suggestion.R;
import defpackage.qre;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public enum MeasurementModeTab {
    TAB_INDEX_ZERO(10, getCountTabNameArray(), getTabTypeArrayByMeasurement(10)),
    TAB_INDEX_ONE(1, getTimeTabNameArray(), getTabTypeArrayByMeasurement(1));

    private int mAIMeasurement;
    private String[] mTabName;
    private int[] mTargetType;

    public static int[] getTabTypeArrayByMeasurement(int i) {
        HashMap map = new HashMap(2);
        map.put(10, new int[]{10, 1, -1});
        map.put(1, new int[]{1, -1});
        return (int[]) map.get(Integer.valueOf(i));
    }

    public static String[] getModeTabName(int i) {
        for (MeasurementModeTab measurementModeTab : values()) {
            if (measurementModeTab.getAIMeasurement() == i) {
                return measurementModeTab.getTabName();
            }
        }
        return getTimeTabNameArray();
    }

    private static String[] getCountTabNameArray() {
        return new String[]{qre.f(R.string.IDS_sug_destiny), qre.f(R.string.IDS_sug_at_regular_time), qre.f(R.string.IDS_sug_freely)};
    }

    private static String[] getTimeTabNameArray() {
        return new String[]{qre.f(R.string.IDS_sug_at_regular_time), qre.f(R.string.IDS_sug_freely)};
    }

    public int getAIMeasurement() {
        return this.mAIMeasurement;
    }

    public void setAIMeasurement(int i) {
        this.mAIMeasurement = i;
    }

    public String[] getTabName() {
        return this.mTabName;
    }

    public void setTabName(String[] strArr) {
        this.mTabName = strArr;
    }

    public int[] getTargetType() {
        return this.mTargetType;
    }

    public void setTargetType(int[] iArr) {
        this.mTargetType = iArr;
    }

    MeasurementModeTab(int i, String[] strArr, int[] iArr) {
        this.mAIMeasurement = i;
        this.mTabName = strArr;
        this.mTargetType = iArr;
    }

    public static boolean isMatch(int i, int i2) {
        int[] targetType;
        for (MeasurementModeTab measurementModeTab : values()) {
            if (i2 == measurementModeTab.getAIMeasurement() && (targetType = measurementModeTab.getTargetType()) != null) {
                for (int i3 : targetType) {
                    if (i == i3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
