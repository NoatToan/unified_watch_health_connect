package p43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f135938a;

    public static final class a extends w1 {
        @Override // p43.w1
        public final t1 d(n0 n0Var) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    static {
        new b(null);
        f135938a = new a();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public u23.h c(u23.h hVar) {
        hVar.getClass();
        return hVar;
    }

    public abstract t1 d(n0 n0Var);

    public boolean e() {
        return this instanceof a;
    }

    public n0 f(g2 g2Var, n0 n0Var) {
        n0Var.getClass();
        g2Var.getClass();
        return n0Var;
    }

    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
