package com.xiaomi.hm.health.locweather.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.nfc.web.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class MyLocation implements Parcelable {
    public static final Parcelable.Creator<MyLocation> CREATOR = new a();
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

        @VisibleForTesting
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

        public void q(String str) {
            this.h = str;
        }

        public void r(String str) {
            this.i = str;
        }

        public void setAdmin(String str) {
            this.c = str;
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
            return "\n\t\tCountry : " + this.a + ", CountryCode : " + this.b + ", Admin : " + this.c + ", SubAdmin : " + this.d + ", Locality : " + this.e + ", SubLocality : " + this.f + ", Thoroughfare : " + this.g + ", AdCode : " + this.h + ", CityCode : " + this.i;
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

    public class a implements Parcelable.Creator<MyLocation> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MyLocation createFromParcel(Parcel parcel) {
            return new MyLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MyLocation[] newArray(int i) {
            return new MyLocation[i];
        }
    }

    @VisibleForTesting
    public MyLocation() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
    }

    public static MyLocation fromJsonString(String str) {
        try {
            MyLocation myLocation = new MyLocation();
            JSONObject jSONObject = new JSONObject(str);
            myLocation.a = jSONObject.optDouble(Constant.KEY_LONGITUDE, 0.0d);
            myLocation.b = jSONObject.optDouble(Constant.KEY_LATITUDE, 0.0d);
            myLocation.c = jSONObject.optDouble("altitude", 0.0d);
            myLocation.d = jSONObject.optBoolean("has_altitude", false);
            myLocation.e = new Address();
            JSONObject jSONObject2 = jSONObject.getJSONObject(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            myLocation.e.b = jSONObject2.optString("countryCode", "");
            myLocation.e.c = jSONObject2.optString("admin", "");
            myLocation.e.d = jSONObject2.optString("subAdmin", "");
            myLocation.e.e = jSONObject2.optString("locality", "");
            myLocation.e.f = jSONObject2.optString("subLocality", "");
            myLocation.e.g = jSONObject2.optString("thoroughfare", "");
            myLocation.e.h = jSONObject2.optString("adCode", "");
            myLocation.e.i = jSONObject2.optString("cityCode", "");
            return myLocation;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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

    @VisibleForTesting
    public void setLatitude(double d) {
        this.b = d;
    }

    @VisibleForTesting
    public void setLongitude(double d) {
        this.a = d;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constant.KEY_LONGITUDE, this.a);
            jSONObject.put(Constant.KEY_LATITUDE, this.b);
            jSONObject.put("altitude", this.c);
            jSONObject.put("has_altitude", this.d);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countryCode", this.e.b);
            jSONObject2.put("admin", this.e.c);
            jSONObject2.put("subAdmin", this.e.d);
            jSONObject2.put("locality", this.e.e);
            jSONObject2.put("subLocality", this.e.f);
            jSONObject2.put("thoroughfare", this.e.g);
            jSONObject2.put("adCode", this.e.h);
            jSONObject2.put("cityCode", this.e.i);
            jSONObject.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, jSONObject2);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toShortString() {
        Address address = this.e;
        return this.a + "," + this.b + "," + this.c + "," + (address == null ? "" : address.f);
    }

    public String toString() {
        return "\n\tLongitude : " + this.a + ", Latitude : " + this.b + ",Altitude:" + this.c + "\n\tAddress : " + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeParcelable(this.e, i);
    }

    private MyLocation(Parcel parcel) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
