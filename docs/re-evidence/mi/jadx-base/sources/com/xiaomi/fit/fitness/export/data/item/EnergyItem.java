package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "energy", "", "state", "stateValue", "<init>", "(JILjava/lang/Integer;Ljava/lang/Integer;)V", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getEnergy", "()I", "getState", "()Ljava/lang/Integer;", "setState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStateValue", "setStateValue", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "copy", "(JILjava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnergyItem extends DailyRecordItem {

    @SerializedName("energy")
    private final int energy;

    @SerializedName("state")
    @Nullable
    private Integer state;

    @SerializedName("state_value")
    @Nullable
    private Integer stateValue;

    @SerializedName("time")
    private long time;

    public EnergyItem(long j, int i, @EnergyState @Nullable Integer num, @Nullable Integer num2) {
        super(null);
        this.time = j;
        this.energy = i;
        this.state = num;
        this.stateValue = num2;
    }

    public static /* synthetic */ EnergyItem copy$default(EnergyItem energyItem, long j, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = energyItem.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = energyItem.energy;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = energyItem.state;
        }
        Integer num3 = num;
        if ((i2 & 8) != 0) {
            num2 = energyItem.stateValue;
        }
        return energyItem.copy(j2, i3, num3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEnergy() {
        return this.energy;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStateValue() {
        return this.stateValue;
    }

    @NotNull
    public final EnergyItem copy(long time, int energy, @EnergyState @Nullable Integer state, @Nullable Integer stateValue) {
        return new EnergyItem(time, energy, state, stateValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyItem)) {
            return false;
        }
        EnergyItem energyItem = (EnergyItem) other;
        return this.time == energyItem.time && this.energy == energyItem.energy && Intrinsics.areEqual(this.state, energyItem.state) && Intrinsics.areEqual(this.stateValue, energyItem.stateValue);
    }

    public final int getEnergy() {
        return this.energy;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final Integer getStateValue() {
        return this.stateValue;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Integer.hashCode(this.energy)) * 31;
        Integer num = this.state;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stateValue;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }

    public final void setStateValue(@Nullable Integer num) {
        this.stateValue = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "EnergyItem(sid=" + getSid() + ", time=" + this.time + ", energy=" + this.energy + ", state=" + this.state + ", stateValue=" + this.stateValue + ")";
    }

    public EnergyItem(long j, int i) {
        this(j, i, null, null);
    }
}
