package com.xiaomi.hm.health.healthdata.utils;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.stress.domain.service.StressLevelService;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.view.HealthChartBuilderKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/HealthDataUtils;", "", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "", "getHealthDataName", "getHealthDataUnit", "Lkotlin/Pair;", "", "getHealthDataRange", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getHealthDataIntro", "", "getHealthDataIntroImg", "getHealthDataDigits", "", "isBodyCompositionType", "dataType", "checkDataIsInt", "getBarChartOffset", "value", "getStressBarColor", "getTempChartDataColor", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "getTotalPageCount", "getDayFrequency", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataUtils {

    @NotNull
    public static final HealthDataUtils INSTANCE = new HealthDataUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthDataType.values().length];
            iArr[HealthDataType.CHEST.ordinal()] = 1;
            iArr[HealthDataType.WAIST.ordinal()] = 2;
            iArr[HealthDataType.HIP.ordinal()] = 3;
            iArr[HealthDataType.ARM.ordinal()] = 4;
            iArr[HealthDataType.THIGH.ordinal()] = 5;
            iArr[HealthDataType.CALF.ordinal()] = 6;
            iArr[HealthDataType.BODY_FAT.ordinal()] = 7;
            iArr[HealthDataType.BMI.ordinal()] = 8;
            iArr[HealthDataType.MUSCLE.ordinal()] = 9;
            iArr[HealthDataType.WATER.ordinal()] = 10;
            iArr[HealthDataType.PROTEIN.ordinal()] = 11;
            iArr[HealthDataType.BASAL_METABOLISM.ordinal()] = 12;
            iArr[HealthDataType.VISCERAL_FAT.ordinal()] = 13;
            iArr[HealthDataType.BONE.ordinal()] = 14;
            iArr[HealthDataType.TEMPERATURE.ordinal()] = 15;
            iArr[HealthDataType.BLOOD_SUGAR.ordinal()] = 16;
            iArr[HealthDataType.BLOOD_PRESSURE.ordinal()] = 17;
            iArr[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 18;
            iArr[HealthDataType.SUBCUTANEOUS_FAT.ordinal()] = 19;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ DataType a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataType dataType, float f) {
            super(0);
            this.a = dataType;
            this.b = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBarChartOffset " + this.a + ":" + this.b;
        }
    }

    private HealthDataUtils() {
    }

    public final boolean checkDataIsInt(@NotNull DataType dataType) {
        if (dataType instanceof HealthDataType) {
            return dataType == HealthDataType.BASAL_METABOLISM || dataType == HealthDataType.VISCERAL_FAT || dataType == HealthDataType.BLOOD_PRESSURE;
        }
        return false;
    }

    public final float getBarChartOffset(@NotNull DataType dataType) {
        float bar_data_offset = (ChartHelper.INSTANCE.getBAR_DATA_OFFSET() / HealthChartBuilderKt.getYAxisStep(HealthDataType.BLOOD_PRESSURE)) * HealthChartBuilderKt.getYAxisStep(dataType);
        HMLog.info$default(null, new a(dataType, bar_data_offset), 1, null);
        return DataExKt.formatWithDecimalFloat(Float.valueOf(bar_data_offset), 1);
    }

    public final int getDayFrequency(@NotNull DataType dataType) {
        if (dataType instanceof StressDataType) {
            return 5;
        }
        return dataType == HealthDataType.BLOOD_PRESSURE ? 60 : 0;
    }

    public final int getHealthDataDigits(@NotNull DataType type) {
        if (type == HealthDataType.MUSCLE || type == HealthDataType.BONE) {
            return 2;
        }
        return (type == HealthDataType.BLOOD_PRESSURE || type == HealthDataType.VISCERAL_FAT) || type == HealthDataType.BASAL_METABOLISM ? 0 : 1;
    }

    @NotNull
    public final String getHealthDataIntro(@NotNull HealthDataType type) {
        Context context = BraceletApp.getContext();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return context.getString(R.string.health_data_chest_intro);
            case 2:
                return context.getString(R.string.health_data_waist_intro);
            case 3:
                return context.getString(R.string.health_data_hip_intro);
            case 4:
                return context.getString(R.string.health_data_arm_intro);
            case 5:
                return context.getString(R.string.health_data_thigh_intro);
            case 6:
                return context.getString(R.string.health_data_calf_intro);
            case 7:
                return context.getString(R.string.bodyfat_activity_text);
            case 8:
                return context.getString(R.string.bmi_activity_text);
            case 9:
                return context.getString(R.string.muscle_activity_text);
            case 10:
                return context.getString(R.string.water_activity_text);
            case 11:
                return context.getString(R.string.pmr_activity_text);
            case 12:
                return context.getString(R.string.bmr_activity_text);
            case 13:
                return context.getString(R.string.visceral_fat_activity_text);
            case 14:
                return context.getString(R.string.bone_activity_text);
            case 15:
                return context.getString(R.string.health_data_temperature_intro);
            case 16:
                return context.getString(R.string.health_data_blood_sugar_intro);
            case 17:
                return context.getString(R.string.health_data_blood_pressure_intro);
            case 18:
                return context.getString(R.string.health_data_skeletal_muscle_intro);
            case 19:
                return context.getString(R.string.health_data_subcutaneous_fat_intro);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getHealthDataIntroImg(@NotNull HealthDataType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        switch (i) {
            case 1:
                return R.drawable.health_data_chest_bg;
            case 2:
                return R.drawable.health_data_waist_bg;
            case 3:
                return R.drawable.health_data_hip_bg;
            case 4:
                return R.drawable.health_data_arm_bg;
            case 5:
                return R.drawable.health_data_thigh_bg;
            case 6:
                return R.drawable.health_data_calf_bg;
            default:
                switch (i) {
                    case 15:
                        return R.drawable.health_data_temperture_bg;
                    case 16:
                        return R.drawable.health_data_blood_sugar_bg;
                    case 17:
                        return R.drawable.health_data_blood_pressure_bg;
                    default:
                        return -1;
                }
        }
    }

    @NotNull
    public final String getHealthDataName(@NotNull DataType type) {
        Context context = BraceletApp.getContext();
        if (type == HealthDataType.CHEST) {
            return context.getString(R.string.health_data_chest);
        }
        if (type == HealthDataType.WAIST) {
            return context.getString(R.string.health_data_waist);
        }
        if (type == HealthDataType.HIP) {
            return context.getString(R.string.health_data_hip);
        }
        if (type == HealthDataType.ARM) {
            return context.getString(R.string.health_data_arm);
        }
        if (type == HealthDataType.THIGH) {
            return context.getString(R.string.health_data_thigh);
        }
        if (type == HealthDataType.CALF) {
            return context.getString(R.string.health_data_calf);
        }
        if (type == HealthDataType.BODY_FAT) {
            return context.getString(R.string.health_data_body_fat);
        }
        if (type == HealthDataType.BMI) {
            return context.getString(R.string.health_data_bmi);
        }
        if (type == HealthDataType.MUSCLE) {
            return context.getString(R.string.health_data_muscle);
        }
        if (type == HealthDataType.WATER) {
            return context.getString(R.string.health_data_water);
        }
        if (type == HealthDataType.PROTEIN) {
            return context.getString(R.string.health_data_protein);
        }
        if (type == HealthDataType.BASAL_METABOLISM) {
            return context.getString(R.string.health_data_basal_metabolism);
        }
        if (type == HealthDataType.VISCERAL_FAT) {
            return context.getString(R.string.health_data_visceral_fat);
        }
        if (type == HealthDataType.BONE) {
            return context.getString(R.string.health_data_bone);
        }
        if (type == HealthDataType.SUBCUTANEOUS_FAT) {
            return context.getString(R.string.health_data_subcutaneous_fat);
        }
        if (type == HealthDataType.SKELETAL_MUSCLE) {
            return context.getString(R.string.skeletal_muscle);
        }
        if (type == HealthDataType.TEMPERATURE) {
            return context.getString(R.string.health_data_temperature);
        }
        if (type == HealthDataType.BLOOD_SUGAR) {
            return context.getString(R.string.health_data_blood_sugar);
        }
        if (type == HealthDataType.BLOOD_PRESSURE) {
            return context.getString(R.string.health_data_blood_pressure);
        }
        if (type instanceof StressDataType) {
            return context.getString(R.string.stress);
        }
        return type instanceof TemperatureDataType ? context.getString(R.string.health_data_temperature) : "";
    }

    @Nullable
    public final Pair<Float, Float> getHealthDataRange(@NotNull DataType type) {
        HealthDataType healthDataType = HealthDataType.CHEST;
        Float fValueOf = Float.valueOf(200.0f);
        Float fValueOf2 = Float.valueOf(20.0f);
        if (type != healthDataType && type != HealthDataType.WAIST && type != HealthDataType.HIP) {
            if (type == HealthDataType.ARM) {
                return new Pair<>(Float.valueOf(8.0f), Float.valueOf(70.0f));
            }
            if (type == HealthDataType.THIGH) {
                return new Pair<>(Float.valueOf(10.0f), Float.valueOf(100.0f));
            }
            if (type == HealthDataType.CALF) {
                return new Pair<>(Float.valueOf(10.0f), Float.valueOf(60.0f));
            }
            if (type == HealthDataType.TEMPERATURE) {
                return new Pair<>(Float.valueOf(35.0f), Float.valueOf(42.0f));
            }
            if (type == HealthDataType.BLOOD_SUGAR) {
                return new Pair<>(Float.valueOf(0.0f), Float.valueOf(50.0f));
            }
            if (type == HealthDataType.BODY_FAT) {
                return new Pair<>(Float.valueOf(2.0f), Float.valueOf(75.0f));
            }
            if (type == HealthDataType.BMI) {
                return new Pair<>(Float.valueOf(10.0f), Float.valueOf(50.0f));
            }
            if (type == HealthDataType.MUSCLE) {
                return new Pair<>(Float.valueOf(10.0f), Float.valueOf(100.0f));
            }
            if (type == HealthDataType.WATER) {
                return new Pair<>(Float.valueOf(30.0f), Float.valueOf(80.0f));
            }
            if (type == HealthDataType.PROTEIN) {
                return new Pair<>(Float.valueOf(10.0f), Float.valueOf(30.0f));
            }
            if (type == HealthDataType.BASAL_METABOLISM) {
                return new Pair<>(Float.valueOf(500.0f), Float.valueOf(3000.0f));
            }
            if (type == HealthDataType.VISCERAL_FAT) {
                return new Pair<>(Float.valueOf(0.0f), Float.valueOf(30.0f));
            }
            if (type == HealthDataType.BONE) {
                return new Pair<>(Float.valueOf(0.0f), Float.valueOf(10.0f));
            }
            if (type == HealthDataType.BLOOD_PRESSURE) {
                return new Pair<>(Float.valueOf(30.0f), Float.valueOf(300.0f));
            }
            if (type == HealthDataType.SKELETAL_MUSCLE) {
                return new Pair<>(Float.valueOf(8.0f), Float.valueOf(100.0f));
            }
            if (type == HealthDataType.SUBCUTANEOUS_FAT) {
                return new Pair<>(Float.valueOf(0.1f), Float.valueOf(60.0f));
            }
            if (type instanceof StressDataType) {
                return new Pair<>(Float.valueOf(0.0f), Float.valueOf(100.0f));
            }
            if (!(type instanceof TemperatureDataType)) {
                return null;
            }
            TempUtils tempUtils = TempUtils.INSTANCE;
            return new Pair<>(Float.valueOf(tempUtils.getTempDisplayFloat(35.0f)), Float.valueOf(tempUtils.getTempDisplayFloat(42.0f)));
        }
        return new Pair<>(fValueOf2, fValueOf);
    }

    @NotNull
    public final String getHealthDataUnit(@NotNull DataType type) {
        String string;
        Context context = BraceletApp.getContext();
        if (((((type == HealthDataType.CHEST || type == HealthDataType.WAIST) || type == HealthDataType.HIP) || type == HealthDataType.ARM) || type == HealthDataType.THIGH) || type == HealthDataType.CALF) {
            return context.getString(R.string.cm);
        }
        if (type == HealthDataType.TEMPERATURE) {
            return context.getString(R.string.unit_temp);
        }
        if (type == HealthDataType.BLOOD_SUGAR) {
            return context.getString(R.string.unit_glu);
        }
        if (type == HealthDataType.BLOOD_PRESSURE) {
            return context.getString(R.string.unit_bp);
        }
        if (((type == HealthDataType.BODY_FAT || type == HealthDataType.WATER) || type == HealthDataType.BMI) || type == HealthDataType.VISCERAL_FAT) {
            return "";
        }
        if (type == HealthDataType.BASAL_METABOLISM) {
            return context.getString(R.string.unit_kcalorie);
        }
        if ((type == HealthDataType.MUSCLE || type == HealthDataType.BONE) || type == HealthDataType.SKELETAL_MUSCLE) {
            return HMWeightUtils.toUnitStr(context, BFCallback.getUnitManager().getWeightUnit());
        }
        if (!(type instanceof TemperatureDataType)) {
            return "";
        }
        int tempUnit = TempUtils.INSTANCE.getTempUnit();
        if (tempUnit == 0) {
            string = context.getString(R.string.unit_temp);
        } else {
            if (tempUnit != 1) {
                return "";
            }
            string = context.getString(R.string.temperature_unit_f);
        }
        return string;
    }

    public final int getStressBarColor(float value) {
        int iCalculateStressLevel = StressLevelService.INSTANCE.calculateStressLevel((int) value);
        if (iCalculateStressLevel == 1) {
            return ContextCompat.getColor(BraceletApp.getContext(), R.color.s15);
        }
        if (iCalculateStressLevel == 2) {
            return ContextCompat.getColor(BraceletApp.getContext(), R.color.s20);
        }
        if (iCalculateStressLevel == 3) {
            return ContextCompat.getColor(BraceletApp.getContext(), R.color.s33);
        }
        if (iCalculateStressLevel != 4) {
            return 0;
        }
        return ContextCompat.getColor(BraceletApp.getContext(), R.color.s30);
    }

    public final int getTempChartDataColor(float value) {
        boolean z = false;
        if (35.0f <= value && value <= 37.2f) {
            z = true;
        }
        return z ? Color.parseColor("#1AAF4C") : Color.parseColor("#FFBA00");
    }

    public final int getTotalPageCount(@NotNull TimeMode timeMode) {
        return HealthDataTimeUtils.getDifferFromRegisterDay$default(HealthDataTimeUtils.INSTANCE, 0L, timeMode, 1, null) + 1;
    }

    public final boolean isBodyCompositionType(@Nullable HealthDataType type) {
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 18 && i != 19) {
            switch (i) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
