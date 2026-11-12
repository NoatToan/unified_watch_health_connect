package mr;

import java.util.Comparator;
import p005kotlin.Metadata;
import ps.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Long.valueOf(((x0) t7).Z2()), Long.valueOf(((x0) t14).Z2()));
    }
}
