package p1;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lp1/a0;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a0 implements Iterator<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z<Object> f134666b;

    public a0(z<Object> zVar) {
        this.f134666b = zVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f134665a < this.f134666b.h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i14 = this.f134665a;
        this.f134665a = i14 + 1;
        return this.f134666b.i(i14);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
