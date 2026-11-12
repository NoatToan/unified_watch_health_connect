package defpackage;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hl4<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20200a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public final Map<E, Integer> f20201b = new HashMap();

    @GuardedBy("lock")
    public Set<E> c = Collections.emptySet();

    @GuardedBy("lock")
    public List<E> d = Collections.emptyList();

    public int count(E e) {
        int iIntValue;
        synchronized (this.f20200a) {
            try {
                iIntValue = this.f20201b.containsKey(e) ? this.f20201b.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void e(E e) {
        synchronized (this.f20200a) {
            try {
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.add(e);
                this.d = Collections.unmodifiableList(arrayList);
                Integer num = this.f20201b.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.add(e);
                    this.c = Collections.unmodifiableSet(hashSet);
                }
                this.f20201b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f20200a) {
            set = this.c;
        }
        return set;
    }

    public void f(E e) {
        synchronized (this.f20200a) {
            try {
                Integer num = this.f20201b.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(e);
                this.d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f20201b.remove(e);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(e);
                    this.c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f20201b.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f20200a) {
            it = this.d.iterator();
        }
        return it;
    }
}
