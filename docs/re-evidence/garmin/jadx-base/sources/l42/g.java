package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001GBÏ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u00101\"\u0004\b?\u00103R$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$¨\u0006H"}, d2 = {"Ll42/g;", "Landroid/os/Parcelable;", "Ll42/j;", "", "bmi", "", "bmiCount", "bodyFat", "bodyFatCount", "bodyWater", "bodyWaterCount", "boneMass", "boneMassCount", "", Constants.MessagePayloadKeys.FROM, "metabolicAge", "metabolicAgeCount", "muscleMass", "muscleMassCount", "physiqueRating", "physiqueRatingCount", "until", "visceralFat", "visceralFatCount", "weight", "weightCount", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Integer;", "getBmiCount", "()Ljava/lang/Integer;", "setBmiCount", "(Ljava/lang/Integer;)V", "l", "getBodyFatCount", "setBodyFatCount", "m", "getBodyWaterCount", "setBodyWaterCount", JWKParameterNames.RSA_MODULUS, "getBoneMassCount", "setBoneMassCount", "o", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "p", "getMetabolicAgeCount", "setMetabolicAgeCount", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getMuscleMassCount", "setMuscleMassCount", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getPhysiqueRatingCount", "setPhysiqueRatingCount", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getUntil", "setUntil", "v", "getVisceralFatCount", "setVisceralFatCount", "w", "getWeightCount", "setWeightCount", "CREATOR", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends j implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bmiCount")
    private Integer bmiCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyFatCount")
    private Integer bodyFatCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyWaterCount")
    private Integer bodyWaterCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boneMassCount")
    private Integer boneMassCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.MessagePayloadKeys.FROM)
    private String from;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metabolicAgeCount")
    private Integer metabolicAgeCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muscleMassCount")
    private Integer muscleMassCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("physiqueRatingCount")
    private Integer physiqueRatingCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("until")
    private String until;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visceralFatCount")
    private Integer visceralFatCount;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightCount")
    private Integer weightCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Parcel parcel) {
        this(Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), parcel.readString(), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), parcel.readString(), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()));
        parcel.getClass();
    }

    @Override // l42.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // l42.j, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeValue(this.bmiCount);
        parcel.writeValue(this.bodyFatCount);
        parcel.writeValue(this.bodyWaterCount);
        parcel.writeValue(this.boneMassCount);
        parcel.writeString(this.from);
        parcel.writeValue(this.metabolicAgeCount);
        parcel.writeValue(this.muscleMassCount);
        parcel.writeValue(this.physiqueRatingCount);
        parcel.writeString(this.until);
        parcel.writeValue(this.visceralFatCount);
        parcel.writeValue(this.weightCount);
    }

    /* JADX INFO: renamed from: l42.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll42/g$a;", "Landroid/os/Parcelable$Creator;", "Ll42/g;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<g> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }

        private Companion() {
        }
    }

    public g(Double d14, Integer num, Double d15, Integer num2, Double d16, Integer num3, Integer num4, Integer num5, String str, Double d17, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str2, Integer num11, Integer num12, Double d18, Integer num13) {
        super(d14, d15, d16, num4, d17, num7, num9, num11, d18, "MANUAL");
        this.bmiCount = num;
        this.bodyFatCount = num2;
        this.bodyWaterCount = num3;
        this.boneMassCount = num5;
        this.from = str;
        this.metabolicAgeCount = num6;
        this.muscleMassCount = num8;
        this.physiqueRatingCount = num10;
        this.until = str2;
        this.visceralFatCount = num12;
        this.weightCount = num13;
    }
}
