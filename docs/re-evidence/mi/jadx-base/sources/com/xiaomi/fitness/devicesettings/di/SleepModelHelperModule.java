package com.xiaomi.fitness.devicesettings.di;

import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelHelperImpl;
import com.xiaomi.fitness.devicesettings.export.SleepModelHelper;
import com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager;
import com.xiaomi.fitness.devicesettings.thirdparty.MiAicrManagerImp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/SleepModelHelperModule;", "", "<init>", "()V", "bindSleepModelHelper", "Lcom/xiaomi/fitness/devicesettings/export/SleepModelHelper;", "helper", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelHelperImpl;", "bindMiAicrManager", "Lcom/xiaomi/fitness/devicesettings/export/sleepai/MiAicrManager;", "miAicrManagerImp", "Lcom/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SleepModelHelperModule {
    @NotNull
    public abstract MiAicrManager bindMiAicrManager(@NotNull MiAicrManagerImp miAicrManagerImp);

    @NotNull
    public abstract SleepModelHelper bindSleepModelHelper(@NotNull SleepModelHelperImpl helper);
}
