package p1;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tB\u0019\b\u0016\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bB\u001b\b\u0016\u0012\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lp1/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "set", "(Lp1/b;)V", "", "(Ljava/util/Collection;)V", "", "array", "([Ljava/lang/Object;)V", "a", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b<E> implements Collection<E>, Set<E>, f23.b, f23.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f134670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134672c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp1/b$a;", "Lp1/h;", "<init>", "(Lp1/b;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends h<E> {
        public a() {
            super(b.this.f134672c);
        }

        @Override // p1.h
        public final E a(int i14) {
            return (E) b.this.f134671b[i14];
        }

        @Override // p1.h
        public final void b(int i14) {
            b.this.b(i14);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(b<? extends E> bVar) {
        this(0);
        if (bVar != null) {
            int i14 = bVar.f134672c;
            a(this.f134672c + i14);
            if (this.f134672c != 0) {
                for (int i15 = 0; i15 < i14; i15++) {
                    add(bVar.f134671b[i15]);
                }
            } else if (i14 > 0) {
                p13.s.i(0, i14, 6, bVar.f134670a, this.f134670a);
                p13.s.j(bVar.f134671b, this.f134671b, 0, i14, 6);
                if (this.f134672c != 0) {
                    org.apache.commons.lang3.e.h();
                    throw null;
                }
                this.f134672c = i14;
            }
        }
    }

    public final void a(int i14) {
        int i15 = this.f134672c;
        int[] iArr = this.f134670a;
        if (iArr.length < i14) {
            Object[] objArr = this.f134671b;
            int[] iArr2 = new int[i14];
            this.f134670a = iArr2;
            this.f134671b = new Object[i14];
            if (i15 > 0) {
                p13.s.i(0, i15, 6, iArr, iArr2);
                p13.s.j(objArr, this.f134671b, 0, this.f134672c, 6);
            }
        }
        if (this.f134672c == i15) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e4) {
        int i14;
        int iB;
        int i15 = this.f134672c;
        if (e4 == null) {
            iB = b0.b(this, null, 0);
            i14 = 0;
        } else {
            int iHashCode = e4.hashCode();
            i14 = iHashCode;
            iB = b0.b(this, e4, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i16 = ~iB;
        int[] iArr = this.f134670a;
        if (i15 >= iArr.length) {
            int i17 = 8;
            if (i15 >= 8) {
                i17 = (i15 >> 1) + i15;
            } else if (i15 < 4) {
                i17 = 4;
            }
            Object[] objArr = this.f134671b;
            int[] iArr2 = new int[i17];
            this.f134670a = iArr2;
            this.f134671b = new Object[i17];
            if (i15 != this.f134672c) {
                org.apache.commons.lang3.e.h();
                return false;
            }
            if (iArr2.length != 0) {
                p13.s.i(0, iArr.length, 6, iArr, iArr2);
                p13.s.j(objArr, this.f134671b, 0, objArr.length, 6);
            }
        }
        if (i16 < i15) {
            int[] iArr3 = this.f134670a;
            int i18 = i16 + 1;
            p13.s.d(i18, i16, i15, iArr3, iArr3);
            Object[] objArr2 = this.f134671b;
            p13.s.h(objArr2, objArr2, i18, i16, i15);
        }
        int i19 = this.f134672c;
        if (i15 == i19) {
            int[] iArr4 = this.f134670a;
            if (i16 < iArr4.length) {
                iArr4[i16] = i14;
                this.f134671b[i16] = e4;
                this.f134672c = i19 + 1;
                return true;
            }
        }
        org.apache.commons.lang3.e.h();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        a(collection.size() + this.f134672c);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final E b(int i14) {
        int i15 = this.f134672c;
        Object[] objArr = this.f134671b;
        E e4 = (E) objArr[i14];
        if (i15 <= 1) {
            clear();
            return e4;
        }
        int i16 = i15 - 1;
        int[] iArr = this.f134670a;
        if (iArr.length <= 8 || i15 >= iArr.length / 3) {
            if (i14 < i16) {
                int i17 = i14 + 1;
                p13.s.d(i14, i17, i15, iArr, iArr);
                Object[] objArr2 = this.f134671b;
                p13.s.h(objArr2, objArr2, i14, i17, i15);
            }
            this.f134671b[i16] = null;
        } else {
            int i18 = i15 > 8 ? i15 + (i15 >> 1) : 8;
            int[] iArr2 = new int[i18];
            this.f134670a = iArr2;
            this.f134671b = new Object[i18];
            if (i14 > 0) {
                p13.s.i(0, i14, 6, iArr, iArr2);
                p13.s.j(objArr, this.f134671b, 0, i14, 6);
            }
            if (i14 < i16) {
                int i19 = i14 + 1;
                p13.s.d(i14, i19, i15, iArr, this.f134670a);
                p13.s.h(objArr, this.f134671b, i14, i19, i15);
            }
        }
        if (i15 == this.f134672c) {
            this.f134672c = i16;
            return e4;
        }
        org.apache.commons.lang3.e.h();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f134672c != 0) {
            this.f134670a = q1.a.f142054a;
            this.f134671b = q1.a.f142056c;
            this.f134672c = 0;
        }
        if (this.f134672c == 0) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? b0.b(this, null, 0) : b0.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f134672c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i14 = this.f134672c;
            for (int i15 = 0; i15 < i14; i15++) {
                if (!((Set) obj).contains(this.f134671b[i15])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f134670a;
        int i14 = this.f134672c;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            i15 += iArr[i16];
        }
        return i15;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f134672c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? b0.b(this, null, 0) : b0.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        b(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        boolean z14 = false;
        for (int i14 = this.f134672c - 1; -1 < i14; i14--) {
            if (!p13.h0.R(collection, this.f134671b[i14])) {
                b(i14);
                z14 = true;
            }
        }
        return z14;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f134672c;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int i14 = this.f134672c;
        if (tArr.length < i14) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i14));
        } else if (tArr.length > i14) {
            tArr[i14] = null;
        }
        p13.s.h(this.f134671b, tArr, 0, 0, this.f134672c);
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f134672c * 14);
        sb3.append(CoreConstants.CURLY_LEFT);
        int i14 = this.f134672c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            Object obj = this.f134671b[i15];
            if (obj != this) {
                sb3.append(obj);
            } else {
                sb3.append("(this Set)");
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return p13.s.l(0, this.f134672c, this.f134671b);
    }

    public b(int i14) {
        this.f134670a = q1.a.f142054a;
        this.f134671b = q1.a.f142056c;
        if (i14 > 0) {
            this.f134670a = new int[i14];
            this.f134671b = new Object[i14];
        }
    }

    public /* synthetic */ b(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public b() {
        this(0, 1, null);
    }

    public b(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(E[] eArr) {
        this(0);
        if (eArr != null) {
            p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(eArr);
            while (bVar.hasNext()) {
                add(bVar.next());
            }
        }
    }
}
