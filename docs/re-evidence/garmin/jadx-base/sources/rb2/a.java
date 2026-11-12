package rb2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lrb2/a;", "", "", "Lrb2/a$c;", "activityList", "<init>", "(Ljava/util/List;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f151649a;

    /* JADX INFO: renamed from: rb2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb2/a$a;", "", "", "", "metrics", "<init>", "(Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class C2855a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Double> f151650a;

        public C2855a(List<Double> list) {
            this.f151650a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2855a) && p005kotlin.jvm.internal.s.g(this.f151650a, ((C2855a) obj).f151650a);
        }

        public final int hashCode() {
            List<Double> list = this.f151650a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151650a, new StringBuilder("ActivityDetailMetric(metrics="));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrb2/a$b;", "", "", "Lrb2/a$a;", "activityDetailMetrics", "", "activityId", "", "measurementCount", "metricsCount", "Lrb2/a$e;", "metricDescriptors", "totalMetricsCount", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<C2855a> f151651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f151652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f151653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f151654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<e> f151655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f151656f;

        public b(List<C2855a> list, Long l14, Integer num, Integer num2, List<e> list2, Integer num3) {
            this.f151651a = list;
            this.f151652b = l14;
            this.f151653c = num;
            this.f151654d = num2;
            this.f151655e = list2;
            this.f151656f = num3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f151651a, bVar.f151651a) && p005kotlin.jvm.internal.s.g(this.f151652b, bVar.f151652b) && p005kotlin.jvm.internal.s.g(this.f151653c, bVar.f151653c) && p005kotlin.jvm.internal.s.g(this.f151654d, bVar.f151654d) && p005kotlin.jvm.internal.s.g(this.f151655e, bVar.f151655e) && p005kotlin.jvm.internal.s.g(this.f151656f, bVar.f151656f);
        }

        public final int hashCode() {
            List<C2855a> list = this.f151651a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l14 = this.f151652b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            Integer num = this.f151653c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f151654d;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<e> list2 = this.f151655e;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num3 = this.f151656f;
            return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityDetails(activityDetailMetrics=" + this.f151651a + ", activityId=" + this.f151652b + ", measurementCount=" + this.f151653c + ", metricsCount=" + this.f151654d + ", metricDescriptors=" + this.f151655e + ", totalMetricsCount=" + this.f151656f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lrb2/a$c;", "", "Lrb2/a$b;", "activityDetails", "", "activityId", "", "activityName", "Lrb2/a$d;", "activityType", "deviceId", "", "distance", "duration", "elevationGain", "elevationLoss", "", "manualActivity", "manufacturer", "maxSpeed", "averageSpeed", "movingDuration", "elapsedDuration", "bmrCalories", "calories", "averageBikingCadenceInRevPerMinute", "averageRunningCadenceInStepsPerMinute", "avgStrokeDistance", "avgStrokes", "maxBikingCadenceInRevPerMinute", "maxRunningCadenceInStepsPerMinute", "strokes", "Lorg/joda/time/LocalDateTime;", "startTimeLocal", "startTimeGMT", "<init>", "(Lrb2/a$b;Ljava/lang/Long;Ljava/lang/String;Lrb2/a$d;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f151657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f151658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f151659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f151660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Long f151661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Double f151662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Double f151663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Double f151664h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Double f151665i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Boolean f151666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f151667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Double f151668l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Double f151669m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Double f151670n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Double f151671o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Double f151672p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Double f151673q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Double f151674r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Double f151675s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Double f151676t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Double f151677u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Double f151678v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Double f151679w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Double f151680x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final LocalDateTime f151681y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final LocalDateTime f151682z;

        public c(b bVar, Long l14, String str, d dVar, Long l15, Double d14, Double d15, Double d16, Double d17, Boolean bool, String str2, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
            this.f151657a = bVar;
            this.f151658b = l14;
            this.f151659c = str;
            this.f151660d = dVar;
            this.f151661e = l15;
            this.f151662f = d14;
            this.f151663g = d15;
            this.f151664h = d16;
            this.f151665i = d17;
            this.f151666j = bool;
            this.f151667k = str2;
            this.f151668l = d18;
            this.f151669m = d19;
            this.f151670n = d24;
            this.f151671o = d25;
            this.f151672p = d26;
            this.f151673q = d27;
            this.f151674r = d28;
            this.f151675s = d29;
            this.f151676t = d34;
            this.f151677u = d35;
            this.f151678v = d36;
            this.f151679w = d37;
            this.f151680x = d38;
            this.f151681y = localDateTime;
            this.f151682z = localDateTime2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f151657a, cVar.f151657a) && p005kotlin.jvm.internal.s.g(this.f151658b, cVar.f151658b) && p005kotlin.jvm.internal.s.g(this.f151659c, cVar.f151659c) && p005kotlin.jvm.internal.s.g(this.f151660d, cVar.f151660d) && p005kotlin.jvm.internal.s.g(this.f151661e, cVar.f151661e) && p005kotlin.jvm.internal.s.g(this.f151662f, cVar.f151662f) && p005kotlin.jvm.internal.s.g(this.f151663g, cVar.f151663g) && p005kotlin.jvm.internal.s.g(this.f151664h, cVar.f151664h) && p005kotlin.jvm.internal.s.g(this.f151665i, cVar.f151665i) && p005kotlin.jvm.internal.s.g(this.f151666j, cVar.f151666j) && p005kotlin.jvm.internal.s.g(this.f151667k, cVar.f151667k) && p005kotlin.jvm.internal.s.g(this.f151668l, cVar.f151668l) && p005kotlin.jvm.internal.s.g(this.f151669m, cVar.f151669m) && p005kotlin.jvm.internal.s.g(this.f151670n, cVar.f151670n) && p005kotlin.jvm.internal.s.g(this.f151671o, cVar.f151671o) && p005kotlin.jvm.internal.s.g(this.f151672p, cVar.f151672p) && p005kotlin.jvm.internal.s.g(this.f151673q, cVar.f151673q) && p005kotlin.jvm.internal.s.g(this.f151674r, cVar.f151674r) && p005kotlin.jvm.internal.s.g(this.f151675s, cVar.f151675s) && p005kotlin.jvm.internal.s.g(this.f151676t, cVar.f151676t) && p005kotlin.jvm.internal.s.g(this.f151677u, cVar.f151677u) && p005kotlin.jvm.internal.s.g(this.f151678v, cVar.f151678v) && p005kotlin.jvm.internal.s.g(this.f151679w, cVar.f151679w) && p005kotlin.jvm.internal.s.g(this.f151680x, cVar.f151680x) && p005kotlin.jvm.internal.s.g(this.f151681y, cVar.f151681y) && p005kotlin.jvm.internal.s.g(this.f151682z, cVar.f151682z);
        }

        public final int hashCode() {
            b bVar = this.f151657a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            Long l14 = this.f151658b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str = this.f151659c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f151660d;
            int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Long l15 = this.f151661e;
            int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Double d14 = this.f151662f;
            int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f151663g;
            int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f151664h;
            int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f151665i;
            int iHashCode9 = (iHashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Boolean bool = this.f151666j;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f151667k;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d18 = this.f151668l;
            int iHashCode12 = (iHashCode11 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.f151669m;
            int iHashCode13 = (iHashCode12 + (d19 == null ? 0 : d19.hashCode())) * 31;
            Double d24 = this.f151670n;
            int iHashCode14 = (iHashCode13 + (d24 == null ? 0 : d24.hashCode())) * 31;
            Double d25 = this.f151671o;
            int iHashCode15 = (iHashCode14 + (d25 == null ? 0 : d25.hashCode())) * 31;
            Double d26 = this.f151672p;
            int iHashCode16 = (iHashCode15 + (d26 == null ? 0 : d26.hashCode())) * 31;
            Double d27 = this.f151673q;
            int iHashCode17 = (iHashCode16 + (d27 == null ? 0 : d27.hashCode())) * 31;
            Double d28 = this.f151674r;
            int iHashCode18 = (iHashCode17 + (d28 == null ? 0 : d28.hashCode())) * 31;
            Double d29 = this.f151675s;
            int iHashCode19 = (iHashCode18 + (d29 == null ? 0 : d29.hashCode())) * 31;
            Double d34 = this.f151676t;
            int iHashCode20 = (iHashCode19 + (d34 == null ? 0 : d34.hashCode())) * 31;
            Double d35 = this.f151677u;
            int iHashCode21 = (iHashCode20 + (d35 == null ? 0 : d35.hashCode())) * 31;
            Double d36 = this.f151678v;
            int iHashCode22 = (iHashCode21 + (d36 == null ? 0 : d36.hashCode())) * 31;
            Double d37 = this.f151679w;
            int iHashCode23 = (iHashCode22 + (d37 == null ? 0 : d37.hashCode())) * 31;
            Double d38 = this.f151680x;
            int iHashCode24 = (iHashCode23 + (d38 == null ? 0 : d38.hashCode())) * 31;
            LocalDateTime localDateTime = this.f151681y;
            int iHashCode25 = (iHashCode24 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.f151682z;
            return iHashCode25 + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityList(activityDetails=" + this.f151657a + ", activityId=" + this.f151658b + ", activityName=" + this.f151659c + ", activityType=" + this.f151660d + ", deviceId=" + this.f151661e + ", distance=" + this.f151662f + ", duration=" + this.f151663g + ", elevationGain=" + this.f151664h + ", elevationLoss=" + this.f151665i + ", manualActivity=" + this.f151666j + ", manufacturer=" + this.f151667k + ", maxSpeed=" + this.f151668l + ", averageSpeed=" + this.f151669m + ", movingDuration=" + this.f151670n + ", elapsedDuration=" + this.f151671o + ", bmrCalories=" + this.f151672p + ", calories=" + this.f151673q + ", averageBikingCadenceInRevPerMinute=" + this.f151674r + ", averageRunningCadenceInStepsPerMinute=" + this.f151675s + ", avgStrokeDistance=" + this.f151676t + ", avgStrokes=" + this.f151677u + ", maxBikingCadenceInRevPerMinute=" + this.f151678v + ", maxRunningCadenceInStepsPerMinute=" + this.f151679w + ", strokes=" + this.f151680x + ", startTimeLocal=" + this.f151681y + ", startTimeGMT=" + this.f151682z + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb2/a$d;", "", "", "typeId", "parentTypeId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f151683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f151684b;

        public d(Long l14, Long l15) {
            this.f151683a = l14;
            this.f151684b = l15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f151683a, dVar.f151683a) && p005kotlin.jvm.internal.s.g(this.f151684b, dVar.f151684b);
        }

        public final int hashCode() {
            Long l14 = this.f151683a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            Long l15 = this.f151684b;
            return iHashCode + (l15 != null ? l15.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityType(typeId=" + this.f151683a + ", parentTypeId=" + this.f151684b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrb2/a$e;", "", "", Action.KEY_ATTRIBUTE, "", "metricsIndex", "Lrb2/a$f;", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lrb2/a$f;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f151685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f151686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f151687c;

        public e(String str, Integer num, f fVar) {
            this.f151685a = str;
            this.f151686b = num;
            this.f151687c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f151685a, eVar.f151685a) && p005kotlin.jvm.internal.s.g(this.f151686b, eVar.f151686b) && p005kotlin.jvm.internal.s.g(this.f151687c, eVar.f151687c);
        }

        public final int hashCode() {
            String str = this.f151685a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f151686b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            f fVar = this.f151687c;
            return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            return "MetricDescriptor(key=" + this.f151685a + ", metricsIndex=" + this.f151686b + ", unit=" + this.f151687c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrb2/a$f;", "", "", "factor", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f151688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f151689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f151690c;

        public f(Double d14, Integer num, String str) {
            this.f151688a = d14;
            this.f151689b = num;
            this.f151690c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f151688a, fVar.f151688a) && p005kotlin.jvm.internal.s.g(this.f151689b, fVar.f151689b) && p005kotlin.jvm.internal.s.g(this.f151690c, fVar.f151690c);
        }

        public final int hashCode() {
            Double d14 = this.f151688a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Integer num = this.f151689b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f151690c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Unit(factor=");
            sb3.append(this.f151688a);
            sb3.append(", id=");
            sb3.append(this.f151689b);
            sb3.append(", key=");
            return androidx.room.a0.m(sb3, this.f151690c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public a(List<c> list) {
        this.f151649a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f151649a, ((a) obj).f151649a);
    }

    public final int hashCode() {
        List<c> list = this.f151649a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151649a, new StringBuilder("ActivityFrag(activityList="));
    }
}
