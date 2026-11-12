package com.huami.sleep.statistic.repo;

import android.content.Context;
import android.util.SparseArray;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.ChartUtil;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.sleep.R;
import com.huami.sleep.api.SleepWebApiImpl;
import com.huami.sleep.api.pojo.UserEventsResponse;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.helper.BarChartBuilder;
import com.huami.sleep.statistic.helper.SleepStageChartBuilder;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.vo.SleepBarChartVo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.snore.core.cloud.api.VoiceWebApiImpl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u001eH\u0002J\u0014\u0010#\u001a\u00020\"*\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J$\u0010&\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00061"}, d2 = {"Lcom/huami/sleep/statistic/repo/StageChartRepo;", "", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "b", "Ljava/util/Date;", "start", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "f", "c", "", "time", "e", GoogleApiAvailabilityLight.a, "h", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "data", "Lcom/huami/chart/data/YAxisData;", "g", "Lcom/huami/sleep/statistic/vo/SleepBarChartVo;", "l", "m", hl.k, GoogleApiAvailabilityLight.b, "", "day", "a", "", z.j, "Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "detail", "", "i", "getSummaryListCache", "Lcom/huami/sleep/statistic/helper/BarChartBuilder;", "getBarChartBuilder", "getBarChartData", "groupSummaryByMode", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/List;", "summaryListCache", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class StageChartRepo {

    @NotNull
    private static final String c = "ChartRepo";
    private static final int d = 3600;
    private static final int e = 5;
    private static final int f = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context = KoinExtKt.getAppContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<SleepAllInfo> summaryListCache = CollectionsKt__CollectionsKt.emptyList();

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/sleep/statistic/vo/SleepBarChartVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends SleepBarChartVo>> {
        public final /* synthetic */ List<SleepAllInfo> b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<SleepAllInfo> list, TimeMode timeMode) {
            super(0);
            this.b = list;
            this.c = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends SleepBarChartVo> getA() {
            return StageChartRepo.this.getBarChartData(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public final /* synthetic */ TimeMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TimeMode timeMode) {
            super(0);
            this.b = timeMode;
        }

        public final float a() {
            return StageChartRepo.this.b(this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<XAxisData> getA() {
            return StageChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SparseArray<YAxisData>> {
        public final /* synthetic */ TimeMode b;
        public final /* synthetic */ List<SleepAllInfo> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TimeMode timeMode, List<SleepAllInfo> list) {
            super(0);
            this.b = timeMode;
            this.c = list;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<YAxisData> getA() {
            StageChartRepo stageChartRepo = StageChartRepo.this;
            TimeMode timeMode = this.b;
            return stageChartRepo.g(timeMode, stageChartRepo.groupSummaryByMode(timeMode, this.c));
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getDailyXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getMonthXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getWeekXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "maxMinutes..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getYearXAxisData..." + this.a;
        }
    }

    private final int a(int day) {
        int i2 = (day + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float b(TimeMode timeMode) {
        UserEventsResponse.Companion companion = UserEventsResponse.INSTANCE;
        SleepWebApiImpl.Companion companion2 = SleepWebApiImpl.INSTANCE;
        VoiceWebApiImpl.Companion companion3 = VoiceWebApiImpl.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            return 0.0f;
        }
        if (i2 == 2) {
            return ChartUtil.dp2px(this.context, 30.0f);
        }
        if (i2 == 3) {
            return ChartUtil.dp2px(this.context, 6.0f);
        }
        if (i2 == 4) {
            return ChartUtil.dp2px(this.context, 16.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SparseArray<XAxisData> c() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        String[] strArr = {"00:00", "06:00", "12:00", "18:00", "23:59"};
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 * 21600;
            sparseArray.put(i4, new XAxisData(i4, strArr[i2]));
            if (i3 >= 5) {
                HMLog.debug(c, new e(sparseArray));
                return sparseArray;
            }
            i2 = i3;
        }
    }

    private final SparseArray<XAxisData> d(Date start) {
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
        HMLog.debug(c, new f(sparseArray));
        return sparseArray;
    }

    private final SparseArray<XAxisData> e(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(CommonTimeUtils.INSTANCE.getFirstDayOfWeekTime(time));
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            sparseArray.put(i2, new XAxisData(i2, calendar.getDisplayName(7, 1, Locale.getDefault())));
            calendar.add(6, 1);
            if (i3 > 7) {
                HMLog.debug(c, new g(sparseArray));
                return sparseArray;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<XAxisData> f(Date start, TimeMode timeMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return e(start.getTime());
        }
        if (i2 == 3) {
            return d(start);
        }
        if (i2 == 4) {
            return h(start);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<YAxisData> g(TimeMode timeMode, List<SleepAllInfo> data) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            return new SparseArray<>();
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        for (SleepAllInfo sleepAllInfo : data) {
            arrayList.add(Integer.valueOf(sleepAllInfo.getMainSleepDetail().getTotalDur() + sleepAllInfo.getMainSleepDetail().getAwakeDur() + sleepAllInfo.getNapSleepDetail().getTotalDur()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        int iIntValue = num == null ? 0 : num.intValue();
        HMLog.debug(c, new h(iIntValue));
        if (iIntValue == 0) {
            return sparseArray;
        }
        int i3 = iIntValue / 60;
        if (i3 % 2 == 0) {
            i3 += 2;
        } else {
            if (iIntValue % 60 != 0) {
                i3++;
            }
            if (i3 % 2 != 0) {
                i3++;
            }
        }
        int i4 = i3 % 3 == 0 ? i3 / 3 : i3 / 2;
        int i5 = 0;
        for (int i6 = 0; i6 <= i3; i6 += i4) {
            sparseArray.put(i5, new YAxisData(i6 * 60.0f, i6 + this.context.getString(R.string.unit_hour_long)));
            i5++;
        }
        return sparseArray;
    }

    private final SparseArray<XAxisData> h(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        int maximum = calendar.getMaximum(2);
        int i2 = 1;
        int i3 = maximum + 1;
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (1 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                sparseArray.put(i2, new XAxisData(i2, String.valueOf(i2)));
                if (i2 == i3) {
                    break;
                }
                i2 = i4;
            }
        }
        HMLog.debug(c, new i(sparseArray));
        return sparseArray;
    }

    private final void i(SleepDetail sleepDetail, SleepDetail sleepDetail2) {
        sleepDetail.setTotalDur(sleepDetail.getTotalDur() + sleepDetail2.getTotalDur());
        sleepDetail.setDeepDur(sleepDetail.getDeepDur() + sleepDetail2.getDeepDur());
        sleepDetail.setLightDur(sleepDetail.getLightDur() + sleepDetail2.getLightDur());
        sleepDetail.setRemDur(sleepDetail.getRemDur() + sleepDetail2.getRemDur());
        sleepDetail.setAwakeDur(sleepDetail.getAwakeDur() + sleepDetail2.getAwakeDur());
        sleepDetail.setEditDur(sleepDetail.getEditDur() + sleepDetail2.getEditDur());
    }

    private final List<SleepAllInfo> j(Map<Object, ? extends List<SleepAllInfo>> data) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Object, ? extends List<SleepAllInfo>> entry : data.entrySet()) {
            List<SleepAllInfo> value = entry.getValue();
            if (!value.isEmpty()) {
                SleepAllInfo sleepAllInfo = new SleepAllInfo(value.get(0).getTimeStamp(), value.get(0).getDate(), null, null, 12, null);
                for (SleepAllInfo sleepAllInfo2 : entry.getValue()) {
                    i(sleepAllInfo.getMainSleepDetail(), sleepAllInfo2.getMainSleepDetail());
                    i(sleepAllInfo.getNapSleepDetail(), sleepAllInfo2.getNapSleepDetail());
                }
                arrayList.add(sleepAllInfo);
            }
        }
        return arrayList;
    }

    private final List<SleepBarChartVo> k(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            arrayList2.add(Boolean.valueOf(arrayList.add(new SleepBarChartVo(calendar.get(5), CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(sleepAllInfo.getMainSleepDetail().getDeepDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getRemDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getAwakeDur()), Float.valueOf(sleepAllInfo.getNapSleepDetail().getTotalDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getLightDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getEditDur()))))));
        }
        return arrayList;
    }

    private final List<SleepBarChartVo> l(List<SleepAllInfo> list, TimeMode timeMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 2) {
            return m(list);
        }
        if (i2 != 3) {
            return i2 != 4 ? CollectionsKt__CollectionsKt.emptyList() : n(list);
        }
        return k(list);
    }

    private final List<SleepBarChartVo> m(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            boolean zStartsWith$default = m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
            int iA = calendar.get(7);
            if (!zStartsWith$default) {
                iA = a(iA);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new SleepBarChartVo(iA, CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(sleepAllInfo.getMainSleepDetail().getDeepDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getRemDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getAwakeDur()), Float.valueOf(sleepAllInfo.getNapSleepDetail().getTotalDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getLightDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getEditDur()))))));
        }
        return arrayList;
    }

    private final List<SleepBarChartVo> n(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            arrayList2.add(Boolean.valueOf(arrayList.add(new SleepBarChartVo(calendar.get(2) + 1, CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(sleepAllInfo.getMainSleepDetail().getDeepDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getRemDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getAwakeDur()), Float.valueOf(sleepAllInfo.getNapSleepDetail().getTotalDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getLightDur()), Float.valueOf(sleepAllInfo.getMainSleepDetail().getEditDur()))))));
        }
        return arrayList;
    }

    @NotNull
    public final BarChartBuilder getBarChartBuilder(@NotNull Date start, @NotNull TimeMode timeMode, @NotNull List<SleepAllInfo> data) {
        return new SleepStageChartBuilder(this.context, new a(data, timeMode), new b(timeMode), new c(start, timeMode), new d(timeMode, data));
    }

    @NotNull
    public final List<SleepBarChartVo> getBarChartData(@NotNull List<SleepAllInfo> data, @NotNull TimeMode timeMode) {
        List<SleepAllInfo> listGroupSummaryByMode = groupSummaryByMode(timeMode, data);
        this.summaryListCache = listGroupSummaryByMode;
        return l(listGroupSummaryByMode, timeMode);
    }

    @NotNull
    public final List<SleepAllInfo> getSummaryListCache() {
        return this.summaryListCache;
    }

    @NotNull
    public final List<SleepAllInfo> groupSummaryByMode(@NotNull TimeMode timeMode, @NotNull List<SleepAllInfo> data) {
        if (WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()] != 4) {
            return data;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : data) {
            String timeYM = SleepTimeUtil.INSTANCE.formatTimeYM(((SleepAllInfo) obj).getTimeStamp());
            Object arrayList = linkedHashMap.get(timeYM);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(timeYM, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return j(linkedHashMap);
    }
}
