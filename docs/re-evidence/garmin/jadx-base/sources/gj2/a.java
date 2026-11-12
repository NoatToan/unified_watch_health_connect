package gj2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b4\u0010\u001cR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b5\u0010\u001a\"\u0004\b8\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b:\u0010\u001cR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0018\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&\"\u0004\b?\u0010(R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0018\u001a\u0004\bA\u0010\u001a\"\u0004\b@\u0010\u001cR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0018\u001a\u0004\b,\u0010\u001a\"\u0004\bC\u0010\u001cR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\bE\u0010\u001c¨\u0006F"}, d2 = {"Lgj2/a;", "Landroid/os/Parcelable;", "", "addressId", NotificationConstants.KEY_DATA_MIME_TYPE, "globalType", "", "predicted", "line1", "line2", "line3", "line4", "city", "stateOrProvince", "postalCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countyOrParish", "primary", "phoneNumberId", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getAddressId", "()Ljava/lang/String;", "setAddressId", "(Ljava/lang/String;)V", "b", "getType", "setType", "c", "getGlobalType", "setGlobalType", "d", "Z", JWKParameterNames.OCT_KEY_VALUE, "()Z", "setPredicted", "(Z)V", JWKParameterNames.RSA_EXPONENT, "h", "setLine1", "f", IntegerTokenConverter.CONVERTER_KEY, "setLine2", "g", "getLine3", "setLine3", "getLine4", "setLine4", "setCity", "j", "m", "setStateOrProvince", "setPostalCode", "l", "setCountryCode", "getCountyOrParish", "setCountyOrParish", JWKParameterNames.RSA_MODULUS, "getPrimary", "setPrimary", "o", "getPhoneNumberId", "p", "setFirstName", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setLastName", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1567a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressId")
    private String addressId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("globalType")
    private String globalType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predicted")
    private boolean predicted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line1")
    private String line1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line2")
    private String line2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line3")
    private String line3;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line4")
    private String line4;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private String city;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateOrProvince")
    private String stateOrProvince;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalCode")
    private String postalCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private String countryCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countyOrParish")
    private String countyOrParish;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primary")
    private boolean primary;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumberId")
    private String phoneNumberId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private String firstName;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private String lastName;

    /* JADX INFO: renamed from: gj2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1567a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z16 = z15;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z17 = true;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                z17 = z16;
            }
            return new a(string, string2, string3, z14, string4, string5, string6, string7, string8, string9, string10, string11, string12, z17, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z14, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z15, String str13, String str14, String str15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & 8192) == 0 ? z15 : false, (i14 & 16384) != 0 ? null : str13, (i14 & 32768) != 0 ? null : str14, (i14 & 65536) != 0 ? null : str15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
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
        return s.g(this.addressId, aVar.addressId) && s.g(this.type, aVar.type) && s.g(this.globalType, aVar.globalType) && this.predicted == aVar.predicted && s.g(this.line1, aVar.line1) && s.g(this.line2, aVar.line2) && s.g(this.line3, aVar.line3) && s.g(this.line4, aVar.line4) && s.g(this.city, aVar.city) && s.g(this.stateOrProvince, aVar.stateOrProvince) && s.g(this.postalCode, aVar.postalCode) && s.g(this.countryCode, aVar.countryCode) && s.g(this.countyOrParish, aVar.countyOrParish) && this.primary == aVar.primary && s.g(this.phoneNumberId, aVar.phoneNumberId) && s.g(this.firstName, aVar.firstName) && s.g(this.lastName, aVar.lastName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    public final int hashCode() {
        String str = this.addressId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.globalType;
        int iG = f.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.predicted);
        String str4 = this.line1;
        int iHashCode3 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.line2;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.line3;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.line4;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.city;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stateOrProvince;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.postalCode;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.countryCode;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.countyOrParish;
        int iG2 = f.g((iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.primary);
        String str13 = this.phoneNumberId;
        int iHashCode11 = (iG2 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.firstName;
        int iHashCode12 = (iHashCode11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastName;
        return iHashCode12 + (str15 != null ? str15.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getPredicted() {
        return this.predicted;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    public final void o(String str) {
        this.phoneNumberId = str;
    }

    public final String toString() {
        String str = this.addressId;
        String str2 = this.type;
        String str3 = this.globalType;
        boolean z14 = this.predicted;
        String str4 = this.line1;
        String str5 = this.line2;
        String str6 = this.line3;
        String str7 = this.line4;
        String str8 = this.city;
        String str9 = this.stateOrProvince;
        String str10 = this.postalCode;
        String str11 = this.countryCode;
        String str12 = this.countyOrParish;
        boolean z15 = this.primary;
        String str13 = this.phoneNumberId;
        String str14 = this.firstName;
        String str15 = this.lastName;
        StringBuilder sbI = p6.b.i("AddressRequestDto(addressId=", str, ", type=", str2, ", globalType=");
        h.C(str3, ", predicted=", ", line1=", sbI, z14);
        sn.a.t(sbI, str4, ", line2=", str5, ", line3=");
        sn.a.t(sbI, str6, ", line4=", str7, ", city=");
        sn.a.t(sbI, str8, ", stateOrProvince=", str9, ", postalCode=");
        sn.a.t(sbI, str10, ", countryCode=", str11, ", countyOrParish=");
        h.C(str12, ", primary=", ", phoneNumberId=", sbI, z15);
        sn.a.t(sbI, str13, ", firstName=", str14, ", lastName=");
        return am.j.o(str15, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.addressId);
        parcel.writeString(this.type);
        parcel.writeString(this.globalType);
        parcel.writeInt(this.predicted ? 1 : 0);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.line3);
        parcel.writeString(this.line4);
        parcel.writeString(this.city);
        parcel.writeString(this.stateOrProvince);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countyOrParish);
        parcel.writeInt(this.primary ? 1 : 0);
        parcel.writeString(this.phoneNumberId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public a(String str, String str2, String str3, boolean z14, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z15, String str13, String str14, String str15) {
        this.addressId = str;
        this.type = str2;
        this.globalType = str3;
        this.predicted = z14;
        this.line1 = str4;
        this.line2 = str5;
        this.line3 = str6;
        this.line4 = str7;
        this.city = str8;
        this.stateOrProvince = str9;
        this.postalCode = str10;
        this.countryCode = str11;
        this.countyOrParish = str12;
        this.primary = z15;
        this.phoneNumberId = str13;
        this.firstName = str14;
        this.lastName = str15;
    }

    public a() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, 131071, null);
    }
}
