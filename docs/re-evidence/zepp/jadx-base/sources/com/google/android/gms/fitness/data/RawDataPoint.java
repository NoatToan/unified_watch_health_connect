package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fitness.zzh;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "RawDataPointCreator")
@SafeParcelable.Reserved({1000, 7})
@ShowFirstParty
@KeepName
public final class RawDataPoint extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<RawDataPoint> CREATOR = new zzaa();

    @SafeParcelable.Field(getter = "getEndTimeNanos", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getStartTimeNanos", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getValues", id = 3)
    private final Value[] c;

    @SafeParcelable.Field(getter = "getDataSourceIndex", id = 4)
    private final int d;

    @SafeParcelable.Field(getter = "getOriginalDataSourceIndex", id = 5)
    private final int e;

    @SafeParcelable.Field(getter = "getRawTimestamp", id = 6)
    private final long f;

    @SafeParcelable.Constructor
    public RawDataPoint(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @RecentlyNonNull @SafeParcelable.Param(id = 3) Value[] valueArr, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) long j3) {
        this.a = j;
        this.b = j2;
        this.d = i;
        this.e = i2;
        this.f = j3;
        this.c = valueArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawDataPoint)) {
            return false;
        }
        RawDataPoint rawDataPoint = (RawDataPoint) obj;
        return this.a == rawDataPoint.a && this.b == rawDataPoint.b && Arrays.equals(this.c, rawDataPoint.c) && this.d == rawDataPoint.d && this.e == rawDataPoint.e && this.f == rawDataPoint.f;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.c), Long.valueOf(this.b), Long.valueOf(this.a), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeLong(parcel, 6, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public final Value[] zze() {
        return this.c;
    }

    public final long zzg() {
        return this.f;
    }

    public final long zzn() {
        return this.a;
    }

    public final long zzo() {
        return this.b;
    }

    public final int zzp() {
        return this.d;
    }

    public final int zzq() {
        return this.e;
    }

    public RawDataPoint(DataPoint dataPoint, List<DataSource> list) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = dataPoint.getTimestamp(timeUnit);
        this.b = dataPoint.getStartTime(timeUnit);
        this.c = dataPoint.zze();
        this.d = zzh.zza(dataPoint.getDataSource(), list);
        this.e = zzh.zza(dataPoint.zzf(), list);
        this.f = dataPoint.zzg();
    }
}
