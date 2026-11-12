package com.huami.bluetooth.profile.channel.module.sleep;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/SleepStage;", "", StatConstants.PARAM_START, "", BroadcastsKt.SILENT_PUSHING_STOP, "status", "(III)V", "getStart", "()I", "getStatus", "getStop", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SleepStage {
    private final int start;
    private final int status;
    private final int stop;

    public SleepStage(int i, int i2, int i3) {
        this.start = i;
        this.stop = i2;
        this.status = i3;
    }

    public static /* synthetic */ SleepStage copy$default(SleepStage sleepStage, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepStage.start;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepStage.stop;
        }
        if ((i4 & 4) != 0) {
            i3 = sleepStage.status;
        }
        return sleepStage.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SleepStage copy(int start, int stop, int status) {
        return new SleepStage(start, stop, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStage)) {
            return false;
        }
        SleepStage sleepStage = (SleepStage) other;
        return this.start == sleepStage.start && this.stop == sleepStage.stop && this.status == sleepStage.status;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.stop)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "SleepStage(start=" + this.start + ", stop=" + this.stop + ", status=" + this.status + ')';
    }
}
