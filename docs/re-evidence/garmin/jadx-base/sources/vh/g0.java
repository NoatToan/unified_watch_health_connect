package vh;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f178322a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lvh/g0$a;", "", "<init>", "()V", "Lvh/g0;", "Empty", "Lvh/g0;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f178323a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    public interface b extends g0 {

        public static final class a {
            public static <R> R a(b bVar, R r14, e23.p<? super R, ? super b, ? extends R> pVar) {
                pVar.getClass();
                return pVar.invoke(r14, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                cVar.getClass();
                if (p005kotlin.jvm.internal.s.g(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g0 c(b bVar, c<?> cVar) {
                cVar.getClass();
                return p005kotlin.jvm.internal.s.g(bVar.getKey(), cVar) ? c0.f178279b : bVar;
            }

            public static g0 d(g0 g0Var, b bVar) {
                g0Var.getClass();
                return g0Var == c0.f178279b ? bVar : (g0) g0Var.fold(bVar, h0.f178325a);
            }
        }

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    static {
        int i14 = a.f178323a;
        f178322a = c0.f178279b;
    }

    g0 a(c<?> cVar);

    <E extends b> E b(c<E> cVar);

    g0 c(g0 g0Var);

    <R> R fold(R r14, e23.p<? super R, ? super b, ? extends R> pVar);
}
