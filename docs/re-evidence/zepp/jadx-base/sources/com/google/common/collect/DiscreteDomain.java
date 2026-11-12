package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class DiscreteDomain<C extends Comparable> {
    public final boolean a;

    public static final class b extends DiscreteDomain<BigInteger> implements Serializable {
        private static final b b = new b();
        private static final BigInteger c = BigInteger.valueOf(Long.MIN_VALUE);
        private static final BigInteger d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public b() {
            super(true);
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(c).min(d).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger bigInteger, long j) {
            u.c(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class c extends DiscreteDomain<Integer> implements Serializable {
        private static final c b = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer a(Integer num, long j) {
            u.c(j, "distance");
            return Integer.valueOf(Ints.checkedCast(num.longValue() + j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer previous(Integer num) {
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

    public static final class d extends DiscreteDomain<Long> implements Serializable {
        private static final d b = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super(true);
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long distance(Long l, Long l2) {
            long jLongValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long next(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long a(Long l, long j) {
            u.c(j, "distance");
            long jLongValue = l.longValue() + j;
            if (jLongValue < 0) {
                Preconditions.checkArgument(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Long previous(Long l) {
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

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return b.b;
    }

    public static DiscreteDomain<Integer> integers() {
        return c.b;
    }

    public static DiscreteDomain<Long> longs() {
        return d.b;
    }

    public C a(C c2, long j) {
        u.c(j, "distance");
        for (long j2 = 0; j2 < j; j2++) {
            c2 = (C) next(c2);
        }
        return c2;
    }

    public abstract long distance(C c2, C c3);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c2);

    public abstract C previous(C c2);

    public DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z) {
        this.a = z;
    }
}
