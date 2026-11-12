package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import com.huami.chart.data.YAxisData;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003\"\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014*\"\u0010\u0017\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u0016*\u001a\u0010\u0019\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00182\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0018*.\u0010\u001c\"\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000f0\u00182\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000f0\u0018*\"\u0010\u001d\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u0016*\"\u0010\u001f\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u00182\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u0018*,\u0010#\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!` 0\u00182\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020!0\"j\b\u0012\u0004\u0012\u00020!` 0\u0018*,\u0010%\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$` 0\u00182\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020$0\"j\b\u0012\u0004\u0012\u00020$` 0\u0018*,\u0010&\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0000` 0\u00182\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\"j\b\u0012\u0004\u0012\u00020\u0000` 0\u0018*\"\u0010(\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u00182\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u0018¨\u0006)"}, d2 = {"", "alpha", "changeAlpha", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getYAxisDataByType", "", "getYMaxValue", "dataType", "", "weight", "getYAxisData", "getYAxisStep", "", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "a", "Ljava/util/List;", "getWeightList", "()Ljava/util/List;", "weightList", "Lkotlin/Function1;", "BarDataColorGetter", "Lkotlin/Function0;", "BarMaxSizeGetter", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "BarPointsGetter", "PointDataColorGetter", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "PointsGetter", "Lkotlin/collections/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "Ljava/util/ArrayList;", "SubIndexGetter", "", "SubIndexShadowColorsGetter", "SubPointIndexGetter", "Lcom/huami/chart/data/XAxisData;", "XAxisDataGetter", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HealthChartBuilderKt {

    @NotNull
    private static final List<HealthDataType> a = CollectionsKt__CollectionsKt.listOf((Object[]) new HealthDataType[]{HealthDataType.MUSCLE, HealthDataType.BONE, HealthDataType.SKELETAL_MUSCLE});

    public static final int changeAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    @NotNull
    public static final List<HealthDataType> getWeightList() {
        return a;
    }

    @NotNull
    public static final SparseArray<YAxisData> getYAxisData(@NotNull DataType dataType, boolean z) {
        String withDecimal;
        Float floatOrNull;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        float fFloatValue = healthDataUtils.getHealthDataRange(dataType).getFirst().floatValue();
        float fFloatValue2 = healthDataUtils.getHealthDataRange(dataType).getSecond().floatValue();
        float yAxisStep = getYAxisStep(dataType);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float fFloatValue3 = (i * yAxisStep) + fFloatValue;
            if (fFloatValue3 > fFloatValue2) {
                fFloatValue3 = fFloatValue2;
            }
            if (z) {
                withDecimal = dataType == HealthDataType.SKELETAL_MUSCLE ? BodyCompositionUtilsKt.getWeightInKgText1Format(fFloatValue3) : HMWeightUtils.getWeightValueStringForDisplay(fFloatValue3, BFCallback.getUnitManager().getWeightUnit());
            } else {
                withDecimal = (dataType == HealthDataType.SUBCUTANEOUS_FAT || dataType == TemperatureDataType.ALL_DAY || dataType == HealthDataType.TEMPERATURE) ? DataExKt.formatWithDecimal(Float.valueOf(fFloatValue3), 1) : DataExKt.formatWithDecimal(Float.valueOf(fFloatValue3), 0);
            }
            if (!CollectionsKt___CollectionsKt.contains(a, dataType) && (floatOrNull = k.toFloatOrNull(withDecimal)) != null) {
                fFloatValue3 = floatOrNull.floatValue();
            }
            sparseArray.put(i, new YAxisData(fFloatValue3, withDecimal));
            if (i2 >= 5) {
                return sparseArray;
            }
            i = i2;
        }
    }

    public static /* synthetic */ SparseArray getYAxisData$default(DataType dataType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getYAxisData(dataType, z);
    }

    @NotNull
    public static final SparseArray<YAxisData> getYAxisDataByType(@NotNull DataType dataType) {
        return getYAxisData(dataType, CollectionsKt___CollectionsKt.contains(a, dataType));
    }

    public static final float getYAxisStep(@NotNull DataType dataType) {
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        return DataExKt.formatWithDecimalFloat(Float.valueOf((healthDataUtils.getHealthDataRange(dataType).getSecond().floatValue() - healthDataUtils.getHealthDataRange(dataType).getFirst().floatValue()) / 4), 1);
    }

    public static final float getYMaxValue(@NotNull DataType dataType) {
        if (dataType == HealthDataType.CHEST || dataType == HealthDataType.WAIST || dataType == HealthDataType.HIP) {
            return 200.0f;
        }
        if (dataType == HealthDataType.ARM) {
            return 70.0f;
        }
        if (dataType != HealthDataType.THIGH) {
            if (dataType != HealthDataType.CALF) {
                if (dataType == HealthDataType.BODY_FAT) {
                    return 75.0f;
                }
                if (dataType != HealthDataType.BMI) {
                    if (dataType != HealthDataType.MUSCLE) {
                        if (dataType == HealthDataType.WATER) {
                            return 80.0f;
                        }
                        if (dataType == HealthDataType.PROTEIN) {
                            return 30.0f;
                        }
                        if (dataType == HealthDataType.BASAL_METABOLISM) {
                            return 3000.0f;
                        }
                        if (dataType == HealthDataType.VISCERAL_FAT) {
                            return 30.0f;
                        }
                        if (dataType == HealthDataType.BONE) {
                            return 10.0f;
                        }
                        if (dataType == HealthDataType.TEMPERATURE) {
                            return 42.0f;
                        }
                        if (dataType != HealthDataType.BLOOD_SUGAR) {
                            if (dataType == HealthDataType.BLOOD_PRESSURE) {
                                return 300.0f;
                            }
                            if (dataType != HealthDataType.SKELETAL_MUSCLE) {
                                if (dataType != HealthDataType.SUBCUTANEOUS_FAT) {
                                    return 0.0f;
                                }
                            }
                        }
                    }
                }
                return 50.0f;
            }
            return 60.0f;
        }
        return 100.0f;
    }
}
