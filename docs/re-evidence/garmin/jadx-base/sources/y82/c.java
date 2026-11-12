package y82;

import e23.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B+\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly82/c;", "KeyType", "ValueType", "", "Lkotlin/Function2;", "Lt13/d;", "execute", "<init>", "(Le23/p;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c<KeyType, ValueType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<KeyType, t13.d<? super ValueType>, Object> f195235a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(p<? super KeyType, ? super t13.d<? super ValueType>, ? extends Object> pVar) {
        pVar.getClass();
        this.f195235a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f195235a.equals(((c) obj).f195235a);
    }

    public final int hashCode() {
        return this.f195235a.hashCode();
    }

    public final String toString() {
        return "ReportsPageRequest(execute=" + this.f195235a + ")";
    }
}
