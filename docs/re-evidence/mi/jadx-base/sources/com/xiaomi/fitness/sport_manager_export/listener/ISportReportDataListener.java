package com.xiaomi.fitness.sport_manager_export.listener;

import com.xiaomi.fitness.sport_manager_export.data.SportData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "", "onSportReportData", "", "data", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportReportDataListener {
    void onSportReportData(@NotNull SportData data);
}
