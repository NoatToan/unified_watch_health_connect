package r61;

import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u000f\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006 "}, d2 = {"Lr61/a;", "", "", "userId", "", "fromCalendarDate", "toCalendarDate", "calendarDate", "", "avg5KTime", "avg10KTime", "avgHalfMarathonTime", "avgMarathonTime", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getFromCalendarDate", "()Ljava/lang/String;", "c", "getToCalendarDate", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "()Ljava/lang/Double;", "f", "g", "h", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fromCalendarDate")
    private final String fromCalendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("toCalendarDate")
    private final String toCalendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("time5K")
    private final Double avg5KTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("time10K")
    private final Double avg10KTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeHalfMarathon")
    private final Double avgHalfMarathonTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeMarathon")
    private final Double avgMarathonTime;

    public /* synthetic */ a(Long l14, String str, String str2, String str3, Double d14, Double d15, Double d16, Double d17, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : d16, (i14 & 128) != 0 ? null : d17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAvg10KTime() {
        return this.avg10KTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAvg5KTime() {
        return this.avg5KTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getAvgHalfMarathonTime() {
        return this.avgHalfMarathonTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAvgMarathonTime() {
        return this.avgMarathonTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.userId, aVar.userId) && s.g(this.fromCalendarDate, aVar.fromCalendarDate) && s.g(this.toCalendarDate, aVar.toCalendarDate) && s.g(this.calendarDate, aVar.calendarDate) && s.g(this.avg5KTime, aVar.avg5KTime) && s.g(this.avg10KTime, aVar.avg10KTime) && s.g(this.avgHalfMarathonTime, aVar.avgHalfMarathonTime) && s.g(this.avgMarathonTime, aVar.avgMarathonTime);
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.fromCalendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toCalendarDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.calendarDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.avg5KTime;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.avg10KTime;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.avgHalfMarathonTime;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.avgMarathonTime;
        return iHashCode7 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.fromCalendarDate;
        String str2 = this.toCalendarDate;
        String str3 = this.calendarDate;
        Double d14 = this.avg5KTime;
        Double d15 = this.avg10KTime;
        Double d16 = this.avgHalfMarathonTime;
        Double d17 = this.avgMarathonTime;
        StringBuilder sbJ = i.j("RacePredictorInfoDTO(userId=", ", fromCalendarDate=", str, l14, ", toCalendarDate=");
        sn.a.t(sbJ, str2, ", calendarDate=", str3, ", avg5KTime=");
        i.p(d14, d15, ", avg10KTime=", ", avgHalfMarathonTime=", sbJ);
        return sn.a.f(d16, d17, ", avgMarathonTime=", ")", sbJ);
    }

    public a(Long l14, String str, String str2, String str3, Double d14, Double d15, Double d16, Double d17) {
        this.userId = l14;
        this.fromCalendarDate = str;
        this.toCalendarDate = str2;
        this.calendarDate = str3;
        this.avg5KTime = d14;
        this.avg10KTime = d15;
        this.avgHalfMarathonTime = d16;
        this.avgMarathonTime = d17;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
