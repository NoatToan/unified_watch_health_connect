package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({1000, 2, 3, 4})
public final class zzba extends AbstractSafeParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 1)
    public final LocationRequest a;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", id = 5)
    public final List<ClientIdentity> b;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 6)
    public final String c;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", id = 7)
    public final boolean d;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", id = 8)
    public final boolean e;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", id = 9)
    public final boolean f;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 10)
    public final String g;

    @SafeParcelable.Field(defaultValueUnchecked = "false", id = 11)
    public final boolean h;

    @SafeParcelable.Field(defaultValueUnchecked = "false", id = 12)
    public boolean i;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 13)
    public String j;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_MAX_LOCATION_AGE_MILLIS", id = 14)
    public long k;
    public static final List<ClientIdentity> l = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @Nullable @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @Nullable @SafeParcelable.Param(id = 10) String str2, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @Nullable @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) long j) {
        this.a = locationRequest;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = z4;
        this.i = z5;
        this.j = str3;
        this.k = j;
    }

    public static zzba zza(@Nullable String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, l, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equal(this.a, zzbaVar.a) && Objects.equal(this.b, zzbaVar.b) && Objects.equal(this.c, zzbaVar.c) && this.d == zzbaVar.d && this.e == zzbaVar.e && this.f == zzbaVar.f && Objects.equal(this.g, zzbaVar.g) && this.h == zzbaVar.h && this.i == zzbaVar.i && Objects.equal(this.j, zzbaVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.c != null) {
            sb.append(" tag=");
            sb.append(this.c);
        }
        if (this.g != null) {
            sb.append(" moduleId=");
            sb.append(this.g);
        }
        if (this.j != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.j);
        }
        sb.append(" hideAppOps=");
        sb.append(this.d);
        sb.append(" clients=");
        sb.append(this.b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.e);
        if (this.f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.h) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.i) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.b, false);
        SafeParcelWriter.writeString(parcel, 6, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.d);
        SafeParcelWriter.writeBoolean(parcel, 8, this.e);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f);
        SafeParcelWriter.writeString(parcel, 10, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.h);
        SafeParcelWriter.writeBoolean(parcel, 12, this.i);
        SafeParcelWriter.writeString(parcel, 13, this.j, false);
        SafeParcelWriter.writeLong(parcel, 14, this.k);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzba zzb(long j) {
        if (this.a.getMaxWaitTime() <= this.a.getInterval()) {
            this.k = 10000L;
            return this;
        }
        long interval = this.a.getInterval();
        long maxWaitTime = this.a.getMaxWaitTime();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzba zzc(@Nullable String str) {
        this.j = str;
        return this;
    }

    public final zzba zzd(boolean z) {
        this.i = true;
        return this;
    }
}
