package com.huami.health.statisticdata.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {StatisticDataEntity.class}, exportSchema = false, version = 3)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/health/statisticdata/persistence/StatisticDataDao;", "statisticDataDao", "<init>", "()V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public abstract class StatisticDataDatabase extends RoomDatabase {
    @NotNull
    public abstract StatisticDataDao statisticDataDao();
}
