package com.iabtcf.utils;

import defpackage.yse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes20.dex */
public abstract class IntIterable implements Iterable<Integer> {
    public abstract boolean contains(int i);

    public abstract IntIterator intIterator();

    public Set<Integer> toSet() {
        HashSet hashSet = new HashSet();
        IntIterator intIterator = intIterator();
        while (intIterator.hasNext()) {
            hashSet.add(intIterator.next());
        }
        return hashSet;
    }

    public IntStream toStream() {
        return StreamSupport.intStream(Spliterators.spliteratorUnknownSize((PrimitiveIterator.OfInt) intIterator(), 1296), false);
    }

    public boolean isEmpty() {
        return !intIterator().hasNext();
    }

    public boolean containsAll(int... iArr) {
        return Arrays.stream(iArr).allMatch(new yse(this));
    }

    public boolean containsAny(int... iArr) {
        return Arrays.stream(iArr).anyMatch(new yse(this));
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() { // from class: com.iabtcf.utils.IntIterable.4
            final IntIterator d;

            {
                this.d = IntIterable.this.intIterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Integer next() {
                return this.d.next();
            }
        };
    }
}
