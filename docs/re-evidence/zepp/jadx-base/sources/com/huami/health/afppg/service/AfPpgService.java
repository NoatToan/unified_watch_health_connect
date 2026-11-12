package com.huami.health.afppg.service;

import com.huami.health.afppg.service.event.AFibEventDay;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/health/afppg/service/AfPpgService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/afppg/service/event/AFibEventDay;", "getTodayAFibEvents", "", "timeMillis", "getAFibEvents", "afppg-service_release"}, k = 1, mv = {1, 4, 0})
public interface AfPpgService {
    @NotNull
    Flow<AFibEventDay> getAFibEvents(long timeMillis);

    @NotNull
    Flow<AFibEventDay> getTodayAFibEvents();
}
