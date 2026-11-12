package com.xiaomi.fit.data.common.data.sport;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J;\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010)\u001a\u00020\tJ\u0013\u0010*\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019¨\u00064"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Landroid/os/Parcelable;", "", "startTime", "", "endTime", "value", "", "index", "", "minMaxType", "<init>", "(JJLjava/lang/Number;II)V", "getStartTime", "()J", "getEndTime", "setEndTime", "(J)V", "getValue", "()Ljava/lang/Number;", "setValue", "(Ljava/lang/Number;)V", "getIndex", "()I", "setIndex", "(I)V", "getMinMaxType", "setMinMaxType", "duration", "getDuration", "setDuration", "compareTo", "other", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecordItem implements Parcelable, Comparable<SportRecordItem> {
    public static final int TYPE_DEF = 0;
    public static final int TYPE_MAX = 1;
    public static final int TYPE_MIN = -1;
    private int duration;
    private long endTime;
    private int index;
    private int minMaxType;
    private final long startTime;

    @NotNull
    private Number value;

    @NotNull
    public static final Parcelable.Creator<SportRecordItem> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SportRecordItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SportRecordItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportRecordItem(parcel.readLong(), parcel.readLong(), (Number) parcel.readSerializable(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SportRecordItem[] newArray(int i) {
            return new SportRecordItem[i];
        }
    }

    public SportRecordItem(long j, long j2, @NotNull Number value, int i, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.startTime = j;
        this.endTime = j2;
        this.value = value;
        this.index = i;
        this.minMaxType = i2;
        this.duration = (int) (j2 - j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Number getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinMaxType() {
        return this.minMaxType;
    }

    @NotNull
    public final SportRecordItem copy(long startTime, long endTime, @NotNull Number value, int index, int minMaxType) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new SportRecordItem(startTime, endTime, value, index, minMaxType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordItem)) {
            return false;
        }
        SportRecordItem sportRecordItem = (SportRecordItem) other;
        return this.startTime == sportRecordItem.startTime && this.endTime == sportRecordItem.endTime && Intrinsics.areEqual(this.value, sportRecordItem.value) && this.index == sportRecordItem.index && this.minMaxType == sportRecordItem.minMaxType;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMinMaxType() {
        return this.minMaxType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final Number getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.minMaxType);
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setMinMaxType(int i) {
        this.minMaxType = i;
    }

    public final void setValue(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.value = number;
    }

    @NotNull
    public String toString() {
        return "SportRecordItem(" + this.startTime + "," + this.endTime + "," + this.value + "," + this.index + "),";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.startTime);
        dest.writeLong(this.endTime);
        dest.writeSerializable(this.value);
        dest.writeInt(this.index);
        dest.writeInt(this.minMaxType);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SportRecordItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (int) (this.endTime - other.endTime);
    }

    public /* synthetic */ SportRecordItem(long j, long j2, Number number, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, number, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
