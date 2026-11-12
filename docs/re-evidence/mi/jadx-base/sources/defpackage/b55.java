package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class b55 implements List<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f3808b;
    public final List<String> c;

    public b55(long j, Map<String, Integer> map, List<String> list) {
        qk1.u(list, "fields must be not null!", new Object[0]);
        this.f3807a = j;
        this.f3808b = map;
        this.c = list;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends String> collection) {
        return this.c.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.c.containsAll(collection);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.c.add(i, str);
    }

    public Map<String, String> f() {
        if (this.f3808b == null) {
            throw new IllegalStateException("No header available");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f3808b.size(), 1.0f);
        Iterator<Map.Entry<String, Integer>> it = this.f3808b.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            Integer num = this.f3808b.get(key);
            linkedHashMap.put(key, num == null ? null : get(num.intValue()));
        }
        return linkedHashMap;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        return this.c.remove(i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return this.c.set(i, str);
    }

    public <T> T i(Class<T> cls) {
        return (T) rh2.D(f(), cls);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.c.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<String> listIterator() {
        return this.c.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.c.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.c.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.c.size();
    }

    @Override // java.util.List
    public List<String> subList(int i, int i2) {
        return this.c.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.c.toArray();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CsvRow{");
        sb.append("originalLineNumber=");
        sb.append(this.f3807a);
        sb.append(", ");
        sb.append("fields=");
        if (this.f3808b != null) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            Iterator<Map.Entry<String, String>> it = f().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append('=');
                if (next.getValue() != null) {
                    sb.append(next.getValue());
                }
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
        } else {
            sb.append(this.c.toString());
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        return this.c.addAll(i, collection);
    }

    @Override // java.util.List
    public String get(int i) {
        if (i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    @Override // java.util.List
    public ListIterator<String> listIterator(int i) {
        return this.c.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.c.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.c.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(String str) {
        return this.c.add(str);
    }
}
