package com.huami.health.afppg.service;

import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.service.event.AFibEventDay;
import com.huami.health.afppg.usecase.GetAFibByDayFlowUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/health/afppg/service/GetTodayAFibServiceImpl;", "Lcom/huami/health/afppg/service/AfPpgService;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/afppg/service/event/AFibEventDay;", "getTodayAFibEvents", "", "timeMillis", "getAFibEvents", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetTodayAFibServiceImpl implements AfPpgService {
    @Override // com.huami.health.afppg.service.AfPpgService
    @NotNull
    public Flow<AFibEventDay> getAFibEvents(long timeMillis) {
        return ((GetAFibByDayFlowUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(GetAFibByDayFlowUseCase.class), null, null)).execute(timeMillis);
    }

    @Override // com.huami.health.afppg.service.AfPpgService
    @NotNull
    public Flow<AFibEventDay> getTodayAFibEvents() {
        return ((GetAFibByDayFlowUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(GetAFibByDayFlowUseCase.class), null, null)).execute(System.currentTimeMillis());
    }
}
