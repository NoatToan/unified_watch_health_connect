package wq;

import java.util.Comparator;
import p005kotlin.Metadata;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        x1 x1Var = (x1) t7;
        boolean z14 = false;
        Boolean boolValueOf = Boolean.valueOf(x1Var.getStartDateTime() == null && x1Var.a2() == x.DESCENT);
        x1 x1Var2 = (x1) t14;
        if (x1Var2.getStartDateTime() == null && x1Var2.a2() == x.DESCENT) {
            z14 = true;
        }
        return r13.a.b(boolValueOf, Boolean.valueOf(z14));
    }
}
