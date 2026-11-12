package com.xiaomi.fitness.sport_eco_manager.di;

import defpackage.g2o;
import defpackage.gzc;
import defpackage.kdn;
import defpackage.vyc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/di/EcoSportStateCenterModel;", "", "Lg2o;", "sportStateCaller", "Lgzc;", "bindSportStateCenter", "(Lg2o;)Lgzc;", "Lkdn;", "sportSportData", "Lvyc;", "bindSportDataCenter", "(Lkdn;)Lvyc;", "<init>", "()V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoSportStateCenterModel {
    @NotNull
    public abstract vyc bindSportDataCenter(@NotNull kdn sportSportData);

    @NotNull
    public abstract gzc bindSportStateCenter(@NotNull g2o sportStateCaller);
}
