package com.huami.sleep.datasource;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "", "", "userId", "", "from", "to", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSleepInfo", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepStatisticDataSource {
    @NotNull
    LiveData<List<SleepAllInfo>> getSleepInfo(@NotNull String userId, long from, long to);
}
