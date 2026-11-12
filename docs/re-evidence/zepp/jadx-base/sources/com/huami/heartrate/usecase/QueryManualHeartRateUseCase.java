package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/heartrate/usecase/QueryManualHeartRateUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "observeLatestHeartRate", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class QueryManualHeartRateUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    public QueryManualHeartRateUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    @NotNull
    public final Flow<HeartRateEntity> observeLatestHeartRate() {
        return this.repository.observeLatestHeartRate();
    }
}
