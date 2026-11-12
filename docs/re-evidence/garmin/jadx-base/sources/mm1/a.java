package mm1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.courses.biz.gson.DoubleTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b'\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b \u0010\u0016¨\u0006)"}, d2 = {"Lmm1/a;", "Landroid/os/Parcelable;", "", "averageBodyBatteryChange", "", "averageLocalSleepEndTime", "averageLocalSleepStartTime", "averageRestingHeartRate", "meanAvgHeartRate", "averageSkinTempC", "averageSkinTempF", "", "averageSleepNeed", "averageSleepScore", "averageSleepSeconds", "averageSpO2", "averageRespiration", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "c", "f", "h", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, IntegerTokenConverter.CONVERTER_KEY, "g", "j", "Ljava/lang/Integer;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Integer;", "m", "o", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "l", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2270a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f119613m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageBodyBatteryChange")
    private final Double averageBodyBatteryChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageLocalSleepEndTime")
    private final Long averageLocalSleepEndTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageLocalSleepStartTime")
    private final Long averageLocalSleepStartTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageRestingHeartRate")
    private final Double averageRestingHeartRate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meanAvgHeartRate")
    private final Double meanAvgHeartRate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSkinTempC")
    @JsonAdapter(DoubleTypeAdapter.class)
    private final Double averageSkinTempC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSkinTempF")
    @JsonAdapter(DoubleTypeAdapter.class)
    private final Double averageSkinTempF;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepNeed")
    private final Integer averageSleepNeed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepScore")
    private final Double averageSleepScore;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepSeconds")
    private final Integer averageSleepSeconds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpO2")
    private final Double averageSpO2;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageRespiration")
    private final Double averageRespiration;

    /* JADX INFO: renamed from: mm1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2270a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Double d14, Long l14, Long l15, Double d15, Double d16, Double d17, Double d18, Integer num, Double d19, Integer num2, Double d24, Double d25, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? null : d19, (i14 & 512) != 0 ? null : num2, (i14 & 1024) != 0 ? null : d24, (i14 & 2048) != 0 ? null : d25);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAverageBodyBatteryChange() {
        return this.averageBodyBatteryChange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAverageLocalSleepEndTime() {
        return this.averageLocalSleepEndTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.averageBodyBatteryChange, aVar.averageBodyBatteryChange) && s.g(this.averageLocalSleepEndTime, aVar.averageLocalSleepEndTime) && s.g(this.averageLocalSleepStartTime, aVar.averageLocalSleepStartTime) && s.g(this.averageRestingHeartRate, aVar.averageRestingHeartRate) && s.g(this.meanAvgHeartRate, aVar.meanAvgHeartRate) && s.g(this.averageSkinTempC, aVar.averageSkinTempC) && s.g(this.averageSkinTempF, aVar.averageSkinTempF) && s.g(this.averageSleepNeed, aVar.averageSleepNeed) && s.g(this.averageSleepScore, aVar.averageSleepScore) && s.g(this.averageSleepSeconds, aVar.averageSleepSeconds) && s.g(this.averageSpO2, aVar.averageSpO2) && s.g(this.averageRespiration, aVar.averageRespiration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getAverageLocalSleepStartTime() {
        return this.averageLocalSleepStartTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageRespiration() {
        return this.averageRespiration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getAverageRestingHeartRate() {
        return this.averageRestingHeartRate;
    }

    public final int hashCode() {
        Double d14 = this.averageBodyBatteryChange;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Long l14 = this.averageLocalSleepEndTime;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.averageLocalSleepStartTime;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Double d15 = this.averageRestingHeartRate;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.meanAvgHeartRate;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.averageSkinTempC;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.averageSkinTempF;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Integer num = this.averageSleepNeed;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Double d19 = this.averageSleepScore;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Integer num2 = this.averageSleepSeconds;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d24 = this.averageSpO2;
        int iHashCode11 = (iHashCode10 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.averageRespiration;
        return iHashCode11 + (d25 != null ? d25.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getAverageSkinTempC() {
        return this.averageSkinTempC;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getAverageSkinTempF() {
        return this.averageSkinTempF;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getAverageSleepNeed() {
        return this.averageSleepNeed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getAverageSleepScore() {
        return this.averageSleepScore;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getAverageSleepSeconds() {
        return this.averageSleepSeconds;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getAverageSpO2() {
        return this.averageSpO2;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getMeanAvgHeartRate() {
        return this.meanAvgHeartRate;
    }

    public final String toString() {
        Double d14 = this.averageBodyBatteryChange;
        Long l14 = this.averageLocalSleepEndTime;
        Long l15 = this.averageLocalSleepStartTime;
        Double d15 = this.averageRestingHeartRate;
        Double d16 = this.meanAvgHeartRate;
        Double d17 = this.averageSkinTempC;
        Double d18 = this.averageSkinTempF;
        Integer num = this.averageSleepNeed;
        Double d19 = this.averageSleepScore;
        Integer num2 = this.averageSleepSeconds;
        Double d24 = this.averageSpO2;
        Double d25 = this.averageRespiration;
        StringBuilder sb3 = new StringBuilder("DailyOverallStats(averageBodyBatteryChange=");
        sb3.append(d14);
        sb3.append(", averageLocalSleepEndTime=");
        sb3.append(l14);
        sb3.append(", averageLocalSleepStartTime=");
        sb3.append(l15);
        sb3.append(", averageRestingHeartRate=");
        sb3.append(d15);
        sb3.append(", meanAvgHeartRate=");
        i.p(d16, d17, ", averageSkinTempC=", ", averageSkinTempF=", sb3);
        i.t(sb3, d18, ", averageSleepNeed=", num, ", averageSleepScore=");
        i.t(sb3, d19, ", averageSleepSeconds=", num2, ", averageSpO2=");
        return sn.a.f(d24, d25, ", averageRespiration=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.averageBodyBatteryChange;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l14 = this.averageLocalSleepEndTime;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.averageLocalSleepStartTime;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Double d15 = this.averageRestingHeartRate;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.meanAvgHeartRate;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.averageSkinTempC;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.averageSkinTempF;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Integer num = this.averageSleepNeed;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d19 = this.averageSleepScore;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Integer num2 = this.averageSleepSeconds;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Double d24 = this.averageSpO2;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.averageRespiration;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
    }

    public a(Double d14, Long l14, Long l15, Double d15, Double d16, Double d17, Double d18, Integer num, Double d19, Integer num2, Double d24, Double d25) {
        this.averageBodyBatteryChange = d14;
        this.averageLocalSleepEndTime = l14;
        this.averageLocalSleepStartTime = l15;
        this.averageRestingHeartRate = d15;
        this.meanAvgHeartRate = d16;
        this.averageSkinTempC = d17;
        this.averageSkinTempF = d18;
        this.averageSleepNeed = num;
        this.averageSleepScore = d19;
        this.averageSleepSeconds = num2;
        this.averageSpO2 = d24;
        this.averageRespiration = d25;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
