package com.huami.phn.coach.usecase;

import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/phn/coach/usecase/LoadDailyAnalysisUseCase;", "", "", "year", "month", "day", "count", "", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", PointCategory.LOAD, "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface LoadDailyAnalysisUseCase {
    @NotNull
    List<PhnDailyAnalysis> load(int year, int month, int day, int count);
}
