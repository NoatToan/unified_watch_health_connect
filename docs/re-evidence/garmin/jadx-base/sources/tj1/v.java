package tj1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b+\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b-\u0010\u001aR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0016\u001a\u0004\b,\u0010\u0018\"\u0004\b/\u0010\u001aR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b.\u0010\u0018\"\u0004\b5\u0010\u001aR,\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b0\u00108\"\u0004\b9\u0010:R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0016\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b>\u0010\u001a¨\u0006?"}, d2 = {"Ltj1/v;", "Landroid/os/Parcelable;", "", "billingID", "", NotificationConstants.KEY_DATA_MIME_TYPE, "firstName", "lastName", "company", "address1", "address2", "city", "stateOrProvince", "postalCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "emailAddresses", "primaryPhone", "cellPhone", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getBillingID", "()Ljava/lang/String;", "setBillingID", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "c", "j", "setFirstName", "d", JWKParameterNames.OCT_KEY_VALUE, "setLastName", JWKParameterNames.RSA_EXPONENT, "getCompany", "setCompany", "f", "setAddress1", "g", "setAddress2", "h", "setCity", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setStateOrProvince", "m", "setPostalCode", "setCountryCode", "l", "Ljava/util/List;", "()Ljava/util/List;", "setEmailAddresses", "(Ljava/util/List;)V", "o", "setPrimaryPhone", JWKParameterNames.RSA_MODULUS, "setCellPhone", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BillingID")
    private String billingID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Type")
    private Integer type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FirstName")
    private String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("LastName")
    private String lastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Company")
    private String company;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Address1")
    private String address1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Address2")
    private String address2;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("City")
    private String city;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("StateOrProvince")
    private String stateOrProvince;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PostalCode")
    private String postalCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CountryCode")
    private String countryCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EmailAddresses")
    private List<String> emailAddresses;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PrimaryPhone")
    private String primaryPhone;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CellPhone")
    private String cellPhone;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new v(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public /* synthetic */ v(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? new ArrayList() : list, (i14 & 4096) != 0 ? null : str11, (i14 & 8192) != 0 ? null : str12);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddress1() {
        return this.address1;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAddress2() {
        return this.address2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.billingID, vVar.billingID) && p005kotlin.jvm.internal.s.g(this.type, vVar.type) && p005kotlin.jvm.internal.s.g(this.firstName, vVar.firstName) && p005kotlin.jvm.internal.s.g(this.lastName, vVar.lastName) && p005kotlin.jvm.internal.s.g(this.company, vVar.company) && p005kotlin.jvm.internal.s.g(this.address1, vVar.address1) && p005kotlin.jvm.internal.s.g(this.address2, vVar.address2) && p005kotlin.jvm.internal.s.g(this.city, vVar.city) && p005kotlin.jvm.internal.s.g(this.stateOrProvince, vVar.stateOrProvince) && p005kotlin.jvm.internal.s.g(this.postalCode, vVar.postalCode) && p005kotlin.jvm.internal.s.g(this.countryCode, vVar.countryCode) && p005kotlin.jvm.internal.s.g(this.emailAddresses, vVar.emailAddresses) && p005kotlin.jvm.internal.s.g(this.primaryPhone, vVar.primaryPhone) && p005kotlin.jvm.internal.s.g(this.cellPhone, vVar.cellPhone);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCellPhone() {
        return this.cellPhone;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int hashCode() {
        String str = this.billingID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.company;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address1;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address2;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.city;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stateOrProvince;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.countryCode;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.emailAddresses;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.primaryPhone;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cellPhone;
        return iHashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public final List<String> i() {
        return this.emailAddresses;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPrimaryPhone() {
        return this.primaryPhone;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    public final String toString() {
        String str = this.billingID;
        Integer num = this.type;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.company;
        String str5 = this.address1;
        String str6 = this.address2;
        String str7 = this.city;
        String str8 = this.stateOrProvince;
        String str9 = this.postalCode;
        String str10 = this.countryCode;
        List<String> list = this.emailAddresses;
        String str11 = this.primaryPhone;
        String str12 = this.cellPhone;
        StringBuilder sbN = u0.n("SubscriptionContactDTO(billingID=", num, str, ", type=", ", firstName=");
        sn.a.t(sbN, str2, ", lastName=", str3, ", company=");
        sn.a.t(sbN, str4, ", address1=", str5, ", address2=");
        sn.a.t(sbN, str6, ", city=", str7, ", stateOrProvince=");
        sn.a.t(sbN, str8, ", postalCode=", str9, ", countryCode=");
        e0.o(str10, ", emailAddresses=", ", primaryPhone=", sbN, list);
        return e5.h(sbN, str11, ", cellPhone=", str12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.billingID);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.company);
        parcel.writeString(this.address1);
        parcel.writeString(this.address2);
        parcel.writeString(this.city);
        parcel.writeString(this.stateOrProvince);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.countryCode);
        parcel.writeStringList(this.emailAddresses);
        parcel.writeString(this.primaryPhone);
        parcel.writeString(this.cellPhone);
    }

    public v(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, String str11, String str12) {
        this.billingID = str;
        this.type = num;
        this.firstName = str2;
        this.lastName = str3;
        this.company = str4;
        this.address1 = str5;
        this.address2 = str6;
        this.city = str7;
        this.stateOrProvince = str8;
        this.postalCode = str9;
        this.countryCode = str10;
        this.emailAddresses = list;
        this.primaryPhone = str11;
        this.cellPhone = str12;
    }

    public v() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
