package com.huami.heartrate.chart;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.heartrate.R;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\f\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f\u001a\f\u0010\u0011\u001a\u00020\u000f*\u00020\u0005H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0012\"\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018*j\u0010\"\"2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001a22\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001a*j\u0010%\"2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u001a22\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u001a*\u0016\u0010'\"\b\u0012\u0004\u0012\u00020!0&2\b\u0012\u0004\u0012\u00020!0&*\u0016\u0010(\"\b\u0012\u0004\u0012\u00020!0&2\b\u0012\u0004\u0012\u00020!0&¨\u0006)"}, d2 = {"Ljava/util/Date;", "date", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getMonthXAxis", "", SleepAnalysisFragment.TIME_MODE, "getXAxisData", "c", "e", GoogleApiAvailabilityLight.a, "f", "maxY", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getRoundUpTen", "a", "Landroid/view/View;", Constant.PAI_KEY_DAILY_PAI, "b", "", "isRtl", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function2;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "Lcom/huami/heartrate/vo/BarChartVo;", "data", "", "OnBarTouchDownValue", "Lcom/huami/chart/chart/HMChart;", "chart", "OnTouchDownValue", "Lkotlin/Function0;", "OnTouchEmptyArea", "OnTouchUpValue", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HRChartHelperKt {

    @NotNull
    private static final String a = "HRChartHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getDayXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getMonthXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getMonthXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getWeekXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getYearXAxisData..." + this.a;
        }
    }

    private static final float a(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    private static final float b(View view, int i) {
        return TypedValue.applyDimension(1, i, view.getContext().getResources().getDisplayMetrics());
    }

    private static final SparseArray<XAxisData> c() {
        String[] day_chart_array = ConstantKt.getDAY_CHART_ARRAY();
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int length = day_chart_array.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int length2 = (((i * 24) * 60) / (day_chart_array.length - 1)) / 5;
                sparseArray.put(length2, new XAxisData(length2, day_chart_array[i]));
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.info(a, new a(sparseArray));
        return sparseArray;
    }

    private static final SparseArray<XAxisData> d(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (date == null) {
            return sparseArray;
        }
        Calendar calendar = Calendar.getInstance();
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        calendar.setTimeInMillis(heartRateTimeUtils.getFirstDayOfMonthTime(date.getTime()));
        sparseArray.put(1, new XAxisData(1, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(10, new XAxisData(10, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(20, new XAxisData(20, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        sparseArray.put(actualMaximum, new XAxisData(actualMaximum, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        HMLog.debug(a, new c(sparseArray));
        return sparseArray;
    }

    private static final SparseArray<XAxisData> e() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        String[] stringArray = KoinExtKt.getAppContext().getResources().getStringArray(R.array.heart_rate_weeks_abbr);
        int i = 1;
        while (true) {
            int i2 = i + 1;
            sparseArray.put(i, new XAxisData(i, stringArray[i - 1]));
            if (i2 > 7) {
                HMLog.info(a, new d(sparseArray));
                return sparseArray;
            }
            i = i2;
        }
    }

    private static final SparseArray<XAxisData> f(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (date == null) {
            return sparseArray;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int maximum = calendar.getMaximum(2);
        int i = 1;
        int i2 = maximum + 1;
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
        HMLog.debug(a, new e(sparseArray));
        return sparseArray;
    }

    @NotNull
    public static final SparseArray<XAxisData> getMonthXAxis(@Nullable Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (date == null) {
            return sparseArray;
        }
        Calendar calendar = Calendar.getInstance();
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        calendar.setTimeInMillis(heartRateTimeUtils.getFirstDayOfMonthTime(date.getTime()));
        sparseArray.put(0, new XAxisData(0, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(9, new XAxisData(9, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(19, new XAxisData(19, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        int i = actualMaximum - 1;
        sparseArray.put(i, new XAxisData(i, heartRateTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        HMLog.debug(a, new b(sparseArray));
        return sparseArray;
    }

    public static final float getRoundUpTen(float f) {
        double d2 = 100;
        return (float) (BigDecimal.valueOf(((double) f) / d2).setScale(1, 0).doubleValue() * d2);
    }

    @NotNull
    public static final SparseArray<XAxisData> getXAxisData(int i, @Nullable Date date) {
        switch (i) {
            case 16:
                return c();
            case 17:
                return e();
            case 18:
                return d(date);
            case 19:
                return f(date);
            default:
                return new SparseArray<>();
        }
    }

    public static /* synthetic */ SparseArray getXAxisData$default(int i, Date date, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            date = null;
        }
        return getXAxisData(i, date);
    }

    @NotNull
    public static final SparseArray<YAxisData> getYAxisData(int i) {
        int i2 = i % 3 != 0 ? 2 : 3;
        int i3 = i / i2;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i4 = 0;
        if (i2 >= 0) {
            while (true) {
                int i5 = i4 + 1;
                int i6 = i4 * i3;
                sparseArray.put(i4, new YAxisData(i6, String.valueOf(i6)));
                if (i4 == i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return sparseArray;
    }

    public static final boolean isRtl(@NotNull View view) {
        return view.getLayoutDirection() == 1;
    }
}
