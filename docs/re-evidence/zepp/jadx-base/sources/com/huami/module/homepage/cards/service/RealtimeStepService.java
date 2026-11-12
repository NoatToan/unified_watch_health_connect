package com.huami.module.homepage.cards.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "getRealtimeStep", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getRealSyncTime", "", "release", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface RealtimeStepService {
    long getRealSyncTime();

    @Nullable
    Object getRealtimeStep(@NotNull Continuation<? super Flow<CurrentStep>> continuation);

    void release();
}
