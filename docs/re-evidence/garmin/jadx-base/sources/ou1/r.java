package ou1;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f134102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f134103b;

    public r(Comparator comparator, List list) {
        this.f134102a = comparator;
        this.f134103b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f134102a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        o13.p pVar = (o13.p) t14;
        o13.p pVar2 = (o13.p) t7;
        int iH = p005kotlin.jvm.internal.s.h(((Number) pVar.f128595b).intValue(), ((Number) pVar2.f128595b).intValue());
        if (iH != 0) {
            return iH;
        }
        pu1.c cVar = (pu1.c) pVar2.f128594a;
        String str = cVar != null ? cVar.f141314a : null;
        List list = this.f134103b;
        Integer numValueOf = Integer.valueOf(h0.g0(str, list));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        pu1.c cVar2 = (pu1.c) pVar.f128594a;
        Integer numValueOf2 = Integer.valueOf(h0.g0(cVar2 != null ? cVar2.f141314a : null, list));
        Integer num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
        return p005kotlin.jvm.internal.s.h(iIntValue, num != null ? num.intValue() : Integer.MAX_VALUE);
    }
}
