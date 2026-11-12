package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public class GeofencingRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    @SafeParcelable.Field(getter = "getParcelableGeofences", id = 1)
    private final List<com.google.android.gms.internal.location.zzbe> a;

    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", id = 2)
    private final int b;

    @SafeParcelable.Field(defaultValue = "", getter = "getTag", id = 3)
    private final String c;

    @Nullable
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 4)
    private final String d;

    public static final class Builder {
        private final List<com.google.android.gms.internal.location.zzbe> a = new ArrayList();

        @InitialTrigger
        private int b = 5;
        private String c = "";

        @RecentlyNonNull
        public Builder addGeofence(@RecentlyNonNull Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbe, "Geofence must be created using Geofence.Builder.");
            this.a.add((com.google.android.gms.internal.location.zzbe) geofence);
            return this;
        }

        @RecentlyNonNull
        public Builder addGeofences(@RecentlyNonNull List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        @RecentlyNonNull
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.a, this.b, this.c, null);
        }

        @RecentlyNonNull
        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.b = i & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(id = 1) List<com.google.android.gms.internal.location.zzbe> list, @SafeParcelable.Param(id = 2) @InitialTrigger int i, @SafeParcelable.Param(id = 3) String str, @Nullable @SafeParcelable.Param(id = 4) String str2) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @RecentlyNonNull
    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.b;
    }

    @RecentlyNonNull
    public String toString() {
        return "GeofencingRequest[geofences=" + this.a + ", initialTrigger=" + this.b + ", tag=" + this.c + ", attributionTag=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public final GeofencingRequest zza(@Nullable String str) {
        return new GeofencingRequest(this.a, this.b, this.c, str);
    }
}
