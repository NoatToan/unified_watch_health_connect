package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();

    @SafeParcelable.Field(getter = "isGpsUsable", id = 1)
    private final boolean a;

    @SafeParcelable.Field(getter = "isNetworkLocationUsable", id = 2)
    private final boolean b;

    @SafeParcelable.Field(getter = "isBleUsable", id = 3)
    private final boolean c;

    @SafeParcelable.Field(getter = "isGpsPresent", id = 4)
    private final boolean d;

    @SafeParcelable.Field(getter = "isNetworkLocationPresent", id = 5)
    private final boolean e;

    @SafeParcelable.Field(getter = "isBlePresent", id = 6)
    private final boolean f;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @RecentlyNullable
    public static LocationSettingsStates fromIntent(@RecentlyNonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.f;
    }

    public boolean isBleUsable() {
        return this.c;
    }

    public boolean isGpsPresent() {
        return this.d;
    }

    public boolean isGpsUsable() {
        return this.a;
    }

    public boolean isLocationPresent() {
        return this.d || this.e;
    }

    public boolean isLocationUsable() {
        return this.a || this.b;
    }

    public boolean isNetworkLocationPresent() {
        return this.e;
    }

    public boolean isNetworkLocationUsable() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
