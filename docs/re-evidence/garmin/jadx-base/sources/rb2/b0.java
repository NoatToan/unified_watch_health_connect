package rb2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lrb2/b0;", "", "Lrb2/b0$c;", "weight", "<init>", "(Lrb2/b0$c;)V", "a", "b", "c", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class b0 implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f151695a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrb2/b0$a;", "", "", "weight", "weightDelta", "bodyFat", "bodyWater", "boneMass", "muscleMass", "", "sourceType", "bmi", "visceralFat", "", "timestampGMT", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f151696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f151697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f151698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f151699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f151700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Double f151701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f151702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Double f151703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Double f151704i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Long f151705j;

        public a(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str, Double d24, Double d25, Long l14) {
            this.f151696a = d14;
            this.f151697b = d15;
            this.f151698c = d16;
            this.f151699d = d17;
            this.f151700e = d18;
            this.f151701f = d19;
            this.f151702g = str;
            this.f151703h = d24;
            this.f151704i = d25;
            this.f151705j = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f151696a, aVar.f151696a) && p005kotlin.jvm.internal.s.g(this.f151697b, aVar.f151697b) && p005kotlin.jvm.internal.s.g(this.f151698c, aVar.f151698c) && p005kotlin.jvm.internal.s.g(this.f151699d, aVar.f151699d) && p005kotlin.jvm.internal.s.g(this.f151700e, aVar.f151700e) && p005kotlin.jvm.internal.s.g(this.f151701f, aVar.f151701f) && p005kotlin.jvm.internal.s.g(this.f151702g, aVar.f151702g) && p005kotlin.jvm.internal.s.g(this.f151703h, aVar.f151703h) && p005kotlin.jvm.internal.s.g(this.f151704i, aVar.f151704i) && p005kotlin.jvm.internal.s.g(this.f151705j, aVar.f151705j);
        }

        public final int hashCode() {
            Double d14 = this.f151696a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.f151697b;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f151698c;
            int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f151699d;
            int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f151700e;
            int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.f151701f;
            int iHashCode6 = (iHashCode5 + (d19 == null ? 0 : d19.hashCode())) * 31;
            String str = this.f151702g;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Double d24 = this.f151703h;
            int iHashCode8 = (iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31;
            Double d25 = this.f151704i;
            int iHashCode9 = (iHashCode8 + (d25 == null ? 0 : d25.hashCode())) * 31;
            Long l14 = this.f151705j;
            return iHashCode9 + (l14 != null ? l14.hashCode() : 0);
        }

        public final String toString() {
            return "AllWeightMetric(weight=" + this.f151696a + ", weightDelta=" + this.f151697b + ", bodyFat=" + this.f151698c + ", bodyWater=" + this.f151699d + ", boneMass=" + this.f151700e + ", muscleMass=" + this.f151701f + ", sourceType=" + this.f151702g + ", bmi=" + this.f151703h + ", visceralFat=" + this.f151704i + ", timestampGMT=" + this.f151705j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/b0$b;", "", "", "date", "", "weight", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f151706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f151707b;

        public b(Long l14, Double d14) {
            this.f151706a = l14;
            this.f151707b = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f151706a, bVar.f151706a) && p005kotlin.jvm.internal.s.g(this.f151707b, bVar.f151707b);
        }

        public final int hashCode() {
            Long l14 = this.f151706a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            Double d14 = this.f151707b;
            return iHashCode + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            return "LatestWeight(date=" + this.f151706a + ", weight=" + this.f151707b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrb2/b0$c;", "", "Lorg/joda/time/DateTime;", "summaryDate", "", "Lrb2/b0$a;", "allWeightMetrics", "Lrb2/b0$b;", "latestWeight", "<init>", "(Lorg/joda/time/DateTime;Ljava/util/List;Lrb2/b0$b;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f151708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<a> f151709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f151710c;

        public c(DateTime dateTime, List<a> list, b bVar) {
            this.f151708a = dateTime;
            this.f151709b = list;
            this.f151710c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f151708a, cVar.f151708a) && p005kotlin.jvm.internal.s.g(this.f151709b, cVar.f151709b) && p005kotlin.jvm.internal.s.g(this.f151710c, cVar.f151710c);
        }

        public final int hashCode() {
            DateTime dateTime = this.f151708a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            List<a> list = this.f151709b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            b bVar = this.f151710c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "Weight(summaryDate=" + this.f151708a + ", allWeightMetrics=" + this.f151709b + ", latestWeight=" + this.f151710c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public b0(c cVar) {
        this.f151695a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && p005kotlin.jvm.internal.s.g(this.f151695a, ((b0) obj).f151695a);
    }

    public final int hashCode() {
        c cVar = this.f151695a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "WeightFrag(weight=" + this.f151695a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
