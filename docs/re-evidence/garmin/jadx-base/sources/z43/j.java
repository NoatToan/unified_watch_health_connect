package z43;

import c22.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.b1;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends p13.h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f202430c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f202431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f202432b;

    public static final class a<T> implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p005kotlin.jvm.internal.b f202433a;

        public a(T[] tArr) {
            tArr.getClass();
            this.f202433a = new p005kotlin.jvm.internal.b(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202433a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.f202433a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class c<T> implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f202434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f202435b = true;

        public c(T t7) {
            this.f202434a = t7;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202435b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f202435b) {
                this.f202435b = false;
                return this.f202434a;
            }
            t.g();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Override // p13.h
    public final int a() {
        return this.f202432b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t7) {
        Object obj;
        if (a() == 0) {
            this.f202431a = t7;
        } else if (a() != 1) {
            int iA = a();
            Object obj2 = this.f202431a;
            if (iA < 5) {
                obj2.getClass();
                Object[] objArr = (Object[]) obj2;
                if (u.z(objArr, t7)) {
                    return false;
                }
                if (a() == 4) {
                    LinkedHashSet linkedHashSetD = b1.d(Arrays.copyOf(objArr, objArr.length));
                    linkedHashSetD.add(t7);
                    obj = linkedHashSetD;
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, a() + 1);
                    objArrCopyOf[objArrCopyOf.length - 1] = t7;
                    obj = objArrCopyOf;
                }
                this.f202431a = obj;
            } else {
                obj2.getClass();
                if (!y0.d(obj2).add(t7)) {
                    return false;
                }
            }
        } else {
            if (s.g(this.f202431a, t7)) {
                return false;
            }
            this.f202431a = new Object[]{this.f202431a, t7};
        }
        this.f202432b = a() + 1;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f202431a = null;
        this.f202432b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return s.g(this.f202431a, obj);
        }
        int iA = a();
        Object obj2 = this.f202431a;
        if (iA < 5) {
            obj2.getClass();
            return u.z((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        if (a() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (a() == 1) {
            return new c(this.f202431a);
        }
        int iA = a();
        Object obj = this.f202431a;
        if (iA < 5) {
            obj.getClass();
            return new a((Object[]) obj);
        }
        obj.getClass();
        return y0.d(obj).iterator();
    }

    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a() {
            return new j(null);
        }

        private b() {
        }
    }

    private j() {
    }
}
