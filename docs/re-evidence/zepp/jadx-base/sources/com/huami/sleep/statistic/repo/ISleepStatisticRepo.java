package com.huami.sleep.statistic.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleepintrodetail.vo.AvgTipInfoVo;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0007H&JK\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J \u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "", "", "userId", "", "startTime", "endTime", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSleepInfo", "data", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "getAvgTipInfo", "", "checkConfigChanged", "", "odiScore", "Lkotlin/Pair;", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "getSleepQuotientInfo", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/huami/sleep/statistic/dto/TimeParam;)Lkotlin/Pair;", "getSelectedAvgInfo", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "getSleepShareInfo", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepStatisticRepo {
    @NotNull
    LiveData<Boolean> checkConfigChanged();

    @NotNull
    AvgTipInfoVo getAvgTipInfo(@NotNull List<SleepAllInfo> data, @NotNull TimeParam timeParam);

    @NotNull
    AvgTipInfoVo getSelectedAvgInfo(@NotNull SleepAllInfo data, @NotNull TimeParam timeParam);

    @NotNull
    LiveData<List<SleepAllInfo>> getSleepInfo(@NotNull String userId, long startTime, long endTime);

    @Nullable
    Pair<Integer, List<SleepQuotientParam>> getSleepQuotientInfo(@NotNull String userId, @NotNull List<SleepAllInfo> data, @Nullable Integer odiScore, @NotNull TimeParam timeParam);

    @Nullable
    ShareSleepVo getSleepShareInfo(@NotNull List<SleepAllInfo> data, @NotNull TimeParam timeParam);
}
