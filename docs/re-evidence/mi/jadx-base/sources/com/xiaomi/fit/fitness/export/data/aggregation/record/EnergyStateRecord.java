package com.xiaomi.fit.fitness.export.data.aggregation.record;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/EnergyStateRecord;", "", "time", "", "state", "", "stateValue", "<init>", "(JII)V", "getTime", "()J", "setTime", "(J)V", "getState", "()I", "getStateValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnergyStateRecord {
    private final int state;
    private final int stateValue;
    private long time;

    public EnergyStateRecord(long j, @EnergyState int i, int i2) {
        this.time = j;
        this.state = i;
        this.stateValue = i2;
    }

    public static /* synthetic */ EnergyStateRecord copy$default(EnergyStateRecord energyStateRecord, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = energyStateRecord.time;
        }
        if ((i3 & 2) != 0) {
            i = energyStateRecord.state;
        }
        if ((i3 & 4) != 0) {
            i2 = energyStateRecord.stateValue;
        }
        return energyStateRecord.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStateValue() {
        return this.stateValue;
    }

    @NotNull
    public final EnergyStateRecord copy(long time, @EnergyState int state, int stateValue) {
        return new EnergyStateRecord(time, state, stateValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyStateRecord)) {
            return false;
        }
        EnergyStateRecord energyStateRecord = (EnergyStateRecord) other;
        return this.time == energyStateRecord.time && this.state == energyStateRecord.state && this.stateValue == energyStateRecord.stateValue;
    }

    public final int getState() {
        return this.state;
    }

    public final int getStateValue() {
        return this.stateValue;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.stateValue);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "EnergyStateRecord(time=" + this.time + ", state=" + this.state + ", stateValue=" + this.stateValue + ")";
    }
}
