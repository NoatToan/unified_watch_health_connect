package bx;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u0012\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lbx/e;", "", "", "userProfilePK", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "", "deltaValue", "_timeOfDay", "confirmedTotalSleepSeconds", "", "bodyBatteryVersion", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/lang/Long;", "getUserProfilePK", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "c", "getStartTimestampGMT", "d", "getEndTimestampGMT", JWKParameterNames.RSA_EXPONENT, "getStartTimestampLocal", "f", "getEndTimestampLocal", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Double;", "getBodyBatteryVersion", "()Ljava/lang/Double;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGMT")
    private final String startTimestampGMT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGMT")
    private final String endTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private final String startTimestampLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private final String endTimestampLocal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deltaValue")
    private final Integer deltaValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeOfDay")
    private final String _timeOfDay;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmedTotalSleepSeconds")
    private final Integer confirmedTotalSleepSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryVersion")
    private final Double bodyBatteryVersion;

    public /* synthetic */ e(Long l14, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getConfirmedTotalSleepSeconds() {
        return this.confirmedTotalSleepSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDeltaValue() {
        return this.deltaValue;
    }

    public final d c() {
        d.c cVar = d.f21618b;
        String str = this._timeOfDay;
        cVar.getClass();
        d.b bVar = d.b.f21621c;
        if (s.g(str, bVar.f21619a)) {
            return bVar;
        }
        d.a aVar = d.a.f21620c;
        if (s.g(str, aVar.f21619a)) {
            return aVar;
        }
        d.e eVar = d.e.f21623c;
        if (s.g(str, eVar.f21619a)) {
            return eVar;
        }
        d.C0331d c0331d = d.C0331d.f21622c;
        return s.g(str, c0331d.f21619a) ? c0331d : d.f.f21624c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.userProfilePK, eVar.userProfilePK) && s.g(this.calendarDate, eVar.calendarDate) && s.g(this.startTimestampGMT, eVar.startTimestampGMT) && s.g(this.endTimestampGMT, eVar.endTimestampGMT) && s.g(this.startTimestampLocal, eVar.startTimestampLocal) && s.g(this.endTimestampLocal, eVar.endTimestampLocal) && s.g(this.deltaValue, eVar.deltaValue) && s.g(this._timeOfDay, eVar._timeOfDay) && s.g(this.confirmedTotalSleepSeconds, eVar.confirmedTotalSleepSeconds) && s.g(this.bodyBatteryVersion, eVar.bodyBatteryVersion);
    }

    public final int hashCode() {
        Long l14 = this.userProfilePK;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTimestampGMT;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTimestampGMT;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTimestampLocal;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTimestampLocal;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.deltaValue;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this._timeOfDay;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.confirmedTotalSleepSeconds;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.bodyBatteryVersion;
        return iHashCode9 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePK;
        String str = this.calendarDate;
        String str2 = this.startTimestampGMT;
        String str3 = this.endTimestampGMT;
        String str4 = this.startTimestampLocal;
        String str5 = this.endTimestampLocal;
        Integer num = this.deltaValue;
        String str6 = this._timeOfDay;
        Integer num2 = this.confirmedTotalSleepSeconds;
        Double d14 = this.bodyBatteryVersion;
        StringBuilder sbJ = b71.i.j("BodyBatteryMessagingTodayDTO(userProfilePK=", ", calendarDate=", str, l14, ", startTimestampGMT=");
        sn.a.t(sbJ, str2, ", endTimestampGMT=", str3, ", startTimestampLocal=");
        sn.a.t(sbJ, str4, ", endTimestampLocal=", str5, ", deltaValue=");
        p6.b.l(num, ", _timeOfDay=", str6, ", confirmedTotalSleepSeconds=", sbJ);
        sbJ.append(num2);
        sbJ.append(", bodyBatteryVersion=");
        sbJ.append(d14);
        sbJ.append(")");
        return sbJ.toString();
    }

    public e(Long l14, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Double d14) {
        this.userProfilePK = l14;
        this.calendarDate = str;
        this.startTimestampGMT = str2;
        this.endTimestampGMT = str3;
        this.startTimestampLocal = str4;
        this.endTimestampLocal = str5;
        this.deltaValue = num;
        this._timeOfDay = str6;
        this.confirmedTotalSleepSeconds = num2;
        this.bodyBatteryVersion = d14;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
