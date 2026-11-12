package al2;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((j) t7).f3806c.getFailure().f132657a.ordinal()), Integer.valueOf(((j) t14).f3806c.getFailure().f132657a.ordinal()));
    }
}
