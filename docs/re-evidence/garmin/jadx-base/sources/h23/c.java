package h23;

import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh23/c;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f81216a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h23.a f81217b;

    static {
        x13.b.f188452a.getClass();
        Integer num = z13.a.C3761a.f201505a;
        f81217b = (num == null || num.intValue() >= 34) ? new i23.a() : new b();
    }

    public abstract int a(int i14);

    public int b() {
        return a(32);
    }

    public int c(int i14) {
        return d(0, i14);
    }

    public int d(int i14, int i15) {
        int iB;
        int i16;
        int iA;
        if (i15 <= i14) {
            h.x(gl1.d.k(Integer.valueOf(i14), Integer.valueOf(i15)));
            return 0;
        }
        int i17 = i15 - i14;
        if (i17 > 0 || i17 == Integer.MIN_VALUE) {
            if (((-i17) & i17) == i17) {
                iA = a(31 - Integer.numberOfLeadingZeros(i17));
            } else {
                do {
                    iB = b() >>> 1;
                    i16 = iB % i17;
                } while ((i17 - 1) + (iB - i16) < 0);
                iA = i16;
            }
            return i14 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i14 <= iB2 && iB2 < i15) {
                return iB2;
            }
        }
    }

    public long e() {
        return (((long) b()) << 32) + ((long) b());
    }

    public long f(long j8, long j14) {
        long jE;
        long j15;
        long jA;
        int iB;
        if (j14 <= j8) {
            h.x(gl1.d.k(Long.valueOf(j8), Long.valueOf(j14)));
            return 0L;
        }
        long j16 = j14 - j8;
        if (j16 > 0) {
            if (((-j16) & j16) == j16) {
                int i14 = (int) j16;
                int i15 = (int) (j16 >>> 32);
                if (i14 != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i14));
                } else if (i15 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i15))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j15 = jE % j16;
                } while ((j16 - 1) + (jE - j15) < 0);
                jA = j15;
            }
            return j8 + jA;
        }
        while (true) {
            long jE2 = e();
            if (j8 <= jE2 && jE2 < j14) {
                return jE2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh23/c$a;", "Lh23/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "defaultRandom", "Lh23/c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c implements Serializable {
        public /* synthetic */ a(j jVar) {
            this();
        }

        @Override // h23.c
        public final int a(int i14) {
            return c.f81217b.a(i14);
        }

        @Override // h23.c
        public final int b() {
            return c.f81217b.b();
        }

        @Override // h23.c
        public final int c(int i14) {
            return c.f81217b.c(i14);
        }

        @Override // h23.c
        public final int d(int i14, int i15) {
            return c.f81217b.d(i14, i15);
        }

        @Override // h23.c
        public final long e() {
            return c.f81217b.e();
        }

        @Override // h23.c
        public final long f(long j8, long j14) {
            throw null;
        }

        private a() {
        }
    }
}
