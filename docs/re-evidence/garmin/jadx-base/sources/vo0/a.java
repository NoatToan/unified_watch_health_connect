package vo0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b!\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014¨\u0006$"}, d2 = {"Lvo0/a;", "Landroid/os/Parcelable;", "", Constants.ScionAnalytics.PARAM_LABEL, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countryName", "stateCode", RemoteConfigConstants.ResponseFieldKey.STATE, "countyCode", "county", "city", "district", "street", "postalCode", "houseNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "f", "c", "g", "d", "getStateCode", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.OCT_KEY_VALUE, "getCountyCode", "getCounty", "h", "getDistrict", "j", "m", "l", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3343a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryName")
    private final String countryName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateCode")
    private final String stateCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countyCode")
    private final String countyCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("county")
    private final String county;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private final String city;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("district")
    private final String district;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("street")
    private final String street;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: vo0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3343a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12);
    }

    public static a b(a aVar, String str) {
        return new a(str, aVar.countryCode, aVar.countryName, aVar.stateCode, aVar.state, aVar.countyCode, aVar.county, aVar.city, aVar.district, aVar.street, aVar.postalCode, aVar.houseNumber);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
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
        return s.g(this.label, aVar.label) && s.g(this.countryCode, aVar.countryCode) && s.g(this.countryName, aVar.countryName) && s.g(this.stateCode, aVar.stateCode) && s.g(this.state, aVar.state) && s.g(this.countyCode, aVar.countyCode) && s.g(this.county, aVar.county) && s.g(this.city, aVar.city) && s.g(this.district, aVar.district) && s.g(this.street, aVar.street) && s.g(this.postalCode, aVar.postalCode) && s.g(this.houseNumber, aVar.houseNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stateCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countyCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.county;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.city;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.district;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.street;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.postalCode;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.houseNumber;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public final String toString() {
        String str = this.label;
        String str2 = this.countryCode;
        String str3 = this.countryName;
        String str4 = this.stateCode;
        String str5 = this.state;
        String str6 = this.countyCode;
        String str7 = this.county;
        String str8 = this.city;
        String str9 = this.district;
        String str10 = this.street;
        String str11 = this.postalCode;
        String str12 = this.houseNumber;
        StringBuilder sbI = p6.b.i("GeofenceItemAddress(label=", str, ", countryCode=", str2, ", countryName=");
        sn.a.t(sbI, str3, ", stateCode=", str4, ", state=");
        sn.a.t(sbI, str5, ", countyCode=", str6, ", county=");
        sn.a.t(sbI, str7, ", city=", str8, ", district=");
        sn.a.t(sbI, str9, ", street=", str10, ", postalCode=");
        return e5.h(sbI, str11, ", houseNumber=", str12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.label);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
        parcel.writeString(this.stateCode);
        parcel.writeString(this.state);
        parcel.writeString(this.countyCode);
        parcel.writeString(this.county);
        parcel.writeString(this.city);
        parcel.writeString(this.district);
        parcel.writeString(this.street);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.houseNumber);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.label = str;
        this.countryCode = str2;
        this.countryName = str3;
        this.stateCode = str4;
        this.state = str5;
        this.countyCode = str6;
        this.county = str7;
        this.city = str8;
        this.district = str9;
        this.street = str10;
        this.postalCode = str11;
        this.houseNumber = str12;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
