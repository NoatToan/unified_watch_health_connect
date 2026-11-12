package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0082\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006;"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/EcgOnceRecord;", "", "time", "", "timeZone", "", "version", "avgHr", "mentalStress", "physicalFatigue", "excitabilityIndex", "hrVariability", "height", "", "weight", "sex", "<init>", "(JIIIIIIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)V", "getTime", "()J", "getTimeZone", "()I", "getVersion", "getAvgHr", "getMentalStress", "getPhysicalFatigue", "getExcitabilityIndex", "getHrVariability", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getWeight", "setWeight", "getSex", "()Ljava/lang/Integer;", "setSex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JIIIIIIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/aggregation/record/EcgOnceRecord;", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgOnceRecord {

    @SerializedName("avg_bpm")
    private final int avgHr;

    @SerializedName("excitability_index")
    private final int excitabilityIndex;

    @SerializedName("height")
    @Nullable
    private Float height;

    @SerializedName("hr_variability")
    private final int hrVariability;

    @SerializedName("mental_stress")
    private final int mentalStress;

    @SerializedName("physical_fatigue")
    private final int physicalFatigue;

    @SerializedName("sex")
    @Nullable
    private Integer sex;

    @SerializedName("time")
    private final long time;

    @SerializedName("time_zone")
    private final int timeZone;

    @SerializedName("version")
    private final int version;

    @SerializedName("weight")
    @Nullable
    private Float weight;

    public EcgOnceRecord(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable Float f, @Nullable Float f2, @Nullable Integer num) {
        this.time = j;
        this.timeZone = i;
        this.version = i2;
        this.avgHr = i3;
        this.mentalStress = i4;
        this.physicalFatigue = i5;
        this.excitabilityIndex = i6;
        this.hrVariability = i7;
        this.height = f;
        this.weight = f2;
        this.sex = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMentalStress() {
        return this.mentalStress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPhysicalFatigue() {
        return this.physicalFatigue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getExcitabilityIndex() {
        return this.excitabilityIndex;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHrVariability() {
        return this.hrVariability;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @NotNull
    public final EcgOnceRecord copy(long time, int timeZone, int version, int avgHr, int mentalStress, int physicalFatigue, int excitabilityIndex, int hrVariability, @Nullable Float height, @Nullable Float weight, @Nullable Integer sex) {
        return new EcgOnceRecord(time, timeZone, version, avgHr, mentalStress, physicalFatigue, excitabilityIndex, hrVariability, height, weight, sex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgOnceRecord)) {
            return false;
        }
        EcgOnceRecord ecgOnceRecord = (EcgOnceRecord) other;
        return this.time == ecgOnceRecord.time && this.timeZone == ecgOnceRecord.timeZone && this.version == ecgOnceRecord.version && this.avgHr == ecgOnceRecord.avgHr && this.mentalStress == ecgOnceRecord.mentalStress && this.physicalFatigue == ecgOnceRecord.physicalFatigue && this.excitabilityIndex == ecgOnceRecord.excitabilityIndex && this.hrVariability == ecgOnceRecord.hrVariability && Intrinsics.areEqual((Object) this.height, (Object) ecgOnceRecord.height) && Intrinsics.areEqual((Object) this.weight, (Object) ecgOnceRecord.weight) && Intrinsics.areEqual(this.sex, ecgOnceRecord.sex);
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getExcitabilityIndex() {
        return this.excitabilityIndex;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    public final int getHrVariability() {
        return this.hrVariability;
    }

    public final int getMentalStress() {
        return this.mentalStress;
    }

    public final int getPhysicalFatigue() {
        return this.physicalFatigue;
    }

    @Nullable
    public final Integer getSex() {
        return this.sex;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final Float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.timeZone)) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.mentalStress)) * 31) + Integer.hashCode(this.physicalFatigue)) * 31) + Integer.hashCode(this.excitabilityIndex)) * 31) + Integer.hashCode(this.hrVariability)) * 31;
        Float f = this.height;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.weight;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.sex;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setHeight(@Nullable Float f) {
        this.height = f;
    }

    public final void setSex(@Nullable Integer num) {
        this.sex = num;
    }

    public final void setWeight(@Nullable Float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "EcgOnceRecord(time=" + this.time + ", timeZone=" + this.timeZone + ", version=" + this.version + ", avgHr=" + this.avgHr + ", mentalStress=" + this.mentalStress + ", physicalFatigue=" + this.physicalFatigue + ", excitabilityIndex=" + this.excitabilityIndex + ", hrVariability=" + this.hrVariability + ", height=" + this.height + ", weight=" + this.weight + ", sex=" + this.sex + ")";
    }
}
