package f4;

import com.mapbox.maps.MapboxMap;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf4/z;", "T", "", "Lf4/s;", "list", "", MapboxMap.QFE_OFFSET, "<init>", "(Lf4/s;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z<T> implements ListIterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s<T> f68842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68844c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68845d;

    public z(s<T> sVar, int i14) {
        this.f68842a = sVar;
        this.f68843b = i14 - 1;
        this.f68845d = t.e(sVar);
    }

    public final void a() {
        if (t.e(this.f68842a) == this.f68845d) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // java.util.ListIterator
    public final void add(T t7) {
        a();
        int i14 = this.f68843b + 1;
        s<T> sVar = this.f68842a;
        sVar.add(i14, t7);
        this.f68844c = -1;
        this.f68843b++;
        this.f68845d = t.e(sVar);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f68843b < this.f68842a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f68843b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i14 = this.f68843b + 1;
        this.f68844c = i14;
        s<T> sVar = this.f68842a;
        t.a(i14, sVar.size());
        T t7 = sVar.get(i14);
        this.f68843b = i14;
        return t7;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f68843b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i14 = this.f68843b;
        s<T> sVar = this.f68842a;
        t.a(i14, sVar.size());
        int i15 = this.f68843b;
        this.f68844c = i15;
        T t7 = sVar.get(i15);
        this.f68843b--;
        return t7;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f68843b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i14 = this.f68844c;
        s<T> sVar = this.f68842a;
        sVar.remove(i14);
        this.f68843b--;
        this.f68844c = -1;
        this.f68845d = t.e(sVar);
    }

    @Override // java.util.ListIterator
    public final void set(T t7) {
        a();
        int i14 = this.f68844c;
        if (i14 < 0) {
            vb.h.z("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            return;
        }
        s<T> sVar = this.f68842a;
        sVar.set(i14, t7);
        this.f68845d = t.e(sVar);
    }
}
