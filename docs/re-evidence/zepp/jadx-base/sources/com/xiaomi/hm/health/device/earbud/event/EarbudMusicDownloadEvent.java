package com.xiaomi.hm.health.device.earbud.event;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/event/EarbudMusicDownloadEvent;", "", "", "component1", "isStart", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarbudMusicDownloadEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isStart;

    public EarbudMusicDownloadEvent() {
        this(false, 1, null);
    }

    public EarbudMusicDownloadEvent(boolean z) {
        this.isStart = z;
    }

    public static /* synthetic */ EarbudMusicDownloadEvent copy$default(EarbudMusicDownloadEvent earbudMusicDownloadEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earbudMusicDownloadEvent.isStart;
        }
        return earbudMusicDownloadEvent.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsStart() {
        return this.isStart;
    }

    @NotNull
    public final EarbudMusicDownloadEvent copy(boolean isStart) {
        return new EarbudMusicDownloadEvent(isStart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EarbudMusicDownloadEvent) && this.isStart == ((EarbudMusicDownloadEvent) other).isStart;
    }

    public int hashCode() {
        boolean z = this.isStart;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isStart() {
        return this.isStart;
    }

    @NotNull
    public String toString() {
        return "EarbudMusicDownloadEvent(isStart=" + this.isStart + ")";
    }

    public /* synthetic */ EarbudMusicDownloadEvent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
