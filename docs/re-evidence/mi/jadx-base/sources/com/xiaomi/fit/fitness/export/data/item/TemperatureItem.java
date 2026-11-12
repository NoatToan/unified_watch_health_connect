package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\r\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u000eJ\r\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "skinTemp", "", "bodyTemp", "<init>", "(JLjava/lang/Float;Ljava/lang/Float;)V", "getTime", "()J", "setTime", "(J)V", "getSkinTemp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBodyTemp", "getTimestamp", "setTimestamp", "", "getPrimaryValue", "getSecondaryValue", "toString", "", "component1", "component2", "component3", "copy", "(JLjava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "equals", "", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TemperatureItem extends DailyRecordItem {

    @SerializedName("body_temperature")
    @Nullable
    private final Float bodyTemp;

    @SerializedName("skin_temperature")
    @Nullable
    private final Float skinTemp;

    @SerializedName("time")
    private long time;

    public /* synthetic */ TemperatureItem(long j, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2);
    }

    public static /* synthetic */ TemperatureItem copy$default(TemperatureItem temperatureItem, long j, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperatureItem.time;
        }
        if ((i & 2) != 0) {
            f = temperatureItem.skinTemp;
        }
        if ((i & 4) != 0) {
            f2 = temperatureItem.bodyTemp;
        }
        return temperatureItem.copy(j, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getSkinTemp() {
        return this.skinTemp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    public final TemperatureItem copy(long time, @Nullable Float skinTemp, @Nullable Float bodyTemp) {
        return new TemperatureItem(time, skinTemp, bodyTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureItem)) {
            return false;
        }
        TemperatureItem temperatureItem = (TemperatureItem) other;
        return this.time == temperatureItem.time && Intrinsics.areEqual((Object) this.skinTemp, (Object) temperatureItem.skinTemp) && Intrinsics.areEqual((Object) this.bodyTemp, (Object) temperatureItem.bodyTemp);
    }

    @Nullable
    public final Float getBodyTemp() {
        return this.bodyTemp;
    }

    @Nullable
    public final Float getSkinTemp() {
        return this.skinTemp;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        Float f = this.skinTemp;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.bodyTemp;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
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
        return "TemperatureItem(time=" + this.time + ", bodyTemp=" + this.bodyTemp + ", skinTemp=" + this.skinTemp + ")";
    }

    public TemperatureItem(long j, @Nullable Float f, @Nullable Float f2) {
        super(null);
        this.time = j;
        this.skinTemp = f;
        this.bodyTemp = f2;
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Float getPrimaryValue() {
        Float f = this.skinTemp;
        return Float.valueOf(f != null ? f.floatValue() : 0.0f);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Float getSecondaryValue() {
        Float f = this.bodyTemp;
        return Float.valueOf(f != null ? f.floatValue() : 0.0f);
    }
}
