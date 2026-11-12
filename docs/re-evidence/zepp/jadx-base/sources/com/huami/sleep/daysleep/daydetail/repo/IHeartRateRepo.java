package com.huami.sleep.daysleep.daydetail.repo;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "", "", "userId", "date", "", "queryMiliDateHr", "", "", "queryEarbudDateHr", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateRepo {
    @NotNull
    List<Integer> queryEarbudDateHr(@NotNull String userId, @NotNull String date);

    @NotNull
    byte[] queryMiliDateHr(@NotNull String userId, @NotNull String date);
}
