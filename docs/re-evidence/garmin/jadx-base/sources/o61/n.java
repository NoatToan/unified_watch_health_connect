package o61;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b*\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001c\u001a\u0004\b;\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b6\u0010>R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b\u001b\u0010AR\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\b%\u0010>¨\u0006C"}, d2 = {"Lo61/n;", "", "", "_calendarDate", "sinceDate", "", "_weeklyTrainingLoad", "trainingStatus", "", "timestamp", "deviceId", "loadTunnelMin", "loadTunnelMax", "", "loadLevelTrend", "sport", "subSport", "fitnessTrendSport", "fitnessTrend", "trainingStatusFeedbackPhrase", "", "isTrainingStatusPaused", "Lo61/a;", "acuteTrainingLoad", "primaryTrainingDevice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;JJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLo61/a;Z)V", "a", "Ljava/lang/String;", "b", "f", "()Ljava/lang/String;", "c", "Ljava/lang/Double;", "d", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "J", "g", "()J", "getDeviceId", "getLoadTunnelMin", "h", "getLoadTunnelMax", "Ljava/lang/Integer;", "getLoadLevelTrend", "()Ljava/lang/Integer;", "j", "getSport", JWKParameterNames.OCT_KEY_VALUE, "getSubSport", "l", "getFitnessTrendSport", "m", "I", "getFitnessTrend", "()I", JWKParameterNames.RSA_MODULUS, "getTrainingStatusFeedbackPhrase", "o", "Z", "()Z", "p", "Lo61/a;", "()Lo61/a;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sinceDate")
    private final String sinceDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weeklyTrainingLoad")
    private final Double _weeklyTrainingLoad;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingStatus")
    private final Double trainingStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loadTunnelMin")
    private final Double loadTunnelMin;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loadTunnelMax")
    private final Double loadTunnelMax;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loadLevelTrend")
    private final Integer loadLevelTrend;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final String sport;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subSport")
    private final String subSport;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitnessTrendSport")
    private final String fitnessTrendSport;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitnessTrend")
    private final int fitnessTrend;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingStatusFeedbackPhrase")
    private final String trainingStatusFeedbackPhrase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPaused")
    private final boolean isTrainingStatusPaused;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acuteTrainingLoadDTO")
    private final a acuteTrainingLoad;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryTrainingDevice")
    private final boolean primaryTrainingDevice;

    public /* synthetic */ n(String str, String str2, Double d14, Double d15, long j8, long j14, Double d16, Double d17, Integer num, String str3, String str4, String str5, int i14, String str6, boolean z14, a aVar, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : d14, d15, j8, j14, d16, d17, num, str3, str4, str5, i14, str6, z14, aVar, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAcuteTrainingLoad() {
        return this.acuteTrainingLoad;
    }

    public final Double b() {
        Double dF;
        a aVar = this.acuteTrainingLoad;
        return (aVar == null || (dF = aVar.getMaxTrainingLoadChronic()) == null) ? this.loadTunnelMax : dF;
    }

    public final Double c() {
        Double dG;
        a aVar = this.acuteTrainingLoad;
        return (aVar == null || (dG = aVar.getMinTrainingLoadChronic()) == null) ? this.loadTunnelMin : dG;
    }

    public final LocalDate d() {
        LocalDate localDateW;
        String str = this._calendarDate;
        if (str != null && (localDateW = g22.k.w(str, "yyyy-MM-dd")) != null) {
            return localDateW;
        }
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return localDateNow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPrimaryTrainingDevice() {
        return this.primaryTrainingDevice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this._calendarDate, nVar._calendarDate) && s.g(this.sinceDate, nVar.sinceDate) && s.g(this._weeklyTrainingLoad, nVar._weeklyTrainingLoad) && s.g(this.trainingStatus, nVar.trainingStatus) && this.timestamp == nVar.timestamp && this.deviceId == nVar.deviceId && s.g(this.loadTunnelMin, nVar.loadTunnelMin) && s.g(this.loadTunnelMax, nVar.loadTunnelMax) && s.g(this.loadLevelTrend, nVar.loadLevelTrend) && s.g(this.sport, nVar.sport) && s.g(this.subSport, nVar.subSport) && s.g(this.fitnessTrendSport, nVar.fitnessTrendSport) && this.fitnessTrend == nVar.fitnessTrend && s.g(this.trainingStatusFeedbackPhrase, nVar.trainingStatusFeedbackPhrase) && this.isTrainingStatusPaused == nVar.isTrainingStatusPaused && s.g(this.acuteTrainingLoad, nVar.acuteTrainingLoad) && this.primaryTrainingDevice == nVar.primaryTrainingDevice;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSinceDate() {
        return this.sinceDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final e71.m h() {
        a aVar = this.acuteTrainingLoad;
        e71.m mVarC = null;
        if (aVar != null) {
            String strA = aVar.getAcwrStatus();
            String strB = this.acuteTrainingLoad.getAcwrStatusFeedback();
            if (strA == null || strB == null) {
                return null;
            }
            e71.m.f63320c.getClass();
            return e71.m.a.b(strA, strB);
        }
        Double dK = k();
        Double d14 = this.loadTunnelMin;
        Double d15 = this.loadTunnelMax;
        if (dK != null && d14 != null && d15 != null) {
            double dDoubleValue = d15.doubleValue();
            double dDoubleValue2 = d14.doubleValue();
            double dDoubleValue3 = dK.doubleValue();
            e71.m.f63320c.getClass();
            mVarC = e71.m.a.c(dDoubleValue3, dDoubleValue2, dDoubleValue);
        }
        return mVarC == null ? new e71.n() : mVarC;
    }

    public final int hashCode() {
        String str = this._calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sinceDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this._weeklyTrainingLoad;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.trainingStatus;
        int iE = q6.f.e(q6.f.e((iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.timestamp), 31, this.deviceId);
        Double d16 = this.loadTunnelMin;
        int iHashCode4 = (iE + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.loadTunnelMax;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num = this.loadLevelTrend;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.sport;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subSport;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fitnessTrendSport;
        int iG = q6.f.g(wr.g.j(q2.d(this.fitnessTrend, (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.trainingStatusFeedbackPhrase), 31, this.isTrainingStatusPaused);
        a aVar = this.acuteTrainingLoad;
        return Boolean.hashCode(this.primaryTrainingDevice) + ((iG + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getTrainingStatus() {
        return this.trainingStatus;
    }

    public final boolean j() {
        return this._calendarDate != null;
    }

    public final Double k() {
        Integer numD;
        a aVar = this.acuteTrainingLoad;
        return (aVar == null || (numD = aVar.getDailyTrainingLoadAcute()) == null) ? this._weeklyTrainingLoad : Double.valueOf(numD.intValue());
    }

    public final boolean l() {
        String str = this.fitnessTrendSport;
        return str != null ? "CYCLING".equalsIgnoreCase(str) : "CYCLING".equalsIgnoreCase(this.sport);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsTrainingStatusPaused() {
        return this.isTrainingStatusPaused;
    }

    public final String toString() {
        String str = this._calendarDate;
        String str2 = this.sinceDate;
        Double d14 = this._weeklyTrainingLoad;
        Double d15 = this.trainingStatus;
        long j8 = this.timestamp;
        long j14 = this.deviceId;
        Double d16 = this.loadTunnelMin;
        Double d17 = this.loadTunnelMax;
        Integer num = this.loadLevelTrend;
        String str3 = this.sport;
        String str4 = this.subSport;
        String str5 = this.fitnessTrendSport;
        int i14 = this.fitnessTrend;
        String str6 = this.trainingStatusFeedbackPhrase;
        boolean z14 = this.isTrainingStatusPaused;
        a aVar = this.acuteTrainingLoad;
        boolean z15 = this.primaryTrainingDevice;
        StringBuilder sbI = p6.b.i("TrainingStatusEntryDTO(_calendarDate=", str, ", sinceDate=", str2, ", _weeklyTrainingLoad=");
        b71.i.p(d14, d15, ", trainingStatus=", ", timestamp=", sbI);
        sbI.append(j8);
        x.j(j14, ", deviceId=", ", loadTunnelMin=", sbI);
        b71.i.p(d16, d17, ", loadTunnelMax=", ", loadLevelTrend=", sbI);
        p6.b.l(num, ", sport=", str3, ", subSport=", sbI);
        sn.a.t(sbI, str4, ", fitnessTrendSport=", str5, ", fitnessTrend=");
        wr.g.t(i14, ", trainingStatusFeedbackPhrase=", str6, ", isTrainingStatusPaused=", sbI);
        sbI.append(z14);
        sbI.append(", acuteTrainingLoad=");
        sbI.append(aVar);
        sbI.append(", primaryTrainingDevice=");
        return hb.a.k(sbI, z15, ")");
    }

    public n(String str, String str2, Double d14, Double d15, long j8, long j14, Double d16, Double d17, Integer num, String str3, String str4, String str5, int i14, String str6, boolean z14, a aVar, boolean z15) {
        str6.getClass();
        this._calendarDate = str;
        this.sinceDate = str2;
        this._weeklyTrainingLoad = d14;
        this.trainingStatus = d15;
        this.timestamp = j8;
        this.deviceId = j14;
        this.loadTunnelMin = d16;
        this.loadTunnelMax = d17;
        this.loadLevelTrend = num;
        this.sport = str3;
        this.subSport = str4;
        this.fitnessTrendSport = str5;
        this.fitnessTrend = i14;
        this.trainingStatusFeedbackPhrase = str6;
        this.isTrainingStatusPaused = z14;
        this.acuteTrainingLoad = aVar;
        this.primaryTrainingDevice = z15;
    }
}
