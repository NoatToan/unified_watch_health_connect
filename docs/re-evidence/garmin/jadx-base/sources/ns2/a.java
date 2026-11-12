package ns2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns2/a;", "Landroid/os/Parcelable;", "T", "", "list", "", "isFullyLoaded", "<init>", "(Ljava/util/List;Z)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T extends Parcelable> implements List<T>, Parcelable, f23.a {
    public static final Parcelable.Creator<a<?>> CREATOR = new C2450a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f127815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127816b;

    /* JADX INFO: renamed from: ns2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2450a implements Parcelable.Creator<a<?>> {
        @Override // android.os.Parcelable.Creator
        public final a<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(a.class, parcel, arrayList, iD, 1);
            }
            return new a<>(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a<?>[] newArray(int i14) {
            return new a[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends T> list, boolean z14) {
        list.getClass();
        this.f127815a = list;
        this.f127816b = z14;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i14, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Parcelable)) {
            return false;
        }
        return this.f127815a.contains((Parcelable) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.f127815a.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return this.f127815a.get(i14);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Parcelable)) {
            return -1;
        }
        return this.f127815a.indexOf((Parcelable) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f127815a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.f127815a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Parcelable)) {
            return -1;
        }
        return this.f127815a.lastIndexOf((Parcelable) obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.f127815a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f127815a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<T> subList(int i14, int i15) {
        return this.f127815a.subList(i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) i.d(this, tArr);
    }

    public final String toString() {
        return "[isFullyLoaded=" + this.f127816b + "]" + this.f127815a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = f.e(this.f127815a, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        parcel.writeInt(this.f127816b ? 1 : 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i14) {
        return this.f127815a.listIterator(i14);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.c(this);
    }
}
