package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lat")
    private double f29393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lon")
    private double f29394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("altitude")
    private double f29395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("time")
    private long f29396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("timerStart")
    private boolean f29397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("timerStop")
    private boolean f29398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("distanceFromPreviousPoint")
    private double f29399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SerializedName("distanceInMeters")
    private double f29400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("speed")
    private double f29401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("valid")
    private boolean f29402j;

    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public a0(Parcel parcel) {
        this.f29393a = parcel.readDouble();
        this.f29394b = parcel.readDouble();
        this.f29395c = parcel.readDouble();
        this.f29396d = parcel.readLong();
        this.f29397e = parcel.readInt() == 1;
        this.f29398f = parcel.readInt() == 1;
        this.f29399g = parcel.readDouble();
        this.f29400h = parcel.readDouble();
        this.f29401i = parcel.readDouble();
        this.f29402j = parcel.readInt() == 1;
    }

    public final double C() {
        return this.f29393a;
    }

    public final LatLng D() {
        return new LatLng(this.f29393a, this.f29394b);
    }

    public final double F() {
        return this.f29394b;
    }

    public final long G() {
        return this.f29396d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (Double.compare(this.f29393a, a0Var.f29393a) == 0 && Double.compare(this.f29394b, a0Var.f29394b) == 0 && Double.compare(this.f29395c, a0Var.f29395c) == 0 && this.f29396d == a0Var.f29396d && this.f29397e == a0Var.f29397e && this.f29398f == a0Var.f29398f && Double.compare(this.f29399g, a0Var.f29399g) == 0 && Double.compare(this.f29400h, a0Var.f29400h) == 0 && Double.compare(this.f29401i, a0Var.f29401i) == 0 && this.f29402j == a0Var.f29402j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.f29393a), Double.valueOf(this.f29394b), Double.valueOf(this.f29395c), Long.valueOf(this.f29396d), Boolean.valueOf(this.f29397e), Boolean.valueOf(this.f29398f), Double.valueOf(this.f29399g), Double.valueOf(this.f29400h), Double.valueOf(this.f29401i), Boolean.valueOf(this.f29402j));
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f29393a = jSONObject.optDouble("lat", 0.0d);
            this.f29394b = jSONObject.optDouble("lon", 0.0d);
            this.f29395c = jSONObject.optDouble("altitude", 0.0d);
            this.f29396d = jSONObject.optLong("time", 0L);
            this.f29397e = jSONObject.optBoolean("timerStart", false);
            this.f29398f = jSONObject.optBoolean("timerStop", false);
            this.f29399g = jSONObject.optDouble("distanceFromPreviousPoint", 0.0d);
            this.f29400h = jSONObject.optDouble("distanceInMeters", 0.0d);
            this.f29401i = jSONObject.optDouble("speed", 0.0d);
            this.f29402j = jSONObject.optBoolean("valid", false);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointDTO [lat=");
        sb3.append(this.f29393a);
        sb3.append(", lon=");
        sb3.append(this.f29394b);
        sb3.append(", altitude=");
        sb3.append(this.f29395c);
        sb3.append(", timerStart=");
        sb3.append(this.f29397e);
        sb3.append(", timerStop=");
        sb3.append(this.f29398f);
        sb3.append(", distanceFromPreviousPoint=");
        sb3.append(this.f29399g);
        sb3.append(", distanceInMeters=");
        sb3.append(this.f29400h);
        sb3.append(", speed=");
        sb3.append(this.f29401i);
        sb3.append(", valid=");
        return hb.a.k(sb3, this.f29402j, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeDouble(this.f29393a);
        parcel.writeDouble(this.f29394b);
        parcel.writeDouble(this.f29395c);
        parcel.writeDouble(this.f29396d);
        parcel.writeInt(this.f29397e ? 1 : 0);
        parcel.writeInt(this.f29398f ? 1 : 0);
        parcel.writeDouble(this.f29399g);
        parcel.writeDouble(this.f29400h);
        parcel.writeDouble(this.f29401i);
        parcel.writeInt(this.f29402j ? 1 : 0);
    }

    public a0() {
    }

    public a0(double d14, double d15, double d16, long j8, boolean z14, boolean z15, double d17, double d18, double d19, boolean z16) {
        this.f29393a = d14;
        this.f29394b = d15;
        this.f29395c = d16;
        this.f29396d = j8;
        this.f29397e = z14;
        this.f29398f = z15;
        this.f29399g = d17;
        this.f29400h = d18;
        this.f29401i = d19;
        this.f29402j = z16;
    }

    public a0(double d14, double d15, long j8) {
        this.f29393a = d14;
        this.f29394b = d15;
        this.f29396d = j8;
    }
}
