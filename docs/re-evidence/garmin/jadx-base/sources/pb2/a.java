package pb2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vh.l0;
import vh.p0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lpb2/a;", "Lvh/s0;", "Lpb2/a$b;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lorg/joda/time/LocalDateTime;", "startDateLocal", "endDateLocal", "", "displayName", "Lvh/p0;", "", "activityLimit", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Lvh/p0;)V", "a", "b", "c", "d", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a implements s0<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2595a f136880g = new C2595a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f136881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f136882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f136883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime f136884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f136885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0<Integer> f136886f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/a$b;", "Lvh/s0$a;", "", "activitiesScalar", "workoutScheduleSummariesScalar", "healthSnapshotScalar", "golfScorecardScalar", "Lpb2/a$c;", "pendingActivities", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpb2/a$c;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f136887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f136888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f136889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f136890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f136891e;

        public b(Object obj, Object obj2, Object obj3, Object obj4, c cVar) {
            this.f136887a = obj;
            this.f136888b = obj2;
            this.f136889c = obj3;
            this.f136890d = obj4;
            this.f136891e = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f136887a, bVar.f136887a) && s.g(this.f136888b, bVar.f136888b) && s.g(this.f136889c, bVar.f136889c) && s.g(this.f136890d, bVar.f136890d) && s.g(this.f136891e, bVar.f136891e);
        }

        public final int hashCode() {
            Object obj = this.f136887a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f136888b;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.f136889c;
            int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.f136890d;
            int iHashCode4 = (iHashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            c cVar = this.f136891e;
            return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "Data(activitiesScalar=" + this.f136887a + ", workoutScheduleSummariesScalar=" + this.f136888b + ", healthSnapshotScalar=" + this.f136889c + ", golfScorecardScalar=" + this.f136890d + ", pendingActivities=" + this.f136891e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpb2/a$c;", "", "", "Lpb2/a$d;", "pendingActivities", "<init>", "(Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f136892a;

        public c(List<d> list) {
            this.f136892a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f136892a, ((c) obj).f136892a);
        }

        public final int hashCode() {
            List<d> list = this.f136892a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f136892a, new StringBuilder("PendingActivities(pendingActivities="));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpb2/a$d;", "", "", "pendingActivityUUID", "Lorg/joda/time/DateTime;", "calendarDate", "Lorg/joda/time/LocalDateTime;", "startTimeLocal", "endTimeLocal", "startTimeGMT", "endTimeGMT", "", "averageHR", "", "deviceId", "calories", "duration", "", "hasLocationData", "", "activityTypePredictionKeys", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f136894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDateTime f136895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LocalDateTime f136896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LocalDateTime f136897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LocalDateTime f136898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Double f136899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f136900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Double f136901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Double f136902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Boolean f136903k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List<String> f136904l;

        public d(String str, DateTime dateTime, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LocalDateTime localDateTime4, Double d14, Long l14, Double d15, Double d16, Boolean bool, List<String> list) {
            str.getClass();
            dateTime.getClass();
            this.f136893a = str;
            this.f136894b = dateTime;
            this.f136895c = localDateTime;
            this.f136896d = localDateTime2;
            this.f136897e = localDateTime3;
            this.f136898f = localDateTime4;
            this.f136899g = d14;
            this.f136900h = l14;
            this.f136901i = d15;
            this.f136902j = d16;
            this.f136903k = bool;
            this.f136904l = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f136893a.equals(dVar.f136893a) && this.f136894b.equals(dVar.f136894b) && s.g(this.f136895c, dVar.f136895c) && s.g(this.f136896d, dVar.f136896d) && s.g(this.f136897e, dVar.f136897e) && s.g(this.f136898f, dVar.f136898f) && s.g(this.f136899g, dVar.f136899g) && s.g(this.f136900h, dVar.f136900h) && s.g(this.f136901i, dVar.f136901i) && s.g(this.f136902j, dVar.f136902j) && s.g(this.f136903k, dVar.f136903k) && s.g(this.f136904l, dVar.f136904l);
        }

        public final int hashCode() {
            int iA = e0.a(this.f136893a.hashCode() * 31, this.f136894b, 31);
            LocalDateTime localDateTime = this.f136895c;
            int iHashCode = (iA + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.f136896d;
            int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            LocalDateTime localDateTime3 = this.f136897e;
            int iHashCode3 = (iHashCode2 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
            LocalDateTime localDateTime4 = this.f136898f;
            int iHashCode4 = (iHashCode3 + (localDateTime4 == null ? 0 : localDateTime4.hashCode())) * 31;
            Double d14 = this.f136899g;
            int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Long l14 = this.f136900h;
            int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Double d15 = this.f136901i;
            int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f136902j;
            int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Boolean bool = this.f136903k;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<String> list = this.f136904l;
            return iHashCode9 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PendingActivity(pendingActivityUUID=");
            sb3.append(this.f136893a);
            sb3.append(", calendarDate=");
            sb3.append(this.f136894b);
            sb3.append(", startTimeLocal=");
            sb3.append(this.f136895c);
            sb3.append(", endTimeLocal=");
            sb3.append(this.f136896d);
            sb3.append(", startTimeGMT=");
            sb3.append(this.f136897e);
            sb3.append(", endTimeGMT=");
            sb3.append(this.f136898f);
            sb3.append(", averageHR=");
            sb3.append(this.f136899g);
            sb3.append(", deviceId=");
            sb3.append(this.f136900h);
            sb3.append(", calories=");
            sb3.append(this.f136901i);
            sb3.append(", duration=");
            sb3.append(this.f136902j);
            sb3.append(", hasLocationData=");
            sb3.append(this.f136903k);
            sb3.append(", activityTypePredictionKeys=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f136904l, sb3);
        }
    }

    public a(DateTime dateTime, DateTime dateTime2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, p0<Integer> p0Var) {
        dateTime.getClass();
        dateTime2.getClass();
        localDateTime.getClass();
        localDateTime2.getClass();
        str.getClass();
        p0Var.getClass();
        this.f136881a = dateTime;
        this.f136882b = dateTime2;
        this.f136883c = localDateTime;
        this.f136884d = localDateTime2;
        this.f136885e = str;
        this.f136886f = p0Var;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(qb2.a.f144190a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.a.f163751a.getClass();
        List<w> list = tb2.a.f163754d;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        qb2.d.f144205a.getClass();
        qb2.d.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f136880g.getClass();
        return "query ActivitiesAndWorkouts($startDate: Date!, $endDate: Date!, $startDateLocal: LocalDateTime!, $endDateLocal: LocalDateTime!, $displayName: String!, $activityLimit: Int! = 1000 ) { activitiesScalar(displayName: $displayName, startTimestampLocal: $startDateLocal, endTimestampLocal: $endDateLocal, limit: $activityLimit) workoutScheduleSummariesScalar(startDate: $startDate, endDate: $endDate) healthSnapshotScalar(startDate: $startDate, endDate: $endDate) golfScorecardScalar(startTimestampLocal: $startDateLocal, endTimestampLocal: $endDateLocal) pendingActivities { pendingActivities { pendingActivityUUID calendarDate startTimeLocal endTimeLocal startTimeGMT endTimeGMT averageHR deviceId calories duration hasLocationData activityTypePredictionKeys } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f136881a, aVar.f136881a) && s.g(this.f136882b, aVar.f136882b) && s.g(this.f136883c, aVar.f136883c) && s.g(this.f136884d, aVar.f136884d) && s.g(this.f136885e, aVar.f136885e) && s.g(this.f136886f, aVar.f136886f);
    }

    public final int hashCode() {
        return this.f136886f.hashCode() + wr.g.j((this.f136884d.hashCode() + ((this.f136883c.hashCode() + e0.a(this.f136881a.hashCode() * 31, this.f136882b, 31)) * 31)) * 31, 31, this.f136885e);
    }

    @Override // vh.n0
    public final String id() {
        return "c6f36bfa90d1ed46b8af4ef14d2bc135c1660bed1945713355b62638529a7294";
    }

    @Override // vh.n0
    public final String name() {
        return "ActivitiesAndWorkouts";
    }

    public final String toString() {
        return "ActivitiesAndWorkoutsQuery(startDate=" + this.f136881a + ", endDate=" + this.f136882b + ", startDateLocal=" + this.f136883c + ", endDateLocal=" + this.f136884d + ", displayName=" + this.f136885e + ", activityLimit=" + this.f136886f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: pb2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/a$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2595a {
        public /* synthetic */ C2595a(j jVar) {
            this();
        }

        private C2595a() {
        }
    }

    public /* synthetic */ a(DateTime dateTime, DateTime dateTime2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, p0 p0Var, int i14, j jVar) {
        this(dateTime, dateTime2, localDateTime, localDateTime2, str, (i14 & 32) != 0 ? p0.a.f178368b : p0Var);
    }
}
