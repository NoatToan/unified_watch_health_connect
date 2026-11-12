package z91;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f203136a;

    public e(Comparator comparator) {
        this.f203136a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer num = Integer.MAX_VALUE;
        int iCompare = this.f203136a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        List<q91.d> list = a.f203131b;
        Integer numValueOf = Integer.valueOf(list.indexOf(((aa1.g) t7).f2275a));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = num;
        }
        Integer numValueOf2 = Integer.valueOf(list.indexOf(((aa1.g) t14).f2275a));
        Integer num2 = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        return r13.a.b(numValueOf, num2 != null ? num2 : Integer.MAX_VALUE);
    }
}
