package com.huami.bloodpressure_ui.chart;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.BloodPressureConstKt;
import com.huami.bloodpressure_ui.ext.DataExKt;
import com.huami.bloodpressure_ui.ext.TimeEx;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u001a\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u001a\b\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0002\u001a\b\u0010\u0019\u001a\u00020\u0011H\u0002\u001a\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014*\b\u0012\u0004\u0012\u00020\u00150\u0014\"\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b\"\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001b*\"\u0010!\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e*\"\u0010#\"\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\"2\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\"*.\u0010$\"\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u001e2\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u001e*\"\u0010&\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00060\u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00060\u001e*.\u0010)\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(0'0\u001e2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(0'0\u001e*\"\u0010*\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001e¨\u0006+"}, d2 = {"Ljava/util/Date;", "startDate", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "timeInterval", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisDataByType", "b", "c", "", "time", "f", "start", "e", "i", "", "a", "", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "points", "Lcom/huami/chart/data/YAxisData;", "g", "h", "toRawBarChartVo", LogUtil.I, "secInHour", "daysOfWeek", "Lkotlin/Function0;", "", "Lcom/huami/chart/data/ChartDataList;", "AvgPointsGetter", "Lkotlin/Function1;", "BarDataColorGetter", "BarPointsGetter", "Lcom/huami/chart/data/ChartData;", "ChartDataArrayGetter", "", "Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "ChartDataMapGetter", "XAxisDataGetter", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class IBloodPressureChartBuilderKt {
    private static final int a = 3600;
    private static final int b = 7;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a() {
        return DataExKt.formatWithDecimalFloat(Float.valueOf((6 / h()) * h()), 1);
    }

    private static final SparseArray<XAxisData> b() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        String[] strArr = {"00:00", "06:00", "12:00", "18:00", "23:59"};
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3 = i * 6;
            sparseArray.put(i3, new XAxisData(i3, strArr[i]));
            if (i2 >= 4) {
                sparseArray.put(23, new XAxisData(23, strArr[4]));
                return sparseArray;
            }
            i = i2;
        }
    }

    private static final SparseArray<XAxisData> c(int i) {
        String[] strArr = {"00:00", "06:00", "12:00", "18:00", "23:59"};
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int i2 = 360 / i;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i3 * i2;
            sparseArray.put(i5, new XAxisData(i5, strArr[i3]));
            if (i4 >= 4) {
                int i6 = (i2 * 4) - 1;
                sparseArray.put(i6, new XAxisData(i6, strArr[4]));
                return sparseArray;
            }
            i3 = i4;
        }
    }

    public static /* synthetic */ SparseArray d(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return c(i);
    }

    private static final SparseArray<XAxisData> e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeEx.INSTANCE.getFirstDayOfMonthTime(date.getTime()));
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        TimeFormatEx timeFormatEx = TimeFormatEx.INSTANCE;
        sparseArray.put(1, new XAxisData(1, timeFormatEx.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(10, new XAxisData(10, timeFormatEx.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(20, new XAxisData(20, timeFormatEx.formatTimeMD(calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        sparseArray.put(actualMaximum, new XAxisData(actualMaximum, timeFormatEx.formatTimeMD(calendar.getTimeInMillis())));
        return sparseArray;
    }

    private static final SparseArray<XAxisData> f(long j) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeEx.INSTANCE.getFirstDayOfWeekTime(j));
        int i = 1;
        while (true) {
            int i2 = i + 1;
            sparseArray.put(i, new XAxisData(i, calendar.getDisplayName(7, 1, Locale.getDefault())));
            calendar.add(6, 1);
            if (i2 > 7) {
                return sparseArray;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseArray<YAxisData> g(List<BarChartVo<Number>> list) {
        Number number;
        Number number2;
        Number number3;
        Number number4;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        Context contextAndroidContext = ModuleExtKt.androidContext(KoinExKt.bloodPressureScope());
        new HMColor(ContextCompat.getColor(contextAndroidContext, R.color.s3));
        new HMColor(ContextCompat.getColor(contextAndroidContext, R.color.s4));
        Iterator<T> it2 = list.iterator();
        float f = 300.0f;
        float f2 = 30.0f;
        while (it2.hasNext()) {
            BarChartVo barChartVo = (BarChartVo) it2.next();
            Pair highValue = barChartVo.getHighValue();
            if (highValue != null && (number4 = (Number) highValue.getFirst()) != null) {
                float fFloatValue = number4.floatValue();
                if (f > fFloatValue) {
                    f = fFloatValue;
                }
            }
            Pair lowValue = barChartVo.getLowValue();
            if (lowValue != null && (number3 = (Number) lowValue.getFirst()) != null) {
                float fFloatValue2 = number3.floatValue();
                if (f > fFloatValue2) {
                    f = fFloatValue2;
                }
            }
            Pair highValue2 = barChartVo.getHighValue();
            if (highValue2 != null && (number2 = (Number) highValue2.getSecond()) != null) {
                float fFloatValue3 = number2.floatValue();
                if (f2 < fFloatValue3) {
                    f2 = fFloatValue3;
                }
            }
            Pair lowValue2 = barChartVo.getLowValue();
            if (lowValue2 != null && (number = (Number) lowValue2.getSecond()) != null) {
                float fFloatValue4 = number.floatValue();
                if (f2 < fFloatValue4) {
                    f2 = fFloatValue4;
                }
            }
        }
        List<Float> bp_third_range_list = (f < 60.0f || f2 > 160.0f) ? (f < 40.0f || f2 > 200.0f) ? BloodPressureConstKt.getBP_THIRD_RANGE_LIST() : BloodPressureConstKt.getBP_SECOND_RANGE_LIST() : BloodPressureConstKt.getBP_FIRST_RANGE_LIST();
        int i = 0;
        for (Object obj : bp_third_range_list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue5 = ((Number) obj).floatValue();
            if (fFloatValue5 == 85.0f) {
                sparseArray.put(i, new YAxisData(fFloatValue5, DataExKt.formatWithDecimal(Float.valueOf(fFloatValue5), 0)));
            } else if (fFloatValue5 == 135.0f) {
                sparseArray.put(i, new YAxisData(fFloatValue5, DataExKt.formatWithDecimal(Float.valueOf(fFloatValue5), 0)));
            } else {
                sparseArray.put(i, new YAxisData(fFloatValue5, DataExKt.formatWithDecimal(Float.valueOf(fFloatValue5), 0)));
            }
            i = i2;
        }
        return sparseArray;
    }

    @NotNull
    public static final SparseArray<XAxisData> getXAxisDataByType(@NotNull Date date, @NotNull TimeMode timeMode, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            return i >= 0 ? c(i) : b();
        }
        if (i2 == 2) {
            return f(date.getTime());
        }
        if (i2 == 3) {
            return e(date);
        }
        if (i2 == 4) {
            return i(date);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ SparseArray getXAxisDataByType$default(Date date, TimeMode timeMode, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return getXAxisDataByType(date, timeMode, i);
    }

    private static final float h() {
        return DataExKt.formatWithDecimalFloat(Float.valueOf((BloodPressureConstKt.getBLOOD_PRESSURE_RELAX_RANGE().getSecond().floatValue() - BloodPressureConstKt.getBLOOD_PRESSURE_RELAX_RANGE().getFirst().floatValue()) / 4), 1);
    }

    private static final SparseArray<XAxisData> i(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int maximum = calendar.getMaximum(2);
        int i = 1;
        int i2 = maximum + 1;
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (1 <= i2) {
            while (true) {
                int i3 = i + 1;
                sparseArray.put(i, new XAxisData(i, String.valueOf(i)));
                if (i == i2) {
                    break;
                }
                i = i3;
            }
        }
        return sparseArray;
    }

    @NotNull
    public static final BarChartVo<Float> toRawBarChartVo(@NotNull BarChartVo<Number> barChartVo) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair<Number, Number> highValue = barChartVo.getHighValue();
        if (highValue == null) {
            pair = null;
        } else {
            float fFloatValue = highValue.getFirst().floatValue();
            float fFloatValue2 = highValue.getSecond().floatValue();
            Pair<Number, Number> highOffset = barChartVo.getHighOffset();
            pair = new Pair(Float.valueOf(fFloatValue + highOffset.getFirst().floatValue()), Float.valueOf(fFloatValue2 - highOffset.getSecond().floatValue()));
        }
        Pair<Number, Number> lowValue = barChartVo.getLowValue();
        if (lowValue == null) {
            pair2 = null;
        } else {
            float fFloatValue3 = lowValue.getFirst().floatValue();
            float fFloatValue4 = lowValue.getSecond().floatValue();
            Pair<Number, Number> lowOffset = barChartVo.getLowOffset();
            pair2 = new Pair(Float.valueOf(fFloatValue3 + lowOffset.getFirst().floatValue()), Float.valueOf(fFloatValue4 - lowOffset.getSecond().floatValue()));
        }
        Pair<Number, Number> avgValue = barChartVo.getAvgValue();
        if (avgValue == null) {
            pair3 = null;
        } else {
            pair3 = new Pair(Float.valueOf(avgValue.getFirst().floatValue()), Float.valueOf(avgValue.getSecond().floatValue()));
        }
        return new BarChartVo<>(barChartVo.getIndex(), pair, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), pair2, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), barChartVo.getExtra(), pair3);
    }
}
