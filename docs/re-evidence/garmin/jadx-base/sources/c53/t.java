package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc53/t;", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements Iterator<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24583a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24584b;

    public t(Object obj) {
        this.f24584b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24583a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24583a) {
            this.f24583a = false;
            return this.f24584b;
        }
        c22.t.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
