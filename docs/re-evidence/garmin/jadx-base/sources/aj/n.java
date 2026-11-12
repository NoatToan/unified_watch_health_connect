package aj;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public class n<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3367a;

    public class a extends qj.i<b<A>, B> {
        public a(n nVar, long j8) {
            super(j8);
        }

        @Override // qj.i
        public final void c(Object obj, Object obj2) {
            b bVar = (b) obj;
            bVar.getClass();
            ArrayDeque arrayDeque = b.f3368b;
            synchronized (arrayDeque) {
                arrayDeque.offer(bVar);
            }
        }
    }

    public static final class b<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ArrayDeque f3368b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public A f3369a;

        static {
            char[] cArr = qj.m.f144982a;
            f3368b = new ArrayDeque(0);
        }

        private b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(Object obj) {
            b bVar;
            ArrayDeque arrayDeque = f3368b;
            synchronized (arrayDeque) {
                bVar = (b) arrayDeque.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.f3369a = obj;
            return bVar;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && this.f3369a.equals(((b) obj).f3369a);
        }

        public final int hashCode() {
            return this.f3369a.hashCode();
        }
    }

    public n(long j8) {
        this.f3367a = new a(this, j8);
    }

    public n() {
        this(250L);
    }
}
