package xp;

import java.util.Comparator;
import p005kotlin.Metadata;
import yp.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Long.valueOf(((e) t14).f198617d), Long.valueOf(((e) t7).f198617d));
    }
}
