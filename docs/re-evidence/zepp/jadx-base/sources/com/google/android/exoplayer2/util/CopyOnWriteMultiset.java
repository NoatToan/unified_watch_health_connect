package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object a = new Object();

    @GuardedBy("lock")
    private final Map<E, Integer> b = new HashMap();

    @GuardedBy("lock")
    private Set<E> c = Collections.emptySet();

    @GuardedBy("lock")
    private List<E> d = Collections.emptyList();

    public void add(E element) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.add(element);
            this.d = Collections.unmodifiableList(arrayList);
            Integer num = this.b.get(element);
            if (num == null) {
                HashSet hashSet = new HashSet(this.c);
                hashSet.add(element);
                this.c = Collections.unmodifiableSet(hashSet);
            }
            this.b.put(element, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int count(E element) {
        int iIntValue;
        synchronized (this.a) {
            iIntValue = this.b.containsKey(element) ? this.b.get(element).intValue() : 0;
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.a) {
            set = this.c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it2;
        synchronized (this.a) {
            it2 = this.d.iterator();
        }
        return it2;
    }

    public void remove(E element) {
        synchronized (this.a) {
            Integer num = this.b.get(element);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(element);
            this.d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.b.remove(element);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(element);
                this.c = Collections.unmodifiableSet(hashSet);
            } else {
                this.b.put(element, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
