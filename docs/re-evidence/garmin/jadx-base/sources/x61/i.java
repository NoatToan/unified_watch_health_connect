package x61;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lx61/i;", "", "", "_calendarDate", "", "deviceId", "", "monthlyLoadAerobicLow", "monthlyLoadAerobicHigh", "monthlyLoadAnaerobic", "monthlyLoadAerobicLowTargetMin", "monthlyLoadAerobicLowTargetMax", "monthlyLoadAerobicHighTargetMin", "monthlyLoadAerobicHighTargetMax", "monthlyLoadAnaerobicTargetMin", "monthlyLoadAnaerobicTargetMax", "trainingBalanceFeedbackPhraseKey", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/Long;", "c", "Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "()Ljava/lang/Double;", "d", "h", "f", "g", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "()Ljava/lang/String;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicLow")
    private final Double monthlyLoadAerobicLow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicHigh")
    private final Double monthlyLoadAerobicHigh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAnaerobic")
    private final Double monthlyLoadAnaerobic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicLowTargetMin")
    private final Double monthlyLoadAerobicLowTargetMin;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicLowTargetMax")
    private final Double monthlyLoadAerobicLowTargetMax;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicHighTargetMin")
    private final Double monthlyLoadAerobicHighTargetMin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAerobicHighTargetMax")
    private final Double monthlyLoadAerobicHighTargetMax;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAnaerobicTargetMin")
    private final Double monthlyLoadAnaerobicTargetMin;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyLoadAnaerobicTargetMax")
    private final Double monthlyLoadAnaerobicTargetMax;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingBalanceFeedbackPhrase")
    private final String trainingBalanceFeedbackPhraseKey;

    public /* synthetic */ i(String str, Long l14, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : d24, (i14 & 512) != 0 ? null : d25, (i14 & 1024) != 0 ? null : d26, (i14 & 2048) != 0 ? null : str2);
    }

    public final LocalDate a() {
        return g22.k.w(this._calendarDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getMonthlyLoadAerobicHigh() {
        return this.monthlyLoadAerobicHigh;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getMonthlyLoadAerobicHighTargetMax() {
        return this.monthlyLoadAerobicHighTargetMax;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getMonthlyLoadAerobicHighTargetMin() {
        return this.monthlyLoadAerobicHighTargetMin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getMonthlyLoadAerobicLow() {
        return this.monthlyLoadAerobicLow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this._calendarDate, iVar._calendarDate) && p005kotlin.jvm.internal.s.g(this.deviceId, iVar.deviceId) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicLow, iVar.monthlyLoadAerobicLow) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicHigh, iVar.monthlyLoadAerobicHigh) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAnaerobic, iVar.monthlyLoadAnaerobic) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicLowTargetMin, iVar.monthlyLoadAerobicLowTargetMin) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicLowTargetMax, iVar.monthlyLoadAerobicLowTargetMax) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicHighTargetMin, iVar.monthlyLoadAerobicHighTargetMin) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAerobicHighTargetMax, iVar.monthlyLoadAerobicHighTargetMax) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAnaerobicTargetMin, iVar.monthlyLoadAnaerobicTargetMin) && p005kotlin.jvm.internal.s.g(this.monthlyLoadAnaerobicTargetMax, iVar.monthlyLoadAnaerobicTargetMax) && p005kotlin.jvm.internal.s.g(this.trainingBalanceFeedbackPhraseKey, iVar.trainingBalanceFeedbackPhraseKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMonthlyLoadAerobicLowTargetMax() {
        return this.monthlyLoadAerobicLowTargetMax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMonthlyLoadAerobicLowTargetMin() {
        return this.monthlyLoadAerobicLowTargetMin;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getMonthlyLoadAnaerobic() {
        return this.monthlyLoadAnaerobic;
    }

    public final int hashCode() {
        String str = this._calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.deviceId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d14 = this.monthlyLoadAerobicLow;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.monthlyLoadAerobicHigh;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.monthlyLoadAnaerobic;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.monthlyLoadAerobicLowTargetMin;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.monthlyLoadAerobicLowTargetMax;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.monthlyLoadAerobicHighTargetMin;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.monthlyLoadAerobicHighTargetMax;
        int iHashCode9 = (iHashCode8 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.monthlyLoadAnaerobicTargetMin;
        int iHashCode10 = (iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.monthlyLoadAnaerobicTargetMax;
        int iHashCode11 = (iHashCode10 + (d26 == null ? 0 : d26.hashCode())) * 31;
        String str2 = this.trainingBalanceFeedbackPhraseKey;
        return iHashCode11 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getMonthlyLoadAnaerobicTargetMax() {
        return this.monthlyLoadAnaerobicTargetMax;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getMonthlyLoadAnaerobicTargetMin() {
        return this.monthlyLoadAnaerobicTargetMin;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTrainingBalanceFeedbackPhraseKey() {
        return this.trainingBalanceFeedbackPhraseKey;
    }

    public final String toString() {
        String str = this._calendarDate;
        Long l14 = this.deviceId;
        Double d14 = this.monthlyLoadAerobicLow;
        Double d15 = this.monthlyLoadAerobicHigh;
        Double d16 = this.monthlyLoadAnaerobic;
        Double d17 = this.monthlyLoadAerobicLowTargetMin;
        Double d18 = this.monthlyLoadAerobicLowTargetMax;
        Double d19 = this.monthlyLoadAerobicHighTargetMin;
        Double d24 = this.monthlyLoadAerobicHighTargetMax;
        Double d25 = this.monthlyLoadAnaerobicTargetMin;
        Double d26 = this.monthlyLoadAnaerobicTargetMax;
        String str2 = this.trainingBalanceFeedbackPhraseKey;
        StringBuilder sb3 = new StringBuilder("TrainingLoadBalanceRecordDto(_calendarDate=");
        sb3.append(str);
        sb3.append(", deviceId=");
        sb3.append(l14);
        sb3.append(", monthlyLoadAerobicLow=");
        b71.i.p(d14, d15, ", monthlyLoadAerobicHigh=", ", monthlyLoadAnaerobic=", sb3);
        b71.i.p(d16, d17, ", monthlyLoadAerobicLowTargetMin=", ", monthlyLoadAerobicLowTargetMax=", sb3);
        b71.i.p(d18, d19, ", monthlyLoadAerobicHighTargetMin=", ", monthlyLoadAerobicHighTargetMax=", sb3);
        b71.i.p(d24, d25, ", monthlyLoadAnaerobicTargetMin=", ", monthlyLoadAnaerobicTargetMax=", sb3);
        sb3.append(d26);
        sb3.append(", trainingBalanceFeedbackPhraseKey=");
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public i(String str, Long l14, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, String str2) {
        this._calendarDate = str;
        this.deviceId = l14;
        this.monthlyLoadAerobicLow = d14;
        this.monthlyLoadAerobicHigh = d15;
        this.monthlyLoadAnaerobic = d16;
        this.monthlyLoadAerobicLowTargetMin = d17;
        this.monthlyLoadAerobicLowTargetMax = d18;
        this.monthlyLoadAerobicHighTargetMin = d19;
        this.monthlyLoadAerobicHighTargetMax = d24;
        this.monthlyLoadAnaerobicTargetMin = d25;
        this.monthlyLoadAnaerobicTargetMax = d26;
        this.trainingBalanceFeedbackPhraseKey = str2;
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
