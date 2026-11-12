package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();
    private final Map<E, Integer> elementCounts = new HashMap();
    private Set<E> elementSet = Collections.EMPTY_SET;
    private List<E> elements = Collections.EMPTY_LIST;

    public void add(E e4) {
        synchronized (this.lock) {
            try {
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.add(e4);
                this.elements = Collections.unmodifiableList(arrayList);
                Integer num = this.elementCounts.get(e4);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.add(e4);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                }
                this.elementCounts.put(e4, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public int count(E e4) {
        int iIntValue;
        synchronized (this.lock) {
            try {
                iIntValue = this.elementCounts.containsKey(e4) ? this.elementCounts.get(e4).intValue() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e4) {
        synchronized (this.lock) {
            try {
                Integer num = this.elementCounts.get(e4);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.remove(e4);
                this.elements = Collections.unmodifiableList(arrayList);
                int iIntValue = num.intValue();
                Map<E, Integer> map = this.elementCounts;
                if (iIntValue == 1) {
                    map.remove(e4);
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.remove(e4);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                } else {
                    map.put(e4, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
