package pb2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import qb2.r0;
import r1.q2;
import vh.l0;
import vh.p0;
import vh.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b7\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001d?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[Bï\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\u0018\b\u0002\u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010%0\t\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\u0006\u0010)\u001a\u00020\u000e\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\u0006\u0010+\u001a\u00020\u000e\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000e\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\u0006\u0010/\u001a\u00020\u000e\u0012\u0006\u00100\u001a\u00020\u000e\u0012\u0006\u00101\u001a\u00020\u000e\u0012\u0018\b\u0002\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010%0\t\u0012\u0006\u00103\u001a\u00020\u000e\u0012\u0006\u00104\u001a\u00020\u000e\u0012\u0006\u00105\u001a\u00020\u000e\u0012\u0006\u00106\u001a\u00020\u000e\u0012\u0006\u00107\u001a\u00020\u000e\u0012\u0006\u00108\u001a\u00020\u000e\u0012\u0006\u00109\u001a\u00020\u000e\u0012\u0018\b\u0002\u0010:\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010%0\t\u0012\u0006\u0010;\u001a\u00020\u000e\u0012\u0006\u0010<\u001a\u00020\u0003¢\u0006\u0004\b=\u0010>¨\u0006\\"}, d2 = {"Lpb2/e;", "Lvh/s0;", "Lpb2/e$i;", "Lorg/joda/time/DateTime;", "sevenDaysAgo", "fourWeeksAgo", "twelveWeeksAgo", "oneYearAgo", "endDate", "Lvh/p0;", "currentDate", "", "displayName", "userSummariesStartDate", "", "includeBloodPressure", "includeCriticalSwimSpeed", "aggregationCriticalSwimSpeed", "includeDailyNutritionSummary", "includeHeartRate", "includeHeartRateZone", "includeHeartRateVariability", "includeMenstrualCycle", "includeMenstrualLog", "includeSp02Acclimation", "includeSleep", "includeSleepSummaries", "sleepSummariesStartDate", "includeUserDailySummary", "includeWeight", "includeV02Max", "includeTrainingStatusDaily", "includeTrainingStatusWeekly", "includeRunningLactateThreshold", "includeRunningTolerance", "includeRunningEconomy", "includePowerToWeight", "", "powerToWeightSports", "includeHeatAltitudeAcclimation", "includeFunctionalThresholdPower", "includeTrainingReadiness", "includeTrainingLoadBalance", "includeEnduranceScore", "aggregationEnduranceScore", "includeHillScore", "aggregationHillScore", "includeCyclingAbility", "includeUserGoals", "includeEpochChart", "epochCharts", "includeSearchActivities", "includeLatestFitnessAge", "includeDailyEvents", "includePersonalRecords", "includeJetLag", "includeLifestyleLogging", "includeHealthStatus", "excludedActivitySubTypes", "extendDateRange", "extendedDateRangeStart", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lvh/p0;Ljava/lang/String;Lorg/joda/time/DateTime;ZZLjava/lang/String;ZZZZZZZZZLorg/joda/time/DateTime;ZZZZZZZZZLvh/p0;ZZZZZLjava/lang/String;ZLjava/lang/String;ZZZLvh/p0;ZZZZZZZLvh/p0;ZLorg/joda/time/DateTime;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", JWKParameterNames.RSA_MODULUS, "m", "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", "u", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "w", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "a0", "b0", "c0", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class e implements s0<i> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C2597e f136935b0 = new C2597e(null);
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final p0<List<String>> E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public final boolean L;
    public final String M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final p0<List<String>> Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final p0<List<String>> Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f136936a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DateTime f136937a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f136938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f136939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f136940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f136941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0<DateTime> f136942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f136943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f136944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f136945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f136946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f136947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f136948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f136949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f136950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f136951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f136952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f136953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f136954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f136955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f136956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DateTime f136957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f136958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f136959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f136960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f136961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f136962z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/e$a;", "", "", "calories", "", "carbs", "fat", "protein", "caloriesPercentage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f136963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f136964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f136965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f136966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f136967e;

        public a(Integer num, Double d14, Double d15, Double d16, Double d17) {
            this.f136963a = num;
            this.f136964b = d14;
            this.f136965c = d15;
            this.f136966d = d16;
            this.f136967e = d17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f136963a, aVar.f136963a) && p005kotlin.jvm.internal.s.g(this.f136964b, aVar.f136964b) && p005kotlin.jvm.internal.s.g(this.f136965c, aVar.f136965c) && p005kotlin.jvm.internal.s.g(this.f136966d, aVar.f136966d) && p005kotlin.jvm.internal.s.g(this.f136967e, aVar.f136967e);
        }

        public final int hashCode() {
            Integer num = this.f136963a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f136964b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f136965c;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f136966d;
            int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f136967e;
            return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
        }

        public final String toString() {
            return "AverageNutritionContents(calories=" + this.f136963a + ", carbs=" + this.f136964b + ", fat=" + this.f136965c + ", protein=" + this.f136966d + ", caloriesPercentage=" + this.f136967e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/e$a0;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", FirebaseAnalytics.Param.SCORE, "", "classification", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f136968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f136969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f136970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f136971d;

        public a0(DateTime dateTime, DateTime dateTime2, Integer num, String str) {
            dateTime.getClass();
            dateTime2.getClass();
            this.f136968a = dateTime;
            this.f136969b = dateTime2;
            this.f136970c = num;
            this.f136971d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.f136968a.equals(a0Var.f136968a) && this.f136969b.equals(a0Var.f136969b) && p005kotlin.jvm.internal.s.g(this.f136970c, a0Var.f136970c) && p005kotlin.jvm.internal.s.g(this.f136971d, a0Var.f136971d);
        }

        public final int hashCode() {
            int iA = e0.a(this.f136968a.hashCode() * 31, this.f136969b, 31);
            Integer num = this.f136970c;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f136971d;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WeeklyAggregate(startDate=");
            sb3.append(this.f136968a);
            sb3.append(", endDate=");
            sb3.append(this.f136969b);
            sb3.append(", score=");
            sb3.append(this.f136970c);
            sb3.append(", classification=");
            return androidx.room.a0.m(sb3, this.f136971d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/e$b;", "", "", "movementType", "", "count", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f136973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f136974c;

        public b(String str, Integer num, Integer num2) {
            this.f136972a = str;
            this.f136973b = num;
            this.f136974c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f136972a, bVar.f136972a) && p005kotlin.jvm.internal.s.g(this.f136973b, bVar.f136973b) && p005kotlin.jvm.internal.s.g(this.f136974c, bVar.f136974c);
        }

        public final int hashCode() {
            String str = this.f136972a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f136973b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f136974c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "BabyMovement(movementType=" + this.f136972a + ", count=" + this.f136973b + ", duration=" + this.f136974c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpb2/e$b0;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "userProfilePk", "cyclingAbilitiesMap", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f136975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f136976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f136977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f136978d;

        public b0(DateTime dateTime, DateTime dateTime2, Integer num, Object obj) {
            dateTime.getClass();
            dateTime2.getClass();
            this.f136975a = dateTime;
            this.f136976b = dateTime2;
            this.f136977c = num;
            this.f136978d = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return this.f136975a.equals(b0Var.f136975a) && this.f136976b.equals(b0Var.f136976b) && p005kotlin.jvm.internal.s.g(this.f136977c, b0Var.f136977c) && p005kotlin.jvm.internal.s.g(this.f136978d, b0Var.f136978d);
        }

        public final int hashCode() {
            int iA = e0.a(this.f136975a.hashCode() * 31, this.f136976b, 31);
            Integer num = this.f136977c;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            Object obj = this.f136978d;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WeeklyAggregates(startDate=");
            sb3.append(this.f136975a);
            sb3.append(", endDate=");
            sb3.append(this.f136976b);
            sb3.append(", userProfilePk=");
            sb3.append(this.f136977c);
            sb3.append(", cyclingAbilitiesMap=");
            return wr.g.p(sb3, this.f136978d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpb2/e$c;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lpb2/e$d;", "caloriesBurned", "", "Lpb2/e$q;", "mealNutritionContents", "Lpb2/e$h;", "dailyNutritionContents", "Lpb2/e$a;", "averageNutritionContents", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lpb2/e$d;Ljava/util/List;Ljava/util/List;Lpb2/e$a;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f136979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f136980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f136981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<q> f136982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<h> f136983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f136984f;

        public c(DateTime dateTime, DateTime dateTime2, d dVar, List<q> list, List<h> list2, a aVar) {
            dateTime.getClass();
            dateTime2.getClass();
            this.f136979a = dateTime;
            this.f136980b = dateTime2;
            this.f136981c = dVar;
            this.f136982d = list;
            this.f136983e = list2;
            this.f136984f = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f136979a.equals(cVar.f136979a) && this.f136980b.equals(cVar.f136980b) && p005kotlin.jvm.internal.s.g(this.f136981c, cVar.f136981c) && p005kotlin.jvm.internal.s.g(this.f136982d, cVar.f136982d) && p005kotlin.jvm.internal.s.g(this.f136983e, cVar.f136983e) && p005kotlin.jvm.internal.s.g(this.f136984f, cVar.f136984f);
        }

        public final int hashCode() {
            int iA = e0.a(this.f136979a.hashCode() * 31, this.f136980b, 31);
            d dVar = this.f136981c;
            int iHashCode = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
            List<q> list = this.f136982d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<h> list2 = this.f136983e;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            a aVar = this.f136984f;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "CalorieSummaryDailyStats(startDate=" + this.f136979a + ", endDate=" + this.f136980b + ", caloriesBurned=" + this.f136981c + ", mealNutritionContents=" + this.f136982d + ", dailyNutritionContents=" + this.f136983e + ", averageNutritionContents=" + this.f136984f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/e$c0;", "", "", "weekNum", "", "lowWeightGoalInGrams", "highWeightGoalInGrams", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f136985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f136986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f136987c;

        public c0(Integer num, Double d14, Double d15) {
            this.f136985a = num;
            this.f136986b = d14;
            this.f136987c = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return p005kotlin.jvm.internal.s.g(this.f136985a, c0Var.f136985a) && p005kotlin.jvm.internal.s.g(this.f136986b, c0Var.f136986b) && p005kotlin.jvm.internal.s.g(this.f136987c, c0Var.f136987c);
        }

        public final int hashCode() {
            Integer num = this.f136985a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f136986b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f136987c;
            return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            return "WeightGoals(weekNum=" + this.f136985a + ", lowWeightGoalInGrams=" + this.f136986b + ", highWeightGoalInGrams=" + this.f136987c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/e$d;", "", "", "totalCalories", "activeCalories", "restingCalories", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f136988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f136989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f136990c;

        public d(Double d14, Double d15, Double d16) {
            this.f136988a = d14;
            this.f136989b = d15;
            this.f136990c = d16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f136988a, dVar.f136988a) && p005kotlin.jvm.internal.s.g(this.f136989b, dVar.f136989b) && p005kotlin.jvm.internal.s.g(this.f136990c, dVar.f136990c);
        }

        public final int hashCode() {
            Double d14 = this.f136988a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.f136989b;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f136990c;
            return iHashCode2 + (d16 != null ? d16.hashCode() : 0);
        }

        public final String toString() {
            return "CaloriesBurned(totalCalories=" + this.f136988a + ", activeCalories=" + this.f136989b + ", restingCalories=" + this.f136990c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/e$f;", "", "Lorg/joda/time/DateTime;", "calendarDate", "", "totalTracking", "completedTracking", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f136991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f136992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f136993c;

        public f(DateTime dateTime, Integer num, Integer num2) {
            this.f136991a = dateTime;
            this.f136992b = num;
            this.f136993c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f136991a, fVar.f136991a) && p005kotlin.jvm.internal.s.g(this.f136992b, fVar.f136992b) && p005kotlin.jvm.internal.s.g(this.f136993c, fVar.f136993c);
        }

        public final int hashCode() {
            DateTime dateTime = this.f136991a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Integer num = this.f136992b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f136993c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "CompletionStat(calendarDate=" + this.f136991a + ", totalTracking=" + this.f136992b + ", completedTracking=" + this.f136993c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/e$g;", "", "Lpb2/e$m;", "latest", "Lpb2/e$b0;", "weeklyAggregates", "<init>", "(Lpb2/e$m;Lpb2/e$b0;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f136994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f136995b;

        public g(m mVar, b0 b0Var) {
            this.f136994a = mVar;
            this.f136995b = b0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p005kotlin.jvm.internal.s.g(this.f136994a, gVar.f136994a) && p005kotlin.jvm.internal.s.g(this.f136995b, gVar.f136995b);
        }

        public final int hashCode() {
            m mVar = this.f136994a;
            int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
            b0 b0Var = this.f136995b;
            return iHashCode + (b0Var != null ? b0Var.hashCode() : 0);
        }

        public final String toString() {
            return "CyclingAbility(latest=" + this.f136994a + ", weeklyAggregates=" + this.f136995b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpb2/e$h;", "", "Lorg/joda/time/DateTime;", "mealDate", "Lpb2/e$t;", "nutritionContent", "Lpb2/e$v;", "nutritionGoals", "<init>", "(Lorg/joda/time/DateTime;Lpb2/e$t;Lpb2/e$v;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f136996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f136997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f136998c;

        public h(DateTime dateTime, t tVar, v vVar) {
            dateTime.getClass();
            this.f136996a = dateTime;
            this.f136997b = tVar;
            this.f136998c = vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f136996a.equals(hVar.f136996a) && p005kotlin.jvm.internal.s.g(this.f136997b, hVar.f136997b) && p005kotlin.jvm.internal.s.g(this.f136998c, hVar.f136998c);
        }

        public final int hashCode() {
            int iHashCode = this.f136996a.hashCode() * 31;
            t tVar = this.f136997b;
            int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            v vVar = this.f136998c;
            return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
        }

        public final String toString() {
            return "DailyNutritionContent(mealDate=" + this.f136996a + ", nutritionContent=" + this.f136997b + ", nutritionGoals=" + this.f136998c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lpb2/e$i;", "Lvh/s0$a;", "", "__typename", "", "bloodPressureScalar", "criticalSwimSpeedScalar", "Lpb2/e$c;", "calorieSummaryDailyStats", "heartRateScalar", "heartRateZoneScalar", "heartRateVariabilityScalar", "menstrualCycleScalar", "Lpb2/e$r;", "menstrualCycleDetail", "spO2AcclimationScalar", "sleepScalar", "sleepSummariesScalar", "userDailySummaryV2Scalar", "userDailySummaryV2AverageScalar", "latestWeightScalar", "latestVo2MaxScalar", "trainingStatusDailyScalar", "trainingStatusWeeklyScalar", "runningLactateThresholdScalar", "", "Lpb2/e$z;", "runningToleranceStats", "Lpb2/e$y;", "runningEconomy", "powerToWeightScalar", "heatAltitudeAcclimationScalar", "functionalThresholdPowerScalar", "trainingReadinessRangeScalar", "trainingLoadBalanceScalar", "enduranceScoreScalar", "hillScoreScalar", "Lpb2/e$g;", "cyclingAbility", "userGoalsScalar", "epochChartScalar", "searchActivitiesScalar", "latestFitnessAgeScalar", "dailyEventsScalar", "personalRecordsScalar", "jetLagScalar", "Lpb2/e$o;", "lifestyleLoggingStats", "Lpb2/e$l;", "healthStatusSummary", "Lpb2/e$w;", "onQuery", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lpb2/e$c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpb2/e$r;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Lpb2/e$y;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpb2/e$g;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpb2/e$o;Lpb2/e$l;Lpb2/e$w;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class i implements s0.a {
        public final Object A;
        public final Object B;
        public final g C;
        public final Object D;
        public final Object E;
        public final Object F;
        public final Object G;
        public final Object H;
        public final Object I;
        public final Object J;
        public final o K;
        public final l L;
        public final w M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f137000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f137001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f137002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f137003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f137004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f137005g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f137006h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final r f137007i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f137008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Object f137009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f137010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f137011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f137012n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Object f137013o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f137014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Object f137015q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Object f137016r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Object f137017s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final List<z> f137018t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final y f137019u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Object f137020v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Object f137021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Object f137022x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Object f137023y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Object f137024z;

        public i(String str, Object obj, Object obj2, c cVar, Object obj3, Object obj4, Object obj5, Object obj6, r rVar, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, List<z> list, y yVar, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, Object obj23, g gVar, Object obj24, Object obj25, Object obj26, Object obj27, Object obj28, Object obj29, Object obj30, o oVar, l lVar, w wVar) {
            str.getClass();
            this.f136999a = str;
            this.f137000b = obj;
            this.f137001c = obj2;
            this.f137002d = cVar;
            this.f137003e = obj3;
            this.f137004f = obj4;
            this.f137005g = obj5;
            this.f137006h = obj6;
            this.f137007i = rVar;
            this.f137008j = obj7;
            this.f137009k = obj8;
            this.f137010l = obj9;
            this.f137011m = obj10;
            this.f137012n = obj11;
            this.f137013o = obj12;
            this.f137014p = obj13;
            this.f137015q = obj14;
            this.f137016r = obj15;
            this.f137017s = obj16;
            this.f137018t = list;
            this.f137019u = yVar;
            this.f137020v = obj17;
            this.f137021w = obj18;
            this.f137022x = obj19;
            this.f137023y = obj20;
            this.f137024z = obj21;
            this.A = obj22;
            this.B = obj23;
            this.C = gVar;
            this.D = obj24;
            this.E = obj25;
            this.F = obj26;
            this.G = obj27;
            this.H = obj28;
            this.I = obj29;
            this.J = obj30;
            this.K = oVar;
            this.L = lVar;
            this.M = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f136999a.equals(iVar.f136999a) && p005kotlin.jvm.internal.s.g(this.f137000b, iVar.f137000b) && p005kotlin.jvm.internal.s.g(this.f137001c, iVar.f137001c) && p005kotlin.jvm.internal.s.g(this.f137002d, iVar.f137002d) && p005kotlin.jvm.internal.s.g(this.f137003e, iVar.f137003e) && p005kotlin.jvm.internal.s.g(this.f137004f, iVar.f137004f) && p005kotlin.jvm.internal.s.g(this.f137005g, iVar.f137005g) && p005kotlin.jvm.internal.s.g(this.f137006h, iVar.f137006h) && p005kotlin.jvm.internal.s.g(this.f137007i, iVar.f137007i) && p005kotlin.jvm.internal.s.g(this.f137008j, iVar.f137008j) && p005kotlin.jvm.internal.s.g(this.f137009k, iVar.f137009k) && p005kotlin.jvm.internal.s.g(this.f137010l, iVar.f137010l) && p005kotlin.jvm.internal.s.g(this.f137011m, iVar.f137011m) && p005kotlin.jvm.internal.s.g(this.f137012n, iVar.f137012n) && p005kotlin.jvm.internal.s.g(this.f137013o, iVar.f137013o) && p005kotlin.jvm.internal.s.g(this.f137014p, iVar.f137014p) && p005kotlin.jvm.internal.s.g(this.f137015q, iVar.f137015q) && p005kotlin.jvm.internal.s.g(this.f137016r, iVar.f137016r) && p005kotlin.jvm.internal.s.g(this.f137017s, iVar.f137017s) && p005kotlin.jvm.internal.s.g(this.f137018t, iVar.f137018t) && p005kotlin.jvm.internal.s.g(this.f137019u, iVar.f137019u) && p005kotlin.jvm.internal.s.g(this.f137020v, iVar.f137020v) && p005kotlin.jvm.internal.s.g(this.f137021w, iVar.f137021w) && p005kotlin.jvm.internal.s.g(this.f137022x, iVar.f137022x) && p005kotlin.jvm.internal.s.g(this.f137023y, iVar.f137023y) && p005kotlin.jvm.internal.s.g(this.f137024z, iVar.f137024z) && p005kotlin.jvm.internal.s.g(this.A, iVar.A) && p005kotlin.jvm.internal.s.g(this.B, iVar.B) && p005kotlin.jvm.internal.s.g(this.C, iVar.C) && p005kotlin.jvm.internal.s.g(this.D, iVar.D) && p005kotlin.jvm.internal.s.g(this.E, iVar.E) && p005kotlin.jvm.internal.s.g(this.F, iVar.F) && p005kotlin.jvm.internal.s.g(this.G, iVar.G) && p005kotlin.jvm.internal.s.g(this.H, iVar.H) && p005kotlin.jvm.internal.s.g(this.I, iVar.I) && p005kotlin.jvm.internal.s.g(this.J, iVar.J) && p005kotlin.jvm.internal.s.g(this.K, iVar.K) && p005kotlin.jvm.internal.s.g(this.L, iVar.L) && p005kotlin.jvm.internal.s.g(this.M, iVar.M);
        }

        public final int hashCode() {
            int iHashCode = this.f136999a.hashCode() * 31;
            Object obj = this.f137000b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f137001c;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            c cVar = this.f137002d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Object obj3 = this.f137003e;
            int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.f137004f;
            int iHashCode6 = (iHashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            Object obj5 = this.f137005g;
            int iHashCode7 = (iHashCode6 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
            Object obj6 = this.f137006h;
            int iHashCode8 = (iHashCode7 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
            r rVar = this.f137007i;
            int iHashCode9 = (iHashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            Object obj7 = this.f137008j;
            int iHashCode10 = (iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
            Object obj8 = this.f137009k;
            int iHashCode11 = (iHashCode10 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
            Object obj9 = this.f137010l;
            int iHashCode12 = (iHashCode11 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
            Object obj10 = this.f137011m;
            int iHashCode13 = (iHashCode12 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
            Object obj11 = this.f137012n;
            int iHashCode14 = (iHashCode13 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
            Object obj12 = this.f137013o;
            int iHashCode15 = (iHashCode14 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
            Object obj13 = this.f137014p;
            int iHashCode16 = (iHashCode15 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
            Object obj14 = this.f137015q;
            int iHashCode17 = (iHashCode16 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
            Object obj15 = this.f137016r;
            int iHashCode18 = (iHashCode17 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
            Object obj16 = this.f137017s;
            int iHashCode19 = (iHashCode18 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
            List<z> list = this.f137018t;
            int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
            y yVar = this.f137019u;
            int iHashCode21 = (iHashCode20 + (yVar == null ? 0 : yVar.hashCode())) * 31;
            Object obj17 = this.f137020v;
            int iHashCode22 = (iHashCode21 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
            Object obj18 = this.f137021w;
            int iHashCode23 = (iHashCode22 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
            Object obj19 = this.f137022x;
            int iHashCode24 = (iHashCode23 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
            Object obj20 = this.f137023y;
            int iHashCode25 = (iHashCode24 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
            Object obj21 = this.f137024z;
            int iHashCode26 = (iHashCode25 + (obj21 == null ? 0 : obj21.hashCode())) * 31;
            Object obj22 = this.A;
            int iHashCode27 = (iHashCode26 + (obj22 == null ? 0 : obj22.hashCode())) * 31;
            Object obj23 = this.B;
            int iHashCode28 = (iHashCode27 + (obj23 == null ? 0 : obj23.hashCode())) * 31;
            g gVar = this.C;
            int iHashCode29 = (iHashCode28 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Object obj24 = this.D;
            int iHashCode30 = (iHashCode29 + (obj24 == null ? 0 : obj24.hashCode())) * 31;
            Object obj25 = this.E;
            int iHashCode31 = (iHashCode30 + (obj25 == null ? 0 : obj25.hashCode())) * 31;
            Object obj26 = this.F;
            int iHashCode32 = (iHashCode31 + (obj26 == null ? 0 : obj26.hashCode())) * 31;
            Object obj27 = this.G;
            int iHashCode33 = (iHashCode32 + (obj27 == null ? 0 : obj27.hashCode())) * 31;
            Object obj28 = this.H;
            int iHashCode34 = (iHashCode33 + (obj28 == null ? 0 : obj28.hashCode())) * 31;
            Object obj29 = this.I;
            int iHashCode35 = (iHashCode34 + (obj29 == null ? 0 : obj29.hashCode())) * 31;
            Object obj30 = this.J;
            int iHashCode36 = (iHashCode35 + (obj30 == null ? 0 : obj30.hashCode())) * 31;
            o oVar = this.K;
            int iHashCode37 = (iHashCode36 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            l lVar = this.L;
            int iHashCode38 = (iHashCode37 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            w wVar = this.M;
            return iHashCode38 + (wVar != null ? wVar.hashCode() : 0);
        }

        public final String toString() {
            return "Data(__typename=" + this.f136999a + ", bloodPressureScalar=" + this.f137000b + ", criticalSwimSpeedScalar=" + this.f137001c + ", calorieSummaryDailyStats=" + this.f137002d + ", heartRateScalar=" + this.f137003e + ", heartRateZoneScalar=" + this.f137004f + ", heartRateVariabilityScalar=" + this.f137005g + ", menstrualCycleScalar=" + this.f137006h + ", menstrualCycleDetail=" + this.f137007i + ", spO2AcclimationScalar=" + this.f137008j + ", sleepScalar=" + this.f137009k + ", sleepSummariesScalar=" + this.f137010l + ", userDailySummaryV2Scalar=" + this.f137011m + ", userDailySummaryV2AverageScalar=" + this.f137012n + ", latestWeightScalar=" + this.f137013o + ", latestVo2MaxScalar=" + this.f137014p + ", trainingStatusDailyScalar=" + this.f137015q + ", trainingStatusWeeklyScalar=" + this.f137016r + ", runningLactateThresholdScalar=" + this.f137017s + ", runningToleranceStats=" + this.f137018t + ", runningEconomy=" + this.f137019u + ", powerToWeightScalar=" + this.f137020v + ", heatAltitudeAcclimationScalar=" + this.f137021w + ", functionalThresholdPowerScalar=" + this.f137022x + ", trainingReadinessRangeScalar=" + this.f137023y + ", trainingLoadBalanceScalar=" + this.f137024z + ", enduranceScoreScalar=" + this.A + ", hillScoreScalar=" + this.B + ", cyclingAbility=" + this.C + ", userGoalsScalar=" + this.D + ", epochChartScalar=" + this.E + ", searchActivitiesScalar=" + this.F + ", latestFitnessAgeScalar=" + this.G + ", dailyEventsScalar=" + this.H + ", personalRecordsScalar=" + this.I + ", jetLagScalar=" + this.J + ", lifestyleLoggingStats=" + this.K + ", healthStatusSummary=" + this.L + ", onQuery=" + this.M + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpb2/e$j;", "", "", "userProfilePk", "Lorg/joda/time/DateTime;", "calendarDate", "", "", "symptoms", "moods", "discharge", "flow", "sexDrive", "sexualActivity", "notes", "Lorg/joda/time/LocalDateTime;", "reportTimestamp", "Lpb2/e$b;", "babyMovements", "", "hasGlucoseLog", "hasBabyMovement", "ovulationDay", "<init>", "(Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f137025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f137026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f137027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f137028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f137029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f137030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f137031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f137032h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f137033i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LocalDateTime f137034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List<b> f137035k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f137036l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Boolean f137037m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Boolean f137038n;

        public j(Long l14, DateTime dateTime, List<String> list, List<String> list2, List<String> list3, String str, String str2, String str3, String str4, LocalDateTime localDateTime, List<b> list4, Boolean bool, Boolean bool2, Boolean bool3) {
            this.f137025a = l14;
            this.f137026b = dateTime;
            this.f137027c = list;
            this.f137028d = list2;
            this.f137029e = list3;
            this.f137030f = str;
            this.f137031g = str2;
            this.f137032h = str3;
            this.f137033i = str4;
            this.f137034j = localDateTime;
            this.f137035k = list4;
            this.f137036l = bool;
            this.f137037m = bool2;
            this.f137038n = bool3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p005kotlin.jvm.internal.s.g(this.f137025a, jVar.f137025a) && p005kotlin.jvm.internal.s.g(this.f137026b, jVar.f137026b) && p005kotlin.jvm.internal.s.g(this.f137027c, jVar.f137027c) && p005kotlin.jvm.internal.s.g(this.f137028d, jVar.f137028d) && p005kotlin.jvm.internal.s.g(this.f137029e, jVar.f137029e) && p005kotlin.jvm.internal.s.g(this.f137030f, jVar.f137030f) && p005kotlin.jvm.internal.s.g(this.f137031g, jVar.f137031g) && p005kotlin.jvm.internal.s.g(this.f137032h, jVar.f137032h) && p005kotlin.jvm.internal.s.g(this.f137033i, jVar.f137033i) && p005kotlin.jvm.internal.s.g(this.f137034j, jVar.f137034j) && p005kotlin.jvm.internal.s.g(this.f137035k, jVar.f137035k) && p005kotlin.jvm.internal.s.g(this.f137036l, jVar.f137036l) && p005kotlin.jvm.internal.s.g(this.f137037m, jVar.f137037m) && p005kotlin.jvm.internal.s.g(this.f137038n, jVar.f137038n);
        }

        public final int hashCode() {
            Long l14 = this.f137025a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            DateTime dateTime = this.f137026b;
            int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            List<String> list = this.f137027c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f137028d;
            int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.f137029e;
            int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str = this.f137030f;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f137031g;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f137032h;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f137033i;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            LocalDateTime localDateTime = this.f137034j;
            int iHashCode10 = (iHashCode9 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            List<b> list4 = this.f137035k;
            int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool = this.f137036l;
            int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f137037m;
            int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f137038n;
            return iHashCode13 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            return "DayLog(userProfilePk=" + this.f137025a + ", calendarDate=" + this.f137026b + ", symptoms=" + this.f137027c + ", moods=" + this.f137028d + ", discharge=" + this.f137029e + ", flow=" + this.f137030f + ", sexDrive=" + this.f137031g + ", sexualActivity=" + this.f137032h + ", notes=" + this.f137033i + ", reportTimestamp=" + this.f137034j + ", babyMovements=" + this.f137035k + ", hasGlucoseLog=" + this.f137036l + ", hasBabyMovement=" + this.f137037m + ", ovulationDay=" + this.f137038n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpb2/e$k;", "", "Lorg/joda/time/DateTime;", "startDate", "", "dayInCycle", "periodLength", "currentPhase", "lengthOfCurrentPhase", "daysUntilNextPhase", "fertileWindowStart", "lengthOfFertileWindow", "predictedCycleLength", "educationContentMod", "lutealPhaseStart", "", "pregnancyCycle", "numberOfWeek", "dueDate", "deliveryDate", "endDate", "", "Lpb2/e$x;", "overlapCycles", "isPredictedCycle", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/lang/Boolean;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f137039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f137040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f137041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f137042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f137043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f137044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f137045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f137046h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f137047i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f137048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Integer f137049k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f137050l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Integer f137051m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final DateTime f137052n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final DateTime f137053o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final DateTime f137054p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List<x> f137055q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f137056r;

        public k(DateTime dateTime, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool, Integer num11, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, List<x> list, Boolean bool2) {
            this.f137039a = dateTime;
            this.f137040b = num;
            this.f137041c = num2;
            this.f137042d = num3;
            this.f137043e = num4;
            this.f137044f = num5;
            this.f137045g = num6;
            this.f137046h = num7;
            this.f137047i = num8;
            this.f137048j = num9;
            this.f137049k = num10;
            this.f137050l = bool;
            this.f137051m = num11;
            this.f137052n = dateTime2;
            this.f137053o = dateTime3;
            this.f137054p = dateTime4;
            this.f137055q = list;
            this.f137056r = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p005kotlin.jvm.internal.s.g(this.f137039a, kVar.f137039a) && p005kotlin.jvm.internal.s.g(this.f137040b, kVar.f137040b) && p005kotlin.jvm.internal.s.g(this.f137041c, kVar.f137041c) && p005kotlin.jvm.internal.s.g(this.f137042d, kVar.f137042d) && p005kotlin.jvm.internal.s.g(this.f137043e, kVar.f137043e) && p005kotlin.jvm.internal.s.g(this.f137044f, kVar.f137044f) && p005kotlin.jvm.internal.s.g(this.f137045g, kVar.f137045g) && p005kotlin.jvm.internal.s.g(this.f137046h, kVar.f137046h) && p005kotlin.jvm.internal.s.g(this.f137047i, kVar.f137047i) && p005kotlin.jvm.internal.s.g(this.f137048j, kVar.f137048j) && p005kotlin.jvm.internal.s.g(this.f137049k, kVar.f137049k) && p005kotlin.jvm.internal.s.g(this.f137050l, kVar.f137050l) && p005kotlin.jvm.internal.s.g(this.f137051m, kVar.f137051m) && p005kotlin.jvm.internal.s.g(this.f137052n, kVar.f137052n) && p005kotlin.jvm.internal.s.g(this.f137053o, kVar.f137053o) && p005kotlin.jvm.internal.s.g(this.f137054p, kVar.f137054p) && p005kotlin.jvm.internal.s.g(this.f137055q, kVar.f137055q) && p005kotlin.jvm.internal.s.g(this.f137056r, kVar.f137056r);
        }

        public final int hashCode() {
            DateTime dateTime = this.f137039a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Integer num = this.f137040b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f137041c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f137042d;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f137043e;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f137044f;
            int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f137045g;
            int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f137046h;
            int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.f137047i;
            int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.f137048j;
            int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.f137049k;
            int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Boolean bool = this.f137050l;
            int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num11 = this.f137051m;
            int iHashCode13 = (iHashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
            DateTime dateTime2 = this.f137052n;
            int iHashCode14 = (iHashCode13 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
            DateTime dateTime3 = this.f137053o;
            int iHashCode15 = (iHashCode14 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
            DateTime dateTime4 = this.f137054p;
            int iHashCode16 = (iHashCode15 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
            List<x> list = this.f137055q;
            int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool2 = this.f137056r;
            return iHashCode17 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            return "DaySummary(startDate=" + this.f137039a + ", dayInCycle=" + this.f137040b + ", periodLength=" + this.f137041c + ", currentPhase=" + this.f137042d + ", lengthOfCurrentPhase=" + this.f137043e + ", daysUntilNextPhase=" + this.f137044f + ", fertileWindowStart=" + this.f137045g + ", lengthOfFertileWindow=" + this.f137046h + ", predictedCycleLength=" + this.f137047i + ", educationContentMod=" + this.f137048j + ", lutealPhaseStart=" + this.f137049k + ", pregnancyCycle=" + this.f137050l + ", numberOfWeek=" + this.f137051m + ", dueDate=" + this.f137052n + ", deliveryDate=" + this.f137053o + ", endDate=" + this.f137054p + ", overlapCycles=" + this.f137055q + ", isPredictedCycle=" + this.f137056r + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpb2/e$l;", "", "Lorg/joda/time/DateTime;", "calendarDate", "", "outliersCount", "Lorg/joda/time/LocalDateTime;", "createTimestampUTC", "updateTimestampUTC", "", "Lpb2/e$s;", "metrics", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f137057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f137058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDateTime f137059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LocalDateTime f137060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<s> f137061e;

        public l(DateTime dateTime, Integer num, LocalDateTime localDateTime, LocalDateTime localDateTime2, List<s> list) {
            this.f137057a = dateTime;
            this.f137058b = num;
            this.f137059c = localDateTime;
            this.f137060d = localDateTime2;
            this.f137061e = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p005kotlin.jvm.internal.s.g(this.f137057a, lVar.f137057a) && p005kotlin.jvm.internal.s.g(this.f137058b, lVar.f137058b) && p005kotlin.jvm.internal.s.g(this.f137059c, lVar.f137059c) && p005kotlin.jvm.internal.s.g(this.f137060d, lVar.f137060d) && p005kotlin.jvm.internal.s.g(this.f137061e, lVar.f137061e);
        }

        public final int hashCode() {
            DateTime dateTime = this.f137057a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Integer num = this.f137058b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            LocalDateTime localDateTime = this.f137059c;
            int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.f137060d;
            int iHashCode4 = (iHashCode3 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            List<s> list = this.f137061e;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HealthStatusSummary(calendarDate=");
            sb3.append(this.f137057a);
            sb3.append(", outliersCount=");
            sb3.append(this.f137058b);
            sb3.append(", createTimestampUTC=");
            sb3.append(this.f137059c);
            sb3.append(", updateTimestampUTC=");
            sb3.append(this.f137060d);
            sb3.append(", metrics=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f137061e, sb3);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpb2/e$m;", "", "", "userProfilePk", "deviceId", "Lorg/joda/time/DateTime;", "calendarDate", "Lorg/joda/time/LocalDateTime;", "timestamp", "", "primaryTrainingDevice", "", "aerobicEndurance", "aerobicCapacity", "anaerobicCapacity", "", "profileType", "profileTypeFeedback", "aerobicEnduranceFeedback", "aerobicCapacityFeedback", "anaerobicCapacityFeedback", "<init>", "(JJLorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f137062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f137063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f137064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LocalDateTime f137065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Boolean f137066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f137067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f137068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f137069h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f137070i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f137071j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f137072k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f137073l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f137074m;

        public m(long j8, long j14, DateTime dateTime, LocalDateTime localDateTime, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
            dateTime.getClass();
            localDateTime.getClass();
            this.f137062a = j8;
            this.f137063b = j14;
            this.f137064c = dateTime;
            this.f137065d = localDateTime;
            this.f137066e = bool;
            this.f137067f = num;
            this.f137068g = num2;
            this.f137069h = num3;
            this.f137070i = str;
            this.f137071j = str2;
            this.f137072k = str3;
            this.f137073l = str4;
            this.f137074m = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f137062a == mVar.f137062a && this.f137063b == mVar.f137063b && this.f137064c.equals(mVar.f137064c) && this.f137065d.equals(mVar.f137065d) && p005kotlin.jvm.internal.s.g(this.f137066e, mVar.f137066e) && p005kotlin.jvm.internal.s.g(this.f137067f, mVar.f137067f) && p005kotlin.jvm.internal.s.g(this.f137068g, mVar.f137068g) && p005kotlin.jvm.internal.s.g(this.f137069h, mVar.f137069h) && p005kotlin.jvm.internal.s.g(this.f137070i, mVar.f137070i) && p005kotlin.jvm.internal.s.g(this.f137071j, mVar.f137071j) && p005kotlin.jvm.internal.s.g(this.f137072k, mVar.f137072k) && p005kotlin.jvm.internal.s.g(this.f137073l, mVar.f137073l) && p005kotlin.jvm.internal.s.g(this.f137074m, mVar.f137074m);
        }

        public final int hashCode() {
            int iHashCode = (this.f137065d.hashCode() + e0.a(q6.f.e(Long.hashCode(this.f137062a) * 31, 31, this.f137063b), this.f137064c, 31)) * 31;
            Boolean bool = this.f137066e;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f137067f;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f137068g;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f137069h;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str = this.f137070i;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f137071j;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f137072k;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f137073l;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f137074m;
            return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Latest1(userProfilePk=");
            sb3.append(this.f137062a);
            sb3.append(", deviceId=");
            sb3.append(this.f137063b);
            sb3.append(", calendarDate=");
            sb3.append(this.f137064c);
            sb3.append(", timestamp=");
            sb3.append(this.f137065d);
            sb3.append(", primaryTrainingDevice=");
            sb3.append(this.f137066e);
            sb3.append(", aerobicEndurance=");
            sb3.append(this.f137067f);
            sb3.append(", aerobicCapacity=");
            sb3.append(this.f137068g);
            sb3.append(", anaerobicCapacity=");
            sb3.append(this.f137069h);
            sb3.append(", profileType=");
            sb3.append(this.f137070i);
            sb3.append(", profileTypeFeedback=");
            sb3.append(this.f137071j);
            sb3.append(", aerobicEnduranceFeedback=");
            sb3.append(this.f137072k);
            sb3.append(", aerobicCapacityFeedback=");
            sb3.append(this.f137073l);
            sb3.append(", anaerobicCapacityFeedback=");
            return androidx.room.a0.m(sb3, this.f137074m, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpb2/e$n;", "", "Lorg/joda/time/DateTime;", "calendarDate", "", FirebaseAnalytics.Param.SCORE, "", "classification", "<init>", "(Lorg/joda/time/DateTime;ILjava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f137075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f137076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f137077c;

        public n(DateTime dateTime, int i14, String str) {
            dateTime.getClass();
            str.getClass();
            this.f137075a = dateTime;
            this.f137076b = i14;
            this.f137077c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f137075a.equals(nVar.f137075a) && this.f137076b == nVar.f137076b && this.f137077c.equals(nVar.f137077c);
        }

        public final int hashCode() {
            return this.f137077c.hashCode() + q2.d(this.f137076b, this.f137075a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Latest(calendarDate=");
            sb3.append(this.f137075a);
            sb3.append(", score=");
            sb3.append(this.f137076b);
            sb3.append(", classification=");
            return androidx.room.a0.m(sb3, this.f137077c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpb2/e$o;", "", "", "Lpb2/e$f;", "completionStats", "<init>", "(Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f137078a;

        public o(List<f> list) {
            this.f137078a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && p005kotlin.jvm.internal.s.g(this.f137078a, ((o) obj).f137078a);
        }

        public final int hashCode() {
            List<f> list = this.f137078a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f137078a, new StringBuilder("LifestyleLoggingStats(completionStats="));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/e$p;", "", "", "mealId", "", "mealName", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f137079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f137080b;

        public p(Long l14, String str) {
            str.getClass();
            this.f137079a = l14;
            this.f137080b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return p005kotlin.jvm.internal.s.g(this.f137079a, pVar.f137079a) && this.f137080b.equals(pVar.f137080b);
        }

        public final int hashCode() {
            Long l14 = this.f137079a;
            return this.f137080b.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Meal(mealId=");
            sb3.append(this.f137079a);
            sb3.append(", mealName=");
            return androidx.room.a0.m(sb3, this.f137080b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/e$q;", "", "Lpb2/e$p;", "meal", "Lpb2/e$u;", "nutritionContent", "<init>", "(Lpb2/e$p;Lpb2/e$u;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f137081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f137082b;

        public q(p pVar, u uVar) {
            this.f137081a = pVar;
            this.f137082b = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return p005kotlin.jvm.internal.s.g(this.f137081a, qVar.f137081a) && p005kotlin.jvm.internal.s.g(this.f137082b, qVar.f137082b);
        }

        public final int hashCode() {
            p pVar = this.f137081a;
            int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
            u uVar = this.f137082b;
            return iHashCode + (uVar != null ? uVar.hashCode() : 0);
        }

        public final String toString() {
            return "MealNutritionContent(meal=" + this.f137081a + ", nutritionContent=" + this.f137082b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpb2/e$r;", "", "Lpb2/e$k;", "daySummary", "Lpb2/e$j;", "dayLog", "Lpb2/e$c0;", "weightGoals", "<init>", "(Lpb2/e$k;Lpb2/e$j;Lpb2/e$c0;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f137083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f137084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f137085c;

        public r(k kVar, j jVar, c0 c0Var) {
            this.f137083a = kVar;
            this.f137084b = jVar;
            this.f137085c = c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return p005kotlin.jvm.internal.s.g(this.f137083a, rVar.f137083a) && p005kotlin.jvm.internal.s.g(this.f137084b, rVar.f137084b) && p005kotlin.jvm.internal.s.g(this.f137085c, rVar.f137085c);
        }

        public final int hashCode() {
            k kVar = this.f137083a;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            j jVar = this.f137084b;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            c0 c0Var = this.f137085c;
            return iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0);
        }

        public final String toString() {
            return "MenstrualCycleDetail(daySummary=" + this.f137083a + ", dayLog=" + this.f137084b + ", weightGoals=" + this.f137085c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpb2/e$s;", "", "", "value", "baselineUpperLimit", "baselineLowerLimit", "", "status", "percentage", "feedbackKey", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f137086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f137087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f137088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f137089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f137090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f137091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f137092g;

        public s(Double d14, Double d15, Double d16, String str, Double d17, String str2, String str3) {
            this.f137086a = d14;
            this.f137087b = d15;
            this.f137088c = d16;
            this.f137089d = str;
            this.f137090e = d17;
            this.f137091f = str2;
            this.f137092g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return p005kotlin.jvm.internal.s.g(this.f137086a, sVar.f137086a) && p005kotlin.jvm.internal.s.g(this.f137087b, sVar.f137087b) && p005kotlin.jvm.internal.s.g(this.f137088c, sVar.f137088c) && p005kotlin.jvm.internal.s.g(this.f137089d, sVar.f137089d) && p005kotlin.jvm.internal.s.g(this.f137090e, sVar.f137090e) && p005kotlin.jvm.internal.s.g(this.f137091f, sVar.f137091f) && p005kotlin.jvm.internal.s.g(this.f137092g, sVar.f137092g);
        }

        public final int hashCode() {
            Double d14 = this.f137086a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.f137087b;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f137088c;
            int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
            String str = this.f137089d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Double d17 = this.f137090e;
            int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
            String str2 = this.f137091f;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f137092g;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Metric(value=");
            sb3.append(this.f137086a);
            sb3.append(", baselineUpperLimit=");
            sb3.append(this.f137087b);
            sb3.append(", baselineLowerLimit=");
            sb3.append(this.f137088c);
            sb3.append(", status=");
            sb3.append(this.f137089d);
            sb3.append(", percentage=");
            sb3.append(this.f137090e);
            sb3.append(", feedbackKey=");
            sb3.append(this.f137091f);
            sb3.append(", type=");
            return androidx.room.a0.m(sb3, this.f137092g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/e$t;", "", "", "calories", "", "carbs", "fat", "protein", "caloriesPercentage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f137093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f137094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f137095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f137096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f137097e;

        public t(Integer num, Double d14, Double d15, Double d16, Double d17) {
            this.f137093a = num;
            this.f137094b = d14;
            this.f137095c = d15;
            this.f137096d = d16;
            this.f137097e = d17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return p005kotlin.jvm.internal.s.g(this.f137093a, tVar.f137093a) && p005kotlin.jvm.internal.s.g(this.f137094b, tVar.f137094b) && p005kotlin.jvm.internal.s.g(this.f137095c, tVar.f137095c) && p005kotlin.jvm.internal.s.g(this.f137096d, tVar.f137096d) && p005kotlin.jvm.internal.s.g(this.f137097e, tVar.f137097e);
        }

        public final int hashCode() {
            Integer num = this.f137093a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f137094b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f137095c;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f137096d;
            int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f137097e;
            return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
        }

        public final String toString() {
            return "NutritionContent1(calories=" + this.f137093a + ", carbs=" + this.f137094b + ", fat=" + this.f137095c + ", protein=" + this.f137096d + ", caloriesPercentage=" + this.f137097e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/e$u;", "", "", "calories", "", "carbs", "fat", "protein", "caloriesPercentage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f137098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f137099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f137100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f137101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f137102e;

        public u(Integer num, Double d14, Double d15, Double d16, Double d17) {
            this.f137098a = num;
            this.f137099b = d14;
            this.f137100c = d15;
            this.f137101d = d16;
            this.f137102e = d17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return p005kotlin.jvm.internal.s.g(this.f137098a, uVar.f137098a) && p005kotlin.jvm.internal.s.g(this.f137099b, uVar.f137099b) && p005kotlin.jvm.internal.s.g(this.f137100c, uVar.f137100c) && p005kotlin.jvm.internal.s.g(this.f137101d, uVar.f137101d) && p005kotlin.jvm.internal.s.g(this.f137102e, uVar.f137102e);
        }

        public final int hashCode() {
            Integer num = this.f137098a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f137099b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f137100c;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f137101d;
            int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f137102e;
            return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
        }

        public final String toString() {
            return "NutritionContent(calories=" + this.f137098a + ", carbs=" + this.f137099b + ", fat=" + this.f137100c + ", protein=" + this.f137101d + ", caloriesPercentage=" + this.f137102e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpb2/e$v;", "", "", "calories", "adjustedCalories", "", "carbs", "adjustedCarbs", "fat", "adjustedFat", "protein", "adjustedProtein", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f137103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f137104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f137105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f137106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f137107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Double f137108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Double f137109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Double f137110h;

        public v(Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19) {
            this.f137103a = num;
            this.f137104b = num2;
            this.f137105c = d14;
            this.f137106d = d15;
            this.f137107e = d16;
            this.f137108f = d17;
            this.f137109g = d18;
            this.f137110h = d19;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return p005kotlin.jvm.internal.s.g(this.f137103a, vVar.f137103a) && p005kotlin.jvm.internal.s.g(this.f137104b, vVar.f137104b) && p005kotlin.jvm.internal.s.g(this.f137105c, vVar.f137105c) && p005kotlin.jvm.internal.s.g(this.f137106d, vVar.f137106d) && p005kotlin.jvm.internal.s.g(this.f137107e, vVar.f137107e) && p005kotlin.jvm.internal.s.g(this.f137108f, vVar.f137108f) && p005kotlin.jvm.internal.s.g(this.f137109g, vVar.f137109g) && p005kotlin.jvm.internal.s.g(this.f137110h, vVar.f137110h);
        }

        public final int hashCode() {
            Integer num = this.f137103a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f137104b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d14 = this.f137105c;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f137106d;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f137107e;
            int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f137108f;
            int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f137109g;
            int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.f137110h;
            return iHashCode7 + (d19 != null ? d19.hashCode() : 0);
        }

        public final String toString() {
            return "NutritionGoals(calories=" + this.f137103a + ", adjustedCalories=" + this.f137104b + ", carbs=" + this.f137105c + ", adjustedCarbs=" + this.f137106d + ", fat=" + this.f137107e + ", adjustedFat=" + this.f137108f + ", protein=" + this.f137109g + ", adjustedProtein=" + this.f137110h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpb2/e$w;", "", "extendedWeight", "<init>", "(Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f137111a;

        public w(Object obj) {
            this.f137111a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && p005kotlin.jvm.internal.s.g(this.f137111a, ((w) obj).f137111a);
        }

        public final int hashCode() {
            Object obj = this.f137111a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("OnQuery(extendedWeight="), this.f137111a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpb2/e$x;", "", "", "periodLength", "<init>", "(Ljava/lang/Integer;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f137112a;

        public x(Integer num) {
            this.f137112a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && p005kotlin.jvm.internal.s.g(this.f137112a, ((x) obj).f137112a);
        }

        public final int hashCode() {
            Integer num = this.f137112a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "OverlapCycle(periodLength=" + this.f137112a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/e$y;", "", "Lpb2/e$n;", "latest", "", "Lpb2/e$a0;", "weeklyAggregates", "<init>", "(Lpb2/e$n;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f137113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<a0> f137114b;

        public y(n nVar, List<a0> list) {
            list.getClass();
            this.f137113a = nVar;
            this.f137114b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return p005kotlin.jvm.internal.s.g(this.f137113a, yVar.f137113a) && this.f137114b.equals(yVar.f137114b);
        }

        public final int hashCode() {
            n nVar = this.f137113a;
            return this.f137114b.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RunningEconomy(latest=");
            sb3.append(this.f137113a);
            sb3.append(", weeklyAggregates=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f137114b, sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/e$z;", "", "", "userProfilePK", "Lorg/joda/time/DateTime;", "calendarDate", "acuteImpactLoad", "acuteDistance", "acuteTolerance", "<init>", "(JLorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f137115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f137116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f137117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f137118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Long f137119e;

        public z(long j8, DateTime dateTime, Long l14, Long l15, Long l16) {
            dateTime.getClass();
            this.f137115a = j8;
            this.f137116b = dateTime;
            this.f137117c = l14;
            this.f137118d = l15;
            this.f137119e = l16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.f137115a == zVar.f137115a && this.f137116b.equals(zVar.f137116b) && p005kotlin.jvm.internal.s.g(this.f137117c, zVar.f137117c) && p005kotlin.jvm.internal.s.g(this.f137118d, zVar.f137118d) && p005kotlin.jvm.internal.s.g(this.f137119e, zVar.f137119e);
        }

        public final int hashCode() {
            int iA = e0.a(Long.hashCode(this.f137115a) * 31, this.f137116b, 31);
            Long l14 = this.f137117c;
            int iHashCode = (iA + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f137118d;
            int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f137119e;
            return iHashCode2 + (l16 != null ? l16.hashCode() : 0);
        }

        public final String toString() {
            return "RunningToleranceStat(userProfilePK=" + this.f137115a + ", calendarDate=" + this.f137116b + ", acuteImpactLoad=" + this.f137117c + ", acuteDistance=" + this.f137118d + ", acuteTolerance=" + this.f137119e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, p0<DateTime> p0Var, String str, DateTime dateTime6, boolean z14, boolean z15, String str2, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, DateTime dateTime7, boolean z29, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z44, boolean z45, p0<? extends List<String>> p0Var2, boolean z46, boolean z47, boolean z48, boolean z49, boolean z54, String str3, boolean z55, String str4, boolean z56, boolean z57, boolean z58, p0<? extends List<String>> p0Var3, boolean z59, boolean z64, boolean z65, boolean z66, boolean z67, boolean z68, boolean z69, p0<? extends List<String>> p0Var4, boolean z73, DateTime dateTime8) {
        dateTime.getClass();
        dateTime2.getClass();
        dateTime3.getClass();
        dateTime4.getClass();
        dateTime5.getClass();
        p0Var.getClass();
        str.getClass();
        dateTime6.getClass();
        str2.getClass();
        dateTime7.getClass();
        p0Var2.getClass();
        str3.getClass();
        str4.getClass();
        p0Var3.getClass();
        p0Var4.getClass();
        dateTime8.getClass();
        this.f136936a = dateTime;
        this.f136938b = dateTime2;
        this.f136939c = dateTime3;
        this.f136940d = dateTime4;
        this.f136941e = dateTime5;
        this.f136942f = p0Var;
        this.f136943g = str;
        this.f136944h = dateTime6;
        this.f136945i = z14;
        this.f136946j = z15;
        this.f136947k = str2;
        this.f136948l = z16;
        this.f136949m = z17;
        this.f136950n = z18;
        this.f136951o = z19;
        this.f136952p = z24;
        this.f136953q = z25;
        this.f136954r = z26;
        this.f136955s = z27;
        this.f136956t = z28;
        this.f136957u = dateTime7;
        this.f136958v = z29;
        this.f136959w = z34;
        this.f136960x = z35;
        this.f136961y = z36;
        this.f136962z = z37;
        this.A = z38;
        this.B = z39;
        this.C = z44;
        this.D = z45;
        this.E = p0Var2;
        this.F = z46;
        this.G = z47;
        this.H = z48;
        this.I = z49;
        this.J = z54;
        this.K = str3;
        this.L = z55;
        this.M = str4;
        this.N = z56;
        this.O = z57;
        this.P = z58;
        this.Q = p0Var3;
        this.R = z59;
        this.S = z64;
        this.T = z65;
        this.U = z66;
        this.V = z67;
        this.W = z68;
        this.X = z69;
        this.Y = p0Var4;
        this.Z = z73;
        this.f136937a0 = dateTime8;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(qb2.w.f144275a, true);
    }

    @Override // vh.e0
    public final vh.q b() {
        ub2.s0.f169891a.getClass();
        vh.q.a aVar = new vh.q.a("data", ub2.s0.f169892b);
        tb2.e.f163766a.getClass();
        List<vh.w> list = tb2.e.C;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, vh.z zVar) {
        zVar.getClass();
        r0.f144259a.getClass();
        r0.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f136935b0.getClass();
        return "query CommonStatsQuery($sevenDaysAgo: Date!, $fourWeeksAgo: Date!, $twelveWeeksAgo: Date!, $oneYearAgo: Date!, $endDate: Date!, $currentDate: Date = null , $displayName: String!, $userSummariesStartDate: Date!, $includeBloodPressure: Boolean!, $includeCriticalSwimSpeed: Boolean!, $aggregationCriticalSwimSpeed: String!, $includeDailyNutritionSummary: Boolean!, $includeHeartRate: Boolean!, $includeHeartRateZone: Boolean!, $includeHeartRateVariability: Boolean!, $includeMenstrualCycle: Boolean!, $includeMenstrualLog: Boolean!, $includeSp02Acclimation: Boolean!, $includeSleep: Boolean!, $includeSleepSummaries: Boolean!, $sleepSummariesStartDate: Date!, $includeUserDailySummary: Boolean!, $includeWeight: Boolean!, $includeV02Max: Boolean!, $includeTrainingStatusDaily: Boolean!, $includeTrainingStatusWeekly: Boolean!, $includeRunningLactateThreshold: Boolean!, $includeRunningTolerance: Boolean!, $includeRunningEconomy: Boolean!, $includePowerToWeight: Boolean!, $powerToWeightSports: [String], $includeHeatAltitudeAcclimation: Boolean!, $includeFunctionalThresholdPower: Boolean!, $includeTrainingReadiness: Boolean!, $includeTrainingLoadBalance: Boolean!, $includeEnduranceScore: Boolean!, $aggregationEnduranceScore: String!, $includeHillScore: Boolean!, $aggregationHillScore: String!, $includeCyclingAbility: Boolean!, $includeUserGoals: Boolean!, $includeEpochChart: Boolean!, $epochCharts: [String], $includeSearchActivities: Boolean!, $includeLatestFitnessAge: Boolean!, $includeDailyEvents: Boolean!, $includePersonalRecords: Boolean!, $includeJetLag: Boolean!, $includeLifestyleLogging: Boolean!, $includeHealthStatus: Boolean!, $excludedActivitySubTypes: [String] = null , $extendDateRange: Boolean!, $extendedDateRangeStart: Date!) { __typename bloodPressureScalar(startDate: $sevenDaysAgo, endDate: $endDate) @include(if: $includeBloodPressure) criticalSwimSpeedScalar(startDate: $oneYearAgo, endDate: $endDate, aggregation: $aggregationCriticalSwimSpeed) @include(if: $includeCriticalSwimSpeed) calorieSummaryDailyStats(startDate: $fourWeeksAgo, endDate: $endDate, currentDate: $currentDate) @include(if: $includeDailyNutritionSummary) { startDate endDate caloriesBurned { totalCalories activeCalories restingCalories } mealNutritionContents { meal { mealId mealName } nutritionContent { calories carbs fat protein caloriesPercentage } } dailyNutritionContents { mealDate nutritionContent { calories carbs fat protein caloriesPercentage } nutritionGoals { calories adjustedCalories carbs adjustedCarbs fat adjustedFat protein adjustedProtein } } averageNutritionContents { calories carbs fat protein caloriesPercentage } } heartRateScalar(date: $endDate) @include(if: $includeHeartRate) heartRateZoneScalar @include(if: $includeHeartRateZone) heartRateVariabilityScalar(startDate: $fourWeeksAgo, endDate: $endDate) @include(if: $includeHeartRateVariability) menstrualCycleScalar(date: $endDate) @include(if: $includeMenstrualCycle) menstrualCycleDetail(date: $endDate, todayDate: $endDate) @include(if: $includeMenstrualLog) { daySummary { startDate dayInCycle periodLength currentPhase lengthOfCurrentPhase daysUntilNextPhase fertileWindowStart lengthOfFertileWindow predictedCycleLength educationContentMod lutealPhaseStart pregnancyCycle numberOfWeek dueDate deliveryDate endDate overlapCycles { periodLength } isPredictedCycle } dayLog { userProfilePk calendarDate symptoms moods discharge flow sexDrive sexualActivity notes reportTimestamp babyMovements { movementType count duration } hasGlucoseLog hasBabyMovement ovulationDay } weightGoals { weekNum lowWeightGoalInGrams highWeightGoalInGrams } } spO2AcclimationScalar(date: $endDate) @include(if: $includeSp02Acclimation) sleepScalar(date: $endDate, sleepOnly: true) @include(if: $includeSleep) sleepSummariesScalar(startDate: $sleepSummariesStartDate, endDate: $endDate) @include(if: $includeSleepSummaries) userDailySummaryV2Scalar(startDate: $userSummariesStartDate, endDate: $endDate) @include(if: $includeUserDailySummary) userDailySummaryV2AverageScalar(startDate: $sevenDaysAgo, endDate: $endDate) @include(if: $includeUserDailySummary) latestWeightScalar(asOfDate: $endDate) @include(if: $includeWeight) latestVo2MaxScalar(asOfDate: $endDate) @include(if: $includeV02Max) trainingStatusDailyScalar(calendarDate: $endDate) @include(if: $includeTrainingStatusDaily) trainingStatusWeeklyScalar(startDate: $fourWeeksAgo, endDate: $endDate, displayName: $displayName) @include(if: $includeTrainingStatusWeekly) runningLactateThresholdScalar @include(if: $includeRunningLactateThreshold) runningToleranceStats(startDate: $endDate, endDate: $endDate, aggregation: daily) @include(if: $includeRunningTolerance) { userProfilePK calendarDate acuteImpactLoad acuteDistance acuteTolerance } runningEconomy(startDate: $fourWeeksAgo, endDate: $endDate) @include(if: $includeRunningEconomy) { latest { calendarDate score classification } weeklyAggregates { startDate endDate score classification } } powerToWeightScalar(date: $endDate, sports: $powerToWeightSports) @include(if: $includePowerToWeight) heatAltitudeAcclimationScalar(date: $endDate) @include(if: $includeHeatAltitudeAcclimation) functionalThresholdPowerScalar(startDate: $fourWeeksAgo, endDate: $endDate) @include(if: $includeFunctionalThresholdPower) trainingReadinessRangeScalar(startDate: $fourWeeksAgo, endDate: $endDate) @include(if: $includeTrainingReadiness) trainingLoadBalanceScalar(calendarDate: $endDate) @include(if: $includeTrainingLoadBalance) enduranceScoreScalar(startDate: $twelveWeeksAgo, endDate: $endDate, aggregation: $aggregationEnduranceScore) @include(if: $includeEnduranceScore) hillScoreScalar(startDate: $fourWeeksAgo, endDate: $endDate, aggregation: $aggregationHillScore) @include(if: $includeHillScore) cyclingAbility(startDate: $fourWeeksAgo, endDate: $endDate) @include(if: $includeCyclingAbility) { latest { userProfilePk deviceId calendarDate timestamp primaryTrainingDevice aerobicEndurance aerobicCapacity anaerobicCapacity profileType profileTypeFeedback aerobicEnduranceFeedback aerobicCapacityFeedback anaerobicCapacityFeedback } weeklyAggregates { startDate endDate userProfilePk cyclingAbilitiesMap } } userGoalsScalar @include(if: $includeUserGoals) epochChartScalar(date: $endDate, include: $epochCharts) @include(if: $includeEpochChart) searchActivitiesScalar(start: 0, limit: 1, excludedActivitySubTypes: $excludedActivitySubTypes) @include(if: $includeSearchActivities) latestFitnessAgeScalar(asOfDate: $endDate) @include(if: $includeLatestFitnessAge) dailyEventsScalar(date: $endDate) @include(if: $includeDailyEvents) personalRecordsScalar @include(if: $includePersonalRecords) jetLagScalar(date: $endDate) @include(if: $includeJetLag) lifestyleLoggingStats(startDate: $sevenDaysAgo, endDate: $endDate) @include(if: $includeLifestyleLogging) { completionStats { calendarDate totalTracking completedTracking } } healthStatusSummary(calendarDate: $endDate) @include(if: $includeHealthStatus) { calendarDate outliersCount createTimestampUTC updateTimestampUTC metrics { value baselineUpperLimit baselineLowerLimit status percentage feedbackKey type } } ... on Query @include(if: $extendDateRange) { extendedWeight: weightScalar(startDate: $extendedDateRangeStart, endDate: $endDate) @include(if: $includeWeight) } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f136936a, eVar.f136936a) && p005kotlin.jvm.internal.s.g(this.f136938b, eVar.f136938b) && p005kotlin.jvm.internal.s.g(this.f136939c, eVar.f136939c) && p005kotlin.jvm.internal.s.g(this.f136940d, eVar.f136940d) && p005kotlin.jvm.internal.s.g(this.f136941e, eVar.f136941e) && p005kotlin.jvm.internal.s.g(this.f136942f, eVar.f136942f) && p005kotlin.jvm.internal.s.g(this.f136943g, eVar.f136943g) && p005kotlin.jvm.internal.s.g(this.f136944h, eVar.f136944h) && this.f136945i == eVar.f136945i && this.f136946j == eVar.f136946j && p005kotlin.jvm.internal.s.g(this.f136947k, eVar.f136947k) && this.f136948l == eVar.f136948l && this.f136949m == eVar.f136949m && this.f136950n == eVar.f136950n && this.f136951o == eVar.f136951o && this.f136952p == eVar.f136952p && this.f136953q == eVar.f136953q && this.f136954r == eVar.f136954r && this.f136955s == eVar.f136955s && this.f136956t == eVar.f136956t && p005kotlin.jvm.internal.s.g(this.f136957u, eVar.f136957u) && this.f136958v == eVar.f136958v && this.f136959w == eVar.f136959w && this.f136960x == eVar.f136960x && this.f136961y == eVar.f136961y && this.f136962z == eVar.f136962z && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && p005kotlin.jvm.internal.s.g(this.E, eVar.E) && this.F == eVar.F && this.G == eVar.G && this.H == eVar.H && this.I == eVar.I && this.J == eVar.J && p005kotlin.jvm.internal.s.g(this.K, eVar.K) && this.L == eVar.L && p005kotlin.jvm.internal.s.g(this.M, eVar.M) && this.N == eVar.N && this.O == eVar.O && this.P == eVar.P && p005kotlin.jvm.internal.s.g(this.Q, eVar.Q) && this.R == eVar.R && this.S == eVar.S && this.T == eVar.T && this.U == eVar.U && this.V == eVar.V && this.W == eVar.W && this.X == eVar.X && p005kotlin.jvm.internal.s.g(this.Y, eVar.Y) && this.Z == eVar.Z && p005kotlin.jvm.internal.s.g(this.f136937a0, eVar.f136937a0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v61, types: [int] */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int] */
    /* JADX WARN: Type inference failed for: r0v74, types: [int] */
    /* JADX WARN: Type inference failed for: r0v76, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78, types: [int] */
    /* JADX WARN: Type inference failed for: r0v80, types: [int] */
    /* JADX WARN: Type inference failed for: r0v82, types: [int] */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    /* JADX WARN: Type inference failed for: r0v86, types: [int] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v123 */
    /* JADX WARN: Type inference failed for: r3v124 */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v128 */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v131 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50, types: [int] */
    /* JADX WARN: Type inference failed for: r3v52, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54, types: [int] */
    /* JADX WARN: Type inference failed for: r3v57, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v60, types: [int] */
    /* JADX WARN: Type inference failed for: r3v62, types: [int] */
    /* JADX WARN: Type inference failed for: r3v64, types: [int] */
    /* JADX WARN: Type inference failed for: r3v69, types: [int] */
    /* JADX WARN: Type inference failed for: r3v71, types: [int] */
    /* JADX WARN: Type inference failed for: r3v73, types: [int] */
    /* JADX WARN: Type inference failed for: r3v75, types: [int] */
    /* JADX WARN: Type inference failed for: r3v77, types: [int] */
    /* JADX WARN: Type inference failed for: r3v79, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v81, types: [int] */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    public final int hashCode() {
        int iA = e0.a(wr.g.j((this.f136942f.hashCode() + e0.a(e0.a(e0.a(e0.a(this.f136936a.hashCode() * 31, this.f136938b, 31), this.f136939c, 31), this.f136940d, 31), this.f136941e, 31)) * 31, 31, this.f136943g), this.f136944h, 31);
        boolean z14 = this.f136945i;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iA + r14) * 31;
        boolean z15 = this.f136946j;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int iJ = wr.g.j((i14 + r15) * 31, 31, this.f136947k);
        boolean z16 = this.f136948l;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i15 = (iJ + r16) * 31;
        boolean z17 = this.f136949m;
        ?? r17 = z17;
        if (z17) {
            r17 = 1;
        }
        int i16 = (i15 + r17) * 31;
        boolean z18 = this.f136950n;
        ?? r18 = z18;
        if (z18) {
            r18 = 1;
        }
        int i17 = (i16 + r18) * 31;
        boolean z19 = this.f136951o;
        ?? r19 = z19;
        if (z19) {
            r19 = 1;
        }
        int i18 = (i17 + r19) * 31;
        boolean z24 = this.f136952p;
        ?? r24 = z24;
        if (z24) {
            r24 = 1;
        }
        int i19 = (i18 + r24) * 31;
        boolean z25 = this.f136953q;
        ?? r25 = z25;
        if (z25) {
            r25 = 1;
        }
        int i24 = (i19 + r25) * 31;
        boolean z26 = this.f136954r;
        ?? r26 = z26;
        if (z26) {
            r26 = 1;
        }
        int i25 = (i24 + r26) * 31;
        boolean z27 = this.f136955s;
        ?? r27 = z27;
        if (z27) {
            r27 = 1;
        }
        int i26 = (i25 + r27) * 31;
        boolean z28 = this.f136956t;
        ?? r28 = z28;
        if (z28) {
            r28 = 1;
        }
        int iA2 = e0.a((i26 + r28) * 31, this.f136957u, 31);
        boolean z29 = this.f136958v;
        ?? r29 = z29;
        if (z29) {
            r29 = 1;
        }
        int i27 = (iA2 + r29) * 31;
        boolean z34 = this.f136959w;
        ?? r34 = z34;
        if (z34) {
            r34 = 1;
        }
        int i28 = (i27 + r34) * 31;
        boolean z35 = this.f136960x;
        ?? r35 = z35;
        if (z35) {
            r35 = 1;
        }
        int i29 = (i28 + r35) * 31;
        boolean z36 = this.f136961y;
        ?? r36 = z36;
        if (z36) {
            r36 = 1;
        }
        int i30 = (i29 + r36) * 31;
        boolean z37 = this.f136962z;
        ?? r37 = z37;
        if (z37) {
            r37 = 1;
        }
        int i34 = (i30 + r37) * 31;
        boolean z38 = this.A;
        ?? r38 = z38;
        if (z38) {
            r38 = 1;
        }
        int i35 = (i34 + r38) * 31;
        boolean z39 = this.B;
        ?? r39 = z39;
        if (z39) {
            r39 = 1;
        }
        int i36 = (i35 + r39) * 31;
        boolean z44 = this.C;
        ?? r44 = z44;
        if (z44) {
            r44 = 1;
        }
        int i37 = (i36 + r44) * 31;
        boolean z45 = this.D;
        ?? r45 = z45;
        if (z45) {
            r45 = 1;
        }
        int iHashCode = (this.E.hashCode() + ((i37 + r45) * 31)) * 31;
        boolean z46 = this.F;
        ?? r46 = z46;
        if (z46) {
            r46 = 1;
        }
        int i38 = (iHashCode + r46) * 31;
        boolean z47 = this.G;
        ?? r47 = z47;
        if (z47) {
            r47 = 1;
        }
        int i39 = (i38 + r47) * 31;
        boolean z48 = this.H;
        ?? r48 = z48;
        if (z48) {
            r48 = 1;
        }
        int i44 = (i39 + r48) * 31;
        boolean z49 = this.I;
        ?? r49 = z49;
        if (z49) {
            r49 = 1;
        }
        int i45 = (i44 + r49) * 31;
        boolean z54 = this.J;
        ?? r54 = z54;
        if (z54) {
            r54 = 1;
        }
        int iJ2 = wr.g.j((i45 + r54) * 31, 31, this.K);
        boolean z55 = this.L;
        ?? r55 = z55;
        if (z55) {
            r55 = 1;
        }
        int iJ3 = wr.g.j((iJ2 + r55) * 31, 31, this.M);
        boolean z56 = this.N;
        ?? r56 = z56;
        if (z56) {
            r56 = 1;
        }
        int i46 = (iJ3 + r56) * 31;
        boolean z57 = this.O;
        ?? r57 = z57;
        if (z57) {
            r57 = 1;
        }
        int i47 = (i46 + r57) * 31;
        boolean z58 = this.P;
        ?? r58 = z58;
        if (z58) {
            r58 = 1;
        }
        int iHashCode2 = (this.Q.hashCode() + ((i47 + r58) * 31)) * 31;
        boolean z59 = this.R;
        ?? r59 = z59;
        if (z59) {
            r59 = 1;
        }
        int i48 = (iHashCode2 + r59) * 31;
        boolean z64 = this.S;
        ?? r64 = z64;
        if (z64) {
            r64 = 1;
        }
        int i49 = (i48 + r64) * 31;
        boolean z65 = this.T;
        ?? r65 = z65;
        if (z65) {
            r65 = 1;
        }
        int i54 = (i49 + r65) * 31;
        boolean z66 = this.U;
        ?? r66 = z66;
        if (z66) {
            r66 = 1;
        }
        int i55 = (i54 + r66) * 31;
        boolean z67 = this.V;
        ?? r67 = z67;
        if (z67) {
            r67 = 1;
        }
        int i56 = (i55 + r67) * 31;
        boolean z68 = this.W;
        ?? r68 = z68;
        if (z68) {
            r68 = 1;
        }
        int i57 = (i56 + r68) * 31;
        boolean z69 = this.X;
        ?? r69 = z69;
        if (z69) {
            r69 = 1;
        }
        int iHashCode3 = (this.Y.hashCode() + ((i57 + r69) * 31)) * 31;
        boolean z73 = this.Z;
        return this.f136937a0.hashCode() + ((iHashCode3 + (z73 ? 1 : z73)) * 31);
    }

    @Override // vh.n0
    public final String id() {
        return "a9dd62d60d1282c07fe3b10d1309fbfdd353445231c8401e4ee4d24876a56dfd";
    }

    @Override // vh.n0
    public final String name() {
        return "CommonStatsQuery";
    }

    public final String toString() {
        return "CommonStatsQuery(sevenDaysAgo=" + this.f136936a + ", fourWeeksAgo=" + this.f136938b + ", twelveWeeksAgo=" + this.f136939c + ", oneYearAgo=" + this.f136940d + ", endDate=" + this.f136941e + ", currentDate=" + this.f136942f + ", displayName=" + this.f136943g + ", userSummariesStartDate=" + this.f136944h + ", includeBloodPressure=" + this.f136945i + ", includeCriticalSwimSpeed=" + this.f136946j + ", aggregationCriticalSwimSpeed=" + this.f136947k + ", includeDailyNutritionSummary=" + this.f136948l + ", includeHeartRate=" + this.f136949m + ", includeHeartRateZone=" + this.f136950n + ", includeHeartRateVariability=" + this.f136951o + ", includeMenstrualCycle=" + this.f136952p + ", includeMenstrualLog=" + this.f136953q + ", includeSp02Acclimation=" + this.f136954r + ", includeSleep=" + this.f136955s + ", includeSleepSummaries=" + this.f136956t + ", sleepSummariesStartDate=" + this.f136957u + ", includeUserDailySummary=" + this.f136958v + ", includeWeight=" + this.f136959w + ", includeV02Max=" + this.f136960x + ", includeTrainingStatusDaily=" + this.f136961y + ", includeTrainingStatusWeekly=" + this.f136962z + ", includeRunningLactateThreshold=" + this.A + ", includeRunningTolerance=" + this.B + ", includeRunningEconomy=" + this.C + ", includePowerToWeight=" + this.D + ", powerToWeightSports=" + this.E + ", includeHeatAltitudeAcclimation=" + this.F + ", includeFunctionalThresholdPower=" + this.G + ", includeTrainingReadiness=" + this.H + ", includeTrainingLoadBalance=" + this.I + ", includeEnduranceScore=" + this.J + ", aggregationEnduranceScore=" + this.K + ", includeHillScore=" + this.L + ", aggregationHillScore=" + this.M + ", includeCyclingAbility=" + this.N + ", includeUserGoals=" + this.O + ", includeEpochChart=" + this.P + ", epochCharts=" + this.Q + ", includeSearchActivities=" + this.R + ", includeLatestFitnessAge=" + this.S + ", includeDailyEvents=" + this.T + ", includePersonalRecords=" + this.U + ", includeJetLag=" + this.V + ", includeLifestyleLogging=" + this.W + ", includeHealthStatus=" + this.X + ", excludedActivitySubTypes=" + this.Y + ", extendDateRange=" + this.Z + ", extendedDateRangeStart=" + this.f136937a0 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: pb2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/e$e;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2597e {
        public /* synthetic */ C2597e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2597e() {
        }
    }

    public /* synthetic */ e(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, p0 p0Var, String str, DateTime dateTime6, boolean z14, boolean z15, String str2, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, DateTime dateTime7, boolean z29, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z44, boolean z45, p0 p0Var2, boolean z46, boolean z47, boolean z48, boolean z49, boolean z54, String str3, boolean z55, String str4, boolean z56, boolean z57, boolean z58, p0 p0Var3, boolean z59, boolean z64, boolean z65, boolean z66, boolean z67, boolean z68, boolean z69, p0 p0Var4, boolean z73, DateTime dateTime8, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(dateTime, dateTime2, dateTime3, dateTime4, dateTime5, (i14 & 32) != 0 ? p0.a.f178368b : p0Var, str, dateTime6, z14, z15, str2, z16, z17, z18, z19, z24, z25, z26, z27, z28, dateTime7, z29, z34, z35, z36, z37, z38, z39, z44, z45, (i14 & 1073741824) != 0 ? p0.a.f178368b : p0Var2, z46, z47, z48, z49, z54, str3, z55, str4, z56, z57, z58, (i15 & 1024) != 0 ? p0.a.f178368b : p0Var3, z59, z64, z65, z66, z67, z68, z69, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? p0.a.f178368b : p0Var4, z73, dateTime8);
    }
}
