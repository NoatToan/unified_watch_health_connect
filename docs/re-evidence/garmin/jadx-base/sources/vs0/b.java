package vs0;

import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0015\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lvs0/b;", "", "", "userProfilePk", "version", "Lorg/joda/time/DateTime;", "_calendarDate", "sequence", "", "speed", "rowSpeed", "", "heartRate", "cyclingHeartRate", "heartRateRowing", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "getVersion", "c", "Lorg/joda/time/DateTime;", "d", "getSequence", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "()Ljava/lang/Double;", "f", "getRowSpeed", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", IntegerTokenConverter.CONVERTER_KEY, "getHeartRateRowing", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private final Long version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime _calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sequence")
    private final Long sequence;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private final Double speed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rowSpeed")
    private final Double rowSpeed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hearRate")
    private final Integer heartRate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRateCycling")
    private final Integer cyclingHeartRate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRateRowing")
    private final Integer heartRateRowing;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179731a;

        static {
            int[] iArr = new int[xs0.a.values().length];
            try {
                iArr[xs0.a.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f179731a = iArr;
        }
    }

    public /* synthetic */ b(Long l14, Long l15, DateTime dateTime, Long l16, Double d14, Double d15, Integer num, Integer num2, Integer num3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : dateTime, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : num3);
    }

    public final LocalDate a() {
        DateTime dateTime = this._calendarDate;
        if (dateTime != null) {
            return dateTime.toLocalDate();
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCyclingHeartRate() {
        return this.cyclingHeartRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final Integer d(xs0.a aVar) {
        aVar.getClass();
        return a.f179731a[aVar.ordinal()] == 1 ? this.heartRateRowing : this.heartRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getSpeed() {
        return this.speed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.version, bVar.version) && s.g(this._calendarDate, bVar._calendarDate) && s.g(this.sequence, bVar.sequence) && s.g(this.speed, bVar.speed) && s.g(this.rowSpeed, bVar.rowSpeed) && s.g(this.heartRate, bVar.heartRate) && s.g(this.cyclingHeartRate, bVar.cyclingHeartRate) && s.g(this.heartRateRowing, bVar.heartRateRowing);
    }

    public final Double f(xs0.a aVar) {
        aVar.getClass();
        return a.f179731a[aVar.ordinal()] == 1 ? this.rowSpeed : this.speed;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.version;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        DateTime dateTime = this._calendarDate;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l16 = this.sequence;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Double d14 = this.speed;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.rowSpeed;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.heartRate;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cyclingHeartRate;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.heartRateRowing;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        Long l15 = this.version;
        DateTime dateTime = this._calendarDate;
        Long l16 = this.sequence;
        Double d14 = this.speed;
        Double d15 = this.rowSpeed;
        Integer num = this.heartRate;
        Integer num2 = this.cyclingHeartRate;
        Integer num3 = this.heartRateRowing;
        StringBuilder sbJ = f3.j(l14, l15, "LatestLactateThresholdDTO(userProfilePk=", ", version=", ", _calendarDate=");
        sbJ.append(dateTime);
        sbJ.append(", sequence=");
        sbJ.append(l16);
        sbJ.append(", speed=");
        i.p(d14, d15, ", rowSpeed=", ", heartRate=", sbJ);
        x.m(sbJ, num, ", cyclingHeartRate=", num2, ", heartRateRowing=");
        return f3.i(sbJ, num3, ")");
    }

    public b(Long l14, Long l15, DateTime dateTime, Long l16, Double d14, Double d15, Integer num, Integer num2, Integer num3) {
        this.userProfilePk = l14;
        this.version = l15;
        this._calendarDate = dateTime;
        this.sequence = l16;
        this.speed = d14;
        this.rowSpeed = d15;
        this.heartRate = num;
        this.cyclingHeartRate = num2;
        this.heartRateRowing = num3;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
