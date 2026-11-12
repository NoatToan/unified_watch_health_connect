package g42;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.gms.maps.model.FeatureType;
import i3.e5;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eBM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lg42/d;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "useFixedLocation", "", "latitude", "longitude", "", "locationName", "isoCountryCode", "postalCode", "<init>", "(ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d extends s1 implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f75785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f75786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f75787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f75789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f75790g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ d(boolean z14, Double d14, Double d15, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3);
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("useFixedLocation", this.f75784a);
            jSONObject.put("latitude", this.f75785b);
            jSONObject.put("longitude", this.f75786c);
            jSONObject.put("locationName", this.f75787d);
            jSONObject.put("isoCountryCode", this.f75788e);
            jSONObject.put("postalCode", this.f75789f);
            return jSONObject;
        } catch (JSONException e4) {
            this.f75790g.error("Error when converting to JSON object", (Throwable) e4);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f75784a == dVar.f75784a && p005kotlin.jvm.internal.s.d(this.f75785b, dVar.f75785b) && p005kotlin.jvm.internal.s.d(this.f75786c, dVar.f75786c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f75784a) * 31;
        Double d14 = this.f75785b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f75786c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.f75787d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75788e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75789f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            Boolean boolValueOf = Boolean.FALSE;
            if (!jSONObject.isNull("useFixedLocation")) {
                boolValueOf = Boolean.valueOf(jSONObject.optBoolean("useFixedLocation", false));
            }
            this.f75784a = boolValueOf.booleanValue();
            this.f75785b = s1.q(jSONObject, "latitude");
            this.f75786c = s1.q(jSONObject, "longitude");
            this.f75787d = s1.u(jSONObject, "locationName");
            this.f75788e = s1.u(jSONObject, "isoCountryCode");
            this.f75789f = s1.u(jSONObject, "postalCode");
        }
    }

    public final String toString() {
        boolean z14 = this.f75784a;
        Double d14 = this.f75785b;
        Double d15 = this.f75786c;
        String str = this.f75787d;
        String str2 = this.f75788e;
        String str3 = this.f75789f;
        StringBuilder sb3 = new StringBuilder("WeatherLocationDTO(useFixedLocation=");
        sb3.append(z14);
        sb3.append(", latitude=");
        sb3.append(d14);
        sb3.append(", longitude=");
        b71.i.u(sb3, d15, ", locationName=", str, ", isoCountryCode=");
        return e5.h(sb3, str2, ", postalCode=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f75784a ? 1 : 0);
        Double d14 = this.f75785b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f75786c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.f75787d);
        parcel.writeString(this.f75788e);
        parcel.writeString(this.f75789f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lg42/d$a;", "", "<init>", "()V", "", "ISO_COUNTRY_CODE", "Ljava/lang/String;", "LATITUDE", "LOCATION_NAME", "LONGITUDE", FeatureType.POSTAL_CODE, "USE_FIXED_LOCATION", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(boolean z14, Double d14, Double d15, String str, String str2, String str3) {
        this.f75784a = z14;
        this.f75785b = d14;
        this.f75786c = d15;
        this.f75787d = str;
        this.f75788e = str2;
        this.f75789f = str3;
        int i14 = gt2.c.f79010a;
        this.f75790g = gt2.b.f79005a.h("WeatherLocationDTO");
    }

    public d() {
        this(false, null, null, null, null, null, 63, null);
    }
}
