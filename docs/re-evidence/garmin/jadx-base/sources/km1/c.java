package km1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bX\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00103\u001a\u0004\bE\u00105\"\u0004\bF\u00107R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00103\u001a\u0004\bN\u00105\"\u0004\bO\u00107R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00103\u001a\u0004\bP\u00105\"\u0004\bQ\u00107R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u00103\u001a\u0004\bR\u00105\"\u0004\bS\u00107R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00103\u001a\u0004\bU\u00105\"\u0004\bV\u00107R$\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010?\u001a\u0004\bX\u0010A\"\u0004\bY\u0010CR*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u00103\u001a\u0004\b[\u00105\"\u0004\b\\\u00107R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u00103\u001a\u0004\b^\u00105\"\u0004\b_\u00107R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010?\u001a\u0004\ba\u0010AR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u00103\u001a\u0004\bc\u00105\"\u0004\bd\u00107R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bM\u0010A\"\u0004\bf\u0010CR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR*\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u00103\u001a\u0004\bl\u00105\"\u0004\bm\u00107R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\b;\u0010p\"\u0004\bq\u0010rR$\u0010$\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bs\u0010o\u001a\u0004\bD\u0010p\"\u0004\bt\u0010rR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u00103\u001a\u0004\bZ\u00105\"\u0004\bv\u00107R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010w\u001a\u0004\b`\u0010x\"\u0004\by\u0010zR$\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010?\u001a\u0004\b2\u0010A\"\u0004\b{\u0010CR$\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010?\u001a\u0004\b|\u0010A\"\u0004\b}\u0010C¨\u0006~"}, d2 = {"Lkm1/c;", "Landroid/os/Parcelable;", "Lkm1/v;", "dailySleep", "", "Lkm1/s;", "sleepMovement", "sleepLevels", "Lkm1/a;", "breathingVariationsData", "", "restlessMomentsCount", "Lkm1/z;", "sleepRestlessMoments", "Llm1/c;", "wellnessSpO2SleepSummary", "Llm1/b;", "wellnessSpO2EventList", "Llm1/a;", "wellnessEpochSPO2DataList", "Lkm1/n;", "wellnessEpochRespirationDataDTOList", "Lkm1/m;", "wellnessEpochRespirationAveragesList", "respirationVersion", "sleepStressList", "sleepHeartRateList", "restingHeartRate", "sleepBodyBatteryList", "bodyBatteryChange", "", "skinTempDataExist", "Lkm1/o;", "skinTempDataList", "", "avgSkinTempDeviationC", "avgSkinTempDeviationF", "hrvDataList", "", "hrvStatus", "avgOvernightHrv", "skinTempCalibrationDays", "<init>", "(Lkm1/v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Llm1/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lkm1/v;", "j", "()Lkm1/v;", "setDailySleep", "(Lkm1/v;)V", "b", "Ljava/util/List;", "D", "()Ljava/util/List;", "setSleepMovement", "(Ljava/util/List;)V", "c", "A", "setSleepLevels", "d", IntegerTokenConverter.CONVERTER_KEY, "setBreathingVariationsData", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()Ljava/lang/Integer;", "setRestlessMomentsCount", "(Ljava/lang/Integer;)V", "f", "F", "setSleepRestlessMoments", "g", "Llm1/c;", "w0", "()Llm1/c;", "setWellnessSpO2SleepSummary", "(Llm1/c;)V", "h", "getWellnessSpO2EventList", "setWellnessSpO2EventList", "q0", "setWellnessEpochSPO2DataList", "p0", "setWellnessEpochRespirationDataDTOList", JWKParameterNames.OCT_KEY_VALUE, "o0", "setWellnessEpochRespirationAveragesList", "l", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setRespirationVersion", "m", "g0", "setSleepStressList", JWKParameterNames.RSA_MODULUS, "z", "setSleepHeartRateList", "o", "s", "p", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "setSleepBodyBatteryList", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setBodyBatteryChange", "Z", "getSkinTempDataExist", "()Z", "setSkinTempDataExist", "(Z)V", "u", "setSkinTempDataList", "v", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setAvgSkinTempDeviationC", "(Ljava/lang/Double;)V", "w", "setAvgSkinTempDeviationF", "x", "setHrvDataList", "Ljava/lang/String;", "()Ljava/lang/String;", "setHrvStatus", "(Ljava/lang/String;)V", "setAvgOvernightHrv", "getSkinTempCalibrationDays", "setSkinTempCalibrationDays", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("skinTempCalibrationDays")
    private Integer skinTempCalibrationDays;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailySleepDTO")
    private v dailySleep;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepMovement")
    private List<s> sleepMovement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepLevels")
    private List<s> sleepLevels;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("breathingDisruptionData")
    private List<km1.a> breathingVariationsData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restlessMomentsCount")
    private Integer restlessMomentsCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepRestlessMoments")
    private List<z> sleepRestlessMoments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessSpO2SleepSummaryDTO")
    private lm1.c wellnessSpO2SleepSummary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessSpO2EventDTOList")
    private List<lm1.b> wellnessSpO2EventList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEpochSPO2DataDTOList")
    private List<lm1.a> wellnessEpochSPO2DataList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEpochRespirationDataDTOList")
    private List<n> wellnessEpochRespirationDataDTOList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEpochRespirationAveragesList")
    private List<m> wellnessEpochRespirationAveragesList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respirationVersion")
    private Integer respirationVersion;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStress")
    private List<z> sleepStressList;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepHeartRate")
    private List<z> sleepHeartRateList;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restingHeartRate")
    private final Integer restingHeartRate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepBodyBattery")
    private List<z> sleepBodyBatteryList;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryChange")
    private Integer bodyBatteryChange;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skinTempDataExist")
    private boolean skinTempDataExist;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skinTempData")
    private List<o> skinTempDataList;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSkinTempDeviationC")
    private Double avgSkinTempDeviationC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSkinTempDeviationF")
    private Double avgSkinTempDeviationF;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvData")
    private List<z> hrvDataList;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvStatus")
    private String hrvStatus;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgOvernightHrv")
    private Integer avgOvernightHrv;
    public static final Parcelable.Creator<c> CREATOR = new a();
    public static final int B = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            Integer num;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            Double d14;
            parcel.getClass();
            v vVarCreateFromParcel = parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(s.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(s.CREATOR, parcel, arrayList2, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(km1.a.CREATOR, parcel, arrayList3, iA3, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i17);
                int iA4 = 0;
                while (iA4 != i17) {
                    iA4 = kg.f.a(z.CREATOR, parcel, arrayList15, iA4, 1);
                }
                arrayList4 = arrayList15;
            }
            lm1.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : lm1.c.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i18);
                int iA5 = 0;
                while (iA5 != i18) {
                    iA5 = kg.f.a(lm1.b.CREATOR, parcel, arrayList16, iA5, 1);
                }
                arrayList5 = arrayList16;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i19);
                int iA6 = 0;
                while (iA6 != i19) {
                    iA6 = kg.f.a(lm1.a.CREATOR, parcel, arrayList17, iA6, 1);
                }
                arrayList6 = arrayList17;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i24);
                int iA7 = 0;
                while (iA7 != i24) {
                    iA7 = kg.f.a(n.CREATOR, parcel, arrayList18, iA7, 1);
                }
                arrayList7 = arrayList18;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i25 = parcel.readInt();
                arrayList8 = new ArrayList(i25);
                int iA8 = 0;
                while (iA8 != i25) {
                    iA8 = kg.f.a(m.CREATOR, parcel, arrayList8, iA8, 1);
                }
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i26 = parcel.readInt();
                arrayList9 = new ArrayList(i26);
                int iA9 = 0;
                while (true) {
                    num = numValueOf;
                    if (iA9 == i26) {
                        break;
                    }
                    iA9 = kg.f.a(z.CREATOR, parcel, arrayList9, iA9, 1);
                    numValueOf = num;
                    i26 = i26;
                }
            } else {
                arrayList9 = null;
                num = numValueOf;
            }
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i27 = parcel.readInt();
                arrayList10 = new ArrayList(i27);
                int iA10 = 0;
                while (iA10 != i27) {
                    iA10 = kg.f.a(z.CREATOR, parcel, arrayList10, iA10, 1);
                    i27 = i27;
                    vVarCreateFromParcel = vVarCreateFromParcel;
                }
            }
            v vVar = vVarCreateFromParcel;
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i28 = parcel.readInt();
                arrayList11 = new ArrayList(i28);
                int iA11 = 0;
                while (true) {
                    arrayList12 = arrayList10;
                    if (iA11 == i28) {
                        break;
                    }
                    iA11 = kg.f.a(z.CREATOR, parcel, arrayList11, iA11, 1);
                    arrayList10 = arrayList12;
                    i28 = i28;
                }
            } else {
                arrayList11 = null;
                arrayList12 = arrayList10;
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int i29 = parcel.readInt();
                arrayList13 = new ArrayList(i29);
                int iA12 = 0;
                while (iA12 != i29) {
                    iA12 = kg.f.a(o.CREATOR, parcel, arrayList13, iA12, 1);
                    i29 = i29;
                    arrayList11 = arrayList11;
                }
            }
            ArrayList arrayList19 = arrayList11;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                int i30 = parcel.readInt();
                arrayList14 = new ArrayList(i30);
                int iA13 = 0;
                while (true) {
                    d14 = dValueOf2;
                    if (iA13 == i30) {
                        break;
                    }
                    iA13 = kg.f.a(z.CREATOR, parcel, arrayList14, iA13, 1);
                    dValueOf2 = d14;
                    i30 = i30;
                }
            } else {
                arrayList14 = null;
                d14 = dValueOf2;
            }
            return new c(vVar, arrayList, arrayList2, arrayList3, num, arrayList4, cVarCreateFromParcel, arrayList5, arrayList6, arrayList7, arrayList8, numValueOf2, arrayList9, arrayList12, numValueOf3, arrayList19, numValueOf4, z14, arrayList13, dValueOf, d14, arrayList14, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(v vVar, List list, List list2, List list3, Integer num, List list4, lm1.c cVar, List list5, List list6, List list7, List list8, Integer num2, List list9, List list10, Integer num3, List list11, Integer num4, boolean z14, List list12, Double d14, Double d15, List list13, String str, Integer num5, Integer num6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : vVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : list3, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : list4, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? null : list5, (i14 & 256) != 0 ? null : list6, (i14 & 512) != 0 ? null : list7, (i14 & 1024) != 0 ? null : list8, (i14 & 2048) != 0 ? null : num2, (i14 & 4096) != 0 ? null : list9, (i14 & 8192) != 0 ? null : list10, (i14 & 16384) != 0 ? null : num3, (i14 & 32768) != 0 ? null : list11, (i14 & 65536) != 0 ? null : num4, (i14 & 131072) != 0 ? false : z14, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : list12, (i14 & 524288) != 0 ? null : d14, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d15, (i14 & 2097152) != 0 ? null : list13, (i14 & 4194304) != 0 ? null : str, (i14 & 8388608) != 0 ? null : num5, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num6);
    }

    public static int C(int i14) {
        l3.f23124b.getClass();
        return (int) Math.ceil(((double) i14) / 60.0d);
    }

    public final List<s> A() {
        return this.sleepLevels;
    }

    public final boolean A0() {
        Integer num = this.skinTempCalibrationDays;
        int iIntValue = num != null ? num.intValue() : 0;
        em1.a.f64616a.getClass();
        return em1.a.f64617b.d(iIntValue);
    }

    public final List<s> D() {
        return this.sleepMovement;
    }

    public final List<z> F() {
        return this.sleepRestlessMoments;
    }

    public final String G() {
        jm1.c cVarG0;
        jm1.d awakeCount;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (awakeCount = cVarG0.getAwakeCount()) == null) {
            return null;
        }
        return awakeCount.getQualifierKey();
    }

    public final String H() {
        jm1.c cVarG0;
        jm1.d deepPercentage;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (deepPercentage = cVarG0.getDeepPercentage()) == null) {
            return null;
        }
        return deepPercentage.getQualifierKey();
    }

    public final String I() {
        jm1.c cVarG0;
        jm1.d totalDuration;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (totalDuration = cVarG0.getTotalDuration()) == null) {
            return null;
        }
        return totalDuration.getQualifierKey();
    }

    public final String M() {
        jm1.c cVarG0;
        jm1.d lightPercentage;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (lightPercentage = cVarG0.getLightPercentage()) == null) {
            return null;
        }
        return lightPercentage.getQualifierKey();
    }

    public final String Z() {
        jm1.c cVarG0;
        jm1.d overall;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (overall = cVarG0.getOverall()) == null) {
            return null;
        }
        return overall.getQualifierKey();
    }

    public final String a0() {
        jm1.c cVarG0;
        jm1.d remPercentage;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (remPercentage = cVarG0.getRemPercentage()) == null) {
            return null;
        }
        return remPercentage.getQualifierKey();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgOvernightHrv() {
        return this.avgOvernightHrv;
    }

    public final String c0() {
        jm1.c cVarG0;
        jm1.d restlessness;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (restlessness = cVarG0.getRestlessness()) == null) {
            return null;
        }
        return restlessness.getQualifierKey();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAvgSkinTempDeviationC() {
        return this.avgSkinTempDeviationC;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e0() {
        jm1.c cVarG0;
        jm1.d stress;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null || (stress = cVarG0.getStress()) == null) {
            return null;
        }
        return stress.getQualifierKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.dailySleep, cVar.dailySleep) && p005kotlin.jvm.internal.s.g(this.sleepMovement, cVar.sleepMovement) && p005kotlin.jvm.internal.s.g(this.sleepLevels, cVar.sleepLevels) && p005kotlin.jvm.internal.s.g(this.breathingVariationsData, cVar.breathingVariationsData) && p005kotlin.jvm.internal.s.g(this.restlessMomentsCount, cVar.restlessMomentsCount) && p005kotlin.jvm.internal.s.g(this.sleepRestlessMoments, cVar.sleepRestlessMoments) && p005kotlin.jvm.internal.s.g(this.wellnessSpO2SleepSummary, cVar.wellnessSpO2SleepSummary) && p005kotlin.jvm.internal.s.g(this.wellnessSpO2EventList, cVar.wellnessSpO2EventList) && p005kotlin.jvm.internal.s.g(this.wellnessEpochSPO2DataList, cVar.wellnessEpochSPO2DataList) && p005kotlin.jvm.internal.s.g(this.wellnessEpochRespirationDataDTOList, cVar.wellnessEpochRespirationDataDTOList) && p005kotlin.jvm.internal.s.g(this.wellnessEpochRespirationAveragesList, cVar.wellnessEpochRespirationAveragesList) && p005kotlin.jvm.internal.s.g(this.respirationVersion, cVar.respirationVersion) && p005kotlin.jvm.internal.s.g(this.sleepStressList, cVar.sleepStressList) && p005kotlin.jvm.internal.s.g(this.sleepHeartRateList, cVar.sleepHeartRateList) && p005kotlin.jvm.internal.s.g(this.restingHeartRate, cVar.restingHeartRate) && p005kotlin.jvm.internal.s.g(this.sleepBodyBatteryList, cVar.sleepBodyBatteryList) && p005kotlin.jvm.internal.s.g(this.bodyBatteryChange, cVar.bodyBatteryChange) && this.skinTempDataExist == cVar.skinTempDataExist && p005kotlin.jvm.internal.s.g(this.skinTempDataList, cVar.skinTempDataList) && p005kotlin.jvm.internal.s.g(this.avgSkinTempDeviationC, cVar.avgSkinTempDeviationC) && p005kotlin.jvm.internal.s.g(this.avgSkinTempDeviationF, cVar.avgSkinTempDeviationF) && p005kotlin.jvm.internal.s.g(this.hrvDataList, cVar.hrvDataList) && p005kotlin.jvm.internal.s.g(this.hrvStatus, cVar.hrvStatus) && p005kotlin.jvm.internal.s.g(this.avgOvernightHrv, cVar.avgOvernightHrv) && p005kotlin.jvm.internal.s.g(this.skinTempCalibrationDays, cVar.skinTempCalibrationDays);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAvgSkinTempDeviationF() {
        return this.avgSkinTempDeviationF;
    }

    public final Integer f0() {
        jm1.c cVarG0;
        v vVar = this.dailySleep;
        if (vVar == null || (cVarG0 = vVar.getSleepScores()) == null) {
            return null;
        }
        return cVarG0.j();
    }

    public final Double g() {
        v vVar = this.dailySleep;
        if (vVar != null) {
            return vVar.getAvgSleepStress();
        }
        return null;
    }

    public final List<z> g0() {
        return this.sleepStressList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getBodyBatteryChange() {
        return this.bodyBatteryChange;
    }

    public final int h0() {
        v vVar = this.dailySleep;
        return C(vVar != null ? vVar.getAwakeSleepSeconds() : 0);
    }

    public final int hashCode() {
        v vVar = this.dailySleep;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        List<s> list = this.sleepMovement;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<s> list2 = this.sleepLevels;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<km1.a> list3 = this.breathingVariationsData;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.restlessMomentsCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<z> list4 = this.sleepRestlessMoments;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        lm1.c cVar = this.wellnessSpO2SleepSummary;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<lm1.b> list5 = this.wellnessSpO2EventList;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<lm1.a> list6 = this.wellnessEpochSPO2DataList;
        int iHashCode9 = (iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<n> list7 = this.wellnessEpochRespirationDataDTOList;
        int iHashCode10 = (iHashCode9 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<m> list8 = this.wellnessEpochRespirationAveragesList;
        int iHashCode11 = (iHashCode10 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Integer num2 = this.respirationVersion;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<z> list9 = this.sleepStressList;
        int iHashCode13 = (iHashCode12 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<z> list10 = this.sleepHeartRateList;
        int iHashCode14 = (iHashCode13 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Integer num3 = this.restingHeartRate;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<z> list11 = this.sleepBodyBatteryList;
        int iHashCode16 = (iHashCode15 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Integer num4 = this.bodyBatteryChange;
        int iG = q6.f.g((iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.skinTempDataExist);
        List<o> list12 = this.skinTempDataList;
        int iHashCode17 = (iG + (list12 == null ? 0 : list12.hashCode())) * 31;
        Double d14 = this.avgSkinTempDeviationC;
        int iHashCode18 = (iHashCode17 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.avgSkinTempDeviationF;
        int iHashCode19 = (iHashCode18 + (d15 == null ? 0 : d15.hashCode())) * 31;
        List<z> list13 = this.hrvDataList;
        int iHashCode20 = (iHashCode19 + (list13 == null ? 0 : list13.hashCode())) * 31;
        String str = this.hrvStatus;
        int iHashCode21 = (iHashCode20 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.avgOvernightHrv;
        int iHashCode22 = (iHashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.skinTempCalibrationDays;
        return iHashCode22 + (num6 != null ? num6.hashCode() : 0);
    }

    public final List<km1.a> i() {
        return this.breathingVariationsData;
    }

    public final int i0() {
        v vVar = this.dailySleep;
        return C(vVar != null ? vVar.getDeepSleepSeconds() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final v getDailySleep() {
        return this.dailySleep;
    }

    public final int j0() {
        v vVar = this.dailySleep;
        return C(vVar != null ? vVar.getLightSleepSeconds() : 0);
    }

    public final int k() {
        String str = this.hrvStatus;
        return (str == null || str.length() == 0 || d53.u.q(this.hrvStatus, "NONE", true)) ? l.NO_STATUS.f105537a : l.valueOf(String.valueOf(this.hrvStatus)).f105537a;
    }

    public final int k0() {
        v vVar = this.dailySleep;
        return C(vVar != null ? vVar.getRemSleepSeconds() : 0);
    }

    public final List<z> m() {
        return this.hrvDataList;
    }

    public final int n0() {
        v vVar = this.dailySleep;
        if (vVar == null || !ql1.c.e(vVar)) {
            return j0() + i0() + (z0() ? k0() : 0);
        }
        v vVar2 = this.dailySleep;
        return C(vVar2 != null ? vVar2.getSleepTimeSeconds() : 0);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getHrvStatus() {
        return this.hrvStatus;
    }

    public final List<m> o0() {
        return this.wellnessEpochRespirationAveragesList;
    }

    public final List<n> p0() {
        return this.wellnessEpochRespirationDataDTOList;
    }

    public final Integer q() {
        v vVar = this.dailySleep;
        if (vVar != null) {
            return vVar.getAwakeCount();
        }
        return null;
    }

    public final List<lm1.a> q0() {
        return this.wellnessEpochSPO2DataList;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getRespirationVersion() {
        return this.respirationVersion;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getRestingHeartRate() {
        return this.restingHeartRate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getRestlessMomentsCount() {
        return this.restlessMomentsCount;
    }

    public final String toString() {
        v vVar = this.dailySleep;
        List<s> list = this.sleepMovement;
        List<s> list2 = this.sleepLevels;
        List<km1.a> list3 = this.breathingVariationsData;
        Integer num = this.restlessMomentsCount;
        List<z> list4 = this.sleepRestlessMoments;
        lm1.c cVar = this.wellnessSpO2SleepSummary;
        List<lm1.b> list5 = this.wellnessSpO2EventList;
        List<lm1.a> list6 = this.wellnessEpochSPO2DataList;
        List<n> list7 = this.wellnessEpochRespirationDataDTOList;
        List<m> list8 = this.wellnessEpochRespirationAveragesList;
        Integer num2 = this.respirationVersion;
        List<z> list9 = this.sleepStressList;
        List<z> list10 = this.sleepHeartRateList;
        Integer num3 = this.restingHeartRate;
        List<z> list11 = this.sleepBodyBatteryList;
        Integer num4 = this.bodyBatteryChange;
        boolean z14 = this.skinTempDataExist;
        List<o> list12 = this.skinTempDataList;
        Double d14 = this.avgSkinTempDeviationC;
        Double d15 = this.avgSkinTempDeviationF;
        List<z> list13 = this.hrvDataList;
        String str = this.hrvStatus;
        Integer num5 = this.avgOvernightHrv;
        Integer num6 = this.skinTempCalibrationDays;
        StringBuilder sb3 = new StringBuilder("DailySleepDTO(dailySleep=");
        sb3.append(vVar);
        sb3.append(", sleepMovement=");
        sb3.append(list);
        sb3.append(", sleepLevels=");
        n23.j.z(sb3, list2, ", breathingVariationsData=", list3, ", restlessMomentsCount=");
        sb3.append(num);
        sb3.append(", sleepRestlessMoments=");
        sb3.append(list4);
        sb3.append(", wellnessSpO2SleepSummary=");
        sb3.append(cVar);
        sb3.append(", wellnessSpO2EventList=");
        sb3.append(list5);
        sb3.append(", wellnessEpochSPO2DataList=");
        n23.j.z(sb3, list6, ", wellnessEpochRespirationDataDTOList=", list7, ", wellnessEpochRespirationAveragesList=");
        sb3.append(list8);
        sb3.append(", respirationVersion=");
        sb3.append(num2);
        sb3.append(", sleepStressList=");
        n23.j.z(sb3, list9, ", sleepHeartRateList=", list10, ", restingHeartRate=");
        sb3.append(num3);
        sb3.append(", sleepBodyBatteryList=");
        sb3.append(list11);
        sb3.append(", bodyBatteryChange=");
        sb3.append(num4);
        sb3.append(", skinTempDataExist=");
        sb3.append(z14);
        sb3.append(", skinTempDataList=");
        sb3.append(list12);
        sb3.append(", avgSkinTempDeviationC=");
        sb3.append(d14);
        sb3.append(", avgSkinTempDeviationF=");
        sb3.append(d15);
        sb3.append(", hrvDataList=");
        sb3.append(list13);
        sb3.append(", hrvStatus=");
        fb1.c.u(num5, str, ", avgOvernightHrv=", ", skinTempCalibrationDays=", sb3);
        return f3.i(sb3, num6, ")");
    }

    public final List<o> u() {
        return this.skinTempDataList;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final lm1.c getWellnessSpO2SleepSummary() {
        return this.wellnessSpO2SleepSummary;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        v vVar = this.dailySleep;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i14);
        }
        List<s> list = this.sleepMovement;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((s) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<s> list2 = this.sleepLevels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((s) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<km1.a> list3 = this.breathingVariationsData;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((km1.a) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.restlessMomentsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        List<z> list4 = this.sleepRestlessMoments;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((z) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        lm1.c cVar = this.wellnessSpO2SleepSummary;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        List<lm1.b> list5 = this.wellnessSpO2EventList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                ((lm1.b) itO5.next()).writeToParcel(parcel, i14);
            }
        }
        List<lm1.a> list6 = this.wellnessEpochSPO2DataList;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO6 = u0.o(parcel, list6, 1);
            while (itO6.hasNext()) {
                ((lm1.a) itO6.next()).writeToParcel(parcel, i14);
            }
        }
        List<n> list7 = this.wellnessEpochRespirationDataDTOList;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO7 = u0.o(parcel, list7, 1);
            while (itO7.hasNext()) {
                ((n) itO7.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list8 = this.wellnessEpochRespirationAveragesList;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO8 = u0.o(parcel, list8, 1);
            while (itO8.hasNext()) {
                ((m) itO8.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num2 = this.respirationVersion;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        List<z> list9 = this.sleepStressList;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO9 = u0.o(parcel, list9, 1);
            while (itO9.hasNext()) {
                ((z) itO9.next()).writeToParcel(parcel, i14);
            }
        }
        List<z> list10 = this.sleepHeartRateList;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO10 = u0.o(parcel, list10, 1);
            while (itO10.hasNext()) {
                ((z) itO10.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num3 = this.restingHeartRate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        List<z> list11 = this.sleepBodyBatteryList;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO11 = u0.o(parcel, list11, 1);
            while (itO11.hasNext()) {
                ((z) itO11.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num4 = this.bodyBatteryChange;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        parcel.writeInt(this.skinTempDataExist ? 1 : 0);
        List<o> list12 = this.skinTempDataList;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO12 = u0.o(parcel, list12, 1);
            while (itO12.hasNext()) {
                ((o) itO12.next()).writeToParcel(parcel, i14);
            }
        }
        Double d14 = this.avgSkinTempDeviationC;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.avgSkinTempDeviationF;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        List<z> list13 = this.hrvDataList;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO13 = u0.o(parcel, list13, 1);
            while (itO13.hasNext()) {
                ((z) itO13.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.hrvStatus);
        Integer num5 = this.avgOvernightHrv;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.skinTempCalibrationDays;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    public final boolean x0() {
        boolean z14;
        v vVar = this.dailySleep;
        if ((vVar != null ? vVar.getUnmeasurableSleepSeconds() : 0) <= 0) {
            v vVar2 = this.dailySleep;
            if (vVar2 != null) {
                if (vVar2.getSleepTimeSeconds() > 0 && !ql1.c.e(vVar2) && vVar2.getDeepSleepSeconds() <= 0 && vVar2.getLightSleepSeconds() <= 0 && vVar2.getRemSleepSeconds() <= 0 && vVar2.getAwakeSleepSeconds() <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                return false;
            }
        }
        return true;
    }

    public final List<z> y() {
        return this.sleepBodyBatteryList;
    }

    public final List<z> z() {
        return this.sleepHeartRateList;
    }

    public final boolean z0() {
        v vVar = this.dailySleep;
        if (vVar != null) {
            return vVar.getDeviceRemCapable();
        }
        return false;
    }

    public c(v vVar, List<s> list, List<s> list2, List<km1.a> list3, Integer num, List<z> list4, lm1.c cVar, List<lm1.b> list5, List<lm1.a> list6, List<n> list7, List<m> list8, Integer num2, List<z> list9, List<z> list10, Integer num3, List<z> list11, Integer num4, boolean z14, List<o> list12, Double d14, Double d15, List<z> list13, String str, Integer num5, Integer num6) {
        this.dailySleep = vVar;
        this.sleepMovement = list;
        this.sleepLevels = list2;
        this.breathingVariationsData = list3;
        this.restlessMomentsCount = num;
        this.sleepRestlessMoments = list4;
        this.wellnessSpO2SleepSummary = cVar;
        this.wellnessSpO2EventList = list5;
        this.wellnessEpochSPO2DataList = list6;
        this.wellnessEpochRespirationDataDTOList = list7;
        this.wellnessEpochRespirationAveragesList = list8;
        this.respirationVersion = num2;
        this.sleepStressList = list9;
        this.sleepHeartRateList = list10;
        this.restingHeartRate = num3;
        this.sleepBodyBatteryList = list11;
        this.bodyBatteryChange = num4;
        this.skinTempDataExist = z14;
        this.skinTempDataList = list12;
        this.avgSkinTempDeviationC = d14;
        this.avgSkinTempDeviationF = d15;
        this.hrvDataList = list13;
        this.hrvStatus = str;
        this.avgOvernightHrv = num5;
        this.skinTempCalibrationDays = num6;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 33554431, null);
    }
}
