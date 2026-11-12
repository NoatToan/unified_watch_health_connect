package com.huami.ecg.service;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/ecg/service/EcgService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/ecg/service/EcgEntity;", "loadLatestEcg", "ecg-service_release"}, k = 1, mv = {1, 4, 0})
public interface EcgService {
    @NotNull
    Flow<EcgEntity> loadLatestEcg();
}
