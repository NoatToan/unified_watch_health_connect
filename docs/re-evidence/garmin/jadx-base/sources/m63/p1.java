package m63;

import java.util.Iterator;
import m63.n1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm63/p1;", "Element", "Array", "Lm63/n1;", "Builder", "Lm63/s;", "Li63/c;", "primitiveSerializer", "<init>", "(Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p1<Element, Array, Builder extends n1<Array>> extends s<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f117005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(i63.c<Element> cVar) {
        super(cVar, null);
        cVar.getClass();
        this.f117005b = new o1(cVar.getF116202c());
    }

    @Override // m63.a
    public final Object a() {
        return g(j());
    }

    @Override // m63.a
    public final int b(Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        return n1Var.getF116935b();
    }

    @Override // m63.a
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // m63.a, i63.b
    public final Array deserialize(l63.e eVar) {
        eVar.getClass();
        return (Array) e(eVar);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f117005b;
    }

    @Override // m63.a
    public final Object h(Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        return n1Var.a();
    }

    @Override // m63.s
    public final void i(int i14, Object obj, Object obj2) {
        ((n1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(l63.d dVar, Array array, int i14);

    @Override // m63.s, i63.i
    public final void serialize(l63.f fVar, Array array) {
        int iD = d(array);
        o1 o1Var = this.f117005b;
        l63.d dVarQ = fVar.q(o1Var);
        k(dVarQ, array, iD);
        dVarQ.b(o1Var);
    }
}
