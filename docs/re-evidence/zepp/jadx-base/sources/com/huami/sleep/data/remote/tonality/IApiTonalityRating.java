package com.huami.sleep.data.remote.tonality;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;", "", "", "userId", "", "ratingScore", "reportTonalityRating", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IApiTonalityRating {
    @Nullable
    String reportTonalityRating(@NotNull String userId, int ratingScore);
}
