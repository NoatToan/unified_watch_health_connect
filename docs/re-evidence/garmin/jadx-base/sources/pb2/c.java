package pb2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qb2.l;
import qb2.m;
import r1.q2;
import vh.l0;
import vh.p0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lpb2/c;", "Lvh/s0;", "Lpb2/c$b;", "", "activityId", "", "maxPolylineSize", "Lvh/p0;", "", "", "splitType", "<init>", "(JILvh/p0;)V", "a", "b", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c implements s0<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f136924d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f136925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0<List<String>> f136927c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpb2/c$b;", "Lvh/s0$a;", "", "activityPolylineScalar", "<init>", "(Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f136928a;

        public b(Object obj) {
            this.f136928a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f136928a, ((b) obj).f136928a);
        }

        public final int hashCode() {
            Object obj = this.f136928a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("Data(activityPolylineScalar="), this.f136928a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j8, int i14, p0<? extends List<String>> p0Var) {
        p0Var.getClass();
        this.f136925a = j8;
        this.f136926b = i14;
        this.f136927c = p0Var;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(l.f144235a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.c.f163762a.getClass();
        List<w> list = tb2.c.f163763b;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        m.f144239a.getClass();
        m.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f136924d.getClass();
        return "query ActivityPolyline($activityId: Long!, $maxPolylineSize: Int!, $splitType: [String]) { activityPolylineScalar(activityId: $activityId, maxPolylineSize: $maxPolylineSize, splitType: $splitType) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f136925a == cVar.f136925a && this.f136926b == cVar.f136926b && s.g(this.f136927c, cVar.f136927c);
    }

    public final int hashCode() {
        return this.f136927c.hashCode() + q2.d(this.f136926b, Long.hashCode(this.f136925a) * 31, 31);
    }

    @Override // vh.n0
    public final String id() {
        return "3667a2a5a1ce90be514391e9df1450c63eda7aa2222f732fd6eb6b66ffa32ef5";
    }

    @Override // vh.n0
    public final String name() {
        return "ActivityPolyline";
    }

    public final String toString() {
        return "ActivityPolylineQuery(activityId=" + this.f136925a + ", maxPolylineSize=" + this.f136926b + ", splitType=" + this.f136927c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/c$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(long j8, int i14, p0 p0Var, int i15, j jVar) {
        this(j8, i14, (i15 & 4) != 0 ? p0.a.f178368b : p0Var);
    }
}
