package com.xiaomi.fitness.stand.di;

import com.xiaomi.fitness.stand.StandDetectInternalManager;
import com.xiaomi.fitness.stand.StandDetectManagerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/stand/di/StandDetectModule;", "", "<init>", "()V", "getStandDetectManager", "mgr", "Lcom/xiaomi/fitness/stand/StandDetectManagerImpl;", "bindStandDetectInternalManager", "Lcom/xiaomi/fitness/stand/StandDetectInternalManager;", "manager", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StandDetectModule {
    @NotNull
    public abstract StandDetectInternalManager bindStandDetectInternalManager(@NotNull StandDetectManagerImpl manager);

    @NotNull
    public abstract Object getStandDetectManager(@NotNull StandDetectManagerImpl mgr);
}
