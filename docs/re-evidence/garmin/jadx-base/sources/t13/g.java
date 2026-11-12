package t13;

import e23.p;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    public interface a extends g {

        /* JADX INFO: renamed from: t13.g$a$a, reason: collision with other inner class name */
        public static final class C3052a {
            public static <R> R a(a aVar, R r14, p<? super R, ? super a, ? extends R> pVar) {
                pVar.getClass();
                return pVar.invoke(r14, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> bVar) {
                bVar.getClass();
                if (s.g(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static g c(a aVar, b<?> bVar) {
                bVar.getClass();
                return s.g(aVar.getKey(), bVar) ? h.f161748a : aVar;
            }

            public static g d(g gVar, a aVar) {
                gVar.getClass();
                return gVar == h.f161748a ? aVar : (g) gVar.fold(aVar, new sv0.b(29));
            }
        }

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r14, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    g minusKey(b<?> bVar);

    g plus(g gVar);
}
