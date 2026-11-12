package com.xiaomi.fitness.sport_eco.view.interval;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalNumberData;", "", "defaultNumber", "", "defaultRestDuration", "defaultGroup", "<init>", "(III)V", "getDefaultNumber", "()I", "setDefaultNumber", "(I)V", "getDefaultRestDuration", "setDefaultRestDuration", "getDefaultGroup", "setDefaultGroup", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntervalNumberData {
    private int defaultGroup;
    private int defaultNumber;
    private int defaultRestDuration;

    public IntervalNumberData() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ IntervalNumberData copy$default(IntervalNumberData intervalNumberData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = intervalNumberData.defaultNumber;
        }
        if ((i4 & 2) != 0) {
            i2 = intervalNumberData.defaultRestDuration;
        }
        if ((i4 & 4) != 0) {
            i3 = intervalNumberData.defaultGroup;
        }
        return intervalNumberData.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDefaultNumber() {
        return this.defaultNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDefaultRestDuration() {
        return this.defaultRestDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDefaultGroup() {
        return this.defaultGroup;
    }

    @NotNull
    public final IntervalNumberData copy(int defaultNumber, int defaultRestDuration, int defaultGroup) {
        return new IntervalNumberData(defaultNumber, defaultRestDuration, defaultGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntervalNumberData)) {
            return false;
        }
        IntervalNumberData intervalNumberData = (IntervalNumberData) other;
        return this.defaultNumber == intervalNumberData.defaultNumber && this.defaultRestDuration == intervalNumberData.defaultRestDuration && this.defaultGroup == intervalNumberData.defaultGroup;
    }

    public final int getDefaultGroup() {
        return this.defaultGroup;
    }

    public final int getDefaultNumber() {
        return this.defaultNumber;
    }

    public final int getDefaultRestDuration() {
        return this.defaultRestDuration;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.defaultNumber) * 31) + Integer.hashCode(this.defaultRestDuration)) * 31) + Integer.hashCode(this.defaultGroup);
    }

    public final void setDefaultGroup(int i) {
        this.defaultGroup = i;
    }

    public final void setDefaultNumber(int i) {
        this.defaultNumber = i;
    }

    public final void setDefaultRestDuration(int i) {
        this.defaultRestDuration = i;
    }

    @NotNull
    public String toString() {
        return "IntervalNumberData(defaultNumber=" + this.defaultNumber + ", defaultRestDuration=" + this.defaultRestDuration + ", defaultGroup=" + this.defaultGroup + ")";
    }

    public IntervalNumberData(int i, int i2, int i3) {
        this.defaultNumber = i;
        this.defaultRestDuration = i2;
        this.defaultGroup = i3;
    }

    public /* synthetic */ IntervalNumberData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 100 : i, (i4 & 2) != 0 ? 30 : i2, (i4 & 4) != 0 ? 4 : i3);
    }
}
