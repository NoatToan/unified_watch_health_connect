package k63;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk63/h;", "", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements Iterator<String>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f103248b;

    public h(e eVar) {
        this.f103248b = eVar;
        this.f103247a = eVar.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f103247a > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        e eVar = this.f103248b;
        int iC = eVar.c();
        int i14 = this.f103247a;
        this.f103247a = i14 - 1;
        return eVar.d(iC - i14);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
