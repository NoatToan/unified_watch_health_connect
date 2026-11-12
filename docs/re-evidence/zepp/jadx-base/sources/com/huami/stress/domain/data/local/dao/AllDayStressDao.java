package com.huami.stress.domain.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H'J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u001d\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "getLatestAllDayStress", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getLatestAllDayStressFlow", "getLatestSyncedAllDayStress", "", "timestamp", "getAllDayStressByTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "", "getAllDayStressByBetweenTimestamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnSyncAllDayStressList", "data", "", "insertOrUpdateAllDayStressList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrUpdateAllDayStress", "(Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 5, 1})
public interface AllDayStressDao {
    @Query("select * from AllDayStress where timestamp >=:start and timestamp<=:end")
    @Nullable
    Object getAllDayStressByBetweenTimestamp(long j, long j2, @NotNull Continuation<? super List<AllDayStressDaoBean>> continuation);

    @Query("select * from AllDayStress where timestamp = :timestamp")
    @Nullable
    Object getAllDayStressByTimestamp(long j, @NotNull Continuation<? super AllDayStressDaoBean> continuation);

    @Query("select * from AllDayStress order by timestamp desc limit 1")
    @Nullable
    Object getLatestAllDayStress(@NotNull Continuation<? super AllDayStressDaoBean> continuation);

    @Query("select * from AllDayStress order by timestamp desc limit 1")
    @NotNull
    Flow<AllDayStressDaoBean> getLatestAllDayStressFlow();

    @Query("select * from AllDayStress where syncStatus = 1 order by timestamp desc limit 1")
    @Nullable
    Object getLatestSyncedAllDayStress(@NotNull Continuation<? super AllDayStressDaoBean> continuation);

    @Query("select * from AllDayStress where syncStatus = 0")
    @Nullable
    Object getUnSyncAllDayStressList(@NotNull Continuation<? super List<AllDayStressDaoBean>> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertOrUpdateAllDayStress(@NotNull AllDayStressDaoBean allDayStressDaoBean, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertOrUpdateAllDayStressList(@NotNull List<AllDayStressDaoBean> list, @NotNull Continuation<? super Unit> continuation);
}
