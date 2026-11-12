package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
abstract class w<E> extends AbstractSet<E> {
    private final Map<E, ?> a;
    private final Object b;

    public class a extends AbstractIterator<E> {
        public final /* synthetic */ Iterator c;

        public a(Iterator it2) {
            this.c = it2;
        }

        @Override // com.google.common.collect.AbstractIterator
        public E computeNext() {
            while (this.c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.c.next();
                if (w.this.b.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return endOfData();
        }
    }

    public w(Map<E, ?> map, Object obj) {
        this.a = (Map) Preconditions.checkNotNull(map);
        this.b = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<E> iterator() {
        return new a(this.a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return this.b.equals(this.a.get(obj));
    }
}
