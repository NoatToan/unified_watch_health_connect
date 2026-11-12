package pb2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qb2.t0;
import vh.l0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpb2/f;", "Lvh/s0;", "Lpb2/f$b;", "", "timezone", "Lorg/joda/time/DateTime;", "date", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "a", "b", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class f implements s0<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f137120c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f137122b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpb2/f$b;", "Lvh/s0$a;", "", "myDayCardEventsScalar", "<init>", "(Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f137123a;

        public b(Object obj) {
            this.f137123a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f137123a, ((b) obj).f137123a);
        }

        public final int hashCode() {
            Object obj = this.f137123a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("Data(myDayCardEventsScalar="), this.f137123a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public f(String str, DateTime dateTime) {
        str.getClass();
        dateTime.getClass();
        this.f137121a = str;
        this.f137122b = dateTime;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(qb2.s0.f144262a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.f.f163792a.getClass();
        List<w> list = tb2.f.f163793b;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        t0.f144266a.getClass();
        t0.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f137120c.getClass();
        return "query Events($timezone: String!, $date: Date!) { myDayCardEventsScalar(timeZone: $timezone, date: $date) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f137121a.equals(fVar.f137121a) && this.f137122b.equals(fVar.f137122b);
    }

    public final int hashCode() {
        return this.f137122b.hashCode() + (this.f137121a.hashCode() * 31);
    }

    @Override // vh.n0
    public final String id() {
        return "c4e57410f4e6d8f6e847d5da16d743d94d4ae10b46e2edc4e0d7e95b2ec29e7d";
    }

    @Override // vh.n0
    public final String name() {
        return "Events";
    }

    public final String toString() {
        return "EventsQuery(timezone=" + this.f137121a + ", date=" + this.f137122b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/f$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
