package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Query;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\ba\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH'J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/StandRecordItemDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/StandRecordEntity;", "insertAll", "", "list", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "updateAll", "deleteAll", "getTableName", "", "queryStandRecords", "Lkotlinx/coroutines/flow/Flow;", "startTime", "", "endTime", "queryStandRecordsSync", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StandRecordItemDao extends DailyRecordBaseDao<StandRecordEntity> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDailyRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/StandRecordItemDao$DefaultImpls\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,970:1\n37#2:971\n36#2,3:972\n37#2:975\n36#2,3:976\n37#2:979\n36#2,3:980\n*S KotlinDebug\n*F\n+ 1 DailyRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/StandRecordItemDao$DefaultImpls\n*L\n273#1:971\n273#1:972,3\n277#1:975\n277#1:976,3\n281#1:979\n281#1:980,3\n*E\n"})
    public static final class DefaultImpls {
        public static void deleteAll(@NotNull StandRecordItemDao standRecordItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            StandRecordEntity[] standRecordEntityArr = (StandRecordEntity[]) list.toArray(new StandRecordEntity[0]);
            standRecordItemDao.delete((DailyRecordBaseEntity[]) Arrays.copyOf(standRecordEntityArr, standRecordEntityArr.length));
        }

        @NotNull
        public static String getTableName(@NotNull StandRecordItemDao standRecordItemDao) {
            return FitnessDBConstants.TABLE_STAND;
        }

        public static void insertAll(@NotNull StandRecordItemDao standRecordItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            StandRecordEntity[] standRecordEntityArr = (StandRecordEntity[]) list.toArray(new StandRecordEntity[0]);
            standRecordItemDao.insert((DailyRecordBaseEntity[]) Arrays.copyOf(standRecordEntityArr, standRecordEntityArr.length));
        }

        public static void updateAll(@NotNull StandRecordItemDao standRecordItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            StandRecordEntity[] standRecordEntityArr = (StandRecordEntity[]) list.toArray(new StandRecordEntity[0]);
            standRecordItemDao.update((DailyRecordBaseEntity[]) Arrays.copyOf(standRecordEntityArr, standRecordEntityArr.length));
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void deleteAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    @NotNull
    String getTableName();

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void insertAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Query("select * from stand_record where timeIn0Tz >= :startTime and timeIn0Tz < :endTime order by timeIn0Tz desc")
    @NotNull
    Flow<List<StandRecordEntity>> queryStandRecords(long startTime, long endTime);

    @Query("select * from stand_record where timeIn0Tz >= :startTime and timeIn0Tz < :endTime order by timeIn0Tz desc")
    @NotNull
    List<StandRecordEntity> queryStandRecordsSync(long startTime, long endTime);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void updateAll(@NotNull List<? extends DailyRecordBaseEntity> list);
}
