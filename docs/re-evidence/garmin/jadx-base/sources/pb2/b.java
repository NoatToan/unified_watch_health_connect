package pb2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import qb2.j;
import qb2.k;
import vh.l0;
import vh.p0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lpb2/b;", "Lvh/s0;", "Lpb2/b$g;", "Lorg/joda/time/LocalDateTime;", "startLocalDateTime", "endLocalDateTime", "", "displayName", "Lvh/p0;", "", MapboxMap.QFE_LIMIT, "", "includeStreaks", "", "streakActivityTypes", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Lvh/p0;ZLjava/util/List;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class b implements s0<g> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f136905g = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f136906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f136907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0<Integer> f136909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f136910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f136911f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/b$a;", "", "Lpb2/b$c;", "activityListResults", "", "Lpb2/b$d;", "activityStreaks", "<init>", "(Lpb2/b$c;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f136912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d> f136913b;

        public a(c cVar, List<d> list) {
            this.f136912a = cVar;
            this.f136913b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f136912a, aVar.f136912a) && s.g(this.f136913b, aVar.f136913b);
        }

        public final int hashCode() {
            c cVar = this.f136912a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            List<d> list = this.f136913b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Activities(activityListResults=");
            sb3.append(this.f136912a);
            sb3.append(", activityStreaks=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f136913b, sb3);
        }
    }

    /* JADX INFO: renamed from: pb2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpb2/b$b;", "", "Lorg/joda/time/LocalDateTime;", "startTimeLocal", "Lpb2/b$e;", "activityType", "", "distance", "duration", "<init>", "(Lorg/joda/time/LocalDateTime;Lpb2/b$e;Ljava/lang/Double;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class C2596b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f136914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f136915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f136916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f136917d;

        public C2596b(LocalDateTime localDateTime, e eVar, Double d14, Double d15) {
            this.f136914a = localDateTime;
            this.f136915b = eVar;
            this.f136916c = d14;
            this.f136917d = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2596b)) {
                return false;
            }
            C2596b c2596b = (C2596b) obj;
            return s.g(this.f136914a, c2596b.f136914a) && s.g(this.f136915b, c2596b.f136915b) && s.g(this.f136916c, c2596b.f136916c) && s.g(this.f136917d, c2596b.f136917d);
        }

        public final int hashCode() {
            LocalDateTime localDateTime = this.f136914a;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            e eVar = this.f136915b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            Double d14 = this.f136916c;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f136917d;
            return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityList(startTimeLocal=" + this.f136914a + ", activityType=" + this.f136915b + ", distance=" + this.f136916c + ", duration=" + this.f136917d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpb2/b$c;", "", "", "Lpb2/b$b;", "activityList", "<init>", "(Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<C2596b> f136918a;

        public c(List<C2596b> list) {
            this.f136918a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f136918a, ((c) obj).f136918a);
        }

        public final int hashCode() {
            List<C2596b> list = this.f136918a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f136918a, new StringBuilder("ActivityListResults(activityList="));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/b$d;", "", "", "activityType", "Lorg/joda/time/DateTime;", "streakStartLocalDate", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f136920b;

        public d(String str, DateTime dateTime) {
            str.getClass();
            this.f136919a = str;
            this.f136920b = dateTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f136919a.equals(dVar.f136919a) && s.g(this.f136920b, dVar.f136920b);
        }

        public final int hashCode() {
            int iHashCode = this.f136919a.hashCode() * 31;
            DateTime dateTime = this.f136920b;
            return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public final String toString() {
            return "ActivityStreak(activityType=" + this.f136919a + ", streakStartLocalDate=" + this.f136920b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb2/b$e;", "", "", "typeKey", "", "parentTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f136922b;

        public e(String str, Long l14) {
            this.f136921a = str;
            this.f136922b = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f136921a, eVar.f136921a) && s.g(this.f136922b, eVar.f136922b);
        }

        public final int hashCode() {
            String str = this.f136921a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l14 = this.f136922b;
            return iHashCode + (l14 != null ? l14.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityType(typeKey=" + this.f136921a + ", parentTypeId=" + this.f136922b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpb2/b$g;", "Lvh/s0$a;", "Lpb2/b$a;", "activities", "<init>", "(Lpb2/b$a;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class g implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f136923a;

        public g(a aVar) {
            this.f136923a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f136923a, ((g) obj).f136923a);
        }

        public final int hashCode() {
            a aVar = this.f136923a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(activities=" + this.f136923a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public b(LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, p0<Integer> p0Var, boolean z14, List<String> list) {
        localDateTime.getClass();
        localDateTime2.getClass();
        str.getClass();
        p0Var.getClass();
        list.getClass();
        this.f136906a = localDateTime;
        this.f136907b = localDateTime2;
        this.f136908c = str;
        this.f136909d = p0Var;
        this.f136910e = z14;
        this.f136911f = list;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(j.f144228a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.b.f163755a.getClass();
        List<w> list = tb2.b.f163761g;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        k.f144232a.getClass();
        k.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f136905g.getClass();
        return "query Activities($startLocalDateTime: LocalDateTime!, $endLocalDateTime: LocalDateTime!, $displayName: String!, $limit: Int! = 1000 , $includeStreaks: Boolean!, $streakActivityTypes: [String]!) { activities(displayName: $displayName, startTimestampLocal: $startLocalDateTime, endTimestampLocal: $endLocalDateTime, limit: $limit) { activityListResults { activityList { startTimeLocal activityType { typeKey parentTypeId } distance duration } } activityStreaks(activityTypes: $streakActivityTypes) @include(if: $includeStreaks) { activityType streakStartLocalDate } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f136906a, bVar.f136906a) && s.g(this.f136907b, bVar.f136907b) && s.g(this.f136908c, bVar.f136908c) && s.g(this.f136909d, bVar.f136909d) && this.f136910e == bVar.f136910e && s.g(this.f136911f, bVar.f136911f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f136909d.hashCode() + wr.g.j((this.f136907b.hashCode() + (this.f136906a.hashCode() * 31)) * 31, 31, this.f136908c)) * 31;
        boolean z14 = this.f136910e;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return this.f136911f.hashCode() + ((iHashCode + r14) * 31);
    }

    @Override // vh.n0
    public final String id() {
        return "5ad97760461fc13043c33397aacf612c2b39169c757acf3a4cafb44bf599178b";
    }

    @Override // vh.n0
    public final String name() {
        return "Activities";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitiesQuery(startLocalDateTime=");
        sb3.append(this.f136906a);
        sb3.append(", endLocalDateTime=");
        sb3.append(this.f136907b);
        sb3.append(", displayName=");
        sb3.append(this.f136908c);
        sb3.append(", limit=");
        sb3.append(this.f136909d);
        sb3.append(", includeStreaks=");
        sb3.append(this.f136910e);
        sb3.append(", streakActivityTypes=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f136911f, sb3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/b$f;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {
        public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private f() {
        }
    }

    public /* synthetic */ b(LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, p0 p0Var, boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(localDateTime, localDateTime2, str, (i14 & 8) != 0 ? p0.a.f178368b : p0Var, z14, list);
    }
}
