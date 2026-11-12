package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import defpackage.ajo;
import defpackage.aju;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class CacheBuilder<K, V> {

    @CheckForNull
    Equivalence<Object> g;

    @CheckForNull
    LocalCache.Strength i;

    @CheckForNull
    RemovalListener<? super K, ? super V> o;

    @CheckForNull
    LocalCache.Strength p;

    @CheckForNull
    Weigher<? super K, ? super V> q;

    @CheckForNull
    Equivalence<Object> s;

    @CheckForNull
    Ticker t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Supplier<? extends AbstractCache.StatsCounter> f4217b = Suppliers.ofInstance(new AbstractCache.StatsCounter() { // from class: com.google.common.cache.CacheBuilder.5
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
        public ajo snapshot() {
            return CacheBuilder.f4216a;
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ajo f4216a = new ajo(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Supplier<AbstractCache.StatsCounter> f4218c = new Supplier<AbstractCache.StatsCounter>() { // from class: com.google.common.cache.CacheBuilder.1
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.c();
        }
    };
    static final Ticker d = new Ticker() { // from class: com.google.common.cache.CacheBuilder.2
        @Override // com.google.common.base.Ticker
        public long read() {
            return 0L;
        }
    };
    boolean r = true;
    int f = -1;
    int e = -1;
    long m = -1;
    long n = -1;
    long h = -1;
    long j = -1;
    long k = -1;
    Supplier<? extends AbstractCache.StatsCounter> l = f4217b;

    enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(aju<Object, Object> ajuVar) {
        }
    }

    enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Logger f4219c = Logger.getLogger(CacheBuilder.class.getName());
    }

    private CacheBuilder() {
    }

    public static CacheBuilder<Object, Object> a() {
        return new CacheBuilder<>();
    }

    CacheBuilder<K, V> a(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.g;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.g = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    Equivalence<Object> g() {
        return (Equivalence) MoreObjects.firstNonNull(this.g, j().defaultEquivalence());
    }

    CacheBuilder<K, V> c(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.s;
        Preconditions.checkState(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.s = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    Equivalence<Object> n() {
        return (Equivalence) MoreObjects.firstNonNull(this.s, l().defaultEquivalence());
    }

    int h() {
        int i = this.f;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public CacheBuilder<K, V> b(int i) {
        int i2 = this.e;
        Preconditions.checkState(i2 == -1, "concurrency level was already set to %s", i2);
        Preconditions.checkArgument(i > 0);
        this.e = i;
        return this;
    }

    int d() {
        int i = this.e;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public CacheBuilder<K, V> e(long j) {
        long j2 = this.m;
        Preconditions.checkState(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.n;
        Preconditions.checkState(j3 == -1, "maximum weight was already set to %s", j3);
        Preconditions.checkState(this.q == null, "maximum size can not be combined with weigher");
        Preconditions.checkArgument(j >= 0, "maximum size must not be negative");
        this.m = j;
        return this;
    }

    public CacheBuilder<K, V> d(long j) {
        long j2 = this.n;
        Preconditions.checkState(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.m;
        Preconditions.checkState(j3 == -1, "maximum size was already set to %s", j3);
        Preconditions.checkArgument(j >= 0, "maximum weight must not be negative");
        this.n = j;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> a(Weigher<? super K1, ? super V1> weigher) {
        Preconditions.checkState(this.q == null);
        if (this.r) {
            long j = this.m;
            Preconditions.checkState(j == -1, "weigher can not be combined with maximum size (%s provided)", j);
        }
        this.q = (Weigher) Preconditions.checkNotNull(weigher);
        return this;
    }

    long f() {
        if (this.h == 0 || this.j == 0) {
            return 0L;
        }
        return this.q == null ? this.m : this.n;
    }

    <K1 extends K, V1 extends V> Weigher<K1, V1> k() {
        return (Weigher) MoreObjects.firstNonNull(this.q, OneWeigher.INSTANCE);
    }

    public CacheBuilder<K, V> t() {
        return b(LocalCache.Strength.WEAK);
    }

    CacheBuilder<K, V> b(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.i;
        Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.i = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    LocalCache.Strength j() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.i, LocalCache.Strength.STRONG);
    }

    CacheBuilder<K, V> a(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.p;
        Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.p = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    LocalCache.Strength l() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.p, LocalCache.Strength.STRONG);
    }

    public CacheBuilder<K, V> c(long j, TimeUnit timeUnit) {
        long j2 = this.h;
        Preconditions.checkState(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.h = timeUnit.toNanos(j);
        return this;
    }

    long c() {
        long j = this.h;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public CacheBuilder<K, V> e(long j, TimeUnit timeUnit) {
        long j2 = this.j;
        Preconditions.checkState(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.j = timeUnit.toNanos(j);
        return this;
    }

    long b() {
        long j = this.j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    long i() {
        long j = this.k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public CacheBuilder<K, V> e(Ticker ticker) {
        Preconditions.checkState(this.t == null);
        this.t = (Ticker) Preconditions.checkNotNull(ticker);
        return this;
    }

    Ticker a(boolean z) {
        Ticker ticker = this.t;
        if (ticker != null) {
            return ticker;
        }
        return z ? Ticker.systemTicker() : d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> e(RemovalListener<? super K1, ? super V1> removalListener) {
        Preconditions.checkState(this.o == null);
        this.o = (RemovalListener) Preconditions.checkNotNull(removalListener);
        return this;
    }

    <K1 extends K, V1 extends V> RemovalListener<K1, V1> m() {
        return (RemovalListener) MoreObjects.firstNonNull(this.o, NullListener.INSTANCE);
    }

    Supplier<? extends AbstractCache.StatsCounter> o() {
        return this.l;
    }

    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> b(CacheLoader<? super K1, V1> cacheLoader) {
        q();
        return new LocalCache.f(this, cacheLoader);
    }

    public <K1 extends K, V1 extends V> Cache<K1, V1> e() {
        q();
        p();
        return new LocalCache.g(this);
    }

    private void p() {
        Preconditions.checkState(this.k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void q() {
        if (this.q == null) {
            Preconditions.checkState(this.n == -1, "maximumWeight requires weigher");
        } else if (this.r) {
            Preconditions.checkState(this.n != -1, "weigher requires maximumWeight");
        } else if (this.n == -1) {
            b.f4219c.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.f;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.e;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        long j = this.m;
        if (j != -1) {
            stringHelper.add("maximumSize", j);
        }
        long j2 = this.n;
        if (j2 != -1) {
            stringHelper.add("maximumWeight", j2);
        }
        if (this.h != -1) {
            stringHelper.add("expireAfterWrite", this.h + "ns");
        }
        if (this.j != -1) {
            stringHelper.add("expireAfterAccess", this.j + "ns");
        }
        LocalCache.Strength strength = this.i;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        LocalCache.Strength strength2 = this.p;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.g != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.s != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.o != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }
}
