package com.xiaomi.fitness.sport_manager.di;

import defpackage.f2o;
import defpackage.fzc;
import defpackage.jdn;
import defpackage.uyc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/di/SportStateCenterModel;", "", "Lf2o;", "sportStateCaller", "Lfzc;", "bindSportStateCenter", "(Lf2o;)Lfzc;", "Ljdn;", "sportSportData", "Luyc;", "bindSportDataCenter", "(Ljdn;)Luyc;", "<init>", "()V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class SportStateCenterModel {
    @NotNull
    public abstract uyc bindSportDataCenter(@NotNull jdn sportSportData);

    @NotNull
    public abstract fzc bindSportStateCenter(@NotNull f2o sportStateCaller);
}
