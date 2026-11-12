package z91;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer num = Integer.MAX_VALUE;
        List<q91.d> list = a.f203131b;
        Integer numValueOf = Integer.valueOf(list.indexOf(((aa1.f) t7).f2270a));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = num;
        }
        Integer numValueOf2 = Integer.valueOf(list.indexOf(((aa1.f) t14).f2270a));
        Integer num2 = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        return r13.a.b(numValueOf, num2 != null ? num2 : Integer.MAX_VALUE);
    }
}
