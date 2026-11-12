package o61;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001e"}, d2 = {"Lo61/a;", "", "", "acwrPercent", "", "acwrStatus", "acwrStatusFeedback", "dailyTrainingLoadAcute", "", "maxTrainingLoadChronic", "minTrainingLoadChronic", "dailyTrainingLoadChronic", "dailyAcuteChronicWorkloadRatio", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "getAcwrPercent", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "g", "h", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acwrPercent")
    private final Integer acwrPercent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acwrStatus")
    private final String acwrStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acwrStatusFeedback")
    private final String acwrStatusFeedback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyTrainingLoadAcute")
    private final Integer dailyTrainingLoadAcute;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxTrainingLoadChronic")
    private final Double maxTrainingLoadChronic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minTrainingLoadChronic")
    private final Double minTrainingLoadChronic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyTrainingLoadChronic")
    private final Integer dailyTrainingLoadChronic;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyAcuteChronicWorkloadRatio")
    private final Double dailyAcuteChronicWorkloadRatio;

    public a(Integer num, String str, String str2, Integer num2, Double d14, Double d15, Integer num3, Double d16) {
        this.acwrPercent = num;
        this.acwrStatus = str;
        this.acwrStatusFeedback = str2;
        this.dailyTrainingLoadAcute = num2;
        this.maxTrainingLoadChronic = d14;
        this.minTrainingLoadChronic = d15;
        this.dailyTrainingLoadChronic = num3;
        this.dailyAcuteChronicWorkloadRatio = d16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcwrStatus() {
        return this.acwrStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAcwrStatusFeedback() {
        return this.acwrStatusFeedback;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getDailyAcuteChronicWorkloadRatio() {
        return this.dailyAcuteChronicWorkloadRatio;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getDailyTrainingLoadAcute() {
        return this.dailyTrainingLoadAcute;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDailyTrainingLoadChronic() {
        return this.dailyTrainingLoadChronic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.acwrPercent, aVar.acwrPercent) && s.g(this.acwrStatus, aVar.acwrStatus) && s.g(this.acwrStatusFeedback, aVar.acwrStatusFeedback) && s.g(this.dailyTrainingLoadAcute, aVar.dailyTrainingLoadAcute) && s.g(this.maxTrainingLoadChronic, aVar.maxTrainingLoadChronic) && s.g(this.minTrainingLoadChronic, aVar.minTrainingLoadChronic) && s.g(this.dailyTrainingLoadChronic, aVar.dailyTrainingLoadChronic) && s.g(this.dailyAcuteChronicWorkloadRatio, aVar.dailyAcuteChronicWorkloadRatio);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMaxTrainingLoadChronic() {
        return this.maxTrainingLoadChronic;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMinTrainingLoadChronic() {
        return this.minTrainingLoadChronic;
    }

    public final int hashCode() {
        Integer num = this.acwrPercent;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.acwrStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acwrStatusFeedback;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.dailyTrainingLoadAcute;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.maxTrainingLoadChronic;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.minTrainingLoadChronic;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num3 = this.dailyTrainingLoadChronic;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d16 = this.dailyAcuteChronicWorkloadRatio;
        return iHashCode7 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.acwrPercent;
        String str = this.acwrStatus;
        String str2 = this.acwrStatusFeedback;
        Integer num2 = this.dailyTrainingLoadAcute;
        Double d14 = this.maxTrainingLoadChronic;
        Double d15 = this.minTrainingLoadChronic;
        Integer num3 = this.dailyTrainingLoadChronic;
        Double d16 = this.dailyAcuteChronicWorkloadRatio;
        StringBuilder sbF = l2.f("AcuteTrainingLoadDTO(acwrPercent=", num, ", acwrStatus=", str, ", acwrStatusFeedback=");
        fb1.c.u(num2, str2, ", dailyTrainingLoadAcute=", ", maxTrainingLoadChronic=", sbF);
        b71.i.p(d14, d15, ", minTrainingLoadChronic=", ", dailyTrainingLoadChronic=", sbF);
        sbF.append(num3);
        sbF.append(", dailyAcuteChronicWorkloadRatio=");
        sbF.append(d16);
        sbF.append(")");
        return sbF.toString();
    }
}
