package f4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf4/p;", "K", "V", "Lf4/o;", "Lf4/u;", "map", "<init>", "(Lf4/u;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p<K, V> extends o<K, V, V> {
    public p(u<K, V> uVar) {
        super(uVar);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        t.g();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        t.g();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f68801a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f68801a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        u<K, V> uVar = this.f68801a;
        return new f0(uVar, ((u3.b) uVar.b().f68811c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        u<K, V> uVar = this.f68801a;
        Object it = uVar.f68808b.iterator();
        do {
            if (!((d0) it).hasNext()) {
                next = null;
                break;
            }
            next = ((c0) it).next();
        } while (!p005kotlin.jvm.internal.s.g(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        uVar.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        u3.d<K, ? extends V> dVar;
        int i14;
        f fVarI;
        boolean zA;
        Set setG1 = p13.h0.g1(collection);
        u<K, V> uVar = this.f68801a;
        boolean z14 = false;
        do {
            synchronized (t.f68806b) {
                u.a aVar = uVar.f68807a;
                aVar.getClass();
                u.a aVar2 = (u.a) l.g(aVar);
                dVar = aVar2.f68811c;
                i14 = aVar2.f68812d;
                Unit unit = Unit.INSTANCE;
            }
            dVar.getClass();
            u3.d.a<K, ? extends V> aVarBuilder = dVar.builder();
            Object it = uVar.f68808b.iterator();
            while (((d0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (setG1.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
                    z14 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            u3.d<K, ? extends V> dVarE = aVarBuilder.e();
            if (p005kotlin.jvm.internal.s.g(dVarE, dVar)) {
                break;
            }
            u.a aVar3 = uVar.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = u.a(uVar, (u.a) l.v(aVar3, uVar, fVarI), i14, dVarE);
            }
            l.m(fVarI, uVar);
        } while (!zA);
        return z14;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        u3.d<K, ? extends V> dVar;
        int i14;
        f fVarI;
        boolean zA;
        Set setG1 = p13.h0.g1(collection);
        u<K, V> uVar = this.f68801a;
        boolean z14 = false;
        do {
            synchronized (t.f68806b) {
                u.a aVar = uVar.f68807a;
                aVar.getClass();
                u.a aVar2 = (u.a) l.g(aVar);
                dVar = aVar2.f68811c;
                i14 = aVar2.f68812d;
                Unit unit = Unit.INSTANCE;
            }
            dVar.getClass();
            u3.d.a<K, ? extends V> aVarBuilder = dVar.builder();
            Object it = uVar.f68808b.iterator();
            while (((d0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (!setG1.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
                    z14 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            u3.d<K, ? extends V> dVarE = aVarBuilder.e();
            if (p005kotlin.jvm.internal.s.g(dVarE, dVar)) {
                break;
            }
            u.a aVar3 = uVar.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = u.a(uVar, (u.a) l.v(aVar3, uVar, fVarI), i14, dVarE);
            }
            l.m(fVarI, uVar);
        } while (!zA);
        return z14;
    }
}
