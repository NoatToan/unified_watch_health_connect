package com.huami.sky.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/sky/service/RelaxDataService;", "", "", "sleepStartTime", "sleepEndTime", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/RelaxData;", "getRelaxData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public interface RelaxDataService {
    @Nullable
    Object getRelaxData(long j, long j2, @NotNull Continuation<? super Flow<RelaxData>> continuation);
}
