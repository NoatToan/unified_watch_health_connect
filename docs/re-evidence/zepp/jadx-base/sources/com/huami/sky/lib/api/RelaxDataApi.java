package com.huami.sky.lib.api;

import com.huami.sky.lib.entity.RelaxDataResponse;
import com.huami.sky.lib.entity.RelaxScoreResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/api/RelaxDataApi;", "", "", "sleepStartTime", "sleepEndTime", "Lcom/huami/sky/lib/entity/RelaxDataResponse;", "getRelaxScoreAndTags", "startTime", "endTime", "Lcom/huami/sky/lib/entity/RelaxScoreResponse;", "getRelaxScore", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface RelaxDataApi {
    @Nullable
    RelaxScoreResponse getRelaxScore(long startTime, long endTime);

    @Nullable
    RelaxDataResponse getRelaxScoreAndTags(long sleepStartTime, long sleepEndTime);
}
