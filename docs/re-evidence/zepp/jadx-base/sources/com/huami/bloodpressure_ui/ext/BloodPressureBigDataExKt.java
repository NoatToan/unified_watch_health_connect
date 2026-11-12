package com.huami.bloodpressure_ui.ext;

import android.util.SparseArray;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureDateData;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.chart.BarChartVo;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0013\u0010\n\u001aJ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u001b"}, d2 = {"", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "", "chartOffset", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "toWeekBpChartDataList", "", "Lcom/huami/chart/data/ChartDataList;", "toWeekAvgCharDataList", "(Ljava/util/List;)[Lcom/huami/chart/data/ChartDataList;", "Lkotlin/Pair;", "getRangeByPoints", "", "day", "a", "toMonthBpChartDataList", "toMonthAvgCharDataList", "toYearBpChartDataList", "toYearAvgCharDataList", "index", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "timeStamp", "chartRange", "toBpChartVo", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureBigDataExKt {
    private static final int a(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    @Nullable
    public static final Pair<Float, Float> getRangeByPoints(@NotNull List<BloodPressureDateData> list) {
        float minDbp = 300.0f;
        float maxDbp = 30.0f;
        for (BloodPressureDateData bloodPressureDateData : list) {
            if (minDbp > bloodPressureDateData.getMinSbp()) {
                minDbp = bloodPressureDateData.getMinSbp();
            }
            if (minDbp > bloodPressureDateData.getMinDbp()) {
                minDbp = bloodPressureDateData.getMinDbp();
            }
            if (maxDbp < bloodPressureDateData.getMaxSbp()) {
                maxDbp = bloodPressureDateData.getMaxSbp();
            }
            if (maxDbp < bloodPressureDateData.getMaxDbp()) {
                maxDbp = bloodPressureDateData.getMaxDbp();
            }
        }
        List<Float> bp_third_range_list = (minDbp <= 60.0f || maxDbp >= 160.0f) ? (minDbp <= 40.0f || maxDbp >= 200.0f) ? BloodPressureConstKt.getBP_THIRD_RANGE_LIST() : BloodPressureConstKt.getBP_SECOND_RANGE_LIST() : BloodPressureConstKt.getBP_FIRST_RANGE_LIST();
        if (bp_third_range_list == null || bp_third_range_list.isEmpty()) {
            return null;
        }
        return new Pair<>(CollectionsKt.first((List) bp_third_range_list), CollectionsKt.last((List) bp_third_range_list));
    }

    @NotNull
    public static final BarChartVo<Number> toBpChartVo(@NotNull BloodPressureDateData bloodPressureDateData, int i, @NotNull TimeMode timeMode, long j, @Nullable Pair<Float, Float> pair, float f) {
        Pair<Float, Float> blood_pressure_dbp_data_range = pair == null ? BloodPressureConstKt.getBLOOD_PRESSURE_DBP_DATA_RANGE() : pair;
        return BloodPressureDbExKt.toBarChartVo(i, blood_pressure_dbp_data_range, new Pair(Integer.valueOf(bloodPressureDateData.getMinSbp()), Integer.valueOf(bloodPressureDateData.getMaxSbp())), blood_pressure_dbp_data_range, new Pair(Integer.valueOf(bloodPressureDateData.getMinDbp()), Integer.valueOf(bloodPressureDateData.getMaxDbp())), f, timeMode, j, 60, new Pair(Double.valueOf(bloodPressureDateData.getAvgDbp()), Double.valueOf(bloodPressureDateData.getAvgSbp())));
    }

    public static /* synthetic */ BarChartVo toBpChartVo$default(BloodPressureDateData bloodPressureDateData, int i, TimeMode timeMode, long j, Pair pair, float f, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            pair = null;
        }
        return toBpChartVo(bloodPressureDateData, i, timeMode, j, pair, (i2 & 16) != 0 ? 6.0f : f);
    }

    @NotNull
    public static final ChartDataList[] toMonthAvgCharDataList(@NotNull List<BloodPressureDateData> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date yMDToDate = TimeFormatEx.INSTANCE.parseYMDToDate(bloodPressureDateData.getDate());
            if (yMDToDate != null) {
                calendar.setTime(yMDToDate);
            }
            int i = calendar.get(5);
            sparseArray.put(i, new ChartData(i, new float[]{(float) bloodPressureDateData.getAvgDbp()}));
            sparseArray2.put(i, new ChartData(i, new float[]{(float) bloodPressureDateData.getAvgSbp()}));
            arrayList.add(Unit.INSTANCE);
        }
        return new ChartDataList[]{new ChartDataList(sparseArray), new ChartDataList(sparseArray2)};
    }

    @NotNull
    public static final List<BarChartVo<Number>> toMonthBpChartDataList(@NotNull List<BloodPressureDateData> list, float f) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date yMDToDate = TimeFormatEx.INSTANCE.parseYMDToDate(bloodPressureDateData.getDate());
            if (yMDToDate != null) {
                calendar.setTime(yMDToDate);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(toBpChartVo$default(bloodPressureDateData, calendar.get(5), TimeMode.MONTH, calendar.getTimeInMillis(), null, f, 8, null))));
        }
        return arrayList;
    }

    public static /* synthetic */ List toMonthBpChartDataList$default(List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return toMonthBpChartDataList(list, f);
    }

    @NotNull
    public static final ChartDataList[] toWeekAvgCharDataList(@NotNull List<BloodPressureDateData> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date yMDToDate = TimeFormatEx.INSTANCE.parseYMDToDate(bloodPressureDateData.getDate());
            if (yMDToDate != null) {
                calendar.setTime(yMDToDate);
            }
            int iA = a(calendar.get(7));
            sparseArray.put(iA, new ChartData(iA, new float[]{(float) bloodPressureDateData.getAvgDbp()}));
            sparseArray2.put(iA, new ChartData(iA, new float[]{(float) bloodPressureDateData.getAvgSbp()}));
            arrayList.add(Unit.INSTANCE);
        }
        return new ChartDataList[]{new ChartDataList(sparseArray), new ChartDataList(sparseArray2)};
    }

    @NotNull
    public static final List<BarChartVo<Number>> toWeekBpChartDataList(@NotNull List<BloodPressureDateData> list, float f) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Pair<Float, Float> rangeByPoints = getRangeByPoints(list);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date yMDToDate = TimeFormatEx.INSTANCE.parseYMDToDate(bloodPressureDateData.getDate());
            if (yMDToDate != null) {
                calendar.setTime(yMDToDate);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(toBpChartVo(bloodPressureDateData, a(calendar.get(7)), TimeMode.WEEK, calendar.getTimeInMillis(), rangeByPoints, f))));
        }
        return arrayList;
    }

    public static /* synthetic */ List toWeekBpChartDataList$default(List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return toWeekBpChartDataList(list, f);
    }

    @NotNull
    public static final ChartDataList[] toYearAvgCharDataList(@NotNull List<BloodPressureDateData> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date stringToDate = TimeUtils.parseStringToDate("yyyy-MM", bloodPressureDateData.getDate());
            if (stringToDate != null) {
                calendar.setTime(stringToDate);
            }
            int i = calendar.get(2) + 1;
            sparseArray.put(i, new ChartData(i, new float[]{(float) bloodPressureDateData.getAvgDbp()}));
            sparseArray2.put(i, new ChartData(i, new float[]{(float) bloodPressureDateData.getAvgSbp()}));
            arrayList.add(Unit.INSTANCE);
        }
        return new ChartDataList[]{new ChartDataList(sparseArray), new ChartDataList(sparseArray2)};
    }

    @NotNull
    public static final List<BarChartVo<Number>> toYearBpChartDataList(@NotNull List<BloodPressureDateData> list, float f) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDateData bloodPressureDateData : list) {
            Date stringToDate = TimeUtils.parseStringToDate("yyyy-MM", bloodPressureDateData.getDate());
            if (stringToDate != null) {
                calendar.setTime(stringToDate);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(toBpChartVo$default(bloodPressureDateData, calendar.get(2) + 1, TimeMode.YEAR, calendar.getTimeInMillis(), null, f, 8, null))));
        }
        return arrayList;
    }

    public static /* synthetic */ List toYearBpChartDataList$default(List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return toYearBpChartDataList(list, f);
    }
}
