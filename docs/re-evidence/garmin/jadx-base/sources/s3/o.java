package s3;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls3/o;", "", "", "Ls3/i;", "table", "", "parent", "Ls3/c;", "sourceInformation", "Ls3/n;", "identityPath", "<init>", "(Ls3/i;ILs3/c;Ls3/n;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements g4.g, Iterable<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f156395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f156396d;

    public o(i iVar, int i14, c cVar, n nVar) {
        this.f156393a = iVar;
        this.f156394b = i14;
        this.f156395c = cVar;
        this.f156396d = nVar;
        int i15 = cVar.f156319a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f156394b == this.f156394b && s.g(oVar.f156393a, this.f156393a) && s.g(oVar.f156396d, this.f156396d);
    }

    public final int hashCode() {
        return this.f156396d.hashCode() + ((this.f156393a.hashCode() + (this.f156394b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new m(this.f156393a, this.f156394b, this.f156395c, this.f156396d);
    }
}
