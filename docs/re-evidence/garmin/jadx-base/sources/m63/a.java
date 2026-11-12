package m63;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lm63/a;", "Element", "Collection", "Builder", "Li63/c;", "<init>", "()V", "Lm63/s;", "Lm63/y0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<Element, Collection, Builder> implements i63.c<Collection> {
    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // i63.b
    public Collection deserialize(l63.e eVar) {
        eVar.getClass();
        return (Collection) e(eVar);
    }

    public final Object e(l63.e eVar) {
        eVar.getClass();
        Builder builderA = a();
        int iB = b(builderA);
        l63.c cVarC = eVar.c(getF116204b());
        int i14 = l63.c.f110557a;
        while (true) {
            int iE = cVarC.e(getF116204b());
            if (iE == -1) {
                cVarC.b(getF116204b());
                return h(builderA);
            }
            f(cVarC, iE + iB, builderA);
        }
    }

    public abstract void f(l63.c cVar, int i14, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);

    private a() {
    }
}
