package com.xiaomi.hm.health.healthdata.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b1\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t\"\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t\"\u0016\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t\"\u0016\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t\"\u0016\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\t\"\u0016\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\t\"\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\t\"\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\t\"\u0016\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\t\"\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\t\"\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\t\"\u0016\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\t\"\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\t\"\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\t\"\u0016\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\t\"\u0016\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\t\"\u0016\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\t\"\u0016\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\t\"\u0016\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\t\"\u0016\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\t\"\u0016\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\t\"\u0016\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\t\"\u0016\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0005\"\u0016\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\t\"\u0016\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\t\"\u0016\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\t\"\u0016\u0010&\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\t\"\u0016\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\t\"\u0016\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\t\"\u0016\u0010)\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\t\"\u0016\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\t\"\u0016\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\t\"\u0016\u0010,\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\t\"\u0016\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\t\"\u0016\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\t\"\u0016\u0010/\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\t\"\u0016\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\t\"\u0016\u00101\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\t\"\u0016\u00102\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\t\"\u0016\u00103\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0005\"\u0016\u00104\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\t\"\u0016\u00105\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\t\"\u0016\u00106\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\t\"\u0016\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\t¨\u00068"}, d2 = {"", "HD_TAG", "Ljava/lang/String;", "", "DAY_MIN", LogUtil.I, "HALF_DAY_MIN", "", "CHEST_MIN", "F", "CHEST_MAX", "WAIST_MIN", "WAIST_MAX", "HIP_MIN", "HIP_MAX", "ARM_MIN", "ARM_MAX", "THIGH_MIN", "THIGH_MAX", "CALF_MIN", "CALF_MAX", "TEMPERATURE_MIN", "TEMPERATURE_MAX", "TEMPERATURE_NORMAL_MAX", "BLOOD_SUGAR_MIN", "BLOOD_SUGAR_MAX", "BLOOD_PRESSURE_CONTRACT_MIN", "BLOOD_PRESSURE_CONTRACT_MAX", "BLOOD_PRESSURE_RELAX_MIN", "BLOOD_PRESSURE_RELAX_MAX", "BODY_FAT_MIN", "BODY_FAT_MAX", "BMI_MIN", "BMI_MAX", "BMI_ADULT_AGE", "MUSCLE_MIN_VALUE", "MUSCLE_MAX_VALUE", "WATER_MIN_VALUE", "WATER_MAX_VALUE", "PROTEIN_MIN_VALUE", "PROTEIN_MAX_VALUE", "BONE_MIN_VALUE", "BONE_MAX_VALUE", "BMR_MIN_VALUE", "BMR_MAX_VALUE", "VIS_FAT_MIN_VALUE", "VIS_FAT_MIDDLE_VALUE", "VIS_FAT_NEXT_VALUE", "VIS_FAT_MAX_VALUE", "STRESS_MIN_VALUE", "STRESS_MAX_VALUE", "STRESS_DAY_MAX_SIZE", "SKELETAL_MUSCLE_MIN_VALUE_DATA", "SKELETAL_MUSCLE_MAX_VALUE_DATA", "SUBCUTANEOUS_FAT_MIN_VALUE_DATA", "SUBCUTANEOUS_FAT_MAX_VALUE_DATA", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ConstantKt {
    public static final float ARM_MAX = 70.0f;
    public static final float ARM_MIN = 8.0f;
    public static final float BLOOD_PRESSURE_CONTRACT_MAX = 300.0f;
    public static final float BLOOD_PRESSURE_CONTRACT_MIN = 40.0f;
    public static final float BLOOD_PRESSURE_RELAX_MAX = 200.0f;
    public static final float BLOOD_PRESSURE_RELAX_MIN = 30.0f;
    public static final float BLOOD_SUGAR_MAX = 50.0f;
    public static final float BLOOD_SUGAR_MIN = 0.0f;
    public static final int BMI_ADULT_AGE = 18;
    public static final float BMI_MAX = 50.0f;
    public static final float BMI_MIN = 10.0f;
    public static final float BMR_MAX_VALUE = 3000.0f;
    public static final float BMR_MIN_VALUE = 500.0f;
    public static final float BODY_FAT_MAX = 75.0f;
    public static final float BODY_FAT_MIN = 2.0f;
    public static final float BONE_MAX_VALUE = 10.0f;
    public static final float BONE_MIN_VALUE = 0.0f;
    public static final float CALF_MAX = 60.0f;
    public static final float CALF_MIN = 10.0f;
    public static final float CHEST_MAX = 200.0f;
    public static final float CHEST_MIN = 20.0f;
    public static final int DAY_MIN = 1440;
    public static final int HALF_DAY_MIN = 720;

    @NotNull
    public static final String HD_TAG = "HealthData-";
    public static final float HIP_MAX = 200.0f;
    public static final float HIP_MIN = 20.0f;
    public static final float MUSCLE_MAX_VALUE = 100.0f;
    public static final float MUSCLE_MIN_VALUE = 10.0f;
    public static final float PROTEIN_MAX_VALUE = 30.0f;
    public static final float PROTEIN_MIN_VALUE = 10.0f;
    public static final float SKELETAL_MUSCLE_MAX_VALUE_DATA = 100.0f;
    public static final float SKELETAL_MUSCLE_MIN_VALUE_DATA = 8.0f;
    public static final int STRESS_DAY_MAX_SIZE = 288;
    public static final float STRESS_MAX_VALUE = 100.0f;
    public static final float STRESS_MIN_VALUE = 0.0f;
    public static final float SUBCUTANEOUS_FAT_MAX_VALUE_DATA = 60.0f;
    public static final float SUBCUTANEOUS_FAT_MIN_VALUE_DATA = 0.1f;
    public static final float TEMPERATURE_MAX = 42.0f;
    public static final float TEMPERATURE_MIN = 35.0f;
    public static final float TEMPERATURE_NORMAL_MAX = 37.2f;
    public static final float THIGH_MAX = 100.0f;
    public static final float THIGH_MIN = 10.0f;
    public static final float VIS_FAT_MAX_VALUE = 30.0f;
    public static final float VIS_FAT_MIDDLE_VALUE = 10.0f;
    public static final float VIS_FAT_MIN_VALUE = 0.0f;
    public static final float VIS_FAT_NEXT_VALUE = 15.0f;
    public static final float WAIST_MAX = 200.0f;
    public static final float WAIST_MIN = 20.0f;
    public static final float WATER_MAX_VALUE = 80.0f;
    public static final float WATER_MIN_VALUE = 30.0f;
}
