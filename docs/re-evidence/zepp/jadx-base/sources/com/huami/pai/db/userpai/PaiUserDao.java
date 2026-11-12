package com.huami.pai.db.userpai;

import android.database.sqlite.SQLiteException;
import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai.vo.PAIDataVoMin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\bH'J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH'J\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH'J#\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u0016H'J\b\u0010\u0018\u001a\u00020\u0005H'J\u001b\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001aH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00162\u0006\u0010\u001d\u001a\u00020\u001cH'J\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\u00162\u0006\u0010\u001d\u001a\u00020\u001cH'J)\u0010\"\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010&\u001a\u00020\u001cH'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/pai/db/userpai/PaiUserDao;", "", "", "Lcom/huami/pai/vo/PAIDataVo;", "paiDataVo", "", "insertOrUpdateUserPai", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "getUserAllPaiData", "getUserAllPaiList", "getUserAllPaiListSuspend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startDate", "endDate", "getUserPaiDataBetween", "", "isUpload", "getAllUploadPaiList", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getUserDataFlow", "cleanData", "setUploadSuspend", "", "getMaxTimeStamp", "", "count", "getLimitUserDataFlow", "Lcom/huami/pai/vo/PAIDataVoMin;", "getLimitUserDataFlowMin", "timestampList", "updateListUploadSuspend", "(ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLimitUploadPaiList", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "getCountPaiList", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PaiUserDao {
    @Query("DELETE FROM PAIDataVo")
    void cleanData();

    @Query("select * from PAIDataVo where isUpload = :isUpload")
    @Nullable
    Object getAllUploadPaiList(boolean z, @NotNull Continuation<? super List<PAIDataVo>> continuation);

    @Query("select * from PAIDataVo ORDER BY timestamp desc LIMIT :limit")
    @NotNull
    List<PAIDataVo> getCountPaiList(int limit);

    @Query("select * from PAIDataVo where isUpload = :isUpload ORDER BY timestamp DESC LIMIT:count")
    @Nullable
    Object getLimitUploadPaiList(boolean z, int i, @NotNull Continuation<? super List<PAIDataVo>> continuation);

    @Query("SELECT * FROM PAIDataVo ORDER BY timestamp desc LIMIT :count")
    @NotNull
    Flow<List<PAIDataVo>> getLimitUserDataFlow(int count);

    @Query("SELECT date,nextActivityScore,dp,tp,timestamp FROM PAIDataVo ORDER BY timestamp desc LIMIT :count")
    @NotNull
    Flow<List<PAIDataVoMin>> getLimitUserDataFlowMin(int count);

    @Query("SELECT MAX(timestamp) FROM PAIDataVo")
    @Nullable
    Object getMaxTimeStamp(@NotNull Continuation<? super Long> continuation);

    @Query("select * from PAIDataVo order by date desc")
    @NotNull
    LiveData<List<PAIDataVo>> getUserAllPaiData();

    @Query("select * from PAIDataVo order by date desc")
    @Nullable
    List<PAIDataVo> getUserAllPaiList();

    @Query("select * from PAIDataVo order by date desc")
    @Nullable
    Object getUserAllPaiListSuspend(@NotNull Continuation<? super List<PAIDataVo>> continuation);

    @Query("SELECT * FROM PAIDataVo ORDER BY DATE desc")
    @NotNull
    Flow<List<PAIDataVo>> getUserDataFlow();

    @Query("select * from PAIDataVo where date >= :startDate and date <=:endDate")
    @Nullable
    List<PAIDataVo> getUserPaiDataBetween(@NotNull String startDate, @NotNull String endDate);

    @Transaction
    @Nullable
    @Insert(onConflict = 1)
    Object insertOrUpdateUserPai(@NotNull List<PAIDataVo> list, @NotNull Continuation<? super Unit> continuation) throws SQLiteException;

    @Query("UPDATE PAIDataVo SET isUpload = :isUpload")
    @Nullable
    Object setUploadSuspend(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Query("UPDATE PAIDataVo SET isUpload = :isUpload WHERE timestamp in (:timestampList)")
    @Nullable
    Object updateListUploadSuspend(boolean z, @NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation);
}
