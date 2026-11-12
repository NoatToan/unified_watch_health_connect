package mm1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.courses.biz.gson.DoubleTypeAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.flexbox.FlexItem;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lmm1/c;", "", "", "calendarDate", "Lmm1/c$a;", "values", "<init>", "(Ljava/lang/String;Lmm1/c$a;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lmm1/c$a;", "()Lmm1/c$a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final a values;

    public /* synthetic */ c(String str, a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getValues() {
        return this.values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.calendarDate, cVar.calendarDate) && s.g(this.values, cVar.values);
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.values;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "DailySleepSummaryValueDTO(calendarDate=" + this.calendarDate + ", values=" + this.values + ")";
    }

    public c(String str, a aVar) {
        this.calendarDate = str;
        this.values = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b3\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b6\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b7\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b$\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b;\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010!\u001a\u0004\b=\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b>\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010!\u001a\u0004\bB\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b4\u0010#R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b8\u0010#R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\bA\u0010#R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010!\u001a\u0004\bF\u0010#R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010!\u001a\u0004\bH\u0010#R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\bG\u0010,¨\u0006I"}, d2 = {"Lmm1/c$a;", "Landroid/os/Parcelable;", "", "bodyBatteryChange", "", "hrv7dAverage", "avgOvernightHrv", "", "hrvStatus", "", "localSleepEndTimeInMillis", "localSleepStartTimeInMillis", "gmtSleepEndTimeInMillis", "gmtSleepStartTimeInMillis", "respiration", "restingHeartRate", "avgHeartRate", "skinTempC", "skinTempF", "sleepNeed", "sleepScore", "spO2", "totalSleepTimeInSeconds", "deepTime", "lightTime", "remTime", "awakeTime", "sleepAlignmentOswEnd", "sleepAlignmentOswStart", "sleepAlignmentStatus", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "c", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "f", "o", "getGmtSleepEndTimeInMillis", "h", "getGmtSleepStartTimeInMillis", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", JWKParameterNames.OCT_KEY_VALUE, "l", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "u", JWKParameterNames.RSA_MODULUS, "z", "A", "p", "C", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "D", "v", "w", "x", "getSleepAlignmentOswEnd", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getSleepAlignmentOswStart", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2271a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("bodyBatteryChange")
        private final Integer bodyBatteryChange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("hrv7dAverage")
        private final Double hrv7dAverage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("avgOvernightHrv")
        private final Double avgOvernightHrv;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("hrvStatus")
        private final String hrvStatus;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("localSleepEndTimeInMillis")
        private final Long localSleepEndTimeInMillis;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("localSleepStartTimeInMillis")
        private final Long localSleepStartTimeInMillis;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("gmtSleepEndTimeInMillis")
        private final Long gmtSleepEndTimeInMillis;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("gmtSleepStartTimeInMillis")
        private final Long gmtSleepStartTimeInMillis;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("respiration")
        private final Double respiration;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingHeartRate")
        private final Integer restingHeartRate;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @SerializedName("avgHeartRate")
        private final Double avgHeartRate;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @SerializedName("skinTempC")
        @JsonAdapter(DoubleTypeAdapter.class)
        private final Double skinTempC;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @SerializedName("skinTempF")
        @JsonAdapter(DoubleTypeAdapter.class)
        private final Double skinTempF;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepNeed")
        private final Integer sleepNeed;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepScore")
        private final Integer sleepScore;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @SerializedName("spO2")
        private final Double spO2;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalSleepTimeInSeconds")
        private final Integer totalSleepTimeInSeconds;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @SerializedName("deepTime")
        private final Integer deepTime;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @SerializedName("lightTime")
        private final Integer lightTime;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @SerializedName("remTime")
        private final Integer remTime;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @SerializedName("awakeTime")
        private final Integer awakeTime;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepAlignmentOswEnd")
        private final Integer sleepAlignmentOswEnd;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepAlignmentOswStart")
        private final Integer sleepAlignmentOswStart;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepAlignmentStatus")
        private final String sleepAlignmentStatus;

        /* JADX INFO: renamed from: mm1.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2271a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public /* synthetic */ a(Integer num, Double d14, Double d15, String str, Long l14, Long l15, Long l16, Long l17, Double d16, Integer num2, Double d17, Double d18, Double d19, Integer num3, Integer num4, Double d24, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, String str2, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : l15, (i14 & 64) != 0 ? null : l16, (i14 & 128) != 0 ? null : l17, (i14 & 256) != 0 ? null : d16, (i14 & 512) != 0 ? null : num2, (i14 & 1024) != 0 ? null : d17, (i14 & 2048) != 0 ? null : d18, (i14 & 4096) != 0 ? null : d19, (i14 & 8192) != 0 ? null : num3, (i14 & 16384) != 0 ? null : num4, (i14 & 32768) != 0 ? null : d24, (i14 & 65536) != 0 ? null : num5, (i14 & 131072) != 0 ? null : num6, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : num7, (i14 & 524288) != 0 ? null : num8, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num9, (i14 & 2097152) != 0 ? null : num10, (i14 & 4194304) != 0 ? null : num11, (i14 & 8388608) != 0 ? null : str2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final Integer getSleepScore() {
            return this.sleepScore;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final Double getSpO2() {
            return this.spO2;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final Integer getTotalSleepTimeInSeconds() {
            return this.totalSleepTimeInSeconds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getAvgHeartRate() {
            return this.avgHeartRate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getAvgOvernightHrv() {
            return this.avgOvernightHrv;
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
            return s.g(this.bodyBatteryChange, aVar.bodyBatteryChange) && s.g(this.hrv7dAverage, aVar.hrv7dAverage) && s.g(this.avgOvernightHrv, aVar.avgOvernightHrv) && s.g(this.hrvStatus, aVar.hrvStatus) && s.g(this.localSleepEndTimeInMillis, aVar.localSleepEndTimeInMillis) && s.g(this.localSleepStartTimeInMillis, aVar.localSleepStartTimeInMillis) && s.g(this.gmtSleepEndTimeInMillis, aVar.gmtSleepEndTimeInMillis) && s.g(this.gmtSleepStartTimeInMillis, aVar.gmtSleepStartTimeInMillis) && s.g(this.respiration, aVar.respiration) && s.g(this.restingHeartRate, aVar.restingHeartRate) && s.g(this.avgHeartRate, aVar.avgHeartRate) && s.g(this.skinTempC, aVar.skinTempC) && s.g(this.skinTempF, aVar.skinTempF) && s.g(this.sleepNeed, aVar.sleepNeed) && s.g(this.sleepScore, aVar.sleepScore) && s.g(this.spO2, aVar.spO2) && s.g(this.totalSleepTimeInSeconds, aVar.totalSleepTimeInSeconds) && s.g(this.deepTime, aVar.deepTime) && s.g(this.lightTime, aVar.lightTime) && s.g(this.remTime, aVar.remTime) && s.g(this.awakeTime, aVar.awakeTime) && s.g(this.sleepAlignmentOswEnd, aVar.sleepAlignmentOswEnd) && s.g(this.sleepAlignmentOswStart, aVar.sleepAlignmentOswStart) && s.g(this.sleepAlignmentStatus, aVar.sleepAlignmentStatus);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getAwakeTime() {
            return this.awakeTime;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getBodyBatteryChange() {
            return this.bodyBatteryChange;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Integer getDeepTime() {
            return this.deepTime;
        }

        public final int hashCode() {
            Integer num = this.bodyBatteryChange;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.hrv7dAverage;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.avgOvernightHrv;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            String str = this.hrvStatus;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Long l14 = this.localSleepEndTimeInMillis;
            int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.localSleepStartTimeInMillis;
            int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.gmtSleepEndTimeInMillis;
            int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
            Long l17 = this.gmtSleepStartTimeInMillis;
            int iHashCode8 = (iHashCode7 + (l17 == null ? 0 : l17.hashCode())) * 31;
            Double d16 = this.respiration;
            int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Integer num2 = this.restingHeartRate;
            int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d17 = this.avgHeartRate;
            int iHashCode11 = (iHashCode10 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.skinTempC;
            int iHashCode12 = (iHashCode11 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.skinTempF;
            int iHashCode13 = (iHashCode12 + (d19 == null ? 0 : d19.hashCode())) * 31;
            Integer num3 = this.sleepNeed;
            int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.sleepScore;
            int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Double d24 = this.spO2;
            int iHashCode16 = (iHashCode15 + (d24 == null ? 0 : d24.hashCode())) * 31;
            Integer num5 = this.totalSleepTimeInSeconds;
            int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.deepTime;
            int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.lightTime;
            int iHashCode19 = (iHashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.remTime;
            int iHashCode20 = (iHashCode19 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.awakeTime;
            int iHashCode21 = (iHashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.sleepAlignmentOswEnd;
            int iHashCode22 = (iHashCode21 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.sleepAlignmentOswStart;
            int iHashCode23 = (iHashCode22 + (num11 == null ? 0 : num11.hashCode())) * 31;
            String str2 = this.sleepAlignmentStatus;
            return iHashCode23 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Double getHrv7dAverage() {
            return this.hrv7dAverage;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getHrvStatus() {
            return this.hrvStatus;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Integer getLightTime() {
            return this.lightTime;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Long getLocalSleepEndTimeInMillis() {
            return this.localSleepEndTimeInMillis;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Long getLocalSleepStartTimeInMillis() {
            return this.localSleepStartTimeInMillis;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final Integer getRemTime() {
            return this.remTime;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final Double getRespiration() {
            return this.respiration;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Integer getRestingHeartRate() {
            return this.restingHeartRate;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Double getSkinTempC() {
            return this.skinTempC;
        }

        public final String toString() {
            Integer num = this.bodyBatteryChange;
            Double d14 = this.hrv7dAverage;
            Double d15 = this.avgOvernightHrv;
            String str = this.hrvStatus;
            Long l14 = this.localSleepEndTimeInMillis;
            Long l15 = this.localSleepStartTimeInMillis;
            Long l16 = this.gmtSleepEndTimeInMillis;
            Long l17 = this.gmtSleepStartTimeInMillis;
            Double d16 = this.respiration;
            Integer num2 = this.restingHeartRate;
            Double d17 = this.avgHeartRate;
            Double d18 = this.skinTempC;
            Double d19 = this.skinTempF;
            Integer num3 = this.sleepNeed;
            Integer num4 = this.sleepScore;
            Double d24 = this.spO2;
            Integer num5 = this.totalSleepTimeInSeconds;
            Integer num6 = this.deepTime;
            Integer num7 = this.lightTime;
            Integer num8 = this.remTime;
            Integer num9 = this.awakeTime;
            Integer num10 = this.sleepAlignmentOswEnd;
            Integer num11 = this.sleepAlignmentOswStart;
            String str2 = this.sleepAlignmentStatus;
            StringBuilder sbM = u0.m("Values(bodyBatteryChange=", num, ", hrv7dAverage=", d14, ", avgOvernightHrv=");
            i.u(sbM, d15, ", hrvStatus=", str, ", localSleepEndTimeInMillis=");
            kg.f.s(sbM, l14, ", localSleepStartTimeInMillis=", l15, ", gmtSleepEndTimeInMillis=");
            kg.f.s(sbM, l16, ", gmtSleepStartTimeInMillis=", l17, ", respiration=");
            i.t(sbM, d16, ", restingHeartRate=", num2, ", avgHeartRate=");
            i.p(d17, d18, ", skinTempC=", ", skinTempF=", sbM);
            i.t(sbM, d19, ", sleepNeed=", num3, ", sleepScore=");
            i.v(sbM, num4, ", spO2=", d24, ", totalSleepTimeInSeconds=");
            x.m(sbM, num5, ", deepTime=", num6, ", lightTime=");
            x.m(sbM, num7, ", remTime=", num8, ", awakeTime=");
            x.m(sbM, num9, ", sleepAlignmentOswEnd=", num10, ", sleepAlignmentOswStart=");
            sbM.append(num11);
            sbM.append(", sleepAlignmentStatus=");
            sbM.append(str2);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final Double getSkinTempF() {
            return this.skinTempF;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.bodyBatteryChange;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Double d14 = this.hrv7dAverage;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.avgOvernightHrv;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
            parcel.writeString(this.hrvStatus);
            Long l14 = this.localSleepEndTimeInMillis;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            Long l15 = this.localSleepStartTimeInMillis;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l15);
            }
            Long l16 = this.gmtSleepEndTimeInMillis;
            if (l16 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l16);
            }
            Long l17 = this.gmtSleepStartTimeInMillis;
            if (l17 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l17);
            }
            Double d16 = this.respiration;
            if (d16 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d16);
            }
            Integer num2 = this.restingHeartRate;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            Double d17 = this.avgHeartRate;
            if (d17 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d17);
            }
            Double d18 = this.skinTempC;
            if (d18 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d18);
            }
            Double d19 = this.skinTempF;
            if (d19 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d19);
            }
            Integer num3 = this.sleepNeed;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num3);
            }
            Integer num4 = this.sleepScore;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num4);
            }
            Double d24 = this.spO2;
            if (d24 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d24);
            }
            Integer num5 = this.totalSleepTimeInSeconds;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num5);
            }
            Integer num6 = this.deepTime;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num6);
            }
            Integer num7 = this.lightTime;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num7);
            }
            Integer num8 = this.remTime;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num8);
            }
            Integer num9 = this.awakeTime;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num9);
            }
            Integer num10 = this.sleepAlignmentOswEnd;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num10);
            }
            Integer num11 = this.sleepAlignmentOswStart;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num11);
            }
            parcel.writeString(this.sleepAlignmentStatus);
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSleepAlignmentStatus() {
            return this.sleepAlignmentStatus;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final Integer getSleepNeed() {
            return this.sleepNeed;
        }

        public a(Integer num, Double d14, Double d15, String str, Long l14, Long l15, Long l16, Long l17, Double d16, Integer num2, Double d17, Double d18, Double d19, Integer num3, Integer num4, Double d24, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, String str2) {
            this.bodyBatteryChange = num;
            this.hrv7dAverage = d14;
            this.avgOvernightHrv = d15;
            this.hrvStatus = str;
            this.localSleepEndTimeInMillis = l14;
            this.localSleepStartTimeInMillis = l15;
            this.gmtSleepEndTimeInMillis = l16;
            this.gmtSleepStartTimeInMillis = l17;
            this.respiration = d16;
            this.restingHeartRate = num2;
            this.avgHeartRate = d17;
            this.skinTempC = d18;
            this.skinTempF = d19;
            this.sleepNeed = num3;
            this.sleepScore = num4;
            this.spO2 = d24;
            this.totalSleepTimeInSeconds = num5;
            this.deepTime = num6;
            this.lightTime = num7;
            this.remTime = num8;
            this.awakeTime = num9;
            this.sleepAlignmentOswEnd = num10;
            this.sleepAlignmentOswStart = num11;
            this.sleepAlignmentStatus = str2;
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
        }
    }
}
