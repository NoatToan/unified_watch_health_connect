package fl0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import kg.f;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001BË\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\"\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b,\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b-\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b.\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b1\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b2\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b3\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b4\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b6\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b7\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b8\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010)R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b5\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b&\u0010)R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bD\u0010%R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010#\u001a\u0004\bF\u0010%R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010#\u001a\u0004\b9\u0010%¨\u0006J"}, d2 = {"Lfl0/a;", "", "", "globalLayoutId", "buildId", "", "country", "designer", "distanceFromOrigin", Scopes.EMAIL, "fairwaysGrassType", "greensGrassType", "latitude", "longitude", "membershipType", "name", "numberOfHoles", "phone", "postalCode", RemoteConfigConstants.ResponseFieldKey.STATE, "street", "webSite", "yearDesigned", "phoneExtension", "city", "group", "", "supportsNinePlusNine", "numberOfNineHoleCourses", "associatedDualGreenCourseLayoutId", "hasGreenContour", "version", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", JWKParameterNames.RSA_EXPONENT, "f", "getFairwaysGrassType", "h", "getGreensGrassType", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "u", "v", "getGroup", "w", "Ljava/lang/Boolean;", "getSupportsNinePlusNine", "()Ljava/lang/Boolean;", "x", "getNumberOfNineHoleCourses", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getAssociatedDualGreenCourseLayoutId", "z", "getHasGreenContour", "A", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("Version")
    private final Integer version;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GlobalLayoutId")
    private final Integer globalLayoutId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BuildId")
    private final Integer buildId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Country")
    private final String country;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Designer")
    private final String designer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DistanceFromOrigin")
    private final Integer distanceFromOrigin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Email")
    private final String email;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FairwaysGrassType")
    private final String fairwaysGrassType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GreensGrassType")
    private final String greensGrassType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Latitude")
    private final Integer latitude;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Longitude")
    private final Integer longitude;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MembershipType")
    private final String membershipType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Name")
    private final String name;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("NumberOfHoles")
    private final Integer numberOfHoles;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Phone")
    private final String phone;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PostalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("State")
    private final String state;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Street")
    private final String street;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("WebSite")
    private final String webSite;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("YearDesigned")
    private final String yearDesigned;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PhoneExtension")
    private final String phoneExtension;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @SerializedName("City")
    private final String city;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Group")
    private final Integer group;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SupportsNinePlusNine")
    private final Boolean supportsNinePlusNine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("NumberOfNineHoleCourses")
    private final Integer numberOfNineHoleCourses;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AssociatedDualGreenCourseLayoutId")
    private final Integer associatedDualGreenCourseLayoutId;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("HasGreenContour")
    private final Boolean hasGreenContour;

    public /* synthetic */ a(Integer num, Integer num2, String str, String str2, Integer num3, String str3, String str4, String str5, Integer num4, Integer num5, String str6, String str7, Integer num6, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num7, Boolean bool, Integer num8, Integer num9, Boolean bool2, Integer num10, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : num4, (i14 & 512) != 0 ? null : num5, (i14 & 1024) != 0 ? null : str6, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : num6, (i14 & 8192) != 0 ? null : str8, (i14 & 16384) != 0 ? null : str9, (i14 & 32768) != 0 ? null : str10, (i14 & 65536) != 0 ? null : str11, (i14 & 131072) != 0 ? null : str12, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str13, (i14 & 524288) != 0 ? null : str14, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str15, (i14 & 2097152) != 0 ? null : num7, (i14 & 4194304) != 0 ? null : bool, (i14 & 8388608) != 0 ? null : num8, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num9, (i14 & 33554432) != 0 ? null : bool2, (i14 & 67108864) != 0 ? null : num10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBuildId() {
        return this.buildId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDesigner() {
        return this.designer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDistanceFromOrigin() {
        return this.distanceFromOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.globalLayoutId, aVar.globalLayoutId) && s.g(this.buildId, aVar.buildId) && s.g(this.country, aVar.country) && s.g(this.designer, aVar.designer) && s.g(this.distanceFromOrigin, aVar.distanceFromOrigin) && s.g(this.email, aVar.email) && s.g(this.fairwaysGrassType, aVar.fairwaysGrassType) && s.g(this.greensGrassType, aVar.greensGrassType) && s.g(this.latitude, aVar.latitude) && s.g(this.longitude, aVar.longitude) && s.g(this.membershipType, aVar.membershipType) && s.g(this.name, aVar.name) && s.g(this.numberOfHoles, aVar.numberOfHoles) && s.g(this.phone, aVar.phone) && s.g(this.postalCode, aVar.postalCode) && s.g(this.state, aVar.state) && s.g(this.street, aVar.street) && s.g(this.webSite, aVar.webSite) && s.g(this.yearDesigned, aVar.yearDesigned) && s.g(this.phoneExtension, aVar.phoneExtension) && s.g(this.city, aVar.city) && s.g(this.group, aVar.group) && s.g(this.supportsNinePlusNine, aVar.supportsNinePlusNine) && s.g(this.numberOfNineHoleCourses, aVar.numberOfNineHoleCourses) && s.g(this.associatedDualGreenCourseLayoutId, aVar.associatedDualGreenCourseLayoutId) && s.g(this.hasGreenContour, aVar.hasGreenContour) && s.g(this.version, aVar.version);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getGlobalLayoutId() {
        return this.globalLayoutId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getLatitude() {
        return this.latitude;
    }

    public final int hashCode() {
        Integer num = this.globalLayoutId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.buildId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.country;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.designer;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.distanceFromOrigin;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fairwaysGrassType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.greensGrassType;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.latitude;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.longitude;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.membershipType;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num6 = this.numberOfHoles;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str8 = this.phone;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.state;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.street;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.webSite;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.yearDesigned;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.phoneExtension;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.city;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.group;
        int iHashCode22 = (iHashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.supportsNinePlusNine;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num8 = this.numberOfNineHoleCourses;
        int iHashCode24 = (iHashCode23 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.associatedDualGreenCourseLayoutId;
        int iHashCode25 = (iHashCode24 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool2 = this.hasGreenContour;
        int iHashCode26 = (iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num10 = this.version;
        return iHashCode26 + (num10 != null ? num10.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMembershipType() {
        return this.membershipType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getNumberOfHoles() {
        return this.numberOfHoles;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPhoneExtension() {
        return this.phoneExtension;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getWebSite() {
        return this.webSite;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getYearDesigned() {
        return this.yearDesigned;
    }

    public final String toString() {
        Integer num = this.globalLayoutId;
        Integer num2 = this.buildId;
        String str = this.country;
        String str2 = this.designer;
        Integer num3 = this.distanceFromOrigin;
        String str3 = this.email;
        String str4 = this.fairwaysGrassType;
        String str5 = this.greensGrassType;
        Integer num4 = this.latitude;
        Integer num5 = this.longitude;
        String str6 = this.membershipType;
        String str7 = this.name;
        Integer num6 = this.numberOfHoles;
        String str8 = this.phone;
        String str9 = this.postalCode;
        String str10 = this.state;
        String str11 = this.street;
        String str12 = this.webSite;
        String str13 = this.yearDesigned;
        String str14 = this.phoneExtension;
        String str15 = this.city;
        Integer num7 = this.group;
        Boolean bool = this.supportsNinePlusNine;
        Integer num8 = this.numberOfNineHoleCourses;
        Integer num9 = this.associatedDualGreenCourseLayoutId;
        Boolean bool2 = this.hasGreenContour;
        Integer num10 = this.version;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "GolfCourseDTO(globalLayoutId=", ", buildId=", ", country=", num2);
        sn.a.t(sbL, str, ", designer=", str2, ", distanceFromOrigin=");
        p6.b.l(num3, ", email=", str3, ", fairwaysGrassType=", sbL);
        sn.a.t(sbL, str4, ", greensGrassType=", str5, ", latitude=");
        x.m(sbL, num4, ", longitude=", num5, ", membershipType=");
        sn.a.t(sbL, str6, ", name=", str7, ", numberOfHoles=");
        p6.b.l(num6, ", phone=", str8, ", postalCode=", sbL);
        sn.a.t(sbL, str9, ", state=", str10, ", street=");
        sn.a.t(sbL, str11, ", webSite=", str12, ", yearDesigned=");
        sn.a.t(sbL, str13, ", phoneExtension=", str14, ", city=");
        fb1.c.u(num7, str15, ", group=", ", supportsNinePlusNine=", sbL);
        sbL.append(bool);
        sbL.append(", numberOfNineHoleCourses=");
        sbL.append(num8);
        sbL.append(", associatedDualGreenCourseLayoutId=");
        f.r(sbL, num9, ", hasGreenContour=", bool2, ", version=");
        return f3.i(sbL, num10, ")");
    }

    public a(Integer num, Integer num2, String str, String str2, Integer num3, String str3, String str4, String str5, Integer num4, Integer num5, String str6, String str7, Integer num6, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num7, Boolean bool, Integer num8, Integer num9, Boolean bool2, Integer num10) {
        this.globalLayoutId = num;
        this.buildId = num2;
        this.country = str;
        this.designer = str2;
        this.distanceFromOrigin = num3;
        this.email = str3;
        this.fairwaysGrassType = str4;
        this.greensGrassType = str5;
        this.latitude = num4;
        this.longitude = num5;
        this.membershipType = str6;
        this.name = str7;
        this.numberOfHoles = num6;
        this.phone = str8;
        this.postalCode = str9;
        this.state = str10;
        this.street = str11;
        this.webSite = str12;
        this.yearDesigned = str13;
        this.phoneExtension = str14;
        this.city = str15;
        this.group = num7;
        this.supportsNinePlusNine = bool;
        this.numberOfNineHoleCourses = num8;
        this.associatedDualGreenCourseLayoutId = num9;
        this.hasGreenContour = bool2;
        this.version = num10;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }
}
