package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class v2 {

    public static class b<K, V> extends k<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, Collection<V>>> f;

        @MonotonicNonNullDecl
        public transient Collection<Collection<V>> g;

        public b(Map<K, Collection<V>> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = new c(f().entrySet(), this.b);
                }
                set = this.f;
            }
            return set;
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.b) {
                if (this.g == null) {
                    this.g = new d(f().values(), this.b);
                }
                collection = this.g;
            }
            return collection;
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collectionA;
            synchronized (this.b) {
                Collection collection = (Collection) super.get(obj);
                collectionA = collection == null ? null : v2.A(collection, this.b);
            }
            return collectionA;
        }
    }

    public static class d<V> extends f<Collection<V>> {
        private static final long serialVersionUID = 0;

        public class a extends x2<Collection<V>, Collection<V>> {
            public a(Iterator it2) {
                super(it2);
            }

            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> a(Collection<V> collection) {
                return v2.A(collection, d.this.b);
            }
        }

        public d(Collection<Collection<V>> collection, @NullableDecl Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    @VisibleForTesting
    public static class e<K, V> extends k<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        private transient Set<V> f;

        @RetainedWith
        @MonotonicNonNullDecl
        private transient BiMap<V, K> g;

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k, V v) {
            V vForcePut;
            synchronized (this.b) {
                vForcePut = e().forcePut(k, v);
            }
            return vForcePut;
        }

        @Override // com.google.common.collect.v2.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BiMap<K, V> f() {
            return (BiMap) super.f();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap;
            synchronized (this.b) {
                if (this.g == null) {
                    this.g = new e(e().inverse(), this.b, this);
                }
                biMap = this.g;
            }
            return biMap;
        }

        private e(BiMap<K, V> biMap, @NullableDecl Object obj, @NullableDecl BiMap<V, K> biMap2) {
            super(biMap, obj);
            this.g = biMap2;
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = v2.u(e().values(), this.b);
                }
                set = this.f;
            }
            return set;
        }
    }

    @VisibleForTesting
    public static class f<E> extends p implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean zAdd;
            synchronized (this.b) {
                zAdd = g().add(e);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.b) {
                zAddAll = g().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.b) {
                g().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.b) {
                zContains = g().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.b) {
                zContainsAll = g().containsAll(collection);
            }
            return zContainsAll;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v2.p
        /* JADX INFO: renamed from: f */
        public Collection<E> f() {
            return (Collection) super.f();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.b) {
                zIsEmpty = g().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return g().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.b) {
                zRemove = g().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.b) {
                zRemoveAll = g().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.b) {
                zRetainAll = g().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.b) {
                size = g().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.b) {
                array = g().toArray();
            }
            return array;
        }

        private f(Collection<E> collection, @NullableDecl Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.b) {
                tArr2 = (T[]) g().toArray(tArr);
            }
            return tArr2;
        }
    }

    public static final class g<E> extends q<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public g(Deque<E> deque, @NullableDecl Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
            synchronized (this.b) {
                f().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e) {
            synchronized (this.b) {
                f().addLast(e);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.b) {
                itDescendingIterator = f().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.b) {
                first = f().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.b) {
                last = f().getLast();
            }
            return last;
        }

        @Override // com.google.common.collect.v2.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> g() {
            return (Deque) super.g();
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
            boolean zOfferFirst;
            synchronized (this.b) {
                zOfferFirst = f().offerFirst(e);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
            boolean zOfferLast;
            synchronized (this.b) {
                zOfferLast = f().offerLast(e);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.b) {
                ePeekFirst = f().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        public E peekLast() {
            E ePeekLast;
            synchronized (this.b) {
                ePeekLast = f().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.b) {
                ePollFirst = f().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        public E pollLast() {
            E ePollLast;
            synchronized (this.b) {
                ePollLast = f().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.b) {
                ePop = f().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e) {
            synchronized (this.b) {
                f().push(e);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.b) {
                eRemoveFirst = f().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.b) {
                zRemoveFirstOccurrence = f().removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.b) {
                eRemoveLast = f().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.b) {
                zRemoveLastOccurrence = f().removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    @GwtIncompatible
    public static class h<K, V> extends p implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public h(Map.Entry<K, V> entry, @NullableDecl Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.v2.p
        public Map.Entry<K, V> f() {
            return (Map.Entry) super.f();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.b) {
                key = f().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.b) {
                value = f().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V value;
            synchronized (this.b) {
                value = f().setValue(v);
            }
            return value;
        }
    }

    public static class i<E> extends f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public i(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i, E e) {
            synchronized (this.b) {
                f().add(i, e);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.b) {
                zAddAll = f().addAll(i, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.v2.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public List<E> g() {
            return (List) super.g();
        }

        @Override // java.util.List
        public E get(int i) {
            E e;
            synchronized (this.b) {
                e = f().get(i);
            }
            return e;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.b) {
                iIndexOf = f().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.b) {
                iLastIndexOf = f().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return f().listIterator();
        }

        @Override // java.util.List
        public E remove(int i) {
            E eRemove;
            synchronized (this.b) {
                eRemove = f().remove(i);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int i, E e) {
            E e2;
            synchronized (this.b) {
                e2 = f().set(i, e);
            }
            return e2;
        }

        @Override // java.util.List
        public List<E> subList(int i, int i2) {
            List<E> listJ;
            synchronized (this.b) {
                listJ = v2.j(f().subList(i, i2), this.b);
            }
            return listJ;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i) {
            return f().listIterator(i);
        }
    }

    public static class j<K, V> extends l<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public j(ListMultimap<K, V> listMultimap, @NullableDecl Object obj) {
            super(listMultimap, obj);
        }

        @Override // com.google.common.collect.v2.l
        public ListMultimap<K, V> f() {
            return (ListMultimap) super.f();
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> get(K k) {
            List<V> listJ;
            synchronized (this.b) {
                listJ = v2.j(g().get((Object) k), this.b);
            }
            return listJ;
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> removeAll(Object obj) {
            List<V> listRemoveAll;
            synchronized (this.b) {
                listRemoveAll = g().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            List<V> listReplaceValues;
            synchronized (this.b) {
                listReplaceValues = g().replaceValues((Object) k, (Iterable) iterable);
            }
            return listReplaceValues;
        }
    }

    public static class k<K, V> extends p implements Map<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient Set<K> c;

        @MonotonicNonNullDecl
        public transient Collection<V> d;

        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> e;

        public k(Map<K, V> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.b) {
                f().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.b) {
                zContainsKey = f().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.b) {
                zContainsValue = f().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.b) {
                if (this.e == null) {
                    this.e = v2.u(f().entrySet(), this.b);
                }
                set = this.e;
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v2.p
        public Map<K, V> f() {
            return (Map) super.f();
        }

        public V get(Object obj) {
            V v;
            synchronized (this.b) {
                v = f().get(obj);
            }
            return v;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.b) {
                zIsEmpty = f().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = v2.u(f().keySet(), this.b);
                }
                set = this.c;
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            V vPut;
            synchronized (this.b) {
                vPut = f().put(k, v);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.b) {
                f().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V vRemove;
            synchronized (this.b) {
                vRemove = f().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.b) {
                size = f().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.b) {
                if (this.d == null) {
                    this.d = v2.h(f().values(), this.b);
                }
                collection = this.d;
            }
            return collection;
        }
    }

    public static class p implements Serializable {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public final Object a;
        public final Object b;

        public p(Object obj, @NullableDecl Object obj2) {
            this.a = Preconditions.checkNotNull(obj);
            this.b = obj2 == null ? this : obj2;
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.b) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* JADX INFO: renamed from: e */
        Object f() {
            return this.a;
        }

        public String toString() {
            String string;
            synchronized (this.b) {
                string = this.a.toString();
            }
            return string;
        }
    }

    public static class q<E> extends f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public q(Queue<E> queue, @NullableDecl Object obj) {
            super(queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.b) {
                eElement = g().element();
            }
            return eElement;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v2.f
        public Queue<E> g() {
            return (Queue) super.g();
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean zOffer;
            synchronized (this.b) {
                zOffer = g().offer(e);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public E peek() {
            E ePeek;
            synchronized (this.b) {
                ePeek = g().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        public E poll() {
            E ePoll;
            synchronized (this.b) {
                ePoll = g().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.b) {
                eRemove = g().remove();
            }
            return eRemove;
        }
    }

    public static class r<E> extends i<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public r(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }
    }

    public static class s<E> extends f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public s(Set<E> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v2.f
        public Set<E> g() {
            return (Set) super.g();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }
    }

    public static class t<K, V> extends l<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> h;

        public t(SetMultimap<K, V> setMultimap, @NullableDecl Object obj) {
            super(setMultimap, obj);
        }

        @Override // com.google.common.collect.v2.l
        public SetMultimap<K, V> f() {
            return (SetMultimap) super.f();
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.b) {
                if (this.h == null) {
                    this.h = v2.u(g().entries(), this.b);
                }
                set = this.h;
            }
            return set;
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(K k) {
            Set<V> setU;
            synchronized (this.b) {
                setU = v2.u(g().get((Object) k), this.b);
            }
            return setU;
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            Set<V> setRemoveAll;
            synchronized (this.b) {
                setRemoveAll = g().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Set<V> setReplaceValues;
            synchronized (this.b) {
                setReplaceValues = g().replaceValues((Object) k, (Iterable) iterable);
            }
            return setReplaceValues;
        }
    }

    public static class u<K, V> extends k<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public u(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.b) {
                comparator = f().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.b) {
                kFirstKey = f().firstKey();
            }
            return kFirstKey;
        }

        @Override // com.google.common.collect.v2.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> f() {
            return (SortedMap) super.f();
        }

        public SortedMap<K, V> headMap(K k) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.b) {
                sortedMapW = v2.w(f().headMap(k), this.b);
            }
            return sortedMapW;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.b) {
                kLastKey = f().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.b) {
                sortedMapW = v2.w(f().subMap(k, k2), this.b);
            }
            return sortedMapW;
        }

        public SortedMap<K, V> tailMap(K k) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.b) {
                sortedMapW = v2.w(f().tailMap(k), this.b);
            }
            return sortedMapW;
        }
    }

    public static class v<E> extends s<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public v(SortedSet<E> sortedSet, @NullableDecl Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.b) {
                comparator = f().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.b) {
                eFirst = f().first();
            }
            return eFirst;
        }

        @Override // com.google.common.collect.v2.s
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> g() {
            return (SortedSet) super.g();
        }

        public SortedSet<E> headSet(E e) {
            SortedSet<E> sortedSetX;
            synchronized (this.b) {
                sortedSetX = v2.x(f().headSet(e), this.b);
            }
            return sortedSetX;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.b) {
                eLast = f().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet<E> sortedSetX;
            synchronized (this.b) {
                sortedSetX = v2.x(f().subSet(e, e2), this.b);
            }
            return sortedSetX;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet<E> sortedSetX;
            synchronized (this.b) {
                sortedSetX = v2.x(f().tailSet(e), this.b);
            }
            return sortedSetX;
        }
    }

    public static final class x<R, C, V> extends p implements Table<R, C, V> {

        public class a implements Function<Map<C, V>, Map<C, V>> {
            public a() {
            }

            @Override // com.google.common.base.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> map) {
                return v2.l(map, x.this.b);
            }
        }

        public class b implements Function<Map<R, V>, Map<R, V>> {
            public b() {
            }

            @Override // com.google.common.base.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> map) {
                return v2.l(map, x.this.b);
            }
        }

        public x(Table<R, C, V> table, Object obj) {
            super(table, obj);
        }

        @Override // com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            Set<Table.Cell<R, C, V>> setU;
            synchronized (this.b) {
                setU = v2.u(f().cellSet(), this.b);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public void clear() {
            synchronized (this.b) {
                f().clear();
            }
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> column(@NullableDecl C c) {
            Map<R, V> mapL;
            synchronized (this.b) {
                mapL = v2.l(f().column(c), this.b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public Set<C> columnKeySet() {
            Set<C> setU;
            synchronized (this.b) {
                setU = v2.u(f().columnKeySet(), this.b);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> mapL;
            synchronized (this.b) {
                mapL = v2.l(Maps.transformValues(f().columnMap(), new b()), this.b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
            boolean zContains;
            synchronized (this.b) {
                zContains = f().contains(obj, obj2);
            }
            return zContains;
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(@NullableDecl Object obj) {
            boolean zContainsColumn;
            synchronized (this.b) {
                zContainsColumn = f().containsColumn(obj);
            }
            return zContainsColumn;
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(@NullableDecl Object obj) {
            boolean zContainsRow;
            synchronized (this.b) {
                zContainsRow = f().containsRow(obj);
            }
            return zContainsRow;
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(@NullableDecl Object obj) {
            boolean zContainsValue;
            synchronized (this.b) {
                zContainsValue = f().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Table
        public boolean equals(@NullableDecl Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.v2.p
        public Table<R, C, V> f() {
            return (Table) super.f();
        }

        @Override // com.google.common.collect.Table
        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V v;
            synchronized (this.b) {
                v = f().get(obj, obj2);
            }
            return v;
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.b) {
                zIsEmpty = f().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Table
        public V put(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
            V vPut;
            synchronized (this.b) {
                vPut = f().put(r, c, v);
            }
            return vPut;
        }

        @Override // com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.b) {
                f().putAll(table);
            }
        }

        @Override // com.google.common.collect.Table
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V vRemove;
            synchronized (this.b) {
                vRemove = f().remove(obj, obj2);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> row(@NullableDecl R r) {
            Map<C, V> mapL;
            synchronized (this.b) {
                mapL = v2.l(f().row(r), this.b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public Set<R> rowKeySet() {
            Set<R> setU;
            synchronized (this.b) {
                setU = v2.u(f().rowKeySet(), this.b);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> mapL;
            synchronized (this.b) {
                mapL = v2.l(Maps.transformValues(f().rowMap(), new a()), this.b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            int size;
            synchronized (this.b) {
                size = f().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Table
        public Collection<V> values() {
            Collection<V> collectionH;
            synchronized (this.b) {
                collectionH = v2.h(f().values(), this.b);
            }
            return collectionH;
        }
    }

    private v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> A(Collection<E> collection, @NullableDecl Object obj) {
        if (collection instanceof SortedSet) {
            return x((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return u((Set) collection, obj);
        }
        return collection instanceof List ? j((List) collection, obj) : h(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> B(Set<E> set, @NullableDecl Object obj) {
        return set instanceof SortedSet ? x((SortedSet) set, obj) : u(set, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> BiMap<K, V> g(BiMap<K, V> biMap, @NullableDecl Object obj) {
        return ((biMap instanceof e) || (biMap instanceof ImmutableBiMap)) ? biMap : new e(biMap, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> h(Collection<E> collection, @NullableDecl Object obj) {
        return new f(collection, obj);
    }

    public static <E> Deque<E> i(Deque<E> deque, @NullableDecl Object obj) {
        return new g(deque, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> List<E> j(List<E> list, @NullableDecl Object obj) {
        return list instanceof RandomAccess ? new r(list, obj) : new i(list, obj);
    }

    public static <K, V> ListMultimap<K, V> k(ListMultimap<K, V> listMultimap, @NullableDecl Object obj) {
        return ((listMultimap instanceof j) || (listMultimap instanceof com.google.common.collect.r)) ? listMultimap : new j(listMultimap, obj);
    }

    @VisibleForTesting
    public static <K, V> Map<K, V> l(Map<K, V> map, @NullableDecl Object obj) {
        return new k(map, obj);
    }

    public static <K, V> Multimap<K, V> m(Multimap<K, V> multimap, @NullableDecl Object obj) {
        return ((multimap instanceof l) || (multimap instanceof com.google.common.collect.r)) ? multimap : new l(multimap, obj);
    }

    public static <E> Multiset<E> n(Multiset<E> multiset, @NullableDecl Object obj) {
        return ((multiset instanceof m) || (multiset instanceof ImmutableMultiset)) ? multiset : new m(multiset, obj);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return p(navigableMap, null);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
        return new n(navigableMap, obj);
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return r(navigableSet, null);
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
        return new o(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    public static <K, V> Map.Entry<K, V> s(@NullableDecl Map.Entry<K, V> entry, @NullableDecl Object obj) {
        if (entry == null) {
            return null;
        }
        return new h(entry, obj);
    }

    public static <E> Queue<E> t(Queue<E> queue, @NullableDecl Object obj) {
        return queue instanceof q ? queue : new q(queue, obj);
    }

    @VisibleForTesting
    public static <E> Set<E> u(Set<E> set, @NullableDecl Object obj) {
        return new s(set, obj);
    }

    public static <K, V> SetMultimap<K, V> v(SetMultimap<K, V> setMultimap, @NullableDecl Object obj) {
        return ((setMultimap instanceof t) || (setMultimap instanceof com.google.common.collect.r)) ? setMultimap : new t(setMultimap, obj);
    }

    public static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
        return new u(sortedMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> x(SortedSet<E> sortedSet, @NullableDecl Object obj) {
        return new v(sortedSet, obj);
    }

    public static <K, V> SortedSetMultimap<K, V> y(SortedSetMultimap<K, V> sortedSetMultimap, @NullableDecl Object obj) {
        return sortedSetMultimap instanceof w ? sortedSetMultimap : new w(sortedSetMultimap, obj);
    }

    public static <R, C, V> Table<R, C, V> z(Table<R, C, V> table, Object obj) {
        return new x(table, obj);
    }

    public static class w<K, V> extends t<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public w(SortedSetMultimap<K, V> sortedSetMultimap, @NullableDecl Object obj) {
            super(sortedSetMultimap, obj);
        }

        @Override // com.google.common.collect.v2.t
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSetMultimap<K, V> g() {
            return (SortedSetMultimap) super.g();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.b) {
                comparatorValueComparator = g().valueComparator();
            }
            return comparatorValueComparator;
        }

        @Override // com.google.common.collect.v2.t, com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> get(K k) {
            SortedSet<V> sortedSetX;
            synchronized (this.b) {
                sortedSetX = v2.x(g().get((Object) k), this.b);
            }
            return sortedSetX;
        }

        @Override // com.google.common.collect.v2.t, com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.b) {
                sortedSetRemoveAll = g().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // com.google.common.collect.v2.t, com.google.common.collect.v2.l, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.b) {
                sortedSetReplaceValues = g().replaceValues((Object) k, (Iterable) iterable);
            }
            return sortedSetReplaceValues;
        }
    }

    public static class c<K, V> extends s<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        public class a extends x2<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.v2$c$a$a, reason: collision with other inner class name */
            public class C0204a extends ForwardingMapEntry<K, Collection<V>> {
                public final /* synthetic */ Map.Entry a;

                public C0204a(Map.Entry entry) {
                    this.a = entry;
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return v2.A((Collection) this.a.getValue(), c.this.b);
                }

                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public Map.Entry<K, Collection<V>> delegate() {
                    return this.a;
                }
            }

            public a(Iterator it2) {
                super(it2);
            }

            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
                return new C0204a(entry);
            }
        }

        public c(Set<Map.Entry<K, Collection<V>>> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean zL;
            synchronized (this.b) {
                zL = Maps.l(g(), obj);
            }
            return zL;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zC;
            synchronized (this.b) {
                zC = Collections2.c(g(), collection);
            }
            return zC;
        }

        @Override // com.google.common.collect.v2.s, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zA;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zA = Sets.a(g(), obj);
            }
            return zA;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zB;
            synchronized (this.b) {
                zB = Maps.B(g(), obj);
            }
            return zB;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.b) {
                zRemoveAll = Iterators.removeAll(g().iterator(), collection);
            }
            return zRemoveAll;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.b) {
                zRetainAll = Iterators.retainAll(g().iterator(), collection);
            }
            return zRetainAll;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrG;
            synchronized (this.b) {
                objArrG = ObjectArrays.g(g());
            }
            return objArrG;
        }

        @Override // com.google.common.collect.v2.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.b) {
                tArr2 = (T[]) ObjectArrays.h(g(), tArr);
            }
            return tArr2;
        }
    }

    public static class l<K, V> extends p implements Multimap<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient Set<K> c;

        @MonotonicNonNullDecl
        public transient Collection<V> d;

        @MonotonicNonNullDecl
        public transient Collection<Map.Entry<K, V>> e;

        @MonotonicNonNullDecl
        public transient Map<K, Collection<V>> f;

        @MonotonicNonNullDecl
        public transient Multiset<K> g;

        public l(Multimap<K, V> multimap, @NullableDecl Object obj) {
            super(multimap, obj);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = new b(f().asMap(), this.b);
                }
                map = this.f;
            }
            return map;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            synchronized (this.b) {
                f().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.b) {
                zContainsEntry = f().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.b) {
                zContainsKey = f().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.b) {
                zContainsValue = f().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.b) {
                if (this.e == null) {
                    this.e = v2.A(f().entries(), this.b);
                }
                collection = this.e;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.v2.p
        public Multimap<K, V> f() {
            return (Multimap) super.f();
        }

        public Collection<V> get(K k) {
            Collection<V> collectionA;
            synchronized (this.b) {
                collectionA = v2.A(f().get(k), this.b);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.b) {
                zIsEmpty = f().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = v2.B(f().keySet(), this.b);
                }
                set = this.c;
            }
            return set;
        }

        @Override // com.google.common.collect.Multimap
        public Multiset<K> keys() {
            Multiset<K> multiset;
            synchronized (this.b) {
                if (this.g == null) {
                    this.g = v2.n(f().keys(), this.b);
                }
                multiset = this.g;
            }
            return multiset;
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            boolean zPut;
            synchronized (this.b) {
                zPut = f().put(k, v);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            boolean zPutAll;
            synchronized (this.b) {
                zPutAll = f().putAll(k, iterable);
            }
            return zPutAll;
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.b) {
                zRemove = f().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> collectionRemoveAll;
            synchronized (this.b) {
                collectionRemoveAll = f().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Collection<V> collectionReplaceValues;
            synchronized (this.b) {
                collectionReplaceValues = f().replaceValues(k, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            int size;
            synchronized (this.b) {
                size = f().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.b) {
                if (this.d == null) {
                    this.d = v2.h(f().values(), this.b);
                }
                collection = this.d;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            boolean zPutAll;
            synchronized (this.b) {
                zPutAll = f().putAll(multimap);
            }
            return zPutAll;
        }
    }

    public static class m<E> extends f<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient Set<E> c;

        @MonotonicNonNullDecl
        public transient Set<Multiset.Entry<E>> d;

        public m(Multiset<E> multiset, @NullableDecl Object obj) {
            super(multiset, obj);
        }

        @Override // com.google.common.collect.Multiset
        public int add(E e, int i) {
            int iAdd;
            synchronized (this.b) {
                iAdd = f().add(e, i);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int iCount;
            synchronized (this.b) {
                iCount = f().count(obj);
            }
            return iCount;
        }

        @Override // com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = v2.B(f().elementSet(), this.b);
                }
                set = this.c;
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set;
            synchronized (this.b) {
                if (this.d == null) {
                    this.d = v2.B(f().entrySet(), this.b);
                }
                set = this.d;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.b) {
                zEquals = f().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.v2.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Multiset<E> g() {
            return (Multiset) super.g();
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
            int iHashCode;
            synchronized (this.b) {
                iHashCode = f().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            int iRemove;
            synchronized (this.b) {
                iRemove = f().remove(obj, i);
            }
            return iRemove;
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(E e, int i) {
            int count;
            synchronized (this.b) {
                count = f().setCount(e, i);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
            boolean count;
            synchronized (this.b) {
                count = f().setCount(e, i, i2);
            }
            return count;
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static class n<K, V> extends u<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient NavigableSet<K> f;

        @MonotonicNonNullDecl
        public transient NavigableMap<K, V> g;

        @MonotonicNonNullDecl
        public transient NavigableSet<K> h;

        public n(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().ceilingEntry(k), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            K kCeilingKey;
            synchronized (this.b) {
                kCeilingKey = g().ceilingKey(k);
            }
            return kCeilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.b) {
                NavigableSet<K> navigableSet = this.f;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetR = v2.r(g().descendingKeySet(), this.b);
                this.f = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.b) {
                NavigableMap<K, V> navigableMap = this.g;
                if (navigableMap != null) {
                    return navigableMap;
                }
                NavigableMap<K, V> navigableMapP = v2.p(g().descendingMap(), this.b);
                this.g = navigableMapP;
                return navigableMapP;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().firstEntry(), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().floorEntry(k), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            K kFloorKey;
            synchronized (this.b) {
                kFloorKey = g().floorKey(k);
            }
            return kFloorKey;
        }

        @Override // com.google.common.collect.v2.u
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.b) {
                navigableMapP = v2.p(g().headMap(k, z), this.b);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().higherEntry(k), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            K kHigherKey;
            synchronized (this.b) {
                kHigherKey = g().higherKey(k);
            }
            return kHigherKey;
        }

        @Override // com.google.common.collect.v2.k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().lastEntry(), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().lowerEntry(k), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            K kLowerKey;
            synchronized (this.b) {
                kLowerKey = g().lowerKey(k);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.b) {
                NavigableSet<K> navigableSet = this.h;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetR = v2.r(g().navigableKeySet(), this.b);
                this.h = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().pollFirstEntry(), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.b) {
                entryS = v2.s(g().pollLastEntry(), this.b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.b) {
                navigableMapP = v2.p(g().subMap(k, z, k2, z2), this.b);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.b) {
                navigableMapP = v2.p(g().tailMap(k, z), this.b);
            }
            return navigableMapP;
        }

        @Override // com.google.common.collect.v2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.v2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.v2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static class o<E> extends v<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        public transient NavigableSet<E> c;

        public o(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            E eCeiling;
            synchronized (this.b) {
                eCeiling = f().ceiling(e);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return f().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.b) {
                NavigableSet<E> navigableSet = this.c;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<E> navigableSetR = v2.r(f().descendingSet(), this.b);
                this.c = navigableSetR;
                return navigableSetR;
            }
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            E eFloor;
            synchronized (this.b) {
                eFloor = f().floor(e);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            NavigableSet<E> navigableSetR;
            synchronized (this.b) {
                navigableSetR = v2.r(f().headSet(e, z), this.b);
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            E eHigher;
            synchronized (this.b) {
                eHigher = f().higher(e);
            }
            return eHigher;
        }

        @Override // com.google.common.collect.v2.v
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> f() {
            return (NavigableSet) super.f();
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            E eLower;
            synchronized (this.b) {
                eLower = f().lower(e);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.b) {
                ePollFirst = f().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E ePollLast;
            synchronized (this.b) {
                ePollLast = f().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            NavigableSet<E> navigableSetR;
            synchronized (this.b) {
                navigableSetR = v2.r(f().subSet(e, z, e2, z2), this.b);
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            NavigableSet<E> navigableSetR;
            synchronized (this.b) {
                navigableSetR = v2.r(f().tailSet(e, z), this.b);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.v2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        @Override // com.google.common.collect.v2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }

        @Override // com.google.common.collect.v2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }
    }
}
