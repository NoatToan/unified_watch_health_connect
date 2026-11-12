package s3;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls3/m;", "", "", "Ls3/i;", "table", "", "parent", "Ls3/c;", "group", "Ls3/n;", "path", "<init>", "(Ls3/i;ILs3/c;Ls3/n;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements Iterator<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f156389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f156390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f156391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156392f;

    public m(i iVar, int i14, c cVar, n nVar) {
        this.f156387a = iVar;
        this.f156388b = i14;
        this.f156389c = cVar;
        this.f156390d = nVar;
        this.f156391e = iVar.f156355h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.f156389c.f156322d;
        return arrayList != null && this.f156392f < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.f156389c.f156322d;
        if (arrayList != null) {
            int i14 = this.f156392f;
            this.f156392f = i14 + 1;
            obj = arrayList.get(i14);
        } else {
            obj = null;
        }
        boolean z14 = obj instanceof b;
        i iVar = this.f156387a;
        if (z14) {
            return new j(iVar, ((b) obj).f156318a, this.f156391e);
        }
        if (!(obj instanceof c)) {
            p3.n.b("Unexpected group information structure");
            o2.c.f();
            return null;
        }
        return new o(iVar, this.f156388b, (c) obj, new g(this.f156390d, this.f156392f - 1));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
