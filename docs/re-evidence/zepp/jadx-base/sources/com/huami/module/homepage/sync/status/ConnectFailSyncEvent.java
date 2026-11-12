package com.huami.module.homepage.sync.status;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/module/homepage/sync/status/ConnectFailSyncEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "Lcom/huami/module/homepage/sync/status/ErrorCode;", "component2", "type", "code", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "b", "Lcom/huami/module/homepage/sync/status/ErrorCode;", "getCode", "()Lcom/huami/module/homepage/sync/status/ErrorCode;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Lcom/huami/module/homepage/sync/status/ErrorCode;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConnectFailSyncEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ErrorCode code;

    public ConnectFailSyncEvent(@NotNull HMDeviceType hMDeviceType, @NotNull ErrorCode errorCode) {
        super(null);
        this.type = hMDeviceType;
        this.code = errorCode;
    }

    public static /* synthetic */ ConnectFailSyncEvent copy$default(ConnectFailSyncEvent connectFailSyncEvent, HMDeviceType hMDeviceType, ErrorCode errorCode, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = connectFailSyncEvent.type;
        }
        if ((i & 2) != 0) {
            errorCode = connectFailSyncEvent.code;
        }
        return connectFailSyncEvent.copy(hMDeviceType, errorCode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ErrorCode getCode() {
        return this.code;
    }

    @NotNull
    public final ConnectFailSyncEvent copy(@NotNull HMDeviceType type, @NotNull ErrorCode code) {
        return new ConnectFailSyncEvent(type, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectFailSyncEvent)) {
            return false;
        }
        ConnectFailSyncEvent connectFailSyncEvent = (ConnectFailSyncEvent) other;
        return this.type == connectFailSyncEvent.type && this.code == connectFailSyncEvent.code;
    }

    @NotNull
    public final ErrorCode getCode() {
        return this.code;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.code.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConnectFailSyncEvent(type=" + this.type + ", code=" + this.code + ")";
    }
}
