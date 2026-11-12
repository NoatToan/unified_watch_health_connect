package ef1;

import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001a"}, d2 = {"Lef1/b;", "", "", "userProfilePK", "", "calendarDate", "", "acuteImpactLoad", "acuteDistance", "acuteTolerance", "runningToleranceFeedBackPhrase", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getUserProfilePK", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "f", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Integer userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acuteImpactLoad")
    private final Double acuteImpactLoad;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acuteDistance")
    private final Double acuteDistance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acuteTolerance")
    private final Double acuteTolerance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("runningToleranceFeedBackPhrase")
    private final String runningToleranceFeedBackPhrase;

    public b(Integer num, String str, Double d14, Double d15, Double d16, String str2) {
        this.userProfilePK = num;
        this.calendarDate = str;
        this.acuteImpactLoad = d14;
        this.acuteDistance = d15;
        this.acuteTolerance = d16;
        this.runningToleranceFeedBackPhrase = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAcuteDistance() {
        return this.acuteDistance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAcuteImpactLoad() {
        return this.acuteImpactLoad;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getAcuteTolerance() {
        return this.acuteTolerance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRunningToleranceFeedBackPhrase() {
        return this.runningToleranceFeedBackPhrase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePK, bVar.userProfilePK) && s.g(this.calendarDate, bVar.calendarDate) && s.g(this.acuteImpactLoad, bVar.acuteImpactLoad) && s.g(this.acuteDistance, bVar.acuteDistance) && s.g(this.acuteTolerance, bVar.acuteTolerance) && s.g(this.runningToleranceFeedBackPhrase, bVar.runningToleranceFeedBackPhrase);
    }

    public final int hashCode() {
        Integer num = this.userProfilePK;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.acuteImpactLoad;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.acuteDistance;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.acuteTolerance;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        String str2 = this.runningToleranceFeedBackPhrase;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.userProfilePK;
        String str = this.calendarDate;
        Double d14 = this.acuteImpactLoad;
        Double d15 = this.acuteDistance;
        Double d16 = this.acuteTolerance;
        String str2 = this.runningToleranceFeedBackPhrase;
        StringBuilder sbF = l2.f("RunningToleranceMetricsDTO(userProfilePK=", num, ", calendarDate=", str, ", acuteImpactLoad=");
        i.p(d14, d15, ", acuteDistance=", ", acuteTolerance=", sbF);
        sbF.append(d16);
        sbF.append(", runningToleranceFeedBackPhrase=");
        sbF.append(str2);
        sbF.append(")");
        return sbF.toString();
    }
}
