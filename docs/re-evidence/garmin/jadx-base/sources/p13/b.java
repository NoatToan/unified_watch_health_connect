package p13;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp13/b;", "T", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f134915b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i14 = this.f134914a;
        if (i14 == 0) {
            this.f134914a = 3;
            a();
            return this.f134914a == 1;
        }
        if (i14 == 1) {
            return true;
        }
        if (i14 == 2) {
            return false;
        }
        vb.h.s("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i14 = this.f134914a;
        if (i14 == 1) {
            this.f134914a = 0;
            return this.f134915b;
        }
        if (i14 != 2) {
            this.f134914a = 3;
            a();
            if (this.f134914a == 1) {
                this.f134914a = 0;
                return this.f134915b;
            }
        }
        c22.t.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
