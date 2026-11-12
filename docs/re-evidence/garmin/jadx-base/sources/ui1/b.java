package ui1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lui1/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "sequence", "fullName", "phoneNumber", "phoneNumberCountry", "alternatePhoneNumber", "alternatePhoneNumberCountry", "address", "city", RemoteConfigConstants.ResponseFieldKey.STATE, "zipCode", "country", Scopes.EMAIL, "emergencyNotes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getSequence", "()Ljava/lang/Integer;", "c", "getFullName", "d", "getPhoneNumber", JWKParameterNames.RSA_EXPONENT, "getPhoneNumberCountry", "f", "getAlternatePhoneNumber", "g", "getAlternatePhoneNumberCountry", "h", "getAddress", IntegerTokenConverter.CONVERTER_KEY, "getCity", "j", "getState", JWKParameterNames.OCT_KEY_VALUE, "getZipCode", "l", "getCountry", "m", "getEmail", JWKParameterNames.RSA_MODULUS, "getEmergencyNotes", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Sequence")
    private final Integer sequence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PhoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PhoneNumberCountry")
    private final String phoneNumberCountry;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AlternatePhoneNumber")
    private final String alternatePhoneNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AlternatePhoneNumberCountry")
    private final String alternatePhoneNumberCountry;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Address")
    private final String address;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("City")
    private final String city;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("State")
    private final String state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ZipCode")
    private final String zipCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Country")
    private final String country;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Email")
    private final String email;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EmergencyNotes")
    private final String emergencyNotes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & 8192) != 0 ? null : str13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.id, bVar.id) && p005kotlin.jvm.internal.s.g(this.sequence, bVar.sequence) && p005kotlin.jvm.internal.s.g(this.fullName, bVar.fullName) && p005kotlin.jvm.internal.s.g(this.phoneNumber, bVar.phoneNumber) && p005kotlin.jvm.internal.s.g(this.phoneNumberCountry, bVar.phoneNumberCountry) && p005kotlin.jvm.internal.s.g(this.alternatePhoneNumber, bVar.alternatePhoneNumber) && p005kotlin.jvm.internal.s.g(this.alternatePhoneNumberCountry, bVar.alternatePhoneNumberCountry) && p005kotlin.jvm.internal.s.g(this.address, bVar.address) && p005kotlin.jvm.internal.s.g(this.city, bVar.city) && p005kotlin.jvm.internal.s.g(this.state, bVar.state) && p005kotlin.jvm.internal.s.g(this.zipCode, bVar.zipCode) && p005kotlin.jvm.internal.s.g(this.country, bVar.country) && p005kotlin.jvm.internal.s.g(this.email, bVar.email) && p005kotlin.jvm.internal.s.g(this.emergencyNotes, bVar.emergencyNotes);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sequence;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phoneNumberCountry;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alternatePhoneNumber;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.alternatePhoneNumberCountry;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.city;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.zipCode;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.country;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.email;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.emergencyNotes;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        Integer num = this.sequence;
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
        String str13 = this.emergencyNotes;
        StringBuilder sbN = lc.u0.n("EmergencyContactInfo(id=", num, str, ", sequence=", ", fullName=");
        sn.a.t(sbN, str2, ", phoneNumber=", str3, ", phoneNumberCountry=");
        sn.a.t(sbN, str4, ", alternatePhoneNumber=", str5, ", alternatePhoneNumberCountry=");
        sn.a.t(sbN, str6, ", address=", str7, ", city=");
        sn.a.t(sbN, str8, ", state=", str9, ", zipCode=");
        sn.a.t(sbN, str10, ", country=", str11, ", email=");
        return e5.h(sbN, str12, ", emergencyNotes=", str13, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.id);
        Integer num = this.sequence;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
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
        parcel.writeString(this.emergencyNotes);
    }

    public b(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.id = str;
        this.sequence = num;
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
        this.emergencyNotes = str13;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
