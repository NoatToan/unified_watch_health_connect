package f4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf4/m;", "K", "V", "Lf4/o;", "", "Lf4/u;", "map", "<init>", "(Lf4/u;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<K, V> extends o<K, V, Map.Entry<K, V>> {
    public m(u<K, V> uVar) {
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
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof f23.a) && !(obj instanceof f23.d.a)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return p005kotlin.jvm.internal.s.g(this.f68801a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        u<K, V> uVar = this.f68801a;
        return new c0(uVar, ((u3.b) uVar.b().f68811c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof f23.a) || (obj instanceof f23.d.a)) && this.f68801a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z14 = false;
            while (it.hasNext()) {
                if (this.f68801a.remove(((Map.Entry) it.next()).getKey()) != null || z14) {
                    z14 = true;
                }
            }
            return z14;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        u3.d<K, ? extends V> dVar;
        int i14;
        f fVarI;
        boolean zA;
        Collection<?> collection2 = collection;
        int iA = t0.a(p13.y.r(collection2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o13.p pVar = new o13.p(entry.getKey(), entry.getValue());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
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
            Object it3 = uVar.f68808b.iterator();
            while (((d0) it3).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((c0) it3).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !p005kotlin.jvm.internal.s.g(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder.remove(entry2.getKey());
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
