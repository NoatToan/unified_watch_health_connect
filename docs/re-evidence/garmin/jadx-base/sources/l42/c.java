package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u009b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Ll42/c;", "Landroid/os/Parcelable;", "Ll42/j;", "", "bmi", "bodyFat", "bodyWater", "", "boneMass", "", "calendarDate", "date", "metabolicAge", "muscleMass", "physiqueRating", "", "samplePk", "sourceType", "timestampGmt", "visceralFat", "weight", "weightDelta", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "l", "getDate", "m", "J", "()J", JWKParameterNames.RSA_MODULUS, "o", "Ljava/lang/Double;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Double;", "CREATOR", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f109921p = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("samplePk")
    private final long samplePk;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampGMT")
    private final String timestampGmt;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightDelta")
    private final Double weightDelta;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        this(Double.valueOf(parcel.readDouble()), Double.valueOf(parcel.readDouble()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readString(), parcel.readString(), Integer.valueOf(parcel.readInt()), Double.valueOf(parcel.readDouble()), Double.valueOf(parcel.readDouble()));
        parcel.getClass();
    }

    @Override // l42.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getSamplePk() {
        return this.samplePk;
    }

    public final long m() {
        try {
            String str = this.timestampGmt;
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (NumberFormatException e4) {
            String strN = fb1.c.n("getTimestampGmt() - date is not a timestamp: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "DateWeightDTO", strN);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTimestampGmt() {
        return this.timestampGmt;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getWeightDelta() {
        return this.weightDelta;
    }

    @Override // l42.j, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.date);
        parcel.writeLong(this.samplePk);
        parcel.writeString(getSourceType());
        parcel.writeString(this.timestampGmt);
        parcel.writeValue(this.weightDelta);
    }

    /* JADX INFO: renamed from: l42.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll42/c$a;", "Landroid/os/Parcelable$Creator;", "Ll42/c;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<c> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }

        private Companion() {
        }
    }

    public c(Double d14, Double d15, Double d16, Integer num, String str, String str2, Double d17, Integer num2, Integer num3, long j8, String str3, String str4, Integer num4, Double d18, Double d19) {
        super(d14, d15, d16, num, d17, num2, num3, num4, d18, str3);
        this.calendarDate = str;
        this.date = str2;
        this.samplePk = j8;
        this.timestampGmt = str4;
        this.weightDelta = d19;
    }
}
