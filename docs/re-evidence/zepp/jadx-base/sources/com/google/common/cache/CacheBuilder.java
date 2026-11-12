package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class CacheBuilder<K, V> {
    private static final int q = 16;
    private static final int r = 4;
    private static final int s = 0;
    private static final int t = 0;
    public static final Supplier<? extends AbstractCache.StatsCounter> u = Suppliers.ofInstance(new a());
    public static final CacheStats v = new CacheStats(0, 0, 0, 0, 0, 0);
    public static final Supplier<AbstractCache.StatsCounter> w = new b();
    public static final Ticker x = new c();
    private static final Logger y = Logger.getLogger(CacheBuilder.class.getName());
    public static final int z = -1;

    @MonotonicNonNullDecl
    public Weigher<? super K, ? super V> f;

    @MonotonicNonNullDecl
    public com.google.common.cache.a.t g;

    @MonotonicNonNullDecl
    public com.google.common.cache.a.t h;

    @MonotonicNonNullDecl
    public Equivalence<Object> l;

    @MonotonicNonNullDecl
    public Equivalence<Object> m;

    @MonotonicNonNullDecl
    public RemovalListener<? super K, ? super V> n;

    @MonotonicNonNullDecl
    public Ticker o;
    public boolean a = true;
    public int b = -1;
    public int c = -1;
    public long d = -1;
    public long e = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;
    public Supplier<? extends AbstractCache.StatsCounter> p = u;

    public static class a implements AbstractCache.StatsCounter {
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
            return CacheBuilder.v;
        }
    }

    public static class b implements Supplier<AbstractCache.StatsCounter> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    }

    public static class c extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
            return 0L;
        }
    }

    public enum d implements RemovalListener<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum e implements Weigher<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    private CacheBuilder() {
    }

    private void a() {
        Preconditions.checkState(this.k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void b() {
        if (this.f == null) {
            Preconditions.checkState(this.e == -1, "maximumWeight requires weigher");
        } else if (this.a) {
            Preconditions.checkState(this.e != -1, "weigher requires maximumWeight");
        } else if (this.e == -1) {
            y.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(CacheBuilderSpec cacheBuilderSpec) {
        return cacheBuilderSpec.d().s();
    }

    public static CacheBuilder<Object, Object> newBuilder() {
        return new CacheBuilder<>();
    }

    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
        b();
        return new com.google.common.cache.a.n(this, cacheLoader);
    }

    public int c() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public CacheBuilder<K, V> concurrencyLevel(int i) {
        int i2 = this.c;
        Preconditions.checkState(i2 == -1, "concurrency level was already set to %s", i2);
        Preconditions.checkArgument(i > 0);
        this.c = i;
        return this;
    }

    public long d() {
        long j = this.j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public long e() {
        long j = this.i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public CacheBuilder<K, V> expireAfterAccess(long j, TimeUnit timeUnit) {
        long j2 = this.j;
        Preconditions.checkState(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.j = timeUnit.toNanos(j);
        return this;
    }

    public CacheBuilder<K, V> expireAfterWrite(long j, TimeUnit timeUnit) {
        long j2 = this.i;
        Preconditions.checkState(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.i = timeUnit.toNanos(j);
        return this;
    }

    public int f() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public Equivalence<Object> g() {
        return (Equivalence) MoreObjects.firstNonNull(this.l, h().a());
    }

    public com.google.common.cache.a.t h() {
        return (com.google.common.cache.a.t) MoreObjects.firstNonNull(this.g, com.google.common.cache.a.t.STRONG);
    }

    public long i() {
        if (this.i == 0 || this.j == 0) {
            return 0L;
        }
        return this.f == null ? this.d : this.e;
    }

    public CacheBuilder<K, V> initialCapacity(int i) {
        int i2 = this.b;
        Preconditions.checkState(i2 == -1, "initial capacity was already set to %s", i2);
        Preconditions.checkArgument(i >= 0);
        this.b = i;
        return this;
    }

    public long j() {
        long j = this.k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public <K1 extends K, V1 extends V> RemovalListener<K1, V1> k() {
        return (RemovalListener) MoreObjects.firstNonNull(this.n, d.INSTANCE);
    }

    public Supplier<? extends AbstractCache.StatsCounter> l() {
        return this.p;
    }

    public Ticker m(boolean z2) {
        Ticker ticker = this.o;
        if (ticker != null) {
            return ticker;
        }
        return z2 ? Ticker.systemTicker() : x;
    }

    public CacheBuilder<K, V> maximumSize(long j) {
        long j2 = this.d;
        Preconditions.checkState(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.e;
        Preconditions.checkState(j3 == -1, "maximum weight was already set to %s", j3);
        Preconditions.checkState(this.f == null, "maximum size can not be combined with weigher");
        Preconditions.checkArgument(j >= 0, "maximum size must not be negative");
        this.d = j;
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> maximumWeight(long j) {
        long j2 = this.e;
        Preconditions.checkState(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.d;
        Preconditions.checkState(j3 == -1, "maximum size was already set to %s", j3);
        this.e = j;
        Preconditions.checkArgument(j >= 0, "maximum weight must not be negative");
        return this;
    }

    public Equivalence<Object> n() {
        return (Equivalence) MoreObjects.firstNonNull(this.m, o().a());
    }

    public com.google.common.cache.a.t o() {
        return (com.google.common.cache.a.t) MoreObjects.firstNonNull(this.h, com.google.common.cache.a.t.STRONG);
    }

    public <K1 extends K, V1 extends V> Weigher<K1, V1> p() {
        return (Weigher) MoreObjects.firstNonNull(this.f, e.INSTANCE);
    }

    public boolean q() {
        return this.p == w;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> r(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.l;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.l = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    public CacheBuilder<K, V> recordStats() {
        this.p = w;
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        long j2 = this.k;
        Preconditions.checkState(j2 == -1, "refresh was already set to %s ns", j2);
        Preconditions.checkArgument(j > 0, "duration must be positive: %s %s", j, timeUnit);
        this.k = timeUnit.toNanos(j);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
        Preconditions.checkState(this.n == null);
        this.n = (RemovalListener) Preconditions.checkNotNull(removalListener);
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> s() {
        this.a = false;
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> softValues() {
        return u(com.google.common.cache.a.t.SOFT);
    }

    public CacheBuilder<K, V> t(com.google.common.cache.a.t tVar) {
        com.google.common.cache.a.t tVar2 = this.g;
        Preconditions.checkState(tVar2 == null, "Key strength was already set to %s", tVar2);
        this.g = (com.google.common.cache.a.t) Preconditions.checkNotNull(tVar);
        return this;
    }

    public CacheBuilder<K, V> ticker(Ticker ticker) {
        Preconditions.checkState(this.o == null);
        this.o = (Ticker) Preconditions.checkNotNull(ticker);
        return this;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        long j = this.d;
        if (j != -1) {
            stringHelper.add("maximumSize", j);
        }
        long j2 = this.e;
        if (j2 != -1) {
            stringHelper.add("maximumWeight", j2);
        }
        if (this.i != -1) {
            stringHelper.add("expireAfterWrite", this.i + "ns");
        }
        if (this.j != -1) {
            stringHelper.add("expireAfterAccess", this.j + "ns");
        }
        com.google.common.cache.a.t tVar = this.g;
        if (tVar != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(tVar.toString()));
        }
        com.google.common.cache.a.t tVar2 = this.h;
        if (tVar2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(tVar2.toString()));
        }
        if (this.l != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.m != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.n != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }

    public CacheBuilder<K, V> u(com.google.common.cache.a.t tVar) {
        com.google.common.cache.a.t tVar2 = this.h;
        Preconditions.checkState(tVar2 == null, "Value strength was already set to %s", tVar2);
        this.h = (com.google.common.cache.a.t) Preconditions.checkNotNull(tVar);
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> v(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.m;
        Preconditions.checkState(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.m = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakKeys() {
        return t(com.google.common.cache.a.t.WEAK);
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakValues() {
        return u(com.google.common.cache.a.t.WEAK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> weigher(Weigher<? super K1, ? super V1> weigher) {
        Preconditions.checkState(this.f == null);
        if (this.a) {
            long j = this.d;
            Preconditions.checkState(j == -1, "weigher can not be combined with maximum size", j);
        }
        this.f = (Weigher) Preconditions.checkNotNull(weigher);
        return this;
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(String str) {
        return from(CacheBuilderSpec.parse(str));
    }

    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
        b();
        a();
        return new com.google.common.cache.a.o(this);
    }
}
