package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DynamicScheduleItem;", "Ljava/io/Serializable;", "schedulePlus", "", "scheduleHighPressure", "scheduleLowPressure", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSchedulePlus", "()Ljava/lang/Integer;", "setSchedulePlus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getScheduleHighPressure", "setScheduleHighPressure", "getScheduleLowPressure", "setScheduleLowPressure", TSMAuthContants.PARAM_VALID, "", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DynamicScheduleItem;", "equals", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DynamicScheduleItem implements Serializable {

    @SerializedName("calibration_systolic_pressure")
    @Nullable
    private Integer scheduleHighPressure;

    @SerializedName("calibration_diastolic_pressure")
    @Nullable
    private Integer scheduleLowPressure;

    @SerializedName("calibration_heart_rate")
    @Nullable
    private Integer schedulePlus;

    public DynamicScheduleItem(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.schedulePlus = num;
        this.scheduleHighPressure = num2;
        this.scheduleLowPressure = num3;
    }

    public static /* synthetic */ DynamicScheduleItem copy$default(DynamicScheduleItem dynamicScheduleItem, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dynamicScheduleItem.schedulePlus;
        }
        if ((i & 2) != 0) {
            num2 = dynamicScheduleItem.scheduleHighPressure;
        }
        if ((i & 4) != 0) {
            num3 = dynamicScheduleItem.scheduleLowPressure;
        }
        return dynamicScheduleItem.copy(num, num2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSchedulePlus() {
        return this.schedulePlus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getScheduleHighPressure() {
        return this.scheduleHighPressure;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getScheduleLowPressure() {
        return this.scheduleLowPressure;
    }

    @NotNull
    public final DynamicScheduleItem copy(@Nullable Integer schedulePlus, @Nullable Integer scheduleHighPressure, @Nullable Integer scheduleLowPressure) {
        return new DynamicScheduleItem(schedulePlus, scheduleHighPressure, scheduleLowPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicScheduleItem)) {
            return false;
        }
        DynamicScheduleItem dynamicScheduleItem = (DynamicScheduleItem) other;
        return Intrinsics.areEqual(this.schedulePlus, dynamicScheduleItem.schedulePlus) && Intrinsics.areEqual(this.scheduleHighPressure, dynamicScheduleItem.scheduleHighPressure) && Intrinsics.areEqual(this.scheduleLowPressure, dynamicScheduleItem.scheduleLowPressure);
    }

    @Nullable
    public final Integer getScheduleHighPressure() {
        return this.scheduleHighPressure;
    }

    @Nullable
    public final Integer getScheduleLowPressure() {
        return this.scheduleLowPressure;
    }

    @Nullable
    public final Integer getSchedulePlus() {
        return this.schedulePlus;
    }

    public int hashCode() {
        Integer num = this.schedulePlus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.scheduleHighPressure;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.scheduleLowPressure;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setScheduleHighPressure(@Nullable Integer num) {
        this.scheduleHighPressure = num;
    }

    public final void setScheduleLowPressure(@Nullable Integer num) {
        this.scheduleLowPressure = num;
    }

    public final void setSchedulePlus(@Nullable Integer num) {
        this.schedulePlus = num;
    }

    @NotNull
    public String toString() {
        return "DynamicScheduleItem(schedulePlus=" + this.schedulePlus + ", scheduleHighPressure=" + this.scheduleHighPressure + ", scheduleLowPressure=" + this.scheduleLowPressure + ")";
    }

    public final boolean valid() {
        Integer num;
        Integer num2;
        Integer num3 = this.schedulePlus;
        return num3 != null && (num3 == null || num3.intValue() != 0) && (((num = this.scheduleHighPressure) == null || num.intValue() != 0) && this.scheduleHighPressure != null && (num2 = this.scheduleLowPressure) != null && (num2 == null || num2.intValue() != 0));
    }
}
