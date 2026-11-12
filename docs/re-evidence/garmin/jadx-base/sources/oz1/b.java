package oz1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b6\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b7\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b8\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b9\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b:\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b?\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\bH\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\bI\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010-R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010'\u001a\u0004\bM\u0010)R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010+\u001a\u0004\bO\u0010-R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010)R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\bR\u0010-R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bV\u0010)R\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010+\u001a\u0004\b0\u0010-R\u001c\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bD\u0010-R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010S\u001a\u0004\bX\u0010UR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010+\u001a\u0004\bJ\u0010-\"\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Loz1/b;", "Landroid/os/Parcelable;", "", "acwrFactorFeedback", "", "acwrFactorPercent", "calendarDate", "", "deviceId", "feedbackLong", "feedbackShort", "hrvFactorFeedback", "hrvFactorPercent", "inputContext", "level", "recoveryTime", "recoveryTimeFactorFeedback", "recoveryTimeFactorPercent", "", FirebaseAnalytics.Param.SCORE, "sleepHistoryFactorFeedback", "sleepHistoryFactorPercent", "sleepScore", "sleepScoreFactorFeedback", "sleepScoreFactorPercent", "stressHistoryFactorFeedback", "stressHistoryFactorPercent", "timestamp", "userProfilePK", "", "validSleep", "timestampLocal", "acuteLoad", "hrvWeeklyAverage", "primaryActivityTracker", "minutesSinceLastDive", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "c", "h", "d", "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "j", "m", "getHrvFactorPercent", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "l", "z", "getRecoveryTimeFactorPercent", JWKParameterNames.RSA_MODULUS, "Ljava/lang/Float;", "A", "()Ljava/lang/Float;", "o", "C", "p", "getSleepHistoryFactorPercent", "D", "F", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getSleepScoreFactorPercent", "v", "G", "w", "getStressHistoryFactorPercent", "x", "H", "getUserProfilePK", "Ljava/lang/Boolean;", "M", "()Ljava/lang/Boolean;", "I", "B", "u", "E", "Z", "(Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public static final int F = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("timestampLocal")
    private final String timestampLocal;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("acuteLoad")
    private final Integer acuteLoad;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("hrvWeeklyAverage")
    private final Integer hrvWeeklyAverage;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("primaryActivityTracker")
    private final Boolean primaryActivityTracker;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("minutesSinceLastDive")
    private Integer minutesSinceLastDive;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acwrFactorFeedback")
    private final String acwrFactorFeedback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acwrFactorPercent")
    private final Integer acwrFactorPercent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackLong")
    private final String feedbackLong;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackShort")
    private final String feedbackShort;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvFactorFeedback")
    private final String hrvFactorFeedback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvFactorPercent")
    private final Integer hrvFactorPercent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inputContext")
    private final String inputContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("level")
    private final String level;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recoveryTime")
    private final Integer recoveryTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recoveryTimeFactorFeedback")
    private final String recoveryTimeFactorFeedback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recoveryTimeFactorPercent")
    private final Integer recoveryTimeFactorPercent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Float score;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepHistoryFactorFeedback")
    private final String sleepHistoryFactorFeedback;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepHistoryFactorPercent")
    private final Integer sleepHistoryFactorPercent;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepScore")
    private final Integer sleepScore;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepScoreFactorFeedback")
    private final String sleepScoreFactorFeedback;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepScoreFactorPercent")
    private final Integer sleepScoreFactorPercent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stressHistoryFactorFeedback")
    private final String stressHistoryFactorFeedback;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stressHistoryFactorPercent")
    private final Integer stressHistoryFactorPercent;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private final String timestamp;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Integer userProfilePK;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("validSleep")
    private final Boolean validSleep;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long l14;
            Object objValueOf;
            Object objValueOf2;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                l14 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                l14 = null;
            }
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Object obj = l14;
            Long l15 = lValueOf;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Object objValueOf3 = parcel.readInt() == 0 ? obj : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Object objValueOf4 = obj;
            Integer num = objValueOf3;
            String string7 = parcel.readString();
            Object objValueOf5 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            Object objValueOf6 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            Object objValueOf7 = parcel.readInt() == 0 ? objValueOf4 : Float.valueOf(parcel.readFloat());
            String string9 = parcel.readString();
            Object objValueOf8 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            Object objValueOf9 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            Object objValueOf10 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            String string11 = parcel.readString();
            Object objValueOf11 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            Object objValueOf12 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                objValueOf = objValueOf4;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string13 = parcel.readString();
            Object objValueOf13 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            Object objValueOf14 = parcel.readInt() == 0 ? objValueOf4 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                objValueOf2 = objValueOf4;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                objValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new b(string, numValueOf, string2, l15, string3, string4, string5, num, string6, string7, objValueOf5, string8, objValueOf6, objValueOf7, string9, objValueOf8, objValueOf9, string10, objValueOf10, string11, objValueOf11, string12, objValueOf12, objValueOf, string13, objValueOf13, objValueOf14, objValueOf2, objValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, Integer num, String str2, Long l14, String str3, String str4, String str5, Integer num2, String str6, String str7, Integer num3, String str8, Integer num4, Float f14, String str9, Integer num5, Integer num6, String str10, Integer num7, String str11, Integer num8, String str12, Integer num9, Boolean bool, String str13, Integer num10, Integer num11, Boolean bool2, Integer num12, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, str2, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : num3, (i14 & 2048) != 0 ? null : str8, (i14 & 4096) != 0 ? null : num4, (i14 & 8192) != 0 ? null : f14, (i14 & 16384) != 0 ? null : str9, (32768 & i14) != 0 ? null : num5, (65536 & i14) != 0 ? null : num6, (131072 & i14) != 0 ? null : str10, (262144 & i14) != 0 ? null : num7, (524288 & i14) != 0 ? null : str11, (1048576 & i14) != 0 ? null : num8, (2097152 & i14) != 0 ? null : str12, (4194304 & i14) != 0 ? null : num9, (8388608 & i14) != 0 ? Boolean.FALSE : bool, (16777216 & i14) != 0 ? null : str13, (33554432 & i14) != 0 ? null : num10, (67108864 & i14) != 0 ? null : num11, (134217728 & i14) != 0 ? Boolean.FALSE : bool2, (i14 & 268435456) != 0 ? null : num12);
    }

    public static b b(b bVar, String str, Integer num, Integer num2) {
        String str2 = bVar.calendarDate;
        Long l14 = bVar.deviceId;
        String str3 = bVar.feedbackLong;
        String str4 = bVar.feedbackShort;
        String str5 = bVar.hrvFactorFeedback;
        Integer num3 = bVar.hrvFactorPercent;
        String str6 = bVar.inputContext;
        String str7 = bVar.level;
        Integer num4 = bVar.recoveryTime;
        String str8 = bVar.recoveryTimeFactorFeedback;
        Integer num5 = bVar.recoveryTimeFactorPercent;
        Float f14 = bVar.score;
        String str9 = bVar.sleepHistoryFactorFeedback;
        Integer num6 = bVar.sleepHistoryFactorPercent;
        Integer num7 = bVar.sleepScore;
        String str10 = bVar.sleepScoreFactorFeedback;
        Integer num8 = bVar.sleepScoreFactorPercent;
        String str11 = bVar.stressHistoryFactorFeedback;
        Integer num9 = bVar.stressHistoryFactorPercent;
        String str12 = bVar.timestamp;
        Integer num10 = bVar.userProfilePK;
        Boolean bool = bVar.validSleep;
        String str13 = bVar.timestampLocal;
        Integer num11 = bVar.hrvWeeklyAverage;
        Boolean bool2 = bVar.primaryActivityTracker;
        Integer num12 = bVar.minutesSinceLastDive;
        str2.getClass();
        return new b(str, num, str2, l14, str3, str4, str5, num3, str6, str7, num4, str8, num5, f14, str9, num6, num7, str10, num8, str11, num9, str12, num10, bool, str13, num2, num11, bool2, num12);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getSleepHistoryFactorFeedback() {
        return this.sleepHistoryFactorFeedback;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getSleepScoreFactorFeedback() {
        return this.sleepScoreFactorFeedback;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getStressHistoryFactorFeedback() {
        return this.stressHistoryFactorFeedback;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getTimestampLocal() {
        return this.timestampLocal;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Boolean getValidSleep() {
        return this.validSleep;
    }

    public final void Z(Integer num) {
        this.minutesSinceLastDive = num;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAcuteLoad() {
        return this.acuteLoad;
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
        return p005kotlin.jvm.internal.s.g(this.acwrFactorFeedback, bVar.acwrFactorFeedback) && p005kotlin.jvm.internal.s.g(this.acwrFactorPercent, bVar.acwrFactorPercent) && p005kotlin.jvm.internal.s.g(this.calendarDate, bVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.deviceId, bVar.deviceId) && p005kotlin.jvm.internal.s.g(this.feedbackLong, bVar.feedbackLong) && p005kotlin.jvm.internal.s.g(this.feedbackShort, bVar.feedbackShort) && p005kotlin.jvm.internal.s.g(this.hrvFactorFeedback, bVar.hrvFactorFeedback) && p005kotlin.jvm.internal.s.g(this.hrvFactorPercent, bVar.hrvFactorPercent) && p005kotlin.jvm.internal.s.g(this.inputContext, bVar.inputContext) && p005kotlin.jvm.internal.s.g(this.level, bVar.level) && p005kotlin.jvm.internal.s.g(this.recoveryTime, bVar.recoveryTime) && p005kotlin.jvm.internal.s.g(this.recoveryTimeFactorFeedback, bVar.recoveryTimeFactorFeedback) && p005kotlin.jvm.internal.s.g(this.recoveryTimeFactorPercent, bVar.recoveryTimeFactorPercent) && p005kotlin.jvm.internal.s.g(this.score, bVar.score) && p005kotlin.jvm.internal.s.g(this.sleepHistoryFactorFeedback, bVar.sleepHistoryFactorFeedback) && p005kotlin.jvm.internal.s.g(this.sleepHistoryFactorPercent, bVar.sleepHistoryFactorPercent) && p005kotlin.jvm.internal.s.g(this.sleepScore, bVar.sleepScore) && p005kotlin.jvm.internal.s.g(this.sleepScoreFactorFeedback, bVar.sleepScoreFactorFeedback) && p005kotlin.jvm.internal.s.g(this.sleepScoreFactorPercent, bVar.sleepScoreFactorPercent) && p005kotlin.jvm.internal.s.g(this.stressHistoryFactorFeedback, bVar.stressHistoryFactorFeedback) && p005kotlin.jvm.internal.s.g(this.stressHistoryFactorPercent, bVar.stressHistoryFactorPercent) && p005kotlin.jvm.internal.s.g(this.timestamp, bVar.timestamp) && p005kotlin.jvm.internal.s.g(this.userProfilePK, bVar.userProfilePK) && p005kotlin.jvm.internal.s.g(this.validSleep, bVar.validSleep) && p005kotlin.jvm.internal.s.g(this.timestampLocal, bVar.timestampLocal) && p005kotlin.jvm.internal.s.g(this.acuteLoad, bVar.acuteLoad) && p005kotlin.jvm.internal.s.g(this.hrvWeeklyAverage, bVar.hrvWeeklyAverage) && p005kotlin.jvm.internal.s.g(this.primaryActivityTracker, bVar.primaryActivityTracker) && p005kotlin.jvm.internal.s.g(this.minutesSinceLastDive, bVar.minutesSinceLastDive);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAcwrFactorFeedback() {
        return this.acwrFactorFeedback;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getAcwrFactorPercent() {
        return this.acwrFactorPercent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final int hashCode() {
        String str = this.acwrFactorFeedback;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.acwrFactorPercent;
        int iJ = wr.g.j((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.calendarDate);
        Long l14 = this.deviceId;
        int iHashCode2 = (iJ + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.feedbackLong;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackShort;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hrvFactorFeedback;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.hrvFactorPercent;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.inputContext;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.level;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.recoveryTime;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.recoveryTimeFactorFeedback;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.recoveryTimeFactorPercent;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f14 = this.score;
        int iHashCode12 = (iHashCode11 + (f14 == null ? 0 : f14.hashCode())) * 31;
        String str8 = this.sleepHistoryFactorFeedback;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.sleepHistoryFactorPercent;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.sleepScore;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str9 = this.sleepScoreFactorFeedback;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num7 = this.sleepScoreFactorPercent;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str10 = this.stressHistoryFactorFeedback;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num8 = this.stressHistoryFactorPercent;
        int iHashCode19 = (iHashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str11 = this.timestamp;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num9 = this.userProfilePK;
        int iHashCode21 = (iHashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool = this.validSleep;
        int iHashCode22 = (iHashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.timestampLocal;
        int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num10 = this.acuteLoad;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.hrvWeeklyAverage;
        int iHashCode25 = (iHashCode24 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool2 = this.primaryActivityTracker;
        int iHashCode26 = (iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num12 = this.minutesSinceLastDive;
        return iHashCode26 + (num12 != null ? num12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFeedbackLong() {
        return this.feedbackLong;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFeedbackShort() {
        return this.feedbackShort;
    }

    public final boolean k() {
        return (this.score == null && this.level == null && this.feedbackShort == null && this.validSleep == null && this.sleepScoreFactorFeedback == null && this.recoveryTimeFactorFeedback == null && this.hrvFactorFeedback == null && this.acwrFactorFeedback == null && this.sleepHistoryFactorFeedback == null && this.stressHistoryFactorFeedback == null && this.timestamp == null) ? false : true;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getHrvFactorFeedback() {
        return this.hrvFactorFeedback;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getHrvWeeklyAverage() {
        return this.hrvWeeklyAverage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getInputContext() {
        return this.inputContext;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    public final DateTime s() {
        DateTime dateTimeI = j0.I(this.calendarDate);
        return dateTimeI == null ? DateTime.now() : dateTimeI;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getMinutesSinceLastDive() {
        return this.minutesSinceLastDive;
    }

    public final String toString() {
        String str = this.acwrFactorFeedback;
        Integer num = this.acwrFactorPercent;
        String str2 = this.calendarDate;
        Long l14 = this.deviceId;
        String str3 = this.feedbackLong;
        String str4 = this.feedbackShort;
        String str5 = this.hrvFactorFeedback;
        Integer num2 = this.hrvFactorPercent;
        String str6 = this.inputContext;
        String str7 = this.level;
        Integer num3 = this.recoveryTime;
        String str8 = this.recoveryTimeFactorFeedback;
        Integer num4 = this.recoveryTimeFactorPercent;
        Float f14 = this.score;
        String str9 = this.sleepHistoryFactorFeedback;
        Integer num5 = this.sleepHistoryFactorPercent;
        Integer num6 = this.sleepScore;
        String str10 = this.sleepScoreFactorFeedback;
        Integer num7 = this.sleepScoreFactorPercent;
        String str11 = this.stressHistoryFactorFeedback;
        Integer num8 = this.stressHistoryFactorPercent;
        String str12 = this.timestamp;
        Integer num9 = this.userProfilePK;
        Boolean bool = this.validSleep;
        String str13 = this.timestampLocal;
        Integer num10 = this.acuteLoad;
        Integer num11 = this.hrvWeeklyAverage;
        Boolean bool2 = this.primaryActivityTracker;
        Integer num12 = this.minutesSinceLastDive;
        StringBuilder sbN = u0.n("TrainingReadinessDTO(acwrFactorFeedback=", num, str, ", acwrFactorPercent=", ", calendarDate=");
        n23.j.q(l14, str2, ", deviceId=", ", feedbackLong=", sbN);
        sn.a.t(sbN, str3, ", feedbackShort=", str4, ", hrvFactorFeedback=");
        fb1.c.u(num2, str5, ", hrvFactorPercent=", ", inputContext=", sbN);
        sn.a.t(sbN, str6, ", level=", str7, ", recoveryTime=");
        p6.b.l(num3, ", recoveryTimeFactorFeedback=", str8, ", recoveryTimeFactorPercent=", sbN);
        sbN.append(num4);
        sbN.append(", score=");
        sbN.append(f14);
        sbN.append(", sleepHistoryFactorFeedback=");
        fb1.c.u(num5, str9, ", sleepHistoryFactorPercent=", ", sleepScore=", sbN);
        p6.b.l(num6, ", sleepScoreFactorFeedback=", str10, ", sleepScoreFactorPercent=", sbN);
        p6.b.l(num7, ", stressHistoryFactorFeedback=", str11, ", stressHistoryFactorPercent=", sbN);
        p6.b.l(num8, ", timestamp=", str12, ", userProfilePK=", sbN);
        kg.f.r(sbN, num9, ", validSleep=", bool, ", timestampLocal=");
        fb1.c.u(num10, str13, ", acuteLoad=", ", hrvWeeklyAverage=", sbN);
        kg.f.r(sbN, num11, ", primaryActivityTracker=", bool2, ", minutesSinceLastDive=");
        return f3.i(sbN, num12, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getPrimaryActivityTracker() {
        return this.primaryActivityTracker;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.acwrFactorFeedback);
        Integer num = this.acwrFactorPercent;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.calendarDate);
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.feedbackLong);
        parcel.writeString(this.feedbackShort);
        parcel.writeString(this.hrvFactorFeedback);
        Integer num2 = this.hrvFactorPercent;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.inputContext);
        parcel.writeString(this.level);
        Integer num3 = this.recoveryTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.recoveryTimeFactorFeedback);
        Integer num4 = this.recoveryTimeFactorPercent;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Float f14 = this.score;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
        parcel.writeString(this.sleepHistoryFactorFeedback);
        Integer num5 = this.sleepHistoryFactorPercent;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.sleepScore;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        parcel.writeString(this.sleepScoreFactorFeedback);
        Integer num7 = this.sleepScoreFactorPercent;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        parcel.writeString(this.stressHistoryFactorFeedback);
        Integer num8 = this.stressHistoryFactorPercent;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        parcel.writeString(this.timestamp);
        Integer num9 = this.userProfilePK;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num9);
        }
        Boolean bool = this.validSleep;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.timestampLocal);
        Integer num10 = this.acuteLoad;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num10);
        }
        Integer num11 = this.hrvWeeklyAverage;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num11);
        }
        Boolean bool2 = this.primaryActivityTracker;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Integer num12 = this.minutesSinceLastDive;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num12);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Integer getRecoveryTime() {
        return this.recoveryTime;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getRecoveryTimeFactorFeedback() {
        return this.recoveryTimeFactorFeedback;
    }

    public b(String str, Integer num, String str2, Long l14, String str3, String str4, String str5, Integer num2, String str6, String str7, Integer num3, String str8, Integer num4, Float f14, String str9, Integer num5, Integer num6, String str10, Integer num7, String str11, Integer num8, String str12, Integer num9, Boolean bool, String str13, Integer num10, Integer num11, Boolean bool2, Integer num12) {
        str2.getClass();
        this.acwrFactorFeedback = str;
        this.acwrFactorPercent = num;
        this.calendarDate = str2;
        this.deviceId = l14;
        this.feedbackLong = str3;
        this.feedbackShort = str4;
        this.hrvFactorFeedback = str5;
        this.hrvFactorPercent = num2;
        this.inputContext = str6;
        this.level = str7;
        this.recoveryTime = num3;
        this.recoveryTimeFactorFeedback = str8;
        this.recoveryTimeFactorPercent = num4;
        this.score = f14;
        this.sleepHistoryFactorFeedback = str9;
        this.sleepHistoryFactorPercent = num5;
        this.sleepScore = num6;
        this.sleepScoreFactorFeedback = str10;
        this.sleepScoreFactorPercent = num7;
        this.stressHistoryFactorFeedback = str11;
        this.stressHistoryFactorPercent = num8;
        this.timestamp = str12;
        this.userProfilePK = num9;
        this.validSleep = bool;
        this.timestampLocal = str13;
        this.acuteLoad = num10;
        this.hrvWeeklyAverage = num11;
        this.primaryActivityTracker = bool2;
        this.minutesSinceLastDive = num12;
    }
}
