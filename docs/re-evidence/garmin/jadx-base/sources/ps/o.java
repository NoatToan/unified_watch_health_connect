package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lps/o;", "Landroid/os/Parcelable;", "", "activityId", "", "maxAvgPower1", "maxAvgPower2", "maxAvgPower5", "maxAvgPower10", "maxAvgPower20", "maxAvgPower30", "maxAvgPower60", "maxAvgPower120", "maxAvgPower300", "maxAvgPower600", "maxAvgPower1200", "maxAvgPower1800", "maxAvgPower3600", "maxAvgPower7200", "maxAvgPower18000", "", "excludeFromPowerCurveReports", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getActivityId", "()Ljava/lang/Long;", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "c", JWKParameterNames.OCT_KEY_VALUE, "s", JWKParameterNames.RSA_EXPONENT, "f", "m", "g", "o", "h", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "u", "l", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "p", "Ljava/lang/Boolean;", "getExcludeFromPowerCurveReports", "()Ljava/lang/Boolean;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_1")
    private final Double maxAvgPower1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_2")
    private final Double maxAvgPower2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_5")
    private final Double maxAvgPower5;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_10")
    private final Double maxAvgPower10;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_20")
    private final Double maxAvgPower20;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_30")
    private final Double maxAvgPower30;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_60")
    private final Double maxAvgPower60;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_120")
    private final Double maxAvgPower120;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_300")
    private final Double maxAvgPower300;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_600")
    private final Double maxAvgPower600;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_1200")
    private final Double maxAvgPower1200;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_1800")
    private final Double maxAvgPower1800;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_3600")
    private final Double maxAvgPower3600;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_7200")
    private final Double maxAvgPower7200;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxAvgPower_18000")
    private final Double maxAvgPower18000;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excludeFromPowerCurveReports")
    private final Boolean excludeFromPowerCurveReports;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf11 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf12 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf13 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf14 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf15 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new o(lValueOf, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, dValueOf9, dValueOf10, dValueOf11, dValueOf12, dValueOf13, dValueOf14, dValueOf15, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(Long l14, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Boolean bool) {
        this.activityId = l14;
        this.maxAvgPower1 = d14;
        this.maxAvgPower2 = d15;
        this.maxAvgPower5 = d16;
        this.maxAvgPower10 = d17;
        this.maxAvgPower20 = d18;
        this.maxAvgPower30 = d19;
        this.maxAvgPower60 = d24;
        this.maxAvgPower120 = d25;
        this.maxAvgPower300 = d26;
        this.maxAvgPower600 = d27;
        this.maxAvgPower1200 = d28;
        this.maxAvgPower1800 = d29;
        this.maxAvgPower3600 = d34;
        this.maxAvgPower7200 = d35;
        this.maxAvgPower18000 = d36;
        this.excludeFromPowerCurveReports = bool;
    }

    public static o b(o oVar, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36) {
        Long l14 = oVar.activityId;
        Boolean bool = oVar.excludeFromPowerCurveReports;
        oVar.getClass();
        return new o(l14, d14, d15, d16, d17, d18, d19, d24, d25, d26, d27, d28, d29, d34, d35, d36, bool);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getMaxAvgPower1() {
        return this.maxAvgPower1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, oVar.activityId) && p005kotlin.jvm.internal.s.g(this.maxAvgPower1, oVar.maxAvgPower1) && p005kotlin.jvm.internal.s.g(this.maxAvgPower2, oVar.maxAvgPower2) && p005kotlin.jvm.internal.s.g(this.maxAvgPower5, oVar.maxAvgPower5) && p005kotlin.jvm.internal.s.g(this.maxAvgPower10, oVar.maxAvgPower10) && p005kotlin.jvm.internal.s.g(this.maxAvgPower20, oVar.maxAvgPower20) && p005kotlin.jvm.internal.s.g(this.maxAvgPower30, oVar.maxAvgPower30) && p005kotlin.jvm.internal.s.g(this.maxAvgPower60, oVar.maxAvgPower60) && p005kotlin.jvm.internal.s.g(this.maxAvgPower120, oVar.maxAvgPower120) && p005kotlin.jvm.internal.s.g(this.maxAvgPower300, oVar.maxAvgPower300) && p005kotlin.jvm.internal.s.g(this.maxAvgPower600, oVar.maxAvgPower600) && p005kotlin.jvm.internal.s.g(this.maxAvgPower1200, oVar.maxAvgPower1200) && p005kotlin.jvm.internal.s.g(this.maxAvgPower1800, oVar.maxAvgPower1800) && p005kotlin.jvm.internal.s.g(this.maxAvgPower3600, oVar.maxAvgPower3600) && p005kotlin.jvm.internal.s.g(this.maxAvgPower7200, oVar.maxAvgPower7200) && p005kotlin.jvm.internal.s.g(this.maxAvgPower18000, oVar.maxAvgPower18000) && p005kotlin.jvm.internal.s.g(this.excludeFromPowerCurveReports, oVar.excludeFromPowerCurveReports);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMaxAvgPower10() {
        return this.maxAvgPower10;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMaxAvgPower120() {
        return this.maxAvgPower120;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getMaxAvgPower1200() {
        return this.maxAvgPower1200;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Double d14 = this.maxAvgPower1;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.maxAvgPower2;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.maxAvgPower5;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.maxAvgPower10;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.maxAvgPower20;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.maxAvgPower30;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.maxAvgPower60;
        int iHashCode8 = (iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.maxAvgPower120;
        int iHashCode9 = (iHashCode8 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.maxAvgPower300;
        int iHashCode10 = (iHashCode9 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.maxAvgPower600;
        int iHashCode11 = (iHashCode10 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.maxAvgPower1200;
        int iHashCode12 = (iHashCode11 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.maxAvgPower1800;
        int iHashCode13 = (iHashCode12 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.maxAvgPower3600;
        int iHashCode14 = (iHashCode13 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.maxAvgPower7200;
        int iHashCode15 = (iHashCode14 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.maxAvgPower18000;
        int iHashCode16 = (iHashCode15 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Boolean bool = this.excludeFromPowerCurveReports;
        return iHashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getMaxAvgPower1800() {
        return this.maxAvgPower1800;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getMaxAvgPower18000() {
        return this.maxAvgPower18000;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getMaxAvgPower2() {
        return this.maxAvgPower2;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getMaxAvgPower20() {
        return this.maxAvgPower20;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getMaxAvgPower30() {
        return this.maxAvgPower30;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getMaxAvgPower300() {
        return this.maxAvgPower300;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getMaxAvgPower3600() {
        return this.maxAvgPower3600;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Double getMaxAvgPower5() {
        return this.maxAvgPower5;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getMaxAvgPower60() {
        return this.maxAvgPower60;
    }

    public final String toString() {
        Long l14 = this.activityId;
        Double d14 = this.maxAvgPower1;
        Double d15 = this.maxAvgPower2;
        Double d16 = this.maxAvgPower5;
        Double d17 = this.maxAvgPower10;
        Double d18 = this.maxAvgPower20;
        Double d19 = this.maxAvgPower30;
        Double d24 = this.maxAvgPower60;
        Double d25 = this.maxAvgPower120;
        Double d26 = this.maxAvgPower300;
        Double d27 = this.maxAvgPower600;
        Double d28 = this.maxAvgPower1200;
        Double d29 = this.maxAvgPower1800;
        Double d34 = this.maxAvgPower3600;
        Double d35 = this.maxAvgPower7200;
        Double d36 = this.maxAvgPower18000;
        Boolean bool = this.excludeFromPowerCurveReports;
        StringBuilder sb3 = new StringBuilder("ActivityPowerCurveDTO(activityId=");
        sb3.append(l14);
        sb3.append(", maxAvgPower1=");
        sb3.append(d14);
        sb3.append(", maxAvgPower2=");
        b71.i.p(d15, d16, ", maxAvgPower5=", ", maxAvgPower10=", sb3);
        b71.i.p(d17, d18, ", maxAvgPower20=", ", maxAvgPower30=", sb3);
        b71.i.p(d19, d24, ", maxAvgPower60=", ", maxAvgPower120=", sb3);
        b71.i.p(d25, d26, ", maxAvgPower300=", ", maxAvgPower600=", sb3);
        b71.i.p(d27, d28, ", maxAvgPower1200=", ", maxAvgPower1800=", sb3);
        b71.i.p(d29, d34, ", maxAvgPower3600=", ", maxAvgPower7200=", sb3);
        b71.i.p(d35, d36, ", maxAvgPower18000=", ", excludeFromPowerCurveReports=", sb3);
        return p6.b.f(sb3, bool, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getMaxAvgPower600() {
        return this.maxAvgPower600;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d14 = this.maxAvgPower1;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.maxAvgPower2;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.maxAvgPower5;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.maxAvgPower10;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.maxAvgPower20;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.maxAvgPower30;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.maxAvgPower60;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.maxAvgPower120;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.maxAvgPower300;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.maxAvgPower600;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.maxAvgPower1200;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.maxAvgPower1800;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Double d34 = this.maxAvgPower3600;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.maxAvgPower7200;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Double d36 = this.maxAvgPower18000;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Boolean bool = this.excludeFromPowerCurveReports;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Double getMaxAvgPower7200() {
        return this.maxAvgPower7200;
    }
}
