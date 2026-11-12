package defpackage;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ey6<C extends Comparable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17185a;

    public static final class b extends ey6<Integer> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f17186b = new b();
        private static final long serialVersionUID = 0;

        public b() {
            super(true);
        }

        private Object readResolve() {
            return f17186b;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer d() {
            return Integer.MAX_VALUE;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer e() {
            return Integer.MIN_VALUE;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer f(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer g(Integer num, long j) {
            d44.c(j, "distance");
            return Integer.valueOf(ahd.c(num.longValue() + j));
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer h(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class c extends ey6<Long> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17187b = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return f17187b;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long a(Long l, Long l2) {
            long jLongValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long d() {
            return Long.MAX_VALUE;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long e() {
            return Long.MIN_VALUE;
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long f(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long g(Long l, long j) {
            d44.c(j, "distance");
            long jLongValue = l.longValue() + j;
            if (jLongValue < 0) {
                c6i.e(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // defpackage.ey6
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long h(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public ey6() {
        this(false);
    }

    public static ey6<Integer> b() {
        return b.f17186b;
    }

    public static ey6<Long> c() {
        return c.f17187b;
    }

    public abstract long a(C c2, C c3);

    public abstract C d();

    public abstract C e();

    public abstract C f(C c2);

    public abstract C g(C c2, long j);

    public abstract C h(C c2);

    public ey6(boolean z) {
        this.f17185a = z;
    }
}
