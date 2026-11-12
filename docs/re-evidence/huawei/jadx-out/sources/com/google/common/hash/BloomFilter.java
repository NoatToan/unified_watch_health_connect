package com.google.common.hash;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Strategy f4567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BloomFilterStrategies.e f4568b;
    private final int d;
    private final Funnel<? super T> e;

    interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.e eVar);

        int ordinal();

        <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.e eVar);
    }

    private BloomFilter(BloomFilterStrategies.e eVar, int i, Funnel<? super T> funnel, Strategy strategy) {
        Preconditions.checkArgument(i > 0, "numHashFunctions (%s) must be > 0", i);
        Preconditions.checkArgument(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.f4568b = (BloomFilterStrategies.e) Preconditions.checkNotNull(eVar);
        this.d = i;
        this.e = (Funnel) Preconditions.checkNotNull(funnel);
        this.f4567a = (Strategy) Preconditions.checkNotNull(strategy);
    }

    public boolean e(@ParametricNullness T t) {
        return this.f4567a.mightContain(t, this.e, this.d, this.f4568b);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t) {
        return e(t);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.d == bloomFilter.d && this.e.equals(bloomFilter.e) && this.f4568b.equals(bloomFilter.f4568b) && this.f4567a.equals(bloomFilter.f4567a);
    }

    public int hashCode() {
        int i = this.d;
        return Objects.hashCode(Integer.valueOf(i), this.e, this.f4567a, this.f4568b);
    }

    private Object writeReplace() {
        return new e(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static class e<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f4569a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4570c;
        final Funnel<? super T> d;
        final Strategy e;

        e(BloomFilter<T> bloomFilter) {
            this.f4569a = BloomFilterStrategies.e.a(((BloomFilter) bloomFilter).f4568b.d);
            this.f4570c = ((BloomFilter) bloomFilter).d;
            this.d = ((BloomFilter) bloomFilter).e;
            this.e = ((BloomFilter) bloomFilter).f4567a;
        }

        Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.e(this.f4569a), this.f4570c, this.d, this.e);
        }
    }
}
