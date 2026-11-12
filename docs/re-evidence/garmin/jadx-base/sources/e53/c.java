package e53;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import j23.t;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Le53/c;", "", "a", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f63094b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f63095c = e.b(4611686018427387903L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f63096d = e.b(-4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f63097e = 9223372036854759646L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63098a;

    @o13.e
    private /* synthetic */ c(long j8) {
        this.f63098a = j8;
    }

    public static final long a(long j8, long j14) {
        long j15 = 1000000;
        long j16 = j14 / j15;
        long jA = e.a(j8, j16);
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return e.b(jA);
        }
        return e.c((jA * j15) + (j14 - (j16 * j15)));
    }

    public static final void b(StringBuilder sb3, int i14, int i15, int i16, String str, boolean z14) {
        sb3.append(i14);
        if (i15 != 0) {
            sb3.append('.');
            String strM = w.M(i16, String.valueOf(i15));
            int i17 = -1;
            int length = strM.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i18 = length - 1;
                    if (strM.charAt(length) != '0') {
                        i17 = length;
                        break;
                    } else if (i18 < 0) {
                        break;
                    } else {
                        length = i18;
                    }
                }
            }
            int i19 = i17 + 1;
            if (z14 || i19 >= 3) {
                sb3.append((CharSequence) strM, 0, ((i17 + 3) / 3) * 3);
            } else {
                sb3.append((CharSequence) strM, 0, i19);
            }
        }
        sb3.append(str);
    }

    public static final /* synthetic */ c c(long j8) {
        return new c(j8);
    }

    public static int d(long j8, long j14) {
        long j15 = j8 ^ j14;
        if (j15 < 0 || (((int) j15) & 1) == 0) {
            return s.i(j8, j14);
        }
        int i14 = (((int) j8) & 1) - (((int) j14) & 1);
        return j8 < 0 ? -i14 : i14;
    }

    public static final long e(long j8) {
        return ((((int) j8) & 1) != 1 || g(j8)) ? j(j8, f.MILLISECONDS) : j8 >> 1;
    }

    public static final int f(long j8) {
        if (g(j8)) {
            return 0;
        }
        return (int) ((((int) j8) & 1) == 1 ? ((j8 >> 1) % ((long) 1000)) * ((long) 1000000) : (j8 >> 1) % ((long) 1000000000));
    }

    public static final boolean g(long j8) {
        return j8 == f63095c || j8 == f63096d;
    }

    public static final long h(long j8, long j14) {
        int i14 = ((int) j8) & 1;
        if (i14 != (((int) j14) & 1)) {
            return i14 == 1 ? a(j8 >> 1, j14 >> 1) : a(j14 >> 1, j8 >> 1);
        }
        if (i14 == 0) {
            long j15 = (j8 >> 1) + (j14 >> 1);
            return (-4611686018426999999L > j15 || j15 >= 4611686018427000000L) ? e.b(j15 / ((long) 1000000)) : e.c(j15);
        }
        long jA = e.a(j8 >> 1, j14 >> 1);
        if (jA == 9223372036854759646L) {
            vb.h.s("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jA == 4611686018427387903L || jA == -4611686018427387903L) {
            return e.b(jA);
        }
        return (-4611686018426L > jA || jA >= 4611686018427L) ? e.b(t.g(jA, -4611686018427387903L, 4611686018427387903L)) : e.c(jA * ((long) 1000000));
    }

    public static final double i(long j8, f fVar) {
        fVar.getClass();
        if (j8 == f63095c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == f63096d) {
            return Double.NEGATIVE_INFINITY;
        }
        double d14 = j8 >> 1;
        f fVar2 = (((int) j8) & 1) == 0 ? f.NANOSECONDS : f.MILLISECONDS;
        fVar2.getClass();
        TimeUnit timeUnit = fVar.f63109a;
        TimeUnit timeUnit2 = fVar2.f63109a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d14 * jConvert : d14 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long j(long j8, f fVar) {
        fVar.getClass();
        if (j8 == f63095c) {
            return Long.MAX_VALUE;
        }
        if (j8 == f63096d) {
            return Long.MIN_VALUE;
        }
        long j14 = j8 >> 1;
        f fVar2 = (((int) j8) & 1) == 0 ? f.NANOSECONDS : f.MILLISECONDS;
        fVar2.getClass();
        return fVar.f63109a.convert(j14, fVar2.f63109a);
    }

    public static String k(long j8) {
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f63095c) {
            return "Infinity";
        }
        if (j8 == f63096d) {
            return "-Infinity";
        }
        int i14 = 0;
        boolean z14 = j8 < 0;
        StringBuilder sb3 = new StringBuilder();
        if (z14) {
            sb3.append('-');
        }
        long jL = j8 < 0 ? l(j8) : j8;
        long j14 = j(jL, f.DAYS);
        int iJ = g(jL) ? 0 : (int) (j(jL, f.HOURS) % ((long) 24));
        int iJ2 = g(jL) ? 0 : (int) (j(jL, f.MINUTES) % ((long) 60));
        int iJ3 = g(jL) ? 0 : (int) (j(jL, f.SECONDS) % ((long) 60));
        int iF = f(jL);
        boolean z15 = j14 != 0;
        boolean z16 = iJ != 0;
        boolean z17 = iJ2 != 0;
        boolean z18 = (iJ3 == 0 && iF == 0) ? false : true;
        if (z15) {
            sb3.append(j14);
            sb3.append('d');
            i14 = 1;
        }
        if (z16 || (z15 && (z17 || z18))) {
            int i15 = i14 + 1;
            if (i14 > 0) {
                sb3.append(' ');
            }
            sb3.append(iJ);
            sb3.append('h');
            i14 = i15;
        }
        if (z17 || (z18 && (z16 || z15))) {
            int i16 = i14 + 1;
            if (i14 > 0) {
                sb3.append(' ');
            }
            sb3.append(iJ2);
            sb3.append('m');
            i14 = i16;
        }
        if (z18) {
            int i17 = i14 + 1;
            if (i14 > 0) {
                sb3.append(' ');
            }
            if (iJ3 != 0 || z15 || z16 || z17) {
                b(sb3, iJ3, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb3, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb3, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb3.append(iF);
                sb3.append("ns");
            }
            i14 = i17;
        }
        if (z14 && i14 > 1) {
            sb3.insert(1, CoreConstants.LEFT_PARENTHESIS_CHAR).append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb3.toString();
    }

    public static final long l(long j8) {
        long j14 = ((-(j8 >> 1)) << 1) + ((long) (((int) j8) & 1));
        f63094b.getClass();
        int i14 = d.f63099a;
        return j14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        return d(this.f63098a, cVar.f63098a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f63098a == ((c) obj).f63098a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63098a);
    }

    public final String toString() {
        return k(this.f63098a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le53/c$a;", "", "<init>", "()V", "", "INVALID_RAW_VALUE", "J", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
