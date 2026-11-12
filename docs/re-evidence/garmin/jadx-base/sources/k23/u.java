package k23;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk23/u;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "", "Lk23/q;", "typeParameter", "<init>", "(Lk23/q;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements TypeVariable<GenericDeclaration>, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f102475a;

    public u(q qVar) {
        qVar.getClass();
        this.f102475a = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !p005kotlin.jvm.internal.s.g(this.f102475a.getF122625c(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<p> upperBounds = this.f102475a.getUpperBounds();
        ArrayList arrayList = new ArrayList(p13.y.r(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(w.b((p) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.f102475a + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f102475a.getF122625c();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f102475a.getF122625c();
    }

    public final int hashCode() {
        this.f102475a.getF122625c().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f102475a.getF122625c();
    }
}
