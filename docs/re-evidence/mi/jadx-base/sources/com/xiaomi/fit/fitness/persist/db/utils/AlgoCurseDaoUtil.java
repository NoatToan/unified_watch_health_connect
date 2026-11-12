package com.xiaomi.fit.fitness.persist.db.utils;

import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\u0012J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0000¢\u0006\u0002\b\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/AlgoCurseDaoUtil;", "", "<init>", "()V", "TAG", "", "algoCurseDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/AlgoCurseDao;", "getALlAlgoCurse", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/AlgoCurseEntity;", "getALlAlgoCurse$fitness_data_core_chinaProductRelease", "insertAlgoCurse", "", "algoCurseEntity", "insertAlgoCurse$fitness_data_core_chinaProductRelease", "deleteAlgoCurse", "entities", "deleteAlgoCurse$fitness_data_core_chinaProductRelease", "getAlgoCursePeriod", "Lkotlin/Pair;", "", "getAlgoCursePeriod$fitness_data_core_chinaProductRelease", "getAlgoCurseStatus", "getAlgoCurseStatus$fitness_data_core_chinaProductRelease", "()Ljava/lang/Integer;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlgoCurseDaoUtil {

    @NotNull
    private static final String TAG = "AlgoCurseDaoUtil";

    @NotNull
    public static final AlgoCurseDaoUtil INSTANCE = new AlgoCurseDaoUtil();

    @NotNull
    private static final AlgoCurseDao algoCurseDao = FitnessDatabase.INSTANCE.getInstance().algoCurseDao();

    private AlgoCurseDaoUtil() {
    }

    public final void deleteAlgoCurse$fitness_data_core_chinaProductRelease(@NotNull List<AlgoCurseEntity> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        algoCurseDao.delete(entities);
    }

    @NotNull
    public final List<AlgoCurseEntity> getALlAlgoCurse$fitness_data_core_chinaProductRelease() {
        List<AlgoCurseEntity> listQueryAllEntities = algoCurseDao.queryAllEntities();
        return listQueryAllEntities == null ? new ArrayList() : listQueryAllEntities;
    }

    @Nullable
    public final Pair<Integer, Integer> getAlgoCursePeriod$fitness_data_core_chinaProductRelease() {
        List<AlgoCurseEntity> listQueryAllEntities = algoCurseDao.queryAllEntities();
        AlgoCurseEntity algoCurseEntity = listQueryAllEntities != null ? (AlgoCurseEntity) CollectionsKt___CollectionsKt.firstOrNull((List) listQueryAllEntities) : null;
        if (algoCurseEntity == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(algoCurseEntity.getCursePeriod()), Integer.valueOf(algoCurseEntity.getMenstrualPeriod()));
    }

    @Nullable
    public final Integer getAlgoCurseStatus$fitness_data_core_chinaProductRelease() {
        List<AlgoCurseEntity> listQueryAllEntities = algoCurseDao.queryAllEntities();
        AlgoCurseEntity algoCurseEntity = listQueryAllEntities != null ? (AlgoCurseEntity) CollectionsKt___CollectionsKt.firstOrNull((List) listQueryAllEntities) : null;
        if (algoCurseEntity == null) {
            return null;
        }
        return Integer.valueOf(algoCurseEntity.getStatus());
    }

    public final void insertAlgoCurse$fitness_data_core_chinaProductRelease(@NotNull AlgoCurseEntity algoCurseEntity) {
        Intrinsics.checkNotNullParameter(algoCurseEntity, "algoCurseEntity");
        algoCurseDao.insert(algoCurseEntity);
    }
}
