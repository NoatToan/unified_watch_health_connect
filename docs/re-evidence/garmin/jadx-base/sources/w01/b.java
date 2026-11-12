package w01;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import c22.t;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b!\u00104R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001d\u00107R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b8\u00107R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b'\u00107¨\u00069"}, d2 = {"Lw01/b;", "Landroid/os/Parcelable;", "", "metricHydrationTotalValueInML", "metricNutritionTotalValueLowInGrams", "metricNutritionTotalValueHighInGrams", "", "metricIntervalInSeconds", "metricHydrationIntervalValueInML", "metricNutritionIntervalValueLowInGrams", "metricNutritionIntervalValueHighInGrams", "statuteHydrationTotalValueInOz", "statuteNutritionTotalValueLowInGrams", "statuteNutritionTotalValueHighInGrams", "statuteIntervalInSeconds", "statuteHydrationIntervalValueInOz", "statuteNutritionIntervalValueLowInGrams", "statuteNutritionIntervalValueHighInGrams", "", "feedbackPhraseKey", "effortMaxDurationInHours", "temperatureCelsius", "heatIndexTemperatureCelsius", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DDD)V", "a", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "b", "o", "c", "m", "d", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "g", "f", JWKParameterNames.OCT_KEY_VALUE, "j", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "z", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "s", "l", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "u", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/lang/String;", "()Ljava/lang/String;", "p", "D", "()D", "A", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricHydrationTotalValueInML")
    private final Double metricHydrationTotalValueInML;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricNutritionTotalValueLowInGrams")
    private final Double metricNutritionTotalValueLowInGrams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricNutritionTotalValueHighInGrams")
    private final Double metricNutritionTotalValueHighInGrams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricIntervalInSeconds")
    private final Integer metricIntervalInSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricHydrationIntervalValueInML")
    private final Double metricHydrationIntervalValueInML;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricNutritionIntervalValueLowInGrams")
    private final Double metricNutritionIntervalValueLowInGrams;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricNutritionIntervalValueHighInGrams")
    private final Double metricNutritionIntervalValueHighInGrams;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteHydrationTotalValueInOz")
    private final Double statuteHydrationTotalValueInOz;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteNutritionTotalValueLowInGrams")
    private final Double statuteNutritionTotalValueLowInGrams;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteNutritionTotalValueHighInGrams")
    private final Double statuteNutritionTotalValueHighInGrams;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteIntervalInSeconds")
    private final Integer statuteIntervalInSeconds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteHydrationIntervalValueInOz")
    private final Double statuteHydrationIntervalValueInOz;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteNutritionIntervalValueLowInGrams")
    private final Double statuteNutritionIntervalValueLowInGrams;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuteNutritionIntervalValueHighInGrams")
    private final Double statuteNutritionIntervalValueHighInGrams;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackPhraseKey")
    private final String feedbackPhraseKey;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("effortMaxDurationInHours")
    private final double effortMaxDurationInHours;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("temperatureCelsius")
    private final double temperatureCelsius;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heatIndexTemperatureCelsius")
    private final double heatIndexTemperatureCelsius;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Double d14, Double d15, Double d16, Integer num, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Integer num2, Double d27, Double d28, Double d29, String str, double d34, double d35, double d36) {
        str.getClass();
        this.metricHydrationTotalValueInML = d14;
        this.metricNutritionTotalValueLowInGrams = d15;
        this.metricNutritionTotalValueHighInGrams = d16;
        this.metricIntervalInSeconds = num;
        this.metricHydrationIntervalValueInML = d17;
        this.metricNutritionIntervalValueLowInGrams = d18;
        this.metricNutritionIntervalValueHighInGrams = d19;
        this.statuteHydrationTotalValueInOz = d24;
        this.statuteNutritionTotalValueLowInGrams = d25;
        this.statuteNutritionTotalValueHighInGrams = d26;
        this.statuteIntervalInSeconds = num2;
        this.statuteHydrationIntervalValueInOz = d27;
        this.statuteNutritionIntervalValueLowInGrams = d28;
        this.statuteNutritionIntervalValueHighInGrams = d29;
        this.feedbackPhraseKey = str;
        this.effortMaxDurationInHours = d34;
        this.temperatureCelsius = d35;
        this.heatIndexTemperatureCelsius = d36;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getEffortMaxDurationInHours() {
        return this.effortMaxDurationInHours;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFeedbackPhraseKey() {
        return this.feedbackPhraseKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.metricHydrationTotalValueInML, bVar.metricHydrationTotalValueInML) && s.g(this.metricNutritionTotalValueLowInGrams, bVar.metricNutritionTotalValueLowInGrams) && s.g(this.metricNutritionTotalValueHighInGrams, bVar.metricNutritionTotalValueHighInGrams) && s.g(this.metricIntervalInSeconds, bVar.metricIntervalInSeconds) && s.g(this.metricHydrationIntervalValueInML, bVar.metricHydrationIntervalValueInML) && s.g(this.metricNutritionIntervalValueLowInGrams, bVar.metricNutritionIntervalValueLowInGrams) && s.g(this.metricNutritionIntervalValueHighInGrams, bVar.metricNutritionIntervalValueHighInGrams) && s.g(this.statuteHydrationTotalValueInOz, bVar.statuteHydrationTotalValueInOz) && s.g(this.statuteNutritionTotalValueLowInGrams, bVar.statuteNutritionTotalValueLowInGrams) && s.g(this.statuteNutritionTotalValueHighInGrams, bVar.statuteNutritionTotalValueHighInGrams) && s.g(this.statuteIntervalInSeconds, bVar.statuteIntervalInSeconds) && s.g(this.statuteHydrationIntervalValueInOz, bVar.statuteHydrationIntervalValueInOz) && s.g(this.statuteNutritionIntervalValueLowInGrams, bVar.statuteNutritionIntervalValueLowInGrams) && s.g(this.statuteNutritionIntervalValueHighInGrams, bVar.statuteNutritionIntervalValueHighInGrams) && s.g(this.feedbackPhraseKey, bVar.feedbackPhraseKey) && Double.compare(this.effortMaxDurationInHours, bVar.effortMaxDurationInHours) == 0 && Double.compare(this.temperatureCelsius, bVar.temperatureCelsius) == 0 && Double.compare(this.heatIndexTemperatureCelsius, bVar.heatIndexTemperatureCelsius) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getHeatIndexTemperatureCelsius() {
        return this.heatIndexTemperatureCelsius;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMetricHydrationIntervalValueInML() {
        return this.metricHydrationIntervalValueInML;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getMetricHydrationTotalValueInML() {
        return this.metricHydrationTotalValueInML;
    }

    public final int hashCode() {
        Double d14 = this.metricHydrationTotalValueInML;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.metricNutritionTotalValueLowInGrams;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.metricNutritionTotalValueHighInGrams;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.metricIntervalInSeconds;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d17 = this.metricHydrationIntervalValueInML;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.metricNutritionIntervalValueLowInGrams;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.metricNutritionIntervalValueHighInGrams;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.statuteHydrationTotalValueInOz;
        int iHashCode8 = (iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.statuteNutritionTotalValueLowInGrams;
        int iHashCode9 = (iHashCode8 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.statuteNutritionTotalValueHighInGrams;
        int iHashCode10 = (iHashCode9 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Integer num2 = this.statuteIntervalInSeconds;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d27 = this.statuteHydrationIntervalValueInOz;
        int iHashCode12 = (iHashCode11 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.statuteNutritionIntervalValueLowInGrams;
        int iHashCode13 = (iHashCode12 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.statuteNutritionIntervalValueHighInGrams;
        return Double.hashCode(this.heatIndexTemperatureCelsius) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(g.j((iHashCode13 + (d29 != null ? d29.hashCode() : 0)) * 31, 31, this.feedbackPhraseKey), 31, this.effortMaxDurationInHours), 31, this.temperatureCelsius);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getMetricIntervalInSeconds() {
        return this.metricIntervalInSeconds;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getMetricNutritionIntervalValueHighInGrams() {
        return this.metricNutritionIntervalValueHighInGrams;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getMetricNutritionIntervalValueLowInGrams() {
        return this.metricNutritionIntervalValueLowInGrams;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getMetricNutritionTotalValueHighInGrams() {
        return this.metricNutritionTotalValueHighInGrams;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getMetricNutritionTotalValueLowInGrams() {
        return this.metricNutritionTotalValueLowInGrams;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getStatuteHydrationIntervalValueInOz() {
        return this.statuteHydrationIntervalValueInOz;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getStatuteHydrationTotalValueInOz() {
        return this.statuteHydrationTotalValueInOz;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getStatuteIntervalInSeconds() {
        return this.statuteIntervalInSeconds;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getStatuteNutritionIntervalValueHighInGrams() {
        return this.statuteNutritionIntervalValueHighInGrams;
    }

    public final String toString() {
        Double d14 = this.metricHydrationTotalValueInML;
        Double d15 = this.metricNutritionTotalValueLowInGrams;
        Double d16 = this.metricNutritionTotalValueHighInGrams;
        Integer num = this.metricIntervalInSeconds;
        Double d17 = this.metricHydrationIntervalValueInML;
        Double d18 = this.metricNutritionIntervalValueLowInGrams;
        Double d19 = this.metricNutritionIntervalValueHighInGrams;
        Double d24 = this.statuteHydrationTotalValueInOz;
        Double d25 = this.statuteNutritionTotalValueLowInGrams;
        Double d26 = this.statuteNutritionTotalValueHighInGrams;
        Integer num2 = this.statuteIntervalInSeconds;
        Double d27 = this.statuteHydrationIntervalValueInOz;
        Double d28 = this.statuteNutritionIntervalValueLowInGrams;
        Double d29 = this.statuteNutritionIntervalValueHighInGrams;
        String str = this.feedbackPhraseKey;
        double d34 = this.effortMaxDurationInHours;
        double d35 = this.temperatureCelsius;
        double d36 = this.heatIndexTemperatureCelsius;
        StringBuilder sbI = k.i("NutritionAndHydrationDTO(metricHydrationTotalValueInML=", d14, d15, ", metricNutritionTotalValueLowInGrams=", ", metricNutritionTotalValueHighInGrams=");
        i.t(sbI, d16, ", metricIntervalInSeconds=", num, ", metricHydrationIntervalValueInML=");
        i.p(d17, d18, ", metricNutritionIntervalValueLowInGrams=", ", metricNutritionIntervalValueHighInGrams=", sbI);
        i.p(d19, d24, ", statuteHydrationTotalValueInOz=", ", statuteNutritionTotalValueLowInGrams=", sbI);
        i.p(d25, d26, ", statuteNutritionTotalValueHighInGrams=", ", statuteIntervalInSeconds=", sbI);
        i.v(sbI, num2, ", statuteHydrationIntervalValueInOz=", d27, ", statuteNutritionIntervalValueLowInGrams=");
        i.p(d28, d29, ", statuteNutritionIntervalValueHighInGrams=", ", feedbackPhraseKey=", sbI);
        sbI.append(str);
        sbI.append(", effortMaxDurationInHours=");
        sbI.append(d34);
        j.x(sbI, ", temperatureCelsius=", d35, ", heatIndexTemperatureCelsius=");
        return t.d(d36, ")", sbI);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getStatuteNutritionIntervalValueLowInGrams() {
        return this.statuteNutritionIntervalValueLowInGrams;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.metricHydrationTotalValueInML;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.metricNutritionTotalValueLowInGrams;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.metricNutritionTotalValueHighInGrams;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Integer num = this.metricIntervalInSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d17 = this.metricHydrationIntervalValueInML;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.metricNutritionIntervalValueLowInGrams;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.metricNutritionIntervalValueHighInGrams;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.statuteHydrationTotalValueInOz;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.statuteNutritionTotalValueLowInGrams;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.statuteNutritionTotalValueHighInGrams;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Integer num2 = this.statuteIntervalInSeconds;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Double d27 = this.statuteHydrationIntervalValueInOz;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.statuteNutritionIntervalValueLowInGrams;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.statuteNutritionIntervalValueHighInGrams;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        parcel.writeString(this.feedbackPhraseKey);
        parcel.writeDouble(this.effortMaxDurationInHours);
        parcel.writeDouble(this.temperatureCelsius);
        parcel.writeDouble(this.heatIndexTemperatureCelsius);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Double getStatuteNutritionTotalValueHighInGrams() {
        return this.statuteNutritionTotalValueHighInGrams;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Double getStatuteNutritionTotalValueLowInGrams() {
        return this.statuteNutritionTotalValueLowInGrams;
    }
}
