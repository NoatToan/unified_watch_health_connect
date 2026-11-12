package com.huami.heartrate.repository;

import com.huami.heartrate.repository.db.IDataBaseDataSource;
import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.local.ILocalDataSource;
import com.huami.heartrate.repository.remote.IRemoteDataSource;
import com.huami.heartrate.resting.datasource.IRestingHrDataSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/heartrate/repository/IHeartRateRepository;", "Lcom/huami/heartrate/repository/local/ILocalDataSource;", "Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "Lcom/huami/heartrate/resting/datasource/IRestingHrDataSource;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "queryLatestHeartRateRawData", "", "date", "fetchHeartRateInDay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextSeconds", "", "limit", "Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "getMeasureHeartRatePagingList", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateRepository extends ILocalDataSource, IRemoteDataSource, IDataBaseDataSource, IRestingHrDataSource {
    @Nullable
    Object fetchHeartRateInDay(long j, @NotNull Continuation<? super HeartRateData> continuation);

    @Nullable
    Object getMeasureHeartRatePagingList(@Nullable Long l, int i, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation);

    @NotNull
    Flow<HeartRateData> queryLatestHeartRateRawData();
}
