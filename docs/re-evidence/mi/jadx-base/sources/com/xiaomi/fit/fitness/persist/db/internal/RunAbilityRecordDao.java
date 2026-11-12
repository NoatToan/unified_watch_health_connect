package com.xiaomi.fit.fitness.persist.db.internal;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordEntity;", "insertAll", "", "list", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "updateAll", "deleteAll", "getTableName", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RunAbilityRecordDao extends DailyRecordBaseDao<RunAbilityRecordEntity> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDailyRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordDao$DefaultImpls\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,970:1\n37#2:971\n36#2,3:972\n37#2:975\n36#2,3:976\n37#2:979\n36#2,3:980\n*S KotlinDebug\n*F\n+ 1 DailyRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordDao$DefaultImpls\n*L\n473#1:971\n473#1:972,3\n477#1:975\n477#1:976,3\n481#1:979\n481#1:980,3\n*E\n"})
    public static final class DefaultImpls {
        public static void deleteAll(@NotNull RunAbilityRecordDao runAbilityRecordDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            RunAbilityRecordEntity[] runAbilityRecordEntityArr = (RunAbilityRecordEntity[]) list.toArray(new RunAbilityRecordEntity[0]);
            runAbilityRecordDao.delete((DailyRecordBaseEntity[]) Arrays.copyOf(runAbilityRecordEntityArr, runAbilityRecordEntityArr.length));
        }

        @NotNull
        public static String getTableName(@NotNull RunAbilityRecordDao runAbilityRecordDao) {
            return FitnessDBConstants.TABLE_RUN_ABILITY_INDEX;
        }

        public static void insertAll(@NotNull RunAbilityRecordDao runAbilityRecordDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            RunAbilityRecordEntity[] runAbilityRecordEntityArr = (RunAbilityRecordEntity[]) list.toArray(new RunAbilityRecordEntity[0]);
            runAbilityRecordDao.insert((DailyRecordBaseEntity[]) Arrays.copyOf(runAbilityRecordEntityArr, runAbilityRecordEntityArr.length));
        }

        public static void updateAll(@NotNull RunAbilityRecordDao runAbilityRecordDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            RunAbilityRecordEntity[] runAbilityRecordEntityArr = (RunAbilityRecordEntity[]) list.toArray(new RunAbilityRecordEntity[0]);
            runAbilityRecordDao.update((DailyRecordBaseEntity[]) Arrays.copyOf(runAbilityRecordEntityArr, runAbilityRecordEntityArr.length));
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void deleteAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    @NotNull
    String getTableName();

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void insertAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void updateAll(@NotNull List<? extends DailyRecordBaseEntity> list);
}
