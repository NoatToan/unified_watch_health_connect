package l33;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f109715a = new a();

        private a() {
        }

        @Override // l33.c
        public final o33.s a(x33.f fVar) {
            fVar.getClass();
            return null;
        }

        @Override // l33.c
        public final Set<x33.f> b() {
            return p13.l0.f134950a;
        }

        @Override // l33.c
        public final Collection c(x33.f fVar) {
            fVar.getClass();
            return p13.j0.f134944a;
        }

        @Override // l33.c
        public final Set<x33.f> d() {
            return p13.l0.f134950a;
        }

        @Override // l33.c
        public final o33.m e(x33.f fVar) {
            fVar.getClass();
            return null;
        }

        @Override // l33.c
        public final Set<x33.f> f() {
            return p13.l0.f134950a;
        }
    }

    o33.s a(x33.f fVar);

    Set<x33.f> b();

    Collection<o33.o> c(x33.f fVar);

    Set<x33.f> d();

    o33.m e(x33.f fVar);

    Set<x33.f> f();
}
