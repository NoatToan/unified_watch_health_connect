package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0093\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Ll42/h;", "Landroid/os/Parcelable;", "Ll42/j;", "", "bmi", "bodyFat", "bodyWater", "", "boneMass", "caloricIntake", "", "date", "metabolicAge", "muscleMass", "physiqueRating", "sourceType", "timestampGMT", "", "version", "visceralFat", "weight", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Integer;", "getCaloricIntake", "()Ljava/lang/Integer;", "setCaloricIntake", "(Ljava/lang/Integer;)V", "l", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "m", "getTimestampGMT", "setTimestampGMT", JWKParameterNames.RSA_MODULUS, "Ljava/lang/Long;", "getVersion", "()Ljava/lang/Long;", "setVersion", "(Ljava/lang/Long;)V", "CREATOR", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends j implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("caloricIntake")
    private Integer caloricIntake;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private String date;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampGMT")
    private String timestampGMT;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private Long version;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        parcel.getClass();
        Double dValueOf = Double.valueOf(parcel.readDouble());
        Double dValueOf2 = Double.valueOf(parcel.readDouble());
        Double dValueOf3 = Double.valueOf(parcel.readDouble());
        Integer numValueOf = Integer.valueOf(parcel.readInt());
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this(dValueOf, dValueOf2, dValueOf3, numValueOf, value instanceof Integer ? (Integer) value : null, parcel.readString(), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), Long.valueOf(parcel.readLong()), Integer.valueOf(parcel.readInt()), Double.valueOf(parcel.readDouble()));
    }

    @Override // l42.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // l42.j, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeValue(this.caloricIntake);
        parcel.writeString(this.date);
        parcel.writeString(getSourceType());
        parcel.writeString(this.timestampGMT);
        parcel.writeValue(this.version);
    }

    /* JADX INFO: renamed from: l42.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll42/h$a;", "Landroid/os/Parcelable$Creator;", "Ll42/h;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<h> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }

        private Companion() {
        }
    }

    public h(Double d14, Double d15, Double d16, Integer num, Integer num2, String str, Double d17, Integer num3, Integer num4, String str2, String str3, Long l14, Integer num5, Double d18) {
        super(d14, d15, d16, num, d17, num3, num4, num5, d18, str2);
        this.caloricIntake = num2;
        this.date = str;
        this.timestampGMT = str3;
        this.version = l14;
    }
}
