package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import ps.u0;
import ps.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\bB\u0010AR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\bD\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bE\u0010AR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bF\u0010AR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bI\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010AR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010AR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bS\u0010AR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\b7\u0010AR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u00100\u001a\u0004\bU\u00102R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u00106R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010?\u001a\u0004\bY\u0010AR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00100\u001a\u0004\bZ\u00102R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\b[\u0010/R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010-\u001a\u0004\b\\\u0010/R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u00104\u001a\u0004\b^\u00106R\u001c\u0010#\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\b_\u0010AR\u001c\u0010$\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010?\u001a\u0004\bQ\u0010AR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010-\u001a\u0004\bb\u0010/R\u001c\u0010&\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bc\u0010AR\u001c\u0010'\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010?\u001a\u0004\b`\u0010A¨\u0006d"}, d2 = {"Lgs1/b;", "Landroid/os/Parcelable;", "", "activeSets", "", "activityId", "", "activityName", "Lgs1/c;", "activityType", "", "atpActivity", "", "averageHeartRate", "averageRespirationRate", "bottomTime", "calories", "distance", "duration", "floorsClimbed", "lapCount", "maxDepth", "Lps/u0;", "maxGradeValue", "maxSpeed", "maxSplitDistance", "maxDistanceWithPrecision", "activeSplitSummaryDistance", "numberOfSplits", "startTimeLocal", "strokes", "workoutId", "moderateIntensityMinutes", "vigorousIntensityMinutes", "splitSummaryMode", "totalAscent", "differenceStress", "diveCount", "packWeight", "maxPackWeight", "Lps/z1;", "unitOfPoolLength", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lgs1/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lps/u0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lps/z1;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "d", "Lgs1/c;", "h", "()Lgs1/c;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Boolean;", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "m", "o", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "l", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getLapCount", JWKParameterNames.RSA_MODULUS, "z", "Lps/u0;", "C", "()Lps/u0;", "p", "F", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "G", "A", "v", "H", "w", "a0", "x", "c0", "f0", "getModerateIntensityMinutes", "getVigorousIntensityMinutes", "B", "M", "e0", "D", "E", "s", "I", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("vigorousIntensityMinutes")
    private final Integer vigorousIntensityMinutes;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("splitSummaryMode")
    private final String splitSummaryMode;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("totalAscent")
    private final Double totalAscent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("differenceStress")
    private final Double differenceStress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("diveCount")
    private final Integer diveCount;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("beginPackWeight")
    private final Double packWeight;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("maxPackWeight")
    private final Double maxPackWeight;
    public final z1 P;
    public LocalDateTime T;
    public LocalDateTime X;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSets")
    private final Integer activeSets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final c activityType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("atpActivity")
    private final Boolean atpActivity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private final Double averageHeartRate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgRespirationRate")
    private final Double averageRespirationRate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bottomTime")
    private final Double bottomTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("floorsClimbed")
    private final Integer floorsClimbed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapCount")
    private final Integer lapCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDepth")
    private final Double maxDepth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxGradeValue")
    private final u0 maxGradeValue;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxSpeed")
    private final Double maxSpeed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxSplitDistance")
    private final Double maxSplitDistance;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDistanceWithPrecision")
    private final Double maxDistanceWithPrecision;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSplitSummaryDistance")
    private final Double activeSplitSummaryDistance;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noOfSplits")
    private final Long numberOfSplits;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strokes")
    private final Double strokes;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moderateIntensityMinutes")
    private final Integer moderateIntensityMinutes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            u0 u0VarCreateFromParcel;
            Object objValueOf;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                lValueOf = null;
                u0VarCreateFromParcel = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                u0VarCreateFromParcel = null;
            }
            String string = parcel.readString();
            c cVar = (c) (parcel.readInt() == 0 ? u0VarCreateFromParcel : c.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                objValueOf = u0VarCreateFromParcel;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object objValueOf2 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf3 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf4 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf5 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf6 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf7 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            Object objValueOf8 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Integer.valueOf(parcel.readInt());
            Object objValueOf9 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Integer.valueOf(parcel.readInt());
            Object objValueOf10 = parcel.readInt() == 0 ? u0VarCreateFromParcel : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                u0VarCreateFromParcel = u0.CREATOR.createFromParcel(parcel);
            }
            u0 u0Var = u0VarCreateFromParcel;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            return new b(numValueOf, lValueOf, string, cVar, objValueOf, objValueOf2, objValueOf3, objValueOf4, objValueOf5, objValueOf6, objValueOf7, objValueOf8, objValueOf9, objValueOf10, u0Var, dValueOf, dValueOf2, dValueOf3, dValueOf4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, null, Integer.MIN_VALUE, null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Integer num, Long l14, String str, c cVar, Boolean bool, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Integer num2, Integer num3, Double d24, u0 u0Var, Double d25, Double d26, Double d27, Double d28, Long l15, String str2, Double d29, Long l16, Integer num4, Integer num5, String str3, Double d34, Double d35, Integer num6, Double d36, Double d37, z1 z1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? Boolean.FALSE : bool, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15, (i14 & 128) != 0 ? null : d16, (i14 & 256) != 0 ? null : d17, (i14 & 512) != 0 ? null : d18, (i14 & 1024) != 0 ? null : d19, (i14 & 2048) != 0 ? null : num2, (i14 & 4096) != 0 ? null : num3, (i14 & 8192) != 0 ? null : d24, (i14 & 16384) != 0 ? null : u0Var, (i14 & 32768) != 0 ? null : d25, (i14 & 65536) != 0 ? null : d26, (i14 & 131072) != 0 ? null : d27, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d28, (i14 & 524288) != 0 ? null : l15, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str2, (i14 & 2097152) != 0 ? null : d29, (i14 & 4194304) != 0 ? null : l16, (i14 & 8388608) != 0 ? null : num4, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num5, (i14 & 33554432) != 0 ? null : str3, (i14 & 67108864) != 0 ? null : d34, (i14 & 134217728) != 0 ? null : d35, (i14 & 268435456) != 0 ? null : num6, (i14 & 536870912) != 0 ? null : d36, (i14 & 1073741824) != 0 ? null : d37, (i14 & Integer.MIN_VALUE) != 0 ? null : z1Var);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Double getMaxDistanceWithPrecision() {
        return this.maxDistanceWithPrecision;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final u0 getMaxGradeValue() {
        return this.maxGradeValue;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getMaxPackWeight() {
        return this.maxPackWeight;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Double getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Double getMaxSplitDistance() {
        return this.maxSplitDistance;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Long getNumberOfSplits() {
        return this.numberOfSplits;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getPackWeight() {
        return this.packWeight;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getSplitSummaryMode() {
        return this.splitSummaryMode;
    }

    public final LocalDateTime Z() {
        if (this.T == null) {
            this.T = new LocalDateTime(this.startTimeLocal);
        }
        return this.T;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final String getStartTimeLocal() {
        return this.startTimeLocal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getActiveSets() {
        return this.activeSets;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Double getStrokes() {
        return this.strokes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getActiveSplitSummaryDistance() {
        return this.activeSplitSummaryDistance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Double getTotalAscent() {
        return this.totalAscent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.activeSets, bVar.activeSets) && p005kotlin.jvm.internal.s.g(this.activityId, bVar.activityId) && p005kotlin.jvm.internal.s.g(this.activityName, bVar.activityName) && p005kotlin.jvm.internal.s.g(this.activityType, bVar.activityType) && p005kotlin.jvm.internal.s.g(this.atpActivity, bVar.atpActivity) && p005kotlin.jvm.internal.s.g(this.averageHeartRate, bVar.averageHeartRate) && p005kotlin.jvm.internal.s.g(this.averageRespirationRate, bVar.averageRespirationRate) && p005kotlin.jvm.internal.s.g(this.bottomTime, bVar.bottomTime) && p005kotlin.jvm.internal.s.g(this.calories, bVar.calories) && p005kotlin.jvm.internal.s.g(this.distance, bVar.distance) && p005kotlin.jvm.internal.s.g(this.duration, bVar.duration) && p005kotlin.jvm.internal.s.g(this.floorsClimbed, bVar.floorsClimbed) && p005kotlin.jvm.internal.s.g(this.lapCount, bVar.lapCount) && p005kotlin.jvm.internal.s.g(this.maxDepth, bVar.maxDepth) && p005kotlin.jvm.internal.s.g(this.maxGradeValue, bVar.maxGradeValue) && p005kotlin.jvm.internal.s.g(this.maxSpeed, bVar.maxSpeed) && p005kotlin.jvm.internal.s.g(this.maxSplitDistance, bVar.maxSplitDistance) && p005kotlin.jvm.internal.s.g(this.maxDistanceWithPrecision, bVar.maxDistanceWithPrecision) && p005kotlin.jvm.internal.s.g(this.activeSplitSummaryDistance, bVar.activeSplitSummaryDistance) && p005kotlin.jvm.internal.s.g(this.numberOfSplits, bVar.numberOfSplits) && p005kotlin.jvm.internal.s.g(this.startTimeLocal, bVar.startTimeLocal) && p005kotlin.jvm.internal.s.g(this.strokes, bVar.strokes) && p005kotlin.jvm.internal.s.g(this.workoutId, bVar.workoutId) && p005kotlin.jvm.internal.s.g(this.moderateIntensityMinutes, bVar.moderateIntensityMinutes) && p005kotlin.jvm.internal.s.g(this.vigorousIntensityMinutes, bVar.vigorousIntensityMinutes) && p005kotlin.jvm.internal.s.g(this.splitSummaryMode, bVar.splitSummaryMode) && p005kotlin.jvm.internal.s.g(this.totalAscent, bVar.totalAscent) && p005kotlin.jvm.internal.s.g(this.differenceStress, bVar.differenceStress) && p005kotlin.jvm.internal.s.g(this.diveCount, bVar.diveCount) && p005kotlin.jvm.internal.s.g(this.packWeight, bVar.packWeight) && p005kotlin.jvm.internal.s.g(this.maxPackWeight, bVar.maxPackWeight) && p005kotlin.jvm.internal.s.g(this.P, bVar.P);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Long getWorkoutId() {
        return this.workoutId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getActivityType() {
        return this.activityType;
    }

    public final int hashCode() {
        Integer num = this.activeSets;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l14 = this.activityId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.activityName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.activityType;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Boolean bool = this.atpActivity;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d14 = this.averageHeartRate;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.averageRespirationRate;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.bottomTime;
        int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.calories;
        int iHashCode9 = (iHashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.distance;
        int iHashCode10 = (iHashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.duration;
        int iHashCode11 = (iHashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Integer num2 = this.floorsClimbed;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lapCount;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d24 = this.maxDepth;
        int iHashCode14 = (iHashCode13 + (d24 == null ? 0 : d24.hashCode())) * 31;
        u0 u0Var = this.maxGradeValue;
        int iHashCode15 = (iHashCode14 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Double d25 = this.maxSpeed;
        int iHashCode16 = (iHashCode15 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.maxSplitDistance;
        int iHashCode17 = (iHashCode16 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.maxDistanceWithPrecision;
        int iHashCode18 = (iHashCode17 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.activeSplitSummaryDistance;
        int iHashCode19 = (iHashCode18 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Long l15 = this.numberOfSplits;
        int iHashCode20 = (iHashCode19 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.startTimeLocal;
        int iHashCode21 = (iHashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d29 = this.strokes;
        int iHashCode22 = (iHashCode21 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Long l16 = this.workoutId;
        int iHashCode23 = (iHashCode22 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num4 = this.moderateIntensityMinutes;
        int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.vigorousIntensityMinutes;
        int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.splitSummaryMode;
        int iHashCode26 = (iHashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d34 = this.totalAscent;
        int iHashCode27 = (iHashCode26 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.differenceStress;
        int iHashCode28 = (iHashCode27 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Integer num6 = this.diveCount;
        int iHashCode29 = (iHashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d36 = this.packWeight;
        int iHashCode30 = (iHashCode29 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.maxPackWeight;
        int iHashCode31 = (iHashCode30 + (d37 == null ? 0 : d37.hashCode())) * 31;
        z1 z1Var = this.P;
        return iHashCode31 + (z1Var != null ? z1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getAtpActivity() {
        return this.atpActivity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getAverageHeartRate() {
        return this.averageHeartRate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getAverageRespirationRate() {
        return this.averageRespirationRate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getBottomTime() {
        return this.bottomTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getDifferenceStress() {
        return this.differenceStress;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getDiveCount() {
        return this.diveCount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    public final String toString() {
        Integer num = this.activeSets;
        Long l14 = this.activityId;
        String str = this.activityName;
        c cVar = this.activityType;
        Boolean bool = this.atpActivity;
        Double d14 = this.averageHeartRate;
        Double d15 = this.averageRespirationRate;
        Double d16 = this.bottomTime;
        Double d17 = this.calories;
        Double d18 = this.distance;
        Double d19 = this.duration;
        Integer num2 = this.floorsClimbed;
        Integer num3 = this.lapCount;
        Double d24 = this.maxDepth;
        u0 u0Var = this.maxGradeValue;
        Double d25 = this.maxSpeed;
        Double d26 = this.maxSplitDistance;
        Double d27 = this.maxDistanceWithPrecision;
        Double d28 = this.activeSplitSummaryDistance;
        Long l15 = this.numberOfSplits;
        String str2 = this.startTimeLocal;
        Double d29 = this.strokes;
        Long l16 = this.workoutId;
        Integer num4 = this.moderateIntensityMinutes;
        Integer num5 = this.vigorousIntensityMinutes;
        String str3 = this.splitSummaryMode;
        Double d34 = this.totalAscent;
        Double d35 = this.differenceStress;
        Integer num6 = this.diveCount;
        Double d36 = this.packWeight;
        Double d37 = this.maxPackWeight;
        StringBuilder sb3 = new StringBuilder("ActivityForDayDTO(activeSets=");
        sb3.append(num);
        sb3.append(", activityId=");
        sb3.append(l14);
        sb3.append(", activityName=");
        sb3.append(str);
        sb3.append(", activityType=");
        sb3.append(cVar);
        sb3.append(", atpActivity=");
        sb3.append(bool);
        sb3.append(", averageHeartRate=");
        sb3.append(d14);
        sb3.append(", averageRespirationRate=");
        b71.i.p(d15, d16, ", bottomTime=", ", calories=", sb3);
        b71.i.p(d17, d18, ", distance=", ", duration=", sb3);
        b71.i.t(sb3, d19, ", floorsClimbed=", num2, ", lapCount=");
        b71.i.v(sb3, num3, ", maxDepth=", d24, ", maxGradeValue=");
        sb3.append(u0Var);
        sb3.append(", maxSpeed=");
        sb3.append(d25);
        sb3.append(", maxSplitDistance=");
        b71.i.p(d26, d27, ", maxDistanceWithPrecision=", ", activeSplitSummaryDistance=", sb3);
        sb3.append(d28);
        sb3.append(", numberOfSplits=");
        sb3.append(l15);
        sb3.append(", startTimeLocal=");
        b71.i.x(sb3, str2, ", strokes=", d29, ", workoutId=");
        sb3.append(l16);
        sb3.append(", moderateIntensityMinutes=");
        sb3.append(num4);
        sb3.append(", vigorousIntensityMinutes=");
        p6.b.l(num5, ", splitSummaryMode=", str3, ", totalAscent=", sb3);
        b71.i.p(d34, d35, ", differenceStress=", ", diveCount=", sb3);
        b71.i.v(sb3, num6, ", packWeight=", d36, ", maxPackWeight=");
        sb3.append(d37);
        sb3.append(", unitOfPoolLength=");
        sb3.append(this.P);
        sb3.append(")");
        return sb3.toString();
    }

    public final LocalDateTime u() {
        LocalDateTime localDateTimePlusSeconds;
        if (this.X == null) {
            LocalDateTime localDateTimeZ = Z();
            if (localDateTimeZ != null) {
                Double d14 = this.duration;
                localDateTimePlusSeconds = localDateTimeZ.plusSeconds(d14 != null ? (int) d14.doubleValue() : 0);
            } else {
                localDateTimePlusSeconds = null;
            }
            this.X = localDateTimePlusSeconds;
        }
        return this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.activeSets;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.activityName);
        c cVar = this.activityType;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.atpActivity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Double d14 = this.averageHeartRate;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.averageRespirationRate;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.bottomTime;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.calories;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.distance;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.duration;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Integer num2 = this.floorsClimbed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.lapCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Double d24 = this.maxDepth;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        u0 u0Var = this.maxGradeValue;
        if (u0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u0Var.writeToParcel(parcel, i14);
        }
        Double d25 = this.maxSpeed;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.maxSplitDistance;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.maxDistanceWithPrecision;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.activeSplitSummaryDistance;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Long l15 = this.numberOfSplits;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.startTimeLocal);
        Double d29 = this.strokes;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Long l16 = this.workoutId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Integer num4 = this.moderateIntensityMinutes;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.vigorousIntensityMinutes;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        parcel.writeString(this.splitSummaryMode);
        Double d34 = this.totalAscent;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.differenceStress;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Integer num6 = this.diveCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Double d36 = this.packWeight;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Double d37 = this.maxPackWeight;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Integer getFloorsClimbed() {
        return this.floorsClimbed;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Double getMaxDepth() {
        return this.maxDepth;
    }

    public b(Integer num, Long l14, String str, c cVar, Boolean bool, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Integer num2, Integer num3, Double d24, u0 u0Var, Double d25, Double d26, Double d27, Double d28, Long l15, String str2, Double d29, Long l16, Integer num4, Integer num5, String str3, Double d34, Double d35, Integer num6, Double d36, Double d37, z1 z1Var) {
        this.activeSets = num;
        this.activityId = l14;
        this.activityName = str;
        this.activityType = cVar;
        this.atpActivity = bool;
        this.averageHeartRate = d14;
        this.averageRespirationRate = d15;
        this.bottomTime = d16;
        this.calories = d17;
        this.distance = d18;
        this.duration = d19;
        this.floorsClimbed = num2;
        this.lapCount = num3;
        this.maxDepth = d24;
        this.maxGradeValue = u0Var;
        this.maxSpeed = d25;
        this.maxSplitDistance = d26;
        this.maxDistanceWithPrecision = d27;
        this.activeSplitSummaryDistance = d28;
        this.numberOfSplits = l15;
        this.startTimeLocal = str2;
        this.strokes = d29;
        this.workoutId = l16;
        this.moderateIntensityMinutes = num4;
        this.vigorousIntensityMinutes = num5;
        this.splitSummaryMode = str3;
        this.totalAscent = d34;
        this.differenceStress = d35;
        this.diveCount = num6;
        this.packWeight = d36;
        this.maxPackWeight = d37;
        this.P = z1Var;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }
}
