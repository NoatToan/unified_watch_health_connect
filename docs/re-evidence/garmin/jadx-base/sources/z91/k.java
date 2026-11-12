package z91;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        aa1.f fVar = (aa1.f) t7;
        List<q91.d> list = a.f203132c;
        Integer numValueOf = Integer.valueOf(list.indexOf(fVar.f2270a));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = Integer.valueOf((int) fVar.f2270a.f143579a);
        }
        aa1.f fVar2 = (aa1.f) t14;
        Integer numValueOf2 = Integer.valueOf(list.indexOf(fVar2.f2270a));
        Integer numValueOf3 = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        if (numValueOf3 == null) {
            numValueOf3 = Integer.valueOf((int) fVar2.f2270a.f143579a);
        }
        return r13.a.b(numValueOf, numValueOf3);
    }
}
