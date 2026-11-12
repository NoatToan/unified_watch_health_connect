package m63;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm63/e;", "E", "Lm63/t;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Li63/c;", "element", "<init>", "(Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<E> extends t<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f116936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i63.c<E> cVar) {
        super(cVar);
        cVar.getClass();
        this.f116936b = new d(cVar.getDescriptor());
    }

    @Override // m63.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // m63.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // m63.a
    public final Object g(Object obj) {
        throw null;
    }

    @Override // i63.i, i63.b
    public final k63.e getDescriptor() {
        return this.f116936b;
    }

    @Override // m63.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // m63.s
    public final void i(int i14, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i14, obj2);
    }
}
