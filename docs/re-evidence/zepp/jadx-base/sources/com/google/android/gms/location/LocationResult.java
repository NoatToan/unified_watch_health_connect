package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "LocationResultCreator")
@SafeParcelable.Reserved({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    private final List<Location> a;
    public static final List<Location> b = Collections.emptyList();

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzbg();

    @SafeParcelable.Constructor
    public LocationResult(@SafeParcelable.Param(id = 1) List<Location> list) {
        this.a = list;
    }

    @RecentlyNonNull
    public static LocationResult create(@RecentlyNonNull List<Location> list) {
        if (list == null) {
            list = b;
        }
        return new LocationResult(list);
    }

    @RecentlyNonNull
    public static LocationResult extractResult(@RecentlyNonNull Intent intent) {
        if (hasResult(intent)) {
            return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return null;
    }

    public static boolean hasResult(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.a.size() != this.a.size()) {
            return false;
        }
        Iterator<Location> it2 = locationResult.a.iterator();
        Iterator<Location> it3 = this.a.iterator();
        while (it2.hasNext()) {
            if (it3.next().getTime() != it2.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    @RecentlyNonNull
    public Location getLastLocation() {
        int size = this.a.size();
        if (size == 0) {
            return null;
        }
        return this.a.get(size - 1);
    }

    @RecentlyNonNull
    public List<Location> getLocations() {
        return this.a;
    }

    public int hashCode() {
        Iterator<Location> it2 = this.a.iterator();
        int i = 17;
        while (it2.hasNext()) {
            long time = it2.next().getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    @RecentlyNonNull
    public String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
