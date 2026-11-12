package com.xiaomi.hm.health.device.firmware;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/UpgradeRecord;", "", "", "valid", "", "clear", "", "time", "", "total", "progress", "update", "", "toString", "component1", "component2", "component3", "copy", "hashCode", "other", "equals", "a", "J", "getTime", "()J", "setTime", "(J)V", "b", LogUtil.I, "getTotal", "()I", "setTotal", "(I)V", "c", "getProgress", "setProgress", "<init>", "(JII)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UpgradeRecord {
    public static final int DEFAULT_VALUE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int total;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int progress;

    public UpgradeRecord() {
        this(0L, 0, 0, 7, null);
    }

    public UpgradeRecord(long j, int i, int i2) {
        this.time = j;
        this.total = i;
        this.progress = i2;
    }

    public static /* synthetic */ UpgradeRecord copy$default(UpgradeRecord upgradeRecord, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = upgradeRecord.time;
        }
        if ((i3 & 2) != 0) {
            i = upgradeRecord.total;
        }
        if ((i3 & 4) != 0) {
            i2 = upgradeRecord.progress;
        }
        return upgradeRecord.copy(j, i, i2);
    }

    public final void clear() {
        this.time = -1L;
        this.total = -1;
        this.progress = -1;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final UpgradeRecord copy(long time, int total, int progress) {
        return new UpgradeRecord(time, total, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeRecord)) {
            return false;
        }
        UpgradeRecord upgradeRecord = (UpgradeRecord) other;
        return this.time == upgradeRecord.time && this.total == upgradeRecord.total && this.progress == upgradeRecord.progress;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((defpackage.b.a(this.time) * 31) + this.total) * 31) + this.progress;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @NotNull
    public String toString() {
        return "time=" + this.time + ";total=" + this.total + ";progress=" + this.progress;
    }

    public final void update(long time, int total, int progress) {
        this.time = time;
        this.total = total;
        this.progress = progress;
    }

    public final boolean valid() {
        return this.time > 0 && this.total > 0 && this.progress > 0;
    }

    public /* synthetic */ UpgradeRecord(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }
}
