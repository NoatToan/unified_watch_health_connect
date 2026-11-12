package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataUpdateRequestCreator")
@SafeParcelable.Reserved({1000})
public class DataUpdateRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataUpdateRequest> CREATOR = new zzaa();

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getDataSet", id = 3)
    private final DataSet c;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 4, type = "android.os.IBinder")
    private final zzcn d;

    public static class Builder {
        private long a;
        private long b;
        private DataSet c;

        @RecentlyNonNull
        public DataUpdateRequest build() {
            Preconditions.checkNotZero(this.a, "Must set a non-zero value for startTimeMillis/startTime");
            Preconditions.checkNotZero(this.b, "Must set a non-zero value for endTimeMillis/endTime");
            Preconditions.checkNotNull(this.c, "Must set the data set");
            for (DataPoint dataPoint : this.c.getDataPoints()) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long startTime = dataPoint.getStartTime(timeUnit);
                long endTime = dataPoint.getEndTime(timeUnit);
                Preconditions.checkState(!(startTime > endTime || (startTime != 0 && startTime < this.a) || ((startTime != 0 && startTime > this.b) || endTime > this.b || endTime < this.a)), "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", Long.valueOf(startTime), Long.valueOf(endTime), Long.valueOf(this.a), Long.valueOf(this.b));
            }
            return new DataUpdateRequest(this);
        }

        @RecentlyNonNull
        public Builder setDataSet(@RecentlyNonNull DataSet dataSet) {
            Preconditions.checkNotNull(dataSet, "Must set the data set");
            this.c = dataSet;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(j > 0, "Invalid start time :%d", Long.valueOf(j));
            Preconditions.checkArgument(j2 >= j, "Invalid end time :%d", Long.valueOf(j2));
            this.a = timeUnit.toMillis(j);
            this.b = timeUnit.toMillis(j2);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataUpdateRequest(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @RecentlyNonNull @SafeParcelable.Param(id = 3) DataSet dataSet, @Nullable @SafeParcelable.Param(id = 4) IBinder iBinder) {
        this.a = j;
        this.b = j2;
        this.c = dataSet;
        this.d = iBinder == null ? null : zzcm.zzj(iBinder);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateRequest)) {
            return false;
        }
        DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
        return this.a == dataUpdateRequest.a && this.b == dataUpdateRequest.b && Objects.equal(this.c, dataUpdateRequest.c);
    }

    @RecentlyNonNull
    public DataSet getDataSet() {
        return this.c;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), this.c);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("startTimeMillis", Long.valueOf(this.a)).add("endTimeMillis", Long.valueOf(this.b)).add("dataSet", this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeParcelable(parcel, 3, getDataSet(), i, false);
        zzcn zzcnVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zzv() {
        return this.a;
    }

    public final long zzw() {
        return this.b;
    }

    private DataUpdateRequest(Builder builder) {
        this(builder.a, builder.b, builder.c, null);
    }

    public DataUpdateRequest(@RecentlyNonNull DataUpdateRequest dataUpdateRequest, @RecentlyNonNull IBinder iBinder) {
        this(dataUpdateRequest.a, dataUpdateRequest.b, dataUpdateRequest.getDataSet(), iBinder);
    }
}
