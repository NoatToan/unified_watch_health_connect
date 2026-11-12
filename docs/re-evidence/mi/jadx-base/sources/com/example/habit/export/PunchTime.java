package com.example.habit.export;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/example/habit/export/PunchTime;", "Landroid/os/Parcelable;", "hour", "", "minute", "<init>", "(II)V", "getHour", "()I", "getMinute", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PunchTime implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PunchTime> CREATOR = new Creator();
    private final int hour;
    private final int minute;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PunchTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PunchTime createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PunchTime(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PunchTime[] newArray(int i) {
            return new PunchTime[i];
        }
    }

    public PunchTime(int i, int i2) {
        this.hour = i;
        this.minute = i2;
    }

    public static /* synthetic */ PunchTime copy$default(PunchTime punchTime, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = punchTime.hour;
        }
        if ((i3 & 2) != 0) {
            i2 = punchTime.minute;
        }
        return punchTime.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    public final PunchTime copy(int hour, int minute) {
        return new PunchTime(hour, minute);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PunchTime)) {
            return false;
        }
        PunchTime punchTime = (PunchTime) other;
        return this.hour == punchTime.hour && this.minute == punchTime.minute;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minute);
    }

    @NotNull
    public String toString() {
        return "PunchTime(hour=" + this.hour + ", minute=" + this.minute + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hour);
        dest.writeInt(this.minute);
    }
}
