package com.huami.sky.lib.repo.weekplan;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;", "", "", "dateString", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintDO;", "getLastRes", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "weekPlanHint", "", "saveLastRes", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface IWeekPlanHintRepo {
    @Nullable
    WeekPlanHintDO getLastRes(@NotNull String dateString);

    void saveLastRes(@NotNull String dateString, @NotNull WeekPlanHint weekPlanHint);
}
