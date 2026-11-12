package com.huami.sleep.util;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/sleep/util/ChartXAxisUtil;", "", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "b", "Ljava/util/Date;", "start", "a", "c", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "getXAxisDataByType", "", "Ljava/lang/String;", "TAG", "", LogUtil.I, "secInHour", "xCount", GoogleApiAvailabilityLight.a, "daysOfWeek", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class ChartXAxisUtil {

    @NotNull
    public static final ChartXAxisUtil INSTANCE = new ChartXAxisUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartXAxisUtil";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int secInHour = 3600;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int xCount = 5;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int daysOfWeek = 7;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
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
            return "getMonthXAxisData..." + this.a;
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
            return "getWeekXAxisData..." + this.a;
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
            return "getYearXAxisData..." + this.a;
        }
    }

    private ChartXAxisUtil() {
    }

    private final SparseArray<XAxisData> a(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        calendar.set(5, 1);
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        sparseArray.put(1, new XAxisData(1, SleepTimeUtil.formatTimeMD$default(sleepTimeUtil, null, calendar.getTimeInMillis(), 1, null)));
        calendar.set(5, 10);
        sparseArray.put(10, new XAxisData(10, SleepTimeUtil.formatTimeMD$default(sleepTimeUtil, null, calendar.getTimeInMillis(), 1, null)));
        calendar.set(5, 20);
        sparseArray.put(20, new XAxisData(20, SleepTimeUtil.formatTimeMD$default(sleepTimeUtil, null, calendar.getTimeInMillis(), 1, null)));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        sparseArray.put(actualMaximum, new XAxisData(actualMaximum, SleepTimeUtil.formatTimeMD$default(sleepTimeUtil, null, calendar.getTimeInMillis(), 1, null)));
        HMLog.debug(TAG, new a(sparseArray));
        return sparseArray;
    }

    private final SparseArray<XAxisData> b(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(CommonTimeUtils.INSTANCE.getFirstDayOfWeekTime(time));
        int i = 1;
        while (true) {
            int i2 = i + 1;
            sparseArray.put(i, new XAxisData(i, calendar.getDisplayName(7, 1, Locale.getDefault())));
            calendar.add(6, 1);
            if (i2 > 7) {
                HMLog.debug(TAG, new b(sparseArray));
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<XAxisData> c(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
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
        HMLog.debug(TAG, new c(sparseArray));
        return sparseArray;
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisDataByType(@NotNull Date start, @NotNull TimeMode timeMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return b(start.getTime());
        }
        if (i != 2) {
            return i != 3 ? new SparseArray<>() : c(start);
        }
        return a(start);
    }
}
