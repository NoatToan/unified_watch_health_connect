package km1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\u001c\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b)\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b*\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b,\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b(\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b4\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b0\u0010'¨\u00066"}, d2 = {"Lkm1/a0;", "Landroid/os/Parcelable;", "", "version", "userProfilePk", "", "calendarDate", "deviceId", "timestampGmt", "", "baseline", "actual", "feedback", "trainingFeedback", "sleepHistoryAdjustment", "hrvAdjustment", "napAdjustment", "", "preferredActivityTracker", "displayedForTheDay", "recommendedBedtimeStartMins", "recommendedBedtimeEndMins", "<init>", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "J", "u", "()J", "b", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "getDeviceId", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "s", "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.OCT_KEY_VALUE, "l", "m", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_MODULUS, "o", "p", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f105417q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private final long version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampGmt")
    private final String timestampGmt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseline")
    private final Integer baseline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actual")
    private final Integer actual;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedback")
    private final String feedback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingFeedback")
    private final String trainingFeedback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepHistoryAdjustment")
    private final String sleepHistoryAdjustment;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvAdjustment")
    private final String hrvAdjustment;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napAdjustment")
    private final String napAdjustment;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredActivityTracker")
    private final Boolean preferredActivityTracker;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayedForTheDay")
    private final Boolean displayedForTheDay;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recommendedBedtimeStartMins")
    private final Integer recommendedBedtimeStartMins;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recommendedBedtimeEndMins")
    private final Integer recommendedBedtimeEndMins;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            long j15 = parcel.readLong();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            Integer num = numValueOf2;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf3 = null;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new a0(j8, j14, string, j15, string2, numValueOf, num, string3, string4, string5, string6, string7, boolValueOf, boolValueOf2, numValueOf4, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public /* synthetic */ a0(long j8, long j14, String str, long j15, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Integer num3, Integer num4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? -1L : j14, (i14 & 4) != 0 ? null : str, (i14 & 8) == 0 ? j15 : -1L, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : str6, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : bool, (i14 & 8192) != 0 ? null : bool2, (i14 & 16384) != 0 ? null : num3, (i14 & 32768) != 0 ? null : num4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getActual() {
        return this.actual;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getBaseline() {
        return this.baseline;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.version == a0Var.version && this.userProfilePk == a0Var.userProfilePk && p005kotlin.jvm.internal.s.g(this.calendarDate, a0Var.calendarDate) && this.deviceId == a0Var.deviceId && p005kotlin.jvm.internal.s.g(this.timestampGmt, a0Var.timestampGmt) && p005kotlin.jvm.internal.s.g(this.baseline, a0Var.baseline) && p005kotlin.jvm.internal.s.g(this.actual, a0Var.actual) && p005kotlin.jvm.internal.s.g(this.feedback, a0Var.feedback) && p005kotlin.jvm.internal.s.g(this.trainingFeedback, a0Var.trainingFeedback) && p005kotlin.jvm.internal.s.g(this.sleepHistoryAdjustment, a0Var.sleepHistoryAdjustment) && p005kotlin.jvm.internal.s.g(this.hrvAdjustment, a0Var.hrvAdjustment) && p005kotlin.jvm.internal.s.g(this.napAdjustment, a0Var.napAdjustment) && p005kotlin.jvm.internal.s.g(this.preferredActivityTracker, a0Var.preferredActivityTracker) && p005kotlin.jvm.internal.s.g(this.displayedForTheDay, a0Var.displayedForTheDay) && p005kotlin.jvm.internal.s.g(this.recommendedBedtimeStartMins, a0Var.recommendedBedtimeStartMins) && p005kotlin.jvm.internal.s.g(this.recommendedBedtimeEndMins, a0Var.recommendedBedtimeEndMins);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getDisplayedForTheDay() {
        return this.displayedForTheDay;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFeedback() {
        return this.feedback;
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.version) * 31, 31, this.userProfilePk);
        String str = this.calendarDate;
        int iE2 = q6.f.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.deviceId);
        String str2 = this.timestampGmt;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.baseline;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.actual;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.feedback;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trainingFeedback;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sleepHistoryAdjustment;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hrvAdjustment;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.napAdjustment;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.preferredActivityTracker;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.displayedForTheDay;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.recommendedBedtimeStartMins;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.recommendedBedtimeEndMins;
        return iHashCode11 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getHrvAdjustment() {
        return this.hrvAdjustment;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNapAdjustment() {
        return this.napAdjustment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getPreferredActivityTracker() {
        return this.preferredActivityTracker;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getRecommendedBedtimeEndMins() {
        return this.recommendedBedtimeEndMins;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getRecommendedBedtimeStartMins() {
        return this.recommendedBedtimeStartMins;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSleepHistoryAdjustment() {
        return this.sleepHistoryAdjustment;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTimestampGmt() {
        return this.timestampGmt;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTrainingFeedback() {
        return this.trainingFeedback;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        long j8 = this.version;
        long j14 = this.userProfilePk;
        String str = this.calendarDate;
        long j15 = this.deviceId;
        String str2 = this.timestampGmt;
        Integer num = this.baseline;
        Integer num2 = this.actual;
        String str3 = this.feedback;
        String str4 = this.trainingFeedback;
        String str5 = this.sleepHistoryAdjustment;
        String str6 = this.hrvAdjustment;
        String str7 = this.napAdjustment;
        Boolean bool = this.preferredActivityTracker;
        Boolean bool2 = this.displayedForTheDay;
        Integer num3 = this.recommendedBedtimeStartMins;
        Integer num4 = this.recommendedBedtimeEndMins;
        StringBuilder sbK = ds.e0.k(j8, "SleepNeedDTO(version=", ", userProfilePk=");
        p6.b.k(j14, ", calendarDate=", str, sbK);
        j20.x.j(j15, ", deviceId=", ", timestampGmt=", sbK);
        fb1.c.u(num, str2, ", baseline=", ", actual=", sbK);
        p6.b.l(num2, ", feedback=", str3, ", trainingFeedback=", sbK);
        sn.a.t(sbK, str4, ", sleepHistoryAdjustment=", str5, ", hrvAdjustment=");
        sn.a.t(sbK, str6, ", napAdjustment=", str7, ", preferredActivityTracker=");
        b71.i.o(bool, bool2, ", displayedForTheDay=", ", recommendedBedtimeStartMins=", sbK);
        return b71.i.h(sbK, num3, ", recommendedBedtimeEndMins=", num4, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.version);
        parcel.writeLong(this.userProfilePk);
        parcel.writeString(this.calendarDate);
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.timestampGmt);
        Integer num = this.baseline;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.actual;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.feedback);
        parcel.writeString(this.trainingFeedback);
        parcel.writeString(this.sleepHistoryAdjustment);
        parcel.writeString(this.hrvAdjustment);
        parcel.writeString(this.napAdjustment);
        Boolean bool = this.preferredActivityTracker;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.displayedForTheDay;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Integer num3 = this.recommendedBedtimeStartMins;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.recommendedBedtimeEndMins;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }

    public a0(long j8, long j14, String str, long j15, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Integer num3, Integer num4) {
        this.version = j8;
        this.userProfilePk = j14;
        this.calendarDate = str;
        this.deviceId = j15;
        this.timestampGmt = str2;
        this.baseline = num;
        this.actual = num2;
        this.feedback = str3;
        this.trainingFeedback = str4;
        this.sleepHistoryAdjustment = str5;
        this.hrvAdjustment = str6;
        this.napAdjustment = str7;
        this.preferredActivityTracker = bool;
        this.displayedForTheDay = bool2;
        this.recommendedBedtimeStartMins = num3;
        this.recommendedBedtimeEndMins = num4;
    }

    public a0() {
        this(0L, 0L, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
