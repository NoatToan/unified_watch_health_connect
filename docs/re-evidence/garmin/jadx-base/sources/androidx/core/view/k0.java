package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/core/view/k0;", "T", "", "rootIterator", "Lkotlin/Function1;", "getChildIterator", "<init>", "(Ljava/util/Iterator;Le23/l;)V", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0<T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<T, Iterator<T>> f6468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6469b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator<? extends T> f6470c;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(Iterator<? extends T> it, e23.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.f6468a = lVar;
        this.f6470c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6470c.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f6470c.next();
        Iterator<T> itInvoke = this.f6468a.invoke(next);
        ArrayList arrayList = this.f6469b;
        if (itInvoke != null && itInvoke.hasNext()) {
            arrayList.add(this.f6470c);
            this.f6470c = itInvoke;
            return next;
        }
        while (!this.f6470c.hasNext() && !arrayList.isEmpty()) {
            this.f6470c = (Iterator) p13.h0.m0(arrayList);
            p13.d0.F(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
