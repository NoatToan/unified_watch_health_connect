package f4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lf4/w;", "T", "Landroid/os/Parcelable;", "Lf4/g0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class w<T> implements Parcelable, g0, Set<T>, RandomAccess, f23.e {
    public static final Parcelable.Creator<w<Object>> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f68837a;

    static {
        new b(null);
        CREATOR = new a();
    }

    public w() {
        x3.b.f188546e.getClass();
        x3.b bVar = x3.b.f188547f;
        k0 k0Var = new k0(l.i().getF68737b(), bVar);
        f.f68735e.getClass();
        if (l.f68774b.a() != null) {
            k0Var.f68750b = new k0(1, bVar);
        }
        this.f68837a = k0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t7) {
        int i14;
        u3.e<? extends T> eVar;
        f fVarI;
        boolean zA;
        do {
            synchronized (x.f68838a) {
                k0 k0Var = this.f68837a;
                k0Var.getClass();
                k0 k0Var2 = (k0) l.g(k0Var);
                i14 = k0Var2.f68772d;
                eVar = k0Var2.f68771c;
                Unit unit = Unit.INSTANCE;
            }
            eVar.getClass();
            x3.b bVarAdd = eVar.add(t7);
            if (bVarAdd.equals(eVar)) {
                return false;
            }
            k0 k0Var3 = this.f68837a;
            k0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = x.a((k0) l.v(k0Var3, this, fVarI), i14, bVarAdd);
            }
            l.m(fVarI, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i14;
        u3.e<? extends T> eVar;
        f fVarI;
        boolean zA;
        do {
            synchronized (x.f68838a) {
                k0 k0Var = this.f68837a;
                k0Var.getClass();
                k0 k0Var2 = (k0) l.g(k0Var);
                i14 = k0Var2.f68772d;
                eVar = k0Var2.f68771c;
                Unit unit = Unit.INSTANCE;
            }
            eVar.getClass();
            u3.e<? extends T> eVarAddAll = eVar.addAll((Collection<? extends Object>) collection);
            if (p005kotlin.jvm.internal.s.g(eVarAddAll, eVar)) {
                return false;
            }
            k0 k0Var3 = this.f68837a;
            k0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = x.a((k0) l.v(k0Var3, this, fVarI), i14, eVarAddAll);
            }
            l.m(fVarI, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        f fVarI;
        k0 k0Var = this.f68837a;
        k0Var.getClass();
        synchronized (l.f68775c) {
            f.f68735e.getClass();
            fVarI = l.i();
            k0 k0Var2 = (k0) l.v(k0Var, this, fVarI);
            synchronized (x.f68838a) {
                x3.b.f188546e.getClass();
                k0Var2.f68771c = x3.b.f188547f;
                k0Var2.f68772d++;
            }
        }
        l.m(fVarI, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return x.b(this).f68771c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return x.b(this).f68771c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return x.b(this).f68771c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new j0(this, x.b(this).f68771c.iterator());
    }

    @Override // f4.g0
    public final i0 m() {
        return this.f68837a;
    }

    @Override // f4.g0
    public final void q(i0 i0Var) {
        i0Var.f68750b = this.f68837a;
        this.f68837a = (k0) i0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i14;
        u3.e<? extends T> eVar;
        f fVarI;
        boolean zA;
        do {
            synchronized (x.f68838a) {
                k0 k0Var = this.f68837a;
                k0Var.getClass();
                k0 k0Var2 = (k0) l.g(k0Var);
                i14 = k0Var2.f68772d;
                eVar = k0Var2.f68771c;
                Unit unit = Unit.INSTANCE;
            }
            eVar.getClass();
            x3.b bVarRemove = eVar.remove(obj);
            if (bVarRemove.equals(eVar)) {
                return false;
            }
            k0 k0Var3 = this.f68837a;
            k0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = x.a((k0) l.v(k0Var3, this, fVarI), i14, bVarRemove);
            }
            l.m(fVarI, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i14;
        u3.e<? extends T> eVar;
        f fVarI;
        boolean zA;
        do {
            synchronized (x.f68838a) {
                k0 k0Var = this.f68837a;
                k0Var.getClass();
                k0 k0Var2 = (k0) l.g(k0Var);
                i14 = k0Var2.f68772d;
                eVar = k0Var2.f68771c;
                Unit unit = Unit.INSTANCE;
            }
            eVar.getClass();
            u3.e<? extends T> eVarRemoveAll = eVar.removeAll((Collection<? extends Object>) collection);
            if (p005kotlin.jvm.internal.s.g(eVarRemoveAll, eVar)) {
                return false;
            }
            k0 k0Var3 = this.f68837a;
            k0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = x.a((k0) l.v(k0Var3, this, fVarI), i14, eVarRemoveAll);
            }
            l.m(fVarI, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i14;
        u3.e<? extends T> eVar;
        boolean zRetainAll;
        f fVarI;
        boolean zA;
        do {
            synchronized (x.f68838a) {
                k0 k0Var = this.f68837a;
                k0Var.getClass();
                k0 k0Var2 = (k0) l.g(k0Var);
                i14 = k0Var2.f68772d;
                eVar = k0Var2.f68771c;
                Unit unit = Unit.INSTANCE;
            }
            if (eVar == null) {
                vb.h.z("No set to mutate");
                return false;
            }
            x3.c cVarBuilder = eVar.builder();
            zRetainAll = cVarBuilder.retainAll(p13.h0.g1(collection));
            x3.b bVarB = cVarBuilder.b();
            if (bVarB.equals(eVar)) {
                break;
            }
            k0 k0Var3 = this.f68837a;
            k0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = x.a((k0) l.v(k0Var3, this, fVarI), i14, bVarB);
            }
            l.m(fVarI, this);
        } while (!zA);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return x.b(this).f68771c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    public final String toString() {
        k0 k0Var = this.f68837a;
        k0Var.getClass();
        return "SnapshotStateSet(value=" + ((k0) l.g(k0Var)).f68771c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        u3.e<? extends T> eVar = x.b(this).f68771c;
        parcel.writeInt(size());
        Iterator<? extends T> it = eVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf4/w$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lf4/w;", "CREATOR", "Landroid/os/Parcelable$Creator;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"f4/w$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lf4/w;", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<w<Object>> {
        /* JADX WARN: Multi-variable type inference failed */
        public static w a(Parcel parcel, ClassLoader classLoader) {
            w wVar = new w();
            if (classLoader == null) {
                classLoader = w.class.getClassLoader();
            }
            int i14 = parcel.readInt();
            for (int i15 = 0; i15 < i14; i15++) {
                wVar.add(parcel.readValue(classLoader));
            }
            return wVar;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i14) {
            return new w[i14];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ w<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }
}
