package com.xiaomi.fitness.sport_manager.di;

import android.os.IBinder;
import com.xiaomi.fitness.sport_manager.server.SportDataServer;
import com.xiaomi.fitness.sport_manager.server.SportStateServer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/di/SportLaunchModule;", "", "<init>", "()V", "bindSportStateBinder", "Landroid/os/IBinder;", "binder", "Lcom/xiaomi/fitness/sport_manager/server/SportStateServer;", "bindSportDataBinder", "Lcom/xiaomi/fitness/sport_manager/server/SportDataServer;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportLaunchModule {
    @NotNull
    public abstract IBinder bindSportDataBinder(@NotNull SportDataServer binder);

    @NotNull
    public abstract IBinder bindSportStateBinder(@NotNull SportStateServer binder);
}
