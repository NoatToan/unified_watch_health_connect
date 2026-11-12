package u23;

import java.util.Iterator;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p13.i0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public interface h extends Iterable<c>, f23.a {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a f168226x0 = a.f168227a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f168227a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3153a f168228b = new C3153a();

        /* JADX INFO: renamed from: u23.h$a$a, reason: collision with other inner class name */
        public static final class C3153a implements h {
            @Override // u23.h
            public final /* bridge */ boolean I3(x33.c cVar) {
                return b.b(this, cVar);
            }

            @Override // u23.h
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<c> iterator() {
                j0.f134944a.getClass();
                return i0.f134941a;
            }

            public final String toString() {
                return "EMPTY";
            }

            @Override // u23.h
            public final c z(x33.c cVar) {
                cVar.getClass();
                return null;
            }
        }

        private a() {
        }

        public static h a(List list) {
            return list.isEmpty() ? f168228b : new i(list);
        }
    }

    public static final class b {
        public static c a(h hVar, x33.c cVar) {
            c next;
            cVar.getClass();
            Iterator<c> it = hVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.g(next.c(), cVar)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean b(h hVar, x33.c cVar) {
            cVar.getClass();
            return hVar.z(cVar) != null;
        }
    }

    boolean I3(x33.c cVar);

    boolean isEmpty();

    c z(x33.c cVar);
}
