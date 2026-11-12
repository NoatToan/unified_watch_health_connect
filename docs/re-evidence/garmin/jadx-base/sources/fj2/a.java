package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0019\u001a\u0004\b+\u0010\u001b¨\u00062"}, d2 = {"Lfj2/a;", "Landroid/os/Parcelable;", "", "addressId", NotificationConstants.KEY_DATA_MIME_TYPE, "globalType", "", "predicted", "line1", "line2", "line3", "line4", "city", "stateOrProvince", "postalCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countyOrParish", "phoneNumberId", "firstName", "lastName", "phoneNumber", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getType", "c", "getGlobalType", "d", "Z", "s", "()Z", JWKParameterNames.RSA_EXPONENT, "j", "f", JWKParameterNames.OCT_KEY_VALUE, "g", "m", "h", "o", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "l", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "p", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1462a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressId")
    private final String addressId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("globalType")
    private final String globalType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predicted")
    private final boolean predicted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line1")
    private final String line1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line2")
    private final String line2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line3")
    private final String line3;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("line4")
    private final String line4;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private final String city;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateOrProvince")
    private final String stateOrProvince;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countyOrParish")
    private final String countyOrParish;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumberId")
    private final String phoneNumberId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f71862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f71863r;

    /* JADX INFO: renamed from: fj2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1462a implements Parcelable.Creator<a> {
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
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            boolean z17 = true;
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                z17 = z16;
            }
            return new a(string, string2, string3, z14, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, z17);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z14, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & 8192) != 0 ? null : str13, (i14 & 16384) != 0 ? null : str14, (i14 & 32768) != 0 ? null : str15, (i14 & 65536) != 0 ? null : str16, (i14 & 131072) != 0 ? false : z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
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
        return s.g(this.addressId, aVar.addressId) && s.g(this.type, aVar.type) && s.g(this.globalType, aVar.globalType) && this.predicted == aVar.predicted && s.g(this.line1, aVar.line1) && s.g(this.line2, aVar.line2) && s.g(this.line3, aVar.line3) && s.g(this.line4, aVar.line4) && s.g(this.city, aVar.city) && s.g(this.stateOrProvince, aVar.stateOrProvince) && s.g(this.postalCode, aVar.postalCode) && s.g(this.countryCode, aVar.countryCode) && s.g(this.countyOrParish, aVar.countyOrParish) && s.g(this.phoneNumberId, aVar.phoneNumberId) && s.g(this.firstName, aVar.firstName) && s.g(this.lastName, aVar.lastName) && s.g(this.f71862q, aVar.f71862q) && this.f71863r == aVar.f71863r;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCountyOrParish() {
        return this.countyOrParish;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final int hashCode() {
        String str = this.addressId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.globalType;
        int iG = q6.f.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.predicted);
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
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.phoneNumberId;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.firstName;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastName;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f71862q;
        return Boolean.hashCode(this.f71863r) + ((iHashCode14 + (str16 != null ? str16.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getLine3() {
        return this.line3;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getLine4() {
        return this.line4;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getPredicted() {
        return this.predicted;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
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
        String str13 = this.phoneNumberId;
        String str14 = this.firstName;
        String str15 = this.lastName;
        String str16 = this.f71862q;
        boolean z15 = this.f71863r;
        StringBuilder sbI = p6.b.i("AddressDto(addressId=", str, ", type=", str2, ", globalType=");
        v.h.C(str3, ", predicted=", ", line1=", sbI, z14);
        sn.a.t(sbI, str4, ", line2=", str5, ", line3=");
        sn.a.t(sbI, str6, ", line4=", str7, ", city=");
        sn.a.t(sbI, str8, ", stateOrProvince=", str9, ", postalCode=");
        sn.a.t(sbI, str10, ", countryCode=", str11, ", countyOrParish=");
        sn.a.t(sbI, str12, ", phoneNumberId=", str13, ", firstName=");
        sn.a.t(sbI, str14, ", lastName=", str15, ", phoneNumber=");
        return am.j.n(str16, ", isChecked=", ")", sbI, z15);
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
        parcel.writeString(this.phoneNumberId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.f71862q);
        parcel.writeInt(this.f71863r ? 1 : 0);
    }

    public a(String str, String str2, String str3, boolean z14, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z15) {
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
        this.phoneNumberId = str13;
        this.firstName = str14;
        this.lastName = str15;
        this.f71862q = str16;
        this.f71863r = z15;
    }

    public a() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 262143, null);
    }
}
