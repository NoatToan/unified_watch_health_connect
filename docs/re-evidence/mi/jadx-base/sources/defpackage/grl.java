package defpackage;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public abstract class grl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbj f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19273b;
    public final long c;

    public static abstract class a extends grl {
        public final long d;
        public final long e;
        public final List<d> f;
        public final long g;
        public final long h;

        @VisibleForTesting
        public final long i;

        public a(tbj tbjVar, long j, long j2, long j3, long j4, List<d> list, long j5, long j6, long j7) {
            super(tbjVar, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
            this.i = j5;
            this.g = j6;
            this.h = j7;
        }

        public long c(long j, long j2) {
            long jG = g(j);
            return jG != -1 ? jG : (int) (i((j2 - this.h) + this.i, j) - d(j, j2));
        }

        public long d(long j, long j2) {
            if (g(j) == -1) {
                long j3 = this.g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(e(), i((j2 - this.h) - j3, j));
                }
            }
            return e();
        }

        public long e() {
            return this.d;
        }

        public long f(long j, long j2) {
            if (this.f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j, j2) + c(j, j2);
            return (j(jD) + h(jD, j)) - this.i;
        }

        public abstract long g(long j);

        public final long h(long j, long j2) {
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - this.d)).f19276b * FolmeCore.NANOS_TO_MS) / this.f19273b;
            }
            long jG = g(j2);
            return (jG == -1 || j != (e() + jG) - 1) ? (this.e * FolmeCore.NANOS_TO_MS) / this.f19273b : j2 - j(j);
        }

        public long i(long j, long j2) {
            long jE = e();
            long jG = g(j2);
            if (jG == 0) {
                return jE;
            }
            if (this.f == null) {
                long j3 = this.d + (j / ((this.e * FolmeCore.NANOS_TO_MS) / this.f19273b));
                if (j3 < jE) {
                    return jE;
                }
                return jG == -1 ? j3 : Math.min(j3, (jE + jG) - 1);
            }
            long j4 = (jG + jE) - 1;
            long j5 = jE;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long j7 = j(j6);
                if (j7 < j) {
                    j5 = j6 + 1;
                } else {
                    if (j7 <= j) {
                        return j6;
                    }
                    j4 = j6 - 1;
                }
            }
            return j5 == jE ? j5 : j4;
        }

        public final long j(long j) {
            List<d> list = this.f;
            return wlq.H0(list != null ? list.get((int) (j - this.d)).f19275a - this.c : (j - this.d) * this.e, FolmeCore.NANOS_TO_MS, this.f19273b);
        }

        public abstract tbj k(tmk tmkVar, long j);

        public boolean l() {
            return this.f != null;
        }
    }

    public static final class b extends a {
        public final List<tbj> j;

        public b(tbj tbjVar, long j, long j2, long j3, long j4, List<d> list, long j5, List<tbj> list2, long j6, long j7) {
            super(tbjVar, j, j2, j3, j4, list, j5, j6, j7);
            this.j = list2;
        }

        @Override // grl.a
        public long g(long j) {
            return this.j.size();
        }

        @Override // grl.a
        public tbj k(tmk tmkVar, long j) {
            return this.j.get((int) (j - this.d));
        }

        @Override // grl.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {
        public final rdq j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final rdq f19274k;
        public final long l;

        public c(tbj tbjVar, long j, long j2, long j3, long j4, long j5, List<d> list, long j6, rdq rdqVar, rdq rdqVar2, long j7, long j8) {
            super(tbjVar, j, j2, j3, j5, list, j6, j7, j8);
            this.j = rdqVar;
            this.f19274k = rdqVar2;
            this.l = j4;
        }

        @Override // defpackage.grl
        public tbj a(tmk tmkVar) {
            rdq rdqVar = this.j;
            if (rdqVar == null) {
                return super.a(tmkVar);
            }
            Format format = tmkVar.f34858b;
            return new tbj(rdqVar.a(format.f7815a, 0L, format.h, 0L), 0L, -1L);
        }

        @Override // grl.a
        public long g(long j) {
            List<d> list = this.f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.l;
            if (j2 != -1) {
                return (j2 - this.d) + 1;
            }
            if (j != -9223372036854775807L) {
                return ui2.a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f19273b)), BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(FolmeCore.NANOS_TO_MS)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // grl.a
        public tbj k(tmk tmkVar, long j) {
            List<d> list = this.f;
            long j2 = list != null ? list.get((int) (j - this.d)).f19275a : (j - this.d) * this.e;
            rdq rdqVar = this.f19274k;
            Format format = tmkVar.f34858b;
            return new tbj(rdqVar.a(format.f7815a, j, format.h, j2), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19276b;

        public d(long j, long j2) {
            this.f19275a = j;
            this.f19276b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19275a == dVar.f19275a && this.f19276b == dVar.f19276b;
        }

        public int hashCode() {
            return (((int) this.f19275a) * 31) + ((int) this.f19276b);
        }
    }

    public grl(tbj tbjVar, long j, long j2) {
        this.f19272a = tbjVar;
        this.f19273b = j;
        this.c = j2;
    }

    public tbj a(tmk tmkVar) {
        return this.f19272a;
    }

    public long b() {
        return wlq.H0(this.c, FolmeCore.NANOS_TO_MS, this.f19273b);
    }

    public static class e extends grl {
        public final long d;
        public final long e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public tbj c() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new tbj(null, this.d, j);
        }

        public e(tbj tbjVar, long j, long j2, long j3, long j4) {
            super(tbjVar, j, j2);
            this.d = j3;
            this.e = j4;
        }
    }
}
