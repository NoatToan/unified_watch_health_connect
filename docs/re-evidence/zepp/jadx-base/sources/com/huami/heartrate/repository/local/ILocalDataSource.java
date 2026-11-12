package com.huami.heartrate.repository.local;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/heartrate/repository/local/ILocalDataSource;", "", "", "dayFrom", "dayEnd", "", "", "", "getWholeDayHeartRateData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "date", "", "queryRestHeartRateByDay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "observeWholeDayHrDataChanged", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface ILocalDataSource {
    @Nullable
    Object getWholeDayHeartRateData(long j, long j2, @NotNull Continuation<? super Map<String, byte[]>> continuation);

    @NotNull
    Flow<Boolean> observeWholeDayHrDataChanged(@NotNull String date);

    @Nullable
    Object queryRestHeartRateByDay(@NotNull String str, @NotNull Continuation<? super Integer> continuation);
}
