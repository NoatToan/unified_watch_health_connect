package com.huami.bloodpressure_core.dc.local;

import android.database.sqlite.SQLiteException;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.common.remote.friend.FriendConstants;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0013\bg\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H'J(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH'J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH'J&\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH'J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH'J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u0006\u0010\n\u001a\u00020\tH'J3\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H'J#\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0015J#\u0010&\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J;\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b.\u0010'J+\u0010&\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b&\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/IBloodPressureDao;", "", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "", "insertOrUpdate", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", WorkoutExercises.CLEAN, "", "userId", "", "timeDesc", "Lkotlinx/coroutines/flow/Flow;", "getUserDataByUserId", "", "timeStamp", "delDataByUserId", "dateString", "getDateFlowByUserId", "getMaxTimeByUserId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "getBetweenDataFlowByUserId", "getBetweenDataByUserId", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxDataByUserId", "isUpload", "", "limit", "getLocalDataByUserId", "(Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUploaded", "timeStampList", "setDataUploadedByUserId", "getAllDataByUserId", ParamKey.dataSource, "getDataCountByDataSource", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", FriendConstants.Param.FROM_DATE, "endDate", "getBetweenDataByDateStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalData", "(Ljava/lang/String;ZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllData", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getUserDataByUserId$default(IBloodPressureDao iBloodPressureDao, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserDataByUserId");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return iBloodPressureDao.getUserDataByUserId(str, z);
        }
    }

    @Query("DELETE FROM BloodPressureDbVo")
    void clean();

    @Query("DELETE FROM BloodPressureDbVo WHERE userId = :userId AND measureTime = :timeStamp")
    void delDataByUserId(@NotNull String userId, long timeStamp);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND sbp >= dbp AND dataSource = :dataSource")
    @Nullable
    Object getAllData(@NotNull String str, int i, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND sbp >= dbp")
    @Nullable
    Object getAllDataByUserId(@NotNull String str, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND sbp >= dbp AND dateStr BETWEEN :fromDate AND :endDate")
    @Nullable
    Object getBetweenDataByDateStr(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND measureTime BETWEEN :startTime AND :endTime AND sbp >= dbp")
    @Nullable
    Object getBetweenDataByUserId(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND measureTime BETWEEN :startTime AND :endTime AND sbp >= dbp")
    @NotNull
    Flow<List<BloodPressureDbVo>> getBetweenDataFlowByUserId(@NotNull String userId, long startTime, long endTime);

    @Query("SELECT count(*) FROM BloodPressureDbVo WHERE userId = :userId AND dataSource = :dataSource AND sbp >= dbp")
    @Nullable
    Object getDataCountByDataSource(@NotNull String str, int i, @NotNull Continuation<? super Integer> continuation);

    @Query("SELECT count(*) FROM BloodPressureDbVo WHERE userId = :userId AND isUpload = :isUpload AND dataSource = :dataSource AND sbp >= dbp")
    @Nullable
    Object getDataCountByDataSource(@NotNull String str, int i, boolean z, @NotNull Continuation<? super Long> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId = :userId AND dateStr=:dateString AND sbp >= dbp")
    @NotNull
    Flow<List<BloodPressureDbVo>> getDateFlowByUserId(@NotNull String userId, @NotNull String dateString);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId =:userId AND sbp >= dbp AND isUpload = :isUpload AND dataSource = :dataSource ORDER BY measureTime DESC LIMIT :limit")
    @Nullable
    Object getLocalData(@NotNull String str, boolean z, int i, int i2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Deprecated(message = "数据类型增多，不建议使用该方法 @see getLocalData() ")
    @Query("SELECT * FROM BloodPressureDbVo WHERE userId =:userId AND sbp >= dbp AND isUpload = :isUpload ORDER BY measureTime DESC LIMIT :limit")
    @Nullable
    Object getLocalDataByUserId(@NotNull String str, boolean z, int i, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Query("SELECT * FROM BloodPressureDbVo WHERE userId=:userId AND sbp >= dbp ORDER BY measureTime DESC LIMIT 1")
    @NotNull
    Flow<BloodPressureDbVo> getMaxDataByUserId(@NotNull String userId);

    @Query("SELECT max(measureTime) FROM BloodPressureDbVo WHERE userId=:userId AND sbp >= dbp")
    @Nullable
    Object getMaxTimeByUserId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    @Query("SELECT * FROM BloodPressureDbVo  WHERE userId = :userId AND sbp >= dbp ORDER BY CASE WHEN :timeDesc =1 THEN measureTime END DESC, CASE WHEN:timeDesc = 0 THEN measureTime END ASC")
    @NotNull
    Flow<List<BloodPressureDbVo>> getUserDataByUserId(@NotNull String userId, boolean timeDesc);

    @Transaction
    @Nullable
    @Insert(onConflict = 1)
    Object insertOrUpdate(@NotNull List<BloodPressureDbVo> list, @NotNull Continuation<? super Unit> continuation) throws SQLiteException;

    @Query("UPDATE BloodPressureDbVo SET isUpload = :isUploaded WHERE measureTime in (:timeStampList) AND userId = :userId")
    void setDataUploadedByUserId(@NotNull String userId, boolean isUploaded, @NotNull List<Long> timeStampList);
}
