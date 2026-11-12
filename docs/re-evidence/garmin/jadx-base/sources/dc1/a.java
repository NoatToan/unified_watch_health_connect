package dc1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\bX\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BÛ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b\u0012\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b\u0012\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010)\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010)\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010)\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\b(\u0010T\"\u0004\bU\u0010VR$\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010S\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR$\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR$\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010S\u001a\u0004\bC\u0010T\"\u0004\b^\u0010VR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010)\u001a\u0004\bF\u0010+\"\u0004\b`\u0010-R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\ba\u0010)\u001a\u0004\bb\u0010+\"\u0004\bc\u0010-R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010S\u001a\u0004\b1\u0010T\"\u0004\be\u0010VR$\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010S\u001a\u0004\b7\u0010T\"\u0004\bg\u0010VR2\u0010\u001d\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR2\u0010\u001e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR2\u0010\u001f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010m¨\u0006t"}, d2 = {"Ldc1/a;", "Landroid/os/Parcelable;", "", "userProfilePK", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "tomorrowSleepStartTimestampGMT", "tomorrowSleepEndTimestampGMT", "tomorrowSleepStartTimestampLocal", "tomorrowSleepEndTimestampLocal", "", "averageSpO2", "lowestSpO2", "lastSevenDaysAvgSpO2", "latestSpO2", "latestSpO2TimestampGMT", "latestSpO2TimestampLocal", "avgSleepSpO2", "avgTomorrowSleepSpO2", "", "", "spO2SingleValuesArray", "spO2HourlyAveragesArray", "monitoringEnvironmentValuesArray", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;[[Ljava/lang/Object;[[Ljava/lang/Object;[[Ljava/lang/Object;)V", "a", "J", "getUserProfilePK", "()J", "setUserProfilePK", "(J)V", "b", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "setCalendarDate", "(Ljava/lang/String;)V", "c", "getStartTimestampGMT", "setStartTimestampGMT", "d", "getEndTimestampGMT", "setEndTimestampGMT", JWKParameterNames.RSA_EXPONENT, "getStartTimestampLocal", "setStartTimestampLocal", "f", "getEndTimestampLocal", "setEndTimestampLocal", "g", "getSleepStartTimestampGMT", "setSleepStartTimestampGMT", "h", "getSleepEndTimestampGMT", "setSleepEndTimestampGMT", IntegerTokenConverter.CONVERTER_KEY, "getSleepStartTimestampLocal", "setSleepStartTimestampLocal", "j", "getSleepEndTimestampLocal", "setSleepEndTimestampLocal", JWKParameterNames.OCT_KEY_VALUE, "getTomorrowSleepStartTimestampGMT", "setTomorrowSleepStartTimestampGMT", "l", "getTomorrowSleepEndTimestampGMT", "setTomorrowSleepEndTimestampGMT", "m", "getTomorrowSleepStartTimestampLocal", "setTomorrowSleepStartTimestampLocal", JWKParameterNames.RSA_MODULUS, "getTomorrowSleepEndTimestampLocal", "setTomorrowSleepEndTimestampLocal", "o", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setAverageSpO2", "(Ljava/lang/Double;)V", "p", "getLowestSpO2", "setLowestSpO2", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getLastSevenDaysAvgSpO2", "setLastSevenDaysAvgSpO2", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setLatestSpO2", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setLatestSpO2TimestampGMT", "v", "getLatestSpO2TimestampLocal", "setLatestSpO2TimestampLocal", "w", "setAvgSleepSpO2", "x", "setAvgTomorrowSleepSpO2", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "[[Ljava/lang/Object;", "getSpO2SingleValuesArray", "()[[Ljava/lang/Object;", "setSpO2SingleValuesArray", "([[Ljava/lang/Object;)V", "z", "getSpO2HourlyAveragesArray", "setSpO2HourlyAveragesArray", "A", "getMonitoringEnvironmentValuesArray", "setMonitoringEnvironmentValuesArray", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("monitoringEnvironmentValues")
    private Object[][] monitoringEnvironmentValuesArray;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGMT")
    private String startTimestampGMT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGMT")
    private String endTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private String startTimestampLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private String endTimestampLocal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampGMT")
    private String sleepStartTimestampGMT;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampGMT")
    private String sleepEndTimestampGMT;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampLocal")
    private String sleepStartTimestampLocal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampLocal")
    private String sleepEndTimestampLocal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tomorrowSleepStartTimestampGMT")
    private String tomorrowSleepStartTimestampGMT;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tomorrowSleepEndTimestampGMT")
    private String tomorrowSleepEndTimestampGMT;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tomorrowSleepStartTimestampLocal")
    private String tomorrowSleepStartTimestampLocal;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tomorrowSleepEndTimestampLocal")
    private String tomorrowSleepEndTimestampLocal;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpO2")
    private Double averageSpO2;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowestSpO2")
    private Double lowestSpO2;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastSevenDaysAvgSpO2")
    private Double lastSevenDaysAvgSpO2;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestSpO2")
    private Double latestSpO2;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestSpO2TimestampGMT")
    private String latestSpO2TimestampGMT;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestSpO2TimestampLocal")
    private String latestSpO2TimestampLocal;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepSpO2")
    private Double avgSleepSpO2;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgTomorrowSleepSpO2")
    private Double avgTomorrowSleepSpO2;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spO2SingleValues")
    private Object[][] spO2SingleValuesArray;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spO2HourlyAverages")
    private Object[][] spO2HourlyAveragesArray;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Object[][] objArr;
            Object[][] objArr2;
            Object[][] objArr3;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string14 = parcel.readString();
            Double d14 = dValueOf2;
            Double d15 = dValueOf3;
            Double d16 = dValueOf4;
            String string15 = parcel.readString();
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                objArr = null;
            } else {
                int i14 = parcel.readInt();
                Object[][] objArr4 = new Object[i14][];
                int i15 = 0;
                while (i15 != i14) {
                    int i16 = i14;
                    int i17 = parcel.readInt();
                    int i18 = i15;
                    Object[] objArr5 = new Object[i17];
                    int i19 = 0;
                    while (i19 != i17) {
                        objArr5[i19] = parcel.readValue(a.class.getClassLoader());
                        i19++;
                        i17 = i17;
                    }
                    objArr4[i18] = objArr5;
                    i15 = i18 + 1;
                    i14 = i16;
                }
                objArr = objArr4;
            }
            if (parcel.readInt() == 0) {
                objArr2 = null;
            } else {
                int i24 = parcel.readInt();
                Object[][] objArr6 = new Object[i24][];
                int i25 = 0;
                while (i25 != i24) {
                    int i26 = i24;
                    int i27 = parcel.readInt();
                    int i28 = i25;
                    Object[] objArr7 = new Object[i27];
                    int i29 = 0;
                    while (i29 != i27) {
                        objArr7[i29] = parcel.readValue(a.class.getClassLoader());
                        i29++;
                        i27 = i27;
                    }
                    objArr6[i28] = objArr7;
                    i25 = i28 + 1;
                    i24 = i26;
                }
                objArr2 = objArr6;
            }
            if (parcel.readInt() == 0) {
                objArr3 = null;
            } else {
                int i30 = parcel.readInt();
                Object[][] objArr8 = new Object[i30][];
                int i34 = 0;
                while (i34 != i30) {
                    int i35 = i30;
                    int i36 = parcel.readInt();
                    int i37 = i34;
                    Object[] objArr9 = new Object[i36];
                    int i38 = 0;
                    while (i38 != i36) {
                        objArr9[i38] = parcel.readValue(a.class.getClassLoader());
                        i38++;
                        i36 = i36;
                    }
                    objArr8[i37] = objArr9;
                    i34 = i37 + 1;
                    i30 = i35;
                }
                objArr3 = objArr8;
            }
            return new a(j8, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, dValueOf, d14, d15, d16, string14, string15, dValueOf5, dValueOf6, objArr, objArr2, objArr3);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C1257a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Double d14, Double d15, Double d16, Double d17, String str14, String str15, Double d18, Double d19, Object[][] objArr, Object[][] objArr2, Object[][] objArr3, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & 8192) != 0 ? null : str13, (i14 & 16384) != 0 ? null : d14, (32768 & i14) != 0 ? null : d15, (i14 & 65536) != 0 ? null : d16, (i14 & 131072) != 0 ? null : d17, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str14, (i14 & 524288) != 0 ? null : str15, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d18, (i14 & 2097152) != 0 ? null : d19, (i14 & 4194304) != 0 ? null : objArr, (i14 & 8388608) != 0 ? null : objArr2, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : objArr3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAverageSpO2() {
        return this.averageSpO2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAvgSleepSpO2() {
        return this.avgSleepSpO2;
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
        return this.userProfilePK == aVar.userProfilePK && s.g(this.calendarDate, aVar.calendarDate) && s.g(this.startTimestampGMT, aVar.startTimestampGMT) && s.g(this.endTimestampGMT, aVar.endTimestampGMT) && s.g(this.startTimestampLocal, aVar.startTimestampLocal) && s.g(this.endTimestampLocal, aVar.endTimestampLocal) && s.g(this.sleepStartTimestampGMT, aVar.sleepStartTimestampGMT) && s.g(this.sleepEndTimestampGMT, aVar.sleepEndTimestampGMT) && s.g(this.sleepStartTimestampLocal, aVar.sleepStartTimestampLocal) && s.g(this.sleepEndTimestampLocal, aVar.sleepEndTimestampLocal) && s.g(this.tomorrowSleepStartTimestampGMT, aVar.tomorrowSleepStartTimestampGMT) && s.g(this.tomorrowSleepEndTimestampGMT, aVar.tomorrowSleepEndTimestampGMT) && s.g(this.tomorrowSleepStartTimestampLocal, aVar.tomorrowSleepStartTimestampLocal) && s.g(this.tomorrowSleepEndTimestampLocal, aVar.tomorrowSleepEndTimestampLocal) && s.g(this.averageSpO2, aVar.averageSpO2) && s.g(this.lowestSpO2, aVar.lowestSpO2) && s.g(this.lastSevenDaysAvgSpO2, aVar.lastSevenDaysAvgSpO2) && s.g(this.latestSpO2, aVar.latestSpO2) && s.g(this.latestSpO2TimestampGMT, aVar.latestSpO2TimestampGMT) && s.g(this.latestSpO2TimestampLocal, aVar.latestSpO2TimestampLocal) && s.g(this.avgSleepSpO2, aVar.avgSleepSpO2) && s.g(this.avgTomorrowSleepSpO2, aVar.avgTomorrowSleepSpO2) && s.g(this.spO2SingleValuesArray, aVar.spO2SingleValuesArray) && s.g(this.spO2HourlyAveragesArray, aVar.spO2HourlyAveragesArray) && s.g(this.monitoringEnvironmentValuesArray, aVar.monitoringEnvironmentValuesArray);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAvgTomorrowSleepSpO2() {
        return this.avgTomorrowSleepSpO2;
    }

    public final LocalDate g() {
        String str = this.calendarDate;
        if (str != null) {
            return k.v(str, "yyyy-MM-dd");
        }
        return null;
    }

    public final DateTime h() {
        String str = this.endTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userProfilePK) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTimestampGMT;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTimestampGMT;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTimestampLocal;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTimestampLocal;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sleepStartTimestampGMT;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sleepEndTimestampGMT;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sleepStartTimestampLocal;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sleepEndTimestampLocal;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tomorrowSleepStartTimestampGMT;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tomorrowSleepEndTimestampGMT;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tomorrowSleepStartTimestampLocal;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tomorrowSleepEndTimestampLocal;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d14 = this.averageSpO2;
        int iHashCode15 = (iHashCode14 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.lowestSpO2;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.lastSevenDaysAvgSpO2;
        int iHashCode17 = (iHashCode16 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.latestSpO2;
        int iHashCode18 = (iHashCode17 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str14 = this.latestSpO2TimestampGMT;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.latestSpO2TimestampLocal;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Double d18 = this.avgSleepSpO2;
        int iHashCode21 = (iHashCode20 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.avgTomorrowSleepSpO2;
        int iHashCode22 = (iHashCode21 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Object[][] objArr = this.spO2SingleValuesArray;
        int iHashCode23 = (iHashCode22 + (objArr == null ? 0 : Arrays.hashCode(objArr))) * 31;
        Object[][] objArr2 = this.spO2HourlyAveragesArray;
        int iHashCode24 = (iHashCode23 + (objArr2 == null ? 0 : Arrays.hashCode(objArr2))) * 31;
        Object[][] objArr3 = this.monitoringEnvironmentValuesArray;
        return iHashCode24 + (objArr3 != null ? Arrays.hashCode(objArr3) : 0);
    }

    public final DateTime i() {
        String str = this.endTimestampLocal;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getLatestSpO2() {
        return this.latestSpO2;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLatestSpO2TimestampGMT() {
        return this.latestSpO2TimestampGMT;
    }

    public final DateTime m() {
        String str = this.sleepEndTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    public final DateTime o() {
        String str = this.sleepStartTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    public final ArrayList q() {
        Object[][] objArr = this.spO2HourlyAveragesArray;
        if (objArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr2 : objArr) {
            if (objArr2.length == 3) {
                arrayList.add(objArr2);
            }
        }
        ArrayList<Object[]> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Object[] objArr3 = (Object[]) obj;
            if (objArr3[0] != null && objArr3[1] != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        for (Object[] objArr4 : arrayList2) {
            Object obj2 = objArr4[0];
            obj2.getClass();
            long jDoubleValue = (long) ((Double) obj2).doubleValue();
            Object obj3 = objArr4[1];
            obj3.getClass();
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = objArr4[2];
            arrayList3.add(new e(jDoubleValue, dDoubleValue, obj4 instanceof Double ? (Double) obj4 : null));
        }
        return arrayList3;
    }

    public final ArrayList r() {
        Object[][] objArr = this.spO2SingleValuesArray;
        if (objArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr2 : objArr) {
            if (objArr2.length == 3) {
                arrayList.add(objArr2);
            }
        }
        ArrayList<Object[]> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Object[] objArr3 = (Object[]) obj;
            int length = objArr3.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    arrayList2.add(obj);
                    break;
                }
                if (objArr3[i14] == null) {
                    break;
                }
                i14++;
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        for (Object[] objArr4 : arrayList2) {
            Object obj2 = objArr4[0];
            obj2.getClass();
            long jDoubleValue = (long) ((Double) obj2).doubleValue();
            Object obj3 = objArr4[1];
            obj3.getClass();
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = objArr4[2];
            obj4.getClass();
            arrayList3.add(new hc1.c(jDoubleValue, dDoubleValue, ((Boolean) obj4).booleanValue()));
        }
        return arrayList3;
    }

    public final DateTime s() {
        String str = this.startTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    public final DateTime t() {
        String str = this.tomorrowSleepEndTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    public final String toString() {
        long j8 = this.userProfilePK;
        String str = this.calendarDate;
        String str2 = this.startTimestampGMT;
        String str3 = this.endTimestampGMT;
        String str4 = this.startTimestampLocal;
        String str5 = this.endTimestampLocal;
        String str6 = this.sleepStartTimestampGMT;
        String str7 = this.sleepEndTimestampGMT;
        String str8 = this.sleepStartTimestampLocal;
        String str9 = this.sleepEndTimestampLocal;
        String str10 = this.tomorrowSleepStartTimestampGMT;
        String str11 = this.tomorrowSleepEndTimestampGMT;
        String str12 = this.tomorrowSleepStartTimestampLocal;
        String str13 = this.tomorrowSleepEndTimestampLocal;
        Double d14 = this.averageSpO2;
        Double d15 = this.lowestSpO2;
        Double d16 = this.lastSevenDaysAvgSpO2;
        Double d17 = this.latestSpO2;
        String str14 = this.latestSpO2TimestampGMT;
        String str15 = this.latestSpO2TimestampLocal;
        Double d18 = this.avgSleepSpO2;
        Double d19 = this.avgTomorrowSleepSpO2;
        String string = Arrays.toString(this.spO2SingleValuesArray);
        String string2 = Arrays.toString(this.spO2HourlyAveragesArray);
        String string3 = Arrays.toString(this.monitoringEnvironmentValuesArray);
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "DailyPulseOxAcclimationDTO(userProfilePK=", ", calendarDate=", str);
        sn.a.t(sbK, ", startTimestampGMT=", str2, ", endTimestampGMT=", str3);
        sn.a.t(sbK, ", startTimestampLocal=", str4, ", endTimestampLocal=", str5);
        sn.a.t(sbK, ", sleepStartTimestampGMT=", str6, ", sleepEndTimestampGMT=", str7);
        sn.a.t(sbK, ", sleepStartTimestampLocal=", str8, ", sleepEndTimestampLocal=", str9);
        sn.a.t(sbK, ", tomorrowSleepStartTimestampGMT=", str10, ", tomorrowSleepEndTimestampGMT=", str11);
        sn.a.t(sbK, ", tomorrowSleepStartTimestampLocal=", str12, ", tomorrowSleepEndTimestampLocal=", str13);
        sn.a.p(d14, d15, ", averageSpO2=", ", lowestSpO2=", sbK);
        sn.a.p(d16, d17, ", lastSevenDaysAvgSpO2=", ", latestSpO2=", sbK);
        sn.a.t(sbK, ", latestSpO2TimestampGMT=", str14, ", latestSpO2TimestampLocal=", str15);
        sn.a.p(d18, d19, ", avgSleepSpO2=", ", avgTomorrowSleepSpO2=", sbK);
        sn.a.t(sbK, ", spO2SingleValuesArray=", string, ", spO2HourlyAveragesArray=", string2);
        return e0.h(sbK, ", monitoringEnvironmentValuesArray=", string3, ")");
    }

    public final DateTime u() {
        String str = this.tomorrowSleepStartTimestampGMT;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePK);
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.startTimestampGMT);
        parcel.writeString(this.endTimestampGMT);
        parcel.writeString(this.startTimestampLocal);
        parcel.writeString(this.endTimestampLocal);
        parcel.writeString(this.sleepStartTimestampGMT);
        parcel.writeString(this.sleepEndTimestampGMT);
        parcel.writeString(this.sleepStartTimestampLocal);
        parcel.writeString(this.sleepEndTimestampLocal);
        parcel.writeString(this.tomorrowSleepStartTimestampGMT);
        parcel.writeString(this.tomorrowSleepEndTimestampGMT);
        parcel.writeString(this.tomorrowSleepStartTimestampLocal);
        parcel.writeString(this.tomorrowSleepEndTimestampLocal);
        Double d14 = this.averageSpO2;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.lowestSpO2;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.lastSevenDaysAvgSpO2;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.latestSpO2;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        parcel.writeString(this.latestSpO2TimestampGMT);
        parcel.writeString(this.latestSpO2TimestampLocal);
        Double d18 = this.avgSleepSpO2;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.avgTomorrowSleepSpO2;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Object[][] objArr = this.spO2SingleValuesArray;
        if (objArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = objArr.length;
            parcel.writeInt(length);
            for (int i15 = 0; i15 != length; i15++) {
                Object[] objArr2 = objArr[i15];
                int length2 = objArr2.length;
                parcel.writeInt(length2);
                for (int i16 = 0; i16 != length2; i16++) {
                    parcel.writeValue(objArr2[i16]);
                }
            }
        }
        Object[][] objArr3 = this.spO2HourlyAveragesArray;
        if (objArr3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length3 = objArr3.length;
            parcel.writeInt(length3);
            for (int i17 = 0; i17 != length3; i17++) {
                Object[] objArr4 = objArr3[i17];
                int length4 = objArr4.length;
                parcel.writeInt(length4);
                for (int i18 = 0; i18 != length4; i18++) {
                    parcel.writeValue(objArr4[i18]);
                }
            }
        }
        Object[][] objArr5 = this.monitoringEnvironmentValuesArray;
        if (objArr5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        int length5 = objArr5.length;
        parcel.writeInt(length5);
        for (int i19 = 0; i19 != length5; i19++) {
            Object[] objArr6 = objArr5[i19];
            int length6 = objArr6.length;
            parcel.writeInt(length6);
            for (int i24 = 0; i24 != length6; i24++) {
                parcel.writeValue(objArr6[i24]);
            }
        }
    }

    /* JADX INFO: renamed from: dc1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldc1/a$a;", "", "<init>", "()V", "", "CALENDAR_DATE_FORMAT", "Ljava/lang/String;", "DATE_FORMAT", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1257a {
        public /* synthetic */ C1257a(j jVar) {
            this();
        }

        private C1257a() {
        }
    }

    public a(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Double d14, Double d15, Double d16, Double d17, String str14, String str15, Double d18, Double d19, Object[][] objArr, Object[][] objArr2, Object[][] objArr3) {
        this.userProfilePK = j8;
        this.calendarDate = str;
        this.startTimestampGMT = str2;
        this.endTimestampGMT = str3;
        this.startTimestampLocal = str4;
        this.endTimestampLocal = str5;
        this.sleepStartTimestampGMT = str6;
        this.sleepEndTimestampGMT = str7;
        this.sleepStartTimestampLocal = str8;
        this.sleepEndTimestampLocal = str9;
        this.tomorrowSleepStartTimestampGMT = str10;
        this.tomorrowSleepEndTimestampGMT = str11;
        this.tomorrowSleepStartTimestampLocal = str12;
        this.tomorrowSleepEndTimestampLocal = str13;
        this.averageSpO2 = d14;
        this.lowestSpO2 = d15;
        this.lastSevenDaysAvgSpO2 = d16;
        this.latestSpO2 = d17;
        this.latestSpO2TimestampGMT = str14;
        this.latestSpO2TimestampLocal = str15;
        this.avgSleepSpO2 = d18;
        this.avgTomorrowSleepSpO2 = d19;
        this.spO2SingleValuesArray = objArr;
        this.spO2HourlyAveragesArray = objArr2;
        this.monitoringEnvironmentValuesArray = objArr3;
    }

    public a() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }
}
