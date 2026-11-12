package mm1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmm1/g;", "", "", "weekStartDate", "weekEndDate", "Lmm1/g$a;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmm1/g$a;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lmm1/g$a;", "()Lmm1/g$a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekStartDate")
    private final String weekStartDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekEndDate")
    private final String weekEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final a values;

    public /* synthetic */ g(String str, String str2, a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWeekEndDate() {
        return this.weekEndDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWeekStartDate() {
        return this.weekStartDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.weekStartDate, gVar.weekStartDate) && s.g(this.weekEndDate, gVar.weekEndDate) && s.g(this.values, gVar.values);
    }

    public final int hashCode() {
        String str = this.weekStartDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.weekEndDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.values;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.weekStartDate;
        String str2 = this.weekEndDate;
        a aVar = this.values;
        StringBuilder sbI = p6.b.i("WeeklySleepSummaryValueDTO(weekStartDate=", str, ", weekEndDate=", str2, ", values=");
        sbI.append(aVar);
        sbI.append(")");
        return sbI.toString();
    }

    public g(String str, String str2, a aVar) {
        this.weekStartDate = str;
        this.weekEndDate = str2;
        this.values = aVar;
    }

    public g() {
        this(null, null, null, 7, null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lmm1/g$a;", "Landroid/os/Parcelable;", "", "averageLocalSleepStartTime", "averageLocalSleepEndTime", "", "averageSleepNeed", "averageSleepScore", "averageSleepSeconds", "awakeTime", "deepTime", "lightTime", "remTime", "sleepDataDaysCount", "", "sleepScoreQuality", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "g", JWKParameterNames.RSA_EXPONENT, "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "m", "getSleepDataDaysCount", "Ljava/lang/String;", "getSleepScoreQuality", "()Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2272a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageLocalSleepStartTime")
        private final Double averageLocalSleepStartTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageLocalSleepEndTime")
        private final Double averageLocalSleepEndTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageSleepNeed")
        private final Integer averageSleepNeed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageSleepScore")
        private final Integer averageSleepScore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageSleepSeconds")
        private final Double averageSleepSeconds;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("awakeTime")
        private final Integer awakeTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("deepTime")
        private final Integer deepTime;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("lightTime")
        private final Integer lightTime;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("remTime")
        private final Integer remTime;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepDataDaysCount")
        private final Integer sleepDataDaysCount;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepScoreQuality")
        private final String sleepScoreQuality;

        /* JADX INFO: renamed from: mm1.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2272a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public /* synthetic */ a(Double d14, Double d15, Integer num, Integer num2, Double d16, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : num4, (i14 & 128) != 0 ? null : num5, (i14 & 256) != 0 ? null : num6, (i14 & 512) != 0 ? null : num7, (i14 & 1024) != 0 ? null : str);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getAverageLocalSleepEndTime() {
            return this.averageLocalSleepEndTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getAverageLocalSleepStartTime() {
            return this.averageLocalSleepStartTime;
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
            return s.g(this.averageLocalSleepStartTime, aVar.averageLocalSleepStartTime) && s.g(this.averageLocalSleepEndTime, aVar.averageLocalSleepEndTime) && s.g(this.averageSleepNeed, aVar.averageSleepNeed) && s.g(this.averageSleepScore, aVar.averageSleepScore) && s.g(this.averageSleepSeconds, aVar.averageSleepSeconds) && s.g(this.awakeTime, aVar.awakeTime) && s.g(this.deepTime, aVar.deepTime) && s.g(this.lightTime, aVar.lightTime) && s.g(this.remTime, aVar.remTime) && s.g(this.sleepDataDaysCount, aVar.sleepDataDaysCount) && s.g(this.sleepScoreQuality, aVar.sleepScoreQuality);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getAverageSleepNeed() {
            return this.averageSleepNeed;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getAverageSleepScore() {
            return this.averageSleepScore;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Double getAverageSleepSeconds() {
            return this.averageSleepSeconds;
        }

        public final int hashCode() {
            Double d14 = this.averageLocalSleepStartTime;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.averageLocalSleepEndTime;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Integer num = this.averageSleepNeed;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.averageSleepScore;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d16 = this.averageSleepSeconds;
            int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Integer num3 = this.awakeTime;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.deepTime;
            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.lightTime;
            int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.remTime;
            int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.sleepDataDaysCount;
            int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
            String str = this.sleepScoreQuality;
            return iHashCode10 + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getAwakeTime() {
            return this.awakeTime;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getDeepTime() {
            return this.deepTime;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Integer getLightTime() {
            return this.lightTime;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Integer getRemTime() {
            return this.remTime;
        }

        public final String toString() {
            Double d14 = this.averageLocalSleepStartTime;
            Double d15 = this.averageLocalSleepEndTime;
            Integer num = this.averageSleepNeed;
            Integer num2 = this.averageSleepScore;
            Double d16 = this.averageSleepSeconds;
            Integer num3 = this.awakeTime;
            Integer num4 = this.deepTime;
            Integer num5 = this.lightTime;
            Integer num6 = this.remTime;
            Integer num7 = this.sleepDataDaysCount;
            String str = this.sleepScoreQuality;
            StringBuilder sbI = k.i("Values(averageLocalSleepStartTime=", d14, d15, ", averageLocalSleepEndTime=", ", averageSleepNeed=");
            x.m(sbI, num, ", averageSleepScore=", num2, ", averageSleepSeconds=");
            i.t(sbI, d16, ", awakeTime=", num3, ", deepTime=");
            x.m(sbI, num4, ", lightTime=", num5, ", remTime=");
            x.m(sbI, num6, ", sleepDataDaysCount=", num7, ", sleepScoreQuality=");
            return am.j.o(str, ")", sbI);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Double d14 = this.averageLocalSleepStartTime;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.averageLocalSleepEndTime;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
            Integer num = this.averageSleepNeed;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Integer num2 = this.averageSleepScore;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            Double d16 = this.averageSleepSeconds;
            if (d16 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d16);
            }
            Integer num3 = this.awakeTime;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num3);
            }
            Integer num4 = this.deepTime;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num4);
            }
            Integer num5 = this.lightTime;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num5);
            }
            Integer num6 = this.remTime;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num6);
            }
            Integer num7 = this.sleepDataDaysCount;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num7);
            }
            parcel.writeString(this.sleepScoreQuality);
        }

        public a(Double d14, Double d15, Integer num, Integer num2, Double d16, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str) {
            this.averageLocalSleepStartTime = d14;
            this.averageLocalSleepEndTime = d15;
            this.averageSleepNeed = num;
            this.averageSleepScore = num2;
            this.averageSleepSeconds = d16;
            this.awakeTime = num3;
            this.deepTime = num4;
            this.lightTime = num5;
            this.remTime = num6;
            this.sleepDataDaysCount = num7;
            this.sleepScoreQuality = str;
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }
    }
}
