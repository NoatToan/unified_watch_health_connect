package com.xiaomi.fitness.sync.di;

import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sync/di/SyncExportModule;", "", "<init>", "()V", "bindsSyncExportManager", "Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "imp", "Lcom/xiaomi/fitness/sync/di/SyncExportManagerImp;", "bindsSyncWeatherManager", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "Lcom/xiaomi/fitness/sync/weather/SyncWeatherManagerImp;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SyncExportModule {
    @NotNull
    public abstract SyncExportManager bindsSyncExportManager(@NotNull SyncExportManagerImp imp);

    @NotNull
    public abstract WeatherSyncManager bindsSyncWeatherManager(@NotNull SyncWeatherManagerImp imp);
}
