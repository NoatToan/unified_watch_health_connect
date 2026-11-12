package kb2;

import android.location.Address;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1990a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f103839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f103840b;

    /* JADX INFO: renamed from: kb2.a$a, reason: collision with other inner class name */
    public class C1990a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Location location) {
        this.f103839a = new Bundle();
        this.f103840b = new Bundle();
        if (location != null) {
            double latitude = location.getLatitude();
            Address address = (Address) this.f103839a.getParcelable("android.location.Address");
            if (address != null) {
                address.setLatitude(latitude);
            }
            this.f103840b.putDouble("com.garmin.android.location.Latitude", latitude);
            this.f103840b.putBoolean("com.garmin.android.location.HasLatitude", true);
            double longitude = location.getLongitude();
            Address address2 = (Address) this.f103839a.getParcelable("android.location.Address");
            if (address2 != null) {
                address2.setLongitude(longitude);
            }
            this.f103840b.putDouble("com.garmin.android.location.Longitude", longitude);
            this.f103840b.putBoolean("com.garmin.android.location.HasLongitude", true);
        }
    }

    public final Object clone() {
        return new a(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f103839a.describeContents() | this.f103840b.describeContents();
    }

    public final String toString() {
        return ((Address) this.f103839a.getParcelable("android.location.Address")) != null ? ((Address) this.f103839a.getParcelable("android.location.Address")).getFeatureName() : this.f103840b.getString("com.garmin.android.location.Name");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        this.f103839a.writeToParcel(parcel, i14);
        this.f103840b.writeToParcel(parcel, i14);
    }

    public a(Parcel parcel) {
        this();
        this.f103839a = parcel.readBundle(a.class.getClassLoader());
        this.f103840b = parcel.readBundle();
    }

    public a() {
        this.f103839a = new Bundle();
        this.f103840b = new Bundle();
    }

    private a(a aVar) {
        this.f103840b = (Bundle) aVar.f103840b.clone();
        this.f103839a = (Bundle) aVar.f103839a.clone();
    }
}
