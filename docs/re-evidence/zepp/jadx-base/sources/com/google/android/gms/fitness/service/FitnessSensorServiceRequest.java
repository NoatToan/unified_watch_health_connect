package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzu;
import com.google.android.gms.fitness.data.zzv;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "FitnessSensorServiceRequestCreator")
@SafeParcelable.Reserved({1000})
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<FitnessSensorServiceRequest> CREATOR = new zzb();
    public static final int UNSPECIFIED = -1;

    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private final DataSource a;

    @SafeParcelable.Field(getter = "getListenerBinder", id = 2, type = "android.os.IBinder")
    private final zzv b;

    @SafeParcelable.Field(getter = "getSamplingRateMicros", id = 3)
    private final long c;

    @SafeParcelable.Field(getter = "getBatchIntervalMicros", id = 4)
    private final long d;

    @SafeParcelable.Constructor
    public FitnessSensorServiceRequest(@SafeParcelable.Param(id = 1) DataSource dataSource, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2) {
        this.a = dataSource;
        this.b = zzu.zza(iBinder);
        this.c = j;
        this.d = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitnessSensorServiceRequest)) {
            return false;
        }
        FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) obj;
        return Objects.equal(this.a, fitnessSensorServiceRequest.a) && this.c == fitnessSensorServiceRequest.c && this.d == fitnessSensorServiceRequest.d;
    }

    public long getBatchInterval(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MICROSECONDS);
    }

    @RecentlyNonNull
    public DataSource getDataSource() {
        return this.a;
    }

    @RecentlyNonNull
    public SensorEventDispatcher getDispatcher() {
        return new b(this.b);
    }

    public long getSamplingRate(@RecentlyNonNull TimeUnit timeUnit) {
        long j = this.c;
        if (j == -1) {
            return -1L;
        }
        return timeUnit.convert(j, TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, Long.valueOf(this.c), Long.valueOf(this.d));
    }

    @RecentlyNonNull
    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.b.asBinder(), false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLong(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
