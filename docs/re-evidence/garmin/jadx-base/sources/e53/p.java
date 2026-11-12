package e53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le53/p$a;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f63127a = new a();

        /* JADX INFO: renamed from: e53.p$a$a, reason: collision with other inner class name */
        @d23.a
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Le53/p$a$a;", "Le53/b;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1330a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f63128a;

            private /* synthetic */ C1330a(long j8) {
                this.f63128a = j8;
            }

            public static final /* synthetic */ C1330a a(long j8) {
                return new C1330a(j8);
            }

            public static long b(long j8) {
                o.f63125a.getClass();
                long jB = o.b();
                f fVar = f.NANOSECONDS;
                fVar.getClass();
                return (1 | (j8 - 1)) == Long.MAX_VALUE ? c.l(n.a(j8)) : n.b(jB, j8, fVar);
            }

            public static final long c(long j8, long j14) {
                o.f63125a.getClass();
                f fVar = f.NANOSECONDS;
                fVar.getClass();
                if (((j14 - 1) | 1) != Long.MAX_VALUE) {
                    return (1 | (j8 - 1)) == Long.MAX_VALUE ? n.a(j8) : n.b(j8, j14, fVar);
                }
                if (j8 != j14) {
                    return c.l(n.a(j14));
                }
                c.f63094b.getClass();
                return 0L;
            }

            @Override // java.lang.Comparable
            public final int compareTo(b bVar) {
                b bVar2 = bVar;
                bVar2.getClass();
                boolean z14 = bVar2 instanceof C1330a;
                long j8 = this.f63128a;
                if (z14) {
                    long jC = c(j8, ((C1330a) bVar2).f63128a);
                    c.f63094b.getClass();
                    return c.d(jC, 0L);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j8 + CoreConstants.RIGHT_PARENTHESIS_CHAR)) + " and " + bVar2);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C1330a) {
                    return this.f63128a == ((C1330a) obj).f63128a;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f63128a);
            }

            @Override // e53.b
            public final long k2() {
                return b(this.f63128a);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.f63128a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private a() {
        }

        @Override // e53.p
        public final C1330a a() {
            o.f63125a.getClass();
            return C1330a.a(o.b());
        }

        public final String toString() {
            o.f63125a.getClass();
            return "TimeSource(System.nanoTime())";
        }
    }

    a.C1330a a();
}
