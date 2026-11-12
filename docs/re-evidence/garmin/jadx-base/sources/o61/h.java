package o61;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001e\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Lo61/h;", "", "", "userProfilePk", "Lorg/joda/time/DateTime;", "calendarDate", "", "origin", "sport", "", "functionalThresholdPower", "weight", "powerToWeight", "ftpCreateTime", "weightCreateTime", "", "isStale", "<init>", "(Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "c", "Ljava/lang/String;", "getOrigin", "()Ljava/lang/String;", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "()Ljava/lang/Double;", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("origin")
    private final String origin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final String sport;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("functionalThresholdPower")
    private final Double functionalThresholdPower;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final Double weight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerToWeight")
    private final Double powerToWeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ftpCreateTime")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime ftpCreateTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightCreateTime")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime weightCreateTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isStale")
    private final Boolean isStale;

    public /* synthetic */ h(Long l14, DateTime dateTime, String str, String str2, Double d14, Double d15, Double d16, DateTime dateTime2, DateTime dateTime3, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : d16, (i14 & 128) != 0 ? null : dateTime2, (i14 & 256) != 0 ? null : dateTime3, (i14 & 512) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getFtpCreateTime() {
        return this.ftpCreateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getFunctionalThresholdPower() {
        return this.functionalThresholdPower;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getPowerToWeight() {
        return this.powerToWeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.userProfilePk, hVar.userProfilePk) && s.g(this.calendarDate, hVar.calendarDate) && s.g(this.origin, hVar.origin) && s.g(this.sport, hVar.sport) && s.g(this.functionalThresholdPower, hVar.functionalThresholdPower) && s.g(this.weight, hVar.weight) && s.g(this.powerToWeight, hVar.powerToWeight) && s.g(this.ftpCreateTime, hVar.ftpCreateTime) && s.g(this.weightCreateTime, hVar.weightCreateTime) && s.g(this.isStale, hVar.isStale);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getWeightCreateTime() {
        return this.weightCreateTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsStale() {
        return this.isStale;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        DateTime dateTime = this.calendarDate;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str = this.origin;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sport;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.functionalThresholdPower;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.weight;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.powerToWeight;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        DateTime dateTime2 = this.ftpCreateTime;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.weightCreateTime;
        int iHashCode9 = (iHashCode8 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        Boolean bool = this.isStale;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        DateTime dateTime = this.calendarDate;
        String str = this.origin;
        String str2 = this.sport;
        Double d14 = this.functionalThresholdPower;
        Double d15 = this.weight;
        Double d16 = this.powerToWeight;
        DateTime dateTime2 = this.ftpCreateTime;
        DateTime dateTime3 = this.weightCreateTime;
        Boolean bool = this.isStale;
        StringBuilder sb3 = new StringBuilder("PowerToWeightReportDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", calendarDate=");
        sb3.append(dateTime);
        sb3.append(", origin=");
        sn.a.t(sb3, str, ", sport=", str2, ", functionalThresholdPower=");
        b71.i.p(d14, d15, ", weight=", ", powerToWeight=", sb3);
        sb3.append(d16);
        sb3.append(", ftpCreateTime=");
        sb3.append(dateTime2);
        sb3.append(", weightCreateTime=");
        sb3.append(dateTime3);
        sb3.append(", isStale=");
        sb3.append(bool);
        sb3.append(")");
        return sb3.toString();
    }

    public h(Long l14, DateTime dateTime, String str, String str2, Double d14, Double d15, Double d16, DateTime dateTime2, DateTime dateTime3, Boolean bool) {
        this.userProfilePk = l14;
        this.calendarDate = dateTime;
        this.origin = str;
        this.sport = str2;
        this.functionalThresholdPower = d14;
        this.weight = d15;
        this.powerToWeight = d16;
        this.ftpCreateTime = dateTime2;
        this.weightCreateTime = dateTime3;
        this.isStale = bool;
    }

    public h() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
