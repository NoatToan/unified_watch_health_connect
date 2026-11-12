package com.xiaomi.fitness.blood_sugar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0006HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingModel;", "", "unusualRemindEnable", "", "disconnectedRemindEnable", "remindTimesStartHour", "", "remindTimesStartMinutes", "remindTimesEndHour", "remindTimesEndMinutes", "targetRangeLow", "", "targetRangeHigh", "remindInterval", "<init>", "(ZZIIIIDDI)V", "getUnusualRemindEnable", "()Z", "setUnusualRemindEnable", "(Z)V", "getDisconnectedRemindEnable", "setDisconnectedRemindEnable", "getRemindTimesStartHour", "()I", "setRemindTimesStartHour", "(I)V", "getRemindTimesStartMinutes", "setRemindTimesStartMinutes", "getRemindTimesEndHour", "setRemindTimesEndHour", "getRemindTimesEndMinutes", "setRemindTimesEndMinutes", "getTargetRangeLow", "()D", "setTargetRangeLow", "(D)V", "getTargetRangeHigh", "setTargetRangeHigh", "getRemindInterval", "setRemindInterval", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodSugarRemindSettingModel {
    private boolean disconnectedRemindEnable;
    private int remindInterval;
    private int remindTimesEndHour;
    private int remindTimesEndMinutes;
    private int remindTimesStartHour;
    private int remindTimesStartMinutes;
    private double targetRangeHigh;
    private double targetRangeLow;
    private boolean unusualRemindEnable;

    public BloodSugarRemindSettingModel() {
        this(false, false, 0, 0, 0, 0, 0.0d, 0.0d, 0, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUnusualRemindEnable() {
        return this.unusualRemindEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDisconnectedRemindEnable() {
        return this.disconnectedRemindEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRemindTimesStartHour() {
        return this.remindTimesStartHour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRemindTimesStartMinutes() {
        return this.remindTimesStartMinutes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRemindTimesEndHour() {
        return this.remindTimesEndHour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRemindTimesEndMinutes() {
        return this.remindTimesEndMinutes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getTargetRangeLow() {
        return this.targetRangeLow;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getTargetRangeHigh() {
        return this.targetRangeHigh;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getRemindInterval() {
        return this.remindInterval;
    }

    @NotNull
    public final BloodSugarRemindSettingModel copy(boolean unusualRemindEnable, boolean disconnectedRemindEnable, int remindTimesStartHour, int remindTimesStartMinutes, int remindTimesEndHour, int remindTimesEndMinutes, double targetRangeLow, double targetRangeHigh, int remindInterval) {
        return new BloodSugarRemindSettingModel(unusualRemindEnable, disconnectedRemindEnable, remindTimesStartHour, remindTimesStartMinutes, remindTimesEndHour, remindTimesEndMinutes, targetRangeLow, targetRangeHigh, remindInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarRemindSettingModel)) {
            return false;
        }
        BloodSugarRemindSettingModel bloodSugarRemindSettingModel = (BloodSugarRemindSettingModel) other;
        return this.unusualRemindEnable == bloodSugarRemindSettingModel.unusualRemindEnable && this.disconnectedRemindEnable == bloodSugarRemindSettingModel.disconnectedRemindEnable && this.remindTimesStartHour == bloodSugarRemindSettingModel.remindTimesStartHour && this.remindTimesStartMinutes == bloodSugarRemindSettingModel.remindTimesStartMinutes && this.remindTimesEndHour == bloodSugarRemindSettingModel.remindTimesEndHour && this.remindTimesEndMinutes == bloodSugarRemindSettingModel.remindTimesEndMinutes && Double.compare(this.targetRangeLow, bloodSugarRemindSettingModel.targetRangeLow) == 0 && Double.compare(this.targetRangeHigh, bloodSugarRemindSettingModel.targetRangeHigh) == 0 && this.remindInterval == bloodSugarRemindSettingModel.remindInterval;
    }

    public final boolean getDisconnectedRemindEnable() {
        return this.disconnectedRemindEnable;
    }

    public final int getRemindInterval() {
        return this.remindInterval;
    }

    public final int getRemindTimesEndHour() {
        return this.remindTimesEndHour;
    }

    public final int getRemindTimesEndMinutes() {
        return this.remindTimesEndMinutes;
    }

    public final int getRemindTimesStartHour() {
        return this.remindTimesStartHour;
    }

    public final int getRemindTimesStartMinutes() {
        return this.remindTimesStartMinutes;
    }

    public final double getTargetRangeHigh() {
        return this.targetRangeHigh;
    }

    public final double getTargetRangeLow() {
        return this.targetRangeLow;
    }

    public final boolean getUnusualRemindEnable() {
        return this.unusualRemindEnable;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.unusualRemindEnable) * 31) + Boolean.hashCode(this.disconnectedRemindEnable)) * 31) + Integer.hashCode(this.remindTimesStartHour)) * 31) + Integer.hashCode(this.remindTimesStartMinutes)) * 31) + Integer.hashCode(this.remindTimesEndHour)) * 31) + Integer.hashCode(this.remindTimesEndMinutes)) * 31) + Double.hashCode(this.targetRangeLow)) * 31) + Double.hashCode(this.targetRangeHigh)) * 31) + Integer.hashCode(this.remindInterval);
    }

    public final void setDisconnectedRemindEnable(boolean z) {
        this.disconnectedRemindEnable = z;
    }

    public final void setRemindInterval(int i) {
        this.remindInterval = i;
    }

    public final void setRemindTimesEndHour(int i) {
        this.remindTimesEndHour = i;
    }

    public final void setRemindTimesEndMinutes(int i) {
        this.remindTimesEndMinutes = i;
    }

    public final void setRemindTimesStartHour(int i) {
        this.remindTimesStartHour = i;
    }

    public final void setRemindTimesStartMinutes(int i) {
        this.remindTimesStartMinutes = i;
    }

    public final void setTargetRangeHigh(double d) {
        this.targetRangeHigh = d;
    }

    public final void setTargetRangeLow(double d) {
        this.targetRangeLow = d;
    }

    public final void setUnusualRemindEnable(boolean z) {
        this.unusualRemindEnable = z;
    }

    @NotNull
    public String toString() {
        return "BloodSugarRemindSettingModel(unusualRemindEnable=" + this.unusualRemindEnable + ", disconnectedRemindEnable=" + this.disconnectedRemindEnable + ", remindTimesStartHour=" + this.remindTimesStartHour + ", remindTimesStartMinutes=" + this.remindTimesStartMinutes + ", remindTimesEndHour=" + this.remindTimesEndHour + ", remindTimesEndMinutes=" + this.remindTimesEndMinutes + ", targetRangeLow=" + this.targetRangeLow + ", targetRangeHigh=" + this.targetRangeHigh + ", remindInterval=" + this.remindInterval + ")";
    }

    public BloodSugarRemindSettingModel(boolean z, boolean z2, int i, int i2, int i3, int i4, double d, double d2, int i5) {
        this.unusualRemindEnable = z;
        this.disconnectedRemindEnable = z2;
        this.remindTimesStartHour = i;
        this.remindTimesStartMinutes = i2;
        this.remindTimesEndHour = i3;
        this.remindTimesEndMinutes = i4;
        this.targetRangeLow = d;
        this.targetRangeHigh = d2;
        this.remindInterval = i5;
    }

    public /* synthetic */ BloodSugarRemindSettingModel(boolean z, boolean z2, int i, int i2, int i3, int i4, double d, double d2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? true : z2, (i6 & 4) != 0 ? 8 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 20 : i3, (i6 & 32) == 0 ? i4 : 0, (i6 & 64) != 0 ? 3.9d : d, (i6 & 128) != 0 ? 10.0d : d2, (i6 & 256) != 0 ? 10 : i5);
    }
}
