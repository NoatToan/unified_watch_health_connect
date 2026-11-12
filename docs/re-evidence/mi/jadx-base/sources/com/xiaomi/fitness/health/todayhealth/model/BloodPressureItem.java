package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0005HÆ\u0003JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/BloodPressureItem;", "Lcom/xiaomi/fitness/health/todayhealth/model/ITimeData;", "time", "", "highPressure", "", "lowPressure", DailyReportKey.pulse, "origin", "<init>", "(JIILjava/lang/Integer;I)V", "getTime", "()J", "setTime", "(J)V", "getHighPressure", "()I", "getLowPressure", "getPulse", "()Ljava/lang/Integer;", "setPulse", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrigin", "setOrigin", "(I)V", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "component4", "component5", "copy", "(JIILjava/lang/Integer;I)Lcom/xiaomi/fitness/health/todayhealth/model/BloodPressureItem;", "equals", "", "other", "", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodPressureItem implements ITimeData {
    private final int highPressure;
    private final int lowPressure;
    private int origin;

    @Nullable
    private Integer pulse;
    private long time;

    public BloodPressureItem(long j, int i, int i2, @Nullable Integer num, @BloodPressureOrigin int i3) {
        this.time = j;
        this.highPressure = i;
        this.lowPressure = i2;
        this.pulse = num;
        this.origin = i3;
    }

    public static /* synthetic */ BloodPressureItem copy$default(BloodPressureItem bloodPressureItem, long j, int i, int i2, Integer num, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = bloodPressureItem.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = bloodPressureItem.highPressure;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = bloodPressureItem.lowPressure;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            num = bloodPressureItem.pulse;
        }
        Integer num2 = num;
        if ((i4 & 16) != 0) {
            i3 = bloodPressureItem.origin;
        }
        return bloodPressureItem.copy(j2, i5, i6, num2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHighPressure() {
        return this.highPressure;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowPressure() {
        return this.lowPressure;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPulse() {
        return this.pulse;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrigin() {
        return this.origin;
    }

    @NotNull
    public final BloodPressureItem copy(long time, int highPressure, int lowPressure, @Nullable Integer pulse, @BloodPressureOrigin int origin) {
        return new BloodPressureItem(time, highPressure, lowPressure, pulse, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureItem)) {
            return false;
        }
        BloodPressureItem bloodPressureItem = (BloodPressureItem) other;
        return this.time == bloodPressureItem.time && this.highPressure == bloodPressureItem.highPressure && this.lowPressure == bloodPressureItem.lowPressure && Intrinsics.areEqual(this.pulse, bloodPressureItem.pulse) && this.origin == bloodPressureItem.origin;
    }

    public final int getHighPressure() {
        return this.highPressure;
    }

    public final int getLowPressure() {
        return this.lowPressure;
    }

    public final int getOrigin() {
        return this.origin;
    }

    @Nullable
    public final Integer getPulse() {
        return this.pulse;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fitness.health.todayhealth.model.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.highPressure)) * 31) + Integer.hashCode(this.lowPressure)) * 31;
        Integer num = this.pulse;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.origin);
    }

    public final void setOrigin(int i) {
        this.origin = i;
    }

    public final void setPulse(@Nullable Integer num) {
        this.pulse = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fitness.health.todayhealth.model.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "BloodPressureItem(time=" + this.time + ", highPressure=" + this.highPressure + ", lowPressure=" + this.lowPressure + ", pulse=" + this.pulse + ", origin=" + this.origin + ")";
    }

    public /* synthetic */ BloodPressureItem(long j, int i, int i2, Integer num, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? 0 : i3);
    }
}
