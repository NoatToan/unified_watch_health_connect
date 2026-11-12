package com.xiaomi.fitness.sync.impl;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sync.util.MiuiNearbyServiceHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sync/impl/MiuiNearbyServiceListener;", "", "onInit", "", "action", "Lcom/xiaomi/fitness/sync/util/MiuiNearbyServiceHelper;", LifecycleConstantKt.ON_DESTROY, "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MiuiNearbyServiceListener {
    void onDestroy();

    void onInit(@NotNull MiuiNearbyServiceHelper action);
}
