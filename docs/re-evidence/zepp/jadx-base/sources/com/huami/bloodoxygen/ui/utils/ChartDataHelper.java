package com.huami.bloodoxygen.ui.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenDateData;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.vo.ChartParams;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J.\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J(\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001b\u0010#\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010'\u001a\u00020$H\u0000¢\u0006\u0004\b%\u0010&J,\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u0016\u0010,\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010-¨\u00062"}, d2 = {"Lcom/huami/bloodoxygen/ui/utils/ChartDataHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "date", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "g", "Lcom/huami/chart/data/YAxisData;", "h", "c", "f", "e", "i", "", WebConstant.QueryParam.START_TIME, "", "Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenDateData;", "dataArray", "Lcom/huami/chart/data/ChartDataList;", "a", "", "start", "end", "Lcom/huami/chart/data/ColorSegmentBar;", "b", "", "timeFormatted", "timestamp", GoogleApiAvailabilityLight.a, "toValuePerCent$ui_release", "(ILandroid/content/Context;)Ljava/lang/String;", "toValuePerCent", "", "isRtl$ui_release", "()Z", "isRtl", "startTime", "Lcom/huami/bloodoxygen/ui/vo/ChartParams;", "getChartParams", "Ljava/lang/String;", "TAG", LogUtil.I, "Y_Axis_COUNT", "DAY_XAxisData_COUNT", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartDataHelper {

    @NotNull
    public static final ChartDataHelper INSTANCE = new ChartDataHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartDataConverter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int Y_Axis_COUNT = 5;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int DAY_XAxisData_COUNT = 5;

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
            return "getDailyXAxisData..." + this.a;
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
            return "getWeekXAxisData..." + this.a;
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
            return "getYearXAxisData..." + this.a;
        }
    }

    private ChartDataHelper() {
    }

    private final ChartDataList a(Context context, long startTimestamp, List<BloodOxygenDateData> dataArray, TimeMode timeMode) {
        SparseArray sparseArray = new SparseArray();
        for (BloodOxygenDateData bloodOxygenDateData : dataArray) {
            ArrayList arrayList = new ArrayList();
            if (!(bloodOxygenDateData.getValues().length == 0)) {
                if (bloodOxygenDateData.getValues().length == 1) {
                    arrayList.add(INSTANCE.b(context, ArraysKt___ArraysKt.first(bloodOxygenDateData.getValues()), ArraysKt___ArraysKt.first(bloodOxygenDateData.getValues())));
                } else {
                    int i = 1;
                    int i2 = 0;
                    while (i < bloodOxygenDateData.getValues().length) {
                        int i3 = i - 1;
                        if (bloodOxygenDateData.getValues()[i] - bloodOxygenDateData.getValues()[i3] > 1) {
                            arrayList.add(INSTANCE.b(context, bloodOxygenDateData.getValues()[i2], bloodOxygenDateData.getValues()[i3]));
                            i2 = i;
                        }
                        i++;
                    }
                    arrayList.add(INSTANCE.b(context, bloodOxygenDateData.getValues()[i2], bloodOxygenDateData.getValues()[i - 1]));
                }
            }
            ChartDataHelper chartDataHelper = INSTANCE;
            String date = bloodOxygenDateData.getDate();
            int i4 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
            int iD = chartDataHelper.d(date, startTimestamp, i4 != 1 ? i4 != 4 ? BloodOxygenUtils.INSTANCE.yMDToTimestamp(bloodOxygenDateData.getDate()) : BloodOxygenUtils.INSTANCE.yMToTimestamp(bloodOxygenDateData.getDate()) : BloodOxygenUtils.INSTANCE.yMDHMSToTimestamp(bloodOxygenDateData.getDate()), timeMode);
            Object[] array = arrayList.toArray(new ColorSegmentBar[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            sparseArray.put(iD, new ChartData(iD, (ColorSegmentBar[]) array));
        }
        return new ChartDataList(sparseArray);
    }

    private final ColorSegmentBar b(Context context, int start, int end) throws Exception {
        if (start <= end) {
            if (80 <= start && start <= 100) {
                if (80 <= end && end <= 100) {
                    return new ColorSegmentBar(start, end, ContextCompat.getColor(context, R.color.s51));
                }
            }
        }
        throw new Exception("getColorSegmentBar start(" + start + ") or end(" + end + ") not valid");
    }

    private final SparseArray<XAxisData> c(Context context) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        long etcDayZeroTime = TimeUtils.INSTANCE.getEtcDayZeroTime();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3 = i * 6;
            long j = ((long) (i3 * 3600 * 1000)) + etcDayZeroTime;
            if (i == 4) {
                j--;
            }
            if (i3 == 24) {
                i3 = 23;
            }
            sparseArray.put(i3, new XAxisData(i3, TimeUtils.INSTANCE.formatTimeHMInEtc(context, j)));
            if (i2 >= 5) {
                HMLog.info(TAG, new a(sparseArray));
                return sparseArray;
            }
            i = i2;
        }
    }

    private final int d(String timeFormatted, long startTimestamp, long timestamp, TimeMode timeMode) {
        int i;
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTimestamp);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timestamp);
        int i3 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i3 == 1) {
            Calendar calendar3 = Calendar.getInstance();
            TimeUtils timeUtils = TimeUtils.INSTANCE;
            calendar3.setTimeZone(timeUtils.getEtcTimeZone());
            calendar3.setTimeInMillis(timeUtils.getEtcTime(timeFormatted));
            return calendar3.get(11);
        }
        if (i3 == 2) {
            TimeUtils timeUtils2 = TimeUtils.INSTANCE;
            return timeUtils2.getDayOfWeek(timestamp) - timeUtils2.getDayOfWeek(startTimestamp);
        }
        if (i3 != 3) {
            i = calendar2.get(2);
            i2 = calendar.get(2);
        } else {
            i = calendar2.get(5);
            i2 = calendar.get(5);
        }
        return i - i2;
    }

    private final SparseArray<XAxisData> e(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        calendar.setTimeInMillis(timeUtils.getFirstDayOfMonthTime(date.getTime()));
        sparseArray.put(0, new XAxisData(0, timeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(9, new XAxisData(9, timeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(19, new XAxisData(19, timeUtils.formatTimeMD(calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        int i = actualMaximum - 1;
        sparseArray.put(i, new XAxisData(i, timeUtils.formatTimeMD(calendar.getTimeInMillis())));
        HMLog.debug(TAG, new b(sparseArray));
        return sparseArray;
    }

    private final SparseArray<XAxisData> f(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = 1;
        while (true) {
            int i2 = i + 1;
            calendar.set(7, i2 % 7);
            int i3 = i - 1;
            sparseArray.put(i3, new XAxisData(i3, calendar.getDisplayName(7, 1, Locale.getDefault())));
            if (i2 > 7) {
                HMLog.info(TAG, new c(sparseArray));
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<XAxisData> g(Context context, Date date, TimeMode timeMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return c(context);
        }
        if (i == 2) {
            return f(date);
        }
        if (i == 3) {
            return e(date);
        }
        if (i == 4) {
            return i(date);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SparseArray<YAxisData> h(Context context) {
        String valuePerCent$ui_release;
        float f = 20.0f / 4;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f2 = 80.0f + (i * f);
            int i3 = Integer.parseInt(DataExKt.formatWithDecimal(Float.valueOf(f2), 0));
            if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar")) {
                valuePerCent$ui_release = "%" + ExtensionsKt.formatToLocale(i3);
            } else {
                valuePerCent$ui_release = INSTANCE.toValuePerCent$ui_release(i3, context);
            }
            sparseArray.put(i, new YAxisData(f2, valuePerCent$ui_release));
            if (i2 >= 5) {
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<XAxisData> i(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int maximum = calendar.getMaximum(2);
        if (maximum >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                sparseArray.put(i, new XAxisData(i, ExtensionsKt.formatToLocale(i2)));
                if (i == maximum) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.debug(TAG, new d(sparseArray));
        return sparseArray;
    }

    @NotNull
    public final ChartParams getChartParams(@NotNull Context context, long startTime, @NotNull TimeMode timeMode, @NotNull List<BloodOxygenDateData> dataArray) {
        return new ChartParams(g(context, new Date(startTime), timeMode), h(context), a(context, startTime, dataArray, timeMode));
    }

    public final boolean isRtl$ui_release() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    @NotNull
    public final String toValuePerCent$ui_release(int i, @NotNull Context context) {
        return context.getString(R.string.bo_ui_value_percent, Integer.valueOf(i));
    }
}
