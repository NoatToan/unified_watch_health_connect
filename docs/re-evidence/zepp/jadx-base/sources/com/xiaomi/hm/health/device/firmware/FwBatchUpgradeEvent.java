package com.xiaomi.hm.health.device.firmware;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FwBatchUpgradeEvent;", "", "", "component1", "", "component2", "component3", "component4", "progress", Command.STOP, "result", "errorCode", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getProgress", "()I", "b", "Z", "getStop", "()Z", "c", "getResult", GoogleApiAvailabilityLight.a, "getErrorCode", "<init>", "(IZZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FwBatchUpgradeEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean stop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean result;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int errorCode;

    public FwBatchUpgradeEvent() {
        this(0, false, false, 0, 15, null);
    }

    public FwBatchUpgradeEvent(int i, boolean z, boolean z2, int i2) {
        this.progress = i;
        this.stop = z;
        this.result = z2;
        this.errorCode = i2;
    }

    public static /* synthetic */ FwBatchUpgradeEvent copy$default(FwBatchUpgradeEvent fwBatchUpgradeEvent, int i, boolean z, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fwBatchUpgradeEvent.progress;
        }
        if ((i3 & 2) != 0) {
            z = fwBatchUpgradeEvent.stop;
        }
        if ((i3 & 4) != 0) {
            z2 = fwBatchUpgradeEvent.result;
        }
        if ((i3 & 8) != 0) {
            i2 = fwBatchUpgradeEvent.errorCode;
        }
        return fwBatchUpgradeEvent.copy(i, z, z2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStop() {
        return this.stop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final FwBatchUpgradeEvent copy(int progress, boolean stop, boolean result, int errorCode) {
        return new FwBatchUpgradeEvent(progress, stop, result, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FwBatchUpgradeEvent)) {
            return false;
        }
        FwBatchUpgradeEvent fwBatchUpgradeEvent = (FwBatchUpgradeEvent) other;
        return this.progress == fwBatchUpgradeEvent.progress && this.stop == fwBatchUpgradeEvent.stop && this.result == fwBatchUpgradeEvent.result && this.errorCode == fwBatchUpgradeEvent.errorCode;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final boolean getStop() {
        return this.stop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = this.progress * 31;
        boolean z = this.stop;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.result;
        return ((i2 + (z2 ? 1 : z2)) * 31) + this.errorCode;
    }

    @NotNull
    public String toString() {
        return "FwBatchUpgradeEvent(progress=" + this.progress + ", stop=" + this.stop + ", result=" + this.result + ", errorCode=" + this.errorCode + ")";
    }

    public /* synthetic */ FwBatchUpgradeEvent(int i, boolean z, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? 1 : i2);
    }
}
