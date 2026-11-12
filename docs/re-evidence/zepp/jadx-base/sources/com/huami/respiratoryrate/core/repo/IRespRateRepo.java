package com.huami.respiratoryrate.core.repo;

import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H&J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\u0010\u001a\u00020\u000fH&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\u0014"}, d2 = {"Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "", "", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "getRespRateListFlow", "getRespRateList", "getUnSyncList", "getLatestRespRate", "data", "", "addList", "", "clear", "loadRespRateList", "", "postRespRateData", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IRespRateRepo {
    @NotNull
    long[] addList(@NotNull List<RespRateEntity> data);

    void clear();

    @NotNull
    Flow<RespRateEntity> getLatestRespRate();

    @NotNull
    List<RespRateEntity> getRespRateList(long from, long to);

    @NotNull
    Flow<List<RespRateEntity>> getRespRateListFlow(long from, long to);

    @NotNull
    List<RespRateEntity> getUnSyncList();

    @NotNull
    List<RespRateEntity> loadRespRateList(long from, long to);

    boolean postRespRateData(@NotNull List<RespRateEntity> data);
}
