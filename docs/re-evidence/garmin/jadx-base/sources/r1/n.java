package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface n<S> extends s1.t1.b<S> {
    x1 b(int i14, s1.b2 b2Var, e23.l lVar);

    l0 d(l0 l0Var, j2 j2Var);

    v1 e(int i14, s1.b2 b2Var, e23.l lVar);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lr1/n$a;", "", "a", "value", "", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @d23.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2813a f149168b = new C2813a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f149169c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f149170d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f149171e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f149172f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f149173g = 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f149174a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f149174a == ((a) obj).f149174a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f149174a);
        }

        public final String toString() {
            int i14 = this.f149174a;
            if (i14 == 0) {
                return "Left";
            }
            if (i14 == f149169c) {
                return "Right";
            }
            if (i14 == f149170d) {
                return "Up";
            }
            if (i14 == f149171e) {
                return "Down";
            }
            if (i14 == f149172f) {
                return "Start";
            }
            return i14 == f149173g ? "End" : "Invalid";
        }

        /* JADX INFO: renamed from: r1.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr1/n$a$a;", "", "<init>", "()V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2813a {
            public /* synthetic */ C2813a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2813a() {
            }
        }
    }
}
