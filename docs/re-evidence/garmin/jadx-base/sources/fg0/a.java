package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lfg0/a;", "Landroid/os/Parcelable;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "stateNative", "stateEn", "cityEn", "cityNative", "nativeLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "getStateNative", "c", "g", JWKParameterNames.RSA_EXPONENT, "getCityNative", "f", "getNativeLocale", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1454a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateNative")
    private final String stateNative;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateEn")
    private final String stateEn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cityEn")
    private final String cityEn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cityNative")
    private final String cityNative;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeLocale")
    private final String nativeLocale;

    /* JADX INFO: renamed from: fg0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1454a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.countryCode = str;
        this.stateNative = str2;
        this.stateEn = str3;
        this.cityEn = str4;
        this.cityNative = str5;
        this.nativeLocale = str6;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCityEn() {
        return this.cityEn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.countryCode, aVar.countryCode) && p005kotlin.jvm.internal.s.g(this.stateNative, aVar.stateNative) && p005kotlin.jvm.internal.s.g(this.stateEn, aVar.stateEn) && p005kotlin.jvm.internal.s.g(this.cityEn, aVar.cityEn) && p005kotlin.jvm.internal.s.g(this.cityNative, aVar.cityNative) && p005kotlin.jvm.internal.s.g(this.nativeLocale, aVar.nativeLocale);
    }

    public final String f() {
        String str = this.stateNative;
        if (str == null) {
            str = this.stateEn;
        }
        String str2 = this.cityNative;
        if (str2 == null) {
            str2 = this.cityEn;
        }
        if (g22.n.d(str) && g22.n.d(str2)) {
            return e5.g(str2, ", ", str);
        }
        return g22.n.d(str) ? str : str2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStateEn() {
        return this.stateEn;
    }

    public final int hashCode() {
        String str = this.countryCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateNative;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateEn;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cityEn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cityNative;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nativeLocale;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.countryCode;
        String str2 = this.stateNative;
        String str3 = this.stateEn;
        String str4 = this.cityEn;
        String str5 = this.cityNative;
        String str6 = this.nativeLocale;
        StringBuilder sbI = p6.b.i("AdministrativeAreaDTO(countryCode=", str, ", stateNative=", str2, ", stateEn=");
        sn.a.t(sbI, str3, ", cityEn=", str4, ", cityNative=");
        return e5.h(sbI, str5, ", nativeLocale=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.countryCode);
        parcel.writeString(this.stateNative);
        parcel.writeString(this.stateEn);
        parcel.writeString(this.cityEn);
        parcel.writeString(this.cityNative);
        parcel.writeString(this.nativeLocale);
    }
}
