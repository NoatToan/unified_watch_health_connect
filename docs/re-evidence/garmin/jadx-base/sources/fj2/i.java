package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015¨\u0006$"}, d2 = {"Lfj2/i;", "Lfj2/c;", "Landroid/os/Parcelable;", "", "buildingNumber", "street", "city", "line1", "line2", "line3", "line4", "provinceCode", "provinceName", "countryIso2", "countryName", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "Ljava/lang/String;", "getBuildingNumber", "()Ljava/lang/String;", "g", "getStreet", "h", "d", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "p", "getCountryName", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i extends c implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BuildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Street")
    private final String street;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("City")
    private final String city;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Line1")
    private final String line1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Line2")
    private final String line2;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Line3")
    private final String line3;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Line4")
    private final String line4;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ProvinceCode")
    private final String provinceCode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ProvinceName")
    private final String provinceName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CountryIso2")
    private final String countryIso2;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CountryName")
    private final String countryName;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PostalCode")
    private final String postalCode;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12);
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.buildingNumber, iVar.buildingNumber) && s.g(this.street, iVar.street) && s.g(this.city, iVar.city) && s.g(this.line1, iVar.line1) && s.g(this.line2, iVar.line2) && s.g(this.line3, iVar.line3) && s.g(this.line4, iVar.line4) && s.g(this.provinceCode, iVar.provinceCode) && s.g(this.provinceName, iVar.provinceName) && s.g(this.countryIso2, iVar.countryIso2) && s.g(this.countryName, iVar.countryName) && s.g(this.postalCode, iVar.postalCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryIso2() {
        return this.countryIso2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    public final int hashCode() {
        String str = this.buildingNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.street;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line1;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.line2;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.line3;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.line4;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.provinceCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.provinceName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.countryIso2;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.countryName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.postalCode;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLine3() {
        return this.line3;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLine4() {
        return this.line4;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getProvinceName() {
        return this.provinceName;
    }

    public final String toString() {
        String str = this.buildingNumber;
        String str2 = this.street;
        String str3 = this.city;
        String str4 = this.line1;
        String str5 = this.line2;
        String str6 = this.line3;
        String str7 = this.line4;
        String str8 = this.provinceCode;
        String str9 = this.provinceName;
        String str10 = this.countryIso2;
        String str11 = this.countryName;
        String str12 = this.postalCode;
        StringBuilder sbI = p6.b.i("RetrieveAddressDetailDto(buildingNumber=", str, ", street=", str2, ", city=");
        sn.a.t(sbI, str3, ", line1=", str4, ", line2=");
        sn.a.t(sbI, str5, ", line3=", str6, ", line4=");
        sn.a.t(sbI, str7, ", provinceCode=", str8, ", provinceName=");
        sn.a.t(sbI, str9, ", countryIso2=", str10, ", countryName=");
        return e5.h(sbI, str11, ", postalCode=", str12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.buildingNumber);
        parcel.writeString(this.street);
        parcel.writeString(this.city);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.line3);
        parcel.writeString(this.line4);
        parcel.writeString(this.provinceCode);
        parcel.writeString(this.provinceName);
        parcel.writeString(this.countryIso2);
        parcel.writeString(this.countryName);
        parcel.writeString(this.postalCode);
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.buildingNumber = str;
        this.street = str2;
        this.city = str3;
        this.line1 = str4;
        this.line2 = str5;
        this.line3 = str6;
        this.line4 = str7;
        this.provinceCode = str8;
        this.provinceName = str9;
        this.countryIso2 = str10;
        this.countryName = str11;
        this.postalCode = str12;
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
