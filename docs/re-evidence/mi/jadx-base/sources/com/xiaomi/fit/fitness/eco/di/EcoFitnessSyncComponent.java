package com.xiaomi.fit.fitness.eco.di;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.EcoFitnessSyncComponentKt;
import com.xiaomi.fit.fitness.eco.manager.EcoFitnessDataSyncManager;
import com.xiaomi.fit.fitness.eco.manager.EcoFitnessSyncerExtKt;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/di/EcoFitnessSyncComponent;", "", "<init>", "()V", "addDataHandler", "", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = EcoFitnessSyncComponentKt.TAG)
public final class EcoFitnessSyncComponent {
    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void addDataHandler() {
        FitnessLogUtils.i("fitness-eco-sync", "addDataHandler");
        EcoFitnessSyncerExtKt.getInstance(EcoFitnessDataSyncManager.INSTANCE).addDataReceiverHandler();
    }
}
