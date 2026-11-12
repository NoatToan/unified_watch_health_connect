package lt1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer displayOrder = ((qs1.b) t7).getDisplayOrder();
        Integer numValueOf = Integer.valueOf(displayOrder != null ? displayOrder.intValue() : 0);
        Integer displayOrder2 = ((qs1.b) t14).getDisplayOrder();
        return r13.a.b(numValueOf, Integer.valueOf(displayOrder2 != null ? displayOrder2.intValue() : 0));
    }
}
