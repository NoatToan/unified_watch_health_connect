package com.xiaomi.hm.health.bt.profile.milipro.model;

import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/milipro/model/BlePairStatus;", "", "", "toString", "", "component1", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/BlePairMode;", "component2", "paired", "pairMode", "copy", "", "hashCode", "other", "equals", "a", "Z", "getPaired", "()Z", "b", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/BlePairMode;", "getPairMode", "()Lcom/xiaomi/hm/health/bt/profile/milipro/model/BlePairMode;", "<init>", "(ZLcom/xiaomi/hm/health/bt/profile/milipro/model/BlePairMode;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BlePairStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean paired;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BlePairMode pairMode;

    public BlePairStatus(boolean z, @NotNull BlePairMode blePairMode) {
        this.paired = z;
        this.pairMode = blePairMode;
    }

    public static /* synthetic */ BlePairStatus copy$default(BlePairStatus blePairStatus, boolean z, BlePairMode blePairMode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blePairStatus.paired;
        }
        if ((i & 2) != 0) {
            blePairMode = blePairStatus.pairMode;
        }
        return blePairStatus.copy(z, blePairMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPaired() {
        return this.paired;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BlePairMode getPairMode() {
        return this.pairMode;
    }

    @NotNull
    public final BlePairStatus copy(boolean paired, @NotNull BlePairMode pairMode) {
        return new BlePairStatus(paired, pairMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlePairStatus)) {
            return false;
        }
        BlePairStatus blePairStatus = (BlePairStatus) other;
        return this.paired == blePairStatus.paired && this.pairMode == blePairStatus.pairMode;
    }

    @NotNull
    public final BlePairMode getPairMode() {
        return this.pairMode;
    }

    public final boolean getPaired() {
        return this.paired;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.paired;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.pairMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "BlePairStatus[paired: " + this.paired + ", pairMode:" + this.pairMode + JsonLexerKt.END_LIST;
    }
}
