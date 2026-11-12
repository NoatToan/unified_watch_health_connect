package com.huami.bluetooth.profile.channel.module.schedule.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "", "", "component1", "", "component2", "component3", "version", "supportPerpetualCalendarWorkday", "supportLocation", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "Z", "getSupportPerpetualCalendarWorkday", "()Z", "c", "getSupportLocation", "<init>", "(IZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean supportPerpetualCalendarWorkday;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean supportLocation;

    public ScheduleVersion(int i, boolean z, boolean z2) {
        this.version = i;
        this.supportPerpetualCalendarWorkday = z;
        this.supportLocation = z2;
    }

    public static /* synthetic */ ScheduleVersion copy$default(ScheduleVersion scheduleVersion, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scheduleVersion.version;
        }
        if ((i2 & 2) != 0) {
            z = scheduleVersion.supportPerpetualCalendarWorkday;
        }
        if ((i2 & 4) != 0) {
            z2 = scheduleVersion.supportLocation;
        }
        return scheduleVersion.copy(i, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSupportPerpetualCalendarWorkday() {
        return this.supportPerpetualCalendarWorkday;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSupportLocation() {
        return this.supportLocation;
    }

    @NotNull
    public final ScheduleVersion copy(int version, boolean supportPerpetualCalendarWorkday, boolean supportLocation) {
        return new ScheduleVersion(version, supportPerpetualCalendarWorkday, supportLocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleVersion)) {
            return false;
        }
        ScheduleVersion scheduleVersion = (ScheduleVersion) other;
        return this.version == scheduleVersion.version && this.supportPerpetualCalendarWorkday == scheduleVersion.supportPerpetualCalendarWorkday && this.supportLocation == scheduleVersion.supportLocation;
    }

    public final boolean getSupportLocation() {
        return this.supportLocation;
    }

    public final boolean getSupportPerpetualCalendarWorkday() {
        return this.supportPerpetualCalendarWorkday;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = this.version * 31;
        boolean z = this.supportPerpetualCalendarWorkday;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.supportLocation;
        return i2 + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "ScheduleVersion(version=" + this.version + ", supportPerpetualCalendarWorkday=" + this.supportPerpetualCalendarWorkday + ", supportLocation=" + this.supportLocation + ')';
    }
}
