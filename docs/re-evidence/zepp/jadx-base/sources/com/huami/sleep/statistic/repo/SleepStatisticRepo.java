package com.huami.sleep.statistic.repo;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.datasource.ISleepStatisticDataSource;
import com.huami.sleep.daysleep.quotient.SleepQuotientDto;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.daysleep.quotient.SleepQuotientProvider;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleepintrodetail.vo.AvgTipInfoVo;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b+\u0010,J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0015H\u0016JI\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00042\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010$\u001a\u0004\u0018\u00010#2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)¨\u0006-"}, d2 = {"Lcom/huami/sleep/statistic/repo/SleepStatisticRepo;", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Lkotlin/Pair;", "", GoogleApiAvailabilityLight.a, "", "c", "Ljava/util/Date;", "date", "", "b", "fallAsleepTime", "sleepTime", "a", "wakeUpTime", "e", "userId", "startTime", "endTime", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSleepInfo", "data", "Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "getAvgTipInfo", "", "checkConfigChanged", "odiScore", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "getSleepQuotientInfo", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/huami/sleep/statistic/dto/TimeParam;)Lkotlin/Pair;", "getSelectedAvgInfo", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "getSleepShareInfo", "Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "statisticDataSource", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/huami/sleep/datasource/ISleepStatisticDataSource;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStatisticRepo implements ISleepStatisticRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepStatisticDataSource statisticDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context = KoinExtKt.getAppContext();

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Integer> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.a = i;
        }

        public final int a(int i) {
            int i2 = this.a;
            if (i2 != 0) {
                return i / i2;
            }
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(a(num.intValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Integer> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.a = i;
        }

        public final int a(int i) {
            int i2 = this.a;
            if (i2 != 0) {
                return i / i2;
            }
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(a(num.intValue()));
        }
    }

    public SleepStatisticRepo(@NotNull ISleepStatisticDataSource iSleepStatisticDataSource) {
        this.statisticDataSource = iSleepStatisticDataSource;
    }

    private final int a(long fallAsleepTime, long sleepTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sleepTime);
        Unit unit = Unit.INSTANCE;
        SportDay sportDay = new SportDay(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(fallAsleepTime);
        return new SportDay(calendar2).before(sportDay) ? b(new Date(fallAsleepTime)) + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN : b(new Date(fallAsleepTime));
    }

    private final int b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    private final String c(TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        Pair<Long, Long> timeRange = sleepTimeUtil.getTimeRange(timeParam);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = timeRange.getSecond().longValue();
        if (timeRange.getSecond().longValue() <= jCurrentTimeMillis) {
            jCurrentTimeMillis = jLongValue;
        }
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            sb.append(sleepTimeUtil.formatTimeYMD(time));
        } else if (i == 2 || i == 3 || i == 4) {
            sb.append(sleepTimeUtil.formatTimeMMddWithUnit(timeRange.getFirst().longValue()));
            sb.append(" - ");
            sb.append(sleepTimeUtil.formatTimeMMddWithUnit(jCurrentTimeMillis));
        }
        return sb.toString();
    }

    private final Pair<Long, Long> d(TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return new Pair<>(Long.valueOf(SleepTimeUtil.INSTANCE.getDayStartTime(time)), Long.valueOf(jCurrentTimeMillis));
        }
        if (i == 2) {
            return new Pair<>(Long.valueOf(SleepTimeUtil.INSTANCE.getFirstDayOfWeekTime(time)), Long.valueOf(jCurrentTimeMillis));
        }
        if (i == 3) {
            return new Pair<>(Long.valueOf(SleepTimeUtil.INSTANCE.getFirstDayOfMonthTime(time)), Long.valueOf(jCurrentTimeMillis));
        }
        if (i == 4) {
            return new Pair<>(Long.valueOf(SleepTimeUtil.INSTANCE.getFirstDayOfYearTime(time)), Long.valueOf(jCurrentTimeMillis));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int e(long wakeUpTime) {
        return b(new Date(wakeUpTime));
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @NotNull
    public LiveData<Boolean> checkConfigChanged() {
        return KoinExtKt.getAppFunctions().checkConfigChanged();
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @NotNull
    public AvgTipInfoVo getAvgTipInfo(@NotNull List<SleepAllInfo> data, @NotNull TimeParam timeParam) {
        AvgTipInfoVo avgTipInfoVo = new AvgTipInfoVo(null, null, null, 7, null);
        int size = data.size();
        int totalDur = 0;
        for (SleepAllInfo sleepAllInfo : data) {
            totalDur += sleepAllInfo.getMainSleepDetail().getTotalDur() + sleepAllInfo.getNapSleepDetail().getTotalDur();
        }
        avgTipInfoVo.setAvgValue(size != 0 ? Integer.valueOf(totalDur / size) : null);
        avgTipInfoVo.setDate(SleepTimeUtil.INSTANCE.getTimeToUi(timeParam));
        int i = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
        avgTipInfoVo.setTitle((i == 2 || i == 3) ? this.context.getString(R.string.daily_sleep_duration) : i != 4 ? "" : this.context.getString(R.string.month_daily_sleep_duration));
        return avgTipInfoVo;
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @NotNull
    public AvgTipInfoVo getSelectedAvgInfo(@NotNull SleepAllInfo data, @NotNull TimeParam timeParam) {
        String dateTimeForYMD;
        AvgTipInfoVo avgTipInfoVo = new AvgTipInfoVo(null, null, null, 7, null);
        avgTipInfoVo.setAvgValue(Integer.valueOf(data.getMainSleepDetail().getTotalDur() + data.getNapSleepDetail().getTotalDur()));
        TimeMode mode = timeParam.getMode();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[mode.ordinal()];
        String string = "";
        if (i == 2 || i == 3) {
            dateTimeForYMD = SleepTimeUtil.INSTANCE.formatDateTimeForYMD(data.getTimeStamp());
        } else {
            dateTimeForYMD = i != 4 ? "" : SleepTimeUtil.INSTANCE.formatDateTimeForYM(data.getTimeStamp());
        }
        avgTipInfoVo.setDate(dateTimeForYMD);
        int i2 = iArr[timeParam.getMode().ordinal()];
        if (i2 == 2 || i2 == 3) {
            string = this.context.getString(R.string.daily_sleep_duration);
        } else if (i2 == 4) {
            string = this.context.getString(R.string.month_daily_sleep_duration);
        }
        avgTipInfoVo.setTitle(string);
        return avgTipInfoVo;
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @NotNull
    public LiveData<List<SleepAllInfo>> getSleepInfo(@NotNull String userId, long startTime, long endTime) {
        return Transformations.map(this.statisticDataSource.getSleepInfo(userId, startTime, endTime), new Function<List<? extends SleepAllInfo>, List<? extends SleepAllInfo>>() { // from class: com.huami.sleep.statistic.repo.SleepStatisticRepo$getSleepInfo$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends SleepAllInfo> apply(List<? extends SleepAllInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    SleepAllInfo sleepAllInfo = (SleepAllInfo) obj;
                    if (!(sleepAllInfo.getMainSleepDetail().getTotalDur() == 0 && sleepAllInfo.getNapSleepDetail().getTotalDur() == 0)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @NotNull
    public Pair<Integer, List<SleepQuotientParam>> getSleepQuotientInfo(@NotNull String userId, @NotNull List<SleepAllInfo> data, @Nullable Integer odiScore, @NotNull TimeParam timeParam) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((SleepAllInfo) obj).getMainSleepDetail().getTotalDur() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            SleepAllInfo sleepAllInfo = (SleepAllInfo) obj2;
            if (!(sleepAllInfo.getMainSleepDetail().getTotalDur() == sleepAllInfo.getMainSleepDetail().getEditDur())) {
                arrayList2.add(obj2);
            }
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        Iterator it2 = arrayList.iterator();
        int totalDur = 0;
        while (it2.hasNext()) {
            totalDur += ((SleepAllInfo) it2.next()).getMainSleepDetail().getTotalDur();
        }
        Iterator it3 = arrayList2.iterator();
        int score = 0;
        while (it3.hasNext()) {
            score += ((SleepAllInfo) it3.next()).getMainSleepDetail().getScore();
        }
        Iterator it4 = arrayList2.iterator();
        int deepDur = 0;
        while (it4.hasNext()) {
            deepDur += ((SleepAllInfo) it4.next()).getMainSleepDetail().getDeepDur();
        }
        Iterator it5 = arrayList2.iterator();
        int lightDur = 0;
        while (it5.hasNext()) {
            lightDur += ((SleepAllInfo) it5.next()).getMainSleepDetail().getLightDur();
        }
        Iterator it6 = arrayList2.iterator();
        int remDur = 0;
        while (it6.hasNext()) {
            remDur += ((SleepAllInfo) it6.next()).getMainSleepDetail().getRemDur();
        }
        Iterator it7 = arrayList2.iterator();
        int awakeCount = 0;
        while (it7.hasNext()) {
            awakeCount += ((SleepAllInfo) it7.next()).getMainSleepDetail().getAwakeCount();
        }
        int iA = 0;
        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
            SleepAllInfo sleepAllInfo2 = (SleepAllInfo) it8.next();
            iA += a(sleepAllInfo2.getMainSleepDetail().getStartTime(), sleepAllInfo2.getTimeStamp());
            totalDur = totalDur;
        }
        int i = totalDur;
        Iterator it9 = arrayList.iterator();
        int iE = 0;
        while (it9.hasNext()) {
            iE += e(((SleepAllInfo) it9.next()).getMainSleepDetail().getEndTime());
        }
        Iterator it10 = arrayList2.iterator();
        int intoDuration = 0;
        while (it10.hasNext()) {
            intoDuration += ((SleepAllInfo) it10.next()).getMainSleepDetail().getIntoDuration();
        }
        PercentageCalculateUtil percentageCalculateUtil = PercentageCalculateUtil.INSTANCE;
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(Integer.valueOf(deepDur));
        arrayList3.add(Integer.valueOf(lightDur));
        arrayList3.add(Integer.valueOf(remDur));
        Unit unit = Unit.INSTANCE;
        int[] iArrCalculatePercentages = percentageCalculateUtil.calculatePercentages(arrayList3, 100);
        a aVar = new a(size);
        b bVar = new b(size2);
        Pair<Long, Long> timeRange = SleepTimeUtil.INSTANCE.getTimeRange(timeParam);
        return SleepQuotientProvider.INSTANCE.getQuotientData(userId, timeParam, new SleepQuotientDto(aVar.invoke(Integer.valueOf(i)).intValue(), bVar.invoke(Integer.valueOf(score)).intValue(), aVar.invoke(Integer.valueOf(intoDuration)).intValue(), iArrCalculatePercentages[0], iArrCalculatePercentages[1], iArrCalculatePercentages[2], true, bVar.invoke(Integer.valueOf(awakeCount)).intValue(), aVar.invoke(Integer.valueOf(iA)).intValue(), aVar.invoke(Integer.valueOf(iE)).intValue(), timeRange.getFirst().longValue(), timeRange.getSecond().longValue(), true, false, null, 24576, null));
    }

    @Override // com.huami.sleep.statistic.repo.ISleepStatisticRepo
    @Nullable
    public ShareSleepVo getSleepShareInfo(@NotNull List<SleepAllInfo> data, @NotNull TimeParam timeParam) {
        String string;
        ArrayList<SleepAllInfo> arrayList = new ArrayList();
        Iterator<T> it2 = data.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((SleepAllInfo) next).getMainSleepDetail().getTotalDur() > 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            SleepAllInfo sleepAllInfo = (SleepAllInfo) obj;
            if (!(sleepAllInfo.getMainSleepDetail().getTotalDur() == sleepAllInfo.getMainSleepDetail().getEditDur())) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        Iterator it3 = arrayList2.iterator();
        int score = 0;
        while (it3.hasNext()) {
            score += ((SleepAllInfo) it3.next()).getMainSleepDetail().getScore();
        }
        Iterator it4 = arrayList.iterator();
        int deepDur = 0;
        while (it4.hasNext()) {
            deepDur += ((SleepAllInfo) it4.next()).getMainSleepDetail().getDeepDur();
        }
        int iA = 0;
        for (SleepAllInfo sleepAllInfo2 : arrayList) {
            iA += a(sleepAllInfo2.getMainSleepDetail().getStartTime(), sleepAllInfo2.getTimeStamp());
        }
        Iterator it5 = arrayList.iterator();
        int iB = 0;
        while (it5.hasNext()) {
            iB += b(new Date(((SleepAllInfo) it5.next()).getMainSleepDetail().getEndTime()));
        }
        Pair<Long, Long> pairD = d(new TimeParam(timeParam.getMode(), System.currentTimeMillis()));
        int i = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
        if (i == 2) {
            long jLongValue = pairD.getFirst().longValue();
            long jLongValue2 = pairD.getSecond().longValue();
            long time = timeParam.getTime();
            string = jLongValue <= time && time <= jLongValue2 ? this.context.getString(R.string.share_sleep_this_week_title_v3) : this.context.getString(R.string.share_sleep_week_title_v3);
        } else if (i == 3) {
            long jLongValue3 = pairD.getFirst().longValue();
            long jLongValue4 = pairD.getSecond().longValue();
            long time2 = timeParam.getTime();
            string = jLongValue3 <= time2 && time2 <= jLongValue4 ? this.context.getString(R.string.share_sleep_this_month_title_v3) : this.context.getString(R.string.share_sleep_month_title);
        } else if (i != 4) {
            string = "";
        } else {
            long jLongValue5 = pairD.getFirst().longValue();
            long jLongValue6 = pairD.getSecond().longValue();
            long time3 = timeParam.getTime();
            string = jLongValue5 <= time3 && time3 <= jLongValue6 ? this.context.getString(R.string.share_sleep_this_year_title_v4) : this.context.getString(R.string.share_sleep_year_title_v4);
        }
        String str = string;
        if (size <= 0 || score <= 0) {
            return null;
        }
        return new ShareSleepVo(c(timeParam), str, score / size2, deepDur / size, iA / size, iB / size);
    }
}
