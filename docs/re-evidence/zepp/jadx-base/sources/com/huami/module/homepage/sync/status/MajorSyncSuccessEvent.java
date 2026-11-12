package com.huami.module.homepage.sync.status;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/module/homepage/sync/status/MajorSyncSuccessEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "", "component1", "supportGPS", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "getSupportGPS", "()Z", "<init>", "(Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MajorSyncSuccessEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean supportGPS;

    public MajorSyncSuccessEvent(boolean z) {
        super(null);
        this.supportGPS = z;
    }

    public static /* synthetic */ MajorSyncSuccessEvent copy$default(MajorSyncSuccessEvent majorSyncSuccessEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = majorSyncSuccessEvent.supportGPS;
        }
        return majorSyncSuccessEvent.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSupportGPS() {
        return this.supportGPS;
    }

    @NotNull
    public final MajorSyncSuccessEvent copy(boolean supportGPS) {
        return new MajorSyncSuccessEvent(supportGPS);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MajorSyncSuccessEvent) && this.supportGPS == ((MajorSyncSuccessEvent) other).supportGPS;
    }

    public final boolean getSupportGPS() {
        return this.supportGPS;
    }

    public int hashCode() {
        boolean z = this.supportGPS;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "MajorSyncSuccessEvent(supportGPS=" + this.supportGPS + ")";
    }
}
