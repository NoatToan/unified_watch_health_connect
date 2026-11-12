package com.xiaomi.fitness.sport_manager.di;

import com.xiaomi.fitness.sport_manager.client.SportDataCaller;
import com.xiaomi.fitness.sport_manager.client.SportStateCaller;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/di/SportCallerModule;", "", "<init>", "()V", "bindSportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;", "bindSportDataCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "sportSportData", "Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportCallerModule {
    @NotNull
    public abstract ISportRemoteData bindSportDataCaller(@NotNull SportDataCaller sportSportData);

    @NotNull
    public abstract ISportRemoteState bindSportStateCaller(@NotNull SportStateCaller sportStateCaller);
}
