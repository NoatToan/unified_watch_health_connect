package xp;

import java.util.Comparator;
import p005kotlin.Metadata;
import yp.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Long.valueOf(((d) t14).f198610c), Long.valueOf(((d) t7).f198610c));
    }
}
