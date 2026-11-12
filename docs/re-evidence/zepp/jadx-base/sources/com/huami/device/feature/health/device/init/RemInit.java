package com.huami.device.feature.health.device.init;

import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/device/feature/health/device/init/RemInit;", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "", "data", WatchFaceArrivingEvent.CMD_SET, "get", "()Ljava/lang/Boolean;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class RemInit extends BaseHealthInit {
    @Nullable
    public abstract Boolean get();

    public abstract boolean set(boolean data);
}
