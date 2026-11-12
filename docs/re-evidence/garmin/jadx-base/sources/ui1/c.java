package ui1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lui1/c;", "Landroid/os/Parcelable;", "", "externalId", "fullName", "phoneNumber", "phoneNumberCountry", "alternatePhoneNumber", "alternatePhoneNumberCountry", "address", "city", RemoteConfigConstants.ResponseFieldKey.STATE, "zipCode", "country", Scopes.EMAIL, "citizenship", "emergencyNotes", "emergencyCoordinationSupportContact", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "b", "getFullName", "c", "getPhoneNumber", "d", "getPhoneNumberCountry", JWKParameterNames.RSA_EXPONENT, "getAlternatePhoneNumber", "f", "getAlternatePhoneNumberCountry", "g", "getAddress", "h", "getCity", IntegerTokenConverter.CONVERTER_KEY, "getState", "j", "getZipCode", JWKParameterNames.OCT_KEY_VALUE, "getCountry", "l", "getEmail", "m", "getCitizenship", JWKParameterNames.RSA_MODULUS, "getEmergencyNotes", "o", "getEmergencyCoordinationSupportContact", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ExternalId")
    private final String externalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PhoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PhoneNumberCountry")
    private final String phoneNumberCountry;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AlternatePhoneNumber")
    private final String alternatePhoneNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AlternatePhoneNumberCountry")
    private final String alternatePhoneNumberCountry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Address")
    private final String address;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("City")
    private final String city;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("State")
    private final String state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ZipCode")
    private final String zipCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Country")
    private final String country;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Email")
    private final String email;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Citizenship")
    private final String citizenship;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EmergencyNotes")
    private final String emergencyNotes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EmergencyCoordinationSupportContact")
    private final String emergencyCoordinationSupportContact;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12, (i14 & 4096) != 0 ? null : str13, (i14 & 8192) != 0 ? null : str14, (i14 & 16384) != 0 ? null : str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.externalId, cVar.externalId) && p005kotlin.jvm.internal.s.g(this.fullName, cVar.fullName) && p005kotlin.jvm.internal.s.g(this.phoneNumber, cVar.phoneNumber) && p005kotlin.jvm.internal.s.g(this.phoneNumberCountry, cVar.phoneNumberCountry) && p005kotlin.jvm.internal.s.g(this.alternatePhoneNumber, cVar.alternatePhoneNumber) && p005kotlin.jvm.internal.s.g(this.alternatePhoneNumberCountry, cVar.alternatePhoneNumberCountry) && p005kotlin.jvm.internal.s.g(this.address, cVar.address) && p005kotlin.jvm.internal.s.g(this.city, cVar.city) && p005kotlin.jvm.internal.s.g(this.state, cVar.state) && p005kotlin.jvm.internal.s.g(this.zipCode, cVar.zipCode) && p005kotlin.jvm.internal.s.g(this.country, cVar.country) && p005kotlin.jvm.internal.s.g(this.email, cVar.email) && p005kotlin.jvm.internal.s.g(this.citizenship, cVar.citizenship) && p005kotlin.jvm.internal.s.g(this.emergencyNotes, cVar.emergencyNotes) && p005kotlin.jvm.internal.s.g(this.emergencyCoordinationSupportContact, cVar.emergencyCoordinationSupportContact);
    }

    public final int hashCode() {
        String str = this.externalId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phoneNumberCountry;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alternatePhoneNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.alternatePhoneNumberCountry;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.city;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.zipCode;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.country;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.email;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.citizenship;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.emergencyNotes;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.emergencyCoordinationSupportContact;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.externalId;
        String str2 = this.fullName;
        String str3 = this.phoneNumber;
        String str4 = this.phoneNumberCountry;
        String str5 = this.alternatePhoneNumber;
        String str6 = this.alternatePhoneNumberCountry;
        String str7 = this.address;
        String str8 = this.city;
        String str9 = this.state;
        String str10 = this.zipCode;
        String str11 = this.country;
        String str12 = this.email;
        String str13 = this.citizenship;
        String str14 = this.emergencyNotes;
        String str15 = this.emergencyCoordinationSupportContact;
        StringBuilder sbI = p6.b.i("EmergencyDeviceUser(externalId=", str, ", fullName=", str2, ", phoneNumber=");
        sn.a.t(sbI, str3, ", phoneNumberCountry=", str4, ", alternatePhoneNumber=");
        sn.a.t(sbI, str5, ", alternatePhoneNumberCountry=", str6, ", address=");
        sn.a.t(sbI, str7, ", city=", str8, ", state=");
        sn.a.t(sbI, str9, ", zipCode=", str10, ", country=");
        sn.a.t(sbI, str11, ", email=", str12, ", citizenship=");
        sn.a.t(sbI, str13, ", emergencyNotes=", str14, ", emergencyCoordinationSupportContact=");
        return am.j.o(str15, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.externalId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.phoneNumberCountry);
        parcel.writeString(this.alternatePhoneNumber);
        parcel.writeString(this.alternatePhoneNumberCountry);
        parcel.writeString(this.address);
        parcel.writeString(this.city);
        parcel.writeString(this.state);
        parcel.writeString(this.zipCode);
        parcel.writeString(this.country);
        parcel.writeString(this.email);
        parcel.writeString(this.citizenship);
        parcel.writeString(this.emergencyNotes);
        parcel.writeString(this.emergencyCoordinationSupportContact);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.externalId = str;
        this.fullName = str2;
        this.phoneNumber = str3;
        this.phoneNumberCountry = str4;
        this.alternatePhoneNumber = str5;
        this.alternatePhoneNumberCountry = str6;
        this.address = str7;
        this.city = str8;
        this.state = str9;
        this.zipCode = str10;
        this.country = str11;
        this.email = str12;
        this.citizenship = str13;
        this.emergencyNotes = str14;
        this.emergencyCoordinationSupportContact = str15;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
