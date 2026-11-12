package com.huami.stress_service;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00060\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/stress_service/StressService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/stress_service/StressEntry;", "loadLatestStress", "loadLatestSingleStress", "", "loadLatestAllDayStress", "stress-service_release"}, k = 1, mv = {1, 5, 1})
public interface StressService {
    @NotNull
    Flow<List<StressEntry>> loadLatestAllDayStress();

    @NotNull
    Flow<StressEntry> loadLatestSingleStress();

    @NotNull
    Flow<StressEntry> loadLatestStress();
}
