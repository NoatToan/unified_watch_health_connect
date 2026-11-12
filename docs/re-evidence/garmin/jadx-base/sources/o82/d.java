package o82;

import b63.i;
import b63.o;
import b63.q;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo82/d;", "", "Lb63/o;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements Iterator<o>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f130846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f130847b;

    public d(a aVar) {
        this.f130847b = aVar;
        o oVar = aVar.f130843a;
        i.INSTANCE.getClass();
        this.f130846a = q.c(oVar, 1, i.f16190d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        o oVar = this.f130846a;
        i.INSTANCE.getClass();
        return q.e(oVar, 1, i.f16190d).compareTo(this.f130847b.f130844b) <= 0;
    }

    @Override // java.util.Iterator
    public final o next() {
        o oVar = this.f130846a;
        i.INSTANCE.getClass();
        o oVarE = q.e(oVar, 1, i.f16190d);
        this.f130846a = oVarE;
        return oVarE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
