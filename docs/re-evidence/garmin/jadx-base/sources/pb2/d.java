package pb2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import ds.e0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qb2.n;
import qb2.o;
import vh.l0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpb2/d;", "Lvh/s0;", "Lpb2/d$b;", "", MapboxMap.QFE_LIMIT, "<init>", "(I)V", "a", "b", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class d implements s0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f136929b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136930a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpb2/d$b;", "Lvh/s0$a;", "", "adhocChallengesScalar", "badgeChallengesScalar", "expeditionsChallengesScalar", "adhocChallengePendingInviteScalar", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f136931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f136932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f136933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f136934d;

        public b(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f136931a = obj;
            this.f136932b = obj2;
            this.f136933c = obj3;
            this.f136934d = obj4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f136931a, bVar.f136931a) && s.g(this.f136932b, bVar.f136932b) && s.g(this.f136933c, bVar.f136933c) && s.g(this.f136934d, bVar.f136934d);
        }

        public final int hashCode() {
            Object obj = this.f136931a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f136932b;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.f136933c;
            int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.f136934d;
            return iHashCode3 + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Data(adhocChallengesScalar=");
            sb3.append(this.f136931a);
            sb3.append(", badgeChallengesScalar=");
            sb3.append(this.f136932b);
            sb3.append(", expeditionsChallengesScalar=");
            sb3.append(this.f136933c);
            sb3.append(", adhocChallengePendingInviteScalar=");
            return wr.g.p(sb3, this.f136934d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public d(int i14) {
        this.f136930a = i14;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(n.f144242a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.d.f163764a.getClass();
        List<w> list = tb2.d.f163765b;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        o.f144246a.getClass();
        gVar.v1(MapboxMap.QFE_LIMIT);
        vh.c.f178267b.a(gVar, zVar, Integer.valueOf(this.f136930a));
    }

    @Override // vh.n0
    public final String d() {
        f136929b.getClass();
        return "query ChallengesQuery($limit: Int!) { adhocChallengesScalar(limit: $limit) badgeChallengesScalar(limit: $limit) expeditionsChallengesScalar adhocChallengePendingInviteScalar }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f136930a == ((d) obj).f136930a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136930a);
    }

    @Override // vh.n0
    public final String id() {
        return "0dc4b2eb3e66f99d1e5469c7f9da7440b66055b6de42c66d4ff0abcb686b6c50";
    }

    @Override // vh.n0
    public final String name() {
        return "ChallengesQuery";
    }

    public final String toString() {
        return e0.j(new StringBuilder("ChallengesQuery(limit="), this.f136930a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/d$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
