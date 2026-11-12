package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0097\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b\u0019\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b)\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R.\u00106\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8F@BX\u0087\u000e¢\u0006\u0012\n\u0004\b \u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R.\u0010<\u001a\u0004\u0018\u0001072\b\u00100\u001a\u0004\u0018\u0001078F@BX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u00105\u001a\u0004\b*\u0010:R.\u0010>\u001a\u0004\u0018\u0001072\b\u00100\u001a\u0004\u0018\u0001078F@BX\u0087\u000e¢\u0006\u0012\n\u0004\b(\u00109\u0012\u0004\b=\u00105\u001a\u0004\b&\u0010:¨\u0006?"}, d2 = {"Lgs1/f;", "Landroid/os/Parcelable;", "", "", "userProfilePk", "deviceId", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "", "duration", "activityType", "activitySubType", "startTimestampLocal", "endTimestampLocal", "", "moderateIntensityMinutes", "vigorousIntensityMinutes", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "f", "c", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "d", "m", JWKParameterNames.RSA_EXPONENT, "getEndTimestampGMT", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "h", IntegerTokenConverter.CONVERTER_KEY, "o", "j", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "l", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lorg/joda/time/DateTime;", "value", "Lorg/joda/time/DateTime;", "getDate", "()Lorg/joda/time/DateTime;", "getDate$annotations", "()V", "date", "Lorg/joda/time/LocalDateTime;", JWKParameterNames.RSA_MODULUS, "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "getStartLocalDateTime$annotations", "startLocalDateTime", "getEndLocalDateTime$annotations", "endLocalDateTime", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable, Comparable<f> {
    public static final Parcelable.Creator<f> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGMT")
    private final String startTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGMT")
    private final String endTimestampGMT;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activitySubType")
    private final String activitySubType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private final String startTimestampLocal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private final String endTimestampLocal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moderateIntensityMinutes")
    private final Integer moderateIntensityMinutes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vigorousIntensityMinutes")
    private final Integer vigorousIntensityMinutes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private DateTime date;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private LocalDateTime startLocalDateTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private LocalDateTime endLocalDateTime;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long l14 = lValueOf2;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string4 = parcel.readString();
            Double d14 = dValueOf;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = null;
            String string7 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new f(lValueOf, l14, string, string2, string3, d14, string4, string5, string6, string7, numValueOf2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ f(Long l14, Long l15, String str, String str2, String str3, Double d14, String str4, String str5, String str6, String str7, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivitySubType() {
        return this.activitySubType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        DateTime dateTime;
        f fVar2 = fVar;
        fVar2.getClass();
        String str = "";
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        DateTime dateTime2 = null;
        try {
            str = this.startTimestampGMT;
            dateTime = DateTime.parse(str, dateTimeFormatterForPattern);
            try {
                str = fVar2.startTimestampGMT;
                dateTime2 = DateTime.parse(str, dateTimeFormatterForPattern);
            } catch (IllegalInstantException e4) {
                e = e4;
                String strJ = androidx.room.a0.j("Illegal Instant [", str, "] ", e.getLocalizedMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "AutoDetectedEventDTO", strJ);
            } catch (IllegalArgumentException e14) {
                e = e14;
                String strJ2 = androidx.room.a0.j("Illegal Input [", str, "] ", e.getLocalizedMessage());
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "AutoDetectedEventDTO", strJ2);
            }
        } catch (IllegalInstantException e15) {
            e = e15;
            dateTime = null;
        } catch (IllegalArgumentException e16) {
            e = e16;
            dateTime = null;
        }
        if (dateTime == null && dateTime2 == null) {
            return 0;
        }
        if (dateTime == null) {
            return 1;
        }
        if (dateTime2 == null) {
            return -1;
        }
        return dateTime.compareTo((ReadableInstant) dateTime2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, fVar.userProfilePk) && p005kotlin.jvm.internal.s.g(this.deviceId, fVar.deviceId) && p005kotlin.jvm.internal.s.g(this.calendarDate, fVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.startTimestampGMT, fVar.startTimestampGMT) && p005kotlin.jvm.internal.s.g(this.endTimestampGMT, fVar.endTimestampGMT) && p005kotlin.jvm.internal.s.g(this.duration, fVar.duration) && p005kotlin.jvm.internal.s.g(this.activityType, fVar.activityType) && p005kotlin.jvm.internal.s.g(this.activitySubType, fVar.activitySubType) && p005kotlin.jvm.internal.s.g(this.startTimestampLocal, fVar.startTimestampLocal) && p005kotlin.jvm.internal.s.g(this.endTimestampLocal, fVar.endTimestampLocal) && p005kotlin.jvm.internal.s.g(this.moderateIntensityMinutes, fVar.moderateIntensityMinutes) && p005kotlin.jvm.internal.s.g(this.vigorousIntensityMinutes, fVar.vigorousIntensityMinutes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    public final LocalDateTime h() {
        if (this.endLocalDateTime == null) {
            this.endLocalDateTime = new LocalDateTime(this.endTimestampLocal);
        }
        return this.endLocalDateTime;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.deviceId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.calendarDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTimestampGMT;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTimestampGMT;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.duration;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.activityType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activitySubType;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.startTimestampLocal;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.endTimestampLocal;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.moderateIntensityMinutes;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.vigorousIntensityMinutes;
        return iHashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEndTimestampLocal() {
        return this.endTimestampLocal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getModerateIntensityMinutes() {
        return this.moderateIntensityMinutes;
    }

    public final LocalDateTime k() {
        if (this.startLocalDateTime == null) {
            this.startLocalDateTime = new LocalDateTime(this.startTimestampLocal);
        }
        return this.startLocalDateTime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStartTimestampGMT() {
        return this.startTimestampGMT;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartTimestampLocal() {
        return this.startTimestampLocal;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getVigorousIntensityMinutes() {
        return this.vigorousIntensityMinutes;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        Long l15 = this.deviceId;
        String str = this.calendarDate;
        String str2 = this.startTimestampGMT;
        String str3 = this.endTimestampGMT;
        Double d14 = this.duration;
        String str4 = this.activityType;
        String str5 = this.activitySubType;
        String str6 = this.startTimestampLocal;
        String str7 = this.endTimestampLocal;
        Integer num = this.moderateIntensityMinutes;
        Integer num2 = this.vigorousIntensityMinutes;
        StringBuilder sbJ = f3.j(l14, l15, "AutoDetectedEventDTO(userProfilePk=", ", deviceId=", ", calendarDate=");
        sn.a.t(sbJ, str, ", startTimestampGMT=", str2, ", endTimestampGMT=");
        b71.i.x(sbJ, str3, ", duration=", d14, ", activityType=");
        sn.a.t(sbJ, str4, ", activitySubType=", str5, ", startTimestampLocal=");
        sn.a.t(sbJ, str6, ", endTimestampLocal=", str7, ", moderateIntensityMinutes=");
        return b71.i.h(sbJ, num, ", vigorousIntensityMinutes=", num2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.deviceId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.startTimestampGMT);
        parcel.writeString(this.endTimestampGMT);
        Double d14 = this.duration;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.activityType);
        parcel.writeString(this.activitySubType);
        parcel.writeString(this.startTimestampLocal);
        parcel.writeString(this.endTimestampLocal);
        Integer num = this.moderateIntensityMinutes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.vigorousIntensityMinutes;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgs1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(Long l14, Long l15, String str, String str2, String str3, Double d14, String str4, String str5, String str6, String str7, Integer num, Integer num2) {
        this.userProfilePk = l14;
        this.deviceId = l15;
        this.calendarDate = str;
        this.startTimestampGMT = str2;
        this.endTimestampGMT = str3;
        this.duration = d14;
        this.activityType = str4;
        this.activitySubType = str5;
        this.startTimestampLocal = str6;
        this.endTimestampLocal = str7;
        this.moderateIntensityMinutes = num;
        this.vigorousIntensityMinutes = num2;
    }

    public f() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
