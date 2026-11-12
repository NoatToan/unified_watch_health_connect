package com.huami.sleep.datasource;

import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/sleep/datasource/ISleepDayDataSource;", "", "", "userId", "date", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfo", "", "removeDaySportLiveData", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepDayDataSource {
    @NotNull
    LiveData<SleepInfo> getSleepInfo(@NotNull String userId, @NotNull String date);

    void removeDaySportLiveData(@NotNull String date);
}
