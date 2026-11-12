package com.mi.command.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/mi/command/data/Time;", "Landroid/os/Parcelable;", "hour", "", "minuter", "second", "millisecond", "<init>", "(IIII)V", "getHour", "()I", "getMinuter", "getSecond", "getMillisecond", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Time implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Time> CREATOR = new Creator();
    private final int hour;
    private final int millisecond;
    private final int minuter;
    private final int second;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Time> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Time createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Time(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Time[] newArray(int i) {
            return new Time[i];
        }
    }

    public Time(int i, int i2, int i3, int i4) {
        this.hour = i;
        this.minuter = i2;
        this.second = i3;
        this.millisecond = i4;
    }

    public static /* synthetic */ Time copy$default(Time time, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = time.hour;
        }
        if ((i5 & 2) != 0) {
            i2 = time.minuter;
        }
        if ((i5 & 4) != 0) {
            i3 = time.second;
        }
        if ((i5 & 8) != 0) {
            i4 = time.millisecond;
        }
        return time.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinuter() {
        return this.minuter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMillisecond() {
        return this.millisecond;
    }

    @NotNull
    public final Time copy(int hour, int minuter, int second, int millisecond) {
        return new Time(hour, minuter, second, millisecond);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Time)) {
            return false;
        }
        Time time = (Time) other;
        return this.hour == time.hour && this.minuter == time.minuter && this.second == time.second && this.millisecond == time.millisecond;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMillisecond() {
        return this.millisecond;
    }

    public final int getMinuter() {
        return this.minuter;
    }

    public final int getSecond() {
        return this.second;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minuter)) * 31) + Integer.hashCode(this.second)) * 31) + Integer.hashCode(this.millisecond);
    }

    @NotNull
    public String toString() {
        return "Time(hour=" + this.hour + ", minuter=" + this.minuter + ", second=" + this.second + ", millisecond=" + this.millisecond + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hour);
        dest.writeInt(this.minuter);
        dest.writeInt(this.second);
        dest.writeInt(this.millisecond);
    }
}
