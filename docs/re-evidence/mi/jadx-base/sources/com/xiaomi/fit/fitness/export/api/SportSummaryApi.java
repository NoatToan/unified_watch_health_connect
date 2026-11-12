package com.xiaomi.fit.fitness.export.api;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "", "getStartSec", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "", "", "getTotalSummary", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSummary", "dimen", "mills", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportSummaryApi {
    @Nullable
    Object getCategories(@NotNull Continuation<? super List<String>> continuation);

    @Nullable
    Object getStartSec(@NotNull Continuation<? super Long> continuation);

    @Nullable
    SportSummary getSummary(@NotNull String category, @NotNull String dimen, long mills);

    @Nullable
    Object getTotalSummary(@NotNull String str, @NotNull Continuation<? super SportSummary> continuation);

    @Nullable
    Object getTotalSummary(@NotNull List<String> list, @NotNull Continuation<? super List<? extends SportSummary>> continuation);
}
