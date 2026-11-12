package pb2;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import qb2.v0;
import qb2.z0;
import rb2.b0;
import rb2.i;
import rb2.l;
import rb2.p;
import rb2.w;
import vh.l0;
import vh.q;
import vh.s0;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lpb2/g;", "Lvh/s0;", "Lpb2/g$c;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lorg/joda/time/LocalDateTime;", "activityStartTimeLocal", "activityEndTimeLocal", "", "displayName", "", "includeMovement", "includeWeight", "includeSleep", "includeActivity", "includeHeartRate", "includeCalories", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;ZZZZZZ)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class g implements s0<c> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f137124l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f137125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f137126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f137127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime f137128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f137129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f137130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f137131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f137132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f137133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f137134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f137135k;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpb2/g$b;", "", "", "__typename", "Lorg/joda/time/DateTime;", "date", "Lpb2/g$e;", "userMetrics", "Lrb2/b0;", "weightFrag", "Lrb2/w;", "sleepFrag", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lpb2/g$e;Lrb2/b0;Lrb2/w;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f137136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f137137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f137138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b0 f137139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final w f137140e;

        public b(String str, DateTime dateTime, e eVar, b0 b0Var, w wVar) {
            str.getClass();
            this.f137136a = str;
            this.f137137b = dateTime;
            this.f137138c = eVar;
            this.f137139d = b0Var;
            this.f137140e = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f137136a.equals(bVar.f137136a) && s.g(this.f137137b, bVar.f137137b) && s.g(this.f137138c, bVar.f137138c) && s.g(this.f137139d, bVar.f137139d) && s.g(this.f137140e, bVar.f137140e);
        }

        public final int hashCode() {
            int iHashCode = this.f137136a.hashCode() * 31;
            DateTime dateTime = this.f137137b;
            int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            e eVar = this.f137138c;
            int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b0 b0Var = this.f137139d;
            int iHashCode4 = (iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
            w wVar = this.f137140e;
            return iHashCode4 + (wVar != null ? wVar.hashCode() : 0);
        }

        public final String toString() {
            return "DailyWellness(__typename=" + this.f137136a + ", date=" + this.f137137b + ", userMetrics=" + this.f137138c + ", weightFrag=" + this.f137139d + ", sleepFrag=" + this.f137140e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/g$c;", "Lvh/s0$a;", "", "Lpb2/g$b;", "dailyWellness", "Lpb2/g$d;", "userActivities", "<init>", "(Ljava/util/List;Lpb2/g$d;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f137141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f137142b;

        public c(List<b> list, d dVar) {
            this.f137141a = list;
            this.f137142b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f137141a, cVar.f137141a) && s.g(this.f137142b, cVar.f137142b);
        }

        public final int hashCode() {
            List<b> list = this.f137141a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            d dVar = this.f137142b;
            return iHashCode + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "Data(dailyWellness=" + this.f137141a + ", userActivities=" + this.f137142b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/g$d;", "", "", "__typename", "Lrb2/a;", "activityFrag", "<init>", "(Ljava/lang/String;Lrb2/a;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f137143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rb2.a f137144b;

        public d(String str, rb2.a aVar) {
            str.getClass();
            this.f137143a = str;
            this.f137144b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f137143a.equals(dVar.f137143a) && s.g(this.f137144b, dVar.f137144b);
        }

        public final int hashCode() {
            int iHashCode = this.f137143a.hashCode() * 31;
            rb2.a aVar = this.f137144b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "UserActivities(__typename=" + this.f137143a + ", activityFrag=" + this.f137144b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpb2/g$e;", "", "", "__typename", "Lorg/joda/time/DateTime;", "calendarDate", "Lpb2/g$f;", "wellnessChronology", "Lrb2/p;", "movementFrag", "Lrb2/l;", "heartRateFrag", "Lrb2/i;", "caloriesFrag", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lpb2/g$f;Lrb2/p;Lrb2/l;Lrb2/i;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f137145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f137146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f137147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f137148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l f137149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i f137150f;

        public e(String str, DateTime dateTime, f fVar, p pVar, l lVar, i iVar) {
            str.getClass();
            this.f137145a = str;
            this.f137146b = dateTime;
            this.f137147c = fVar;
            this.f137148d = pVar;
            this.f137149e = lVar;
            this.f137150f = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f137145a.equals(eVar.f137145a) && s.g(this.f137146b, eVar.f137146b) && s.g(this.f137147c, eVar.f137147c) && s.g(this.f137148d, eVar.f137148d) && s.g(this.f137149e, eVar.f137149e) && s.g(this.f137150f, eVar.f137150f);
        }

        public final int hashCode() {
            int iHashCode = this.f137145a.hashCode() * 31;
            DateTime dateTime = this.f137146b;
            int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            f fVar = this.f137147c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            p pVar = this.f137148d;
            int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
            l lVar = this.f137149e;
            int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            i iVar = this.f137150f;
            return iHashCode5 + (iVar != null ? iVar.hashCode() : 0);
        }

        public final String toString() {
            return "UserMetrics(__typename=" + this.f137145a + ", calendarDate=" + this.f137146b + ", wellnessChronology=" + this.f137147c + ", movementFrag=" + this.f137148d + ", heartRateFrag=" + this.f137149e + ", caloriesFrag=" + this.f137150f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/g$f;", "", "Lorg/joda/time/LocalDateTime;", "startTimestampLocal", "startTimestampGmt", "endTimestampLocal", "endTimestampGmt", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f137151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f137152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDateTime f137153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LocalDateTime f137154d;

        public f(LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LocalDateTime localDateTime4) {
            this.f137151a = localDateTime;
            this.f137152b = localDateTime2;
            this.f137153c = localDateTime3;
            this.f137154d = localDateTime4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f137151a, fVar.f137151a) && s.g(this.f137152b, fVar.f137152b) && s.g(this.f137153c, fVar.f137153c) && s.g(this.f137154d, fVar.f137154d);
        }

        public final int hashCode() {
            LocalDateTime localDateTime = this.f137151a;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            LocalDateTime localDateTime2 = this.f137152b;
            int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            LocalDateTime localDateTime3 = this.f137153c;
            int iHashCode3 = (iHashCode2 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
            LocalDateTime localDateTime4 = this.f137154d;
            return iHashCode3 + (localDateTime4 != null ? localDateTime4.hashCode() : 0);
        }

        public final String toString() {
            return "WellnessChronology(startTimestampLocal=" + this.f137151a + ", startTimestampGmt=" + this.f137152b + ", endTimestampLocal=" + this.f137153c + ", endTimestampGmt=" + this.f137154d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public g(DateTime dateTime, DateTime dateTime2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        dateTime.getClass();
        dateTime2.getClass();
        localDateTime.getClass();
        localDateTime2.getClass();
        str.getClass();
        this.f137125a = dateTime;
        this.f137126b = dateTime2;
        this.f137127c = localDateTime;
        this.f137128d = localDateTime2;
        this.f137129e = str;
        this.f137130f = z14;
        this.f137131g = z15;
        this.f137132h = z16;
        this.f137133i = z17;
        this.f137134j = z18;
        this.f137135k = z19;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(v0.f144273a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.g.f163794a.getClass();
        List<vh.w> list = tb2.g.f163799f;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        z0.f144289a.getClass();
        z0.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f137124l.getClass();
        return "query HealthExportQuery($startDate: Date!, $endDate: Date!, $activityStartTimeLocal: LocalDateTime!, $activityEndTimeLocal: LocalDateTime!, $displayName: String!, $includeMovement: Boolean!, $includeWeight: Boolean!, $includeSleep: Boolean!, $includeActivity: Boolean!, $includeHeartRate: Boolean!, $includeCalories: Boolean!) { dailyWellness(startDate: $startDate, endDate: $endDate) { __typename date userMetrics { __typename calendarDate wellnessChronology { startTimestampLocal startTimestampGmt endTimestampLocal endTimestampGmt } ...MovementFrag @include(if: $includeMovement) ...HeartRateFrag @include(if: $includeHeartRate) ...CaloriesFrag @include(if: $includeCalories) } ...WeightFrag @include(if: $includeWeight) ...SleepFrag @include(if: $includeSleep) } userActivities(startTimestampLocal: $activityStartTimeLocal, endTimestampLocal: $activityEndTimeLocal, displayName: $displayName) { __typename ...ActivityFrag @include(if: $includeActivity) } }  fragment MovementFrag on UserMetricsData { movement { steps { distanceInMeters value epochData { labels data } } floorsAscended { wholeFloorsEpochData { data labels } } } }  fragment HeartRateFrag on UserMetricsData { heartRate { restingValue heartRateEpochData { labels data } } }  fragment CaloriesFrag on UserMetricsData { calories { burnedActive burnedTotal } }  fragment WeightFrag on DailyWellnessData { weight { summaryDate allWeightMetrics { weight weightDelta bodyFat bodyWater boneMass muscleMass sourceType bmi visceralFat timestampGMT } latestWeight { date weight } } }  fragment SleepFrag on DailyWellnessData { sleep { dailySleepDTO { awakeCount awakeSleepSeconds calendarDate deviceRemCapable lightSleepSeconds deepSleepSeconds remSleepSeconds sleepTimeSeconds sleepStartTimestampGMT sleepEndTimestampGMT sleepStartTimestampLocal sleepEndTimestampLocal sleepFromDevice sleepWindowConfirmationType } sleepLevels { startGMT endGMT activityLevel } } }  fragment ActivityFrag on UserActivities { activityList { activityDetails { activityDetailMetrics { metrics } activityId measurementCount metricsCount metricDescriptors { key metricsIndex unit { factor id key } } totalMetricsCount } activityId activityName activityType { typeId parentTypeId } deviceId distance duration elevationGain elevationLoss manualActivity manufacturer maxSpeed averageSpeed movingDuration elapsedDuration bmrCalories calories averageBikingCadenceInRevPerMinute averageRunningCadenceInStepsPerMinute avgStrokeDistance avgStrokes maxBikingCadenceInRevPerMinute maxRunningCadenceInStepsPerMinute strokes startTimeLocal startTimeGMT } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f137125a.equals(gVar.f137125a) && this.f137126b.equals(gVar.f137126b) && this.f137127c.equals(gVar.f137127c) && this.f137128d.equals(gVar.f137128d) && this.f137129e.equals(gVar.f137129e) && this.f137130f == gVar.f137130f && this.f137131g == gVar.f137131g && this.f137132h == gVar.f137132h && this.f137133i == gVar.f137133i && this.f137134j == gVar.f137134j && this.f137135k == gVar.f137135k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int hashCode() {
        int iJ = wr.g.j((this.f137128d.hashCode() + ((this.f137127c.hashCode() + e0.a(this.f137125a.hashCode() * 31, this.f137126b, 31)) * 31)) * 31, 31, this.f137129e);
        boolean z14 = this.f137130f;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iJ + r14) * 31;
        boolean z15 = this.f137131g;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.f137132h;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z17 = this.f137133i;
        ?? r17 = z17;
        if (z17) {
            r17 = 1;
        }
        int i17 = (i16 + r17) * 31;
        boolean z18 = this.f137134j;
        ?? r18 = z18;
        if (z18) {
            r18 = 1;
        }
        int i18 = (i17 + r18) * 31;
        boolean z19 = this.f137135k;
        return i18 + (z19 ? 1 : z19);
    }

    @Override // vh.n0
    public final String id() {
        return "22eda767994092bc0186d1ee93bdbb7aa9ebe202d45bc473fd941b8c00d0853a";
    }

    @Override // vh.n0
    public final String name() {
        return "HealthExportQuery";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HealthExportQuery(startDate=");
        sb3.append(this.f137125a);
        sb3.append(", endDate=");
        sb3.append(this.f137126b);
        sb3.append(", activityStartTimeLocal=");
        sb3.append(this.f137127c);
        sb3.append(", activityEndTimeLocal=");
        sb3.append(this.f137128d);
        sb3.append(", displayName=");
        sb3.append(this.f137129e);
        sb3.append(", includeMovement=");
        sb3.append(this.f137130f);
        sb3.append(", includeWeight=");
        sb3.append(this.f137131g);
        sb3.append(", includeSleep=");
        sb3.append(this.f137132h);
        sb3.append(", includeActivity=");
        sb3.append(this.f137133i);
        sb3.append(", includeHeartRate=");
        sb3.append(this.f137134j);
        sb3.append(", includeCalories=");
        return j.t(sb3, this.f137135k, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/g$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
