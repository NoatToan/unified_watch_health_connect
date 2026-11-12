package com.huami.watch.companion.location;

import android.os.Parcel;
import android.os.Parcelable;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: loaded from: classes16.dex */
public class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new a();
    private double a;
    private double b;
    private double c;
    private boolean d;
    private Address e;

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new a();
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        public class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Address createFromParcel(Parcel parcel) {
                return new Address(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAdCode() {
            return this.h;
        }

        public String getAdmin() {
            return this.c;
        }

        public String getCityCode() {
            return this.i;
        }

        public String getCountry() {
            return this.a;
        }

        public String getCountryCode() {
            return this.b;
        }

        public String getLocality() {
            return this.e;
        }

        public String getSubAdmin() {
            return this.d;
        }

        public String getSubLocality() {
            return this.f;
        }

        public String getThoroughfare() {
            return this.g;
        }

        public void setAdCode(String str) {
            this.h = str;
        }

        public void setAdmin(String str) {
            this.c = str;
        }

        public void setCityCode(String str) {
            this.i = str;
        }

        public void setCountry(String str) {
            this.a = str;
        }

        public void setCountryCode(String str) {
            this.b = str;
        }

        public void setLocality(String str) {
            this.e = str;
        }

        public void setSubAdmin(String str) {
            this.d = str;
        }

        public void setSubLocality(String str) {
            this.f = str;
        }

        public void setThoroughfare(String str) {
            this.g = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Country : " + this.a);
            sb.append(", CountryCode : " + this.b);
            sb.append(", Admin : " + this.c);
            sb.append(", SubAdmin : " + this.d);
            sb.append(", Locality : " + this.e);
            sb.append(", SubLocality : " + this.f);
            sb.append(", Thoroughfare : " + this.g);
            sb.append(", AdCode : " + this.h);
            sb.append(", CityCode : " + this.i);
            return sb.toString();
        }

        public String toStringShort() {
            return "CtrCode:" + this.b + ",Admin:" + this.c + ",SubAdm:" + this.d + ",Loc:" + this.e + ",SubLoc:" + this.f + ",Thor:" + this.g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }

        private Address(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
        }
    }

    public class a implements Parcelable.Creator<Location> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Location createFromParcel(Parcel parcel) {
            return new Location(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Location[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Address getAddress() {
        return this.e;
    }

    public double getAltitude() {
        return this.c;
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.a;
    }

    public boolean isHasAltitude() {
        return this.d;
    }

    public void setAddress(Address address) {
        this.e = address;
    }

    public void setAltitude(double d) {
        this.c = d;
    }

    public void setHasAltitude(boolean z) {
        this.d = z;
    }

    public void setLatitude(double d) {
        this.b = d;
    }

    public void setLongitude(double d) {
        this.a = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstanceFactory.ERROR_SEPARATOR);
        sb.append("Longitude : " + this.a);
        sb.append(", Latitude : " + this.b);
        sb.append(InstanceFactory.ERROR_SEPARATOR);
        sb.append("Address : " + this.e);
        return sb.toString();
    }

    public String toStringShort() {
        StringBuilder sb = new StringBuilder();
        sb.append("Long:");
        sb.append(this.a);
        sb.append(",Lat:");
        sb.append(this.b);
        if (this.e != null) {
            sb.append(",");
            sb.append(this.e.toStringShort());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeParcelable(this.e, i);
    }

    private Location(Parcel parcel) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
        this.e = (Address) parcel.readParcelable(null);
    }
}
