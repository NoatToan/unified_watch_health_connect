package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.LtActivityTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0011\u0010#¨\u0006$"}, d2 = {"Lae2/k;", "", "", "sessionId", "Lorg/joda/time/DateTime;", "createdDateTime", "reportedDateTime", "", "lat", "lon", "", "speedMps", "headingSemicircle", "Lae2/r;", "activityType", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lae2/r;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getCreatedDateTime", "()Lorg/joda/time/DateTime;", "c", JWKParameterNames.RSA_EXPONENT, "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "h", "Lae2/r;", "()Lae2/r;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionId")
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDateTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime createdDateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportedDateTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime reportedDateTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    private final Integer lat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    private final Integer lon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedMps")
    private final Double speedMps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headingSemicircle")
    private final Integer headingSemicircle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    @JsonAdapter(LtActivityTypeAdapter.class)
    private final r activityType;

    public /* synthetic */ k(String str, DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, Double d14, Integer num3, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : dateTime2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : num3, (i14 & 128) != 0 ? null : rVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getHeadingSemicircle() {
        return this.headingSemicircle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DateTime getReportedDateTime() {
        return this.reportedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.sessionId, kVar.sessionId) && p005kotlin.jvm.internal.s.g(this.createdDateTime, kVar.createdDateTime) && p005kotlin.jvm.internal.s.g(this.reportedDateTime, kVar.reportedDateTime) && p005kotlin.jvm.internal.s.g(this.lat, kVar.lat) && p005kotlin.jvm.internal.s.g(this.lon, kVar.lon) && p005kotlin.jvm.internal.s.g(this.speedMps, kVar.speedMps) && p005kotlin.jvm.internal.s.g(this.headingSemicircle, kVar.headingSemicircle) && p005kotlin.jvm.internal.s.g(this.activityType, kVar.activityType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getSpeedMps() {
        return this.speedMps;
    }

    public final int hashCode() {
        String str = this.sessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.createdDateTime;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.reportedDateTime;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Integer num = this.lat;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lon;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.speedMps;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num3 = this.headingSemicircle;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        r rVar = this.activityType;
        return iHashCode7 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.sessionId;
        DateTime dateTime = this.createdDateTime;
        DateTime dateTime2 = this.reportedDateTime;
        Integer num = this.lat;
        Integer num2 = this.lon;
        Double d14 = this.speedMps;
        Integer num3 = this.headingSemicircle;
        r rVar = this.activityType;
        StringBuilder sb3 = new StringBuilder("GroupConnectionTrackPoint(sessionId=");
        sb3.append(str);
        sb3.append(", createdDateTime=");
        sb3.append(dateTime);
        sb3.append(", reportedDateTime=");
        sb3.append(dateTime2);
        sb3.append(", lat=");
        sb3.append(num);
        sb3.append(", lon=");
        b71.i.v(sb3, num2, ", speedMps=", d14, ", headingSemicircle=");
        sb3.append(num3);
        sb3.append(", activityType=");
        sb3.append(rVar);
        sb3.append(")");
        return sb3.toString();
    }

    public k(String str, DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, Double d14, Integer num3, r rVar) {
        this.sessionId = str;
        this.createdDateTime = dateTime;
        this.reportedDateTime = dateTime2;
        this.lat = num;
        this.lon = num2;
        this.speedMps = d14;
        this.headingSemicircle = num3;
        this.activityType = rVar;
    }

    public k() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
