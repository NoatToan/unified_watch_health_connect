package com.app.calorie.service;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/app/calorie/service/CalorieService;", "", "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/app/calorie/service/CalorieEntry;", "loadCalories", "", "checkCalorie", "calorie-service_release"}, k = 1, mv = {1, 5, 1})
public interface CalorieService {
    void checkCalorie(@NotNull Date start, @NotNull Date end);

    @NotNull
    Flow<List<CalorieEntry>> loadCalories(@NotNull Date start, @NotNull Date end);
}
