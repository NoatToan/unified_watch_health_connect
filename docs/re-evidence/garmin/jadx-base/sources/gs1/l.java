package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\br\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010/¢\u0006\u0004\b>\u0010?R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010AR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\bS\u0010IR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010WR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010WR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010U\u001a\u0004\b_\u0010WR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010U\u001a\u0004\ba\u0010WR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010U\u001a\u0004\bc\u0010WR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010U\u001a\u0004\be\u0010WR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010U\u001a\u0004\bg\u0010WR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010U\u001a\u0004\bD\u0010WR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010AR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010j\u001a\u0004\bm\u0010lR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010U\u001a\u0004\bF\u0010WR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010U\u001a\u0004\bJ\u0010WR\u001c\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bN\u0010WR\u001c\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010U\u001a\u0004\bP\u0010WR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010U\u001a\u0004\bR\u0010WR\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010G\u001a\u0004\bX\u0010IR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bL\u0010xR\u001c\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010G\u001a\u0004\bd\u0010IR\u001c\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010G\u001a\u0004\b{\u0010IR\u001c\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010G\u001a\u0004\b}\u0010IR\u001c\u0010,\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010U\u001a\u0004\bB\u0010WR\u001d\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010U\u001a\u0005\b\u0080\u0001\u0010WR\u001e\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010U\u001a\u0005\b\u0082\u0001\u0010WR\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\br\u0010\u0085\u0001R\u001e\u00101\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010G\u001a\u0005\b\u0087\u0001\u0010IR\u001e\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010G\u001a\u0005\b\u0089\u0001\u0010IR\u001e\u00103\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010WR\u001e\u00104\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010U\u001a\u0005\b\u008d\u0001\u0010WR\u001e\u00105\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010WR\u001e\u00106\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010G\u001a\u0005\b\u0091\u0001\u0010IR\u001e\u00107\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010U\u001a\u0005\b\u0093\u0001\u0010WR\u001e\u00108\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010U\u001a\u0005\b\u0095\u0001\u0010WR\u001f\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010A\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010A\u001a\u0006\b\u009a\u0001\u0010\u0098\u0001R\u001e\u0010;\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010G\u001a\u0005\b\u009c\u0001\u0010IR \u0010<\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0084\u0001\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001R \u0010=\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0084\u0001\u001a\u0006\b \u0001\u0010\u0085\u0001¨\u0006¡\u0001"}, d2 = {"Lgs1/l;", "Landroid/os/Parcelable;", "", "_calendarDate", "wellnessStartTimeGmt", "wellnessEndTimeGmt", "wellnessEndTimeLocal", "wellnessStartTimeLocal", "", "activeKilocalories", "consumedKilocalories", "netRemainingKilocalories", "totalKilocalories", "bmrKilocalories", "netCalorieGoal", "", "totalSteps", "dailyStepGoal", "dailyPushesGoal", "totalPushesDistance", "totalPushes", "restStressDuration", "lowStressDuration", "mediumStressDuration", "highStressDuration", "averageStressLevel", "_stressQualifier", "", "measurableAwakeDuration", "measurableAsleepDuration", "bodyBatteryChargedValue", "bodyBatteryDrainedValue", "bodyBatteryHighestValue", "bodyBatteryLowestValue", "bodyBatteryMostRecentValue", "bodyBatteryVersion", "", "Lhx/b;", "bodyBatteryActivityEventList", "Lhx/a;", "bodyBatteryDynamicFeedbackEvent", "floorsAscended", "floorsDescended", "userFloorsAscendedGoal", "abnormalHeartRateAlertsCount", "restingHeartRate", "lastSevenDaysAvgRestingHeartRate", "", "isJetLagDay", "hydrationValueInML", "hydrationGoalInML", "moderateIntensityMinutes", "vigorousIntensityMinutes", "intensityMinutesGoal", "averageSpo2", "lowestSpo2", "latestSpo2", "latestSpo2ReadingTimeGmt", "latestSpo2ReadingTimeLocal", "averageMonitoringEnvironmentAltitude", "includesWellnessData", "includesActivityData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Lhx/a;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "Ljava/lang/Double;", "getActiveKilocalories", "()Ljava/lang/Double;", "g", "getConsumedKilocalories", "h", "getNetRemainingKilocalories", IntegerTokenConverter.CONVERTER_KEY, "getTotalKilocalories", "j", "getBmrKilocalories", JWKParameterNames.OCT_KEY_VALUE, "getNetCalorieGoal", "l", "Ljava/lang/Integer;", "G", "()Ljava/lang/Integer;", "m", "getDailyStepGoal", JWKParameterNames.RSA_MODULUS, "getDailyPushesGoal", "o", "getTotalPushesDistance", "p", "getTotalPushes", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "C", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "z", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "A", "v", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "w", "x", "Ljava/lang/Long;", "getMeasurableAwakeDuration", "()Ljava/lang/Long;", "getMeasurableAsleepDuration", "B", "D", "E", "F", "I", "Ljava/util/List;", "getBodyBatteryActivityEventList", "()Ljava/util/List;", "P", "Lhx/a;", "()Lhx/a;", "T", "X", "u", "Y", "H", "Z", "k0", "getRestingHeartRate", "H0", "getLastSevenDaysAvgRestingHeartRate", "I0", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "J0", "getHydrationValueInML", "K0", "getHydrationGoalInML", "L0", "getModerateIntensityMinutes", "M0", "getVigorousIntensityMinutes", "N0", "getIntensityMinutesGoal", "O0", "getAverageSpo2", "P0", "getLowestSpo2", "Q0", "getLatestSpo2", "R0", "getLatestSpo2ReadingTimeGmt", "()Ljava/lang/String;", "S0", "getLatestSpo2ReadingTimeLocal", "T0", "getAverageMonitoringEnvironmentAltitude", "U0", "getIncludesWellnessData", "V0", "getIncludesActivityData", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public static final int W0 = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("bodyBatteryChargedValue")
    private final Integer bodyBatteryChargedValue;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("bodyBatteryDrainedValue")
    private final Integer bodyBatteryDrainedValue;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("bodyBatteryHighestValue")
    private final Integer bodyBatteryHighestValue;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("bodyBatteryLowestValue")
    private final Integer bodyBatteryLowestValue;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("bodyBatteryMostRecentValue")
    private final Integer bodyBatteryMostRecentValue;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("bodyBatteryVersion")
    private final Double bodyBatteryVersion;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("lastSevenDaysAvgRestingHeartRate")
    private final Integer lastSevenDaysAvgRestingHeartRate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("bodyBatteryActivityEventList")
    private final List<hx.b> bodyBatteryActivityEventList;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("isJetLagDay")
    private final Boolean isJetLagDay;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("hydrationValueInML")
    private final Double hydrationValueInML;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("hydrationGoalInML")
    private final Double hydrationGoalInML;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("moderateIntensityMinutes")
    private final Integer moderateIntensityMinutes;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("vigorousIntensityMinutes")
    private final Integer vigorousIntensityMinutes;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("intensityMinutesGoal")
    private final Integer intensityMinutesGoal;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("averageSpo2")
    private final Double averageSpo2;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("bodyBatteryDynamicFeedbackEvent")
    private final hx.a bodyBatteryDynamicFeedbackEvent;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("lowestSpo2")
    private final Integer lowestSpo2;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("latestSpo2")
    private final Integer latestSpo2;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("latestSpo2ReadingTimeGmt")
    private final String latestSpo2ReadingTimeGmt;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("latestSpo2ReadingTimeLocal")
    private final String latestSpo2ReadingTimeLocal;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("floorsAscended")
    private final Double floorsAscended;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("averageMonitoringEnvironmentAltitude")
    private final Double averageMonitoringEnvironmentAltitude;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("includesWellnessData")
    private final Boolean includesWellnessData;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("includesActivityData")
    private final Boolean includesActivityData;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("floorsDescended")
    private final Double floorsDescended;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("userFloorsAscendedGoal")
    private final Double userFloorsAscendedGoal;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("abnormalHeartRateAlertsCount")
    private final Integer abnormalHeartRateAlertsCount;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessStartTimeGmt")
    private final String wellnessStartTimeGmt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEndTimeGmt")
    private final String wellnessEndTimeGmt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEndTimeLocal")
    private final String wellnessEndTimeLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessStartTimeLocal")
    private final String wellnessStartTimeLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeKilocalories")
    private final Double activeKilocalories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedKilocalories")
    private final Double consumedKilocalories;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("netRemainingKilocalories")
    private final Double netRemainingKilocalories;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalKilocalories")
    private final Double totalKilocalories;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bmrKilocalories")
    private final Double bmrKilocalories;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("netCalorieGoal")
    private final Double netCalorieGoal;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restingHeartRate")
    private final Integer restingHeartRate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSteps")
    private final Integer totalSteps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyStepGoal")
    private final Integer dailyStepGoal;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyPushesGoal")
    private final Integer dailyPushesGoal;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushesDistance")
    private final Integer totalPushesDistance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushes")
    private final Integer totalPushes;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restStressDuration")
    private final Integer restStressDuration;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowStressDuration")
    private final Integer lowStressDuration;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumStressDuration")
    private final Integer mediumStressDuration;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highStressDuration")
    private final Integer highStressDuration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageStressLevel")
    private final Integer averageStressLevel;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stressQualifier")
    private final String _stressQualifier;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurableAwakeDuration")
    private final Long measurableAwakeDuration;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurableAsleepDuration")
    private final Long measurableAsleepDuration;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (true) {
                    str = string3;
                    if (iA == i14) {
                        break;
                    }
                    iA = kg.f.a(hx.b.CREATOR, parcel, arrayList, iA, 1);
                    string3 = str;
                    string4 = string4;
                }
            } else {
                arrayList = null;
                str = string3;
            }
            String str2 = string4;
            hx.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : hx.a.CREATOR.createFromParcel(parcel);
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Double dValueOf11 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf12 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf13 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double d14 = dValueOf8;
            Integer num = numValueOf16;
            Boolean bool = boolValueOf;
            Integer num2 = numValueOf19;
            Double d15 = dValueOf13;
            String string7 = parcel.readString();
            Double d16 = dValueOf9;
            String str3 = str;
            Integer num3 = numValueOf17;
            Double d17 = dValueOf11;
            Integer num4 = numValueOf20;
            Integer num5 = numValueOf22;
            String string8 = parcel.readString();
            Double dValueOf14 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new l(string, string2, str3, str2, string5, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, string6, lValueOf, lValueOf2, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, dValueOf7, arrayList, aVarCreateFromParcel, d14, d16, dValueOf10, num, num3, numValueOf18, bool, d17, dValueOf12, num2, num4, numValueOf21, d15, num5, numValueOf23, string7, string8, dValueOf14, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(String str, String str2, String str3, String str4, String str5, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str6, Long l14, Long l15, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Double d24, List list, hx.a aVar, Double d25, Double d26, Double d27, Integer num16, Integer num17, Integer num18, Boolean bool, Double d28, Double d29, Integer num19, Integer num20, Integer num21, Double d34, Integer num22, Integer num23, String str7, String str8, Double d35, Boolean bool2, Boolean bool3, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        String str9 = (i14 & 1) != 0 ? null : str;
        this(str9, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15, (i14 & 128) != 0 ? null : d16, (i14 & 256) != 0 ? null : d17, (i14 & 512) != 0 ? null : d18, (i14 & 1024) != 0 ? null : d19, (i14 & 2048) != 0 ? null : num, (i14 & 4096) != 0 ? null : num2, (i14 & 8192) != 0 ? null : num3, (i14 & 16384) != 0 ? null : num4, (i14 & 32768) != 0 ? null : num5, (i14 & 65536) != 0 ? null : num6, (i14 & 131072) != 0 ? null : num7, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : num8, (i14 & 524288) != 0 ? null : num9, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num10, (i14 & 2097152) != 0 ? null : str6, (i14 & 4194304) != 0 ? null : l14, (i14 & 8388608) != 0 ? null : l15, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num11, (i14 & 33554432) != 0 ? null : num12, (i14 & 67108864) != 0 ? null : num13, (i14 & 134217728) != 0 ? null : num14, (i14 & 268435456) != 0 ? null : num15, (i14 & 536870912) != 0 ? null : d24, (i14 & 1073741824) != 0 ? null : list, (i14 & Integer.MIN_VALUE) != 0 ? null : aVar, (i15 & 1) != 0 ? null : d25, (i15 & 2) != 0 ? null : d26, (i15 & 4) != 0 ? null : d27, (i15 & 8) != 0 ? null : num16, (i15 & 16) != 0 ? null : num17, (i15 & 32) != 0 ? null : num18, (i15 & 64) != 0 ? null : bool, (i15 & 128) != 0 ? null : d28, (i15 & 256) != 0 ? null : d29, (i15 & 512) != 0 ? null : num19, (i15 & 1024) != 0 ? null : num20, (i15 & 2048) != 0 ? null : num21, (i15 & 4096) != 0 ? null : d34, (i15 & 8192) != 0 ? null : num22, (i15 & 16384) != 0 ? null : num23, (i15 & 32768) != 0 ? null : str7, (i15 & 65536) != 0 ? null : str8, (i15 & 131072) != 0 ? null : d35, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool2, (i15 & 524288) != 0 ? null : bool3);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Integer getMediumStressDuration() {
        return this.mediumStressDuration;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Integer getRestStressDuration() {
        return this.restStressDuration;
    }

    public final DateTime D() {
        return j0.N(this.wellnessStartTimeGmt, true);
    }

    public final s F() {
        s.e eVar = s.f78860b;
        String str = this._stressQualifier;
        eVar.getClass();
        s.c cVar = s.c.f78864c;
        if (p005kotlin.jvm.internal.s.g(str, cVar.f78861a)) {
            return cVar;
        }
        s.a aVar = s.a.f78862c;
        if (p005kotlin.jvm.internal.s.g(str, aVar.f78861a)) {
            return aVar;
        }
        s.f fVar = s.f.f78866c;
        if (p005kotlin.jvm.internal.s.g(str, fVar.f78861a)) {
            return fVar;
        }
        s.i iVar = s.i.f78869c;
        if (p005kotlin.jvm.internal.s.g(str, iVar.f78861a)) {
            return iVar;
        }
        s.d dVar = s.d.f78865c;
        if (p005kotlin.jvm.internal.s.g(str, dVar.f78861a)) {
            return dVar;
        }
        s.b bVar = s.b.f78863c;
        if (p005kotlin.jvm.internal.s.g(str, bVar.f78861a)) {
            return bVar;
        }
        s.g gVar = s.g.f78867c;
        if (p005kotlin.jvm.internal.s.g(str, gVar.f78861a)) {
            return gVar;
        }
        s.j jVar = s.j.f78870c;
        return p005kotlin.jvm.internal.s.g(str, jVar.f78861a) ? jVar : s.h.f78868c;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Double getUserFloorsAscendedGoal() {
        return this.userFloorsAscendedGoal;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getIsJetLagDay() {
        return this.isJetLagDay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAbnormalHeartRateAlertsCount() {
        return this.abnormalHeartRateAlertsCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAverageStressLevel() {
        return this.averageStressLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this._calendarDate, lVar._calendarDate) && p005kotlin.jvm.internal.s.g(this.wellnessStartTimeGmt, lVar.wellnessStartTimeGmt) && p005kotlin.jvm.internal.s.g(this.wellnessEndTimeGmt, lVar.wellnessEndTimeGmt) && p005kotlin.jvm.internal.s.g(this.wellnessEndTimeLocal, lVar.wellnessEndTimeLocal) && p005kotlin.jvm.internal.s.g(this.wellnessStartTimeLocal, lVar.wellnessStartTimeLocal) && p005kotlin.jvm.internal.s.g(this.activeKilocalories, lVar.activeKilocalories) && p005kotlin.jvm.internal.s.g(this.consumedKilocalories, lVar.consumedKilocalories) && p005kotlin.jvm.internal.s.g(this.netRemainingKilocalories, lVar.netRemainingKilocalories) && p005kotlin.jvm.internal.s.g(this.totalKilocalories, lVar.totalKilocalories) && p005kotlin.jvm.internal.s.g(this.bmrKilocalories, lVar.bmrKilocalories) && p005kotlin.jvm.internal.s.g(this.netCalorieGoal, lVar.netCalorieGoal) && p005kotlin.jvm.internal.s.g(this.totalSteps, lVar.totalSteps) && p005kotlin.jvm.internal.s.g(this.dailyStepGoal, lVar.dailyStepGoal) && p005kotlin.jvm.internal.s.g(this.dailyPushesGoal, lVar.dailyPushesGoal) && p005kotlin.jvm.internal.s.g(this.totalPushesDistance, lVar.totalPushesDistance) && p005kotlin.jvm.internal.s.g(this.totalPushes, lVar.totalPushes) && p005kotlin.jvm.internal.s.g(this.restStressDuration, lVar.restStressDuration) && p005kotlin.jvm.internal.s.g(this.lowStressDuration, lVar.lowStressDuration) && p005kotlin.jvm.internal.s.g(this.mediumStressDuration, lVar.mediumStressDuration) && p005kotlin.jvm.internal.s.g(this.highStressDuration, lVar.highStressDuration) && p005kotlin.jvm.internal.s.g(this.averageStressLevel, lVar.averageStressLevel) && p005kotlin.jvm.internal.s.g(this._stressQualifier, lVar._stressQualifier) && p005kotlin.jvm.internal.s.g(this.measurableAwakeDuration, lVar.measurableAwakeDuration) && p005kotlin.jvm.internal.s.g(this.measurableAsleepDuration, lVar.measurableAsleepDuration) && p005kotlin.jvm.internal.s.g(this.bodyBatteryChargedValue, lVar.bodyBatteryChargedValue) && p005kotlin.jvm.internal.s.g(this.bodyBatteryDrainedValue, lVar.bodyBatteryDrainedValue) && p005kotlin.jvm.internal.s.g(this.bodyBatteryHighestValue, lVar.bodyBatteryHighestValue) && p005kotlin.jvm.internal.s.g(this.bodyBatteryLowestValue, lVar.bodyBatteryLowestValue) && p005kotlin.jvm.internal.s.g(this.bodyBatteryMostRecentValue, lVar.bodyBatteryMostRecentValue) && p005kotlin.jvm.internal.s.g(this.bodyBatteryVersion, lVar.bodyBatteryVersion) && p005kotlin.jvm.internal.s.g(this.bodyBatteryActivityEventList, lVar.bodyBatteryActivityEventList) && p005kotlin.jvm.internal.s.g(this.bodyBatteryDynamicFeedbackEvent, lVar.bodyBatteryDynamicFeedbackEvent) && p005kotlin.jvm.internal.s.g(this.floorsAscended, lVar.floorsAscended) && p005kotlin.jvm.internal.s.g(this.floorsDescended, lVar.floorsDescended) && p005kotlin.jvm.internal.s.g(this.userFloorsAscendedGoal, lVar.userFloorsAscendedGoal) && p005kotlin.jvm.internal.s.g(this.abnormalHeartRateAlertsCount, lVar.abnormalHeartRateAlertsCount) && p005kotlin.jvm.internal.s.g(this.restingHeartRate, lVar.restingHeartRate) && p005kotlin.jvm.internal.s.g(this.lastSevenDaysAvgRestingHeartRate, lVar.lastSevenDaysAvgRestingHeartRate) && p005kotlin.jvm.internal.s.g(this.isJetLagDay, lVar.isJetLagDay) && p005kotlin.jvm.internal.s.g(this.hydrationValueInML, lVar.hydrationValueInML) && p005kotlin.jvm.internal.s.g(this.hydrationGoalInML, lVar.hydrationGoalInML) && p005kotlin.jvm.internal.s.g(this.moderateIntensityMinutes, lVar.moderateIntensityMinutes) && p005kotlin.jvm.internal.s.g(this.vigorousIntensityMinutes, lVar.vigorousIntensityMinutes) && p005kotlin.jvm.internal.s.g(this.intensityMinutesGoal, lVar.intensityMinutesGoal) && p005kotlin.jvm.internal.s.g(this.averageSpo2, lVar.averageSpo2) && p005kotlin.jvm.internal.s.g(this.lowestSpo2, lVar.lowestSpo2) && p005kotlin.jvm.internal.s.g(this.latestSpo2, lVar.latestSpo2) && p005kotlin.jvm.internal.s.g(this.latestSpo2ReadingTimeGmt, lVar.latestSpo2ReadingTimeGmt) && p005kotlin.jvm.internal.s.g(this.latestSpo2ReadingTimeLocal, lVar.latestSpo2ReadingTimeLocal) && p005kotlin.jvm.internal.s.g(this.averageMonitoringEnvironmentAltitude, lVar.averageMonitoringEnvironmentAltitude) && p005kotlin.jvm.internal.s.g(this.includesWellnessData, lVar.includesWellnessData) && p005kotlin.jvm.internal.s.g(this.includesActivityData, lVar.includesActivityData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getBodyBatteryChargedValue() {
        return this.bodyBatteryChargedValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getBodyBatteryDrainedValue() {
        return this.bodyBatteryDrainedValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final hx.a getBodyBatteryDynamicFeedbackEvent() {
        return this.bodyBatteryDynamicFeedbackEvent;
    }

    public final int hashCode() {
        String str = this._calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.wellnessStartTimeGmt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wellnessEndTimeGmt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wellnessEndTimeLocal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.wellnessStartTimeLocal;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d14 = this.activeKilocalories;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.consumedKilocalories;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.netRemainingKilocalories;
        int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.totalKilocalories;
        int iHashCode9 = (iHashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.bmrKilocalories;
        int iHashCode10 = (iHashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.netCalorieGoal;
        int iHashCode11 = (iHashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Integer num = this.totalSteps;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dailyStepGoal;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dailyPushesGoal;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalPushesDistance;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.totalPushes;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.restStressDuration;
        int iHashCode17 = (iHashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.lowStressDuration;
        int iHashCode18 = (iHashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.mediumStressDuration;
        int iHashCode19 = (iHashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.highStressDuration;
        int iHashCode20 = (iHashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.averageStressLevel;
        int iHashCode21 = (iHashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str6 = this._stressQualifier;
        int iHashCode22 = (iHashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l14 = this.measurableAwakeDuration;
        int iHashCode23 = (iHashCode22 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.measurableAsleepDuration;
        int iHashCode24 = (iHashCode23 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num11 = this.bodyBatteryChargedValue;
        int iHashCode25 = (iHashCode24 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.bodyBatteryDrainedValue;
        int iHashCode26 = (iHashCode25 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.bodyBatteryHighestValue;
        int iHashCode27 = (iHashCode26 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.bodyBatteryLowestValue;
        int iHashCode28 = (iHashCode27 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.bodyBatteryMostRecentValue;
        int iHashCode29 = (iHashCode28 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Double d24 = this.bodyBatteryVersion;
        int iHashCode30 = (iHashCode29 + (d24 == null ? 0 : d24.hashCode())) * 31;
        List<hx.b> list = this.bodyBatteryActivityEventList;
        int iHashCode31 = (iHashCode30 + (list == null ? 0 : list.hashCode())) * 31;
        hx.a aVar = this.bodyBatteryDynamicFeedbackEvent;
        int iHashCode32 = (iHashCode31 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Double d25 = this.floorsAscended;
        int iHashCode33 = (iHashCode32 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.floorsDescended;
        int iHashCode34 = (iHashCode33 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.userFloorsAscendedGoal;
        int iHashCode35 = (iHashCode34 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Integer num16 = this.abnormalHeartRateAlertsCount;
        int iHashCode36 = (iHashCode35 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.restingHeartRate;
        int iHashCode37 = (iHashCode36 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.lastSevenDaysAvgRestingHeartRate;
        int iHashCode38 = (iHashCode37 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Boolean bool = this.isJetLagDay;
        int iHashCode39 = (iHashCode38 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d28 = this.hydrationValueInML;
        int iHashCode40 = (iHashCode39 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.hydrationGoalInML;
        int iHashCode41 = (iHashCode40 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Integer num19 = this.moderateIntensityMinutes;
        int iHashCode42 = (iHashCode41 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.vigorousIntensityMinutes;
        int iHashCode43 = (iHashCode42 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.intensityMinutesGoal;
        int iHashCode44 = (iHashCode43 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Double d34 = this.averageSpo2;
        int iHashCode45 = (iHashCode44 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Integer num22 = this.lowestSpo2;
        int iHashCode46 = (iHashCode45 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.latestSpo2;
        int iHashCode47 = (iHashCode46 + (num23 == null ? 0 : num23.hashCode())) * 31;
        String str7 = this.latestSpo2ReadingTimeGmt;
        int iHashCode48 = (iHashCode47 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.latestSpo2ReadingTimeLocal;
        int iHashCode49 = (iHashCode48 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d35 = this.averageMonitoringEnvironmentAltitude;
        int iHashCode50 = (iHashCode49 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Boolean bool2 = this.includesWellnessData;
        int iHashCode51 = (iHashCode50 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.includesActivityData;
        return iHashCode51 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getBodyBatteryHighestValue() {
        return this.bodyBatteryHighestValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getBodyBatteryLowestValue() {
        return this.bodyBatteryLowestValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getBodyBatteryMostRecentValue() {
        return this.bodyBatteryMostRecentValue;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getBodyBatteryVersion() {
        return this.bodyBatteryVersion;
    }

    public final DateTime o() {
        DateTime dateTimeI = j0.I(this._calendarDate);
        return dateTimeI == null ? DateTime.now() : dateTimeI;
    }

    public final LocalDate q() {
        return g22.k.w(this._calendarDate, "yyyy-MM-dd");
    }

    public final DateTime r() {
        return j0.N(this.wellnessEndTimeGmt, true);
    }

    public final DateTime s() {
        return j0.N(this.wellnessEndTimeLocal, true);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getFloorsAscended() {
        return this.floorsAscended;
    }

    public final String toString() {
        String str = this._calendarDate;
        String str2 = this.wellnessStartTimeGmt;
        String str3 = this.wellnessEndTimeGmt;
        String str4 = this.wellnessEndTimeLocal;
        String str5 = this.wellnessStartTimeLocal;
        Double d14 = this.activeKilocalories;
        Double d15 = this.consumedKilocalories;
        Double d16 = this.netRemainingKilocalories;
        Double d17 = this.totalKilocalories;
        Double d18 = this.bmrKilocalories;
        Double d19 = this.netCalorieGoal;
        Integer num = this.totalSteps;
        Integer num2 = this.dailyStepGoal;
        Integer num3 = this.dailyPushesGoal;
        Integer num4 = this.totalPushesDistance;
        Integer num5 = this.totalPushes;
        Integer num6 = this.restStressDuration;
        Integer num7 = this.lowStressDuration;
        Integer num8 = this.mediumStressDuration;
        Integer num9 = this.highStressDuration;
        Integer num10 = this.averageStressLevel;
        String str6 = this._stressQualifier;
        Long l14 = this.measurableAwakeDuration;
        Long l15 = this.measurableAsleepDuration;
        Integer num11 = this.bodyBatteryChargedValue;
        Integer num12 = this.bodyBatteryDrainedValue;
        Integer num13 = this.bodyBatteryHighestValue;
        Integer num14 = this.bodyBatteryLowestValue;
        Integer num15 = this.bodyBatteryMostRecentValue;
        Double d24 = this.bodyBatteryVersion;
        List<hx.b> list = this.bodyBatteryActivityEventList;
        hx.a aVar = this.bodyBatteryDynamicFeedbackEvent;
        Double d25 = this.floorsAscended;
        Double d26 = this.floorsDescended;
        Double d27 = this.userFloorsAscendedGoal;
        Integer num16 = this.abnormalHeartRateAlertsCount;
        Integer num17 = this.restingHeartRate;
        Integer num18 = this.lastSevenDaysAvgRestingHeartRate;
        Boolean bool = this.isJetLagDay;
        Double d28 = this.hydrationValueInML;
        Double d29 = this.hydrationGoalInML;
        Integer num19 = this.moderateIntensityMinutes;
        Integer num20 = this.vigorousIntensityMinutes;
        Integer num21 = this.intensityMinutesGoal;
        Double d34 = this.averageSpo2;
        Integer num22 = this.lowestSpo2;
        Integer num23 = this.latestSpo2;
        String str7 = this.latestSpo2ReadingTimeGmt;
        String str8 = this.latestSpo2ReadingTimeLocal;
        Double d35 = this.averageMonitoringEnvironmentAltitude;
        Boolean bool2 = this.includesWellnessData;
        Boolean bool3 = this.includesActivityData;
        StringBuilder sbI = p6.b.i("DailySummary(_calendarDate=", str, ", wellnessStartTimeGmt=", str2, ", wellnessEndTimeGmt=");
        sn.a.t(sbI, str3, ", wellnessEndTimeLocal=", str4, ", wellnessStartTimeLocal=");
        b71.i.x(sbI, str5, ", activeKilocalories=", d14, ", consumedKilocalories=");
        b71.i.p(d15, d16, ", netRemainingKilocalories=", ", totalKilocalories=", sbI);
        b71.i.p(d17, d18, ", bmrKilocalories=", ", netCalorieGoal=", sbI);
        b71.i.t(sbI, d19, ", totalSteps=", num, ", dailyStepGoal=");
        j20.x.m(sbI, num2, ", dailyPushesGoal=", num3, ", totalPushesDistance=");
        j20.x.m(sbI, num4, ", totalPushes=", num5, ", restStressDuration=");
        j20.x.m(sbI, num6, ", lowStressDuration=", num7, ", mediumStressDuration=");
        j20.x.m(sbI, num8, ", highStressDuration=", num9, ", averageStressLevel=");
        p6.b.l(num10, ", _stressQualifier=", str6, ", measurableAwakeDuration=", sbI);
        kg.f.s(sbI, l14, ", measurableAsleepDuration=", l15, ", bodyBatteryChargedValue=");
        j20.x.m(sbI, num11, ", bodyBatteryDrainedValue=", num12, ", bodyBatteryHighestValue=");
        j20.x.m(sbI, num13, ", bodyBatteryLowestValue=", num14, ", bodyBatteryMostRecentValue=");
        b71.i.v(sbI, num15, ", bodyBatteryVersion=", d24, ", bodyBatteryActivityEventList=");
        sbI.append(list);
        sbI.append(", bodyBatteryDynamicFeedbackEvent=");
        sbI.append(aVar);
        sbI.append(", floorsAscended=");
        b71.i.p(d25, d26, ", floorsDescended=", ", userFloorsAscendedGoal=", sbI);
        b71.i.t(sbI, d27, ", abnormalHeartRateAlertsCount=", num16, ", restingHeartRate=");
        j20.x.m(sbI, num17, ", lastSevenDaysAvgRestingHeartRate=", num18, ", isJetLagDay=");
        sbI.append(bool);
        sbI.append(", hydrationValueInML=");
        sbI.append(d28);
        sbI.append(", hydrationGoalInML=");
        b71.i.t(sbI, d29, ", moderateIntensityMinutes=", num19, ", vigorousIntensityMinutes=");
        j20.x.m(sbI, num20, ", intensityMinutesGoal=", num21, ", averageSpo2=");
        b71.i.t(sbI, d34, ", lowestSpo2=", num22, ", latestSpo2=");
        p6.b.l(num23, ", latestSpo2ReadingTimeGmt=", str7, ", latestSpo2ReadingTimeLocal=", sbI);
        b71.i.x(sbI, str8, ", averageMonitoringEnvironmentAltitude=", d35, ", includesWellnessData=");
        sbI.append(bool2);
        sbI.append(", includesActivityData=");
        sbI.append(bool3);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getFloorsDescended() {
        return this.floorsDescended;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this._calendarDate);
        parcel.writeString(this.wellnessStartTimeGmt);
        parcel.writeString(this.wellnessEndTimeGmt);
        parcel.writeString(this.wellnessEndTimeLocal);
        parcel.writeString(this.wellnessStartTimeLocal);
        Double d14 = this.activeKilocalories;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.consumedKilocalories;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.netRemainingKilocalories;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.totalKilocalories;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.bmrKilocalories;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.netCalorieGoal;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Integer num = this.totalSteps;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.dailyStepGoal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.dailyPushesGoal;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.totalPushesDistance;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.totalPushes;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.restStressDuration;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Integer num7 = this.lowStressDuration;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        Integer num8 = this.mediumStressDuration;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        Integer num9 = this.highStressDuration;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num9);
        }
        Integer num10 = this.averageStressLevel;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num10);
        }
        parcel.writeString(this._stressQualifier);
        Long l14 = this.measurableAwakeDuration;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.measurableAsleepDuration;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num11 = this.bodyBatteryChargedValue;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num11);
        }
        Integer num12 = this.bodyBatteryDrainedValue;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num12);
        }
        Integer num13 = this.bodyBatteryHighestValue;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num13);
        }
        Integer num14 = this.bodyBatteryLowestValue;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num14);
        }
        Integer num15 = this.bodyBatteryMostRecentValue;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num15);
        }
        Double d24 = this.bodyBatteryVersion;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        List<hx.b> list = this.bodyBatteryActivityEventList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((hx.b) itO.next()).writeToParcel(parcel, i14);
            }
        }
        hx.a aVar = this.bodyBatteryDynamicFeedbackEvent;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Double d25 = this.floorsAscended;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.floorsDescended;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.userFloorsAscendedGoal;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Integer num16 = this.abnormalHeartRateAlertsCount;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num16);
        }
        Integer num17 = this.restingHeartRate;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num17);
        }
        Integer num18 = this.lastSevenDaysAvgRestingHeartRate;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num18);
        }
        Boolean bool = this.isJetLagDay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Double d28 = this.hydrationValueInML;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.hydrationGoalInML;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Integer num19 = this.moderateIntensityMinutes;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num19);
        }
        Integer num20 = this.vigorousIntensityMinutes;
        if (num20 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num20);
        }
        Integer num21 = this.intensityMinutesGoal;
        if (num21 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num21);
        }
        Double d34 = this.averageSpo2;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Integer num22 = this.lowestSpo2;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num22);
        }
        Integer num23 = this.latestSpo2;
        if (num23 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num23);
        }
        parcel.writeString(this.latestSpo2ReadingTimeGmt);
        parcel.writeString(this.latestSpo2ReadingTimeLocal);
        Double d35 = this.averageMonitoringEnvironmentAltitude;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Boolean bool2 = this.includesWellnessData;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.includesActivityData;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Integer getHighStressDuration() {
        return this.highStressDuration;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Integer getLowStressDuration() {
        return this.lowStressDuration;
    }

    public l(String str, String str2, String str3, String str4, String str5, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str6, Long l14, Long l15, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Double d24, List<hx.b> list, hx.a aVar, Double d25, Double d26, Double d27, Integer num16, Integer num17, Integer num18, Boolean bool, Double d28, Double d29, Integer num19, Integer num20, Integer num21, Double d34, Integer num22, Integer num23, String str7, String str8, Double d35, Boolean bool2, Boolean bool3) {
        this._calendarDate = str;
        this.wellnessStartTimeGmt = str2;
        this.wellnessEndTimeGmt = str3;
        this.wellnessEndTimeLocal = str4;
        this.wellnessStartTimeLocal = str5;
        this.activeKilocalories = d14;
        this.consumedKilocalories = d15;
        this.netRemainingKilocalories = d16;
        this.totalKilocalories = d17;
        this.bmrKilocalories = d18;
        this.netCalorieGoal = d19;
        this.totalSteps = num;
        this.dailyStepGoal = num2;
        this.dailyPushesGoal = num3;
        this.totalPushesDistance = num4;
        this.totalPushes = num5;
        this.restStressDuration = num6;
        this.lowStressDuration = num7;
        this.mediumStressDuration = num8;
        this.highStressDuration = num9;
        this.averageStressLevel = num10;
        this._stressQualifier = str6;
        this.measurableAwakeDuration = l14;
        this.measurableAsleepDuration = l15;
        this.bodyBatteryChargedValue = num11;
        this.bodyBatteryDrainedValue = num12;
        this.bodyBatteryHighestValue = num13;
        this.bodyBatteryLowestValue = num14;
        this.bodyBatteryMostRecentValue = num15;
        this.bodyBatteryVersion = d24;
        this.bodyBatteryActivityEventList = list;
        this.bodyBatteryDynamicFeedbackEvent = aVar;
        this.floorsAscended = d25;
        this.floorsDescended = d26;
        this.userFloorsAscendedGoal = d27;
        this.abnormalHeartRateAlertsCount = num16;
        this.restingHeartRate = num17;
        this.lastSevenDaysAvgRestingHeartRate = num18;
        this.isJetLagDay = bool;
        this.hydrationValueInML = d28;
        this.hydrationGoalInML = d29;
        this.moderateIntensityMinutes = num19;
        this.vigorousIntensityMinutes = num20;
        this.intensityMinutesGoal = num21;
        this.averageSpo2 = d34;
        this.lowestSpo2 = num22;
        this.latestSpo2 = num23;
        this.latestSpo2ReadingTimeGmt = str7;
        this.latestSpo2ReadingTimeLocal = str8;
        this.averageMonitoringEnvironmentAltitude = d35;
        this.includesWellnessData = bool2;
        this.includesActivityData = bool3;
    }

    public l() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1048575, null);
    }
}
