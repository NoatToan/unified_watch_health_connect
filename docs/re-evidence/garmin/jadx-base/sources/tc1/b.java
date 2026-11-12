package tc1;

import am.j;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b'\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b)\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b*\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\u001d\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u00060"}, d2 = {"Ltc1/b;", "", "", "userProfilePK", "", "calendarDate", "", "sportingEventId", "Ltc1/c;", "sportingEventUuid", "predictedRaceTime", "projectionRaceTime", "upperBoundProjectionRaceTime", "lowerBoundProjectionRaceTime", "", "speedPrediction", "speedProjection", "upperBoundProjectionRaceSpeed", "lowerBoundProjectionRaceSpeed", "eventRacePredictionsFeedbackPhrase", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ltc1/c;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getUserProfilePK", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ljava/lang/Long;", "getSportingEventId", "()Ljava/lang/Long;", "d", "Ltc1/c;", "getSportingEventUuid", "()Ltc1/c;", JWKParameterNames.RSA_EXPONENT, "f", "g", "j", "h", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Double;", "()Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Integer userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportingEventId")
    private final Long sportingEventId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportingEventUuid")
    private final c sportingEventUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedRaceTime")
    private final Long predictedRaceTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("projectionRaceTime")
    private final Long projectionRaceTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("upperBoundProjectionRaceTime")
    private final Long upperBoundProjectionRaceTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowerBoundProjectionRaceTime")
    private final Long lowerBoundProjectionRaceTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedPrediction")
    private final Double speedPrediction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedProjection")
    private final Double speedProjection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("upperBoundProjectionSpeed")
    private final Double upperBoundProjectionRaceSpeed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowerBoundProjectionSpeed")
    private final Double lowerBoundProjectionRaceSpeed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventRacePredictionsFeedbackPhrase")
    private final String eventRacePredictionsFeedbackPhrase;

    public b(Integer num, String str, Long l14, c cVar, Long l15, Long l16, Long l17, Long l18, Double d14, Double d15, Double d16, Double d17, String str2) {
        this.userProfilePK = num;
        this.calendarDate = str;
        this.sportingEventId = l14;
        this.sportingEventUuid = cVar;
        this.predictedRaceTime = l15;
        this.projectionRaceTime = l16;
        this.upperBoundProjectionRaceTime = l17;
        this.lowerBoundProjectionRaceTime = l18;
        this.speedPrediction = d14;
        this.speedProjection = d15;
        this.upperBoundProjectionRaceSpeed = d16;
        this.lowerBoundProjectionRaceSpeed = d17;
        this.eventRacePredictionsFeedbackPhrase = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventRacePredictionsFeedbackPhrase() {
        return this.eventRacePredictionsFeedbackPhrase;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getLowerBoundProjectionRaceSpeed() {
        return this.lowerBoundProjectionRaceSpeed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getLowerBoundProjectionRaceTime() {
        return this.lowerBoundProjectionRaceTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getPredictedRaceTime() {
        return this.predictedRaceTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePK, bVar.userProfilePK) && s.g(this.calendarDate, bVar.calendarDate) && s.g(this.sportingEventId, bVar.sportingEventId) && s.g(this.sportingEventUuid, bVar.sportingEventUuid) && s.g(this.predictedRaceTime, bVar.predictedRaceTime) && s.g(this.projectionRaceTime, bVar.projectionRaceTime) && s.g(this.upperBoundProjectionRaceTime, bVar.upperBoundProjectionRaceTime) && s.g(this.lowerBoundProjectionRaceTime, bVar.lowerBoundProjectionRaceTime) && s.g(this.speedPrediction, bVar.speedPrediction) && s.g(this.speedProjection, bVar.speedProjection) && s.g(this.upperBoundProjectionRaceSpeed, bVar.upperBoundProjectionRaceSpeed) && s.g(this.lowerBoundProjectionRaceSpeed, bVar.lowerBoundProjectionRaceSpeed) && s.g(this.eventRacePredictionsFeedbackPhrase, bVar.eventRacePredictionsFeedbackPhrase);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getProjectionRaceTime() {
        return this.projectionRaceTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getSpeedPrediction() {
        return this.speedPrediction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getSpeedProjection() {
        return this.speedProjection;
    }

    public final int hashCode() {
        Integer num = this.userProfilePK;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.sportingEventId;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        c cVar = this.sportingEventUuid;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l15 = this.predictedRaceTime;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.projectionRaceTime;
        int iHashCode6 = (iHashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.upperBoundProjectionRaceTime;
        int iHashCode7 = (iHashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.lowerBoundProjectionRaceTime;
        int iHashCode8 = (iHashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Double d14 = this.speedPrediction;
        int iHashCode9 = (iHashCode8 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.speedProjection;
        int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.upperBoundProjectionRaceSpeed;
        int iHashCode11 = (iHashCode10 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.lowerBoundProjectionRaceSpeed;
        int iHashCode12 = (iHashCode11 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str2 = this.eventRacePredictionsFeedbackPhrase;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getUpperBoundProjectionRaceSpeed() {
        return this.upperBoundProjectionRaceSpeed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUpperBoundProjectionRaceTime() {
        return this.upperBoundProjectionRaceTime;
    }

    public final String toString() {
        Integer num = this.userProfilePK;
        String str = this.calendarDate;
        Long l14 = this.sportingEventId;
        c cVar = this.sportingEventUuid;
        Long l15 = this.predictedRaceTime;
        Long l16 = this.projectionRaceTime;
        Long l17 = this.upperBoundProjectionRaceTime;
        Long l18 = this.lowerBoundProjectionRaceTime;
        Double d14 = this.speedPrediction;
        Double d15 = this.speedProjection;
        Double d16 = this.upperBoundProjectionRaceSpeed;
        Double d17 = this.lowerBoundProjectionRaceSpeed;
        String str2 = this.eventRacePredictionsFeedbackPhrase;
        StringBuilder sbF = l2.f("RaceTimePredictionMetricsDTO(userProfilePK=", num, ", calendarDate=", str, ", sportingEventId=");
        sbF.append(l14);
        sbF.append(", sportingEventUuid=");
        sbF.append(cVar);
        sbF.append(", predictedRaceTime=");
        f.s(sbF, l15, ", projectionRaceTime=", l16, ", upperBoundProjectionRaceTime=");
        f.s(sbF, l17, ", lowerBoundProjectionRaceTime=", l18, ", speedPrediction=");
        i.p(d14, d15, ", speedProjection=", ", upperBoundProjectionRaceSpeed=", sbF);
        i.p(d16, d17, ", lowerBoundProjectionRaceSpeed=", ", eventRacePredictionsFeedbackPhrase=", sbF);
        return j.o(str2, ")", sbF);
    }
}
