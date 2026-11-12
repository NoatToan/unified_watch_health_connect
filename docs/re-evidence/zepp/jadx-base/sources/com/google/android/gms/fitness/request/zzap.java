package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzu;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SensorRegistrationRequestCreator")
@SafeParcelable.Reserved({4, 5, 11, 14, 1000})
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzao();

    @Nullable
    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private DataSource a;

    @Nullable
    @SafeParcelable.Field(getter = "getDataType", id = 2)
    private DataType b;

    @Nullable
    @SafeParcelable.Field(getter = "getListenerBinder", id = 3, type = "android.os.IBinder")
    private final com.google.android.gms.fitness.data.zzv c;

    @SafeParcelable.Field(getter = "getSamplingRateMicros", id = 6)
    private final long d;

    @SafeParcelable.Field(getter = "getMaxDeliveryLatencyMicros", id = 7)
    private final long e;

    @Nullable
    @SafeParcelable.Field(getter = "getIntent", id = 8)
    private final PendingIntent f;

    @SafeParcelable.Field(getter = "getFastestRateMicros", id = 9)
    private final long g;

    @SafeParcelable.Field(getter = "getAccuracyMode", id = 10)
    private final int h;

    @SafeParcelable.Field(getter = "getRegistrationTimeOutMicros", id = 12)
    private final long i;
    private final List<ClientIdentity> j;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 13, type = "android.os.IBinder")
    private final zzcn k;

    @SafeParcelable.Constructor
    public zzap(@Nullable @SafeParcelable.Param(id = 1) DataSource dataSource, @Nullable @SafeParcelable.Param(id = 2) DataType dataType, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) long j2, @Nullable @SafeParcelable.Param(id = 8) PendingIntent pendingIntent, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 12) long j4, @Nullable @SafeParcelable.Param(id = 13) IBinder iBinder2) {
        this.a = dataSource;
        this.b = dataType;
        this.c = iBinder == null ? null : zzu.zza(iBinder);
        this.d = j;
        this.g = j3;
        this.e = j2;
        this.f = pendingIntent;
        this.h = i;
        this.j = Collections.emptyList();
        this.i = j4;
        this.k = iBinder2 != null ? zzcm.zzj(iBinder2) : null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        return Objects.equal(this.a, zzapVar.a) && Objects.equal(this.b, zzapVar.b) && Objects.equal(this.c, zzapVar.c) && this.d == zzapVar.d && this.g == zzapVar.g && this.e == zzapVar.e && this.h == zzapVar.h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e), Integer.valueOf(this.h));
    }

    public final String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.b, this.a, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        com.google.android.gms.fitness.data.zzv zzvVar = this.c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzvVar == null ? null : zzvVar.asBinder(), false);
        SafeParcelWriter.writeLong(parcel, 6, this.d);
        SafeParcelWriter.writeLong(parcel, 7, this.e);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.g);
        SafeParcelWriter.writeInt(parcel, 10, this.h);
        SafeParcelWriter.writeLong(parcel, 12, this.i);
        zzcn zzcnVar = this.k;
        SafeParcelWriter.writeIBinder(parcel, 13, zzcnVar != null ? zzcnVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzap(SensorRequest sensorRequest, @Nullable com.google.android.gms.fitness.data.zzv zzvVar, @Nullable PendingIntent pendingIntent, zzcn zzcnVar) {
        DataSource dataSource = sensorRequest.getDataSource();
        DataType dataType = sensorRequest.getDataType();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        this(dataSource, dataType, zzvVar, pendingIntent, sensorRequest.getSamplingRate(timeUnit), sensorRequest.getFastestRate(timeUnit), sensorRequest.getMaxDeliveryLatency(timeUnit), sensorRequest.getAccuracyMode(), Collections.emptyList(), sensorRequest.zzy(), zzcnVar);
    }

    private zzap(@Nullable DataSource dataSource, @Nullable DataType dataType, @Nullable com.google.android.gms.fitness.data.zzv zzvVar, @Nullable PendingIntent pendingIntent, long j, long j2, long j3, int i, List<ClientIdentity> list, long j4, @Nullable zzcn zzcnVar) {
        this.a = dataSource;
        this.b = dataType;
        this.c = zzvVar;
        this.f = pendingIntent;
        this.d = j;
        this.g = j2;
        this.e = j3;
        this.h = i;
        this.j = list;
        this.i = j4;
        this.k = zzcnVar;
    }
}
