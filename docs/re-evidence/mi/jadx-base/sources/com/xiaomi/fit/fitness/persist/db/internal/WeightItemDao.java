package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/PagedLoadDao;", "insertAll", "", "list", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "updateAll", "deleteAll", "getTableName", "", "getRecordTime", "", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "getWeightColumnInfo", "bodyComp", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WeightItemDao extends DailyRecordBaseDao<WeightItemEntity>, PagedLoadDao<WeightItemEntity> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWeightRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/WeightItemDao$DefaultImpls\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,221:1\n37#2:222\n36#2,3:223\n37#2:226\n36#2,3:227\n37#2:230\n36#2,3:231\n*S KotlinDebug\n*F\n+ 1 WeightRecordDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/WeightItemDao$DefaultImpls\n*L\n190#1:222\n190#1:223,3\n194#1:226\n194#1:227,3\n198#1:230\n198#1:231,3\n*E\n"})
    public static final class DefaultImpls {
        public static void deleteAll(@NotNull WeightItemDao weightItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            WeightItemEntity[] weightItemEntityArr = (WeightItemEntity[]) list.toArray(new WeightItemEntity[0]);
            weightItemDao.delete((DailyRecordBaseEntity[]) Arrays.copyOf(weightItemEntityArr, weightItemEntityArr.length));
        }

        @NotNull
        public static String getTableName(@NotNull WeightItemDao weightItemDao) {
            return FitnessDBConstants.TABLE_WEIGHT;
        }

        @NotNull
        public static String getWeightColumnInfo(@NotNull WeightItemDao weightItemDao, @NotNull BodyComposition bodyComp) {
            Intrinsics.checkNotNullParameter(bodyComp, "bodyComp");
            switch (WhenMappings.$EnumSwitchMapping$0[bodyComp.ordinal()]) {
                case 1:
                    return WeightRecordDaoKt.COL_BODY_FAT_RATE;
                case 2:
                    return WeightRecordDaoKt.COL_MOISTURE_RATE;
                case 3:
                    return WeightRecordDaoKt.COL_BONE_MASS;
                case 4:
                    return WeightRecordDaoKt.COL_BASAL_METABOLISM;
                case 5:
                    return WeightRecordDaoKt.COL_MUSCLE_RATE;
                case 6:
                    return WeightRecordDaoKt.COL_PROTEIN_RATE;
                case 7:
                    return WeightRecordDaoKt.COL_VISCERAL_FAT;
                default:
                    return "weight";
            }
        }

        public static void insertAll(@NotNull WeightItemDao weightItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            WeightItemEntity[] weightItemEntityArr = (WeightItemEntity[]) list.toArray(new WeightItemEntity[0]);
            weightItemDao.insert((DailyRecordBaseEntity[]) Arrays.copyOf(weightItemEntityArr, weightItemEntityArr.length));
        }

        public static void updateAll(@NotNull WeightItemDao weightItemDao, @NotNull List<? extends DailyRecordBaseEntity> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            WeightItemEntity[] weightItemEntityArr = (WeightItemEntity[]) list.toArray(new WeightItemEntity[0]);
            weightItemDao.update((DailyRecordBaseEntity[]) Arrays.copyOf(weightItemEntityArr, weightItemEntityArr.length));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BodyComposition.values().length];
            try {
                iArr[BodyComposition.BODY_FAT_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BodyComposition.MOISTURE_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BodyComposition.BONE_MASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BodyComposition.BASAL_METABOLISM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BodyComposition.MUSCLE_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BodyComposition.PROTEIN_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BodyComposition.VISCERAL_FAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void deleteAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @RawQuery
    @NotNull
    List<Long> getRecordTime(@NotNull SupportSQLiteQuery query);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    @NotNull
    String getTableName();

    @NotNull
    String getWeightColumnInfo(@NotNull BodyComposition bodyComp);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void insertAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    void updateAll(@NotNull List<? extends DailyRecordBaseEntity> list);
}
