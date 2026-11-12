package com.xiaomi.fitness.userinfo.goal;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.user.info.export.GoalSyncer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/GoalSyncerImpl;", "Lcom/xiaomi/fitness/user/info/export/GoalSyncer;", "<init>", "()V", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalSyncerImpl implements GoalSyncer {
    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("GoalSyncer: start sync", new Object[0]);
        GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).setCurrentTarget();
    }
}
