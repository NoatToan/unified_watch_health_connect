package com.google.common.collect;

import defpackage.c6i;
import defpackage.spo;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public class o0<R, C, V> extends p0<R, C, V> implements q0 {
    private static final long serialVersionUID = 0;

    public class b extends p0<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        public b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return o0.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) o0.this.sortedBackingMap().firstKey();
        }

        @Override // com.google.common.collect.s.r
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> j() {
            return new s.o(this);
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r2) {
            c6i.o(r2);
            return new o0(o0.this.sortedBackingMap().headMap(r2), o0.this.factory).rowMap();
        }

        @Override // com.google.common.collect.s.r, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> l() {
            return (SortedSet) super.l();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) o0.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r2, R r3) {
            c6i.o(r2);
            c6i.o(r3);
            return new o0(o0.this.sortedBackingMap().subMap(r2, r3), o0.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r2) {
            c6i.o(r2);
            return new o0(o0.this.sortedBackingMap().tailMap(r2), o0.this.factory).rowMap();
        }
    }

    public o0(SortedMap<R, Map<C, V>> sortedMap, spo<? extends Map<C, V>> spoVar) {
        super(sortedMap, spoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.p0
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new b();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
