package o20;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2466a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("x")
    private double f128638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE)
    private double f128639b;

    /* JADX INFO: renamed from: o20.a$a, reason: collision with other inner class name */
    public class C2466a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f128638a = parcel.readDouble();
        this.f128639b = parcel.readDouble();
    }

    public final double C() {
        return this.f128638a;
    }

    public final double D() {
        return this.f128639b;
    }

    public final void F(double d14) {
        this.f128638a = d14;
    }

    public final void G(double d14) {
        this.f128639b = d14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f128638a = jSONObject.optDouble("x");
            this.f128639b = jSONObject.optDouble(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeDouble(this.f128638a);
        parcel.writeDouble(this.f128639b);
    }

    public a(double d14, double d15) {
        this.f128638a = d14;
        this.f128639b = d15;
    }

    public a() {
    }
}
