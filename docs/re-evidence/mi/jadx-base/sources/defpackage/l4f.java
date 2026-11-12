package defpackage;

import com.google.common.base.Equivalence;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import l4f.i;
import l4f.n;

/* JADX INFO: loaded from: classes5.dex */
public class l4f<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final b0<Object, Object, e> j = new a();
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f24635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f24636b;
    public final transient n<K, V, E, S>[] c;
    public final int d;
    public final Equivalence<Object> e;
    public final transient j<K, V, E, S> f;
    public transient Set<K> g;
    public transient Collection<V> h;
    public transient Set<Map.Entry<K, V>> i;

    public class a implements b0<Object, Object, e> {
        @Override // l4f.b0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b0<Object, Object, e> a(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }

        @Override // l4f.b0
        public void clear() {
        }

        @Override // l4f.b0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e b() {
            return null;
        }

        @Override // l4f.b0
        public Object get() {
            return null;
        }
    }

    public interface a0<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        b0<K, V, E> a();
    }

    public static abstract class b<K, V> extends j1a<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f24637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f24638b;
        public final Equivalence<Object> c;
        public final Equivalence<Object> d;
        public final int e;
        public transient ConcurrentMap<K, V> f;

        public b(p pVar, p pVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f24637a = pVar;
            this.f24638b = pVar2;
            this.c = equivalence;
            this.d = equivalence2;
            this.e = i;
            this.f = concurrentMap;
        }

        @Override // defpackage.r1a, defpackage.t1a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ConcurrentMap<K, V> delegate() {
            return this.f;
        }

        public void g(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f.put((K) object, (V) objectInputStream.readObject());
            }
        }

        public k4f j(ObjectInputStream objectInputStream) throws IOException {
            return new k4f().g(objectInputStream.readInt()).j(this.f24637a).k(this.f24638b).h(this.c).a(this.e);
        }

        public void m(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f.size());
            for (Map.Entry<K, V> entry : this.f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public interface b0<K, V, E extends i<K, V, E>> {
        b0<K, V, E> a(ReferenceQueue<V> referenceQueue, E e);

        E b();

        void clear();

        V get();
    }

    public static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f24639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24640b;
        public final E c;

        public c(K k2, int i, E e) {
            this.f24639a = k2;
            this.f24640b = i;
            this.c = e;
        }

        @Override // l4f.i
        public E b() {
            return this.c;
        }

        @Override // l4f.i
        public int c() {
            return this.f24640b;
        }

        @Override // l4f.i
        public K getKey() {
            return this.f24639a;
        }
    }

    public static final class c0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements b0<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f24641a;

        public c0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f24641a = e;
        }

        @Override // l4f.b0
        public b0<K, V, E> a(ReferenceQueue<V> referenceQueue, E e) {
            return new c0(referenceQueue, get(), e);
        }

        @Override // l4f.b0
        public E b() {
            return this.f24641a;
        }
    }

    public static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f24643b;

        public d(ReferenceQueue<K> referenceQueue, K k2, int i, E e) {
            super(k2, referenceQueue);
            this.f24642a = i;
            this.f24643b = e;
        }

        @Override // l4f.i
        public E b() {
            return this.f24643b;
        }

        @Override // l4f.i
        public int c() {
            return this.f24642a;
        }

        @Override // l4f.i
        public K getKey() {
            return get();
        }
    }

    public final class d0 extends f10<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f24644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f24645b;

        public d0(K k2, V v) {
            this.f24644a = k2;
            this.f24645b = v;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f24644a.equals(entry.getKey()) && this.f24645b.equals(entry.getValue());
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return this.f24644a;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getValue() {
            return this.f24645b;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public int hashCode() {
            return this.f24644a.hashCode() ^ this.f24645b.hashCode();
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) l4f.this.put(this.f24644a, v);
            this.f24645b = v;
            return v2;
        }
    }

    public static final class e implements i<Object, Object, e> {
        public e() {
            throw new AssertionError();
        }

        @Override // l4f.i
        public int c() {
            throw new AssertionError();
        }

        @Override // l4f.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e b() {
            throw new AssertionError();
        }

        @Override // l4f.i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // l4f.i
        public Object getValue() {
            throw new AssertionError();
        }
    }

    public final class f extends l4f<K, V, E, S>.h<Map.Entry<K, V>> {
        public f(l4f l4fVar) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public final class g extends m<Map.Entry<K, V>> {
        public g() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l4f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = l4f.this.get(key)) != null && l4f.this.s().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return l4f.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(l4f.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && l4f.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l4f.this.size();
        }
    }

    public abstract class h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24648b = -1;
        public n<K, V, E, S> c;
        public AtomicReferenceArray<E> d;
        public E e;
        public l4f<K, V, E, S>.d0 f;
        public l4f<K, V, E, S>.d0 g;

        public h() {
            this.f24647a = l4f.this.c.length - 1;
            a();
        }

        public final void a() {
            this.f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i = this.f24647a;
                if (i < 0) {
                    return;
                }
                n<K, V, E, S>[] nVarArr = l4f.this.c;
                this.f24647a = i - 1;
                n<K, V, E, S> nVar = nVarArr[i];
                this.c = nVar;
                if (nVar.f24651b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.c.e;
                    this.d = atomicReferenceArray;
                    this.f24648b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E e) {
            n<K, V, E, S> nVar;
            try {
                Object key = e.getKey();
                Object objD = l4f.this.d(e);
                if (objD == null) {
                    return false;
                }
                this.f = new d0(key, objD);
                return true;
            } finally {
                this.c.s();
            }
        }

        public l4f<K, V, E, S>.d0 c() {
            l4f<K, V, E, S>.d0 d0Var = this.f;
            if (d0Var == null) {
                throw new NoSuchElementException();
            }
            this.g = d0Var;
            a();
            return this.g;
        }

        public boolean d() {
            E e = this.e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.e = (E) e.b();
                E e2 = this.e;
                if (e2 == null) {
                    return false;
                }
                if (b(e2)) {
                    return true;
                }
                e = this.e;
            }
        }

        public boolean e() {
            while (true) {
                int i = this.f24648b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.d;
                this.f24648b = i - 1;
                E e = atomicReferenceArray.get(i);
                this.e = e;
                if (e != null && (b(e) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            d44.e(this.g != null);
            l4f.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    public interface i<K, V, E extends i<K, V, E>> {
        E b();

        int c();

        K getKey();

        V getValue();
    }

    public interface j<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> {
        void a(S s, E e, V v);

        p b();

        S c(l4f<K, V, E, S> l4fVar, int i, int i2);

        p d();

        E e(S s, K k2, int i, E e);

        E f(S s, E e, E e2);
    }

    public final class k extends l4f<K, V, E, S>.h<K> {
        public k(l4f l4fVar) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public final class l extends m<K> {
        public l() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l4f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return l4f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return l4f.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k(l4f.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return l4f.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l4f.this.size();
        }
    }

    public static abstract class m<E> extends AbstractSet<E> {
        public m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l4f.p(this).toArray();
        }

        public /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l4f.p(this).toArray(tArr);
        }
    }

    public static abstract class n<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l4f<K, V, E, S> f24650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f24651b;
        public int c;
        public int d;
        public volatile AtomicReferenceArray<E> e;
        public final int f;
        public final AtomicInteger g = new AtomicInteger();

        public n(l4f<K, V, E, S> l4fVar, int i, int i2) {
            this.f24650a = l4fVar;
            this.f = i2;
            n(r(i));
        }

        public static <K, V, E extends i<K, V, E>> boolean o(E e) {
            return e.getValue() == null;
        }

        public V A(K k2, int i, V v) {
            lock();
            try {
                t();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVarB = e; iVarB != null; iVarB = iVarB.b()) {
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(k2, key)) {
                        V v2 = (V) iVarB.getValue();
                        if (v2 != null) {
                            this.c++;
                            F(iVarB, v);
                            return v2;
                        }
                        if (o(iVarB)) {
                            this.c++;
                            i iVarZ = z(e, iVarB);
                            int i2 = this.f24651b - 1;
                            atomicReferenceArray.set(length, (E) iVarZ);
                            this.f24651b = i2;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean B(K k2, int i, V v, V v2) {
            lock();
            try {
                t();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVarB = e; iVarB != null; iVarB = iVarB.b()) {
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(k2, key)) {
                        Object value = iVarB.getValue();
                        if (value != null) {
                            if (!this.f24650a.s().d(v, value)) {
                                return false;
                            }
                            this.c++;
                            F(iVarB, v2);
                            return true;
                        }
                        if (o(iVarB)) {
                            this.c++;
                            i iVarZ = z(e, iVarB);
                            int i2 = this.f24651b - 1;
                            atomicReferenceArray.set(length, (E) iVarZ);
                            this.f24651b = i2;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void C() {
            D();
        }

        public void D() {
            if (tryLock()) {
                try {
                    q();
                    this.g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S E();

        public void F(E e, V v) {
            this.f24650a.f.a(E(), e, v);
        }

        public void G() {
            if (tryLock()) {
                try {
                    q();
                } finally {
                    unlock();
                }
            }
        }

        public void a() {
            if (this.f24651b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    p();
                    this.g.set(0);
                    this.c++;
                    this.f24651b = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        public boolean c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f24651b == 0) {
                    return false;
                }
                i iVarK = k(obj, i);
                if (iVarK != null && iVarK.getValue() != null) {
                    z = true;
                }
                return z;
            } finally {
                s();
            }
        }

        public E d(E e, E e2) {
            return (E) this.f24650a.f.f(E(), e, e2);
        }

        public void e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f24650a.j((i) referencePoll);
                i++;
            } while (i != 16);
        }

        public void f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f24650a.m((b0) referencePoll);
                i++;
            } while (i != 16);
        }

        public void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f24651b;
            AtomicReferenceArray<E> atomicReferenceArrayR = r(length << 1);
            this.d = (atomicReferenceArrayR.length() * 3) / 4;
            int length2 = atomicReferenceArrayR.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E eB = atomicReferenceArray.get(i2);
                if (eB != null) {
                    i iVarB = eB.b();
                    int iC = eB.c() & length2;
                    if (iVarB == null) {
                        atomicReferenceArrayR.set(iC, eB);
                    } else {
                        i iVar = eB;
                        while (iVarB != null) {
                            int iC2 = iVarB.c() & length2;
                            if (iC2 != iC) {
                                iVar = iVarB;
                                iC = iC2;
                            }
                            iVarB = iVarB.b();
                        }
                        atomicReferenceArrayR.set(iC, iVar);
                        while (eB != iVar) {
                            int iC3 = eB.c() & length2;
                            i iVarD = d(eB, (i) atomicReferenceArrayR.get(iC3));
                            if (iVarD != null) {
                                atomicReferenceArrayR.set(iC3, iVarD);
                            } else {
                                i--;
                            }
                            eB = eB.b();
                        }
                    }
                }
            }
            this.e = atomicReferenceArrayR;
            this.f24651b = i;
        }

        public V h(Object obj, int i) {
            try {
                i iVarK = k(obj, i);
                if (iVarK == null) {
                    return null;
                }
                V v = (V) iVarK.getValue();
                if (v == null) {
                    G();
                }
                return v;
            } finally {
                s();
            }
        }

        public E i(Object obj, int i) {
            if (this.f24651b == 0) {
                return null;
            }
            for (E e = (E) j(i); e != null; e = (E) e.b()) {
                if (e.c() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        G();
                    } else if (this.f24650a.e.d(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        public E j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public E k(Object obj, int i) {
            return (E) i(obj, i);
        }

        public V m(E e) {
            if (e.getKey() == null) {
                G();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            G();
            return null;
        }

        public void n(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.d = length;
            if (length == this.f) {
                this.d = length + 1;
            }
            this.e = atomicReferenceArray;
        }

        public void p() {
        }

        public void q() {
        }

        public AtomicReferenceArray<E> r(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void s() {
            if ((this.g.incrementAndGet() & 63) == 0) {
                C();
            }
        }

        public void t() {
            D();
        }

        public V u(K k2, int i, V v, boolean z) {
            lock();
            try {
                t();
                int i2 = this.f24651b + 1;
                if (i2 > this.d) {
                    g();
                    i2 = this.f24651b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVarB = e; iVarB != null; iVarB = iVarB.b()) {
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(k2, key)) {
                        V v2 = (V) iVarB.getValue();
                        if (v2 == null) {
                            this.c++;
                            F(iVarB, v);
                            this.f24651b = this.f24651b;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.c++;
                        F(iVarB, v);
                        return v2;
                    }
                }
                this.c++;
                i iVarE = this.f24650a.f.e(E(), k2, i, e);
                F(iVarE, v);
                atomicReferenceArray.set(length, (E) iVarE);
                this.f24651b = i2;
                return null;
            } finally {
                unlock();
            }
        }

        public boolean v(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (i iVarB = e2; iVarB != null; iVarB = iVarB.b()) {
                    if (iVarB == e) {
                        this.c++;
                        i iVarZ = z(e2, iVarB);
                        int i2 = this.f24651b - 1;
                        atomicReferenceArray.set(length, (E) iVarZ);
                        this.f24651b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean w(K k2, int i, b0<K, V, E> b0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVarB = e; iVarB != null; iVarB = iVarB.b()) {
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(k2, key)) {
                        if (((a0) iVarB).a() != b0Var) {
                            return false;
                        }
                        this.c++;
                        i iVarZ = z(e, iVarB);
                        int i2 = this.f24651b - 1;
                        atomicReferenceArray.set(length, (E) iVarZ);
                        this.f24651b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public V x(Object obj, int i) {
            lock();
            try {
                t();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVarB = e; iVarB != null; iVarB = iVarB.b()) {
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(obj, key)) {
                        V v = (V) iVarB.getValue();
                        if (v == null && !o(iVarB)) {
                            return null;
                        }
                        this.c++;
                        i iVarZ = z(e, iVarB);
                        int i2 = this.f24651b - 1;
                        atomicReferenceArray.set(length, (E) iVarZ);
                        this.f24651b = i2;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean y(Object obj, int i, Object obj2) {
            lock();
            try {
                t();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                i iVarB = e;
                while (true) {
                    boolean z = false;
                    if (iVarB == null) {
                        return false;
                    }
                    Object key = iVarB.getKey();
                    if (iVarB.c() == i && key != null && this.f24650a.e.d(obj, key)) {
                        if (this.f24650a.s().d(obj2, iVarB.getValue())) {
                            z = true;
                        } else if (!o(iVarB)) {
                            return false;
                        }
                        this.c++;
                        i iVarZ = z(e, iVarB);
                        int i2 = this.f24651b - 1;
                        atomicReferenceArray.set(length, (E) iVarZ);
                        this.f24651b = i2;
                        return z;
                    }
                    iVarB = iVarB.b();
                }
            } finally {
                unlock();
            }
        }

        public E z(E e, E e2) {
            int i = this.f24651b;
            E e3 = (E) e2.b();
            while (e != e2) {
                i iVarD = d(e, e3);
                if (iVarD != null) {
                    e3 = (E) iVarD;
                } else {
                    i--;
                }
                e = (E) e.b();
            }
            this.f24651b = i;
            return e3;
        }
    }

    public static final class o<K, V> extends b<K, V> {
        private static final long serialVersionUID = 3;

        public o(p pVar, p pVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f = j(objectInputStream).i();
            g(objectInputStream);
        }

        private Object readResolve() {
            return this.f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            m(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f24652a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f24653b = new b("WEAK", 1);
        public static final /* synthetic */ p[] c = a();

        public final enum a extends p {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // l4f.p
            public Equivalence<Object> b() {
                return Equivalence.c();
            }
        }

        public final enum b extends p {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // l4f.p
            public Equivalence<Object> b() {
                return Equivalence.f();
            }
        }

        public p(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ p[] a() {
            return new p[]{f24652a, f24653b};
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) c.clone();
        }

        public abstract Equivalence<Object> b();

        public /* synthetic */ p(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class q<K, V> extends c<K, V, q<K, V>> implements i {
        public volatile V d;

        public static final class a<K, V> implements j<K, V, q<K, V>, r<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f24654a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f24654a;
            }

            @Override // l4f.j
            public p b() {
                return p.f24652a;
            }

            @Override // l4f.j
            public p d() {
                return p.f24652a;
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public q<K, V> f(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                return qVar.d(qVar2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K, V> e(r<K, V> rVar, K k2, int i, q<K, V> qVar) {
                return new q<>(k2, i, qVar);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public r<K, V> c(l4f<K, V, q<K, V>, r<K, V>> l4fVar, int i, int i2) {
                return new r<>(l4fVar, i, i2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(r<K, V> rVar, q<K, V> qVar, V v) {
                qVar.e(v);
            }
        }

        public q(K k2, int i, q<K, V> qVar) {
            super(k2, i, qVar);
            this.d = null;
        }

        public q<K, V> d(q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f24639a, this.f24640b, qVar);
            qVar2.d = this.d;
            return qVar2;
        }

        public void e(V v) {
            this.d = v;
        }

        @Override // l4f.i
        public V getValue() {
            return this.d;
        }
    }

    public static final class r<K, V> extends n<K, V, q<K, V>, r<K, V>> {
        public r(l4f<K, V, q<K, V>, r<K, V>> l4fVar, int i, int i2) {
            super(l4fVar, i, i2);
        }

        @Override // l4f.n
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public r<K, V> E() {
            return this;
        }
    }

    public static final class s<K, V> extends c<K, V, s<K, V>> implements a0<K, V, s<K, V>> {
        public volatile b0<K, V, s<K, V>> d;

        public static final class a<K, V> implements j<K, V, s<K, V>, t<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f24655a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f24655a;
            }

            @Override // l4f.j
            public p b() {
                return p.f24652a;
            }

            @Override // l4f.j
            public p d() {
                return p.f24653b;
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public s<K, V> f(t<K, V> tVar, s<K, V> sVar, s<K, V> sVar2) {
                if (n.o(sVar)) {
                    return null;
                }
                return sVar.d(tVar.h, sVar2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public s<K, V> e(t<K, V> tVar, K k2, int i, s<K, V> sVar) {
                return new s<>(k2, i, sVar);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public t<K, V> c(l4f<K, V, s<K, V>, t<K, V>> l4fVar, int i, int i2) {
                return new t<>(l4fVar, i, i2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(t<K, V> tVar, s<K, V> sVar, V v) {
                sVar.e(v, tVar.h);
            }
        }

        public s(K k2, int i, s<K, V> sVar) {
            super(k2, i, sVar);
            this.d = l4f.q();
        }

        @Override // l4f.a0
        public b0<K, V, s<K, V>> a() {
            return this.d;
        }

        public s<K, V> d(ReferenceQueue<V> referenceQueue, s<K, V> sVar) {
            s<K, V> sVar2 = new s<>(this.f24639a, this.f24640b, sVar);
            sVar2.d = this.d.a(referenceQueue, sVar2);
            return sVar2;
        }

        public void e(V v, ReferenceQueue<V> referenceQueue) {
            b0<K, V, s<K, V>> b0Var = this.d;
            this.d = new c0(referenceQueue, v, this);
            b0Var.clear();
        }

        @Override // l4f.i
        public V getValue() {
            return this.d.get();
        }
    }

    public static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        public final ReferenceQueue<V> h;

        public t(l4f<K, V, s<K, V>, t<K, V>> l4fVar, int i, int i2) {
            super(l4fVar, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // l4f.n
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public t<K, V> E() {
            return this;
        }

        @Override // l4f.n
        public void p() {
            b(this.h);
        }

        @Override // l4f.n
        public void q() {
            f(this.h);
        }
    }

    public final class u extends l4f<K, V, E, S>.h<V> {
        public u(l4f l4fVar) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public final class v extends AbstractCollection<V> {
        public v() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l4f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return l4f.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return l4f.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new u(l4f.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return l4f.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return l4f.p(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l4f.p(this).toArray(tArr);
        }
    }

    public static final class w<K, V> extends d<K, V, w<K, V>> implements i {
        public volatile V c;

        public static final class a<K, V> implements j<K, V, w<K, V>, x<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f24657a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f24657a;
            }

            @Override // l4f.j
            public p b() {
                return p.f24653b;
            }

            @Override // l4f.j
            public p d() {
                return p.f24652a;
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public w<K, V> f(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null) {
                    return null;
                }
                return wVar.d(xVar.h, wVar2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public w<K, V> e(x<K, V> xVar, K k2, int i, w<K, V> wVar) {
                return new w<>(xVar.h, k2, i, wVar);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public x<K, V> c(l4f<K, V, w<K, V>, x<K, V>> l4fVar, int i, int i2) {
                return new x<>(l4fVar, i, i2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(x<K, V> xVar, w<K, V> wVar, V v) {
                wVar.e(v);
            }
        }

        public w(ReferenceQueue<K> referenceQueue, K k2, int i, w<K, V> wVar) {
            super(referenceQueue, k2, i, wVar);
            this.c = null;
        }

        public w<K, V> d(ReferenceQueue<K> referenceQueue, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f24642a, wVar);
            wVar2.e(this.c);
            return wVar2;
        }

        public void e(V v) {
            this.c = v;
        }

        @Override // l4f.i
        public V getValue() {
            return this.c;
        }
    }

    public static final class x<K, V> extends n<K, V, w<K, V>, x<K, V>> {
        public final ReferenceQueue<K> h;

        public x(l4f<K, V, w<K, V>, x<K, V>> l4fVar, int i, int i2) {
            super(l4fVar, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // l4f.n
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public x<K, V> E() {
            return this;
        }

        @Override // l4f.n
        public void p() {
            b(this.h);
        }

        @Override // l4f.n
        public void q() {
            e(this.h);
        }
    }

    public static final class y<K, V> extends d<K, V, y<K, V>> implements a0<K, V, y<K, V>> {
        public volatile b0<K, V, y<K, V>> c;

        public static final class a<K, V> implements j<K, V, y<K, V>, z<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f24658a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f24658a;
            }

            @Override // l4f.j
            public p b() {
                return p.f24653b;
            }

            @Override // l4f.j
            public p d() {
                return p.f24653b;
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public y<K, V> f(z<K, V> zVar, y<K, V> yVar, y<K, V> yVar2) {
                if (yVar.getKey() == null || n.o(yVar)) {
                    return null;
                }
                return yVar.d(zVar.h, zVar.i, yVar2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public y<K, V> e(z<K, V> zVar, K k2, int i, y<K, V> yVar) {
                return new y<>(zVar.h, k2, i, yVar);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public z<K, V> c(l4f<K, V, y<K, V>, z<K, V>> l4fVar, int i, int i2) {
                return new z<>(l4fVar, i, i2);
            }

            @Override // l4f.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(z<K, V> zVar, y<K, V> yVar, V v) {
                yVar.e(v, zVar.i);
            }
        }

        public y(ReferenceQueue<K> referenceQueue, K k2, int i, y<K, V> yVar) {
            super(referenceQueue, k2, i, yVar);
            this.c = l4f.q();
        }

        @Override // l4f.a0
        public b0<K, V, y<K, V>> a() {
            return this.c;
        }

        public y<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, y<K, V> yVar) {
            y<K, V> yVar2 = new y<>(referenceQueue, getKey(), this.f24642a, yVar);
            yVar2.c = this.c.a(referenceQueue2, yVar2);
            return yVar2;
        }

        public void e(V v, ReferenceQueue<V> referenceQueue) {
            b0<K, V, y<K, V>> b0Var = this.c;
            this.c = new c0(referenceQueue, v, this);
            b0Var.clear();
        }

        @Override // l4f.i
        public V getValue() {
            return this.c.get();
        }
    }

    public static final class z<K, V> extends n<K, V, y<K, V>, z<K, V>> {
        public final ReferenceQueue<K> h;
        public final ReferenceQueue<V> i;

        public z(l4f<K, V, y<K, V>, z<K, V>> l4fVar, int i, int i2) {
            super(l4fVar, i, i2);
            this.h = new ReferenceQueue<>();
            this.i = new ReferenceQueue<>();
        }

        @Override // l4f.n
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public z<K, V> E() {
            return this;
        }

        @Override // l4f.n
        public void p() {
            b(this.h);
        }

        @Override // l4f.n
        public void q() {
            e(this.h);
            f(this.i);
        }
    }

    public l4f(k4f k4fVar, j<K, V, E, S> jVar) {
        this.d = Math.min(k4fVar.b(), 65536);
        this.e = k4fVar.d();
        this.f = jVar;
        int iMin = Math.min(k4fVar.c(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.d) {
            i4++;
            i5 <<= 1;
        }
        this.f24636b = 32 - i4;
        this.f24635a = i5 - 1;
        this.c = g(i5);
        int i6 = iMin / i5;
        while (i3 < (i5 * i6 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.c;
            if (i2 >= nVarArr.length) {
                return;
            }
            nVarArr[i2] = c(i3, -1);
            i2++;
        }
    }

    public static <K, V> l4f<K, V, ? extends i<K, V, ?>, ?> b(k4f k4fVar) {
        p pVarE = k4fVar.e();
        p pVar = p.f24652a;
        if (pVarE == pVar && k4fVar.f() == pVar) {
            return new l4f<>(k4fVar, q.a.h());
        }
        if (k4fVar.e() == pVar && k4fVar.f() == p.f24653b) {
            return new l4f<>(k4fVar, s.a.h());
        }
        p pVarE2 = k4fVar.e();
        p pVar2 = p.f24653b;
        if (pVarE2 == pVar2 && k4fVar.f() == pVar) {
            return new l4f<>(k4fVar, w.a.h());
        }
        if (k4fVar.e() == pVar2 && k4fVar.f() == pVar2) {
            return new l4f<>(k4fVar, y.a.h());
        }
        throw new AssertionError();
    }

    public static int n(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    public static <E> ArrayList<E> p(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        epd.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends i<K, V, E>> b0<K, V, E> q() {
        return (b0<K, V, E>) j;
    }

    public n<K, V, E, S> c(int i2, int i3) {
        return this.f.c(this, i2, i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n<K, V, E, S> nVar : this.c) {
            nVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iF = f(obj);
        return o(iF).c(obj, iF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.c;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = nVarArr.length;
            long j3 = 0;
            for (?? r10 = z2; r10 < length; r10++) {
                n<K, V, E, S> nVar = nVarArr[r10];
                int i3 = nVar.f24651b;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.e;
                for (?? r13 = z2; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eB = atomicReferenceArray.get(r13); eB != null; eB = eB.b()) {
                        V vM = nVar.m(eB);
                        if (vM != null && s().d(obj, vM)) {
                            return true;
                        }
                    }
                }
                j3 += (long) nVar.c;
                z2 = false;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            z2 = false;
        }
        return z2;
    }

    public V d(E e2) {
        if (e2.getKey() == null) {
            return null;
        }
        return (V) e2.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.i = gVar;
        return gVar;
    }

    public int f(Object obj) {
        return n(this.e.e(obj));
    }

    public final n<K, V, E, S>[] g(int i2) {
        return new n[i2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return o(iF).h(obj, iF);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].f24651b != 0) {
                return false;
            }
            j2 += (long) nVarArr[i2].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < nVarArr.length; i3++) {
            if (nVarArr[i3].f24651b != 0) {
                return false;
            }
            j2 -= (long) nVarArr[i3].c;
        }
        return j2 == 0;
    }

    public void j(E e2) {
        int iC = e2.c();
        o(iC).v(e2, iC);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.g;
        if (set != null) {
            return set;
        }
        l lVar = new l();
        this.g = lVar;
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(b0<K, V, E> b0Var) {
        i iVarB = b0Var.b();
        int iC = iVarB.c();
        o(iC).w(iVarB.getKey(), iC, b0Var);
    }

    public n<K, V, E, S> o(int i2) {
        return this.c[(i2 >>> this.f24636b) & this.f24635a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        c6i.o(k2);
        c6i.o(v2);
        int iF = f(k2);
        return o(iF).u(k2, iF, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        c6i.o(k2);
        c6i.o(v2);
        int iF = f(k2);
        return o(iF).u(k2, iF, v2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return o(iF).x(obj, iF);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        c6i.o(k2);
        c6i.o(v3);
        if (v2 == null) {
            return false;
        }
        int iF = f(k2);
        return o(iF).B(k2, iF, v2, v3);
    }

    public Equivalence<Object> s() {
        return this.f.d().b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (n<K, V, E, S> nVar : this.c) {
            j2 += (long) nVar.f24651b;
        }
        return ahd.j(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.h;
        if (collection != null) {
            return collection;
        }
        v vVar = new v();
        this.h = vVar;
        return vVar;
    }

    public Object writeReplace() {
        return new o(this.f.b(), this.f.d(), this.e, this.f.d().b(), this.d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iF = f(obj);
        return o(iF).y(obj, iF, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        c6i.o(k2);
        c6i.o(v2);
        int iF = f(k2);
        return o(iF).A(k2, iF, v2);
    }
}
