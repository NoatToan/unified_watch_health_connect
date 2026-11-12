package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserverDao;", "", "insert", "", "entity", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserver;", "getCount", "", CervicalMucusRecord.Appearance.CLEAR, "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportReportObserverDao {
    @Query("delete from sport_report_observer")
    void clear();

    @Query("select count(*) from sport_report_observer")
    int getCount();

    @Insert(onConflict = 5)
    long insert(@NotNull SportReportObserver entity);
}
