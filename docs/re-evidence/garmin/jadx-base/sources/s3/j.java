package s3;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls3/j;", "", "", "Ls3/i;", "table", "", "group", "version", "<init>", "(Ls3/i;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements g4.g, Iterable<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156361c;

    public j(i iVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(iVar, i14, (i16 & 4) != 0 ? iVar.f156355h : i15);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f156360b == this.f156360b && jVar.f156361c == this.f156361c && s.g(jVar.f156359a, this.f156359a);
    }

    public final int hashCode() {
        return (this.f156359a.hashCode() * 31) + this.f156360b;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        i iVar = this.f156359a;
        if (iVar.f156355h != this.f156361c) {
            k.g();
        }
        int i14 = this.f156360b;
        c cVarJ = iVar.j(i14);
        return cVarJ != null ? new m(iVar, i14, cVarJ, new a(i14)) : new d(iVar, i14 + 1, k.a(i14, iVar.f156348a) + i14);
    }

    public j(i iVar, int i14, int i15) {
        this.f156359a = iVar;
        this.f156360b = i14;
        this.f156361c = i15;
    }
}
