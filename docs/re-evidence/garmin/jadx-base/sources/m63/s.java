package m63;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lm63/s;", "Element", "Collection", "Builder", "Lm63/a;", "Li63/c;", "elementSerializer", "<init>", "(Li63/c;)V", "Lm63/t;", "Lm63/p1;", "Lm63/s1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class s<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<Element> f117012a;

    private s(i63.c<Element> cVar) {
        super(null);
        this.f117012a = cVar;
    }

    @Override // m63.a
    public void f(l63.c cVar, int i14, Object obj) {
        k63.e descriptor = getDescriptor();
        i63.c<Element> cVar2 = this.f117012a;
        int i15 = l63.c.f110557a;
        i(i14, obj, cVar.l(descriptor, i14, cVar2, null));
    }

    public abstract void i(int i14, Object obj, Object obj2);

    @Override // i63.i
    public void serialize(l63.f fVar, Collection collection) {
        int iD = d(collection);
        k63.e descriptor = getDescriptor();
        l63.d dVarQ = fVar.q(descriptor);
        Iterator<Element> itC = c(collection);
        for (int i14 = 0; i14 < iD; i14++) {
            dVarQ.e(getDescriptor(), i14, this.f117012a, itC.next());
        }
        dVarQ.b(descriptor);
    }

    public /* synthetic */ s(i63.c cVar, p005kotlin.jvm.internal.j jVar) {
        this(cVar);
    }
}
