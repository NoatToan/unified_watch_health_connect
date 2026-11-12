package com.huami.heartrate.repository.local;

import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.koin.KoinExtKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/repository/local/LocalDataSource;", "Lcom/huami/heartrate/repository/local/ILocalDataSource;", "", "dayFrom", "dayEnd", "", "", "", "getWholeDayHeartRateData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "date", "", "queryRestHeartRateByDay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "observeWholeDayHrDataChanged", "a", "Ljava/lang/String;", "userId", "<init>", "(Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class LocalDataSource implements ILocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public LocalDataSource(@NotNull String str) {
        this.userId = str;
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @Nullable
    public Object getWholeDayHeartRateData(long j, long j2, @NotNull Continuation<? super Map<String, byte[]>> continuation) {
        return HandleDataKt.handleMaxHeartRate(KoinExtKt.getHeartRateDataDelegate().getWholeDayHeartRateData(j, j2, this.userId));
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @NotNull
    public Flow<Boolean> observeWholeDayHrDataChanged(@NotNull String date) {
        return KoinExtKt.getHeartRateDataDelegate().observeWholeDayHrDataChanged(date, this.userId);
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @Nullable
    public Object queryRestHeartRateByDay(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(KoinExtKt.getHeartRateDataDelegate().queryRestHeartRateByDay(str, this.userId));
    }
}
