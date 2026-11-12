package com.xiaomi.fitness.sync.export.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.homeroom.model.Home;

/* JADX INFO: loaded from: classes10.dex */
public class LocationKey implements Parcelable {
    public static final Parcelable.Creator<LocationKey> CREATOR = new Parcelable.Creator<LocationKey>() { // from class: com.xiaomi.fitness.sync.export.model.LocationKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationKey createFromParcel(Parcel parcel) {
            return new LocationKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationKey[] newArray(int i) {
            return new LocationKey[i];
        }
    };

    @SerializedName("affiliation")
    public String affiliation;

    @SerializedName(Home.JSON_KEY_LOCATIONID)
    public String cityID;

    @SerializedName("city_name")
    public String cityName;
    public boolean isUserAutoLocation;

    @SerializedName("latitude")
    public double latitude;

    @SerializedName("locationKey")
    public String locationKey;

    @SerializedName("location_name")
    public String locationName;

    @SerializedName("longitude")
    public double longitude;

    public LocationKey() {
        this.isUserAutoLocation = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.locationKey);
        parcel.writeString(this.cityName);
        parcel.writeString(this.locationName);
        parcel.writeString(this.cityID);
        parcel.writeString(this.affiliation);
        parcel.writeByte(this.isUserAutoLocation ? (byte) 1 : (byte) 0);
    }

    public LocationKey(double d, double d2, String str, String str2, String str3, boolean z) {
        this.latitude = d;
        this.longitude = d2;
        this.locationKey = str;
        this.cityName = str2;
        this.locationName = str3;
        this.isUserAutoLocation = z;
    }

    public LocationKey(Parcel parcel) {
        this.isUserAutoLocation = false;
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.locationKey = parcel.readString();
        this.cityName = parcel.readString();
        this.locationName = parcel.readString();
        this.cityID = parcel.readString();
        this.affiliation = parcel.readString();
        this.isUserAutoLocation = parcel.readByte() != 0;
    }
}
