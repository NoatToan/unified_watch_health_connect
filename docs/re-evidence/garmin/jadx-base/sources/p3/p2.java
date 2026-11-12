package p3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp3/p2;", "", "Lp3/o2;", "Lp3/q2;", "owner", "<init>", "(Lp3/q2;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 implements o2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f135215h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q2 f135216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s3.b f135218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p<? super m, ? super Integer, Unit> f135219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f135220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p1.p0<Object> f135221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p1.t0<e0<?>, Object> f135222g;

    public p2(q2 q2Var) {
        this.f135216a = q2Var;
    }

    public static boolean a(e0 e0Var, p1.t0 t0Var) {
        e0Var.getClass();
        p3 p3VarB = e0Var.b();
        if (p3VarB == null) {
            p3VarB = a4.f135041a;
            p3VarB.getClass();
        }
        return !p3VarB.a(e0Var.r().f135063f, t0Var.d(e0Var));
    }

    public final boolean b() {
        if (this.f135216a != null) {
            s3.b bVar = this.f135218c;
            if (bVar != null ? bVar.getValid() : false) {
                return true;
            }
        }
        return false;
    }

    public final x0 c(Object obj) {
        x0 x0VarS;
        q2 q2Var = this.f135216a;
        return (q2Var == null || (x0VarS = q2Var.s(this, obj)) == null) ? x0.IGNORED : x0VarS;
    }

    public final void d() {
        q2 q2Var = this.f135216a;
        if (q2Var != null) {
            q2Var.e();
        }
        this.f135216a = null;
        this.f135221f = null;
        this.f135222g = null;
        this.f135219d = null;
    }

    public final void e(boolean z14) {
        int i14 = this.f135217b;
        this.f135217b = z14 ? i14 | 32 : i14 & (-33);
    }

    public final void f(e23.p<? super m, ? super Integer, Unit> pVar) {
        this.f135219d = pVar;
    }

    @Override // p3.o2
    public final void invalidate() {
        q2 q2Var = this.f135216a;
        if (q2Var != null) {
            q2Var.s(this, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/p2$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(s3.l lVar, List list, q2 q2Var) {
            Object obj;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iC = lVar.c((s3.b) list.get(i14));
                int iP = lVar.P(lVar.r(iC), lVar.f156364b);
                if (iP < lVar.g(lVar.r(iC + 1), lVar.f156364b)) {
                    obj = lVar.f156365c[lVar.h(iP)];
                } else {
                    m.f135153a.getClass();
                    obj = m.a.f135155b;
                }
                p2 p2Var = obj instanceof p2 ? (p2) obj : null;
                if (p2Var != null) {
                    p2Var.f135216a = q2Var;
                }
            }
        }

        private a() {
        }
    }
}
