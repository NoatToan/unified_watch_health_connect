package lt1;

import java.util.Comparator;
import p005kotlin.Metadata;
import pt1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Float fValueOf = Float.valueOf(Float.MIN_VALUE);
        t tVar = (t) t14;
        Float fValueOf2 = tVar.f140982p == 0 ? fValueOf : Float.valueOf(tVar.f140981o);
        t tVar2 = (t) t7;
        if (tVar2.f140982p != 0) {
            fValueOf = Float.valueOf(tVar2.f140981o);
        }
        return r13.a.b(fValueOf2, fValueOf);
    }
}
