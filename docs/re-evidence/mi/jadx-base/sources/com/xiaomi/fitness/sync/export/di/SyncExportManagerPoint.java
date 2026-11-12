package com.xiaomi.fitness.sync.export.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/SyncExportManagerPoint;", "", "getSyncExportManager", "Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "getWeatherSyncManager", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SyncExportManagerPoint {
    @NotNull
    SyncExportManager getSyncExportManager();

    @NotNull
    WeatherSyncManager getWeatherSyncManager();
}
