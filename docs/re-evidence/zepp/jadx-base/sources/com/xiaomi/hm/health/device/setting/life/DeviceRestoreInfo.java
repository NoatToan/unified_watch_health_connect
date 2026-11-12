package com.xiaomi.hm.health.device.setting.life;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/DeviceRestoreInfo;", "", "", "component1", "", "component2", "component3", "deviceId", "hasRestored", "chooseRestored", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "b", "Z", "getHasRestored", "()Z", "c", "getChooseRestored", "<init>", "(Ljava/lang/String;ZZ)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceRestoreInfo {

    @NotNull
    public static final String KEY_HAS_RESTORED = "restore_event_info";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean hasRestored;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean chooseRestored;

    public DeviceRestoreInfo(@NotNull String str, boolean z, boolean z2) {
        this.deviceId = str;
        this.hasRestored = z;
        this.chooseRestored = z2;
    }

    public static /* synthetic */ DeviceRestoreInfo copy$default(DeviceRestoreInfo deviceRestoreInfo, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceRestoreInfo.deviceId;
        }
        if ((i & 2) != 0) {
            z = deviceRestoreInfo.hasRestored;
        }
        if ((i & 4) != 0) {
            z2 = deviceRestoreInfo.chooseRestored;
        }
        return deviceRestoreInfo.copy(str, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasRestored() {
        return this.hasRestored;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getChooseRestored() {
        return this.chooseRestored;
    }

    @NotNull
    public final DeviceRestoreInfo copy(@NotNull String deviceId, boolean hasRestored, boolean chooseRestored) {
        return new DeviceRestoreInfo(deviceId, hasRestored, chooseRestored);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRestoreInfo)) {
            return false;
        }
        DeviceRestoreInfo deviceRestoreInfo = (DeviceRestoreInfo) other;
        return Intrinsics.areEqual(this.deviceId, deviceRestoreInfo.deviceId) && this.hasRestored == deviceRestoreInfo.hasRestored && this.chooseRestored == deviceRestoreInfo.chooseRestored;
    }

    public final boolean getChooseRestored() {
        return this.chooseRestored;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getHasRestored() {
        return this.hasRestored;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        boolean z = this.hasRestored;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.chooseRestored;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "DeviceRestoreInfo(deviceId=" + this.deviceId + ", hasRestored=" + this.hasRestored + ", chooseRestored=" + this.chooseRestored + ")";
    }
}
