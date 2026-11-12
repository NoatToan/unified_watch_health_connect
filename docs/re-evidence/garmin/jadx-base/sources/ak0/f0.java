package ak0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        ck0.c cVar = ((ck0.t) t7).f27889g;
        Boolean boolValueOf = Boolean.valueOf((cVar != null ? cVar.f27821b : null) != null);
        ck0.c cVar2 = ((ck0.t) t14).f27889g;
        return r13.a.b(boolValueOf, Boolean.valueOf((cVar2 != null ? cVar2.f27821b : null) != null));
    }
}
