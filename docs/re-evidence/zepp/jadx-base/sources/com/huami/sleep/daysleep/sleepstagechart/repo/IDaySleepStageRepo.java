package com.huami.sleep.daysleep.sleepstagechart.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectTip;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.service.bean.SleepDataWithMode;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J3\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "", "", "userId", "date", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfo", "sleepInfo", "Lcom/huami/chart/data/ChartDataList;", "getStageSleepChartData", "", "Lcom/huami/sleep/service/bean/SleepDataWithMode;", "getStageSleepChartDataWithMode", "Lkotlin/Pair;", "getStartEndTime", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "getStageDurInfo", "", "getSleepStartEndIndex", "index", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectTip;", "getSleepSelectTipInfo", "startMin", "endMin", "loadheartRateData", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IDaySleepStageRepo {
    @NotNull
    LiveData<SleepInfo> getSleepInfo(@NotNull String userId, @NotNull String date);

    @Nullable
    SelectTip getSleepSelectTipInfo(int index, @NotNull String date, @Nullable SleepInfo sleepInfo);

    @Nullable
    Pair<Integer, Integer> getSleepStartEndIndex(@Nullable SleepInfo sleepInfo);

    @NotNull
    SleepStageDurationInfo getStageDurInfo(@Nullable SleepInfo sleepInfo);

    @NotNull
    ChartDataList getStageSleepChartData(@Nullable SleepInfo sleepInfo);

    @Nullable
    List<SleepDataWithMode> getStageSleepChartDataWithMode(@Nullable SleepInfo sleepInfo);

    @NotNull
    Pair<String, String> getStartEndTime(@Nullable SleepInfo sleepInfo);

    @Nullable
    Object loadheartRateData(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super ChartDataList> continuation);
}
