package com.huami.sky.lib.repo.weekplan;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0004H&¨\u0006\u0013"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;", "", "", "dateStr", "", "addStartDate", "getStartDate", "Ljava/util/Date;", "date", "", "isMarked", "markDate", "", "days", "Lkotlin/Pair;", "refreshWeekList", "", "getMarkedDate", "clearStartDate", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface IWeekPlanRepo {
    void addStartDate(@NotNull String dateStr);

    void clearStartDate();

    @NotNull
    List<String> getMarkedDate();

    @Nullable
    String getStartDate();

    void markDate(@NotNull Date date, boolean isMarked);

    @Nullable
    Pair<Date, Date> refreshWeekList(int days);
}
