package com.google.common.collect;

import defpackage.a94;
import defpackage.c6i;
import defpackage.d0i;
import defpackage.epd;
import defpackage.f10;
import defpackage.nag;
import defpackage.qyp;
import defpackage.wge;
import defpackage.xhe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class LinkedListMultimap<K, V> extends com.google.common.collect.d<K, V> implements wge<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient g<K, V> head;
    private transient Map<K, f<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient g<K, V> tail;

    public class a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f9092a;

        public a(Object obj) {
            this.f9092a = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            return new i(this.f9092a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) LinkedListMultimap.this.keyToKeyList.get(this.f9092a);
            if (fVar == null) {
                return 0;
            }
            return fVar.c;
        }
    }

    public class b extends AbstractSequentialList<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new h(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    public class c extends i0.b<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return !LinkedListMultimap.this.removeAll(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }
    }

    public class d extends AbstractSequentialList<V> {

        public class a extends qyp<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9097b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, ListIterator listIterator, h hVar) {
                super(listIterator);
                this.f9097b = hVar;
            }

            @Override // defpackage.pyp
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // defpackage.qyp, java.util.ListIterator
            public void set(V v) {
                this.f9097b.f(v);
            }
        }

        public d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            h hVar = new h(i);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    public static class f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f9100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f9101b;
        public int c;

        public f(g<K, V> gVar) {
            this.f9100a = gVar;
            this.f9101b = gVar;
            gVar.f = null;
            gVar.e = null;
            this.c = 1;
        }
    }

    public static final class g<K, V> extends f10<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f9103b;
        public g<K, V> c;
        public g<K, V> d;
        public g<K, V> e;
        public g<K, V> f;

        public g(K k2, V v) {
            this.f9102a = k2;
            this.f9103b = v;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return this.f9102a;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getValue() {
            return this.f9103b;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f9103b;
            this.f9103b = v;
            return v2;
        }
    }

    public class h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f9105b;
        public g<K, V> c;
        public g<K, V> d;
        public int e;

        public h(int i) {
            this.e = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            c6i.q(i, size);
            if (i < size / 2) {
                this.f9105b = LinkedListMultimap.this.head;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.d = LinkedListMultimap.this.tail;
                this.f9104a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.c = null;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public final void b() {
            if (LinkedListMultimap.this.modCount != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            b();
            g<K, V> gVar = this.f9105b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.c = gVar;
            this.d = gVar;
            this.f9105b = gVar.c;
            this.f9104a++;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            b();
            g<K, V> gVar = this.d;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.c = gVar;
            this.f9105b = gVar;
            this.d = gVar.d;
            this.f9104a--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void f(V v) {
            c6i.t(this.c != null);
            this.c.f9103b = v;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f9105b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9104a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9104a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            c6i.u(this.c != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.c;
            if (gVar != this.f9105b) {
                this.d = gVar.d;
                this.f9104a--;
            } else {
                this.f9105b = gVar.c;
            }
            LinkedListMultimap.this.removeNode(gVar);
            this.c = null;
            this.e = LinkedListMultimap.this.modCount;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g<K, V> addNode(K k2, V v, g<K, V> gVar) {
        g<K, V> gVar2 = new g<>(k2, v);
        if (this.head == null) {
            this.tail = gVar2;
            this.head = gVar2;
            this.keyToKeyList.put(k2, new f<>(gVar2));
            this.modCount++;
        } else if (gVar == null) {
            g<K, V> gVar3 = this.tail;
            Objects.requireNonNull(gVar3);
            gVar3.c = gVar2;
            gVar2.d = this.tail;
            this.tail = gVar2;
            f<K, V> fVar = this.keyToKeyList.get(k2);
            if (fVar == null) {
                this.keyToKeyList.put(k2, new f<>(gVar2));
                this.modCount++;
            } else {
                fVar.c++;
                g<K, V> gVar4 = fVar.f9101b;
                gVar4.e = gVar2;
                gVar2.f = gVar4;
                fVar.f9101b = gVar2;
            }
        } else {
            f<K, V> fVar2 = this.keyToKeyList.get(k2);
            Objects.requireNonNull(fVar2);
            fVar2.c++;
            gVar2.d = gVar.d;
            gVar2.f = gVar.f;
            gVar2.c = gVar;
            gVar2.e = gVar;
            g<K, V> gVar5 = gVar.f;
            if (gVar5 == null) {
                fVar2.f9100a = gVar2;
            } else {
                gVar5.e = gVar2;
            }
            g<K, V> gVar6 = gVar.d;
            if (gVar6 == null) {
                this.head = gVar2;
            } else {
                gVar6.c = gVar2;
            }
            gVar.d = gVar2;
            gVar.f = gVar2;
        }
        this.size++;
        return gVar2;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(K k2) {
        return Collections.unmodifiableList(xhe.i(new i(k2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = a94.g0();
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(K k2) {
        epd.d(new i(k2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.d;
        if (gVar2 != null) {
            gVar2.c = gVar.c;
        } else {
            this.head = gVar.c;
        }
        g<K, V> gVar3 = gVar.c;
        if (gVar3 != null) {
            gVar3.d = gVar2;
        } else {
            this.tail = gVar2;
        }
        if (gVar.f == null && gVar.e == null) {
            f<K, V> fVarRemove = this.keyToKeyList.remove(gVar.f9102a);
            Objects.requireNonNull(fVarRemove);
            fVarRemove.c = 0;
            this.modCount++;
        } else {
            f<K, V> fVar = this.keyToKeyList.get(gVar.f9102a);
            Objects.requireNonNull(fVar);
            fVar.c--;
            g<K, V> gVar4 = gVar.f;
            if (gVar4 == null) {
                g<K, V> gVar5 = gVar.e;
                Objects.requireNonNull(gVar5);
                fVar.f9100a = gVar5;
            } else {
                gVar4.e = gVar.e;
            }
            g<K, V> gVar6 = gVar.e;
            if (gVar6 == null) {
                g<K, V> gVar7 = gVar.f;
                Objects.requireNonNull(gVar7);
                fVar.f9101b = gVar7;
            } else {
                gVar6.f = gVar.f;
            }
        }
        this.size--;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // defpackage.nag
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // defpackage.nag
    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.d
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.d
    public Map<K, Collection<V>> createAsMap() {
        return new t.a(this);
    }

    @Override // com.google.common.collect.d
    public Set<K> createKeySet() {
        return new c();
    }

    @Override // com.google.common.collect.d
    public u<K> createKeys() {
        return new t.d(this);
    }

    @Override // com.google.common.collect.d
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ u keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public boolean put(K k2, V v) {
        addNode(k2, v, null);
        return true;
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(nag nagVar) {
        return super.putAll(nagVar);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // defpackage.nag
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private LinkedListMultimap(int i2) {
        this.keyToKeyList = d0i.c(i2);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i2) {
        return new LinkedListMultimap<>(i2);
    }

    @Override // com.google.common.collect.d
    public List<Map.Entry<K, V>> createEntries() {
        return new b();
    }

    @Override // com.google.common.collect.d
    public List<V> createValues() {
        return new d();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // defpackage.nag
    public List<V> get(K k2) {
        return new a(k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nag
    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.d
    public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k2);
        i iVar = new i(k2);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return copy;
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(nag<? extends K, ? extends V> nagVar) {
        return new LinkedListMultimap<>(nagVar);
    }

    public class e implements Iterator<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<K> f9098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f9099b;
        public g<K, V> c;
        public int d;

        public e() {
            this.f9098a = i0.e(LinkedListMultimap.this.keySet().size());
            this.f9099b = LinkedListMultimap.this.head;
            this.d = LinkedListMultimap.this.modCount;
        }

        public final void a() {
            if (LinkedListMultimap.this.modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f9099b != null;
        }

        @Override // java.util.Iterator
        public K next() {
            g<K, V> gVar;
            a();
            g<K, V> gVar2 = this.f9099b;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            this.c = gVar2;
            this.f9098a.add(gVar2.f9102a);
            do {
                gVar = this.f9099b.c;
                this.f9099b = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.f9098a.add(gVar.f9102a));
            return this.c.f9102a;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            c6i.u(this.c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.c.f9102a);
            this.c = null;
            this.d = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ e(LinkedListMultimap linkedListMultimap, a aVar) {
            this();
        }
    }

    public class i implements ListIterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9107b;
        public g<K, V> c;
        public g<K, V> d;
        public g<K, V> e;

        public i(K k2) {
            this.f9106a = k2;
            f fVar = (f) LinkedListMultimap.this.keyToKeyList.get(k2);
            this.c = fVar == null ? null : fVar.f9100a;
        }

        @Override // java.util.ListIterator
        public void add(V v) {
            this.e = LinkedListMultimap.this.addNode(this.f9106a, v, this.c);
            this.f9107b++;
            this.d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public V next() {
            g<K, V> gVar = this.c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.d = gVar;
            this.e = gVar;
            this.c = gVar.e;
            this.f9107b++;
            return gVar.f9103b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9107b;
        }

        @Override // java.util.ListIterator
        public V previous() {
            g<K, V> gVar = this.e;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.d = gVar;
            this.c = gVar;
            this.e = gVar.f;
            this.f9107b--;
            return gVar.f9103b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9107b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c6i.u(this.d != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.d;
            if (gVar != this.c) {
                this.e = gVar.f;
                this.f9107b--;
            } else {
                this.c = gVar.e;
            }
            LinkedListMultimap.this.removeNode(gVar);
            this.d = null;
        }

        @Override // java.util.ListIterator
        public void set(V v) {
            c6i.t(this.d != null);
            this.d.f9103b = v;
        }

        public i(K k2, int i) {
            f fVar = (f) LinkedListMultimap.this.keyToKeyList.get(k2);
            int i2 = fVar == null ? 0 : fVar.c;
            c6i.q(i, i2);
            if (i >= i2 / 2) {
                this.e = fVar == null ? null : fVar.f9101b;
                this.f9107b = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.c = fVar == null ? null : fVar.f9100a;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.f9106a = k2;
            this.d = null;
        }
    }

    private LinkedListMultimap(nag<? extends K, ? extends V> nagVar) {
        this(nagVar.keySet().size());
        putAll(nagVar);
    }
}
