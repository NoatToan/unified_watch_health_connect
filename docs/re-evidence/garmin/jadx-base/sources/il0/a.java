package il0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b\"\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b2\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b3\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b5\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b1\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b9\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b:\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b,\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b;\u0010%R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b7\u0010/R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b6\u0010>R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b<\u0010/¨\u0006?"}, d2 = {"Lil0/a;", "", "", "globalLayoutId", "", "name", "Lil0/c;", "status", "distanceFromOrigin", "distanceUnitLabel", "buildId", "street", "city", RemoteConfigConstants.ResponseFieldKey.STATE, "postalCode", "country", "latitude", "longitude", "webSite", Scopes.EMAIL, "phone", "phoneExtension", "designer", "yearDesigned", "numberOfHoles", "Lil0/d;", "membershipType", "version", "<init>", "(ILjava/lang/String;Lil0/c;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lil0/d;Ljava/lang/Integer;)V", "a", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "b", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "c", "Lil0/c;", "s", "()Lil0/c;", "d", "f", JWKParameterNames.RSA_EXPONENT, "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "h", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.OCT_KEY_VALUE, "l", JWKParameterNames.RSA_MODULUS, "v", "o", "p", "w", "u", "Lil0/d;", "()Lil0/d;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("globalLayoutId")
    private final int globalLayoutId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final c status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceFromOrigin")
    private final String distanceFromOrigin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceUnitLabel")
    private final int distanceUnitLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("buildId")
    private final Integer buildId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("street")
    private final String street;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private final String city;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("country")
    private final String country;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private final Integer latitude;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private final Integer longitude;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("webSite")
    private final String webSite;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Scopes.EMAIL)
    private final String email;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phone")
    private final String phone;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneExtension")
    private final String phoneExtension;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("designer")
    private final String designer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("yearDesigned")
    private final String yearDesigned;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfHoles")
    private final Integer numberOfHoles;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @SerializedName("membershipType")
    private final d membershipType;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private final Integer version;

    public /* synthetic */ a(int i14, String str, c cVar, String str2, int i15, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, String str12, String str13, Integer num4, d dVar, Integer num5, int i16, j jVar) {
        this(i14, str, (i16 & 4) != 0 ? null : cVar, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? R.string.lbl_mile : i15, (i16 & 32) != 0 ? null : num, (i16 & 64) != 0 ? null : str3, (i16 & 128) != 0 ? null : str4, (i16 & 256) != 0 ? null : str5, (i16 & 512) != 0 ? null : str6, (i16 & 1024) != 0 ? null : str7, (i16 & 2048) != 0 ? null : num2, (i16 & 4096) != 0 ? null : num3, (i16 & 8192) != 0 ? null : str8, (i16 & 16384) != 0 ? null : str9, (32768 & i16) != 0 ? null : str10, (65536 & i16) != 0 ? null : str11, (131072 & i16) != 0 ? null : str12, (262144 & i16) != 0 ? null : str13, (524288 & i16) != 0 ? null : num4, (1048576 & i16) != 0 ? d.NO_VALUE : dVar, (i16 & 2097152) != 0 ? null : num5);
    }

    public static a a(a aVar, c cVar) {
        int i14 = aVar.globalLayoutId;
        String str = aVar.name;
        String str2 = aVar.distanceFromOrigin;
        int i15 = aVar.distanceUnitLabel;
        Integer num = aVar.buildId;
        String str3 = aVar.street;
        String str4 = aVar.city;
        String str5 = aVar.state;
        String str6 = aVar.postalCode;
        String str7 = aVar.country;
        Integer num2 = aVar.latitude;
        Integer num3 = aVar.longitude;
        String str8 = aVar.webSite;
        String str9 = aVar.email;
        String str10 = aVar.phone;
        String str11 = aVar.phoneExtension;
        String str12 = aVar.designer;
        String str13 = aVar.yearDesigned;
        Integer num4 = aVar.numberOfHoles;
        d dVar = aVar.membershipType;
        Integer num5 = aVar.version;
        aVar.getClass();
        str.getClass();
        dVar.getClass();
        return new a(i14, str, cVar, str2, i15, num, str3, str4, str5, str6, str7, num2, num3, str8, str9, str10, str11, str12, str13, num4, dVar, num5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBuildId() {
        return this.buildId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDesigner() {
        return this.designer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.globalLayoutId == aVar.globalLayoutId && s.g(this.name, aVar.name) && this.status == aVar.status && s.g(this.distanceFromOrigin, aVar.distanceFromOrigin) && this.distanceUnitLabel == aVar.distanceUnitLabel && s.g(this.buildId, aVar.buildId) && s.g(this.street, aVar.street) && s.g(this.city, aVar.city) && s.g(this.state, aVar.state) && s.g(this.postalCode, aVar.postalCode) && s.g(this.country, aVar.country) && s.g(this.latitude, aVar.latitude) && s.g(this.longitude, aVar.longitude) && s.g(this.webSite, aVar.webSite) && s.g(this.email, aVar.email) && s.g(this.phone, aVar.phone) && s.g(this.phoneExtension, aVar.phoneExtension) && s.g(this.designer, aVar.designer) && s.g(this.yearDesigned, aVar.yearDesigned) && s.g(this.numberOfHoles, aVar.numberOfHoles) && this.membershipType == aVar.membershipType && s.g(this.version, aVar.version);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDistanceFromOrigin() {
        return this.distanceFromOrigin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDistanceUnitLabel() {
        return this.distanceUnitLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final int hashCode() {
        int iJ = g.j(Integer.hashCode(this.globalLayoutId) * 31, 31, this.name);
        c cVar = this.status;
        int iHashCode = (iJ + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.distanceFromOrigin;
        int iD = q2.d(this.distanceUnitLabel, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.buildId;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.street;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.latitude;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.longitude;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.webSite;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.email;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phoneExtension;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.designer;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.yearDesigned;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.numberOfHoles;
        int iHashCode16 = (this.membershipType.hashCode() + ((iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31)) * 31;
        Integer num5 = this.version;
        return iHashCode16 + (num5 != null ? num5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getGlobalLayoutId() {
        return this.globalLayoutId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final d getMembershipType() {
        return this.membershipType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getNumberOfHoles() {
        return this.numberOfHoles;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPhoneExtension() {
        return this.phoneExtension;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public final String toString() {
        int i14 = this.globalLayoutId;
        String str = this.name;
        c cVar = this.status;
        String str2 = this.distanceFromOrigin;
        int i15 = this.distanceUnitLabel;
        Integer num = this.buildId;
        String str3 = this.street;
        String str4 = this.city;
        String str5 = this.state;
        String str6 = this.postalCode;
        String str7 = this.country;
        Integer num2 = this.latitude;
        Integer num3 = this.longitude;
        String str8 = this.webSite;
        String str9 = this.email;
        String str10 = this.phone;
        String str11 = this.phoneExtension;
        String str12 = this.designer;
        String str13 = this.yearDesigned;
        Integer num4 = this.numberOfHoles;
        d dVar = this.membershipType;
        Integer num5 = this.version;
        StringBuilder sbR = g.r(i14, "GolfCourseItem(globalLayoutId=", ", name=", str, ", status=");
        sbR.append(cVar);
        sbR.append(", distanceFromOrigin=");
        sbR.append(str2);
        sbR.append(", distanceUnitLabel=");
        sbR.append(i15);
        sbR.append(", buildId=");
        sbR.append(num);
        sbR.append(", street=");
        sn.a.t(sbR, str3, ", city=", str4, ", state=");
        sn.a.t(sbR, str5, ", postalCode=", str6, ", country=");
        fb1.c.u(num2, str7, ", latitude=", ", longitude=", sbR);
        p6.b.l(num3, ", webSite=", str8, ", email=", sbR);
        sn.a.t(sbR, str9, ", phone=", str10, ", phoneExtension=");
        sn.a.t(sbR, str11, ", designer=", str12, ", yearDesigned=");
        fb1.c.u(num4, str13, ", numberOfHoles=", ", membershipType=", sbR);
        sbR.append(dVar);
        sbR.append(", version=");
        sbR.append(num5);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getWebSite() {
        return this.webSite;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getYearDesigned() {
        return this.yearDesigned;
    }

    public a(int i14, String str, c cVar, String str2, int i15, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, String str12, String str13, Integer num4, d dVar, Integer num5) {
        str.getClass();
        dVar.getClass();
        this.globalLayoutId = i14;
        this.name = str;
        this.status = cVar;
        this.distanceFromOrigin = str2;
        this.distanceUnitLabel = i15;
        this.buildId = num;
        this.street = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
        this.country = str7;
        this.latitude = num2;
        this.longitude = num3;
        this.webSite = str8;
        this.email = str9;
        this.phone = str10;
        this.phoneExtension = str11;
        this.designer = str12;
        this.yearDesigned = str13;
        this.numberOfHoles = num4;
        this.membershipType = dVar;
        this.version = num5;
    }
}
