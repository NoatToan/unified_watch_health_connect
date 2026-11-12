package f4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001\fB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lf4/s;", "T", "Landroid/os/Parcelable;", "Lf4/g0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lu3/c;", "persistentList", "<init>", "(Lu3/c;)V", "()V", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class s<T> implements Parcelable, g0, List<T>, RandomAccess, f23.c {
    public static final Parcelable.Creator<s<Object>> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f68804a;

    static {
        new b(null);
        CREATOR = new a();
    }

    public s(u3.c<? extends T> cVar) {
        f fVarI = l.i();
        a0 a0Var = new a0(fVarI.getF68737b(), cVar);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            a0Var.f68750b = new a0(1, cVar);
        }
        this.f68804a = a0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t7) {
        int i14;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarAdd = cVar.add(t7);
            if (cVarAdd.equals(cVar)) {
                return false;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i14, cVarAdd, true);
            }
            l.m(fVarI, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i14;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarAddAll = cVar.addAll((Collection<? extends Object>) collection);
            if (p005kotlin.jvm.internal.s.g(cVarAddAll, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i14, cVarAddAll, true);
            }
            l.m(fVarI, this);
        } while (!zB);
        return true;
    }

    public final void b(int i14, int i15) {
        int i16;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i16 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            v3.f fVarBuilder = cVar.builder();
            fVarBuilder.subList(i14, i15).clear();
            u3.c cVarC = fVarBuilder.c();
            if (p005kotlin.jvm.internal.s.g(cVarC, cVar)) {
                return;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i16, cVarC, true);
            }
            l.m(fVarI, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f fVarI;
        a0 a0Var = this.f68804a;
        a0Var.getClass();
        synchronized (l.f68775c) {
            f.f68735e.getClass();
            fVarI = l.i();
            a0 a0Var2 = (a0) l.v(a0Var, this, fVarI);
            synchronized (t.f68805a) {
                v3.j.f175379d.getClass();
                a0Var2.f68716c = v3.j.f175380e;
                a0Var2.f68717d++;
                a0Var2.f68718e++;
            }
        }
        l.m(fVarI, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return t.d(this).f68716c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return t.d(this).f68716c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final T get(int i14) {
        return t.d(this).f68716c.get(i14);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return t.d(this).f68716c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return t.d(this).f68716c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return t.d(this).f68716c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new z(this, 0);
    }

    @Override // f4.g0
    public final i0 m() {
        return this.f68804a;
    }

    @Override // f4.g0
    public final void q(i0 i0Var) {
        i0Var.f68750b = this.f68804a;
        this.f68804a = (a0) i0Var;
    }

    @Override // java.util.List
    public final T remove(int i14) {
        int i15;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        T t7 = get(i14);
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i15 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarR3 = cVar.r3(i14);
            if (p005kotlin.jvm.internal.s.g(cVarR3, cVar)) {
                break;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i15, cVarR3, true);
            }
            l.m(fVarI, this);
        } while (!zB);
        return t7;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i14;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarRemoveAll = cVar.removeAll((Collection<? extends Object>) collection);
            if (p005kotlin.jvm.internal.s.g(cVarRemoveAll, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i14, cVarRemoveAll, true);
            }
            l.m(fVarI, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return t.f(this, new r(collection, 0));
    }

    @Override // java.util.List
    public final T set(int i14, T t7) {
        int i15;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        T t14 = get(i14);
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i15 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVar2 = cVar.set(i14, t7);
            if (cVar2.equals(cVar)) {
                break;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i15, cVar2, false);
            }
            l.m(fVarI, this);
        } while (!zB);
        return t14;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return t.d(this).f68716c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i14, int i15) {
        if (!(i14 >= 0 && i14 <= i15 && i15 <= size())) {
            j2.a("fromIndex or toIndex are out of bounds");
        }
        return new l0(this, i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    public final String toString() {
        a0 a0Var = this.f68804a;
        a0Var.getClass();
        return "SnapshotStateList(value=" + ((a0) l.g(a0Var)).f68716c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        u3.c<? extends T> cVar = t.d(this).f68716c;
        int size = cVar.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeValue(cVar.get(i15));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf4/s$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lf4/s;", "CREATOR", "Landroid/os/Parcelable$Creator;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"f4/s$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lf4/s;", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<s<Object>> {
        public static s a(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            int i14 = parcel.readInt();
            if (i14 == 0) {
                return new s();
            }
            v3.j.f175379d.getClass();
            v3.f fVarBuilder = v3.j.f175380e.builder();
            for (int i15 = 0; i15 < i14; i15++) {
                fVarBuilder.add(parcel.readValue(classLoader));
            }
            return new s(fVarBuilder.c());
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i14) {
            return new s[i14];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ s<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i14) {
        return new z(this, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s() {
        this(v3.j.f175380e);
        v3.j.f175379d.getClass();
    }

    @Override // java.util.List
    public final void add(int i14, T t7) {
        int i15;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i15 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarAdd = cVar.add(i14, t7);
            if (cVarAdd.equals(cVar)) {
                return;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i15, cVarAdd, true);
            }
            l.m(fVarI, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends T> collection) {
        return t.f(this, new ap.b(i14, collection, 4));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i14;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        do {
            synchronized (t.f68805a) {
                a0 a0Var = this.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            u3.c<? extends T> cVarRemove = cVar.remove(obj);
            if (p005kotlin.jvm.internal.s.g(cVarRemove, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, this, fVarI), i14, cVarRemove, true);
            }
            l.m(fVarI, this);
        } while (!zB);
        return true;
    }
}
