package com.huami.sleep.datasource;

import com.huami.sleep.model.BreathQualityOdInfo;
import com.huami.sleep.model.BreathQualityScoreInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/datasource/IBreathQualityDataSource;", "", "", "userId", "", "from", "to", "interval", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sleep/model/BreathQualityOdInfo;", "getOdiList", "(Ljava/lang/String;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startStamp", "endStamp", "Lcom/huami/sleep/model/BreathQualityScoreInfo;", "getScoreAndCost", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestScoreInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IBreathQualityDataSource {
    @Nullable
    Object getLatestScoreInfo(@NotNull String str, @NotNull Continuation<? super Flow<BreathQualityScoreInfo>> continuation);

    @Nullable
    Object getOdiList(@NotNull String str, long j, long j2, long j3, @NotNull Continuation<? super Flow<? extends List<BreathQualityOdInfo>>> continuation);

    @Nullable
    Object getScoreAndCost(@NotNull String str, long j, long j2, @NotNull Continuation<? super Flow<? extends List<BreathQualityScoreInfo>>> continuation);
}
