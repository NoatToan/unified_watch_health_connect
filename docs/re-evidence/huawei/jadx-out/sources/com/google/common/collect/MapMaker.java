package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    Equivalence<Object> f4419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    MapMakerInternalMap.Strength f4420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f4421c;

    @CheckForNull
    MapMakerInternalMap.Strength j;
    int e = -1;
    int d = -1;

    enum Dummy {
        VALUE
    }

    MapMaker c(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f4419a;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f4419a = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.f4421c = true;
        return this;
    }

    Equivalence<Object> a() {
        return (Equivalence) MoreObjects.firstNonNull(this.f4419a, d().defaultEquivalence());
    }

    public MapMaker b(int i) {
        int i2 = this.e;
        Preconditions.checkState(i2 == -1, "initial capacity was already set to %s", i2);
        Preconditions.checkArgument(i >= 0);
        this.e = i;
        return this;
    }

    int c() {
        int i = this.e;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public MapMaker c(int i) {
        int i2 = this.d;
        Preconditions.checkState(i2 == -1, "concurrency level was already set to %s", i2);
        Preconditions.checkArgument(i > 0);
        this.d = i;
        return this;
    }

    int b() {
        int i = this.d;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public MapMaker f() {
        return c(MapMakerInternalMap.Strength.WEAK);
    }

    MapMaker c(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f4420b;
        Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.f4420b = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f4421c = true;
        }
        return this;
    }

    MapMakerInternalMap.Strength d() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f4420b, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMaker i() {
        return d(MapMakerInternalMap.Strength.WEAK);
    }

    MapMaker d(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.j;
        Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.j = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f4421c = true;
        }
        return this;
    }

    MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.j, MapMakerInternalMap.Strength.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> g() {
        if (!this.f4421c) {
            return new ConcurrentHashMap(c(), 0.75f, b());
        }
        return MapMakerInternalMap.c(this);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.e;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.d;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f4420b;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.j;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f4419a != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }
}
