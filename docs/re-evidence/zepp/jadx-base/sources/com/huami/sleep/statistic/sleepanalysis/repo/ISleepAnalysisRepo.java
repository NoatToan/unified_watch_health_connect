package com.huami.sleep.statistic.sleepanalysis.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.sleepanalysis.dto.SleepAnalysisData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/repo/ISleepAnalysisRepo;", "", "", "userId", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Landroidx/lifecycle/LiveData;", "Lcom/huami/sleep/statistic/sleepanalysis/dto/SleepAnalysisData;", "getSleepAnalysisData", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepAnalysisRepo {
    @NotNull
    LiveData<SleepAnalysisData> getSleepAnalysisData(@NotNull String userId, @NotNull TimeParam timeParam);
}
