package com.huami.sleep.statistic.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.sleep.datasource.ISleepStatisticDataSource;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.sleepanalysis.dto.SleepAnalysisData;
import com.huami.sleep.statistic.sleepanalysis.repo.ISleepAnalysisRepo;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.sleep.util.SleepTimeUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000e\u001a\u00020\n*\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/statistic/repo/SleepAnalysisRepo;", "Lcom/huami/sleep/statistic/sleepanalysis/repo/ISleepAnalysisRepo;", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Lkotlin/Pair;", "", "b", "Lcom/huami/sleep/statistic/sleepanalysis/dto/SleepAnalysisData;", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "sleep", "", "c", "", "size", "a", "", "userId", "Landroidx/lifecycle/LiveData;", "getSleepAnalysisData", "", "sleepInfo", "calAnalysisData", "Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "statisticDataSource", "<init>", "(Lcom/huami/sleep/datasource/ISleepStatisticDataSource;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAnalysisRepo implements ISleepAnalysisRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepStatisticDataSource statisticDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SleepAnalysisRepo(@NotNull ISleepStatisticDataSource iSleepStatisticDataSource) {
        this.statisticDataSource = iSleepStatisticDataSource;
    }

    private final void a(SleepAnalysisData sleepAnalysisData, int i) {
        sleepAnalysisData.setAvgNightSleepScore(sleepAnalysisData.getAvgNightSleepScore() / i);
        sleepAnalysisData.setAvgDpRatio(sleepAnalysisData.getAvgDpRatio() / i);
        sleepAnalysisData.setAvgLightRatio(sleepAnalysisData.getAvgLightRatio() / i);
        sleepAnalysisData.setAvgRemRatio(sleepAnalysisData.getAvgRemRatio() / i);
        sleepAnalysisData.setAvgNightSleepTime(sleepAnalysisData.getAvgNightSleepTime() / i);
        sleepAnalysisData.setAvgAwakeCount(sleepAnalysisData.getAvgAwakeCount() / i);
        sleepAnalysisData.setAvgIntoSleepTime(sleepAnalysisData.getAvgIntoSleepTime() / i);
    }

    private final Pair<Long, Long> b(TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            return new Pair<>(Long.valueOf(sleepTimeUtil.getDayStartTime(time)), Long.valueOf(sleepTimeUtil.getDayEndTime(time)));
        }
        if (i == 2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timeParam.getTime() - ((long) 604800000));
            SleepTimeUtil sleepTimeUtil2 = SleepTimeUtil.INSTANCE;
            return new Pair<>(Long.valueOf(sleepTimeUtil2.getFirstDayOfWeekTime(calendar.getTimeInMillis())), Long.valueOf(sleepTimeUtil2.getLastDayOfWeekTime(time)));
        }
        if (i != 3) {
            return new Pair<>(0L, 0L);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeParam.getTime());
        calendar2.add(2, -1);
        SleepTimeUtil sleepTimeUtil3 = SleepTimeUtil.INSTANCE;
        return new Pair<>(Long.valueOf(sleepTimeUtil3.getFirstDayOfMonthTime(calendar2.getTimeInMillis())), Long.valueOf(sleepTimeUtil3.getLastDayOfMonthTime(time)));
    }

    private final void c(SleepAnalysisData sleepAnalysisData, SleepAllInfo sleepAllInfo) {
        sleepAnalysisData.setAvgNightSleepScore(sleepAnalysisData.getAvgNightSleepScore() + sleepAllInfo.getMainSleepDetail().getScore());
        sleepAnalysisData.setAvgDpRatio(sleepAnalysisData.getAvgDpRatio() + sleepAllInfo.getMainSleepDetail().getDeepDur());
        sleepAnalysisData.setAvgLightRatio(sleepAnalysisData.getAvgLightRatio() + sleepAllInfo.getMainSleepDetail().getLightDur());
        sleepAnalysisData.setAvgRemRatio(sleepAnalysisData.getAvgRemRatio() + sleepAllInfo.getMainSleepDetail().getRemDur());
        sleepAnalysisData.setAvgNightSleepTime(sleepAnalysisData.getAvgNightSleepTime() + sleepAllInfo.getMainSleepDetail().getTotalDur());
        sleepAnalysisData.setAvgAwakeCount(sleepAnalysisData.getAvgAwakeCount() + sleepAllInfo.getMainSleepDetail().getAwakeCount());
        sleepAnalysisData.setAvgIntoSleepTime(sleepAnalysisData.getAvgIntoSleepTime() + sleepAllInfo.getMainSleepDetail().getStartIndex());
    }

    @Nullable
    public final SleepAnalysisData calAnalysisData(@NotNull TimeParam timeParam, @NotNull List<SleepAllInfo> sleepInfo) {
        Pair<Long, Long> timeRange = SleepTimeUtil.INSTANCE.getTimeRange(timeParam);
        ArrayList<SleepAllInfo> arrayList = new ArrayList();
        Iterator<T> it2 = sleepInfo.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            long jLongValue = timeRange.getFirst().longValue();
            long jLongValue2 = timeRange.getSecond().longValue();
            long timeStamp = ((SleepAllInfo) next).getTimeStamp();
            if (jLongValue <= timeStamp && timeStamp <= jLongValue2) {
                arrayList.add(next);
            }
        }
        ArrayList<SleepAllInfo> arrayList2 = new ArrayList();
        for (Object obj : sleepInfo) {
            long jLongValue3 = timeRange.getFirst().longValue();
            long jLongValue4 = timeRange.getSecond().longValue();
            long timeStamp2 = ((SleepAllInfo) obj).getTimeStamp();
            if (!(jLongValue3 <= timeStamp2 && timeStamp2 <= jLongValue4)) {
                arrayList2.add(obj);
            }
        }
        if (sleepInfo.isEmpty() || arrayList.isEmpty()) {
            return null;
        }
        SleepAnalysisData sleepAnalysisData = new SleepAnalysisData();
        sleepAnalysisData.setInvalidDay(arrayList.size());
        for (SleepAllInfo sleepAllInfo : arrayList) {
            c(sleepAnalysisData, sleepAllInfo);
            sleepAnalysisData.setLongestNightSleepTime(Math.max(sleepAnalysisData.getLongestNightSleepTime(), sleepAllInfo.getMainSleepDetail().getTotalDur()));
            sleepAnalysisData.setShortestNightSleepTime(Math.min(sleepAnalysisData.getShortestNightSleepTime(), sleepAllInfo.getMainSleepDetail().getTotalDur()));
            if (sleepAllInfo.getMainSleepDetail().getScore() >= sleepAnalysisData.getBestScore()) {
                sleepAnalysisData.setBestDayTime(sleepAllInfo.getTimeStamp());
                sleepAnalysisData.setBestScore(sleepAllInfo.getMainSleepDetail().getScore());
            }
            if (sleepAllInfo.getMainSleepDetail().getScore() <= sleepAnalysisData.getWorstScore()) {
                sleepAnalysisData.setWorstDayTime(sleepAllInfo.getTimeStamp());
                sleepAnalysisData.setWorstScore(sleepAllInfo.getMainSleepDetail().getScore());
            }
        }
        if (!arrayList2.isEmpty()) {
            for (SleepAllInfo sleepAllInfo2 : arrayList2) {
                sleepAnalysisData.setLastAvgNightSleepScore(sleepAnalysisData.getLastAvgNightSleepScore() + sleepAllInfo2.getMainSleepDetail().getScore());
                sleepAnalysisData.setLastAvgNightSleepTime(sleepAnalysisData.getLastAvgNightSleepTime() + sleepAllInfo2.getMainSleepDetail().getTotalDur());
            }
            sleepAnalysisData.setLastAvgNightSleepScore(sleepAnalysisData.getLastAvgNightSleepScore() / arrayList2.size());
            sleepAnalysisData.setLastAvgNightSleepTime(sleepAnalysisData.getLastAvgNightSleepTime() / arrayList2.size());
        }
        a(sleepAnalysisData, sleepAnalysisData.getInvalidDay());
        PercentageCalculateUtil percentageCalculateUtil = PercentageCalculateUtil.INSTANCE;
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(Integer.valueOf(sleepAnalysisData.getAvgDpRatio()));
        arrayList3.add(Integer.valueOf(sleepAnalysisData.getAvgLightRatio()));
        arrayList3.add(Integer.valueOf(sleepAnalysisData.getAvgRemRatio()));
        Unit unit = Unit.INSTANCE;
        int[] iArrCalculatePercentages = percentageCalculateUtil.calculatePercentages(arrayList3, 100);
        sleepAnalysisData.setAvgDpRatio(iArrCalculatePercentages[0]);
        sleepAnalysisData.setAvgLightRatio(iArrCalculatePercentages[1]);
        sleepAnalysisData.setAvgRemRatio(iArrCalculatePercentages[2]);
        return sleepAnalysisData;
    }

    @Override // com.huami.sleep.statistic.sleepanalysis.repo.ISleepAnalysisRepo
    @NotNull
    public LiveData<SleepAnalysisData> getSleepAnalysisData(@NotNull String userId, @NotNull final TimeParam timeParam) {
        Pair<Long, Long> pairB = b(timeParam);
        return Transformations.map(Transformations.map(this.statisticDataSource.getSleepInfo(userId, pairB.getFirst().longValue(), pairB.getSecond().longValue()), new Function<List<? extends SleepAllInfo>, List<? extends SleepAllInfo>>() { // from class: com.huami.sleep.statistic.repo.SleepAnalysisRepo$getSleepAnalysisData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends SleepAllInfo> apply(List<? extends SleepAllInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    SleepAllInfo sleepAllInfo = (SleepAllInfo) obj;
                    if (!(sleepAllInfo.getMainSleepDetail().getScore() <= 0 || sleepAllInfo.getMainSleepDetail().getTotalDur() == 0 || sleepAllInfo.getMainSleepDetail().getTotalDur() == sleepAllInfo.getMainSleepDetail().getEditDur())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }), new Function<List<? extends SleepAllInfo>, SleepAnalysisData>() { // from class: com.huami.sleep.statistic.repo.SleepAnalysisRepo$getSleepAnalysisData$$inlined$map$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final SleepAnalysisData apply(List<? extends SleepAllInfo> list) {
                return this.a.calAnalysisData(timeParam, list);
            }
        });
    }
}
