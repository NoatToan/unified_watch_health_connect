package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.huawei.operation.utils.Constants;
import defpackage.ale;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {
    public final boolean supportsFastOffset;

    public abstract long distance(C c2, C c3);

    @CheckForNull
    public abstract C next(C c2);

    @CheckForNull
    public abstract C previous(C c2);

    public static DiscreteDomain<Integer> integers() {
        return a.f4327b;
    }

    static final class a extends DiscreteDomain<Integer> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f4327b = new a();
        private static final long serialVersionUID = 0;

        a() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer offset(Integer num, long j) {
            ale.d(j, "distance");
            return Integer.valueOf(Ints.b(num.longValue() + j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        private Object readResolve() {
            return f4327b;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static DiscreteDomain<Long> longs() {
        return c.e;
    }

    static final class c extends DiscreteDomain<Long> implements Serializable {
        private static final c e = new c();
        private static final long serialVersionUID = 0;

        c() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long next(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long previous(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long offset(Long l, long j) {
            ale.d(j, "distance");
            long jLongValue = l.longValue() + j;
            if (jLongValue < 0) {
                Preconditions.checkArgument(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
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
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        private Object readResolve() {
            return e;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return b.e;
    }

    static final class b extends DiscreteDomain<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;
        private static final b e = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final BigInteger f4328b = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BigInteger f4329c = BigInteger.valueOf(Long.MAX_VALUE);

        b() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BigInteger offset(BigInteger bigInteger, long j) {
            ale.d(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f4328b).min(f4329c).longValue();
        }

        private Object readResolve() {
            return e;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }

    public C offset(C c2, long j) {
        ale.d(j, "distance");
        C c3 = c2;
        for (long j2 = 0; j2 < j; j2++) {
            c3 = (C) next(c3);
            if (c3 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c2 + ", " + j + Constants.RIGHT_BRACKET_ONLY);
            }
        }
        return c3;
    }

    public C minValue() {
        throw new NoSuchElementException();
    }

    public C maxValue() {
        throw new NoSuchElementException();
    }
}
