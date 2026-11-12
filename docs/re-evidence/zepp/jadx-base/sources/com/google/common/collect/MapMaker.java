package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class MapMaker {
    private static final int g = 16;
    private static final int h = 4;
    public static final int i = -1;
    public boolean a;
    public int b = -1;
    public int c = -1;

    @MonotonicNonNullDecl
    public q1.q d;

    @MonotonicNonNullDecl
    public q1.q e;

    @MonotonicNonNullDecl
    public Equivalence<Object> f;

    public enum a {
        VALUE
    }

    public int a() {
        int i2 = this.c;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    public int b() {
        int i2 = this.b;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    public Equivalence<Object> c() {
        return (Equivalence) MoreObjects.firstNonNull(this.f, d().a());
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i2) {
        int i3 = this.c;
        Preconditions.checkState(i3 == -1, "concurrency level was already set to %s", i3);
        Preconditions.checkArgument(i2 > 0);
        this.c = i2;
        return this;
    }

    public q1.q d() {
        return (q1.q) MoreObjects.firstNonNull(this.d, q1.q.STRONG);
    }

    public q1.q e() {
        return (q1.q) MoreObjects.firstNonNull(this.e, q1.q.STRONG);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker f(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.a = true;
        return this;
    }

    public MapMaker g(q1.q qVar) {
        q1.q qVar2 = this.d;
        Preconditions.checkState(qVar2 == null, "Key strength was already set to %s", qVar2);
        this.d = (q1.q) Preconditions.checkNotNull(qVar);
        if (qVar != q1.q.STRONG) {
            this.a = true;
        }
        return this;
    }

    public MapMaker h(q1.q qVar) {
        q1.q qVar2 = this.e;
        Preconditions.checkState(qVar2 == null, "Value strength was already set to %s", qVar2);
        this.e = (q1.q) Preconditions.checkNotNull(qVar);
        if (qVar != q1.q.STRONG) {
            this.a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i2) {
        int i3 = this.b;
        Preconditions.checkState(i3 == -1, "initial capacity was already set to %s", i3);
        Preconditions.checkArgument(i2 >= 0);
        this.b = i2;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.a ? new ConcurrentHashMap(b(), 0.75f, a()) : q1.e(this);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i2 = this.b;
        if (i2 != -1) {
            stringHelper.add("initialCapacity", i2);
        }
        int i3 = this.c;
        if (i3 != -1) {
            stringHelper.add("concurrencyLevel", i3);
        }
        q1.q qVar = this.d;
        if (qVar != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(qVar.toString()));
        }
        q1.q qVar2 = this.e;
        if (qVar2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(qVar2.toString()));
        }
        if (this.f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
        return g(q1.q.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
        return h(q1.q.WEAK);
    }
}
