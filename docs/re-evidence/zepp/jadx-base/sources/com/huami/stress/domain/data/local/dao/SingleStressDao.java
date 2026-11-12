package com.huami.stress.domain.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H'J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001d\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0005J!\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "loadSingleStressList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLatestSingleStress", "Lkotlinx/coroutines/flow/Flow;", "loadLatestSingleStressFlow", "getLatestSyncedSingleStress", "", "timestamp", "getSingleStressByTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "getSingleStressByBetweenTimestamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnSyncSingleStressList", "data", "", "insertOrUpdateSingleStress", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSingleStressByTime", "domain_release"}, k = 1, mv = {1, 5, 1})
public interface SingleStressDao {
    @Query("delete from SingleStress where timestamp = :timestamp ")
    @Nullable
    Object deleteSingleStressByTime(long j, @NotNull Continuation<? super Unit> continuation);

    @Query("select * from SingleStress where syncStatus = 1 order by timestamp desc limit 1")
    @Nullable
    Object getLatestSyncedSingleStress(@NotNull Continuation<? super SingleStressDaoBean> continuation);

    @Query("select * from SingleStress where timestamp >=:start and timestamp<=:end")
    @Nullable
    Object getSingleStressByBetweenTimestamp(long j, long j2, @NotNull Continuation<? super List<SingleStressDaoBean>> continuation);

    @Query("select * from SingleStress where timestamp = :timestamp")
    @Nullable
    Object getSingleStressByTimestamp(long j, @NotNull Continuation<? super SingleStressDaoBean> continuation);

    @Query("select * from SingleStress where syncStatus = 0")
    @Nullable
    Object getUnSyncSingleStressList(@NotNull Continuation<? super List<SingleStressDaoBean>> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertOrUpdateSingleStress(@NotNull List<SingleStressDaoBean> list, @NotNull Continuation<? super Unit> continuation);

    @Query("select * from SingleStress order by timestamp desc limit 1")
    @Nullable
    Object loadLatestSingleStress(@NotNull Continuation<? super SingleStressDaoBean> continuation);

    @Query("select * from SingleStress order by timestamp desc limit 1")
    @NotNull
    Flow<SingleStressDaoBean> loadLatestSingleStressFlow();

    @Query("select * from SingleStress order by timestamp desc")
    @Nullable
    Object loadSingleStressList(@NotNull Continuation<? super List<SingleStressDaoBean>> continuation);
}
