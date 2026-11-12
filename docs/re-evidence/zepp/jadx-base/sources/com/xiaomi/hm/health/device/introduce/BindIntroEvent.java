package com.xiaomi.hm.health.device.introduce;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/BindIntroEvent;", "", "", "toString", "Lcom/xiaomi/hm/health/device/introduce/BindIntroStatus;", "component1", "", "component2", "status", "success", "copy", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/device/introduce/BindIntroStatus;", "getStatus", "()Lcom/xiaomi/hm/health/device/introduce/BindIntroStatus;", "b", "Z", "getSuccess", "()Z", "<init>", "(Lcom/xiaomi/hm/health/device/introduce/BindIntroStatus;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BindIntroEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BindIntroStatus status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean success;

    public BindIntroEvent(@NotNull BindIntroStatus bindIntroStatus, boolean z) {
        this.status = bindIntroStatus;
        this.success = z;
    }

    public static /* synthetic */ BindIntroEvent copy$default(BindIntroEvent bindIntroEvent, BindIntroStatus bindIntroStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bindIntroStatus = bindIntroEvent.status;
        }
        if ((i & 2) != 0) {
            z = bindIntroEvent.success;
        }
        return bindIntroEvent.copy(bindIntroStatus, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BindIntroStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final BindIntroEvent copy(@NotNull BindIntroStatus status, boolean success) {
        return new BindIntroEvent(status, success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindIntroEvent)) {
            return false;
        }
        BindIntroEvent bindIntroEvent = (BindIntroEvent) other;
        return this.status == bindIntroEvent.status && this.success == bindIntroEvent.success;
    }

    @NotNull
    public final BindIntroStatus getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        boolean z = this.success;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "BindIntroEvent[status: " + this.status + ", success: " + this.success + "]";
    }

    public /* synthetic */ BindIntroEvent(BindIntroStatus bindIntroStatus, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bindIntroStatus, (i & 2) != 0 ? true : z);
    }
}
