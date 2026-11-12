package com.xiaomi.fitness.electronic.scale.dao.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u001aJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/dao/dao/VirtualAccountDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "insertVirtualAccount", "", "virtualAccount", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertVirtualAccountI", "deleteVirtualAccount", "", "uid", "did", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVirtualAccount", "virtualAccounts", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByUid", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByUidAndDid", "queryByAccountIdAndDid", Column.ACCOUNT_ID, "queryVirtualDayData", "startTime", "endTime", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryVirtualStatisticsData", "queryLastWeightRecordByCreateTime", "createTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByAid", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface VirtualAccountDao extends BaseDao<VirtualAccount> {
    @Query("DELETE FROM virtual_account WHERE uid =:uid AND did =:did")
    @Nullable
    Object deleteVirtualAccount(long j, @NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertVirtualAccount(@NotNull VirtualAccount virtualAccount, @NotNull Continuation<? super Long> continuation);

    @Insert(onConflict = 5)
    @Nullable
    Object insertVirtualAccountI(@NotNull VirtualAccount virtualAccount, @NotNull Continuation<? super Long> continuation);

    @Query("SELECT * FROM virtual_account WHERE accountId =:accountId and did = :did order by createTime desc")
    @Nullable
    Object queryByAccountIdAndDid(long j, @NotNull String str, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE accountId =:accountId order by createTime desc")
    @Nullable
    Object queryByAid(long j, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE uid =:uid order by createTime desc")
    @Nullable
    Object queryByUid(long j, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE uid =:uid and did = :did order by createTime desc")
    @Nullable
    Object queryByUidAndDid(long j, @NotNull String str, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE accountId =:accountId AND createTime < :createTime order by createTime desc")
    @Nullable
    Object queryLastWeightRecordByCreateTime(long j, long j2, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE accountId =:accountId AND createTime BETWEEN :startTime AND :endTime")
    @Nullable
    Object queryVirtualDayData(long j, long j2, long j3, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Query("SELECT * FROM virtual_account WHERE accountId =:accountId AND createTime BETWEEN :startTime AND :endTime")
    @Nullable
    Object queryVirtualStatisticsData(long j, long j2, long j3, @NotNull Continuation<? super List<VirtualAccount>> continuation);

    @Update
    @Nullable
    Object updateVirtualAccount(@NotNull VirtualAccount virtualAccount, @NotNull Continuation<? super Integer> continuation);

    @Update
    @Nullable
    Object updateVirtualAccount(@NotNull List<VirtualAccount> list, @NotNull Continuation<? super Integer> continuation);
}
