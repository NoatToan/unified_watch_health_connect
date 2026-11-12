package c53;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc53/k;", "T", "Lc53/l;", "", "Lt13/d;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k<T> extends l<T> implements Iterator<T>, t13.d<Unit>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f24568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator<? extends T> f24569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t13.d<? super Unit> f24570d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c53.l
    public final u13.a a(Object obj, t13.d dVar) {
        this.f24568b = obj;
        this.f24567a = 3;
        this.f24570d = dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        dVar.getClass();
        return aVar;
    }

    @Override // c53.l
    public final Object b(Iterator it, v13.h hVar) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.f24569c = it;
        this.f24567a = 2;
        this.f24570d = hVar;
        return u13.a.COROUTINE_SUSPENDED;
    }

    public final RuntimeException c() {
        int i14 = this.f24567a;
        if (i14 == 4) {
            return new NoSuchElementException();
        }
        if (i14 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24567a);
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF129302c() {
        return t13.h.f161748a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i14 = this.f24567a;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2 || i14 == 3) {
                        return true;
                    }
                    if (i14 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator<? extends T> it = this.f24569c;
                it.getClass();
                if (it.hasNext()) {
                    this.f24567a = 2;
                    return true;
                }
                this.f24569c = null;
            }
            this.f24567a = 5;
            t13.d<? super Unit> dVar = this.f24570d;
            dVar.getClass();
            this.f24570d = null;
            Unit unit = Unit.INSTANCE;
            int i15 = o13.q.f128596b;
            dVar.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i14 = this.f24567a;
        if (i14 == 0 || i14 == 1) {
            if (hasNext()) {
                return next();
            }
            c22.t.g();
            return null;
        }
        if (i14 == 2) {
            this.f24567a = 1;
            Iterator<? extends T> it = this.f24569c;
            it.getClass();
            return it.next();
        }
        if (i14 != 3) {
            throw c();
        }
        this.f24567a = 0;
        T t7 = this.f24568b;
        this.f24568b = null;
        return t7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        o13.r.b(obj);
        this.f24567a = 4;
    }
}
