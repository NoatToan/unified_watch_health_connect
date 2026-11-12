package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
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
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public class LinkedListMultimap<K, V> extends com.google.common.collect.g<K, V> implements ListMultimap<K, V>, Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @NullableDecl
    private transient g<K, V> f;

    @NullableDecl
    private transient g<K, V> g;
    private transient Map<K, f<K, V>> h;
    private transient int i;
    private transient int j;

    public class a extends AbstractSequentialList<V> {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            return new i(this.a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) LinkedListMultimap.this.h.get(this.a);
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
            return LinkedListMultimap.this.i;
        }
    }

    public class c extends Sets.k<K> {
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
            return LinkedListMultimap.this.h.size();
        }
    }

    public class d extends AbstractSequentialList<V> {

        public class a extends y2<Map.Entry<K, V>, V> {
            public final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ListIterator listIterator, h hVar) {
                super(listIterator);
                this.b = hVar;
            }

            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // com.google.common.collect.y2, java.util.ListIterator
            public void set(V v) {
                this.b.f(v);
            }
        }

        public d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            h hVar = new h(i);
            return new a(hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.i;
        }
    }

    public static class f<K, V> {
        public g<K, V> a;
        public g<K, V> b;
        public int c;

        public f(g<K, V> gVar) {
            this.a = gVar;
            this.b = gVar;
            gVar.f = null;
            gVar.e = null;
            this.c = 1;
        }
    }

    public static final class g<K, V> extends com.google.common.collect.f<K, V> {

        @NullableDecl
        public final K a;

        @NullableDecl
        public V b;

        @NullableDecl
        public g<K, V> c;

        @NullableDecl
        public g<K, V> d;

        @NullableDecl
        public g<K, V> e;

        @NullableDecl
        public g<K, V> f;

        public g(@NullableDecl K k, @NullableDecl V v) {
            this.a = k;
            this.b = v;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V setValue(@NullableDecl V v) {
            V v2 = this.b;
            this.b = v;
            return v2;
        }
    }

    public class h implements ListIterator<Map.Entry<K, V>> {
        public int a;

        @NullableDecl
        public g<K, V> b;

        @NullableDecl
        public g<K, V> c;

        @NullableDecl
        public g<K, V> d;
        public int e;

        public h(int i) {
            this.e = LinkedListMultimap.this.j;
            int size = LinkedListMultimap.this.size();
            Preconditions.checkPositionIndex(i, size);
            if (i < size / 2) {
                this.b = LinkedListMultimap.this.f;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.d = LinkedListMultimap.this.g;
                this.a = size;
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

        private void b() {
            if (LinkedListMultimap.this.j != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            b();
            LinkedListMultimap.v(this.b);
            g<K, V> gVar = this.b;
            this.c = gVar;
            this.d = gVar;
            this.b = gVar.c;
            this.a++;
            return gVar;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            b();
            LinkedListMultimap.v(this.d);
            g<K, V> gVar = this.d;
            this.c = gVar;
            this.b = gVar;
            this.d = gVar.d;
            this.a--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void f(V v) {
            Preconditions.checkState(this.c != null);
            this.c.b = v;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            u.e(this.c != null);
            g<K, V> gVar = this.c;
            if (gVar != this.b) {
                this.d = gVar.d;
                this.a--;
            } else {
                this.b = gVar.c;
            }
            LinkedListMultimap.this.A(gVar);
            this.c = null;
            this.e = LinkedListMultimap.this.j;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.d;
        if (gVar2 != null) {
            gVar2.c = gVar.c;
        } else {
            this.f = gVar.c;
        }
        g<K, V> gVar3 = gVar.c;
        if (gVar3 != null) {
            gVar3.d = gVar2;
        } else {
            this.g = gVar2;
        }
        if (gVar.f == null && gVar.e == null) {
            this.h.remove(gVar.a).c = 0;
            this.j++;
        } else {
            f<K, V> fVar = this.h.get(gVar.a);
            fVar.c--;
            g<K, V> gVar4 = gVar.f;
            if (gVar4 == null) {
                fVar.a = gVar.e;
            } else {
                gVar4.e = gVar.e;
            }
            g<K, V> gVar5 = gVar.e;
            if (gVar5 == null) {
                fVar.b = gVar4;
            } else {
                gVar5.f = gVar4;
            }
        }
        this.i--;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.h = x.I();
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public g<K, V> u(@NullableDecl K k, @NullableDecl V v, @NullableDecl g<K, V> gVar) {
        g<K, V> gVar2 = new g<>(k, v);
        if (this.f == null) {
            this.g = gVar2;
            this.f = gVar2;
            this.h.put(k, new f<>(gVar2));
            this.j++;
        } else if (gVar == null) {
            g<K, V> gVar3 = this.g;
            gVar3.c = gVar2;
            gVar2.d = gVar3;
            this.g = gVar2;
            f<K, V> fVar = this.h.get(k);
            if (fVar == null) {
                this.h.put(k, new f<>(gVar2));
                this.j++;
            } else {
                fVar.c++;
                g<K, V> gVar4 = fVar.b;
                gVar4.e = gVar2;
                gVar2.f = gVar4;
                fVar.b = gVar2;
            }
        } else {
            this.h.get(k).c++;
            gVar2.d = gVar.d;
            gVar2.f = gVar.f;
            gVar2.c = gVar;
            gVar2.e = gVar;
            g<K, V> gVar5 = gVar.f;
            if (gVar5 == null) {
                this.h.get(k).a = gVar2;
            } else {
                gVar5.e = gVar2;
            }
            g<K, V> gVar6 = gVar.d;
            if (gVar6 == null) {
                this.f = gVar2;
            } else {
                gVar6.c = gVar2;
            }
            gVar.d = gVar2;
            gVar.f = gVar2;
        }
        this.i++;
        return gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(@NullableDecl Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private List<V> y(@NullableDecl Object obj) {
        return Collections.unmodifiableList(Lists.newArrayList(new i(obj)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(@NullableDecl Object obj) {
        Iterators.c(new i(obj));
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.g
    public Map<K, Collection<V>> b() {
        return new Multimaps.a(this);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.f = null;
        this.g = null;
        this.h.clear();
        this.i = 0;
        this.j++;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.g
    public Set<K> f() {
        return new c();
    }

    @Override // com.google.common.collect.g
    public Multiset<K> g() {
        return new Multimaps.g(this);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.g
    public Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.f == null;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        u(k, v, null);
        return true;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.i;
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> e() {
        return new b();
    }

    @Override // com.google.common.collect.g
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<V> h() {
        return new d();
    }

    private LinkedListMultimap(int i2) {
        this.h = w1.c(i2);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i2) {
        return new LinkedListMultimap<>(i2);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@NullableDecl K k) {
        return new a(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        List<V> listY = y(obj);
        z(obj);
        return listY;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        List<V> listY = y(k);
        i iVar = new i(k);
        Iterator<? extends V> it2 = iterable.iterator();
        while (iVar.hasNext() && it2.hasNext()) {
            iVar.next();
            iVar.set(it2.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it2.hasNext()) {
            iVar.add(it2.next());
        }
        return listY;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    public class e implements Iterator<K> {
        public final Set<K> a;
        public g<K, V> b;

        @NullableDecl
        public g<K, V> c;
        public int d;

        private e() {
            this.a = Sets.newHashSetWithExpectedSize(LinkedListMultimap.this.keySet().size());
            this.b = LinkedListMultimap.this.f;
            this.d = LinkedListMultimap.this.j;
        }

        private void a() {
            if (LinkedListMultimap.this.j != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.b != null;
        }

        @Override // java.util.Iterator
        public K next() {
            g<K, V> gVar;
            a();
            LinkedListMultimap.v(this.b);
            g<K, V> gVar2 = this.b;
            this.c = gVar2;
            this.a.add(gVar2.a);
            do {
                gVar = this.b.c;
                this.b = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.a.add(gVar.a));
            return this.c.a;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            u.e(this.c != null);
            LinkedListMultimap.this.z(this.c.a);
            this.c = null;
            this.d = LinkedListMultimap.this.j;
        }

        public /* synthetic */ e(LinkedListMultimap linkedListMultimap, a aVar) {
            this();
        }
    }

    public class i implements ListIterator<V> {

        @NullableDecl
        public final Object a;
        public int b;

        @NullableDecl
        public g<K, V> c;

        @NullableDecl
        public g<K, V> d;

        @NullableDecl
        public g<K, V> e;

        public i(Object obj) {
            this.a = obj;
            f fVar = (f) LinkedListMultimap.this.h.get(obj);
            this.c = fVar == null ? null : fVar.a;
        }

        @Override // java.util.ListIterator
        public void add(V v) {
            this.e = LinkedListMultimap.this.u(this.a, v, this.c);
            this.b++;
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
        @CanIgnoreReturnValue
        public V next() {
            LinkedListMultimap.v(this.c);
            g<K, V> gVar = this.c;
            this.d = gVar;
            this.e = gVar;
            this.c = gVar.e;
            this.b++;
            return gVar.b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public V previous() {
            LinkedListMultimap.v(this.e);
            g<K, V> gVar = this.e;
            this.d = gVar;
            this.c = gVar;
            this.e = gVar.f;
            this.b--;
            return gVar.b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            u.e(this.d != null);
            g<K, V> gVar = this.d;
            if (gVar != this.c) {
                this.e = gVar.f;
                this.b--;
            } else {
                this.c = gVar.e;
            }
            LinkedListMultimap.this.A(gVar);
            this.d = null;
        }

        @Override // java.util.ListIterator
        public void set(V v) {
            Preconditions.checkState(this.d != null);
            this.d.b = v;
        }

        public i(Object obj, int i) {
            f fVar = (f) LinkedListMultimap.this.h.get(obj);
            int i2 = fVar == null ? 0 : fVar.c;
            Preconditions.checkPositionIndex(i, i2);
            if (i >= i2 / 2) {
                this.e = fVar == null ? null : fVar.b;
                this.b = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.c = fVar == null ? null : fVar.a;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.a = obj;
            this.d = null;
        }
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}
