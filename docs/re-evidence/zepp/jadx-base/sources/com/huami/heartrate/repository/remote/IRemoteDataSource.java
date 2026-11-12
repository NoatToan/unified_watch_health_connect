package com.huami.heartrate.repository.remote;

import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "", "", "dateFrom", "dateEnd", "", "limitCount", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateData;", "getRemoteMeasureHrData", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextSeconds", "limit", "Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "fetchMeasureHeartRateData", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface IRemoteDataSource {
    @Nullable
    Object fetchMeasureHeartRateData(@Nullable Long l, int i, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation);

    @Nullable
    Object getRemoteMeasureHrData(long j, long j2, int i, @NotNull Continuation<? super RemoteHeartRateData> continuation);
}
