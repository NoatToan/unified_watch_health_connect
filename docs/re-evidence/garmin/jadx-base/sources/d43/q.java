package d43;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import p13.h0;
import p13.j0;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.v0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements m1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f57490f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.c0 f57492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<n0> f57493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f57494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f57495e;

    /* JADX WARN: Multi-variable type inference failed */
    private q(long j8, t23.c0 c0Var, Set<? extends n0> set) {
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        q0 q0Var = q0.f135904a;
        k1Var.getClass();
        this.f57494d = q0.g(this, j0.f134944a, k1Var, false, r43.l.a(r43.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
        this.f57495e = o13.m.b(new o(this));
        this.f57491a = j8;
        this.f57492b = c0Var;
        this.f57493c = set;
    }

    @Override // p43.m1
    public final boolean C() {
        return false;
    }

    @Override // p43.m1
    public final Collection<n0> b() {
        return (List) this.f57495e.getValue();
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        return this.f57492b.e();
    }

    @Override // p43.m1
    public final List<d1> getParameters() {
        return j0.f134944a;
    }

    @Override // p43.m1
    public final t23.h t() {
        return null;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + h0.k0(this.f57493c, ",", null, null, p.f57489a, 30) + ']');
    }

    public static final class a {

        /* JADX INFO: renamed from: d43.q$a$a, reason: collision with other inner class name */
        public enum EnumC1228a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57499a;

            static {
                int[] iArr = new int[EnumC1228a.values().length];
                try {
                    iArr[EnumC1228a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1228a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57499a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j8, t23.c0 c0Var, Set set, p005kotlin.jvm.internal.j jVar) {
        this(j8, c0Var, set);
    }
}
