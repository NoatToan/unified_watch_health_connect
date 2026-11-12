package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class t2<R, C, V> extends u2<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public class b extends u2<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        private b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return t2.this.r().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) t2.this.r().firstKey();
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> h() {
            return new Maps.f0(this);
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            Preconditions.checkNotNull(r);
            return new t2(t2.this.r().headMap(r), t2.this.d).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) t2.this.r().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            Preconditions.checkNotNull(r);
            Preconditions.checkNotNull(r2);
            return new t2(t2.this.r().subMap(r, r2), t2.this.d).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            Preconditions.checkNotNull(r);
            return new t2(t2.this.r().tailMap(r), t2.this.d).rowMap();
        }
    }

    public t2(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> r() {
        return (SortedMap) this.c;
    }

    @Override // com.google.common.collect.u2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> k() {
        return new b();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
