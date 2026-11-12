package p1;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/h;", "T", "", "", "startingSize", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class h<T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f134731c;

    public h(int i14) {
        this.f134729a = i14;
    }

    public abstract T a(int i14);

    public abstract void b(int i14);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f134730b < this.f134729a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            c22.t.g();
            return null;
        }
        T tA = a(this.f134730b);
        this.f134730b++;
        this.f134731c = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f134731c) {
            vb.h.z("Call next() before removing an element.");
            return;
        }
        int i14 = this.f134730b - 1;
        this.f134730b = i14;
        b(i14);
        this.f134729a--;
        this.f134731c = false;
    }
}
