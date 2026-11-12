package com.xiaomi.fitness.electronic.scale.dao.dao;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/dao/dao/ClaimRecordDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "insertClaimRecord", "", "claimRecord", "(Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertClaimRecords", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByDid", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteClaimRecord", "", "createTime", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ClaimRecordDao extends BaseDao<ClaimRecord> {
    @Query("DELETE FROM claim_record WHERE createTime =:createTime AND did =:did")
    @Nullable
    Object deleteClaimRecord(@NotNull String str, long j, @NotNull Continuation<? super Integer> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertClaimRecord(@NotNull ClaimRecord claimRecord, @NotNull Continuation<? super Long> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertClaimRecords(@NotNull List<ClaimRecord> list, @NotNull Continuation<? super Long[]> continuation);

    @Query("SELECT * FROM claim_record WHERE did =:did order by createTime desc")
    @Nullable
    Object queryByDid(@NotNull String str, @NotNull Continuation<? super List<ClaimRecord>> continuation);
}
