package z91;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f203137a;

    public f(Comparator comparator) {
        this.f203137a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f203137a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        aa1.g gVar = (aa1.g) t7;
        List<q91.d> list = a.f203132c;
        Integer numValueOf = Integer.valueOf(list.indexOf(gVar.f2275a));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = Integer.valueOf((int) gVar.f2275a.f143579a);
        }
        aa1.g gVar2 = (aa1.g) t14;
        Integer numValueOf2 = Integer.valueOf(list.indexOf(gVar2.f2275a));
        Integer numValueOf3 = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        if (numValueOf3 == null) {
            numValueOf3 = Integer.valueOf((int) gVar2.f2275a.f143579a);
        }
        return r13.a.b(numValueOf, numValueOf3);
    }
}
