package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/heartrate/usecase/QueryEarliestSyncedHeartRateUseCase;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "queryEarliestSyncedHeartRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class QueryEarliestSyncedHeartRateUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    public QueryEarliestSyncedHeartRateUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    @Nullable
    public final Object queryEarliestSyncedHeartRate(@NotNull Continuation<? super HeartRateEntity> continuation) {
        return this.repository.queryEarliestSyncedHeartRate(continuation);
    }
}
