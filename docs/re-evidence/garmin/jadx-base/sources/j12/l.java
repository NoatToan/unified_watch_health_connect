package j12;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010 R\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 R\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,R\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u001e\u001a\u0004\bI\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u001e\u001a\u0004\bK\u0010 R\u001a\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010*\u001a\u0004\bM\u0010,¨\u0006N"}, d2 = {"Lj12/l;", "", "", "birthDate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "countryCodeVerified", "countryCodeVerifiedTimestamp", "", "dayOfWeekPk", "decimalFormat", "displayName", "emailAddress", "firstName", "formatLocalePk", "garminGUID", "garminGlobalId", "gender", "glucoseMeasurementUnitId", "hydrationMeasurementUnitId", "lastName", "measurementSystemPk", "timeFormat", "timeZonePk", "tocAcceptedDate", "userName", "userProfilePk", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getBirthDate", "()Ljava/lang/String;", "b", "getCountryCode", "c", "Z", "getCountryCodeVerified", "()Z", "d", "getCountryCodeVerifiedTimestamp", JWKParameterNames.RSA_EXPONENT, "I", "getDayOfWeekPk", "()I", "f", "getDecimalFormat", "g", "getDisplayName", "h", "getEmailAddress", IntegerTokenConverter.CONVERTER_KEY, "getFirstName", "j", "getFormatLocalePk", JWKParameterNames.OCT_KEY_VALUE, "l", "getGarminGlobalId", "m", "getGender", JWKParameterNames.RSA_MODULUS, "getGlucoseMeasurementUnitId", "o", "getHydrationMeasurementUnitId", "p", "getLastName", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getMeasurementSystemPk", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getTimeFormat", "s", "getTimeZonePk", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getTocAcceptedDate", "u", "getUserName", "v", "getUserProfilePk", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("birthDate")
    private final String birthDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryCodeVerified")
    private final boolean countryCodeVerified;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryCodeVerifiedTimestamp")
    private final String countryCodeVerifiedTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayOfWeekPk")
    private final int dayOfWeekPk;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("decimalFormat")
    private final int decimalFormat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emailAddress")
    private final String emailAddress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("formatLocalePk")
    private final int formatLocalePk;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGUID")
    private final String garminGUID;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGlobalId")
    private final String garminGlobalId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private final String gender;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("glucoseMeasurementUnitId")
    private final int glucoseMeasurementUnitId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationMeasurementUnitId")
    private final int hydrationMeasurementUnitId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementSystemPk")
    private final int measurementSystemPk;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeFormat")
    private final int timeFormat;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeZonePk")
    private final int timeZonePk;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tocAcceptedDate")
    private final String tocAcceptedDate;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userName")
    private final String userName;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final int userProfilePk;

    public l(String str, String str2, boolean z14, String str3, int i14, int i15, String str4, String str5, String str6, int i16, String str7, String str8, String str9, int i17, int i18, String str10, int i19, int i24, int i25, String str11, String str12, int i26) {
        str4.getClass();
        str8.getClass();
        this.birthDate = str;
        this.countryCode = str2;
        this.countryCodeVerified = z14;
        this.countryCodeVerifiedTimestamp = str3;
        this.dayOfWeekPk = i14;
        this.decimalFormat = i15;
        this.displayName = str4;
        this.emailAddress = str5;
        this.firstName = str6;
        this.formatLocalePk = i16;
        this.garminGUID = str7;
        this.garminGlobalId = str8;
        this.gender = str9;
        this.glucoseMeasurementUnitId = i17;
        this.hydrationMeasurementUnitId = i18;
        this.lastName = str10;
        this.measurementSystemPk = i19;
        this.timeFormat = i24;
        this.timeZonePk = i25;
        this.tocAcceptedDate = str11;
        this.userName = str12;
        this.userProfilePk = i26;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGarminGUID() {
        return this.garminGUID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.birthDate, lVar.birthDate) && s.g(this.countryCode, lVar.countryCode) && this.countryCodeVerified == lVar.countryCodeVerified && s.g(this.countryCodeVerifiedTimestamp, lVar.countryCodeVerifiedTimestamp) && this.dayOfWeekPk == lVar.dayOfWeekPk && this.decimalFormat == lVar.decimalFormat && s.g(this.displayName, lVar.displayName) && s.g(this.emailAddress, lVar.emailAddress) && s.g(this.firstName, lVar.firstName) && this.formatLocalePk == lVar.formatLocalePk && s.g(this.garminGUID, lVar.garminGUID) && s.g(this.garminGlobalId, lVar.garminGlobalId) && s.g(this.gender, lVar.gender) && this.glucoseMeasurementUnitId == lVar.glucoseMeasurementUnitId && this.hydrationMeasurementUnitId == lVar.hydrationMeasurementUnitId && s.g(this.lastName, lVar.lastName) && this.measurementSystemPk == lVar.measurementSystemPk && this.timeFormat == lVar.timeFormat && this.timeZonePk == lVar.timeZonePk && s.g(this.tocAcceptedDate, lVar.tocAcceptedDate) && s.g(this.userName, lVar.userName) && this.userProfilePk == lVar.userProfilePk;
    }

    public final int hashCode() {
        String str = this.birthDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iG = q6.f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.countryCodeVerified);
        String str3 = this.countryCodeVerifiedTimestamp;
        int iJ = wr.g.j(q2.d(this.decimalFormat, q2.d(this.dayOfWeekPk, (iG + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.displayName);
        String str4 = this.emailAddress;
        int iHashCode2 = (iJ + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int iD = q2.d(this.formatLocalePk, (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.garminGUID;
        int iJ2 = wr.g.j((iD + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.garminGlobalId);
        String str7 = this.gender;
        int iD2 = q2.d(this.hydrationMeasurementUnitId, q2.d(this.glucoseMeasurementUnitId, (iJ2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        String str8 = this.lastName;
        int iD3 = q2.d(this.timeZonePk, q2.d(this.timeFormat, q2.d(this.measurementSystemPk, (iD2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31);
        String str9 = this.tocAcceptedDate;
        int iHashCode3 = (iD3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.userName;
        return Integer.hashCode(this.userProfilePk) + ((iHashCode3 + (str10 != null ? str10.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.birthDate;
        String str2 = this.countryCode;
        boolean z14 = this.countryCodeVerified;
        String str3 = this.countryCodeVerifiedTimestamp;
        int i14 = this.dayOfWeekPk;
        int i15 = this.decimalFormat;
        String str4 = this.displayName;
        String str5 = this.emailAddress;
        String str6 = this.firstName;
        int i16 = this.formatLocalePk;
        String str7 = this.garminGUID;
        String str8 = this.garminGlobalId;
        String str9 = this.gender;
        int i17 = this.glucoseMeasurementUnitId;
        int i18 = this.hydrationMeasurementUnitId;
        String str10 = this.lastName;
        int i19 = this.measurementSystemPk;
        int i24 = this.timeFormat;
        int i25 = this.timeZonePk;
        String str11 = this.tocAcceptedDate;
        String str12 = this.userName;
        int i26 = this.userProfilePk;
        StringBuilder sbI = p6.b.i("UserProfileBaseDTO(birthDate=", str, ", countryCode=", str2, ", countryCodeVerified=");
        fb1.c.w(", countryCodeVerifiedTimestamp=", str3, ", dayOfWeekPk=", sbI, z14);
        e0.m(i14, i15, ", decimalFormat=", ", displayName=", sbI);
        sn.a.t(sbI, str4, ", emailAddress=", str5, ", firstName=");
        q6.f.q(i16, str6, ", formatLocalePk=", ", garminGUID=", sbI);
        sn.a.t(sbI, str7, ", garminGlobalId=", str8, ", gender=");
        q6.f.q(i17, str9, ", glucoseMeasurementUnitId=", ", hydrationMeasurementUnitId=", sbI);
        wr.g.t(i18, ", lastName=", str10, ", measurementSystemPk=", sbI);
        e0.m(i19, i24, ", timeFormat=", ", timeZonePk=", sbI);
        wr.g.t(i25, ", tocAcceptedDate=", str11, ", userName=", sbI);
        sbI.append(str12);
        sbI.append(", userProfilePk=");
        sbI.append(i26);
        sbI.append(")");
        return sbI.toString();
    }
}
