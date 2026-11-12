package z43;

import e23.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    public static abstract class a<N, R> implements c<N, R> {
        @Override // z43.b.c
        public boolean b(N n14) {
            return true;
        }

        @Override // z43.b.c
        public void c(N n14) {
        }
    }

    /* JADX INFO: renamed from: z43.b$b, reason: collision with other inner class name */
    public interface InterfaceC3774b<N> {
        Iterable<? extends N> a(N n14);
    }

    public interface c<N, R> {
        R a();

        boolean b(N n14);

        void c(N n14);
    }

    public static /* synthetic */ void a(int i14) {
        Object[] objArr = new Object[3];
        switch (i14) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i14) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(List list, InterfaceC3774b interfaceC3774b, a aVar) {
        if (interfaceC3774b == null) {
            a(5);
            throw null;
        }
        d dVar = new d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), interfaceC3774b, dVar, aVar);
        }
        return aVar.a();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void c(Object obj, InterfaceC3774b interfaceC3774b, d dVar, a aVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (interfaceC3774b == null) {
            a(23);
            throw null;
        }
        if (dVar.f202415a.add((N) obj) && aVar.b(obj)) {
            Iterator it = interfaceC3774b.a(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), interfaceC3774b, dVar, aVar);
            }
            aVar.c(obj);
        }
    }

    public static Boolean d(List list, InterfaceC3774b interfaceC3774b, l lVar) {
        if (interfaceC3774b == null) {
            a(8);
            throw null;
        }
        if (lVar != null) {
            return (Boolean) b(list, interfaceC3774b, new z43.a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }

    public static class d<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<N> f202415a;

        public d(Set<N> set) {
            if (set != null) {
                this.f202415a = set;
            } else {
                vb.h.s("Argument for @NotNull parameter 'visited' of kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet.<init> must not be null");
                throw null;
            }
        }

        public d() {
            this(new HashSet());
        }
    }
}
