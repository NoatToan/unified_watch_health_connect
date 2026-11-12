package com.xiaomi.fitness.userinfo.di;

import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import com.xiaomi.fitness.user.info.export.GoalSyncer;
import com.xiaomi.fitness.userinfo.goal.GoalSyncerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/di/GoalSyncSingleModule;", "", "<init>", "()V", "bindDeviceSyncer", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;", "syncListener", "Lcom/xiaomi/fitness/userinfo/goal/GoalSyncerImpl;", "bindSyncer", "Lcom/xiaomi/fitness/user/info/export/GoalSyncer;", "syncer", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GoalSyncSingleModule {
    @NotNull
    public abstract DeviceSyncer bindDeviceSyncer(@NotNull GoalSyncerImpl syncListener);

    @NotNull
    public abstract GoalSyncer bindSyncer(@NotNull GoalSyncerImpl syncer);
}
