package pw;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b!\u0010,\"\u0004\b6\u0010.R(\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010\u0013\u0012\u0004\b:\u0010;\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R$\u0010C\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lpw/a;", "Landroid/os/Parcelable;", "", "version", "", "systolic", "diastolic", "pulse", "", "multiMeasurement", "", "notes", "sourceType", "measurementTimestampLocal", "measurementTimestampGmt", "categoryName", "<init>", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "J", "m", "()J", "setVersion", "(J)V", "b", "Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "setSystolic", "(Ljava/lang/Double;)V", "c", "f", "setDiastolic", "d", "h", "setPulse", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "getMultiMeasurement", "()Ljava/lang/Boolean;", "setMultiMeasurement", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;)V", "getSourceType", "s", "getMeasurementTimestampLocal", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getMeasurementTimestampGmt", "o", "j", "setCategoryName", JWKParameterNames.OCT_KEY_VALUE, "getLastUpdated", "setLastUpdated", "getLastUpdated$annotations", "()V", "lastUpdated", "l", "Ljava/lang/Long;", "getDateInMillis", "()Ljava/lang/Long;", "setDateInMillis", "(Ljava/lang/Long;)V", "dateInMillis", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f141687m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private long version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("systolic")
    private Double systolic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diastolic")
    private Double diastolic;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pulse")
    private Double pulse;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiMeasurement")
    private Boolean multiMeasurement;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private String notes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceType")
    private String sourceType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementTimestampLocal")
    private String measurementTimestampLocal;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementTimestampGMT")
    private String measurementTimestampGmt;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categoryName")
    private String categoryName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private long lastUpdated;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Long dateInMillis;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            Boolean boolValueOf = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(j8, dValueOf, dValueOf2, dValueOf3, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C2657a(null);
        CREATOR = new b();
        f141687m = 8;
    }

    public /* synthetic */ a(long j8, Double d14, Double d15, Double d16, Boolean bool, String str, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5);
    }

    public static a b(a aVar, Double d14, Double d15, Double d16, String str, int i14) {
        long j8 = aVar.version;
        if ((i14 & 2) != 0) {
            d14 = aVar.systolic;
        }
        Double d17 = d14;
        if ((i14 & 4) != 0) {
            d15 = aVar.diastolic;
        }
        Double d18 = d15;
        if ((i14 & 8) != 0) {
            d16 = aVar.pulse;
        }
        Double d19 = d16;
        Boolean bool = aVar.multiMeasurement;
        String str2 = (i14 & 32) != 0 ? aVar.notes : str;
        String str3 = aVar.sourceType;
        String str4 = aVar.measurementTimestampLocal;
        String str5 = aVar.measurementTimestampGmt;
        String str6 = aVar.categoryName;
        aVar.getClass();
        return new a(j8, d17, d18, d19, bool, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
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
        return this.version == aVar.version && s.g(this.systolic, aVar.systolic) && s.g(this.diastolic, aVar.diastolic) && s.g(this.pulse, aVar.pulse) && s.g(this.multiMeasurement, aVar.multiMeasurement) && s.g(this.notes, aVar.notes) && s.g(this.sourceType, aVar.sourceType) && s.g(this.measurementTimestampLocal, aVar.measurementTimestampLocal) && s.g(this.measurementTimestampGmt, aVar.measurementTimestampGmt) && s.g(this.categoryName, aVar.categoryName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getPulse() {
        return this.pulse;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.version) * 31;
        Double d14 = this.systolic;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.diastolic;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.pulse;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Boolean bool = this.multiMeasurement;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.notes;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceType;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.measurementTimestampLocal;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.measurementTimestampGmt;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.categoryName;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getSystolic() {
        return this.systolic;
    }

    public final long j() {
        DateTime dateTimeQ;
        String str = this.measurementTimestampGmt;
        if (str == null || (dateTimeQ = k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC)) == null) {
            return 0L;
        }
        return dateTimeQ.getMillis();
    }

    public final long k() {
        return new DateTime(j(), DateTimeZone.getDefault()).getMillis();
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final void o(String str) {
        this.measurementTimestampGmt = str;
    }

    public final void q(String str) {
        this.measurementTimestampLocal = str;
    }

    public final void r(String str) {
        this.notes = str;
    }

    public final void s() {
        this.sourceType = "MANUAL";
    }

    public final String toString() {
        long j8 = this.version;
        Double d14 = this.systolic;
        Double d15 = this.diastolic;
        Double d16 = this.pulse;
        Boolean bool = this.multiMeasurement;
        String str = this.notes;
        String str2 = this.sourceType;
        String str3 = this.measurementTimestampLocal;
        String str4 = this.measurementTimestampGmt;
        String str5 = this.categoryName;
        StringBuilder sb3 = new StringBuilder("BloodPressureDTO(version=");
        sb3.append(j8);
        sb3.append(", systolic=");
        sb3.append(d14);
        sn.a.p(d15, d16, ", diastolic=", ", pulse=", sb3);
        sb3.append(", multiMeasurement=");
        sb3.append(bool);
        sb3.append(", notes=");
        sb3.append(str);
        sn.a.t(sb3, ", sourceType=", str2, ", measurementTimestampLocal=", str3);
        sn.a.t(sb3, ", measurementTimestampGmt=", str4, ", categoryName=", str5);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.version);
        Double d14 = this.systolic;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.diastolic;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.pulse;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Boolean bool = this.multiMeasurement;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.notes);
        parcel.writeString(this.sourceType);
        parcel.writeString(this.measurementTimestampLocal);
        parcel.writeString(this.measurementTimestampGmt);
        parcel.writeString(this.categoryName);
    }

    /* JADX INFO: renamed from: pw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpw/a$a;", "", "<init>", "()V", "", "DATE_FORMAT", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2657a {
        public /* synthetic */ C2657a(j jVar) {
            this();
        }

        private C2657a() {
        }
    }

    public a(long j8, Double d14, Double d15, Double d16, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.version = j8;
        this.systolic = d14;
        this.diastolic = d15;
        this.pulse = d16;
        this.multiMeasurement = bool;
        this.notes = str;
        this.sourceType = str2;
        this.measurementTimestampLocal = str3;
        this.measurementTimestampGmt = str4;
        this.categoryName = str5;
    }

    public a() {
        this(0L, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
