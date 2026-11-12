package com.xiaomi.hm.health.device.bolt;

import com.huami.devicex.injection.other.TreadmillApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/JsTreadmillMaintainEvent;", "", "Lcom/huami/devicex/injection/other/TreadmillApiHandler;", "component1", "handler", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/devicex/injection/other/TreadmillApiHandler;", "getHandler", "()Lcom/huami/devicex/injection/other/TreadmillApiHandler;", "<init>", "(Lcom/huami/devicex/injection/other/TreadmillApiHandler;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JsTreadmillMaintainEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final TreadmillApiHandler handler;

    public JsTreadmillMaintainEvent(@Nullable TreadmillApiHandler treadmillApiHandler) {
        this.handler = treadmillApiHandler;
    }

    public static /* synthetic */ JsTreadmillMaintainEvent copy$default(JsTreadmillMaintainEvent jsTreadmillMaintainEvent, TreadmillApiHandler treadmillApiHandler, int i, Object obj) {
        if ((i & 1) != 0) {
            treadmillApiHandler = jsTreadmillMaintainEvent.handler;
        }
        return jsTreadmillMaintainEvent.copy(treadmillApiHandler);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TreadmillApiHandler getHandler() {
        return this.handler;
    }

    @NotNull
    public final JsTreadmillMaintainEvent copy(@Nullable TreadmillApiHandler handler) {
        return new JsTreadmillMaintainEvent(handler);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsTreadmillMaintainEvent) && Intrinsics.areEqual(this.handler, ((JsTreadmillMaintainEvent) other).handler);
    }

    @Nullable
    public final TreadmillApiHandler getHandler() {
        return this.handler;
    }

    public int hashCode() {
        TreadmillApiHandler treadmillApiHandler = this.handler;
        if (treadmillApiHandler == null) {
            return 0;
        }
        return treadmillApiHandler.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsTreadmillMaintainEvent(handler=" + this.handler + ")";
    }
}
