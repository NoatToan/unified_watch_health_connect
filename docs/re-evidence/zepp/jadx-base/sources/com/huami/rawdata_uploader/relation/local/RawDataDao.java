package com.huami.rawdata_uploader.relation.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J=\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u000b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/rawdata_uploader/relation/local/RawDataDao;", "", "Lcom/huami/rawdata_uploader/relation/local/RawDataDbVo;", "dataDbVo", "", Constant.METHOD_INSERT, "", "userId", "zipName", "", "limit", "dataType", "", "getDataByUserIdASC", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "measureTimeList", "updateZipNameByUserId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExcludeDataByUserId", "deleteDataByUserId", "(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public interface RawDataDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object getDataByUserIdASC$default(RawDataDao rawDataDao, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return rawDataDao.getDataByUserIdASC(str, str2, (i3 & 4) != 0 ? 10 : i, i2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDataByUserIdASC");
        }

        public static /* synthetic */ Object getExcludeDataByUserId$default(RawDataDao rawDataDao, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return rawDataDao.getExcludeDataByUserId(str, str2, i, (i3 & 8) != 0 ? 30 : i2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExcludeDataByUserId");
        }
    }

    @Query("DELETE FROM RawDataDbVo where userId = :userId AND measureTime in (:measureTimeList) AND dataType = :dataType")
    @Nullable
    Object deleteDataByUserId(@NotNull String str, @NotNull List<Long> list, int i, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM RawDataDbVo where userId = :userId AND zipName = :zipName AND dataType = :dataType ORDER BY measureTime ASC LIMIT :limit ")
    @Nullable
    Object getDataByUserIdASC(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super List<RawDataDbVo>> continuation);

    @Query("SELECT * FROM RawDataDbVo where userId = :userId AND zipName <> :zipName AND dataType = :dataType ORDER BY measureTime ASC LIMIT :limit ")
    @Nullable
    Object getExcludeDataByUserId(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super List<RawDataDbVo>> continuation);

    @Insert(onConflict = 5)
    @Transaction
    void insert(@NotNull RawDataDbVo dataDbVo);

    @Query("UPDATE RawDataDbVo SET zipName = :zipName WHERE measureTime in (:measureTimeList) AND userId = :userId AND dataType = :dataType")
    @Nullable
    Object updateZipNameByUserId(@NotNull String str, @NotNull List<Long> list, @NotNull String str2, int i, @NotNull Continuation<? super Unit> continuation);
}
