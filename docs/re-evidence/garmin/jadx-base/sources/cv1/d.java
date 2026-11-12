package cv1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        n nVar = (n) t7;
        n nVar2 = n.Placeholder;
        return r13.a.b(Boolean.valueOf(nVar == nVar2), Boolean.valueOf(((n) t14) == nVar2));
    }
}
