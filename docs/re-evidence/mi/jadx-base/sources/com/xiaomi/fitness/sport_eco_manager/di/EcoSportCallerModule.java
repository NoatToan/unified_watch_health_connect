package com.xiaomi.fitness.sport_eco_manager.di;

import com.xiaomi.fitness.sport_eco_manager.client.EcoSportDataCaller;
import com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/di/EcoSportCallerModule;", "", "<init>", "()V", "bindEcoSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "ecoSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;", "bindEcoSportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "sportSportData", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller;", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EcoSportCallerModule {
    @NotNull
    public abstract IEcoSportRemoteData bindEcoSportDataCaller(@NotNull EcoSportDataCaller sportSportData);

    @NotNull
    public abstract IEcoSportRemoteState bindEcoSportStateCaller(@NotNull EcoSportStateCaller ecoSportStateCaller);
}
